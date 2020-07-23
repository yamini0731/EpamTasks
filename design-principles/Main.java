import calculator.Cal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cal obj = new Cal();

        float a = sc.nextFloat();
        char operation = sc.next().charAt(0);
        float b = sc.nextFloat();

        float output = obj.getOutput(a,b,operation);

        if(output!=-1)
            System.out.println(output);
        else
            System.out.println("please enter valid Operation");
    }
}
