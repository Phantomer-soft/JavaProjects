import java.util.Scanner;

public class BagliListe       // TEK YÖNLÜ DAİRESEL LİSTE
{	Scanner in = new Scanner (System.in);
	OtoNode head = null;
	OtoNode tail = null;
	
	String plaka;
	String marka;
	String model;
	String renk;
	int alisFiyati;
	int satisFiyati;
	String aciklama;
	
	void ekle()
	{
		System.out.println("Galeriye Eklenecek Aracın Bilgilerini Girin  ");
		System.out.print("Marka : ");
		marka = in.next();
		System.out.print("Model : ");
		model = in.next();
		System.out.print("Plaka : ");
		plaka = in.next();
		System.out.print("Renk : ");
		renk = in.next();
		System.out.print("Alış Fiyatı : ");
		alisFiyati = in.nextInt();
		System.out.println("Açıklama : ");
		aciklama = in.next();
		
		OtoNode arac = new OtoNode(plaka, marka, model, renk, alisFiyati, aciklama);
		
		if(head == null)
		{
			System.out.println(plaka+" "+"Plakalı Araç Galeriye Eklendi");
			head = arac;
			tail = arac;
			tail.next = head;
		}
		
		else
		{
			System.out.println(plaka+" "+"Plakalı Araç Galeriye Eklendi");
			arac.next = head;
			head = arac;
			tail.next = head;
			
		}
		
	}
	
	void sil()
	{
	    if (head == null)
	    {
	        System.out.println("Silinecek Araç Yok");
	        return;
	    }

	    System.out.print("Lütfen Satılan Araç Plakasını Girin: ");
	    String plaka = in.next();

	    OtoNode temp = head;

	  
	    if (head == tail && head.plaka.equalsIgnoreCase(plaka)) 
	    {
	        System.out.println(plaka + " Plakalı Araç Galeriden Silindi");
	        System.out.println("Satış Fiyatı: " + head.satisFiyati);
	        head = null;
	        tail = null;
	        return;
	    }

	    
	    if (head.plaka.equalsIgnoreCase(plaka))
	    {
	        System.out.println(plaka + " Plakalı Araç Galeriden Silindi");
	        System.out.println("Satış Fiyatı: " + head.satisFiyati);
	        head = head.next;
	        tail.next = head; 
	        return;
	    }

	    
	    while (temp.next != head) 
	    {
	        if (temp.next.plaka.equalsIgnoreCase(plaka)) 
	        {
	            System.out.println(plaka + " Plakalı Araç Galeriden Silindi");
	            System.out.println("Satış Fiyatı: " + temp.next.satisFiyati);

	            
	            if (temp.next == tail) 
	            {
	                tail = temp; 
	            }
	            temp.next = temp.next.next; 
	            return;
	        }
	        temp = temp.next;
	    }

	    
	    System.out.println(plaka + " Plakalı Araç Bulunamadı");
	}

	
	void listele()
	{
		if(head == null)
		{
			System.out.println("Galeri Boş");
		}
		else
		{
		OtoNode temp = head;
		while(temp != tail)
		{
			System.out.println("Plaka : "+temp.plaka);
			System.out.println("Marka : "+temp.marka);
			System.out.println("Model : "+temp.model);
			System.out.println("Alış Fiyatı : "+temp.alisFiyati);
			System.out.println("Açıklama : "+temp.aciklama);
			temp = temp.next;
		}
		if(head != null)
		{
		System.out.println("Plaka : "+tail.plaka);
		System.out.println("Marka : "+tail.marka);
		System.out.println("Model : "+tail.model);
		System.out.println("Alış Fiyatı : "+tail.alisFiyati);
		System.out.println("Açıklama : "+tail.aciklama);
		}
		}
	}

	void aracAra()
	{
	    if (head == null) 
	    { 
	        System.out.println("Galeride Araç Bulunmamakta");
	        return;
	    }

	    System.out.print("Lütfen Araç Plakası Girin : ");
	    String plaka = in.next();
	    OtoNode temp = head;
	    boolean bulundu = false;

	    do
	    {
	        if (temp.plaka.equals(plaka))
	        { 
	            System.out.println("Plaka       : " + temp.plaka);
	            System.out.println("Marka       : " + temp.marka);
	            System.out.println("Model       : " + temp.model);
	            System.out.println("Alış Fiyatı : " + temp.alisFiyati);
	            System.out.println("Açıklama    : " + temp.aciklama);
	            bulundu = true;
	            break; 
	        }
	        temp = temp.next;
	    } while (temp != head); 

	    if (!bulundu)
	    { 
	    		System.out.println("Bu plakaya ait araç bulunamadı.");
	    }
	}

	
	
	
	
	
	
	
	
	
	
}
