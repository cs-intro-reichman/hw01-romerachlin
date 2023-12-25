public class Coins {
public static void main(String[] args) {
int money = Integer.parseInt(args[0]);
int quarter;
int cents;
quarter = money/25;
cents= money%25;
System.out.println("Use " + quarter + " quarters " + "and " + cents + " cents");

	}
}