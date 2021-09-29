package com.company;

import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik beliKot = new Kotik("Белый", "Моу", 2 , 5);
        Kotik chernyKot = new Kotik();
        chernyKot.setKotik("Черный", "Мяу", 3, 7);
        beliKot.liveAnotherDay();
        System.out.println("Имя кота " + beliKot.getName());
        System.out.println("Вес кота " + beliKot.getWeigt());
        if(beliKot.getMeow().equals(chernyKot.getMeow()) == true){
            System.out.println("Коты мяукают одинаково");
        }
        else {
            System.out.println("Коты мяукают по-разному");
        }
        System.out.println("Количество котов " + Kotik.getKitCount());
    }
}
