import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        greet();
        repeat();
        age();
        count();
        testQ();

    }
// #1
    public static String greet(){
        
        System.out.println("What's up?");
        
        System.out.println("I'm Poco!");

        System.out.println("What's your name?");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

// #2
    public static String repeat(){
        
        System.out.println("Hold on, Poco is old. Let me clear this wax out of my ear");
        
        System.out.println("Tell me your name again?");
        
        Scanner input = new Scanner(System.in);
         
        String name = input.nextLine();
        
        System.out.println("Nice! I knew a " + name + " back in 1756!");
        
        return name;
    }
// #3

public static int age() {
    Scanner input= new Scanner(System.in);
    
    System.out.println("Hmmm, you look pretty young");
    
    System.out.println("What year were you born?"); 
    int year = input.nextInt();
    int age = 2022-year;
    
    System.out.println("Oh I got it! You're " + age +"!!!!");
    return age;
    
}

// #4

public static void count(){
    System.out.println("I've recently started counting a lot");
    System.out.println("I'm gonna count for you");
    System.out.println("Give me a number");
    
    Scanner input = new Scanner(System.in);
    
    int nums = input.nextInt();
    
    
    for(int i=1; i <= nums; i++){
        
        System.out.println(i);
    }
}

// #5

public static void testQ() {

    System.out.println(" You're boring.");
    System.out.println("...");
    System.out.println("Quizzy quiz time!");

    System.out.println("Which of the following is false about String?");
    
    System.out.println("[A]:String is immutable.");
    System.out.println("[B]:String is immutable.");
    System.out.println("[C]:String is a primary data type");
    System.out.println("[D]: None of the above.");

    String answer = input.nextLine();

    while(!answer.toUpperCase().equals("C")){
       
        System.out.println("INCORRECT");
        
        answer = input.nextLine();
    }
    System.out.println("CORRECT");

    System.out.println("...");
    System.out.println("...");
    System.out.println("okay, bye");

}}

