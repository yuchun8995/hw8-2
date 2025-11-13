import java.util.LinkedList;
import java.util.NoSuchElementException;

// 使用 JCF 的 LinkedList 來實作自己的 Queue
// 不直接使用 java.util.Queue
class MyQueue<T> {

    // 這就是你缺少的欄位：
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 加入元素到尾端
    public void enqueue(T item) {
        queue.addLast(item);        // 也可以 queue.add(item);
    }

    // 從前端取出並移除
    public T dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // 檢查是否為空
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // 回傳目前元素數量
    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("size = " + intQueue.size());
        System.out.println("dequeue = " + intQueue.dequeue());
        System.out.println("dequeue = " + intQueue.dequeue());
        System.out.println("isEmpty = " + intQueue.isEmpty());

        MyQueue<Person> personQueue = new MyQueue<>();
        personQueue.enqueue(new Person("Alice", 20));
        personQueue.enqueue(new Person("Bob", 25));
        System.out.println(personQueue.dequeue());
    }
}

//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
