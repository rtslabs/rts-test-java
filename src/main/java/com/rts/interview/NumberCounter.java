package com.rts.interview;

/**
 * Interface for tracking the number of occurrences a number is less than or greater than another number.
 */
public interface NumberCounter {

    /**
     * Gets the number of times a number has been counted as less than another base number.
     * @return The number of "below" occurrences.
     */
    int getBelowCount();

    /**
     * Gets the number of times a number has been counted as greater than another base number.
     * @return The number of "above" occurrences.
     */
    int getAboveCount();
}
