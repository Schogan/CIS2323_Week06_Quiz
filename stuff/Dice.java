package stuff;
import java.util.Random;

public class Dice{
	public void Roll(){
		Random random = new Random();
		int someNumber = random.nextInt(6)-1;
	}
}