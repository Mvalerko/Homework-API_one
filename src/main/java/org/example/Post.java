package org.example;

public class Post {

    //Знакомим класс Post с классом хранения даннных FormDate
    FormDate birthday = new FormDate();

    public String name; // поле для имени
    public String surname; // поле для фамилии
    public String patronymic; // поле для отчества
    public String phone; // поле для номера телефона
    public String passport; // поле для номера паспорта
    public boolean subscription; // поле для указания согласия получать новости о скидках в виде sms

}