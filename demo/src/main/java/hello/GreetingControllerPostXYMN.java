package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerPostXYMN {
    @RequestMapping(value = "/greeting11s", method = RequestMethod.POST)
    public GreetingMN greeting11s(@RequestBody GreetingXYMN abode) {

        GreetingAB x = abode.getX1();
        GreetingAB y = abode.getY1();
        GreetingAB m = abode.getM1();
        GreetingAB n = abode.getN1();

        int k = x.getSum();
        int l = y.getSum();
        int o = m.getSum();
        int p = n.getSum();

        GreetingMN su1 = new GreetingMN(k,l,o,p);
        return su1;


    }

}
