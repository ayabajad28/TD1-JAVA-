class IdGenerator {
    private static long next = 1;
    
    public static synchronized long nextId() {
        return next++;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("ID 1: " + IdGenerator.nextId());
        System.out.println("ID 2: " + IdGenerator.nextId());
        System.out.println("ID 3: " + IdGenerator.nextId());
        System.out.println("ID 4: " + IdGenerator.nextId());
        System.out.println("ID 5: " + IdGenerator.nextId());
    }
}