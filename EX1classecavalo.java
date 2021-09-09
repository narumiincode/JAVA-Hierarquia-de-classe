package Hierarquiadeclasse;

public class EX1classecavalo extends EX1superclasseanimal{
	
	private String cavalo;
	
	public EX1classecavalo(String nome, String emitesom, String devecorrer,int idade,String sobeemarvore, String cavalo)
	{
		super(nome,emitesom,devecorrer,idade,sobeemarvore);
		this.cavalo=cavalo;
	}

	public String getCavalo() {
		return cavalo;
	}

	public void setCavalo(String cavalo) {
		this.cavalo = cavalo;
	}

}
