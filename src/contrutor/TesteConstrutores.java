package contrutor;

public class TesteConstrutores {

	private int idade;
	
	public TesteConstrutores(int idade){
		System.out.println("Classe teste foi instanciada!");
		System.out.print("Sua idade é: ");
	}
	
	public int getIdade() {
		
		System.out.println(this.idade);
		return this.idade;
	}
	
	public void setIdade(int idade) {
		
		this.idade = idade;
	}
	
}
