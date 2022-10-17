package BusStopSimulation;

import java.util.*;
import java.io.*;

public class BusStop {

    BusStop nextBusStop; //next bus stop
    ArrayList <Person> BusStopLine = new <Person> ArrayList(); //The line of people at the bus stop
    Bus currentBus = null; //The current bus at the bus stop

    public BusStop(BusStop nextBusStop) {
    	 this.nextBusStop = nextBusStop;
         this.PersonArrives(); //Adding one person to each bus stop line by default
    }



    public int PersonArrives(){ //adds a person to the line at the bus stop 
        Person personX = new Person();
        BusStopLine.add(personX);
        System.out.print("Person Successfully entered line: ");
        System.out.println(BusStopLine.get(BusStopLine.size()-1));
        
        return 0;
    }

    public int PersonEntersBus(){ //removes first person from array list 
        //currentBus.PersonEnters(BusStopLine[0]); //person in front of line enters bus
        Person personX = BusStopLine.remove(0); //person in front of line is removed from the line
        currentBus.PersonEnters(personX);//adds passenger to the bus
        System.out.println("Person Successfuly entered bus: " + personX);
        return 0;
    }
    
    public int SendBusToNextBusStop() {
    	this.nextBusStop.currentBus = this.currentBus;
    	this.currentBus = null;
    	return 0;
    }
    
    public int arrival() { //doesn't do anything yet
    	return 0;
    }
    
    //Getter Functions
    
    public int GetLineSize() { //Returns the size of the line: used for debugging purposes
    	return this.BusStopLine.size();
    }
    
    public Bus GetCurrentBus() {
    	return this.currentBus;
    }
    
   


}
