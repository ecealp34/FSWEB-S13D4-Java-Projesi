package com.workintech.model;

public enum Weapon {

    GUN(15, 4),
    AXE(10, 2),
    SWORD(12, 1.2);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
    return damage;
}

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
