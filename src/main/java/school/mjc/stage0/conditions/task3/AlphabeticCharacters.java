package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
		char lowerCaseCharacter = Character.toLowerCase(character);
		if (lowerCaseCharacter <= 'a' || lowerCaseCharacter >= 'z') {
			System.out.println("wrong alphabet!");
		} else if ('a' == lowerCaseCharacter || 'e' == lowerCaseCharacter
				|| 'i' == lowerCaseCharacter || 'o' == lowerCaseCharacter
				|| 'u' == lowerCaseCharacter) {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
    }
}
