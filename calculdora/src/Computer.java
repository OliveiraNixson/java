import java.sql.SQLOutput;
import java.util.Scanner;

public class Computer {
    boolean flag = true;
    double memory = 0.0;

    double a,b,answer= 0;
    Scanner input = new Scanner(System.in);
    Calculator calculator = new Calculator();

    String respota = "";

    public Computer(){
        System.out.println("Seja bem vindo!");
        while(flag){

            System.out.println("Escolha a operação:");
            System.out.println("Somar(1), Subtrair(2), Multiplicar(3), Dividir(4), Quadrado(5), Resto(6)");
            int switcher = input.nextInt();
            if (switcher==5){
                if(memory==0.0){
                    System.out.println("Digite o numero");
                    a = input.nextDouble();
                    answer = calculator.quadrado(a);
                    System.out.println(answer);
                }else{
                    answer = calculator.quadrado(memory);
                    System.out.println(answer);
                }
            }else{



                if (memory==0) {
                    System.out.println("Digite dois numeros:");
                    a = input.nextDouble();
                }else{
                    System.out.println("Digite um numero:");
                    a = answer;
                }
                b = input.nextDouble();

                switch (switcher){
                    case 1:{

                        answer = calculator.somar(a,b);
                        System.out.println(answer);
                    }
                    break;
                    case 2:{
                        answer = calculator.subtrair(a,b);
                        System.out.println(answer);
                    }
                    break;
                    case 3:{
                        answer = calculator.multiplicar(a,b);
                        System.out.println(answer);
                    }
                    break;
                    case 4:{
                        answer = calculator.dividir(a,b);
                        System.out.println(answer);
                    }
                    break;
                    case 6:{
                        answer = calculator.resto(a,b);
                        System.out.println(answer);
                    }
                    break;
                    default:{
                        System.out.println("Nenhuma opção escolhida");
                    }

                }
            }
            input.nextLine();
            System.out.println("Quer continuar nessa operação? Y/N");
            respota = input.nextLine();
            if(respota.equalsIgnoreCase("Y")){
                memory = answer;
            }else{
                flag = false;
            }

        }
    }





}
