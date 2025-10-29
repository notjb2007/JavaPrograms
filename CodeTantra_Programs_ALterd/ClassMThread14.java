import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random();
        random.setSeed(50);
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(100);
            System.out.println("Random Integer generated: " + num);
            Thread t;
            if (num % 2 == 0)
                t = new SquareThread(num);
            else
                t = new CubeThread(num);
            t.start();
            try {
                t.join();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class SquareThread extends Thread {
    int num;

    SquareThread(int num) { this.num = num; }

    public void run() {
        System.out.println("Square of " + num + " = " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int num) { this.num = num; }

    public void run() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

public class ClassMThread14 {
    public static void main(String[] args) {
        RandomNumberThread t = new RandomNumberThread();
        t.start();
    }
}
