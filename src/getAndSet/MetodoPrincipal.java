package getAndSet;

import java.util.Scanner;

public class MetodoPrincipal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Carro fusca = new Carro();
		
		// Declaracao de variaveis
		String receberMarcaUsuario;
		String receberModeloUsuario;
		
		System.out.print("Digite a marca do seu carro: ");
		receberMarcaUsuario = teclado.next();
		
		// metodos classe carro para marca
		fusca.setMarca(receberMarcaUsuario);
		fusca.getMarca();
		
		System.out.print("Digite o modelo do seu carro: ");
		receberModeloUsuario = teclado.next();
		
		// metodos classe carro para modelo
		fusca.setModelo(receberModeloUsuario);
		fusca.getModelo();
		
		fusca.imprimirModeloMarca();
		
	}
}
