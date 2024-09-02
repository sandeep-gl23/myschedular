package com.example.myschedular.configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "scheduler")

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SchedulerConfig {
    private long fixedRate;
    private long fixedDelay;
    private String cron;
}
