

public class Main {
    public static void main(String[] args) {

        Lutador[] fighter = new Lutador[3];
        fighter[0] = new Lutador("Boy","Brasil",25,1.90,70.0, 16,3,8);
        fighter[1] = new Lutador("Gaiato","Peru",35,1.68,60.6, 13,5,6);
        fighter[2] = new Lutador("Aranha","Bolivia",27,1.70,67.0, 0,5,1);


        Luta luta = new Luta();

        luta.marcarLuta(fighter[1],fighter[2]);

        luta.lutar(fighter[1],fighter[2]);


    }
}