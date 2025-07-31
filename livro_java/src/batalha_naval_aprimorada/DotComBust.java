package batalha_naval_aprimorada;

import java.util.*;


public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();

    private int numOfGuesses = 0 ;

    public void setUpGame(){
        DotCom a = new DotCom();
        a.setName("Pets.com");
        DotCom b = new DotCom();
        b.setName("eToys.com");
        DotCom c = new DotCom();
        c.setName("Go2.com");

        dotComList.add(a);
        dotComList.add(b);
        dotComList.add(c);


        System.out.println("Seu obejetivo é eliminar 3 dot coms");
        System.out.println("Elimine todas com o menor número de jogadas");
        System.out.println("Tente afundar os návios no menor número de tentativas.");

        for (DotCom dotComSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
        }

    }

    public void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.userInput("Insira um Palpite:");
            checkGuess(userGuess);
        }
        finishGame();
    }

    private void checkGuess(String userGuess){
        numOfGuesses++;

        String result = "errado";

        for (DotCom dotComToTest: dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("correto")){
                dotComList.remove(dotComToTest);
                break;
            }
            if (result == "eliminar") {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }


    public  void finishGame(){
        System.out.println("Todas as dot coms foram eliminadas");
        if (numOfGuesses<= 5){
            System.out.printf("Tu usaste %d palpites \n",numOfGuesses);
            System.out.println("\n");
        }else {
            System.out.printf("Demorou de mais: %d palplites\n",numOfGuesses);
            System.out.println("Não haverá pesca com essas opções!");
        }

    }


}
