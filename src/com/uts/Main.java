package com.uts;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("*=======================================*");
        System.out.println("DIBUAT OLEH: BERNALDI ATMA TANJUNG SUTEJA");
        System.out.println("TEMA       : SIMULASI GAME SEDERHANA     ");
        System.out.println("*=======================================*\n");

        // Object Hero
        Hero hero1 = new HeroAssasin("Spongebob", 80, 30, 500);
        Hero hero2 = new HeroTank("Patrick", 40, 50, 700);
        Hero hero3 = new HeroFighter("Sandy", 60, 40, 600);
        Hero hero4 = new HeroMarksman("Squidward", 100, 20, 400);

        // Membuat Array List yang berisi para Hero
        ArrayList<Hero> listHero = new ArrayList<>();
        listHero.addFirst(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.addLast(hero4);

        // Sorting Hero berdasarkan attack menggunakan bubble sort
        Hero.sortingHero(listHero);

        // Menampilkan list hero
        System.out.println(">>> List Hero Berdasarkan Jumlah Attack Yang Dimiliki <<<");
        for (Hero h : listHero) {
            h.display();
        }

        // Searching Hero berdasarkan nama
        Hero.cariHero(listHero);

        // Pertarungan pertama antara hero1 dengan hero4
        System.out.println("\nPertarungan pertama antara " + hero1.getName() + " \uD83C\uDD9A " + hero4.getName());
        boolean bertarung = true;
        System.out.println("\n>>> " + hero1.getName() + " bertarung dengan " + hero4.getName() + " <<<");
        while (bertarung) {
            hero1.attacking(hero4);
            hero4.attacking(hero1);
            System.out.print("⚔️ ");

            if (hero1.getHealth() <= 0 || hero4.getHealth() <= 0) {
                bertarung = false;
            }
        }

        // Penentuan kemenangan
        if (hero1.getHealth() <= 0) {
            System.out.println("\n>>> " + hero4.getName() + " MENANG!!! <<<");
        } else {
            System.out.println("\n>>> " + hero1.getName() + " MENANG!!! <<<");
        }

        System.out.println("\n*============================================================*");

        // Pertarungan kedua anatara hero2 dengan hero3
        System.out.println("\nPertarungan kedua antara " + hero2.getName() + " \uD83C\uDD9A " + hero3.getName());
        boolean bertarung2 = true;
        System.out.println("\n>>> " + hero2.getName() + " bertarung dengan " + hero3.getName() + " <<<");
        while (bertarung2) {
            hero2.attacking(hero3);
            hero3.attacking(hero2);
            System.out.print("⚔️ ");

            if (hero2.getHealth() <= 0 || hero3.getHealth() <= 0) {
                bertarung2 = false;
            }
        }

        // Penentuan kemenangan
        if (hero2.getHealth() <= 0) {
            System.out.println("\n>>> " + hero3.getName() + " MENANG!!! <<<");
        } else {
            System.out.println("\n>>> " + hero2.getName() + " MENANG!!! <<<");
        }
    }
}
