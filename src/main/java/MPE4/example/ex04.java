package MPE4.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex04 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //Inputs
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        //Output string
        String outputString = "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";

        //output
        System.out.println(outputString);
    }
    //main method end
}
//class end
