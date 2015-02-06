package pl.sgorecki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Value("${profile.name}")
    private String profileName;

    @Autowired
    private SimpleService simpleService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("I'm standalone SpringBoot application.");
        logger.info("I'm working in " + profileName + " mode.");

        logger.info(new Greeter().greet("Sebastian"));
        logger.info(simpleService.sayHello());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
