import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PerfectCubeTest {

  static final long[] inputValues = {-1, 0, 1, 8, 27, 5, 11, 17};

  static final boolean[] expectedValues = {true, true, true, true, true, false, false, false};

  @Test
  void calcPerfectCube() {
    for (int i = 0; i < inputValues.length; i++) {
      PerfectCube perfectCube = new PerfectCube();
      assertEquals(expectedValues[i], perfectCube.calcPerfectCube(inputValues[i]));
    }
  }

}
