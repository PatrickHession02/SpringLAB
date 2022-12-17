package ie.atu.SpringLAB.PassengerData.main.java;

import ie.atu.SpringLAB.PassengerData.main.java.Week6.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path= "api/passenger")
public class PassengerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PassengerApplication.class, args);}
    @GetMapping
    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr","Patrick", 20,123, 2L),
                new Passenger("Mr","Patrick2", 20,123, 2L),
                new Passenger("Mr","Patrick3", 20,123, 2L));

                return myPassengers;

    }
    @GetMapping("/{passengerID}")
    public

}
