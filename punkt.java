package zad1_dodatkowe;

public class punkt {

private int masa;
private int odlegloscX;
private int odlegloscY;
private int odlegloscZ;

public punkt(){
masa=1;
odlegloscX=1;
odlegloscY=1;
odlegloscZ=1;

}
public punkt(int masa,int odlegloscX, int odlegloscY, int odlegloscZ){
this.masa=masa;
this.odlegloscX=odlegloscX;
this.odlegloscY=odlegloscY;
this.odlegloscZ=odlegloscZ;
}

public int getodlegloscX(){
	   return odlegloscX;
	}
public int getodlegloscY(){
	   return odlegloscY;
	}
public int getodlegloscZ(){
	   return odlegloscZ;
	}
public int getMasa(){
	   return masa;
	}
				
public void setMasa(int m){
		  this.masa= m;
	}
	
public void setodlegloscX(int odlegloscX){
	  this.odlegloscX=odlegloscX;
}
public void setodlegloscY(int odlegloscY){
	  this.odlegloscY=odlegloscY;
}
public void setodlegloscZ(int odlegloscZ){
	  this.odlegloscZ=odlegloscZ;
}


}
