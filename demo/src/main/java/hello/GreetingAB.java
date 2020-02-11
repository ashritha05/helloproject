package hello;

import com.fasterxml.jackson.annotation.JsonValue;

public class GreetingAB {


    private int a;
    private int b;

    public GreetingAB() {}

    public GreetingAB(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getSum() {
        return a+b;
    }



}
