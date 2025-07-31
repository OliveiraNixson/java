public class Main {
    public static void main(String[] args) {
      QuizCardBuilder card = new QuizCardBuilder();
      card.go();
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();
    }
}