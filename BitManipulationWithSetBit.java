public class BitManipulationWithSetBit {
    public static void main(String args[]){
        int x = 5;
        int pos = 1;
        int bitMass = 1<<pos;
        int setBits;
        setBits = bitMass | x;
        System.out.println(setBits);
    }
}
