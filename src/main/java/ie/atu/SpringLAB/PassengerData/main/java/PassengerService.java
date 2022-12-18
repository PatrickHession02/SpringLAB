package ie.atu.SpringLAB.PassengerData.main.java;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class PassengerService {
    public class PassengerService{
        public List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", "123", 2L, 23),
                new Passenger("Mr", "Paul2", "6723", 2444L, 93),
                new Passenger("Mr", "Paul3", "144", 5562L, 53));

        return myService.getPassengers();
    }

    public Passenger getPassenger( String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr", );
        return myPassenger;
    }
}
