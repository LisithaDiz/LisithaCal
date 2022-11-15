import java.util.Scanner;

public class Octal123 {
    public void Octal1(){
        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter Oct: ");
        int x = input5.nextInt();
        String d=String.format("%d",x);   //O to D
Math.m
        if(d.contains("9")||d.contains("8")){
            System.out.println("Number you enter is not an Octal");
        }
        else {
            int q = d.length();

            int ary5[] = new int[40];
            int i = 0;
            int dec = 0;
            int r = 0;

            while (q >= 0) {
                r = x % 10;
                x = x / 10;
                double h = Math.pow(8, i);
                int e = (int) h;
                ary5[i] = r * e;
                dec = ary5[i] + dec;
                i++;
                q--;
            }
            System.out.println("Decimal : " + dec);

            int ary6[] = new int[40];             //O to B
            //char c[] = new char[40];
            r = 0;
            i = 0;
            x = dec;

            while (x != 0) {
                r = x % 2;
                x = x / 2;
                ary6[i] = r;
                i++;
            }
            System.out.print("Binary : ");

            i--;
            while (i != -1) {
                System.out.print(ary6[i]);
                i--;
            }
            System.out.print("\n");

            x = dec;
            i = 0;
            r = 0;                        //0 to H
            String ary7[] = new String[40];
            String[] s1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

            while (x != 0) {
                r = x % 16;
                x = x / 16;
                ary7[i] = s1[r];
                i++;
            }
            System.out.print("Hexadecimal : ");
            i--;
            while (i != -1) {
                System.out.print(ary7[i]);
                i--;
            }
            System.out.print("\n");
        }
    }
}
