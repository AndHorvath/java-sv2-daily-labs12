package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    StringStatistics stringStatistics;
    Map<Character, Integer> statistics;

    @BeforeEach
    void setUp() {
        stringStatistics = new StringStatistics();
    }

    @Test
    void createStringStatisticsTest() {
        statistics = stringStatistics.createStringStatistics("String statistics");

        assertEquals(1, statistics.get(' '));
        assertEquals(1, statistics.get('a'));
        assertEquals(1, statistics.get('c'));
        assertEquals(1, statistics.get('g'));
        assertEquals(3, statistics.get('i'));
        assertEquals(1, statistics.get('n'));
        assertEquals(1, statistics.get('r'));
        assertEquals(4, statistics.get('s'));
        assertEquals(4, statistics.get('t'));

        assertNull(statistics.get('b'));
    }
}