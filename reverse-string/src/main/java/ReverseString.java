import java.util.logging.Logger;

class ReverseString {
    String reverse(String inputString) {
        StringBuilder reverse = new StringBuilder();
        for (int i = inputString.length()-1; i>=0; i--) {
            reverse.append(inputString.charAt(i));
        }
        return reverse.toString();
    }
  
}