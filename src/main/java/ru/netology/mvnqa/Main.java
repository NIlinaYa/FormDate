package ru.netology.mvnqa;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Парфирий";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;        // поля даты рождения
        post.birthday.month = 01;
        post.birthday.year = 2005;
    }

}