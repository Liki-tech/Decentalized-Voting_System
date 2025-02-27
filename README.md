# Decentralized Voting Application

## Overview
The Decentralized Voting Application is designed to provide a secure and transparent voting process using blockchain technology. It allows users to cast their votes and ensures that the voting process is tamper-proof.

## Features
- **User Authentication**: Secure user authentication using JWT (JSON Web Tokens).
- **Role-Based Access Control**: Different access levels for users (e.g., admin, voter).
- **Blockchain Interaction**: Integration with a blockchain network to cast votes and retrieve results.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd DecentralizedVotingApplication
   ```
3. Install dependencies:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Usage
- **Cast Vote**: Endpoint to cast a vote.
- **Get Vote Results**: Endpoint to retrieve the results of the voting.

Ensure that you have a running Ethereum node to interact with the blockchain.
