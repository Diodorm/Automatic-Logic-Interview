public class PowerChecker {

    public static boolean isPowerOfTwo(int num) {
        // Finds the union of the binary values of the 
        // number and the number minus one.
        return (num != 0) && (num & (num - 1)) == 0;
    }

    public static boolean isPowerOfThree(int num) {
        if (num == 0) {
            return false;
        } else {
            while ((num % 3) == 0) {
                num /= 3;
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int numTest = 24;
        System.out.println(numTest + " is a power of two: " + isPowerOfTwo(numTest));
        
        numTest = 524288;
        System.out.println(numTest + " is a power of two: " + isPowerOfTwo(numTest));

        numTest = 8;
        System.out.println(numTest + " is a power of three: " + isPowerOfThree(numTest));

        numTest = 43046721;
        System.out.println(numTest + " is a power of three: " + isPowerOfThree(numTest));
    }
}
