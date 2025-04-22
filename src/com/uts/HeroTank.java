package com.uts;

// Subclass
public class HeroTank extends Hero{
    public String ClassHero = "Tank";

    // Konstruktor
    public HeroTank(String name, double attack, double defence, double health){
        super(name, attack, defence, health);
    }

    @Override
    public void attacking(Hero enemy){
        enemy.gotDamage(getAttack());
    }

    @Override
    public void gotDamage(double damage){
        setHealth(getHealth() - damage + (getDefence() * 0.5) + 5);
    }

    @Override
    public void display(){
        System.out.println("Class   : " + this.ClassHero);
        super.display();
    }
}
