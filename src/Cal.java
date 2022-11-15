import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the calculator you need ? " + "\n" +"Standard Calculator  1" + "\n" +"Programming Calculator  2");
        int CalNotation = in.nextInt();
        if(CalNotation==1 || CalNotation==2) {
            switch (CalNotation) {

                case 1:
                    StanCal objCal = new StanCal();
                    objCal.StanCal1();
                    break;

                case 2:
                    System.out.print("What is the number system you enter ???" + "\n" + " Decimal type     1" + "\n" + " Hexadecimal type 2" + "\n" + " Octal type       3" + "\n" + " Binary type      4" + "\n" + "Number System :     ");
                    int num = in.nextInt();
                    System.out.print("\n");
                    switch (num) {
                        case 1:
                            Decimal123 obj2 = new Decimal123();
                            obj2.Decimal1();
                            break;
                        case 2:
                            Hex123 obj4 = new Hex123();
                            obj4.Hex1();
                            break;
                        case 3:
                            Octal123 obj3 = new Octal123();
                            obj3.Octal1();
                            break;
                        case 4:
                            Binary123 obj = new Binary123();
                            obj.Binary1();
                            break;
                        default:
                            System.out.println("Please enter a correct number of number system.");
                    }
                    break;
                default:
                    System.out.println("Please enter a correct number of calculator. ");
            }
        } else {
            System.out.println("Please enter a valid number : ");
        }
    }
}
