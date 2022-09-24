package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgertmenKrediManager(),new TarımKrediManager()};
		for(BaseKrediManager krediManager:krediManagers)
		{
			System.out.println(krediManager.hesapla(1000));
		}
		
		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		 * ogretmenKrediManager.Hesapla();
		 */
		
		/*
		 * KrediUI krediUI = new KrediUI(); krediUI.KrediHesapla(new
		 * TarimKrediManager(),new OgretmenKrediManager());
		 */

	}

}
