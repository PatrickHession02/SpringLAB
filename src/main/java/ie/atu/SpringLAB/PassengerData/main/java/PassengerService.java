package ie.atu.SpringLAB.PassengerData.main.java;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

    public class PassengerService{
    public List <Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", 12, 2L, 23),
                new Passenger("Mr", "Paul2", 66, 2444L, 93),
                new Passenger("Mr", "Paul3", 14, 5562L, 53));

        return myPassengers;
    }

    public Passenger getPassenger( String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr","Patrick",20,123,2L );
        return myPassenger;
    }
}
