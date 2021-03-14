package com.recipebookproject.applepie;

public class Apples {
    public enum TypeOfApples {
        grannysmith,
        jazz,
        reddelicious,
        fuji,
        royalgala,
        braburn
    }
    TypeOfApples apple = null;

    String[] classic = new String[]{};
    String[] dutch = new String[]{};

    public TypeOfApples getApple() {
        return apple;
    }

    public void setApple(TypeOfApples apple) {
        this.apple = apple;
    }
    public void pickedApple(){
        System.out.println("i want "+apple+ " apples in my classic apple pie");
    }
    public void ingredientsNeeded(){
        System.out.println("add"+ dutch.length);
    }

}
