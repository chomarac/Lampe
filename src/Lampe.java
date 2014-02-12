
public class Lampe {
	public int Puissance;
	private boolean estAllumée;
	public final static int Puissance_defaut = 100 ;

	public void eteindre() {
		this.estAllumée = false ;
		
	}
	
	public void allumer() {
		this.estAllumée = true ; 
	}
	
	
	public Lampe(){
		this.Puissance = Puissance_defaut ;
		this.estAllumée = false ;
	}
	
	public Lampe(int Puissance0){
		this.Puissance = Puissance0 ;
		this.estAllumée = false ;
	}
	
	
	public int getPuissance () {
		return this.Puissance ;
	}
	
	public void setPuissance (int power) {
		this.Puissance = power ;
	}
	
	public boolean getestAllumée (){
		return this.estAllumée ;
	}
	
	
	
	
	
	
}


