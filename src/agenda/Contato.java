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

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
   
    public String getTelefone() {
        return this.telefone;
    }

    public void modificaTags(int posicao, String tag){
        this.tag[posicao] = tag;
    }

    public String getTag() {
        String tagsString = "";
        for(int i = 0; i < tag.length; i++){
            if(tag[i] != null){
                tagsString += tag[i] + " ";
            }
        }
        
        return tagsString;
    }
}
