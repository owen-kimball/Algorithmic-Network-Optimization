import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Graph {
  int numberOfLocations = 100; // The number of locations in a graph, can be altered if needed
  int numberOfRoads = 500; // The number of roads in a graph, can be altered if needed

  Random exactSeed = new Random(42); // This is the random seed, can be altered.

  public ArrayList<Location> listOfLocations(int locationAmount) {
    ArrayList<Location> locationList = new ArrayList<>();
    for (int locationName = 1; locationName <= locationAmount; locationName++) {
      Location newLocation = new Location(Integer.toString(locationName));
      locationList.add(newLocation);
      return locationList;
    }
  } // This assigns a specified number of locations, and returns the list of their names.

  public ArrayList<Road> listOfRoads(int roadAmount) {
    ArrayList<Road> roadList = new ArrayList<>();
    int roadsLeft = numberOfRoads - numberOfLocations;
    ArrayList<Location> locationList = new ArrayList<>();
    locationList = listOfLocations(numberOfLocations);
    Collections.shuffle(locationList, exactSeed);
    int sizeOfLocationList = locationList.size() - 1;
    for (int i = 0; i < sizeOfLocationList; i++) {
      Road
    }
  }
}
