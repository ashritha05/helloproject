package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerIntSum {


    @RequestMapping(value = "/greeting3")
    public GreetingAB greeting3(@RequestParam("xx") int a, @RequestParam("xy") int b){
    GreetingAB sum1 = new GreetingAB(1,6);

    int s = sum1.getSum();

    GreetingAB sum2 =  new GreetingAB(s, 1);

    return sum2;

    }

}
