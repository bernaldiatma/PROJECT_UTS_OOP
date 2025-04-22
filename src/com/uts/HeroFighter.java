package com.uts;

// Subclass
public class HeroFighter extends Hero{
    String ClassHero = "Fighter";

    // Konstruktor
    public HeroFighter(String name, double attack, double defence, double health){
        super(name, attack, defence, health);
    }

    @Override
    public void attacking(Hero enemy){
        enemy.gotDamage(getAttack());
        setHealth(getHealth() + 20);
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
