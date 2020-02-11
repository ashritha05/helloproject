package hello;

public class GreetingABsubCD extends GreetingAB {


    private  int c;
    private int d;

    public GreetingABsubCD(int a, int b, int c, int d){
        super(a,b);
        this.c = c;
        this.d = d;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getMath()
    {
       int s = super.getSum();
       int h= c+d;
        return s-h;
    }
}

