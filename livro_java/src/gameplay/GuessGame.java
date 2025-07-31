package gameplay;

import java.util.Random;

public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();


    int num;

    Random input = new Random();

    public void startGame(){
        num = (int) (Math.random()*5);
        if(p1.getNum() == num){
            System.out.println("P1 escolheu "+p1.getNum()+" e acertou.");
            System.out.println("P2 escolheu "+p2.getNum());
            System.out.println("P3 escolheu "+p3.getNum());

        } else if (p2.getNum() == num) {
            System.out.println("P2 escolheu "+p2.getNum()+" e acertou.");
            System.out.println("P1 escolheu "+p1.getNum());
            System.out.println("P3 escolheu "+p3.getNum());
        }else if(p3.getNum() == num){
            System.out.println("P3 escolheu "+p3.getNum()+" e acertou.");
            System.out.println("P2 escolheu "+p2.getNum());
            System.out.println("P1 escolheu "+p1.getNum());
        }else {
            System.out.println("Ninguem acertou");
        }
    }
}
