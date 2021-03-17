package com.recipebookproject.applepie;

public class Apples {
    public enum TypeOfApples {
        grannysmith,
        jazz,
        reddelicious,
        fuji,

    }
    TypeOfApples apple = null;

    // puts the constructors in variables
    String[] classic = new String[]{};
    String[] dutch = new String[]{};
//
//    public TypeOfApples getApple(){
//        return apple;
//    }

    public void setApple( TypeOfApples apple) {
        this.apple = apple;
    }


    public void pickedApple(){
        System.out.println("i want to use "+apple+ " apples in my classic apple pie");
    }


    public void ingredientsNeeded() {
        System.out.println(classic.length);
        System.out.println("i will need");
        for (int i = 0; i < classic.length; i++) {
            System.out.print(classic[i] + " ");

        }
    }
}
