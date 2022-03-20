import java.util.Scanner;

public class VertexForm extends QuadraticRelationship{
    
//    public VertexForm(){
//        a=1;
//        axis=0;
//        optimum=0;
//    }
    
    @Override
    public void userInput(){
        // allows user to enter values for a, axis and optimum values
        Scanner input = new Scanner(System.in);
        System.out.println("The value of 'a' must NOT be 0!");
        System.out.println("Please enter the a, k and h values for the vertex equation.");
        while (true){
            this.a=getValue("a: ");
            if (this.a!=0) break;
            else System.out.println("\"a\" must NOT equal 0!");
        }  
        this.axis=getValue("(axis of symmetry) h: ");
        this.optimum=getValue("(optimum value) k: ");    
    }
    
    public double findB(){
        // Expand equation to determine the b value
        return (-2)*this.a*this.axis;
    }
    
    public double findC(){  
        // Expand equation to determine the c value
        return (Math.pow(this.axis,2)*this.a) + this.optimum;
    }
}

