package batalha_naval_proprio;

public class BattleField {
    /* Cria o campo de batalha e as formas de como afundar umas das embarcações*/

    private char[] field = new char[10];
    private int position;
    private String state;
    private Ships classe;
    private int hit ;
    private int input;


    public void posicaoNavio() {

        input = (int) (Math.random() * 3);

        switch (input) {

            case 0:
                position = (int) (Math.random() * 6);
                for (int i = position; i < position + 4; i++) {
                    field[i] = 'x';
                }
                //this.classe = Ships.PA;


                break;

            case 1:
                position = (int) (Math.random() * 7);
                for (int i = position; i < position + 3; i++) {
                    field[i] = 'x';
                }
                //classe = Ships.NT;

                break;

            case 2:
                position = (int) (Math.random() * 8);
                for (int i = position; i < position + 2; i++) {
                    field[i] = 'x';
                }
               // classe = Ships.CT;

                break;

            case 3:
                position = (int) (Math.random() * 9);
                for (int i = position; i < position + 1; i++) {
                    field[i] = 'x';
                }
                //classe = Ships.SM;
                break;
        }
    }


    public void afundarNavio(int positionField){

            if (field[positionField] == 'x'){
                System.out.println("Navio atingido!");
                field[positionField] = 'O';
                hit++;
                this.setState();
            }else if (field[positionField]=='O'){
                System.out.println("Parte ja atingida!");

            } else {
                System.out.println("Tiro no mar!");
            }


    }



    public void setState(){
        if (hit == position ){
            this.state = "Afundado";
        }else {
            this.state = "Ainda ativo";
        }
    }

    public String getState() {
        return state;
    }

    public int getHit() {
        return hit;
    }
    public Ships getClasse() {
        return classe;
    }
}


