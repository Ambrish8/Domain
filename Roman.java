public class DecimalToRoman {
    // Method to convert decimal to Roman
    public static String decimalToRoman(int num) {
        // Arrays to store Roman numeral symbols and their corresponding values
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // StringBuilder to build the Roman numeral
        StringBuilder roman = new StringBuilder();
        
        // Convert decimal to Roman
        for (int i = 0; i < romanValues.length; i++) {
            while (num >= romanValues[i]) {
                roman.append(romanSymbols[i]);
                num -= romanValues[i];
            }
        }
        return roman.toString();
    }
    
    public static void main(String[] args) {
        // Test the program with various inputs
        int number = 3549; // Example input
        System.out.println("Decimal: " + number);
        System.out.println("Roman: " + decimalToRoman(number));
    }
}
