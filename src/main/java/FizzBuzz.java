import static java.lang.String.format;

public class FizzBuzz {
    public static void main(String [] args) {
        for (int i = 1 ; i <= 100 ; i++) {
            String printNum = transform(i);
            System.out.println(printNum);
        }
    }
    public static String transform(int number) {
        String returnStr = "";
//        if(number < 1) {
//            throw new IllegalArgumentException("invalid input");
//        }
        if(number % 3 == 0) {
            returnStr += "Fizz";
        }
        if(number % 5 == 0) {
            returnStr += "Buzz";
        }
        if(number % 7 == 0) {
            returnStr += "Whizz";
        }
        if(returnStr .equals("")) {
            return format("%d", number);
        }
        return returnStr;
    }
}
