package com.boot;

import com.boot.model.Shipwreck;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.boot.repository.ShipwreckRepository;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //this integration test should be run with specified runner
@SpringBootTest(classes = App.class) // supply main class as your parameter, whoch helps in running and configuring main method
@WebAppConfiguration
public class ShipwreckRepository_IntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRepository;
    @Test
    public void testFindAll(){
        List<Shipwreck> wrecks = shipwreckRepository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }

}
