package com.example.myapp.Model;

public class vehicle {

        private String name;
        private String type;
        private String unlock;
        private int cost;
      //  private int numbOfPeople;
        private int img;

        public vehicle(String name, String type, int cost, int img) {
            this.name = name;
            this.type = type;
           // this.unlock = unlock;
            this.cost = cost;
          //  this.numbOfPeople=numbOfPeople;
            this.img = img;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUnlock(String unlock) {
        this.unlock = unlock;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUnlock() {
        return unlock;
    }

    public int getCost() {
        return cost;
    }



    public int getImg() {
        return img;
    }
}
