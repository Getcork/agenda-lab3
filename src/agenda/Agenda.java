package agenda;


/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazareno
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	
	private Contato[] contatos;
	private String[] favoritos = new String[10];


	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return O array de contatos.
	 */
	public String[] getContatos() {
		String[] retorno = new String[TAMANHO_AGENDA];
		for(int i = 0; i < TAMANHO_AGENDA; i++){
			if(contatos[i] != null){
				retorno[i] = String.valueOf(contatos[i].getNome() +" "+ contatos[i].getSobrenome());
			}
		}
		
		return retorno;
	}

	/**
	 * Acessa os dados de um contato específico.
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public String getContato(int posicao) {
		for(int i = 0;i < favoritos.length; i++){
			if(favoritos[i] != null){
				if(favoritos[i].contains(contatos[posicao].nomeCompleto())){
				return "❤ " + contatos[posicao].nomeCompleto() + "\n" + contatos[posicao].getTelefone();			
				}			
			}
		}
		if(contatos[posicao] == null){
			return "POSIÇÃO INVÁLIDA";	
		}

		return contatos[posicao].nomeCompleto() + "\n" + contatos[posicao].getTelefone();
	}
	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	 public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		for(int i = 0; i < TAMANHO_AGENDA; i++){
			if(contatos[i] != null && contatos[i].getSobrenome() != null){
				if(contatos[i].getNome().equals(nome) && contatos[i].getSobrenome().equals(sobrenome)){
					System.out.println("\nCONTATO JÁ CADASTRADO");
					return;
				}
			}
			
		}

		contatos[posicao] = new Contato(nome, sobrenome, telefone);
	} 

	public String[] getFavoritos() {
		return this.favoritos.clone();
	}

	public void adicionaFavorito(int posicaoFav, int posicaoContato){
		for(int i = 0; i < 10; i++){
			if(this.favoritos[i] != null){
				if(this.favoritos[i].equals(this.contatos[posicaoContato].getNome() + " " + this.contatos[posicaoContato].getSobrenome())){
					System.out.println("\nCONTATO JÁ FAVORITADO");
					return;
				}
			}
		}
		
		this.favoritos[posicaoFav] = this.contatos[posicaoContato].getNome() + " " + this.contatos[posicaoContato].getSobrenome();
		
		System.out.println("\nCONTATO FAVORITADO NA POSIÇÃO " + posicaoFav);
	}

	public void adicionarTags(String nome, int posicao, String contatos){
		String[] contatosSplit = contatos.split(" ");
		
		int numeroConvertido;
		for(int i = 0; i < contatosSplit.length; i++){
			numeroConvertido = Integer.parseInt(contatosSplit[i]);
		}
	}

	public void removeContato(int posicao){
		for(int i = 0; i < favoritos.length; i++){
			if(favoritos[i] != null){
				if(favoritos[i].equals(contatos[posicao])){
					favoritos[i] = null;
				}
			}	
		}
		
		if(contatos[posicao] != null){
			contatos[posicao] = null;
		}else{
			System.out.println("POSIÇÃO INVÁLIDA");
		}

	}
	}

