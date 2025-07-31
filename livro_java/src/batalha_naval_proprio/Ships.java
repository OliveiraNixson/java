package batalha_naval_proprio;

public enum Ships {
    PA("Porta-Avioes"),NT("Navio-Tanque"),CT("Contra-Torpedeiro"),SM("Submarino");
    private String nome;
    Ships(String nome){
        this.nome = nome;
    }

    public String getCodigo(){
        return nome;
    }
}
