import java.util.Scanner;

public class Decimal123 {
    public void Decimal1() {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the Decimal : ");
        int x = input2.nextInt();
        final int a = x;

        int ary[] = new int[40];             //D to B
        int r = 0, i = 0;

        while (x != 0) {
            r = x % 2;
            x = x / 2;
            ary[i] = r;
            i++;
        }
        System.out.print("Binary : ");

        i--;
        while (i != -1) {
            System.out.print(ary[i]);
            i--;
        }

        System.out.print("\n");

        x = a;
        i = 0;
        r = 0;                        //D to H
        String ary1[] = new String[40];
        String[] s = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        while (x != 0) {
            r = x % 16;
            x = x / 16;
            ary1[i] = s[r];
            i++;
        }
        System.out.print("Hexadecimal : ");
        i--;
        while (i != -1) {
            System.out.print(ary1[i]);
            i--;
        }
        System.out.print("\n");


        int ary2[] = new int[40];             //D to O
        r = 0;
        i = 0;
        x = a;
        while (x != 0) {
            r = x % 8;
            x = x / 8;
            ary2[i] = r;
            i++;
        }
        System.out.print("Octal : ");
        i--;
        while (i != -1) {
            System.out.print(ary2[i]);
            i--;
        }
        System.out.print("\n");
        return;
    }
}