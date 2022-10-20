import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pos=2;
        int bitMass = 001<<pos;
        if((bitMass & n)==0){
            System.out.println("Bitmass is zero:");

        }else System.out.println("BitMass is non Zero");
    }
}
