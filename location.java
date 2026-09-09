public class Location {
  private String nameOfLocation;
  
  public Location(String nameOfLocation) {
    this.nameOfLocation = nameOfLocation;
  }

  public String getLocationName() {
    return nameOfLocation;
  }

  public String toString(Location l) {
    return l.getLocationName();
  }

  public boolean equals(Location l1, Location l2) {
    String l1Name, l2Name;
    l1Name = l1.toString();
    l2Name = l2.toString();
    if (l1Name.equals(l2Name)) {
      return true;
    } else {
      return false;
    }
  }
}
