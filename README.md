# car-votes-server
car-test server side
java 11 spring boot 2.7

I used a postgres SQL database.
Here is the script for the car creation


CREATE TABLE car (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  picture_url TEXT NOT NULL,
  number_of_votes INTEGER NOT NULL
);

INSERT INTO car (name, picture_url, number_of_votes)
VALUES 
('Car 1', 'car-1.jpeg', 30),
('Car 2', 'car-2.jpeg', 30),
('Car 3', 'car-3.jpeg', 20),
('Car 4', 'car-4.jpeg', 20),
('Car 5', 'car-5.jpeg', 10),
('Car 6', 'car-6.jpeg', 5),
('Car 7', 'car-7.jpeg', 5),
('Car 8', 'car-8.jpeg', 5);



I didn't have time to finish it correctly but it would have been better if I had result ResponseEntity for  
the server side result instead of list of cars.

Backend runs on port 9002 (8080 port was already occupied by another oroject running locally)
Frontend runs on port 4002; CORS are allowed for this port on backend to allow access.
