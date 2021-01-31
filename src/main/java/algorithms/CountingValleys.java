package algorithms;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
class CountingValleys {

    public static int countingValleys(String path) {
        int valleys = 0;
        int currentlevel = 0;
        for (char ch : path.toCharArray()) {
            if ('D' == ch) currentlevel--;
            if ('U' == ch) currentlevel++;
            if (currentlevel == 0 && 'U' == ch) valleys++;
        }
        return valleys;
    }
}
