package hello.GreetingArrayNewVar;

import java.util.ArrayList;

public class GreetingArrayNew {

    private ArrayList<GreetingABC> x;

    public GreetingArrayNew() {}

    public GreetingArrayNew(ArrayList<GreetingABC> x) {
        this.x=x;

    }

    public ArrayList<GreetingABC> getX() {
        return x;
    }

    public void setX(ArrayList<GreetingABC> x) {
        this.x = x;
    }

}
