package lec03;
public class FPRep {
    public static void main(String[] args) {
//        float floatVal = 1.5f;
//        double doubleVal = 1.5;

//        printFloat(floatVal);
//        printDouble(doubleVal);
        printFloat(1.5f);
        printDouble(1.5);
        printFloat(5f);
        printDouble(5);
        printFloat(-5f);
        printDouble(-5);
        printFloat(1f);
        printFloat(2f);
    }
    static void printFloat(float fVal){
        // Convert float to int bits
        int floatBits = Float.floatToIntBits(fVal);
        String floatBinary = String.format("%32s", Integer.toBinaryString(floatBits)).replace(' ', '0');

        System.out.println("Float value: " + fVal);
        System.out.println("Float binary (IEEE 754): " + floatBinary);

    }
    static void printDouble(double dVal){
        // Convert double to long bits
        long doubleBits = Double.doubleToLongBits(dVal);
        String doubleBinary = String.format("%64s", Long.toBinaryString(doubleBits)).replace(' ', '0');

        System.out.println("Double value: " + dVal);
        System.out.println("Double binary (IEEE 754): " + doubleBinary);
    }
}
