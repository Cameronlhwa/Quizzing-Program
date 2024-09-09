import java.util.ArrayList;
import java.util.Scanner;

/**
A class that contains all neccessary tools to code a quizzer
*/
public class QuizTools{

  private ArrayList<String> questions = new ArrayList<>();
  private ArrayList<String> questionsANS = new ArrayList<>();
  /**
  *Basic quiz setter that assigns ArrayList values to the questions and questionsANS ArrayLists
  @param an ArrayList that stores questions
  @param an ArrayList that stores answers
  */
  public QuizTools(ArrayList<String> q, ArrayList<String> a){
    questions = q;
    questionsANS = a;
  }

  //QandA 
  /**
  *This is the Q and A adder
  * - Adds a question to the questions arrayList and an answer to the questionsANS ArrayList
  *@param put in a question(String)
  *@param put in an answer (String)
  */
  public void addQA(String q, String a){
    questions.add(q);
    questionsANS.add(a);
  }
  
  //Quizzer
  /**
  *This is the quizzer method that does all the work for you!
  *@precondition make sure that there are questions and answers stored in the ArrayLists
  *@return returns questions and answers 
  *@return asks whether you got the question right
  */
  public void quizMe(){
    Scanner myScanner = new Scanner(System.in);
    int done = questions.size();

    while(done>0){
      int rand = (int)(Math.random()*questions.size());
      System.out.println(questions.get(rand) + " Type any letter when you want to see the answer.");
      String hold = myScanner.nextLine();

      System.out.println(questionsANS.get(rand) + " Type 'y' if you got it correct or any other letter if you got it wrong.");
      hold = myScanner.nextLine();
      if(hold.equals("y")){//Removing the question and answer from their arrayLists if they got them right
        questions.remove(rand);
        questionsANS.remove(rand);
        done--;
      }
      
    }
  }
  
}
