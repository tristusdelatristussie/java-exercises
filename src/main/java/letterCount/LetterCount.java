package letterCount;


public class LetterCount {

    public String apply(String str) {
        StringBuilder result = new StringBuilder();
        String[] letters = str.split("");
        for (String letter : letters) {
            if (result.indexOf(letter) == -1) {
                result.append(letter);
                result.append(count(letter, letters));
            }
        }
        return result.toString();

    }

    private int count(String last, String[] split) {
        int count = 0;
        for (String s : split) {
            if (last.equals(s)) {
                count++;
            }
        }
        return count;
    }
}
