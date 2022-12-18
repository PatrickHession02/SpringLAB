package ie.atu.SpringLAB.PassengerData.main.java;

import ie.atu.SpringLAB.PassengerData.main.java.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@SpringBootApplication
@RequestMapping(path= "api/passenger")
public class PassengerApplication {

    PassengerService myService;

    public PassengerApplication(PassengerService myService) {this.myService = myService;}
    public static void main(String[] args) {SpringApplication.run(PassengerApplication.class, args);}
    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myService.getPassengers();
    }
    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID)
    {
        return myService.getPassenger(passengerID);
    }

}
