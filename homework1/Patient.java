package Lesson_1.homeworks.homework1;

public class Patient implements Request {
    public Patient() {

    }

    @Override
    public void question() {
        System.out.println("Мне нужен врач-терапевт");
    }
}
