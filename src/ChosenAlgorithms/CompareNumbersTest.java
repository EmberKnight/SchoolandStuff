package ChosenAlgorithms;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumbersTest {


    @Before
    public void setUp() {

    }

    @Test
    public void testEqual() {

        int a = 3;
        int b = 3;
        boolean result = true;
        CompareNumbers c = new CompareNumbers();
        c.compareNumbers(a, b);

        assertThat(c.getEquals(), equalTo(result));
    }

}
