
public class Lampe {
	public int Puissance;
	private boolean estAllum�e;
	public final static int Puissance_defaut = 100 ;

	public void eteindre() {
		this.estAllum�e = false ;
		
	}
	
	public void allumer() {
		this.estAllum�e = true ; 
	}
	
	
	public Lampe(){
		this.Puissance = Puissance_defaut ;
		this.estAllum�e = false ;
	}
	
	public Lampe(int Puissance0){
		this.Puissance = Puissance0 ;
		this.estAllum�e = false ;
	}
	
	
	public int getPuissance () {
		return this.Puissance ;
	}
	
	public void setPuissance (int power) {
		this.Puissance = power ;
	}
	
	public boolean getestAllum�e (){
		return this.estAllum�e ;
	}
	
	
	
	
	
	
}


