
import java.util.Scanner;
import java.util.Random;

public class Luta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;

    private boolean aprovado = false;

    Scanner input = new Scanner(System.in);
    Random gerador = new Random();

    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1!=l2 && l1.getPeso()>55.0 && l2.getPeso()>55.0 && l1.getCat()== l2.getCat()){
            this.desafiante=l1;
            this.desafiado=l2;

            System.out.println("A luta entre "+ this.desafiante.getNome()+" e "+ this.desafiado.getNome()+ " foi marcada!");
            this.aprovado = true;
            desafiante.status();
            desafiado.status();
        }else{
            System.out.println("A luta não pode acontecer.");
        }

    }
    public void lutar(Lutador l1, Lutador l2){

        if (aprovado) {
            this.desafiante = l1;
            this.desafiado = l2;
            this.rounds = 0;

            rounds = gerador.nextInt(12);

            switch (gerador.nextInt(3)){
                case 0:{
                    System.out.println("O desafiante venceu a luta em "+rounds+" rounds");
                    l1.setVit(l1.getVit()+1);
                    l2.setDer(l2.getVit()+1);
                    l1.status();
                    break;
                }
                case 1:{
                    System.out.println("O desafiado venceu a luta em "+rounds+" rounds");
                    l2.setVit(l2.getVit()+1);
                    l1.setDer(l1.getVit()+1);
                    l2.status();
                    break;
                }
                case 2:{
                    System.out.println("A luta terminou empatada em "+rounds+" rounds");
                    l1.setEmp(l1.getEmp()+1);
                    l2.setEmp(l2.getEmp()+1);
                    l1.status();
                    l2.status();

                    break;
                }
            }

        }

        }
    }

