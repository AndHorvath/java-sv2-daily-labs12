package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    MathAlgorithms mathAlgorithms;

    @BeforeEach
    void setUp() {
        mathAlgorithms = new MathAlgorithms();
    }

    @Test
    void findGreatestCommonDivisorTest() {
        assertEquals(256, mathAlgorithms.findGreatestCommonDivisor(256, 256));
        assertEquals(1, mathAlgorithms.findGreatestCommonDivisor(256, 257));
        assertEquals(384, mathAlgorithms.findGreatestCommonDivisor(1920, 768));
    }
}