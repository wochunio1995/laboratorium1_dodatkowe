package zad1_dodatkowe;

public class glowna {

		public static void main(String[] args){

			punkt[] tablica= new punkt[8];
			
			for (int i= 0; i< tablica.length; i++){
				tablica[i] = new punkt(i,5,20,0);
			
			}
			tablica[2].setodlegloscX(100);
			tablica[5].setodlegloscX(80);
			
			tablica[2].setodlegloscY(200);
			tablica[5].setodlegloscY(150);
		 	
			tablica[2].setodlegloscZ(0);
			tablica[5].setodlegloscZ(70);
			
		System.out.println("Odleg³oœæ od osi X od œrodka masy " +bryla.œrodekMasyX(tablica));
		System.out.println("Odleg³oœæ od osi Y od œrodka masy " +bryla.œrodekMasyY(tablica));
		System.out.println("Odleg³oœæ od osi Z  od œrodka masy " +bryla.œrodekMasyZ(tablica));
		
		System.out.println("Moment wzglêdem osi przechodz¹cej przez œrodek masy równoleg³ej do X: " + bryla.momentWzgledemX(tablica));
		System.out.println("Moment wzglêdem osi przechodz¹cej przez œrodek masy równoleg³ej do Y: " + bryla.momentWzgledemY(tablica));
		System.out.println("Moment wzglêdem osi przechodz¹cej przez œrodek masy równoleg³ej do Z: " + bryla.momentWzgledemZ(tablica));
	}
		
}		
