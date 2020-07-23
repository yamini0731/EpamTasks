package calculator;
import operations.Operations;
public class Cal {
    private Operations operation;
    public Cal(){
        operation = new Operations();
    }
    public float getOutput(float a,float b,char operator)
        switch (operator){
            case '+':
                return this.operation.add(a,b);
            case '-':
                return this.operation.subtract(a,b);
            case '*':
                return this.operation.multiply(a,b);
            case '/':
                return this.operation.divide(a,b);

        }
        return -1;
    }
}
