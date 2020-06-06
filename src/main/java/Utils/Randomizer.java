package Utils;

import java.util.Random;

public class Randomizer {
	
	private static final Random random = new Random();
	
	public static int getRandomNumberInRange(int min, int max) {
		if(min >= max) {
			throw new IllegalArgumentException("Минимальное число больше или равно макимальному");
		}
		return random.nextInt((max - min) + 1) + min;
	}

}
