public class PangramChecker {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        String input2 = input.replace(".\\\"_", "");
        String newInput = input2.toLowerCase();
        int total = 0;
        for (int i = 0; i <= alphabet.length()-1; i++) {
            if (newInput.indexOf(alphabet.charAt(i)) >= 0) {
                total += 1;
            } else {
                total = 0;
            }
        }

        return total==25;
    }

}
