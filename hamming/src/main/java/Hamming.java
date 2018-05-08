class Hamming {

    String left;
    String right;

    Hamming(String leftStrand, String rightStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
             left = leftStrand;
             right = rightStrand;
        }
    }

    int getHammingDistance() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count += 1;
            }
        }

        return count;
    }

}
