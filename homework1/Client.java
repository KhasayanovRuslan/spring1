package Lesson_1.homeworks.homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PolyclinicConfig.class);
        Request patient = context.getBean(Request.class);
        Response registrar = context.getBean(Response.class);
        patient.question();
        registrar.answer();
    }
}
