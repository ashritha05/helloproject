package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingControllerABsubCD {


        @RequestMapping(value = "/greeting's", method = RequestMethod.POST)
        public GreetingABsubCD greeting(@RequestBody GreetingABsubCD abode) {
            int a = abode.getA();
            int b = abode.getB();
            int c = abode.getC();
            int d = abode.getD();

            GreetingABsubCD sum1 = new GreetingABsubCD(a,b,c,d);

            return sum1;
        }

    }

