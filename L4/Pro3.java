import java.util.Arrays;

public class Pro3 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        float[] numBox = new float[1000];
        System.out.println("Creating a list containing 1000 elements,");
        for (int i = 1; i <= 1000; i++) {
            numBox[i-1] = (float)(Math.random()*1000);
             System.out.printf("%.2f  ",numBox[i-1]);
            if (i != 0 && i % 5 == 0) {
                System.out.println();
                }
        }
        System.out.println();
        System.out.println("list created.");
        System.out.println("Sorting stopwatch starts...");
        stopWatch.start();
        Arrays.sort(numBox);
        for (int i = 1; i <= numBox.length; i++) {
            System.out.printf("%.2f  " + i + " ",numBox[i-1]);
            if (i != 0 && i % 5 == 0) {
                System.out.println();
                }
        }
        System.out.println();
        System.out.println("Sorting stopwatch stoped.");
        stopWatch.stop();
        System.out.printf("The sort time is " + stopWatch.getElapsedTime() + " milliseconds.\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        stopWatch.start();
        System.out.println("Creating 1000 PalindromPrime...");
        PalindromePrime palin = new PalindromePrime();
        for (int i = 0,count = 0; count < 1000; i++) {
           if (palin.isPalinPrime(i)) {
               System.out.print(i + " ");
               if (++count % 10 == 0) {
                System.out.println();
                }
           }
        }
        System.out.println("PalindromePrime created.");
        stopWatch.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The sort time is " + stopWatch.getElapsedTime() + " milliseconds.\n");
    }

}

class StopWatch {
    public StopWatch() {

    }

    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime));
        } else {
            elapsed = (endTime - startTime);
        }
        return (long)elapsed;
    }
}
class PalindromePrime {
    public PalindromePrime() {

    }

    private boolean isPalin(int x) {
        int original = x, reverse = 0;
        while (x > 0) {
            int mod = x % 10;
            reverse = reverse * 10 + mod;
            x = x / 10;
        }
        if (original == reverse)
            return true;
        else
            return false;
    }

    private boolean isPrime(int x) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                count++;
        }
        if (count == 1)
            return true;
        else
            return false;
    }

    public boolean isPalinPrime(int x) {
        if (isPalin(x) && isPrime(x)) {
            return true;
        } else {
            return false;
        }
    }

}
