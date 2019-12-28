import static java.lang.String.format;

public class FizzBuzz {
    public static void main(String [] args){
        for (int i=1;i<=100;i++){
            String printNum = transform(i);
            System.out.println(printNum);

        }
    }
    public static String transform(int i) {
        if(i==3)
            return "Fizz";
        return null;
    }
}
