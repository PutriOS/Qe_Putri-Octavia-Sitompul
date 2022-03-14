import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem1 {
    public static void main(String[] args) {

        String[] testArray1 = {"kazuya", "jin", "lee"};
        String[] testArray2 = {"kazuya", "feng"};
        mergeUniqueValues(testArray1, testArray2);
    }

    public static void mergeUniqueValues(String[] arr1, String[] arr2) {
        Set noDuplicateSet = new HashSet();
        noDuplicateSet.addAll(Arrays.asList(arr1));
        noDuplicateSet.addAll(Arrays.asList(arr2));

        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);

        Arrays.sort(noDuplicateArray);

        System.out.println("Your sorted array is: ");
        for (String str : noDuplicateArray) {
            System.out.println(str);
        }
    }
}
