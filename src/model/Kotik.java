package model;

import java.util.Scanner;

public class Kotik {
    private static int kitCount = 0;
    private int golod = 5;
    private String name;
    private String meow;
    private int weight;
    private int prettiness;
    Scanner in = new Scanner(System.in);
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
            return true;
        }
        else {
            return false;
        }
    }
    boolean play (){
        if (golod > 0){
            golod--;
            return true;
        }
        else {
            return false;
        }
    }

    boolean chaseMouse(){
        if (golod > 0){
            golod--;
            return true;
        }
        else {
            return false;
        }
    }
    boolean fight (){
        if (golod > 0){
            golod--;
            return true;
        }
        else {
            return false;
        }
    }
    boolean mew (){
        if (golod > 0){
            golod--;
            return true;
        }
        else {
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
                    if (sleep() == true) {
                        System.out.println("Сон ");
                    }
                    else{
                        eat((int)(Math.random() * 5) + 1);
                        System.out.println("НЕ Сон - покушал");
                    }
                    break;
                case (2):
                    if (play() == true) {
                        System.out.println("Игра ");
                    }
                    else {
                        eat((int)(Math.random() * 5) + 1);
                        System.out.println("НЕ Игра - покушал");
                    }
                    break;
                case (3):
                    if (chaseMouse() == true) {
                        System.out.println("Охота ");
                    }
                    else {
                        eat((int)(Math.random() * 5) + 1);
                        System.out.println("НЕ Охота - покушал");
                    }
                    break;
                case (4):
                    if (fight() == true) {
                        System.out.println("Драка ");
                    }
                    else {
                        eat((int)(Math.random() * 5) + 1);
                        System.out.println("НЕ Драка - покушал");
                    }
                    break;
                case (5):
                    if (mew() == true) {
                        System.out.println("Мурчание ");
                    }
                    else {
                        eat((int)(Math.random() * 5) + 1);
                        System.out.println("НЕ Мурчание - покушал");
                    }
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
