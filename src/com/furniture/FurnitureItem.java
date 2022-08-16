package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private int gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;
    static  final int discount = 5;
    public FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = 0;
        color = null;
        furnitureUsage = null;
        price = 0.0f;
    }
    public float calculateDiscount(){
        float res = 0.0f;
        if(furnitureUsage.equals("Outdoor") && gradeOfFurniture == 1) {
            res = (price - (price * discount) / 100);
        }else{
            res = price;
        }
        return res;
    }
    public void setFurnitureCode(int furnitureCode){
        this.furnitureCode = furnitureCode;
    }
    public int getFurnitureCode(){
        return furnitureCode;
    }
    public void setFurnitureType(String furnitureType){
        this.furnitureType = furnitureType;
    }
    public String getFurnitureType(){
        return furnitureType;
    }
    public  void setGradeOfFurniture(int gradeOfFurniture){
        this.gradeOfFurniture = gradeOfFurniture;
    }
    public int getGradeOfFurniture(){
        return gradeOfFurniture;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return  color;
    }
    public void setFurnitureUsage(String furnitureUsage){
        this.furnitureUsage = furnitureUsage;
    }
    public String getFurnitureUsage(){
        return furnitureUsage;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public  float getPrice(){
        return  price;
    }
}
