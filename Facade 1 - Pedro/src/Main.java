
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.println("Selecione seu combo");
		System.out.println("1. Combinho");
		System.out.println("2. Combo");
		System.out.println("3. Combão");
		System.out.print("Sua escolha: ");
		
		Scanner input = new Scanner(System.in);
		
		int tipo = input.nextInt();
		Combo combo = new Combo();
		combo.CriarCombo(tipo);
		combo.ExibirCombo(tipo);
		System.out.println(combo);
		}
	}

