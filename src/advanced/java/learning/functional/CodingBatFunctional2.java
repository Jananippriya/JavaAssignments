package advanced.java.learning.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingBatFunctional2 {
    public static void main(String[] args) {
        CodingBatFunctional2 obj = new CodingBatFunctional2();

        System.out.println("Removing negative integers: " + obj.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400)));
        System.out.println("Removing integers ending with 9: " + obj.no9(Arrays.asList(45, 99, 90, 28, 13, 999, 0)));
        System.out.println("No teens in integer list: " + obj.noTeen(Arrays.asList(12, 45, 67, 19, 13)));
        System.out.println("Removing strings containing 'z': " + obj.noZ(Arrays.asList("hello", "howz", "are", "youz")));
        System.out.println("Removing long strings: " + obj.noLong(Arrays.asList("this", "not", "too", "long")));
        System.out.println("Removing strings of length 3 and 4: " + obj.no34(Arrays.asList("a", "bb", "ccc", "dddd")));
        System.out.println("Adding y and removing yy strings: " + obj.noYY(Arrays.asList("xx", "yay", "zz")));
        System.out.println("Multiplying by 2 and removing integers ending with 2: " + obj.two2(Arrays.asList(3, 1, 4, 1, 6, 99, 0)));
        System.out.println("Squaring and removing numbers ending in 5 or 6: " + obj.square56(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

    }

    /*
    Given a list of integers, return a list of the integers, omitting any that are less than 0.
     */
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

    /*
    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
     */
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(num -> (num % 10) != 9).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
     */
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(num -> num < 13 || num > 19).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    (Note: the str.contains(x) method returns a boolean)
     */
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more
     */
    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
     */
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() != 3 && s.length() != 4).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has "y" added at its end,
     omitting any resulting strings that contain "yy" as a substring anywhere.
     */
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

    /*
    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
     */
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(num -> num * 2).filter(num -> num % 10 != 2).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list of those numbers squared and the product added to 10,
     omitting any of the resulting numbers that end in 5 or 6.
     */
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(num -> (num * num) + 10).filter(num -> num % 10 != 5 && num % 10 != 6)
                .collect(Collectors.toList());
    }

}
