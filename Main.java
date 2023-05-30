package com.use;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string of numbers separated by dots: ");
    String numbersString = input.nextLine();

    int startIndex = 0;
    int endIndex = numbersString.indexOf('.');
    
    while (endIndex != -1) {
      System.out.print(numbersString.substring(startIndex, endIndex) + " ");
      startIndex = endIndex + 1;
      endIndex = numbersString.indexOf('.', startIndex);
    }
    
    System.out.print(numbersString.substring(startIndex));
  }
}
