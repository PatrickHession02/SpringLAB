@RequestMapping(path="api/passenger")
@GetMapping
List<Passenger> myPassengers = List.of(
        new Passenger("Mr", "Paul", "123", 2L, 23),
        new Passenger("Mr", "Paul2", "6723", 2444L, 93),
        new Passenger("Mr", "Paul3", "144", 5562L, 53));