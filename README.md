# banking-service

A simple Java-based banking service that manages accounts and transactions. This project demonstrates core banking operations such as creating accounts, processing transactions, and managing balances, using clean object-oriented design.

## Features

- Create and manage bank accounts
- Process deposits and withdrawals
- Track transaction history
- Simple, extensible architecture
- Command-line interface for demonstration

## Technologies Used

- Java 17+
- Maven (for build and dependency management)

## Getting Started

### Prerequisites

- Java 17 or higher installed
- Maven installed

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.skypay.bank.Main"
```

## Project Structure

```
banking-service/
├── pom.xml                # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/skypay/bank/
│   │   │       ├── Account.java
│   │   │       ├── AccountService.java
│   │   │       ├── Main.java
│   │   │       └── Transaction.java
│   │   └── resources/
│   └── test/
│       └── java/
└── README.md
```

## Example Usage

The application provides a simple command-line interface. Example operations:

- Create a new account
- Deposit money into an account
- Withdraw money from an account
- View account balance and transaction history

## Contributing

Contributions are welcome! Please open issues or submit pull requests for improvements or bug fixes.

## License

This project is licensed under the MIT License.
