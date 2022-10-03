public class queue {
    node front, rear;
    int size;

    public queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (this.front == null);
    }

    public void endq(int element) {
        node n = new node(element);
        size++;
        if (isEmpty()) {
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    public int deq() {
        if (!isEmpty()) {
            size--;
            int n = front.info;
            front = front.next;
            return n;
        }
        return 0;
    }

    public void display() {
        node hNode = front;
        while (hNode.next != null) {
            System.out.println(hNode.info);
            hNode = hNode.next;
            if (hNode.next == null) {
                System.out.println(hNode.info);
            }
        }
    }
}
