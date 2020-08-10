import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercise One
        // While
        //        int i = 5;
        //        while(i <= 15) {
        //            System.out.println(i);
        //            i++;
        //        }
        //
        //        System.out.println();
        //
        // Do While
        //        int j = 2;
        //        do {
        //            System.out.println(j);
        //            j += 2;
        //        } while(j <= 100);
        //        System.out.println();
        //
        //        int k = 100;
        //        do {
        //            System.out.println(k);
        //            k -= 5;
        //        } while(k >= -10);
        //        System.out.println();
        //
        //        long l = 2;
        //        do {
        //            System.out.println(l);
        //            l *= l;
        //        } while( l < 1000000);

        // For
        //        for(int i = 5; i<=15; i++) {
        //            System.out.println(i);
        //        }
        //        System.out.println();
        //
        //        for(int j=2; j<=100; j+=2) {
        //            System.out.println(j);
        //        }
        //        System.out.println();
        //
        //        for(int k=100; k>=-10; k-=5) {
        //            System.out.println(k);
        //        }
        //        System.out.println();
        //
        //        for(long l=2; l<1000000; l*=l) {
        //            System.out.println(l);
        //        }

        // Exercise Two
        //        for(byte i=0; i<=100; i++) {
        //            if(i % 3 == 0 & i % 5 == 0) {
        //                System.out.println("FizzBuzz");
        //            } else if (i % 5 == 0) {
        //                System.out.println("Buzz");
        //            } else if (i % 3 == 0) {
        //                System.out.println("Fizz");
        //            }
        //        }

        // Exercise Three
        int inputInt = 0;
        String inputString = "";
        boolean work = true;

        do {
            // Beginning
            System.out.print("Enter a number to go up to: ");
            inputInt = scanner.nextInt();

            // Middle
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i=1; i<=inputInt; i++) {
                System.out.println(String.format("%-6d",i) + " | " + String.format("%-7d", i*i) + " | " + String.format("%-5d",i*i*i));
            }

            // End
            System.out.print("Would you like to continue? [Y/N]: ");
            inputString = scanner.next();
            if(!inputString.equals("y")) {
                work = false;
            }
        } while(work);

        // Exercise Four
        byte letterGrade = -1;
        inputString = "";
        work = true;

        do {
            // Input
            System.out.print("Enter a grade [0-100]: ");
            letterGrade = scanner.nextByte();

            // Output
            if(letterGrade >= 88) {
                System.out.println("A");
            } else if(letterGrade <= 87 && letterGrade >= 80) {
                System.out.println("B");
            } else if(letterGrade <= 79 && letterGrade >= 67) {
                System.out.println("C");
            } else if(letterGrade <= 66 && letterGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            // Continue?
            System.out.print("Would you like to continue? [Y/N]: ");
            inputString = scanner.next();
            if(!inputString.equals("y")) {
                work = false;
            }
        } while(work);
    }
}
