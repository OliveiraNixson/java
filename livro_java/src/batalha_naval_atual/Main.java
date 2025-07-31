package batalha_naval_atual;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random()*5);

        ArrayList<String> locations = null;

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive){
            String guess = helper.getUserInput("Insira um numero");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            System.out.println(result);
            if(result.equals("kill")){
                isAlive = false;
                System.out.printf("Tu usaste %d palpites", numOfGuesses);
            }
        }
    }
}
