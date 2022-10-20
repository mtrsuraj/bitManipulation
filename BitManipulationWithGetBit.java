import java.util.Scanner;
public class BitManipulationWithGetBit {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int bitMass= 101<<2;
    if((bitMass & n)==0){
        System.out.println("is zero");
    }else System.out.println("not zero");
}
}
