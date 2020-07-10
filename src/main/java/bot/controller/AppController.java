package bot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bot")
public class AppController {

    @GetMapping(path="/get", produces = "application/json")
    public String getMessage(){
        return "Welcome!";
    }

}