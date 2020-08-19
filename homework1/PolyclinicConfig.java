package Lesson_1.homeworks.homework1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PolyclinicConfig {
    @Bean
    public Request patient() {
        return new Patient();
    }

    @Bean
    public Response registrar() {
        return new Registry();
    }
}
