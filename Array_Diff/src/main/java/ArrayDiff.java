import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> result = new ArrayList<>();
        Arrays.stream(a).forEach((numberInArrayA) -> {
                    OptionalInt equalNumber = Arrays
                            .stream(b)
                            .filter(numberInArrayB -> numberInArrayB == numberInArrayA)
                            .findFirst();

                    if (equalNumber.isEmpty()) {
                        result.add(numberInArrayA);
                    }
                }

        );

        return result
                .stream()
                .mapToInt(e -> Integer.parseInt(e.toString()))
                .toArray();

    }
}
