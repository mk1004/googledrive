package googledrive.common;


import googledrive.IndexingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexingApplication.class })
public class CucumberSpingConfiguration {
    
}
