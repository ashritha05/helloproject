package hello;

import java.util.ArrayList;

public class GreetingArray {

    private ArrayList<GreetingAB> x;

    public GreetingArray() {}

    public GreetingArray(ArrayList<GreetingAB> x) {
        this.x=x;

    }

    public ArrayList<GreetingAB> getX() {
        return x;
    }

    public void setX(ArrayList<GreetingAB> x) {
        this.x = x;
    }

}
