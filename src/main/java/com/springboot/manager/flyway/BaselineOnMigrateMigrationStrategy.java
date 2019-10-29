package com.springboot.manager.flyway;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;
import org.flywaydb.core.Flyway;

@Component
public class BaselineOnMigrateMigrationStrategy implements FlywayMigrationStrategy {

    @Override
    public void migrate(Flyway flyway) {
        flyway.baseline();
        flyway.migrate();
    }
}
