package hello.MyFamily;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController {

    @RequestMapping(value = "/family", method = RequestMethod.POST)

    public Aditya family(@RequestBody Family abode){

        Aditya n = abode.getX();

        return n;
    }

}
