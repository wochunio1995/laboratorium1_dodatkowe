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
			
		System.out.println("Odleg�o�� od osi X od �rodka masy " +bryla.�rodekMasyX(tablica));
		System.out.println("Odleg�o�� od osi Y od �rodka masy " +bryla.�rodekMasyY(tablica));
		System.out.println("Odleg�o�� od osi Z  od �rodka masy " +bryla.�rodekMasyZ(tablica));
		
		System.out.println("Moment wzgl�dem osi przechodz�cej przez �rodek masy r�wnoleg�ej do X: " + bryla.momentWzgledemX(tablica));
		System.out.println("Moment wzgl�dem osi przechodz�cej przez �rodek masy r�wnoleg�ej do Y: " + bryla.momentWzgledemY(tablica));
		System.out.println("Moment wzgl�dem osi przechodz�cej przez �rodek masy r�wnoleg�ej do Z: " + bryla.momentWzgledemZ(tablica));
	}
		
}		
