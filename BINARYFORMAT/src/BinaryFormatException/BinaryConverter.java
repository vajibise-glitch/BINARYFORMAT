package BINARYFORMAT;

public class BinaryConverter {
   public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the string contains only '0' and '1'
        for (char ch : binaryString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert binary string to decimal integer
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimal = decimal * 2 + (binaryString.charAt(i) - '0');
        }
        return decimal;
    }

    public static void main(String[] args) {
        try {
            System.out.println(bin2Dec("1010")); // Valid binary string
            System.out.println(bin2Dec("1234")); // Invalid binary string, should throw exception
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}