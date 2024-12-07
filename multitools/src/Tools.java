

public class Tools {

    public void calculadoraIMC(double peso, double altura){
        double imc = peso/(altura*altura);
        if(imc<18.5){
            System.out.println("Seu IMC eh: "+imc+" e você está abaixo do peso");
        }else if(imc<24.9){
            System.out.println("Seu IMC eh: "+imc+" e você está no seu peso ideal");
        }else if(imc < 29.9){
            System.out.println("Seu IMC eh: "+imc+" e você está acima do peso");
        }else if(imc <34.9){
            System.out.println("Seu IMC eh: "+imc+" e você está acima do peso com certo graud de obesidade");
        }else{
            System.out.println("Seu IMC eh: "+imc+" e você está muito gordo.");
        }
    }
    public void conversorMoeda(double valor){

        double valorConvertido = valor*6.10;

        System.out.println("Atualmente "+ valor +" real(is) vale "+valorConvertido+" dolares.");

    }
    public void conversorTemperatura(double temperatura, int escala){
        if(escala==2){
            double tf = (temperatura-32)/9;
            System.out.println("A temperatura em graus Fareheint eh "+tf);
        }else if(escala==1){
            double tk = temperatura + 273;
            System.out.println("A temperatura em graus Fareheint eh "+tk);
        }else{
            System.out.println("Nenhuma escala foi selecionada");
        }
    }
    public void sistemaDeNotas(int[] notas){
        int soma = 0;
        for(int nota: notas){
            int i =0;
            System.out.println("Digite sua nota "+i);
            soma += nota;
            i++;
        }
        int media = soma/notas.length;
        System.out.println("Sua media eh : "+media);
    }
}
