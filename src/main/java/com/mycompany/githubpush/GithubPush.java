/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.githubpush;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class GithubPush {
    
    public static void githubChange() {
       //Import the scanner
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter your name: ");
       String name = scanner.next();
        System.out.println("Hello " + name + " !.Welcome!");
       
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
