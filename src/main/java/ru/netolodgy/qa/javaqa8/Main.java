package ru.netolodgy.qa.javaqa8;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 123456";
        post.patronymic = "Петрович";
        post.phone = "+7 (919)-936-18-77";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 8;
        post.birthday.year = 2000;
    }
}