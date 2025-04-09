package ru.job4j.oop;

public class Error {
    private String message;
    private int status;
    private boolean active;

    public Error(String message, int status, boolean active) {
        this.message = message;
        this.status = status;
        this.active = active;
    }

    public Error() {

    }

    public void getMessage() {
        System.out.println("Привет: " + message);
        System.out.println("Состояние: " + active);
        System.out.println("Порядок: " + status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.getMessage();
        Error error2 = new Error("Иван", 1, true);
        error2.getMessage();
        Error error3 = new Error("Петр", 2, true);
        error3.getMessage();

    }
}
