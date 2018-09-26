package stuff;

public class Yahtzee{
	
	private int diceA = 0;
	private int diceB = 0;
	private int diceT = diceA+diceB;
	Dice roll = new Dice();
	
	public void Yahtzee(){
		rollA();
		rollB();
		//roll();
	}
	public void rollA(){
		diceA = roll.Roll();
		
	}
	
	public void rollB(){
		diceB = roll.Roll();
	}
	
	public String roll(){
		
		
		if (diceT == 6){
			return "Your first dice is a: " + diceA + "\n" +
		"Your second dice is a: " + diceB + "\n" +
		"For a total of: " + diceT + " !!!YAHTZEE!!! ";
		}else{return "Your first dice is a: " + diceA + "\n" +
		"Your second dice is a: " + diceB + "\n" +
		"For a total of: " + diceT;}
	}
	
}