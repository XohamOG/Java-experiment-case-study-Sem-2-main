package Model.Records;

/**
 * Identification comments:
 *   Name: Soham patil
 *   Experiment No: 02
 *   Experiment Title: Record Class
 *   Experiment Date:15-02-2024
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Records.java
 * @author:  Soham patil
 * Overview: This is the Records class. In this file we have achieved the following
 * - Created Attributes
 * ---     int steps;
 * ---  int sleephrs;
 * ---  int hydration;
 * ---   boolean meditation;
 *
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */

public class Records {

    int steps;
    int sleephrs;
    int hydration;
    boolean meditation;

    public Records(int steps, int sleephrs, int hydration, boolean meditation)
    {
        this.steps = steps;
        this.sleephrs = sleephrs;
        this.hydration = hydration;
        this.meditation = meditation;
    }

    public void setsteps(int steps) {
        this.steps = steps;
    }

    public void setsleephrs(int sleephrs) {
        this.sleephrs = sleephrs;
    }

    public void sethydration(int hydration) {
        this.hydration = hydration;
    }

    public void setmeditation(boolean meditation) { 
        this.meditation = meditation;
    }
   
    public int getsteps() {
        return steps;
    }

    public int getsleephrs() {
        return sleephrs;
    }

    public int gethydration() {
        return hydration;
    }

    public boolean getmeditation() {
        return meditation;
    }
    public void display()
    {
        System.out.println("Client stepsstatus: "+getsteps());
        System.out.println("Client sleephrs status: "+getsleephrs());
        System.out.println("Client hydraion status: "+gethydration());
        System.out.println("Client meditation status: "+getmeditation()); 
    }

}
