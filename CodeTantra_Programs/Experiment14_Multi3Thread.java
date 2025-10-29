import java.util.Random;

// Thread to generate random numbers
class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random(50); // Seed with 50
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(100); // Generate number between 0 and 99
            System.out.println("Random Integer generated : " + num);

            if (num % 2 == 0) {
                new SquareThread(num).start();
            } else {
                new CubeThread(num).start();
            }

            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                // Do nothing
            }
        }
    }
}

// Thread to calculate square of a number
class SquareThread extends Thread {
    int number;
    SquareThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

// Thread to calculate cube of a number
class CubeThread extends Thread {
    int number;
    CubeThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

// Main class
public class Experiment14_Multi3Thread {
    public static void main(String[] args) {
        RandomNumberThread t = new RandomNumberThread();
        t.start();
    }
}
