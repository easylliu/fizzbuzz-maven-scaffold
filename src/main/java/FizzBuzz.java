import static java.lang.String.format;

public class FizzBuzz {
    public static String transform(int number) {
        String returnStr = "";
//        if(number < 1) {
//            throw new IllegalArgumentException("invalid input");
//        }
//
        if(number % 3 == 0) {
            returnStr += "Fizz";
        }
        if(number % 5 == 0) {
            returnStr += "Buzz";
        }
        if(number % 7 == 0) {
            returnStr += "Whizz";
        }
        if(returnStr.equals("")) {
            return format("%d", number);
        }
        return returnStr;
    }
}
