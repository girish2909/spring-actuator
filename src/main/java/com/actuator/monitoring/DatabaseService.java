package com.actuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {

    private final String DB_SERVICE = "Database Service";
    @Override
    public Health health() {
        if(isDatabaseHealthGood()){
            return Health.up().withDetail(DB_SERVICE, "Database Service is Running..").build();
        }
        return Health.down().withDetail(DB_SERVICE, "Database Service is not Running..").build();
    }

    private boolean isDatabaseHealthGood(){
        //logic
        return true;
    }
}
