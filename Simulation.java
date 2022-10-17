package BusStopSimulation;

//Burak Yesil 
//I pledge my honor that I have abided by the Stevens Honor System.

class Simulation{
	
  //INITIALIZATION: 
  public static int numOfBusStops = 4; //15 total bus stops
  public int numOfBuses = 5; //5 total buses
  private int timeBetweenTwoStops = 5; //5 minutes to drive between two contiguous stops
  private int meanArrivalRate = 5; //5 people per minute
  private int boardTime = 2; //2 seconds to board for each passanger
  private int simulationTime = 8; //the total simulation last 8 hours

  
  public static int CreateBusStopsLinkedList() { //Initializes the Bus Stops and connects them in the form of a linked list
	  BusStop prevStop = new BusStop(null);
	  BusStop head = prevStop;
	  for(int i = 0; i < numOfBusStops-1; i++) {
		  BusStop currentStop = new BusStop(null);
		  prevStop.nextBusStop = currentStop;
		  System.out.println(prevStop + " connected to " + currentStop);
		  prevStop = currentStop;
		  System.out.println("next Stop");

		  if (i == numOfBusStops-2) {
			  currentStop.nextBusStop = head;
			  System.out.println(currentStop + " connected to " + head);
			  System.out.println("Successfully Made Bus Stop Linked List");
		  } 
	  }
	  return 0;
  }
  
  
  //Test Function 1 
  public static int BusStopClassTest(int numOfPassengers) {
	  //Tests the BusStop Class to make sure the enter line and enter bus functions work correctly
	  BusStop n = new BusStop(null);
      for(int i = 0; i<numOfPassengers; i++) {
      System.out.println("Ran properly");
      System.out.println(n.AddPersonToLine());
      }
      System.out.println("Line Size: " + n.GetLineSize());
      for(int i = 0; i<numOfPassengers; i++) {
          System.out.println("Ran properly");
          System.out.println(n.PersonEntersBus());
          }
      System.out.println("Line Size: " + n.GetLineSize());
      return 0;
  }
  
  
  

  public static void main(String[] args){
	  //System.out.println(BusStopClassTest(5));
	  //System.out.println(CreateBusStopsLinkedList());
	  
	  CreateBusStopsLinkedList(); //Initializes the Circular Linked List connecting each bus stop
  }

}



