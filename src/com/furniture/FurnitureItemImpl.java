package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
        obj.setFurnitureCode(123);
        obj.setFurnitureType("table");
        obj.setGradeOfFurniture(1);
        obj.setFurnitureUsage("Outdoor");
        obj.setPrice(10);
        float result = obj.calculateDiscount();
        System.out.println(result);
    }
}
