package com.ZachD.week4.enums;

import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String input;
        String firstThree;
        NFC team = NFC.NONE;

        System.out.println("Please enter a NFC team using their mascot or city.");
        input = keyboard.nextLine();
        firstThree = input.substring(0,3).toUpperCase();
        team = team.getTeam(firstThree);
        System.out.println("The team you entered is the " + team.getFull(team).toLowerCase() + ".");

    }
}
