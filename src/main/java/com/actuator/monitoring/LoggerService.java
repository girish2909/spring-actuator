package com.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {

    private final String LOGGER_SERVICE = "Database Service";
    @Override
    public Health health() {
        if(isLoggerServiceHealthGood()){
            return Health.up().withDetail(LOGGER_SERVICE, "Logger Service is Running..").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE, "Logger Service is not Running..").build();
    }

    private boolean isLoggerServiceHealthGood(){
        //logic
        return false;
    }
}
