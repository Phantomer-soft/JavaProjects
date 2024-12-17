import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		BagliListe l1 = new BagliListe();
		
		while (true)
		{
			System.out.println("1 ) Araç Ekle");
			System.out.println("2 ) Araç Sil");
			System.out.println("3 ) Araçları Listele");
			System.out.println("4 ) Araç Ara");
			System.out.println("0 ) Çıkış");
			System.out.print("Seçiminiz : ");
			int secim = in.nextInt();
			
			if (secim == 1)
			{
				l1.ekle();
			}
			else if (secim == 2)
			{
				l1.sil();
			}
			else if ( secim == 3)
			{
			
				l1.listele();
			}
			else if (secim == 4)
			{
				l1.aracAra();
			}
			else if (secim == 0)
			{
				break;
			}
			else
				System.out.println("Geçersiz Seçim");
			
		}
	}

}
