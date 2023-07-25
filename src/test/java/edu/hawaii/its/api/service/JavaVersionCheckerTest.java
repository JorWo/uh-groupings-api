package edu.hawaii.its.api.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import edu.hawaii.its.api.exception.JavaVersionException;

public class JavaVersionCheckerTest {

    private JavaVersionChecker javaVersionChecker;

    @BeforeEach
    public void beforeEach() {
        javaVersionChecker = new JavaVersionChecker();
        ReflectionTestUtils.setField(javaVersionChecker, "javaSpecificationVersion", "1.8");
    }

    @Test
    public void initCorrectVersionTest() {
        System.setProperty("java.version", "1.8");
        assertDoesNotThrow(() -> javaVersionChecker.init());
    }

    @Test
    public void initIncorrectVersionTest() {
        System.setProperty("java.version", "1.9");
        assertThrows(JavaVersionException.class, () -> javaVersionChecker.init());
    }

}
