public class GenThree {
public static void main(String[] args) {
int min = Integer.parseInt(args[0]);
int max = Integer.parseInt(args[1]);
int random_int1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
int random_int2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
int random_int3 = (int)Math.floor(Math.random() * (max - min + 1) + min);
System.out.println(random_int1);
System.out.println(random_int2);
System.out.println(random_int3);
int min1 = Math.min(random_int1, random_int2) ;
System.out.println("The minimal generated number was " + Math.min(random_int3, min1));
	}
}