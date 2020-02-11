package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerSumXY {


    @RequestMapping(value = "/greeting1s", method = RequestMethod.POST)
    public Greeting8 greeting1s(@RequestBody GreetingXY abode) {

        GreetingAB x = abode.getX1();
        GreetingCD y = abode.getY1();


        int k = x.getSum();
        int l = y.getSum1();

        Greeting8 su = new Greeting8(k,l);
        return su;


    }



}