package com.rts.interview;

/**
 * Interface for the test problem set.
 */
public interface TestProblems {

    /**
     * Organizes the given array of {@code numbers} by occurrences that are above or below {@code input}.
     * i.e. {1,4,2,6,9,5} with input of 5 should return:
     *      NumberCounter.getBelowCount() = 3
     *      NumberCounter.getAboveCount() = 2
     * @param input The number to compare against i.e. number < input < number
     * @param numbers The numbers to count.  {@code null} is invalid.
     * @return Object containing the counted numbers or {@code null} on bad input.
     */
    NumberCounter countNumbers(int input, int[] numbers);

    /**
     * Rotates the {@code input} by the given {@code rotateCount} amount such that the overflow appears at the beginning
     * of the new string.  The string cannot rotate backwards or past the end of the string.
     * i.e. "MyString" rotated by 2 is "ngMyStri"
     *       01234567                   67012345
     *       The original 0th index character is rotated by 2 positions.
     * @param input The string to rotate.
     * @param rotateCount The amount by which to rorate the string.
     * @return The rotated string or {@code null} on invalid input.
     */
    String rotateString(String input, int rotateCount);
}
