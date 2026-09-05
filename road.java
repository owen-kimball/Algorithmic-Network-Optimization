public class Road {
  Location location1;
  Location location2;
  double travelTime;

  Road(Location firstLocation, Location secondLocation, double timeToTravel) {
    location1 = firstLocation;
    location2 = secondLocation;
    travelTime = timeToTravel;
  }

  public Location getLocation1() {
    return location1;
  }

  public Location getLocation2() {
    return location2;
  }

  public double getTravelTime() {
    return travelTime;
  }
}
