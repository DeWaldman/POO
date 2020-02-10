package br.com.fatec;
import javax.swing.JOptionPane;
public class Oscar {

	public static void main(String[] args) {
		
		Elenco elenco=new Elenco();
		elenco.nomes[0]="a";
		elenco.nomes[1]="b";
		elenco.nomes[2]="c";
	
		Filme filme1 = new Filme(JOptionPane.showInputDialog("Nome: "), 
				JOptionPane.showInputDialog("Genero: "),
				JOptionPane.showInputDialog("Origem: "),
				elenco);
		//filme1.nome = "Jojo Rabbit";
		//filme1.genero = "Comedia";
		//filme1.origem = "Estados Unidos";
		
		
		
		String texto = "Nome: " + filme1.nome + "\n"
	              +"Genero: " + filme1.genero + "\n"
	              +"Origem: " + filme1.origem+"\nelenco: \n"+elenco.nomes[0]+"\n"+elenco.nomes[1]+"\n"+elenco.nomes[2];
		
		JOptionPane.showMessageDialog(null, "E o oscar vai para...\n"+texto,"O S C A R",JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
/*ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE,or PLAIN_MESSAGE*/