package d_heranca;
/*
 * Um Colega 
 *    tem nome, email, idade
 */
public class Colega {
	private String nome;
	private String email;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "Nome: " + nome + " E-mail: " + email + " Idade: " + idade;
	}
}
