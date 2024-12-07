import java.util.Scanner;

public class Display {
    //atributos
    public String phrase = "";
    int number = 0;

    //metodo construtor
    public Display(){
    System.out.println("Seja bem vindo!");


    }

    public void view(){
        Scanner input = new Scanner(System.in);
        Counter counter = new Counter();

        while(true){
            //entrada e verificação de erro
            System.out.println("Por favor insira a frase para contarmos as palavras:");
            try{
                phrase = input.nextLine();
            }catch (Exception e){
                System.out.println("Entrada invalida. Tente novamente ou digite 'sair'.");
                continue;
            }
            if(phrase.equals("sair")){
                System.out.println("Saindo do sistema");
                break;
            }
            if(!phrase.isEmpty()){
                number = counter.counterWords(phrase);
                System.out.println("O numero de palavras digitadas eh: "+number);

            }


        }

        input.close();


    }
}
