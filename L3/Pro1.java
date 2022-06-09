public class Pro1 {
    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean palin(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = (reverseNum * 10) + num % 10;
            num = num / 10;
        }
        return reverseNum == originalNum;
    }

    public static void main(String[] args) {
        for (int i = 0, count = 0; count < 100; i++) {
            if (palin(i) && prime(i)) {
                System.out.print(i + " ");
                if (++count % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
//64010312 thanatat
