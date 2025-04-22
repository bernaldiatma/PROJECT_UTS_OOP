package com.uts;

// Subclass
public class HeroAssasin extends Hero{
    public String ClassHero = "Assasin";

    // Konstruktor
    public HeroAssasin(String name, double attack, double defence, double health){
        super(name, attack, defence, health);
    }

    @Override
    public void attacking(Hero enemy){
        enemy.gotDamage(getAttack() * 0.4);
        setHealth(getHealth() + 10);
    }

    @Override
    public void gotDamage(double damage){
        setHealth(getHealth() - damage + (getDefence() * 0.5));
    }

    @Override
    public void display(){
        System.out.println("Class   : " + this.ClassHero);
        super.display();
    }
}
