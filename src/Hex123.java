import java.util.Scanner;

public class Hex123 {
    public void Hex1(){
        String hex="0123456789ABCDEF";         //H to D
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal : ");
        String x1= input.nextLine();
        if (x1.contains("G")||x1.contains("H")||x1.contains("I")||x1.contains("J")||x1.contains("K")||x1.contains("L")||x1.contains("M")||x1.contains("N")||x1.contains("O")||x1.contains("P")||x1.contains("Q")||x1.contains("R")||x1.contains("S")||x1.contains("T")||x1.contains("U")||x1.contains("W")){
            System.out.println("Number you enter is not a Hexadecimal.");
        }
        else {
            int i;
            int x;
            double val = 0, w = 0;
            for (i = x1.length(); i > 0; i--) {
                int d = hex.indexOf(x1.charAt(i - 1));
                val = val + d * (Math.pow(16, w));
                w++;
            }
            int dec = (int) val;
            System.out.println("Decimal : " + dec);


            x = dec;          //H to O
            int ary3[] = new int[40];
            int r = 0;
            i = 0;
            while (x != 0) {
                r = x % 8;
                x = x / 8;
                ary3[i] = r;
                i++;
            }
            System.out.print("Octal : ");
            i--;
            while (i != -1) {
                System.out.print(ary3[i]);
                i--;
            }
            System.out.print("\n");


            x = dec;                         //H to B
            int ary4[] = new int[40];
            r = 0;
            i = 0;

            while (x != 0) {
                r = x % 2;
                x = x / 2;
                ary4[i] = r;
                i++;
            }
            System.out.print("Binary : ");

            i--;
            while (i != -1) {
                System.out.print(ary4[i]);
                i--;
            }

            System.out.print("\n");
        }
    }
}
