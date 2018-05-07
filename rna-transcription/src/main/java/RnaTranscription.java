class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= dnaStrand.length()-1; i++ ) {
            if (dnaStrand.charAt(i) == 'G') {
                result.append('C');
            } else if (dnaStrand.charAt(i) == 'C') {
                result.append('G');
            } else if (dnaStrand.charAt(i) == 'T') {
                result.append('A');
            } else if (dnaStrand.charAt(i) == 'A') {
                result.append('U');
            } else {
                throw new IllegalArgumentException();
            }

        }
        return result.toString();
    }

}
