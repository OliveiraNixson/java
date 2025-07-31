

import com.sun.security.jgss.GSSUtil;

public class Lutador {

    //atributos
    private String nome;
    private String pais;
    private int idade;
    private double alt;
    private double peso;
    private String cat;
    private int vit;
    private int der;
    private int emp;

    //metodos getters,setters e constuctor


    public Lutador(String nome,String pais,int idade,double alt, double peso,int vit,int der,int emp){
        this.nome=nome;
        this.pais=pais;
        this.idade=idade;
        this.alt=alt;
        this.setPeso(peso);
        this.vit=vit;
        this.der=der;
        this.emp=emp;



    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCat();


    }
    public String getCat() {
        return cat;
    }

    public void setCat() {
        if(this.peso<52.2){
            this.cat="Inavalido";
        }else if(this.peso>52.2 && this.peso<70.3){
            this.cat="Peso leve";
        }else if(this.peso<83.9){
            this.cat="Peso medio";
        }else{
            this.cat="Peso Pesado";
        }
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDer() {
        return der;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    public void setDer(int der) {
        this.der = der;
    }

    //metodos especiais ---------------------------------

    public void apresentar(){
        System.out.println("Chegou a hora da onça beber água!!!");
        System.out.println("Eu vos apresento o desafiante " + this.getNome());
    }
    public void status(){
        System.out.println(this.getNome()+" tem um peso de "+ this.getPeso()+" e pertence a categoria  "+this.getCat());
        System.out.println("Ganhou: "+this.getVit());
        System.out.println("Perdeu: "+this.getDer());
        System.out.println("Empatou: "+this.getEmp());
        System.out.println("-----------------------------------------------");


    }
    public void ganharLuta(){
        setVit(getVit()+1);

    }
    public void perderLuta(){
        setDer(getDer()+1);

    }
    public void empatarLuta(){
        setEmp(getEmp()+1);
    }
}
