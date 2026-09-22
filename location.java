public class Location {
  private String nameOfLocation;
  
  public Location(String nameOfLocation) {
    this.nameOfLocation = nameOfLocation;
  } // Creates a Location.

  @Override
  public String toString() {
    return this.nameOfLocation;
  } // Prints the name of the Location when converting to String.

  public String getLocationName() {
    return this.nameOfLocation;
  } // Returns the name of the Location.

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    } // Checks if objects are exact same.
    else if (o != null) { // Checks to make sure Object o is not null.
      if (o instanceof Location) { // Checks to make sure Object o is an instance of a Location object.
        Location locObj = (Location) o; // Casts o to Location object locObj.
        return this.nameOfLocation.equals(locObj.getLocationName()); // Returns the final equality.
      }
    }
    return false;
  } // Checks if two locations are the same.

  @Override
  public int hashCode() {
    return this.nameOfLocation.hashCode();
  } // Provides the hashCode capability.
}
