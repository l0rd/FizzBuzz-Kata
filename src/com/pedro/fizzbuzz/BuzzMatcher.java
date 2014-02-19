package com.pedro.fizzbuzz;

/**
 *
 * Matcher implementation created to return the "Fizz" value if the value passed as argument in the evaluate method
 * is 5 or multiple of 5.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
class BuzzMatcher implements Matcher {

    /*
     * Constants
     */
    private final static String BUZZ = "BUZZ";

    /*
     * Implemented methods
     */

    @Override
    public String evaluate(int value) {
        return value % 5 == 0 ? BUZZ : "";
    }
}
