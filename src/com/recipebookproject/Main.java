package com.recipebookproject;

import com.recipebookproject.applepie.Apples;

public class Main {

    public static void main(String[] args) {
	    var classicApplePie = new Apples();
        classicApplePie.setApple(Apples.TypeOfApples.grannysmith);
        classicApplePie.pickedApple();
        classicApplePie.ingredientsNeeded();
    }
}
