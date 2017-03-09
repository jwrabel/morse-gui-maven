package pl.wrabel;

/**
 * Hello world!
 */
public class Morse {
	public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "0", " "};
	public static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
			"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
			"-....", "--...", "---..", "----.", "-----", "|"};

	public static String translate(String text) {
		String[] letters = text.split("");


		StringBuilder morseTextBuilder = new StringBuilder();
		for (String letter : letters) {
			morseTextBuilder.append(translateToMorse(letter));
			morseTextBuilder.append("/");
		}

		String morseText = morseTextBuilder.toString();

		return morseText;
	}

	public static String translateToMorse(String letter) {
		letter = letter.toLowerCase();

		for (int i = 0; i < alpha.length; i++) {
			if (letter.equals(alpha[i])) {
				return morse[i];
			}
		}

		return "  ";
	}
}
