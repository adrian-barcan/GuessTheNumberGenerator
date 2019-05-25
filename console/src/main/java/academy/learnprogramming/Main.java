package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

    //private static final Logger log = LoggerFactory.getLogger(Main.class);

    //private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess the number game");

        //create the context

        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //No need to create a context in Spring Boot
        //ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        SpringApplication.run(Main.class, args);

        //get the number generator bean from context (container)

//        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//        // call method next() to get a random number
//
//        int number = numberGenerator.next();
//        log.info("number = {}", number);
//
//        //get the game bean from context (container)
//        Game game = context.getBean(Game.class);
//
//        // call reset method
//        // game.reset(); ->comment to use init methods instead
//
//        //get the message generator bean from context (container)
//
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//        log.info("getMainMessage= {}",messageGenerator.getMainMessage());
//        log.info("getResultMessage= {}",messageGenerator.getResultMessage());


        // close context (container)

        //context.close();
    }
}
