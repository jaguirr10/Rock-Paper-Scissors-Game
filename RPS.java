
//Juan Aguirre


import java.util.Random;
import java.util.Scanner;

public class RPS{

   public static void main (String args []){
      String personPlay = "";
      String computerPlay = "";
      int computerInt;
   
      
   
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
   
      //generate random values for computer play
      computerInt = generator.nextInt(3);
      
      //Change the values  0,1,2 to R,P,S
      switch (computerInt){
         case 0:
            computerPlay = "R";
            break;         
         case 1:
            computerPlay = "P";      
            break;
         case 2:
            computerPlay = "S";
            break;
      }
     // System.out.println("Computer Value:" + computerPlay);
      
      //The user input the value to play the game
      Scanner input = new Scanner(System.in);
      int i = 0;
      System.out.print("Please enter a move!!\n" + "\n" + "Rock = R, Paper" + 
                          "= P, and Scissors = S:");
      System.out.println();
      personPlay = input.nextLine();
//      System.out.println(personPlay);

      personPlay = personPlay.toUpperCase();
      System.out.println("The computer chose: " + computerPlay);

      // creating the outcomes of the game 
      if (personPlay.equals(computerPlay)) {
         System.out.println("It's a tie!!try again!"); 
      }else {
         switch (personPlay){
            case "R":
               if (computerPlay == "P") 
                  System.out.println("you lose!! try again!") ;
                else if (computerPlay == "S")
                  System.out.println("you win !");
               break;
            case "P":
               if (computerPlay == "S") 
                  System.out.println("you lose!!scissor cuts paper !") ;
               else if (computerPlay == "R")
                  System.out.println("Paper covers rock! you win !");
               break;
            case "S":
               if (computerPlay == "R") 
                  System.out.println("rock smashes paper! computer wins !"); 
               else if (computerPlay == "P")
                  System.out.println("scissor beats paper! your a winner !");
               break;
         }
     }
  
   }

}
