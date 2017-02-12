package stringCalculator;


public class StringCalculator {


    public int add(String entry) throws ArithmeticException {
        if (entry.isEmpty()) {
            return 0;
        }
        if (entry.contains("-")) {
            throw new ArithmeticException();
        }
        if (entry.length() > 1) {
            String separator = "[\n,]";
            int beginSeparator = entry.indexOf("[");
            if (beginSeparator != -1) {
                int endSeparator = entry.lastIndexOf("]");
                separator = entry.substring(beginSeparator + 1, endSeparator);
                entry = entry.substring(endSeparator + 1);
            }

            if (entry.contains(",\n")) {
                return 0;
            }
            String[] numbers = entry.split(separator);
            int result = 0;
            for (String number : numbers) {
                result += Integer.parseInt(number);
            }
            return result;
        }
        return Integer.parseInt(entry);
    }

}
