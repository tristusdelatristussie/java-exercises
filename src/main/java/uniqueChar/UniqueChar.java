package uniqueChar;


public class UniqueChar {

    public boolean isUniqueChar(String asciiStr) {
        if (asciiStr == null || asciiStr.isEmpty()) {
            return false;
        }
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < asciiStr.length(); i++) {
            int asciiVal = asciiStr.charAt(i);
            if (charSet[asciiVal]) {
                return false;
            }
            charSet[asciiVal] = true;
        }
        return true;
    }


}
