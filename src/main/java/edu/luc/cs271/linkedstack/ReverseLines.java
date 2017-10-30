package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  public static void printReverse(Scanner input) {

    if (input.hasNext()) {
      final String line = input.nextLine();
      System.out.println(line);
      printReverse(input);
      System.out.println(line);
    } else {
      return;
    }
  }
}
