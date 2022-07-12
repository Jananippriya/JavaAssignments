package advanced.java.learning.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingBatFunctional1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<String> strings = Arrays.asList("Apple", "Ball", "Cat", "", "Doll", "Egg", "Flag");
        List<Integer> nums1 = Arrays.asList(1627, 221, 3245, 423, 5, 632, 875637);
        List<String> stringX = Arrays.asList("axbxc", "xcatx", "xxapple", "code", "xjxaxvxxax");

        CodingBatFunctional1 obj = new CodingBatFunctional1();

        System.out.println("Doubling of integer list: " + obj.doubling(nums));
        System.out.println("Squaring of integer list: " + obj.square(nums));
        System.out.println("Adding star * to list: " + obj.addStar(strings));
        System.out.println("3 copies of list: " + obj.copies3(strings));
        System.out.println("Adding 'y' to strings list: " + obj.moreY(strings));
        System.out.println("Adding 1 and Multiplying by 10 of integer list: " + obj.math1(nums));
        System.out.println("Finding right most digit of integer list: " + obj.rightDigit(nums1));
        System.out.println("Lowercase of strings list: " + obj.lower(strings));
        System.out.println("Removing 'x' from strings list: " + obj.noX(stringX));
    }

    /*
    Given a list of integers, return a list where each integer is multiplied by 2.
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(num -> num * 2).collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list where each integer is multiplied with itself.
     */
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(num -> num * num).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has "*" added at its end.
     */
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
     */
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.
     */
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }

    /*
    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
     */
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(num -> (num + 1) * 10).collect(Collectors.toList());
    }

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
     */
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(num -> num % 10).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
     */
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /*
    Given a list of strings, return a list where each string has all its "x" removed.
     */
    public List<String> noX(List<String> strings) {
        return strings.stream().map(this::removeX).collect(Collectors.toList());
    }

    private String removeX(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'x')
                res = res + s.charAt(i);
        }
        return res;
    }

}
