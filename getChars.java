// getChars() method is needed to copy a few characters of StringBuffer into an array or copy the complete StringBuffer into the array.

class getChars{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("This is a string with more than twenty characters.");
        char[] charArray = new char[20];
        char[] charArray2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        str.getChars(5, 25, charArray, 0);
        System.out.println(charArray);

        str.getChars(0, 26, charArray2, 0);
        System.out.println(charArray2);
    }
}