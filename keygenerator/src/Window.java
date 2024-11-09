import java.util.InputMismatchException;
import java.util.Scanner;

public class Window {
    boolean bLetter,sLetter,number,symbols,flagInput =true, flag= true;
    int length = 0;
    Scanner input = new Scanner(System.in);
    KeyGenerator key = new KeyGenerator();


    public Window(){
        while(flag){
            flagInput = true;
            try{
                System.out.println("Qual o tamanho da senha?");
                length = input.nextInt();
                System.out.println("Incluir letras maiusculas?");
                bLetter = input.nextBoolean();
                System.out.println("Incluir letras minusculas?");
                sLetter = input.nextBoolean();
                System.out.println("Incluir numeros?");
                number = input.nextBoolean();
                System.out.println("Incluir simbolos especiais?");
                symbols = input.nextBoolean();
            }catch(ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
                input.nextLine();
                flagInput = false;

            }catch(InputMismatchException e){
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                flagInput = false;
            } catch (Exception e){
                System.out.println("Erro");
                flagInput = false;

            }
                  // O bloco finally é executado independentemente de erros
                System.out.println("Scanner fechado.");
                if(flagInput){
                    System.out.println("Senha gerada: "+key.gerarSenha(length,bLetter,sLetter,number,symbols));
                    flag = false;




            }

        }
        input.close();
    }
}
