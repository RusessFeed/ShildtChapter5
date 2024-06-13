class QueueDemo {
    public static void main(String[] args) {
        Queue namesQueue = new Queue(3);
        namesQueue.put("Zelim");
        namesQueue.put("Ilyas");
        namesQueue.put("Ruslan");

        System.out.println(namesQueue.get());
    }
}

class Queue {
    private String[] queueNames;
    private int putLocation, getLocation;

    Queue(int size) {
        queueNames = new String[size];
        putLocation = getLocation = 0;
    }

    void put(String name) {
        if (putLocation == queueNames.length) {
            System.out.println("Queue is full");
            return;
        }
        queueNames[putLocation++] = name;
    }

    String get() {
        if (getLocation == putLocation) {
            System.out.println("Queue is empty");
            return "";
        }
        return queueNames[getLocation++];
    }
}