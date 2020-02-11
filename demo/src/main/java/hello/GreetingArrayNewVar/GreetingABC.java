package hello.GreetingArrayNewVar;


import hello.GreetingAB;

public class GreetingABC extends GreetingAB {
    private int c;

    public GreetingABC() {}

    public GreetingABC(int a, int b,int c){
        super(a, b);
        this.c = c;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    public int getSum(){
        int superSum = super.getSum();
        return superSum + c;
    }

}

