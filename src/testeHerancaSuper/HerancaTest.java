package testeHerancaSuper;

public class HerancaTest {
	
	private String nome;
	private int idade;

	HerancaTest(){
		System.out.println("teste");
	}
	
	HerancaTest(String nome, int idade){
		
		this.nome = nome;
		this.idade = idade;
		
		System.out.println(this.nome +" "+ this.idade);
	}
	
}
