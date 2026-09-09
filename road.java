public class Road {
  private Location location1;
  private Location location2;
  private double travelTime;

  public Road(Location location1, Location location2, double travelTime) {
    this.location1 = location1;
    this.location2 = location2;
    this.travelTime = travelTime;
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
