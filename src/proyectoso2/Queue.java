package proyectoso2;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null; // If the queue becomes empty, reset rear as well
        }
        return item;
    }
    
    public void remove(T item) {
        Node current = front;
        Node previous = null;

        while (current != null) {
            if (current.data.equals(item)) {
                if (previous == null) {
                    // If the item to be removed is at the front of the queue
                    front = current.next;
                    if (front == null) {
                        // If the queue becomes empty after removal
                        rear = null;
                    }
                } else {
                    // If the item to be removed is not at the front of the queue
                    previous.next = current.next;
                    if (current.next == null) {
                        // If the item to be removed is at the rear of the queue
                        rear = previous;
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}