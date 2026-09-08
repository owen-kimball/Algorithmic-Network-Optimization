import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Graph {
  HashMap<Location, ArrayList<Road>> graph = new HashMap<>();

  public HashMap<Location, ArrayList<Road>> addLocation(Location locationName) {
    ArrayList<Road> futureListOfRoads = new ArrayList<>();
    
    graph.put(locationName.toString(), futureListOfRoads);
    return graph;
  }

  public HashMap<Location, ArrayList<Road>> addRoad(Location locationName1, Location locationName2, double travelTime) {
    ArrayList<Road> listOfRoads1 = new ArrayList<>();
    ArrayList<Road> listOfRoads2 = new ArrayList<>();

    String location1Name = locationName1.toString();
    String location2Name = locationName2.toString();
    
    listOfRoads1 = graph.get(location1Name);
    listOfRoads2 = graph.get(location2Name);
    
    Road newRoad = new Road(locationName1, locationName2, travelTime);
    
    listOfRoads1.add(newRoad);
    listOfRoads2.add(newRoad);

    graph.put(,)
  }
}
