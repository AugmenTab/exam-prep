public class ClockAngles {

  public static float calcMinuteAngle(float minutes) {
    if (minutes < 0 || minutes > 59) {
      throw new IllegalArgumentException();
    }
    return minutes * 6;
  }

  public static float calcHourAngle(int hours, float minutes) {
    if (hours < 0 || hours > 23) {
      throw new IllegalArgumentException();
    }
    float hourAngle = (hours < 12) ? hours * 30 : (hours -= 12) * 30;
    float minuteAngle = (minutes / 60) * 30;
    return hourAngle + minuteAngle;
  }

}
