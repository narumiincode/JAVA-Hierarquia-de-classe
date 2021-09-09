package Hierarquiadeclasse;

public class EX1objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EX1classecachorro xxx = new EX1classecachorro("Tião","latido", "corre",52,"não sobe em árvores","cachorro");
		EX1classecavalo yyy = new EX1classecavalo("pocotó","relinxo","corre", 12,"não sobe em árvores","cavalo");
		EX1classepreguiça zzz =new EX1classepreguiça("presidente","indefinido","não corre",65,"sobe em árvores","preguica");
	System.out.println(xxx.getNome());
	System.out.println(yyy.getIdade());
	System.out.println(zzz.getDevecorrer());
	}
}
