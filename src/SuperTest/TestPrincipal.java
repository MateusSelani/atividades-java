package SuperTest;

public class TestPrincipal {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setNomePessoa("Jão");
		System.out.println(aluno.getNomePessoa());

	}

}
