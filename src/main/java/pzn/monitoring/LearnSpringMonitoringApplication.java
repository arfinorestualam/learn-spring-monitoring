package pzn.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringMonitoringApplication.class, args);
    }

    //run this app, open localhost:8080 with endpoint /actuator to see what actuator looks like
    //but the default of actuator only show health, for safety if you want to show others, you can type explicitly

}
