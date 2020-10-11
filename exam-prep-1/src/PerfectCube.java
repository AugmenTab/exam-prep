public class PerfectCube {

  public boolean calcPerfectCube(long num) {
    return Math.cbrt(num) % 1 == 0;
  }

}
