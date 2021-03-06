package main.java.com.codecool.plaza.api;

import java.util.Date;

public class FoodProduct extends Product {
    private int calories;
    private String bestBefore;

    public FoodProduct(long barcode, String manufacturer, int calories, String bestBefore){
        super(barcode, manufacturer);
        this.calories = calories;
        this.bestBefore = bestBefore;
    }

    public boolean isStillConsumable(){
        return true;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "calories=" + calories +
                ", bestBefore=" + bestBefore +
                ", barcode=" + barcode +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
