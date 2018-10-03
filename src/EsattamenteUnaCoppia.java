
public class EsattamenteUnaCoppia 
{
	public static void main (String[]args) 
	{
		int [] vett = new int [10];
		
		RiempimentoDiUnArrayDi10ConRandom (vett);
		
		EsattamenteUnaCoppia (vett);
		
		StampaVettore (vett);
		
	}
	
	public static void RiempimentoDiUnArrayDi10ConRandom (int [] vet) 
	{
		for (int i = 0; i < vet.length; i ++)
			vet[i] = (int) (Math.random() * 101);	
	}
	public static void StampaVettore (int [] vet) 
	{
		for(int i = 0; i < vet.length; i ++)
			if (i + 1 < vet.length)
				System.out.print(vet[i] + ", ");
			else
				System.out.println(vet[i] + ".");
	}
	public static void EsattamenteUnaCoppia (int [] vet) 
	{
		int coppie = 0;
		for (int i = 0; i < (vet.length); i ++)
			for (int j = 0; j < vet.length; j ++)
				if (vet[i] != vet[j])
					if (vet[i] == vet[j])
						coppie = coppie + 1;
		if (coppie == 1)
			System.out.println("Esattamente una coppia");
	}
}