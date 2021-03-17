package com.recipebookproject;

import com.recipebookproject.applepie.Apples;
import com.recipebookproject.applepie.Pie;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which kind of apple would you like to put in you apple pie?\ngrannysmith\njazz \nreddelicious\nfuji ");
        int appleChoice = scanner.nextInt();
        System.out.println(appleChoice);



        var classicApplePie = new Apples();
        while (appleChoice >4 || appleChoice<0){
            System.out.println("Must be between 1 and 4");
            appleChoice = scanner.nextInt();
        }
        if( appleChoice == 1) {
            classicApplePie.setApple(Apples.TypeOfApples.grannysmith);
        } else if ( appleChoice ==2 ) {
            classicApplePie.setApple(Apples.TypeOfApples.jazz);
        } else if ( appleChoice ==3 ) {
            classicApplePie.setApple(Apples.TypeOfApples.reddelicious);
        }else if ( appleChoice ==4 ) {
            classicApplePie.setApple(Apples.TypeOfApples.fuji);

            }
        classicApplePie.pickedApple();






////        classicApplePie.ingredientsNeeded();

    }
}
