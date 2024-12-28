package pzn.monitoring;

import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//it is just test for actuator
public class MyScheduleTask {

    //add this for micrometer
    @Autowired
    private MeterRegistry meterRegistry;
    //micrometer is library for using metrics, to make custom metrics, can use class above that use
    //library micrometer. To see integrate using promotheus etc, check the documentation

    @Scheduled(fixedRate = 10000)
    public void hello() {
        meterRegistry.counter("my.scheduled.task").increment();
        log.info("hello");
    }
}
