public class Counter {
    private int counter;

    //Recebendo a frase para contar as palavras.

    public int counterWords(String phrase){

        if (phrase == null || phrase.trim().isEmpty()) {
            return 0; // Retorna 0 se a frase estiver vazia ou nula
        }

       for(int i=0;i<phrase.length()-1;i++){
           char letter = phrase.charAt(i);

           if((letter == ' ' )){
               setCounter(1);
           }
       }
        return getCounter()+1;
    }

    public void setCounter(int counter){
        this.counter += counter;
    }
    public int getCounter(){
        return this.counter;
    }
}
