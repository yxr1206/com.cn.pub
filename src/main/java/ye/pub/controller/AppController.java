package ye.pub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("/hi")
    public String hi (){
        return "hello world!";
    }
}
