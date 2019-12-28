import static java.lang.String.format;

public class FizzBuzz {
    public static void main(String [] args){
        for (int i=1;i<=100;i++){
            String printNum = transform(i);
            System.out.println(printNum);
        }
    }
    public static String transform(int i) {
        if(i%15==0){
            return "FizzBuzz";
        }else if(i%3==0){
            return "Fizz";
        }else if(i%5==0){
            return "Buzz";
        }
        return format("%d", i);
    }
}
