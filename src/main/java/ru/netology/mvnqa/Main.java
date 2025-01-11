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

        System.out.println("Имя:" + post.name);
        System.out.println("Фамилия:" + post.patronymic);
        System.out.println("Отчество:" + post.surname);
        System.out.println("Дата рождения:" + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year + "г.");
        System.out.println("Паспорт:" + post.passport);
        System.out.println("Телефон:" + post.phone);
        System.out.println("Согласен на подписку:" + post.subscription);


    }

}