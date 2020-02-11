package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/greeting10", method = RequestMethod.POST)
    public GreetingAB greeting(@RequestBody ReqBody abody) {
        int a = abody.getA();
        int b = abody.getB();

        GreetingAB sum1 = new GreetingAB(a, b);
        return sum1;
    }

}