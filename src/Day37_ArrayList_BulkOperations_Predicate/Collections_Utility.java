package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        /*
        Collections Class:
		Collections.sort()
		Collections.swap()     переміщення двох обєктів між собою в арреї
		Collections.frequency()

		Collections.max()
		Collections.min()
		Collections.replaceAll()

         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 8, 99, 6, -58, 4));
        Collections.swap(list, 6, 4);
        System.out.println(list);







    }
}
