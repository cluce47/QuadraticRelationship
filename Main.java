import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int choice;
    do {
    System.out.println("1. Standard Quadratic equation");
    System.out.println("2. Vertex Equation form");
    System.out.println("3. Factored Equation form");
    System.out.println("4. Quit");
    System.out.print("Which equation form did you want to solve? ");
    choice = in.nextInt();
    switch (choice){
      case 1:
        QuadraticRelationship q1 = new QuadraticRelationship();
        q1.userInput();
        q1.axis=q1.findAxis();
        q1.optimum = q1.findY(q1.axis);
        q1.results(q1);
        break;
      case 2:
        VertexForm q2 = new VertexForm();
        q2.userInput();
        q2.b=q2.findB();
        q2.c=q2.findC();
        q2.results(q2);
        break;
      case 3:
        FactoredForm q3 = new FactoredForm();
        q3.userInput();
        q3.axis=q3.findAxis(q3.root1, q3.root2);
        q3.optimum =q3.findY(q3.axis, q3.a, q3.root1,q3.root2);
        q3.results(q3);  
        break;
      case 4:
        System.out.println("Goodbye!");
        break;
      default:
        System.out.println("Not a valid choice");
  
      }
    } while (choice!=4);
    in.close();
  }
}