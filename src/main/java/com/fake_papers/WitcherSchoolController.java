package com.fake_papers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WitcherSchoolController {

    @RequestMapping("/witcherschools")
    public List<WitcherSchool> witcherschool(@RequestParam(value = "qty", defaultValue = "1") String qty) {
        int quantity = Integer.parseInt(qty);
        List<WitcherSchool> results = new LinkedList<WitcherSchool>();
        for (int i = 0; i < quantity; i++) {
            WitcherSchool school = new WitcherSchool();
            results.add(school);
        }
        return results;
    }

}