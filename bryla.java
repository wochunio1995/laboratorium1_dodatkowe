package zad1_dodatkowe;

public class bryla extends punkt {
	
	
	public static double œrodekMasyX(punkt tablica[])
	 {
		double mx=0;
		double x=0;
		double M=0;
		for (int i= 0; i< tablica.length; i++){
			mx = mx + tablica[i].getMasa()*tablica[i].getodlegloscX();
			M = M + tablica[i].getMasa();
		}
		x=mx/M;
	 return x;
	 }
	public static double œrodekMasyY(punkt tablica[])
	  {
		double my=0;
		double y=0;
		double M=0;
		for (int i= 0; i< tablica.length; i++){
			my = my + tablica[i].getMasa()*tablica[i].getodlegloscY();
			M = M + tablica[i].getMasa();
		}
		y=my/M;
	  return y;
	 }
	public static double œrodekMasyZ(punkt tablica[])
	  {
		double mz=0;
		double z=0;
		double M=0;
		for (int i= 0; i< tablica.length; i++){
			mz = mz + tablica[i].getMasa()*tablica[i].getodlegloscZ();
			M = M + tablica[i].getMasa();
		}
		z=mz/M;
	  return z;
	 }
		
	public static double momentWzgledemX(punkt tablica[]){
		double moment = 0;

		for (int i= 0; i< tablica.length; i++){
		double a= tablica[i].getodlegloscY()-bryla.œrodekMasyY(tablica);
		double b= tablica[i].getodlegloscZ()-bryla.œrodekMasyZ(tablica);		
	    double c = Math.sqrt(a*a+b*b);
	    moment=moment+ tablica[i].getMasa()*c*c;
		}
		return moment;
	}
	public static double momentWzgledemY(punkt tablica[]){
		double moment = 0;

		for (int i= 0; i< tablica.length; i++){
		double a= tablica[i].getodlegloscX()-bryla.œrodekMasyX(tablica);
		double b= tablica[i].getodlegloscZ()-bryla.œrodekMasyZ(tablica);		
	    double c = Math.sqrt(a*a+b*b);
	    moment=moment+ tablica[i].getMasa()*c*c;
		}
		return moment;
	}	
	public static double momentWzgledemZ(punkt tablica[]){
		double moment = 0;

		for (int i= 0; i< tablica.length; i++){
		double a= tablica[i].getodlegloscX()-bryla.œrodekMasyX(tablica);
		double b= tablica[i].getodlegloscY()-bryla.œrodekMasyY(tablica);		
	    double c = Math.sqrt(a*a+b*b);
	    moment=moment+ tablica[i].getMasa()*c*c;
		}
		return moment;
	}	
}
