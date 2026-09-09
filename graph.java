import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Graph {
  private HashMap<Location, ArrayList<Road>> graph = new HashMap<>();

  public Graph(HashMap<Location, ArrayList<Road>> graph) {
    this.graph = graph;
  } // Constructor for a Graph object.

  public void addLocation(Location locationName) {
    if (!graph.containsKey(locationName)) {
      ArrayList<Road> futureListOfRoads = new ArrayList<>();
      graph.put(locationName, futureListOfRoads);
    }
  } // Adds a location with a empty ArrayList of Roads to the Graph object.

  public void addRoad(Location locationName1, Location locationName2, double travelTime) {
    if (graph.containsKey(locationName1) && graph.containsKey(locationName2)) {
      ArrayList<Road> listOfRoads1 = new ArrayList<>();
      ArrayList<Road> listOfRoads2 = new ArrayList<>();
  
      String location1Name = locationName1.toString();
      String location2Name = locationName2.toString();
      
      listOfRoads1 = graph.get(location1Name);
      listOfRoads2 = graph.get(location2Name);
      
      Road newRoad1 = new Road(locationName1, locationName2, travelTime);
      Road newRoad2 = new Road(locationName2, locationName1, travelTime);
      
      listOfRoads1.add(newRoad1);
      listOfRoads2.add(newRoad2);
  
      graph.put(locationName1, listOfRoads1);
      graph.put(locationName2, listOfRoads2);
    }
  } // Note that this adds Roads for both Locations in their ArrayLists of Roads.

  public HashSet<Location> getAllLocations() {
    HashSet<Location> allLocations = new HashSet<>();
    allLocations = graph.keySet();
    return allLocations;
  } // Returns all of the Locations in the Graph object.

  public ArrayList<Road> getRoadsOfLocation(Location chosenLocation) {
    if (graph.containsKey(chosenLocation)) {
      ArrayList<Road> connectedRoads = new ArrayList<>();
      connectedRoads = graph.getOrDefault(chosenLocation, "This location was not found in the graph.");
      return connectedRoads;
    }
  } // Returns all of the Roads connected to a specified Location in the Graph object.

  public HashSet<Location> getNeighbors(Location chosenLocation) {
    HashSet<Location> neighbors = new HashSet<>();
    if (graph.containsKey(chosenLocation)) {
      ArrayList<Road> connectedRoads = new ArrayList<>();
      connectedRoads = getRoadsOfLocation(chosenLocation);
      
      for (Road street : connectedRoads) {
        Location neighbor = new Location(street.getLocation2().toString());
        if (!neighbors.contains(neighbor)) {
          neighbors.add(neighbor);
        }
      }
    }
    return neighbors;
  } // Returns the neighbors of a specified Location.

  public boolean checkIfConnected(Location location1, Location location2) {
    if (graph.containsKey(location1)) {
      HashSet<Location> neighbors = new HashSet<>();
      neighbors = graph.getNeighbors(location1);
      if (neighbors.contains(location2)) {
        return true;
      }
    }
    return false;
  } // Returns a true / false value on whether two locations are connected.
}
