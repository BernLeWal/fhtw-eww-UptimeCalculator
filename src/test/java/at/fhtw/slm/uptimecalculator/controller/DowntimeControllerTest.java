package at.fhtw.slm.uptimecalculator.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DowntimeControllerTest {
    @Test
    public void calculateDowntimeMinutes_when0_then0() {
        // Arrange
        DowntimeController controller = new DowntimeController();

        // Act
        double result = controller.calculateDowntimeMinutes( 0.0 );

        // Assert
        assertEquals( 0.0, result );
    }

    @Test
    @Disabled
    public void calculateDowntimeMinutes_when10_then10() {
        // Arrange
        DowntimeController controller = new DowntimeController();

        // Act
        double result = controller.calculateDowntimeMinutes( 10.0 );

        // Assert
        assertEquals( 10.0, result );
    }

    @Test
    @Disabled
    public void calculateDowntimeMinutes_when100_then100() {
        // Arrange
        DowntimeController controller = new DowntimeController();

        // Act
        double result = controller.calculateDowntimeMinutes( 100.0 );

        // Assert
        assertEquals( 100.0, result );
    }

}
