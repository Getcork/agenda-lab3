package agenda;

public class Contato {
    

    private String nome;
	private String sobrenome;
	private String telefone;
    private String[] tag = new String[5];
    
    public Contato(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public Contato(String nome, String sobrenome, String telefone, String[] tag){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.tag = tag;
    }

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String[] getTags(){
        return this.tag;
    }
}
