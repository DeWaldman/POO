package br.com.fatec;
import javax.swing.JOptionPane;
public class Myman {
  public static void main(String[] args) {
	  String txt;
	  Telefone telefone = new Telefone();
	  telefone.numTelefone="12996647420";
	  
	  Aluno a1 = new Aluno("Raphael", telefone, "4815162342");
	  
	  txt = "Nome: "+a1.nome+"\n"
		    +"Telefone: "+a1.telefone.numTelefone+"\n"
		    +"RA: "+a1.RA+"\n";
	  
	  a1.imprimaInfo();
  }
}
