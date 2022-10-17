package BusStopSimulation;


public class Bus {
    Person [] passengers;
    int nextIndex = 0;

    public Bus(){
        passengers = new Person[20];
    }
    
    
    public int PersonEnters(Person p){
    	//people can only enter if the bus capacity is not full
    	//This method adds people to the buses passengers array
    	//Since we don't care about passengers exiting the bus, once the bus leaves the station we set the array to null
        if (passengers.length == nextIndex+1){

            return 1;
        }
        passengers[nextIndex] = p;
        nextIndex++;
        return 0;
    }
    

}

