public class SumOfTwoStrings {
    public String sumOfTwoStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int s1 = num1.length() - 1;
        int s2 = num2.length() - 1;
        while (s1 >= 0 || s2 >= 0) {
            int x1 = s1 >= 0 ? num1.charAt(s1) - '0' : 0;
            int x2 = s2 >= 0 ? num2.charAt(s2) - '0' : 0;
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            res.append(value);
            s1--;
            s2--;
        }

        if (carry != 0) {
            res.append(carry);
        }

        return res.reverse().toString();
    }
    public static void main(String args[])
    {
        String num1[] = {"98"};
        String num2[] = {"11"};
        SumOfTwoStrings num = new SumOfTwoStrings();
        System.out.println(num.sumOfTwoStrings("98" ,"11"));
    }
}
