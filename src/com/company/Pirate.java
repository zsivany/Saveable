package com.company;


import java.util.ArrayList;
import java.util.List;

public class Pirate implements ISaveable {

    private String name;
    private String cast;
    private int hitPoints;
    private int strength;
    private String weapon = "Saber";

    public Pirate(String name, String cast, int hitPoints, int strength) {
        this.name = name;
        this.cast = cast;
        this.hitPoints = hitPoints;
        this.strength = strength;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> writeElements() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1, this.cast);
        values.add(2, "" + this.hitPoints);
        values.add(3, "" + this.strength);
        values.add(4, this.weapon);

        return values;

    }

    @Override
    public void readElements(List<String> elementList) {
       if (elementList != null && elementList.size()>0) {
           this.name = elementList.get(0);
           this.cast = elementList.get(1);
           this.hitPoints = Integer.parseInt(elementList.get(2));
           this.strength = Integer.parseInt(elementList.get(3));
           this.weapon = elementList.get(4);


       }

    }


    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", cast='" + cast + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}


