package com.codedifferently.part02;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class TooHighTooLow {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20);
        int counter = 0;
        int guessNumber;
        Scanner scan = new Scanner(System.in) ;
        ArrayList<Integer> allNumber = new ArrayList<Integer>();
        System.out.println();
        System.out.println("-------WelCome to TooHighTooLow Game--------");
        System.out.println();
 
do{  
   
    System.out.println("Please enter the number between 0-20");
    guessNumber = scan.nextInt();

    System.out.println("The guessing number is "+guessNumber);

if(!allNumber.contains(guessNumber)){

    if(guessNumber>number){
        System.out.println("too high");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        counter++;

}
    else if(guessNumber<number){
        System.out.println("too low");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        counter++;

}
    else{
        System.out.println("Congratulations");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        counter++;
}
   }

else{
       System.out.println("Please enter non-duplicate value");
       System.out.println();
       System.out.println("--------------");
       System.out.println();
   }

allNumber.add(guessNumber);
}while (guessNumber != number);
scan.close();
System.out.println(counter);
    
}
}


