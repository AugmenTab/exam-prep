import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ClockAnglesTest {

  static final Object[][] inputValues = {
      {3, 40f}, {15, 40f}, {12, 0f}, {4, 14f}, {5, 0f}, {8, 57f}, {19, 4f}, {21, 33f}, {23, 40f}
  };

  static final float[][] expectedValues = {
      {110, 240}, {110, 240}, {0, 0}, {127, 84}, {150, 0}, {268.5f, 342}, {212, 24}, {286.5f, 198},
      {350, 240}
  };

  @Test
  void calcMinuteAngle() {
    for (int i = 0; i < inputValues.length; i++) {
      assertEquals(expectedValues[i][1], ClockAngles.calcMinuteAngle((Float) inputValues[i][1]));
    }
  }

  @Test
  void calcHourAngle() {
    for (int i = 0; i < inputValues.length; i++) {
      int hours = (int) inputValues[i][0];
      float minutes = (Float) inputValues[i][1];
      assertEquals(expectedValues[i][0], ClockAngles.calcHourAngle(hours, minutes));
    }
  }

}