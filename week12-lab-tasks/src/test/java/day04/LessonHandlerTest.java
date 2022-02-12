package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LessonHandlerTest {

    LessonHandler lessonHandler;
    String pathString;
    String pathStringInvalid;
    Throwable exception;

    @BeforeEach
    void setUp() {
        lessonHandler = new LessonHandler();
        pathString = "src/test/resources/beosztas.txt";
        pathStringInvalid = "src/test/resources/beosztas_.txt";
    }

    @Test
    void getNumberOfLessonsFromFileByTeacherTest() {
        assertEquals(
            24, lessonHandler.getNumberOfLessonsFromFileByTeacher("Albatrosz Aladin", pathString));
        assertEquals(
            18, lessonHandler.getNumberOfLessonsFromFileByTeacher("Szarvas Szamanta", pathString));
        assertEquals(
            0, lessonHandler.getNumberOfLessonsFromFileByTeacher("Fictitious Teacher", pathString));
    }

    @Test
    void getNumberOfLessonsFromFileByTeacherTestInvalid() {
        exception = assertThrows(
            IllegalStateException.class,
            () -> lessonHandler.getNumberOfLessonsFromFileByTeacher("Albatrosz Aladin", pathStringInvalid));
        assertEquals("Cannot read file.", exception.getMessage());
    }
}