package gameplay;

import java.util.Random;

public class Player {

    public Player(){
        this.setNum(0);
        this.guess();
    }
    Random input1 = new Random();
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void guess(){
        num = input1.nextInt(5);
    }
}
