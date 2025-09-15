import java.util.Scanner;

public class App
 {
    public static void main(String[] args) throws Exception {
    
    System.out.println("Github juttu :D !");

    Scanner in = new Scanner(System.in);
    int counter = 0;

    while(true){
        System.out.println("Guess my name (type stop to exit)");
        String name1 = in.next();

    if(name1.equalsIgnoreCase("stop")){
        System.out.println("You guessed " + counter + " times.");
    break;
    }

    counter++;

    if(name1.equalsIgnoreCase("Emma")){
        System.out.println("Congratulations!");
        System.out.println("You guessed " + counter + " times.");
    break;
    }
}
}
}