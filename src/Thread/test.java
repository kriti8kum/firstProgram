package Thread;

public class test {
    public static void main(String[] args) {
        world World = new world();
        World.start();
        for (;; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
