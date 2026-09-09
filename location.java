public class Location {
  private String nameOfLocation;
  
  public Location(String nameOfLocation) {
    this.nameOfLocation = nameOfLocation;
  } // Creates a Location.

  @Override
  public String toString() {
    return this.nameOfLocation;
  } // Returns the name of the Location.

  public boolean equals(Object o) {
    if (o != null) {
      String l1Name, l2Name;
      l1Name = this.nameOfLocation;
      l2Name = l2.toString();
      if (l1Name.equals(l2Name)) {
        return true;
      } else {
        return false;
      }
    }
  } // Checks if two locations are the same.
}
