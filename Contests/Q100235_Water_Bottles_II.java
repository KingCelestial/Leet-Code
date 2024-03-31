package Contests;

public class Q100235_Water_Bottles_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBottles = 13, numExchange = 6;
		int emptyBottles=0, bottlesDrink =0;
		while(true) {
			bottlesDrink += numBottles;
			emptyBottles += numBottles;
			numBottles = 0;
			if(emptyBottles >= numExchange) {
				emptyBottles -= numExchange;
				numBottles+=1;
				numExchange++;
			}else {
				break;
			}
		}
		System.out.println(bottlesDrink);
	}

}
