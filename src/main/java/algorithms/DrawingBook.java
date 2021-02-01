package algorithms;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook {
    static int pageCount(int numOfPages, int targetPage) {
        return Math.min(targetPage/2, numOfPages/2 - targetPage/2);
    }
}
