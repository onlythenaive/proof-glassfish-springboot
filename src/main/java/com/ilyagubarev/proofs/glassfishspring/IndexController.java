package com.ilyagubarev.proofs.glassfishspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }
}
