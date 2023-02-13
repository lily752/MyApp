package com.example.myapp.Model;

public class vehicle {

        private String name;
        private String type;
        private int cost;
        private int img;

        public vehicle(String name, String type, int cost, int img) {
            this.name = name;
            this.type = type;
            this.cost = cost;
            this.img = img;
        }


    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getCost() {
        return cost;
    }
    public int getImg() {
        return img;
    }
}
