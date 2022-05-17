package ru.zolotenkov.patterns.decorator;

public class App {
  public static void main(String[] args) {
    Developer developer = new JavaDeveloper();
    Developer middleJavaDeveloper = new MiddleJavaDeveloper(developer);
    Developer seniorDeveloper = new SeniorJavaDeveloper(middleJavaDeveloper);
    seniorDeveloper.makeJob();
  }
}
