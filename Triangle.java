public class Triangle {
public static void main(String[] args) {
int Tria = Integer.parseInt(args[0]);
int Trib = Integer.parseInt(args[1]);
int Tric = Integer.parseInt(args[2]);
boolean isTri;
isTri= Tria + Trib > Tric && Tria + Tric > Trib && Tric + Trib > Tria ;

System.out.println(Tria + ", " + Trib + ", " + Tric + ": " + isTri);
 
	}
}