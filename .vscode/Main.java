import java.util.ArrayList;
import java.util.Scanner;

/**
* A class to create a 'quizzer' using quiz tools from the QuizTools class
* This class currently has pre set questions and answers but still allows the user to make their own quiz package
*/
class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    
    ArrayList<String> myQ = new ArrayList<>();
    ArrayList<String> myA = new ArrayList<>();
    ArrayList<String> myQ2 = new ArrayList<>();
    ArrayList<String> myA2 = new ArrayList<>();

    //These are pre set questions and answers for testing purposes
    myQ.add("What do you do at a red light?");
    myA.add("Stop.");
    myQ.add("What do you do at a green light?");
    myA.add("Go.");
    myQ.add("What speed do you travel at at a school ground?");
    myA.add("30km/h.");
    myQ.add("Why do you drive?");
    myA.add("To get places.");

    //Asking the user what they want to do
    System.out.println("Would you like to get quizzed on a pre set quiz on driving or would you like to make you own quiz? Type 1 if you want to do the quiz on driving or type two if you want to make your own quiz.");
    String dec = myScanner.nextLine();

    //Quizing them on my preset quiz if they hit 1
    if(dec.equals("1")){
      QuizTools test = new QuizTools(myQ, myA);
      test.quizMe();
    }
    //If anything else is hit, they get a chance to make their own quiz
    else{
      int i = 0;
      while(i == 0){
        System.out.println("What would you like the question of your quiz to be?"); //question setting
        String firstQ = myScanner.nextLine();
        myQ2.add(firstQ);
        
        System.out.println("What would you like the answer to be?"); //answer setting
        String firstA = myScanner.nextLine();
        myA2.add(firstA);

        System.out.println("Would you like to add another question? Type 1 if so and 2 if not."); //Asking whether they want to make more questions
        String ansXY = myScanner.nextLine();
        if(ansXY.equals("2")){
          i++;
        }
        
      }
      System.out.println("Would you like to get quized on the quiz you made or the driving quiz? Type 1 for the quiz you made or 2 for the driving quiz."); //Chance to pick which quiz they want to get quizzed on
      String decision2 = myScanner.nextLine();
      if(decision2.equals("1")){
        QuizTools test2 = new QuizTools(myQ2, myA2);
        test2.quizMe();
      }
      else{
        QuizTools test3 = new QuizTools(myQ, myA);
        test3.quizMe();
      }
    }
    
    System.out.println("Thanks for using my program! ツ");
  }
}