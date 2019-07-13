package com.example.materialdesigntest;

public class FoodBean {
    private int img;
    private String title;
    private String cost;
    private String time;
    private String ingredients;
    private String instructions;
    private String location;

    public FoodBean(int img, String title, String cost, String time, String ingredients, String instructions, String location) {
        this.img = img;
        this.title = title;
        this.cost = cost;
        this.time = time;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.location = location;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
