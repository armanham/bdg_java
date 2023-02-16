package homework_7;

public class StringUtil {

    public String concat(String str1, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        return str1 + str2;
    }

    public String concat(int num1, int num2, String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter:");
            return null;
        }

        return num1 + num2 + str;
    }

    public String concat(String str1, int num, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        return str1 + num + str2;
    }

    public String concat(String str1, int num1, int num2, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        return str1 + num1 + num2 + str2;
    }

    public StringBuilder concatBuilder(String str1, String str2) {
        if (isNullOrEmpty(str2) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        StringBuilder newStr = new StringBuilder();
        return newStr.append(str1).append(str2);
    }

    public StringBuilder concatBuilder(int num1, int num2, String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter:");
            return null;
        }

        StringBuilder newStr = new StringBuilder(String.valueOf(num1));
        return newStr.append(num2).append(str);
    }

    public StringBuilder concatBuilder(String str1, int num, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        StringBuilder newStr = new StringBuilder(str1);
        return newStr.append(num).append(str2);
    }

    public StringBuilder concatBuilder(String str1, int num1, int num2, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters:");
            return null;
        }

        StringBuilder newStr = new StringBuilder(str1);
        return newStr.append(num1).append(num2).append(str2);
    }


    /**
     * This method replaces spaces with newlines in String.
     *
     * @param str String str.
     * @return new already modified String.
     */
    public String newLineAfterWhiteSpace(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ' ') {
                chars[i] = '\n';
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method reverses String.
     *
     * @param str String str.
     * @return new modified String.
     */
    public String reverse(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }


    /**
     * This method counts how many times the given String occurs in the other given String.
     *
     * @param line  String line.
     * @param token String token.
     * @return counts of token in line.
     */
    public int countSubString(String line, String token) {
        if (isNullOrEmpty(line) || isNullOrEmpty(token)) {
            System.out.println("Passed null value for one or both of String-type parameters\n " +
                    "or passed empty lines for one or both of String-type parameters:");
            return 0;
        }
        if (token.length() > line.length()) {
            System.out.println("Length of parameter 'token' must be less or equal to length of parameter 'line':");
            return 0;
        }

        int count = 0;
        for (int i = 0; i < line.length() - token.length(); i++) {
            if (token.equals(line.substring(i, token.length() + i))) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method converts lowercase letters to uppercase in String.
     *
     * @param str String str.
     * @return new modified String.
     */
    public String toUpperCase(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] -= 32;
            }
        }
        return String.valueOf(chars);
    }


    public StringBuilder toUpperCaseBuilder(String str){
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        StringBuilder newStr = new StringBuilder();

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] -= 32;
            }
        }
        return newStr.append(String.valueOf(chars));
    }





    /**
     * This method determines is the passed String null or empty.
     *
     * @param str String str.
     * @return true if str is null or empty, false otherwise.
     */
    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
