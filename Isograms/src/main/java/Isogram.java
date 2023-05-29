import java.util.Arrays;
import java.util.stream.Collectors;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

 */
public class Isogram {
    public static boolean  isIsogram(String str) {
        if(str.isBlank()) return true;


        int qtyLetters = str.length();

        int qtUnicLetters = Arrays
                .stream(str.toLowerCase().split(""))
                .collect(Collectors.toSet())
                .size();

        return qtUnicLetters == qtyLetters;

    }
}
