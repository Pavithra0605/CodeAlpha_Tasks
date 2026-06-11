import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     CODEALPHA AI CHATBOT");
        System.out.println("Type 'bye' to exit");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you for asking!");
            }

            else if (input.contains("your name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            }

            else if (input.contains("who are you")) {
                System.out.println("Bot: I am a Java-based AI Chatbot developed for CodeAlpha.");
            }

            else if (input.contains("java")) {
                System.out.println("Bot: Java is a popular object-oriented programming language.");
            }

            else if (input.contains("oop")) {
                System.out.println("Bot: OOP stands for Object-Oriented Programming.");
            }

            else if (input.contains("inheritance")) {
                System.out.println("Bot: Inheritance allows one class to acquire properties of another class.");
            }

            else if (input.contains("polymorphism")) {
                System.out.println("Bot: Polymorphism allows methods to perform different tasks based on the object.");
            }

            else if (input.contains("encapsulation")) {
                System.out.println("Bot: Encapsulation means wrapping data and methods into a single unit.");
            }

            else if (input.contains("abstraction")) {
                System.out.println("Bot: Abstraction hides implementation details and shows only essential features.");
            }

            else if (input.contains("ai")) {
                System.out.println("Bot: AI stands for Artificial Intelligence.");
            }

            else if (input.contains("machine learning")) {
                System.out.println("Bot: Machine Learning enables systems to learn from data and improve automatically.");
            }

            else if (input.contains("nlp")) {
                System.out.println("Bot: NLP stands for Natural Language Processing.");
            }

            else if (input.contains("who created java")) {
                System.out.println("Bot: Java was created by James Gosling.");
            }

            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }

            else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}