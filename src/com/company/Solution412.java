class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    int highestPoint = currentAltitude;

    for (int altitudeGain : gain) {
      currentAltitude += altitudeGain;
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
  }
}
