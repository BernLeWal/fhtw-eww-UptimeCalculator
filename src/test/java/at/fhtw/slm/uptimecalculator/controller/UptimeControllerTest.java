package at.fhtw.slm.uptimecalculator.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    UptimeController controller;

    @BeforeEach
    void setup() {
        // Arrange
        controller = new UptimeController();
    }

    @Test // Happy-Path 1
    void calculateUptimeMinutes_when0_then0() {
        // AAA - pattern:
//        // Arrange
//        UptimeController controller = new UptimeController();
        // Act
        double result = controller.calculateUptimeMinutes(0.0);
        // Assert
        assertEquals( 0.0, result);
    }

    @Test // Happy-Path 2
    void calculateUptimeMinutes_when100_thenFull() {
        // AAA - pattern:
//        // Arrange
//        UptimeController controller = new UptimeController();
        // Act
        double result = controller.calculateUptimeMinutes(100.0);
        // Assert
        assertEquals( 60*24*30, result);
    }

    @Test // Bad-Path 1
    void calculateUpdateMinutes_whenNegative_thenThrow() {
        // Act + Assert
        assertThrows( InvalidParameterException.class,
                () -> { controller.calculateUptimeMinutes(-1.0); } );
    }
}