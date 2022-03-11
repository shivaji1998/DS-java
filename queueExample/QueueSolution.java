package queueExample;

/*
Queue implementation

A program implementing the following points:

1. Create a queue and implement it using classes and inbuilt methods.

2. Implement the following functions:

1. Enqueue

2.Dequeue

3. isEmpty 4. Size

5. Display
*/
class QueueUsingAray {
    int front_Q, rear_Q;
    int capacityOfQueue;
    static int[] q1;

    public QueueUsingAray(int size) {
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value) {
        if (rear_Q == capacityOfQueue) {
            System.out.println("queue is already full you can not innsert element");
        } else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }

    void dequeue() {
        if (rear_Q ==0) {
            System.out.println("queue is empty, there is nothing to delete");
        } else {
            for (int i = 0; i < rear_Q - 1; i++) {
                q1[i] = q1[i + 1];
            }
            rear_Q--;
        }
    }
    void display() {
        if (rear_Q ==0) {
            System.out.println("queue is empty, there is nothing to display");
        } else {
            for (int i=0;i<rear_Q;i++)
            {
                System.out.print(q1[i]);
            }
        }

    }
}

public class QueueSolution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

QueueUsingAray q2 = new QueueUsingAray(5);
q2.enqueue(2);
q2.enqueue(4);
q2.enqueue(8);
q2.dequeue();

q2.display();



    }

}
