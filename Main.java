class Main {
  public static void main(String[] args) {
    QuadraticRelationship q1 = new QuadraticRelationship();
        q1.userInput();
        q1.axis=q1.findAxis();
        q1.optimum = q1.findY(q1.axis);
        q1.results(q1);
        
        VertexForm q2 = new VertexForm();
        q2.userInput();
        q2.b=q2.findB();
        q2.c=q2.findC();
        q2.results(q2);
        
        FactoredForm q3 = new FactoredForm();
        q3.userInput();
        q3.axis=q3.findAxis(q3.root1, q3.root2);
        q3.optimum =q3.findY(q3.axis, q3.a, q3.root1,q3.root2);
        q3.results(q3);  
  }
}