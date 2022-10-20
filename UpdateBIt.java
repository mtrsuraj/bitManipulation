public class UpdateBIt {
    public static void main(String args[]){
        int n=5;
        int pos =1;
        int oper =1; //update to zero
        int bitMask = 1<<pos;
        int notBits = ~(bitMask);
        // One to zero 
        int clearBit = notBits & n;
        System.out.println("One to zero :"+clearBit);
        // for zero to one 
        int setBits = bitMask | n;
        System.out.println("zero to ONe :"+setBits);


    }
}
