package Hierarquiadeclasse;

public class EX1classecachorro extends EX1superclasseanimal{
	
	private String cachorro;
	
	public EX1classecachorro(String nome, String emitesom, String devecorrer,int idade,String sobeemarvore, String cachorro)
	{
		super(nome,emitesom,devecorrer,idade,sobeemarvore);
		this.cachorro=cachorro;
	}

	public String getCachorro() {
		return cachorro;
	}

	public void setCachorro(String cachorro) {
		this.cachorro = cachorro;
	}
	
}
