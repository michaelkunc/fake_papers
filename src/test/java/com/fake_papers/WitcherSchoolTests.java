package com.fake_papers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.assertj.core.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class WitcherSchoolTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void responseBodyTest() {
        WitcherSchoolsList[] schoolList = WitcherSchoolsList.values();
        String body = this.restTemplate.getForObject("/witcherschools", String.class);
        assertThat(body).contains("witcherSchool");
        // TODO: Still working on getting this test right
        // assertTrue(Arrays.asList(schoolList).contains(body));
    }


}
