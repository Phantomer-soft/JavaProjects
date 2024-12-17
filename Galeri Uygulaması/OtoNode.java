
public class OtoNode
{
	String plaka;
	String marka;
	String model;
	String renk;
	int alisFiyati;
	int satisFiyati;
	String aciklama;
	OtoNode next;
	public OtoNode(String plaka, String marka, String model, String renk, int alisFiyati, String aciklama) {
		
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.alisFiyati = alisFiyati;
		this.satisFiyati = alisFiyati*12/10;
		this.aciklama = aciklama;
		next = null;
	}
	
	
	
	
	
	
}
