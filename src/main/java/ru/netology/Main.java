package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post data = new Post();
        data.name = "John";
        data.patronymic = "Johnovich";
        data.surname = "Johnson";
        data.phone = "+7 (999)-999-99-99";
        data.passport = "4444 № 44444444";
        data.subscription = true;

        data.birthday = new FormDate();
        data.birthday.day = 13;
        data.birthday.month = 6;
        data.birthday.year = 1971;
        System.out.println(data.birthday.year);
    }
}