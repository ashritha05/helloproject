package hello.sumarray;

import hello.GreetingAB;
import hello.GreetingArray;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GreetingControllerArray  {

    @RequestMapping(value = "/greeting12s", method = RequestMethod.POST)
    public GreetingAB greeting12s(@RequestBody GreetingArray abode) {
        ArrayList<GreetingAB> x =  abode.getX();

        int i = 0;
        int l =0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (GreetingAB g5:x ) {
            int myresult = g5.getA();
            i=myresult+i;
            int myres = g5.getB();
            l=myres+l;
        }

        return new GreetingAB(i,l);
    }
}
