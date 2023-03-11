public class Queue
{

    public Queue()
    {
        size = 100;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public Queue(int s)
    {
        size = s;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public void enqueue(char c) {
        if(!isFull()) {
        back = (back + 1) % size;
        list[back] = c;
        count++;
        } else System.out.println("Queue is full!");
    }

    public void dequeue() {
        if(!isEmpty()) {
            front = (front + 1) % size;
            count--;
        } else System.out.println("Queue is empty!");
    }

    public char getFront()
    {
        return list[front];
    }

    public boolean isFull()
    {
        return count == size;
    }
    public boolean isEmpty()
    {
        return count == 0;
    }

    public void printQueue() {
    for (int i=0; i<count; i++)
        {
            System.out.println(list[(front+i)%size]);
        }

}
    private char[] list;
    private int size;
    private int count;
    private int front, back;
}
