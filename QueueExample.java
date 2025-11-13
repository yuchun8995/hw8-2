import java.util.LinkedList;
import java.util.NoSuchElementException;

// 使用 JCF 的 LinkedList 來實作自己的 Queue
// 不直接使用 java.util.Queue
class MyQueue<T> {

    // 實際儲存元素的容器
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 尾端加入元素
    public void enqueue(T item) {
        queue.addLast(item);       // 也可以寫 queue.add(item);
    }

    // 從前端取出元素（並移除）
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
    public static void m
