import java.util.Random;
public class KeyGenerator {

    public KeyGenerator() {
        System.out.println("Aqui esta sua senha.");
    }

    Random rand = new Random();
    String lMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lMin =  "abcdefghijklmnopqrstuvwxyz";
    String numeros = "0123456789";
    String simbolos = "!@#$%^&*()";


    //Metodos privados

    public String gerarSenha(int length,boolean bL,boolean sL,boolean number,boolean symbols){

        StringBuilder senha = new StringBuilder(length);
        StringBuilder caracteresPermitidos = new StringBuilder();



                if(bL){


                    senha.append(lMai.charAt(rand.nextInt(lMai.length())));
                    caracteresPermitidos.append(lMai);

                }
                if(sL){



                    senha.append(lMin.charAt(rand.nextInt(lMin.length())));
                    caracteresPermitidos.append(lMin);

                }
                if(number){



                    senha.append(numeros.charAt(rand.nextInt(numeros.length())));
                    caracteresPermitidos.append(numeros);

                }
                if(symbols){


                    senha.append(simbolos.charAt(rand.nextInt(simbolos.length())));
                    caracteresPermitidos.append(simbolos);

                }
                if(caracteresPermitidos.length()==0){
                    return "Nenhuma categoria de caractere foi selecioinada";
                }
                while(senha.length()<length){
                    int posicao = rand.nextInt(caracteresPermitidos.length());
                    senha.append(caracteresPermitidos.charAt(posicao));
                }



        return embaralharSenha(senha.toString());

    }
    private String embaralharSenha(String senha) {
        char[] caracteres = senha.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int j = rand.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        return new String(caracteres);
    }




}
