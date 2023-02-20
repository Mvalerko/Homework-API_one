package org.example;

public class Main {
        public static void main(String[] args) {
            Post post = new Post();

            post.name = "Иван";
            post.passport = "4444 № 44444444";
            post.patronymic = "Иванович";
            post.phone = "+7 (999)-999-99-99";
            post.surname = "Иванов";
            post.subscription = true;
            // Так как классу Post известно о классе FormDate и его полях, то можем строить такую трехэтажную
            //конструкцию, как "post.birthday.day", где post обращение к переменной post, объявленной в этом классе
            // birthday обращение к переменной birthday, объявленной в классе Post, а day обращение к перменной
            // day объявленной в классе FormDate 
            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1999;

        }
    }