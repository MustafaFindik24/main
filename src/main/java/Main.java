public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my maven project");
        System.out.println(checkIfInputIsAnEvenNumber(123));
    }
    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}
