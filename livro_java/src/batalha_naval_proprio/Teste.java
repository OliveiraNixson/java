package batalha_naval_proprio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        int validador = 0;

        Scanner scan = new Scanner(System.in);

        BattleField battle = new BattleField();

        battle.posicaoNavio();

        while (validador < 8){
            System.out.println("Tu tens "+(8 - validador)+" chances.");
            System.out.println("Digite um palpite para o lugar do navio:");
            battle.afundarNavio(scan.nextInt());
            validador++;
            if (battle.getState() == "Afundado"){
                break;
            }
        }
        //System.out.println("Tu atingiste um "+ battle.getState().getCodigo());
        System.out.println(battle.getState());

    }
}
