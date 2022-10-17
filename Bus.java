package BusStopSimulation;


public class Bus {
    Person [] passengers;
    int nextIndex = 0;

    public Bus(){
        passengers = new Person[20];
    }

    public int PersonEnters(Person p){
        if (passengers.length == nextIndex+1){

            return 1;
        }
        passengers[nextIndex] = p;
        nextIndex++;
        return 0;
    }

    public int PersonExits(){
        if (passengers.length == 0){
            return 1;
        }
        return 0;
    }
}

//How are we supposed to add the buses into the bus stops?