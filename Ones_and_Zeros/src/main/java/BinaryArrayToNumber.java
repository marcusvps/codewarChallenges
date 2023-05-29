    import java.util.List;
    import java.util.concurrent.atomic.AtomicReference;

/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 */
public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        AtomicReference<String> numberString = new AtomicReference<>("");
        binary.forEach(n -> numberString.updateAndGet(v -> v + n));
        return Integer.parseInt(numberString.toString(),2);
    }
}
