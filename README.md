## ZLayer Composition
<b> A ZLayer[-RIn, +E, +ROut] describes a layer of an application: every layer in an application requires some services as input RIn and produces some services as the output ROut. </b>
#### ZLayers can be composed together horizontally or vertically:
1. <b>Horizontal Composition:-</b>They can be composed together horizontally with the ++ operator. When we compose two layers horizontally, the new layer that this layer requires all the services that both of them require, also this layer produces all services that both of them produces
2. <b>Vertical Composition:- </b> If we have a layer that requires A and produces B, we can compose this layer with another layer that requires B and produces C; this composition produces a layer that requires A and produces C. The feed operator, >>>, stack them on top of each other by using vertical composition

## Library Dependencies

1. <b> zio </b>
2. <b> zio-test </b>
3. <b> zio-test-sbt <b>
  

## Quickstart

1. <b> In this module we define three services Logging,Database and UserRepo.The UserRepo service depends on the 
 Logging and Database while Database and Logging service are independent of each other.
2. <b>First we horizontally compose the Logging and Database service and then provide these composed layer vertically to UserRepo service.
  
3. <b> Compile the code</b>
  ```bash
  sbt compile
  ```
4. <b> Test the code</b>
  
  ```bash
  sbt test
  ```
5. <b> Run the app </b>
  ```bash
  sbt run
  ```
