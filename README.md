# SDE_JAVA_app

We hebben allebei een design pattern uitgekozen om te maken. En de Strategy pattern hebben wij gezamelijk gemaakt.
We hebben met de extention Code With Me gewerkt. Hierdoor konden wij gemakkelijk samen tegelijk op afstand werken aan zo een klein programma.

<h4>Creational design pattern: factory method - Senna</h4>
Voor ons programma moet de gebruiker een vervoersmiddel kiezen. Om dit te doen hebben wij een factory method gemaakt waarin verschillende soorten vervoer gemaakt worden. (Car, Plane, Boat)
Eerst gaat de keuze van de gebruiker door de switch statement in de main. Hier wordt de juiste TransportCreator gekozen. (vb: CarCreator bij keuze car)
Vervolgens returned de gekozen creator de juiste value voor getPrice() en maakt getTransport() een nieuw object aan aan de hand van de gekozen transport.

<h4>Structural design pattern: facade method - Lars</h4>
Voor de applicatie die wij hebben gemaakt wordt doormiddel van een simpele startTravel methode aan te roepen, het hele rekenproces gestart waardoor er in de Main alleen maar parameters meegeleverd moeten worden waar de facade die berekend met behulp van de strategy.

<h4>Behavioural design pattern: strategy method - Senna & Lars</h4>

In de strategy word de mogelijkheid gegeven om korting toe te voegen aan de reiskosten. 
In de strategy wordt in dit geval een meervuldigings berekening gebruikt om de korting toe te voegen op de fuelPrice en distance die met elkaar vermenigvuldigd zijn. 
Door een strategy hier toe te passen is het sneller om in het vervolg nog een andere soort OperationStrategy aan te maken.
