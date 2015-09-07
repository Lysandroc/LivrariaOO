package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		double livroJava8= 59.90;
		double livroTDD= 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total da soma do estoque é: "+soma);
		if (soma < 150) {
			System.out.println("Seu estoque está no nivel critico, quantidade: "+ soma);
		} else if (soma > 2000)	{
			System.out.println("Seu estoque está no nivel alto, quantidade: "+ soma);
		}	else {
			System.out.println("Seu estoque está no nivel, quantidade: "+soma);
		}
	}
}
