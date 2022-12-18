package ie.atu.SpringLAB.PassengerData.main.java;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path="api/passenger")
public class PassengerController {
    PassengerService myService;

    public PassengerController(PassengerService myService){
        this.myService = myService;
    }

    @GetMapping
    public List<Passenger> getPassenger()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", "123", 2L, 23),
                new Passenger("Mr", "Paul2", "6723", 2444L, 93),
                new Passenger("Mr", "Paul3", "144", 5562L, 53));

        return myService.getPassengers();
    }
    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr","Paul",23,"123","2L");
        return myService.getPassenger(passengerID);
    }
}Passenger("Mr", "Paul3", "144", 5562L, 53));