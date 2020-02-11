package hello;

public class GreetingCD {

    private final int c;
    private final int d;

    public GreetingCD(int c, int d){

        this.c = c;
        this.d = d;

    }

    public int getC(){
        return c;
    }

    public int getD(){
        return d;
    }

    public int getSum1(){
        return c+d;
    }

}
