package algorithms;

import java.util.List;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BillDivision {
    static void bonAppetit(List<Integer> bill, int excludeIndex, int chargedTotal) {
        double realTotal = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(excludeIndex)) / 2.0;
        if (realTotal == chargedTotal)
            System.out.println("Bon Appetit");
        else if (realTotal < chargedTotal) System.out.println(bill.get(excludeIndex) / 2);
        else System.out.println("Anna owes Brian");
    }
}
