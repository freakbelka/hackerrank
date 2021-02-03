package algorithms;

import java.util.Arrays;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        return height[height.length - 1] > k ? height[height.length - 1] - k : 0;
    }
}
