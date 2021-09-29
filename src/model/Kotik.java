package model;

import java.util.Scanner;

public class Kotik {
    private static int kitCount = 0;
    private int golod = 5;
    private String name;
    private String meow;
    private int weight;
    private int prettiness;
    public static int getKitCount() {
        return kitCount;
    }
    public String getMeow() {
        return meow;
    }
    public String getName() {
        return name;
    }
    public int getWeigt () {
        return weight;
    }
    public void setKotik(String name, String meow, int weight, int prettiness){
        this.name = name;
        this.meow = meow;
        this.weight = weight;
        this.prettiness = prettiness;
    }
    boolean sleep(){
        if (golod > 0){
            golod--;
            System.out.println("Сон ");
            return true;
        }
        else {
            eat((int)(Math.random() * 5) + 1);
            System.out.println("НЕ Сон - покушал");
            return false;
        }
    }
    boolean play (){
        if (golod > 0){
            golod--;
            System.out.println("Игра ");
            return true;
        }
        else {
            eat((int)(Math.random() * 5) + 1);
            System.out.println("НЕ Игра - покушал");
            return false;
        }
    }

    boolean chaseMouse(){
        if (golod > 0){
            golod--;
            System.out.println("Охота ");
            return true;
        }
        else {
            eat((int)(Math.random() * 5) + 1);
            System.out.println("НЕ Охота - покушал");
            return false;
        }
    }
    boolean fight (){
        if (golod > 0){
            golod--;
            System.out.println("Драка ");
            return true;
        }
        else {
            eat((int)(Math.random() * 5) + 1);
            System.out.println("НЕ Драка - покушал");
            return false;
        }
    }
    boolean mew (){
        if (golod > 0){
            golod--;
            System.out.println("Мурчание ");
            return true;
        }
        else {
            eat((int)(Math.random() * 5) + 1);
            System.out.println("НЕ Мурчание - покушал");
            return false;
        }
    }
    boolean eat (int x, String y){
        golod += x;
        return true;
    }
    boolean eat (int x){
        golod += x;
        return true;
    }
    boolean eat () {
        eat();
        return true;
    }
    public void  liveAnotherDay(){
        for (int i = 0;i < 23; i++){
             int j = (int)(Math.random() * 5) + 1;
            switch (j) {
                case  (1):
                    sleep();
                    break;
                case (2):
                    play();
                    break;
                case (3):
                    chaseMouse();
                    break;
                case (4):
                    fight();
                    break;
                case (5):
                    mew();
                    break;
            }
        }
    }
    static void kitCounter() {
        kitCount++;
    }
    public Kotik(String name, String meow, int weight, int prettiness) {
        Kotik.kitCounter();
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.prettiness = prettiness;
    }
    public Kotik() {
        Kotik.kitCounter();
    }
}
