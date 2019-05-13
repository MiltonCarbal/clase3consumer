package xyz.mac.clase3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Clase3Application {

    public static void main(String[] args) {
        SpringApplication.run(Clase3Application.class, args);
    }

}

//@Component
//class AppStartupRunner implements ApplicationRunner {
//
//    @Autowired
//    KafkaConsumer kafkaConsumer;
//
//    public void run(ApplicationArguments args) throws Exception {
//
//    }
//
//}