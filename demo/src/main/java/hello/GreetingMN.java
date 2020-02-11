package hello;

public class GreetingMN extends Greeting8 {

    private int m;
    private int n;

    public GreetingMN(int x, int y, int m, int n) {
        super(x,y);
        this.m=m;
        this.n=n;
    }


    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
}
