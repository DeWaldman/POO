package sono;

public class Man {

	public static void main(String[] args) {
		
		 
		Pessoa p1= new Pessoa();
		p1.nome="jonas";
		Pessoa p2=p1;
		p2.nome="jose";
		Telefone tel= new Telefone();
		tel.ddd=12;
		tel.num=12345;
		p1.telefone=tel;
		p2.telefone=p1.telefone;
		
		Mani objmani = new Mani();
		objmani.alterarNome(p1, "Sanoj");
		
		System.out.println("nome p1:"+p1.nome);
		System.out.println("telefone p1:"+p1.telefone.num);
		

	}

}
