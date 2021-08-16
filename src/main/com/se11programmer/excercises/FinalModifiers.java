package com.se11programmer.excercises;

public class FinalModifiers {

  private void printZoomInfo(boolean isWeekend) {
    final int giraffe = 5;
    final long lemur;
    if (isWeekend) {
      lemur = 5;
    } else {
      lemur = 10;
    }
    System.out.println(giraffe + "" + lemur);
  }

  public static void main(String[] args) {
    FinalModifiers finalModifiers = new FinalModifiers();
    finalModifiers.printZoomInfo(true);

  }
}
