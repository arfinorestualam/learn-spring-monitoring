package pzn.monitoring;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

// This class defines a custom health indicator for a Spring application.
// It extends AbstractHealthIndicator, which is a base class for creating health indicators.
@Component
public class MyHealthIndicator extends AbstractHealthIndicator {

    // This method is called to perform the health check logic.
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        // Set the health status to UP, indicating that the application is healthy.
        builder.status(Status.UP);

        // Add details to the health indicator response:
        // "app" indicates the application status, which is "OK".
        builder.withDetail("app", "OK");

        // "error" indicates there are no errors in the application.
        builder.withDetail("error", "NO ERROR");
    }
}

