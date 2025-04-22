package com.uts;

// Subclass
public class HeroMarksman extends Hero{
    public String ClassHero = "Marksman";

    // Konstruktor
    public HeroMarksman(String name, double attack, double defence, double health){
        super(name, attack, defence, health);
    }

    @Override
    public void attacking(Hero enemy){
        enemy.gotDamage(getAttack() * 0.5);
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
