package com.uts;

import java.util.ArrayList;
import java.util.Scanner;

// Supper Class
public class Hero {
    // Atribut Hero
    private String name;
    private double attack;
    private double defence;
    private double health;

    // Konstruktor
    public Hero(String name, double attack, double defence, double health){
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    // getter nama
    public String getName(){
        return this.name;
    }

    // settter nama
    public void setName(String name){
        this.name = name;
    }

    // getter attack
    public double getAttack(){
        return this.attack;
    }

    // setter attack
    public void setAttack(double attack){
        this.attack = attack;
    }

    // getter defence
    public double getDefence(){
        return this.defence;
    }

    // setter defence
    public void setDefence(double defence){
        this.defence = defence;
    }

    // getter health
    public double getHealth(){
        return this.health;
    }

    // setter health
    public void setHealth(double health){
        this.health = health;
    }

    public void attacking (Hero enemy){
        System.out.println("\n>>> " + this.name + " menyerang " + enemy.name + " <<<\n");
        enemy.gotDamage(this.attack);
    }

    public void gotDamage(double damage){
        this.health = this.health - damage;
    }

    // Searching Hero berdasarkan nama
    public static void cariHero(ArrayList<Hero> listHero){

        Scanner inputUser = new Scanner(System.in);

        while (true) {
            System.out.print("\nKetik nama Hero yang ingin dicari : ");
            String inputHero = inputUser.nextLine();

            for (Hero hero : listHero) {
                if (hero.getName().equalsIgnoreCase(inputHero)) {
                    System.out.println("Hero dengan nama " + inputHero + " telah ditemukan");
                    hero.display();
                    return;
                }
            }
            System.out.println("Hero dengan nama " + inputHero + " tidak ditemukan");
        }
    }

    // Sorting Hero berdasarkan jumlah attack menggunakan bubble sort
    public static void sortingHero(ArrayList<Hero> listHero){
        for (int i = 0; i < listHero.size(); i++) {
            for (int j = 0; j < listHero.size() - i - 1; j++) {
                if (listHero.get(j).getAttack() < listHero.get(j + 1).getAttack()) {
                    Hero swap = listHero.get(j);
                    listHero.set(j, listHero.get(j + 1));
                    listHero.set(j + 1, swap);
                }
            }
        }
    }

    public void display(){
        System.out.println("Nama    : " + this.name);
        System.out.println("Attack  : " + this.attack);
        System.out.println("Defence : " + this.defence);
        System.out.println("Health  : " + this.health);
        System.out.println("*==================*");
    }
}
