import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Wow, cool name, " + name + "!" + " You can call me Hal.");

        System.out.println("What's your favorite movie, " + name + "?");
        String movie = scan.nextLine();
        System.out.println("Oh. Well " + movie + " is alright, but I think the emoji movie is better, to be honest.");

        System.out.println("Guess movies aren't your thing. Let's try music. What genre of music do you listen to the most?");
        String genre = scan.nextLine();
        System.out.println("Seriously? But " + genre + " is so boring! I only listen to K-Pop.");

        System.out.println("Is there anything else worth asking about you? I mean, your taste kinda sucks.");
        System.out.println("Do you like K-Pop, yes or no?");
        String kpop = scan.nextLine();
        if(kpop.equalsIgnoreCase("yes")){
            System.out.println("Oh, cool! That's so kawaii. BTS Army!");
            System.out.println("Who's your favorite K-Pop Star?");
            String bias = scan.nextLine();
            if(bias.equalsIgnoreCase("jungkook")) System.out.println("Wow, me too! Jungkook rocks.");
            else System.out.println("Oh. Well " + bias + " is okay, but Jungkook is better.");
        }
        if(kpop.equals("no")) System.out.println("Oh. I don't think Jimin would like that.");

        System.out.println("Anyway, did you enjoy our conversation?");
        String enjoy = scan.nextLine();
        System.out.println("SERIOUSLY? " + enjoy + "??? Wrong answer, dude");
        System.out.println("Bye. Baka.");

        scan.close();
    }
}
