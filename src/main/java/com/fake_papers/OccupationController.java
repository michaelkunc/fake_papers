package com.fake_papers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {

    @RequestMapping("/occupations")
    public List<Occupation> occupation(@RequestParam(value="qty", defaultValue="1") String qty){
        int quantity = Integer.parseInt(qty);
        List<Occupation> results = new LinkedList<Occupation>();
        for (int i = 0; i < quantity; i++){
            Occupation occ = new Occupation();
            results.add(occ);
        }
        return results;
    }

}