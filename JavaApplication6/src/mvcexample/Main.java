package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c2 = new Controller2(model,"Controller C2",40,400); // Create second controller
         Controller2 c3 = new Controller2(model,"Controller C3",450,400); // Create third controller
          Controller2 c4 = new Controller2(model,"Controller C4",860,400); // Create fourth controller
         
        
    } // main
  
} // Main  

