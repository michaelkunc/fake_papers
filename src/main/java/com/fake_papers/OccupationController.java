package com.fake_papers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {

    @RequestMapping("/occupation")
    public Occupation occupation(){
        return new Occupation();
    }
}