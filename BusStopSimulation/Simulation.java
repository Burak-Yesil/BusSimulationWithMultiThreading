package BusStopSimulation;

//Burak Yesil 
//I pledge my honor that I have abided by the Stevens Honor System.

class Simulation{
	
  //INITIALIZATION: 
  public static int numOfBusStops = 15; //15 total bus stops
  public static int numOfBuses = 5; //5 total buses
  private int timeBetweenTwoStops = 5; //5 minutes to drive between two contiguous stops
  private int meanArrivalRate = 5; //5 people per minute
  private int boardTime = 2; //2 seconds to board for each passanger
  private int simulationTime = 8; //the total simulation last 8 hours

  
  public static BusStop CreateBusStopsLinkedList() { 
	  //Initializes the Bus Stops and connects them in the form of a linked list
	  int count = numOfBuses;
	  BusStop prevStop = new BusStop(null);
	  count--;
	  BusStop head = prevStop;
	  for(int i = 0; i < numOfBusStops-1; i++) {
		  BusStop currentStop;
		
			  currentStop = new BusStop(null); //if there aren't any more buses, set the current bus to null
			  //System.out.println("Current bus is: " + currentStop.GetCurrentBus());
		  
		  prevStop.nextBusStop = currentStop;
		  System.out.println(prevStop + " connected to " + currentStop);
		  prevStop = currentStop;
		  //System.out.println("next Stop");

		  if (i == numOfBusStops-2) {
			  currentStop.nextBusStop = head;
			  System.out.println(currentStop + " connected to " + head);
			  //System.out.println("Successfully Made Bus Stop Linked List");
		  } 
	  }
	  return head;
  }
  
  public static int AddDefaultBusesToRoute(BusStop head) { 
	  //Setups buses along the bus route before the simulation starts
	  BusStop current = head;
	  for (int i = 0; i<numOfBuses; i++) {
		  current.currentBus = new Bus();
		  System.out.println("Bus Stop " + current + "'s bus is " + current.currentBus);
		  current = current.nextBusStop;
	  }
	  return 0;
  }
  
  
  //Test Function 1 
  public static int BusStopClassTest(int numOfPassengers) {
	  //Tests the BusStop Class to make sure the enter line and enter bus functions work correctly
	  BusStop n = new BusStop(null);
      for(int i = 0; i<numOfPassengers; i++) {
      System.out.println("Ran properly");
      System.out.println(n.PersonArrives());
      }
      System.out.println("Line Size: " + n.GetLineSize());
      for(int i = 0; i<numOfPassengers; i++) {
          System.out.println("Ran properly");
          System.out.println(n.PersonEntersBus());
          }
      System.out.println("Line Size: " + n.GetLineSize());
      return 0;
  }
  
  public static void defaultBusStopLineSizeTest(BusStop head) { 
	  //checks that each bus stop line has a default size of one from the start
	  BusStop current = head;
	  for(int i = 0; i<numOfBusStops;i++) {
		  System.out.println(current + "'s line size: " +current.GetLineSize());
		  current = current.nextBusStop;
	  }
  }

  
  
  

  public static void main(String[] args){
	  //INIITIALIZATION:
	  BusStop startStation = CreateBusStopsLinkedList(); //Creates the circular linked list with the bus stops as nodes
	  AddDefaultBusesToRoute(startStation); //Adds the buses to the first x bus stops where x is defined by the numOfBuses variable
	  
	
  }

}



