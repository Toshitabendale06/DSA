 class Queue_usingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            this.size = n;
            arr = new int[n];
            rear = -1;
            //static int arr[] = new int[n];
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == size-1;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.print(q.peek() +" ");
                q.remove();
            }
        }
    }
}
