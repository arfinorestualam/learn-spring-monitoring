package pzn.monitoring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//it is just test for actuator
public class MyScheduleTask {

    @Scheduled(fixedRate = 10000)
    public void hello() {
        log.info("hello");
    }
}
