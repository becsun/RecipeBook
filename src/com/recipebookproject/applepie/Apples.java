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

    public TypeOfApples getApple() {
        return apple;
    }

    public void setApple(TypeOfApples apple) {
        this.apple = apple;
    }

}
