public class Queue {
    int capacity = 5;
    int front, back;
    String[] array;
    Queue() {
        array = new String[capacity];
        front = -1;
        back = -1;
    }
    Boolean isFull() {
        if (front == 0 && back == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }
    Boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }
    void enQueue(String passengerId) {
        if (isFull()) {
            System.out.println("Customer limit exceeded");
        } else if (front == -1) {
            front = 0;
        }
        try {
            back++;
            array[back] = passengerId;
            System.out.println(passengerId + " added");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Clear customer queue to add a new customer");
        }
    }
    String deQueue() {
        String passengerId;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            passengerId = array[front];
            if (front >= back) {
                front = -1;
                back = -1;
            } else {
                front++;
            }

        }
        System.out.println(passengerId + " has checked out");
        return passengerId;
    }
    void printQueue() {
        if (isEmpty()) {
            System.out.println("No waiting customers");
            //System.exit(1);
        } else {
            try {
                for (int i = front; i <= back; i++) {
                    System.out.println(array[i]);
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" ");
            }
        }
    }
}
