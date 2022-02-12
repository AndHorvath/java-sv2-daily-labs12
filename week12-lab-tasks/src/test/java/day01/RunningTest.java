package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running;
    String pathString;
    String pathStringInvalid;
    double epsilon;
    Throwable exception;

    @BeforeEach
    void setUp() {
        running = new Running();
        pathString = "src/test/resources/running.csv";
        pathStringInvalid = "src/test/resources/running_.csv";
        epsilon = Math.pow(10, -5);
    }

    @Test
    void sumDistanceForYearAndMonthByFileTest() {
        assertEquals(0.0, running.sumDistanceForYearAndMonthByFile(2022, 2, pathString), epsilon);
        assertEquals(41.2, running.sumDistanceForYearAndMonthByFile(2021, 12, pathString), epsilon);
    }

    @Test
    void sumDistanceForYearAndMonthByFileTestInvalid() {
        exception = assertThrows(
            IllegalStateException.class,
            () -> running.sumDistanceForYearAndMonthByFile(2021, 12, pathStringInvalid)
        );
        assertEquals("Cannot read file.", exception.getMessage());
    }
}