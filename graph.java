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
    ArrayList<Location> locationList = new ArrayList<>();
    locationList = listOfLocations(numberOfLocations);
    Collections.shuffle(locationList, exactSeed);

    int roadsLeft = numberOfRoads - numberOfLocations;
    double timeElapsed;
    int sizeOfLocationList = locationList.size() - 1;
    Random timeGeneration = new Random();
    
    for (int i = 0; i < sizeOfLocationList; i++) {
      timeElapsed = (timeGeneration.nextDouble() + 1.0) * 15.0;
      Road newRoad = new Road(locationList.get(i), locationList.get(i + 1), timeElapsed);
      roadList.add(newRoad);
    }
    
    Random timeGeneration = new Random();
    timeElapsed = (timeGeneration.nextDouble() + 1.0) * 15.0;
    Road newRoad = new Road(locationList.get(sizeOfLocationList), locationList.get(0), timeElapsed);
    roadList.add(newRoad);

    while (roadsLeft > 0) {
      Location location1;
      Location location2;
      int intForLocation1;
      int intForLocation2;
      
      intForLocation1 = timeGeneration.nextInt(sizeOfLocationList);
      intForLocation2 = intForLocation1;
      while (intForLocation2 == intForLocation1) {
        intForLocation2 = timeGeneration.nextInt(sizeOfLocationList);
      }

      timeElapsed = (timeGeneration.nextDouble() + 1.0) * 15.0;

      Road newRoad = new Road(locationList.get(intForLocation1), locationList.get(intForLocation2), timeElapsed);
      roadList.add(newRoad);
      roadsLeft--;
    }

    return roadList;
  }

  Graph(ArrayList<Location> locationList) {
    ArrayList<Road> roadList = new ArrayList<>();
    roadList = listOfRoads(locationList);
    int lengthOfLocationList = locationList.size();
    
    for (int i = 0; i < lengthOfLocationList; i++) {
      
    }
  }
}
