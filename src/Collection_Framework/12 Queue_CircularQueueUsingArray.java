 class Queue_CircularQueueUsingArray {

    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("overflow");
                return;
            }
            //if it's the 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int res = arr[front];

            //if only 1 element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print(q.remove()+" "); //1
        q.add(6); // 2 3 4 5 6
        System.out.println(q.remove()); //2
        q.add(7); // 3 4 5 6 7


        while(!q.isEmpty()) {
            System.out.print(q.peek() +" ");  //3 4 5 6 7
            q.remove();
        }
    }
}
