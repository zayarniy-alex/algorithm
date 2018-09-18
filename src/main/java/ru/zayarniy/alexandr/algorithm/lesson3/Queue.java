package ru.zayarniy.alexandr.algorithm.lesson3;

public class Queue {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getQueue() {
        return queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    private int[] queue;
    private int head;
    private int tail;
    private int items;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        head = 0;
        tail = -1;
    }

    public boolean isEmpty() {
        return items == 0;
    }

    public boolean isFull() {
        return items == size;
    }

    public int size() {
        return items;
    }

    public void insert(int i) {
        if (isFull()) {
            size *= 2;
            int[] temp = new int[size];
            if (tail >= head) {
                System.arraycopy(queue, 0, temp, 0, queue.length);
            } else {
                System.arraycopy(queue, 0, temp, 0, tail + 1);
                System.arraycopy(queue, head,
                        temp, size - (queue.length - head),
                        queue.length - head - 1);
                head = size - head - 1;
            }
            queue = temp;
        }
        if (tail == size - 1)
            tail = -1;
        queue[++tail] = i;
        items++;
    }

    public int remove() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        int temp = queue[head++];
        head %= size;
        items--;
        return temp;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return queue[head];
    }
}
