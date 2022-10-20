public class ClearBits {
    public static void main(String args[]){
        int num = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int newNum = ~(bitMask);
        int newNumber = newNum & num;
        System.out.println(newNumber);
    }
}
