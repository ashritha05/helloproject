package hello.GreetingArrayNewVar;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GreetingControllerArrayNewVar {

    @RequestMapping(value = "/greeting13s", method = RequestMethod.POST)
    public GreetingABC greeting13s(@RequestBody GreetingArrayNew abode) {

        ArrayList<GreetingABC> x =  abode.getX();

        int i = 0;
        int l = 0;
        int m = 0;

        for (GreetingABC g5:x ) {
            int merest = g5.getA();
            i=merest+i;
            int mares = g5.getB();
            l=mares+l;
            int myr = g5.getC();
            m=myr+m;
        }

        return new GreetingABC(i,l,m);
    }
}
