package Strings;

public class addStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("123","456"));
    }
    public static String addStrings(String num1 , String num2){

        StringBuilder sb= new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = 0;
            if (i >= 0) {
                digit1 = num1.charAt(i--) - '0';
                System.out.println(digit1);
            }
            int digit2 = 0;
            if (j >= 0) {
                digit2 = num2.charAt(j--) - '0';
            }
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.insert(0, sum % 10);
        }

        return sb.toString();
    }
}
