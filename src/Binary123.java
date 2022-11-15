import java.util.Scanner;
public class Binary123 {
    public void Binary1() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the Binary : ");
        long x2 = input1.nextInt();
        String BiChar = Long.toString(x2);

        if (BiChar.contains("2") || BiChar.contains("3")||BiChar.contains("4") || BiChar.contains("5")||BiChar.contains("6") || BiChar.contains("7")|| BiChar.contains("8")|| BiChar.contains("9")) {
            System.out.println("Number you enter is not a Binary");
        }
        else {
            int i;
            String c1 = String.format("%d", x2);  //B to D
            int d1 = c1.length();

            long ary8[] = new long[20];
            i = 0;
            long r1 = 0;
            long p1 = 0;

            while (d1 >= 0) {
                r1 = x2 % 10;
                x2 = x2 / 10;
                double w1 = i;
                double h = (Math.pow(2, w1));
                long t = (long) h;
                ary8[i] = r1 * t;
                p1 = ary8[i] + p1;
                i++;
                d1--;
            }
            System.out.println("Decimal : " + p1);

            int x;
            x = (int) p1;
            i = 0;
            int r = 0;                        //B to H
            String ary9[] = new String[40];
            String[] s3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

            while (x != 0) {
                r = x % 16;
                x = x / 16;
                ary9[i] = s3[r];
                i++;
            }
            System.out.print("Hexadecimal : ");
            i--;
            while (i != -1) {
                System.out.print(ary9[i]);
                i--;
            }
            System.out.print("\n");

            int ary10[] = new int[40];             //D to O
            r = 0;
            i = 0;
            x = (int) p1;
            while (x != 0) {
                r = x % 8;
                x = x / 8;
                ary10[i] = r;
                i++;
            }
            System.out.print("Octal : ");
            i--;
            while (i != -1) {
                System.out.print(ary10[i]);
                i--;
            }
            System.out.print("\n");

        }
    }


}
