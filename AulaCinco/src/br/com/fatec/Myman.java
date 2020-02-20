package br.com.fatec;
public class Myman {
  public static void main(String[] args) {
	  Pessoa[] vetor= new Pessoa [3];
	  Telefone telefone = new Telefone();
	  telefone.numTelefone="12996647420";
	  
	  Pessoa a1 = new Aluno("Raphael", telefone, "4815162342");
	  Pessoa p1 = new Professor("Gerson", telefone, "POO");
	  Pessoa s1 = new Secretario("Erick", telefone, "8h00 - 15h00");
	  vetor[0] = a1;
	  vetor[1] = p1;
	  vetor[2] = s1;
	  
	  for(Pessoa i:vetor) {
		  System.out.println(i.getClass());
		  if(i instanceof Professor) {
		    Professor pf = (Professor) i;
			pf.exclusivoProfessor();
		  }
		  else {
		    i.imprimaInfo();
		    i.imprimaInfo();
		  }
	  }
	  
	  
  }
}
