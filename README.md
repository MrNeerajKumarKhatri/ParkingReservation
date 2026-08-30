# ParkingReservation

A Java-based parking reservation system that provides a graphical interface for users to log in, select a city, make parking reservations, view booking details, and complete payments.

The project was developed to practice **Java programming, Object-Oriented Programming, GUI development, and application logic** through a real-world parking reservation use case.

## Features

* **User Registration**

  * Create a new user account
  * Store registration information

* **User Login**

  * Authenticate users through the login interface
  * Provide access to the main application after login

* **City Selection**

  * Select a city before making a reservation

* **Parking Reservation**

  * Make parking reservations
  * Manage reservation information

* **Booking Details**

  * Display reservation and booking information

* **Payment**

  * Process parking payment information through the payment interface

* **QR Code**

  * Generate/display a QR code related to the reservation

## Technologies Used

* **Java**
* **Java Swing** for the graphical user interface
* **Object-Oriented Programming**
* **File Handling**

## Project Structure

```text
ParkingReservation/
│
├── src/
│   ├── AfterLogin.java
│   ├── BookingDetail.java
│   ├── CitySelection.java
│   ├── Login.java
│   ├── Payment.java
│   ├── QrCode01.java
│   ├── Registeration.java
│   └── Reservations.java
│
├── .gitignore
└── README.md
```

## Application Flow

```text
Registration
     ↓
   Login
     ↓
City Selection
     ↓
Reservation
     ↓
Booking Details
     ↓
   Payment
     ↓
 QR Code / Confirmation
```

## How to Run

### Prerequisites

* Java Development Kit (JDK)
* A Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

### Steps

1. Clone the repository:

```bash
git clone git@github.com:MrNeerajKumarKhatri/ParkingReservation.git
```

2. Open the project in your Java IDE.

3. Configure the `src` directory as the source directory if required.

4. Locate the main application class and run the application.

## OOP Concepts

The project provides practical experience with:

* Classes and objects
* Encapsulation
* Constructors
* Methods
* Object interaction
* Separation of application components

## Learning Outcomes

Through this project, I practiced:

* Building a Java GUI application using Swing
* Structuring a multi-class Java project
* Implementing user registration and login flows
* Managing reservation-related application logic
* Working with Java event-driven interfaces
* Using Git and GitHub for version control

## Future Improvements

Possible improvements include:

* Database integration using MySQL or PostgreSQL
* Real-time parking-space availability
* Online payment gateway integration
* User authentication with secure password storage
* Admin dashboard for parking management
* Reservation cancellation and modification
* Mobile or web-based version
* Improved UI/UX

## Author

**Neeraj Kumar**

BS Computer Science Student

