import java.util.Scanner;

public class Answer2 {

    public static void main(String[] args) {

        char userInput;
        int hour = 0, min = 0, sec = 0, hourChecker = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Download Time Estimator");

        do {
            System.out.print("Enter file size (MB): ");
            int mb = scanner.nextInt();

            System.out.print("Enter download speed (MB/sec): ");
            int mbPerSec = scanner.nextInt();

            hourChecker = mb / 60;
            if (hourChecker > 60) {
                // hour = (mb / 60) * mbPerSec;
                // min = (hour / 60) * mbPerSec ; // 60 seconds
                // sec = (mb % 60) * mbPerSec ; // get the remainder for the
                // seconds

                hour = (mb / 60) * mbPerSec;
                min = (mb % 60) * mbPerSec;
                sec = 0;

            } else {
                hour = 0;
                min = (mb / 60) * mbPerSec;
                sec = (mb % 60) * mbPerSec;
            }

            // System.out.println("This download will take approximately " +
            // hour + " hours " + min + " minutes " + sec + " seconds");

            System.out.println(String.format("This download will take approximately %s hours %s minutes %s seconds", hour, min, sec));

            System.out.print("Continue? (y/n) : ");
            userInput = scanner.next().charAt(0);

        } while (userInput != 'n');

    }

}
