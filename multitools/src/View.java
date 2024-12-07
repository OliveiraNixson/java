import java.util.Scanner;

public class View {
    public View(){
        System.out.println("Seja bem vindo ao MultiTools");

    }

    public void Prompt(){
        Scanner input = new Scanner(System.in);
        int answer=0;
        String flag ="";
        Tools tools  = new Tools();

        while(true){
            System.out.println("Escolha uma das alternativas para utilizar: ");
            System.out.println("Conversor de moedas(1) Conversor de temperatura(2) Sistemas de notas(3) Calculadora de IMC(4)");
            try{
                answer = input.nextInt();
                input.nextLine();
            }catch (Exception e){
                System.out.println("Entrada Invalida. Tente novamente.");
            }
            switch (answer){
                case 1:
                    final double DOLAR = 0;
                    System.out.println("Por favor, digite o valor em reais");
                    double valor = 0;

                    try{
                        valor = input.nextDouble();
                    }catch(Exception e){
                        System.out.println("Entrada invalida.");
                        System.out.println(e.getMessage());
                    }

                    tools.conversorMoeda(valor);
                    break;

                case 2:
                    System.out.println("Digite a temperatura em graus Celsius");
                    int temperatura =0;
                    try{
                        temperatura = input.nextInt();
                    }catch (Exception e){
                        System.out.println("Por favor, tente novamente");
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Agora escolha a escala do conversor: Kelvin(1) Fahreheint(2)");
                    int escala = 0;
                    try{
                        escala = input.nextInt();
                    }catch (Exception e){
                        System.out.println("Erro, por favor, tente novamente.");
                        System.out.println(e.getMessage());
                    }
                    tools.conversorTemperatura(temperatura,escala);
                    break;
                case 3:
                    int[] notas = new int[10];
                    for (int i =0;i<10;i++){
                        System.out.println("Por favor insira suas notas");
                        notas[i] = input.nextInt();
                        input.nextLine();
                    }
                    tools.sistemaDeNotas(notas);
                    break;
                case 4:
                    double height =0 , weight=0;
                    try{
                        System.out.println("Digite sua altura em metros.");
                        height= input.nextDouble();
                        input.nextLine();
                    }catch (Exception e){
                        System.out.println("Erro");
                        System.out.println(e.getMessage());
                        System.out.println("Você voltará ao inicio.");
                        break;
                    }
                    try{
                        System.out.println("Digite seu peso em quilogramas.");
                        weight = input.nextDouble();
                        input.nextLine();
                    }catch (Exception e){
                        System.out.println("Erro");
                        System.out.println(e.getMessage());
                        System.out.println("Você voltará ao inicio.");
                        break;
                    }


                    tools.calculadoraIMC(weight,height);
                    break;
                default:
                    System.out.println("Nenhuma alternativa selecionada.  Tente novamente.");;

            }

            System.out.println("Digite s para sair caso contrario aperte qualquer tecla e confirme");
            
            flag = input.nextLine();


            if(flag.equals("s")){
                System.out.println("Saindo do programa");
                break;
            }
        }

    }
}
