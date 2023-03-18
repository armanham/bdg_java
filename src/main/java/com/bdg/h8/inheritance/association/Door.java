package com.bdg.h8.inheritance.association;

public class Door {

    private String material;

    private double height;

    private double weight;

    public Door() {
    }

    public Door(String material, double height, double weight) {
        this.material = material;
        this.height = height;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "}\n";
    }
}
