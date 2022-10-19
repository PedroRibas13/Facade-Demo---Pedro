public class Combo {
	private burguer b;
	private sobremesa s;
	private bebida m;
	public void CriarCombo(int tipo) {
		if(tipo == 1) {
			b = new burguer();
			b.preco = 25;
			b.descricao = "Lanche 1";
			b.setGramas(60);
			
			s = new sobremesa();
			s.preco = 15;
			s.descricao = "Sobremesa 1";
			s.setTamanho("P");
			
			m = new bebida();
			m.preco = 10;
			m.descricao = "Bebida 1";
			m.setMl(100);
		}
		
		if(tipo == 2) {
			b = new burguer();
			b.preco = 25;
			b.descricao = "Lanche 2";
			b.setGramas(80);
			
			s = new sobremesa();
			s.preco = 25;
			s.descricao = "Sobremesa 2";
			s.setTamanho("M");
			
			m = new bebida();
			m.preco = 15;
			m.descricao = "Bebida 3";
			m.setMl(250);
		}
		
		if(tipo == 3) {
			b = new burguer();
			b.preco = 45;
			b.descricao = "Lanche 3";
			b.setGramas(165);
			
			s = new sobremesa();
			s.preco = 30;
			s.descricao = "Sobremesa 3";
			s.setTamanho("G");
			
			m = new bebida();
			m.preco = 0;
			m.descricao = "Bebida 3";
			m.setMl(500);
		}
	}
	public void ExibirCombo(int tipo) {
		System.out.println(b.descricao + " - " + b.getGramas() + "g");
		System.out.println(s.descricao + " - Tam. " + s.getTamanho());
		System.out.println(m.descricao + " - " + m.getMl() +" ml");
		System.out.println("Total a pagar: " + (b.preco + s.preco + m.preco));
	};
}
