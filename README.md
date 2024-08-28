# ShieldSafe - Password Manager

**ShieldSafe** is a secure password manager that helps users store, manage, and protect their passwords across multiple platforms. The project is designed with a mobile-first approach, using **Spring Boot** for the backend and **React Native** for the frontend. The application will be available as both a mobile app and a web application.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [Security Features](#security-features)
- [Deployment](#deployment)
- [Contributing](#contributing)

## Introduction

ShieldSafe is designed to offer a secure platform for users to manage their passwords. With robust security measures such as encryption and OTP-based authentication, ShieldSafe ensures that users' credentials are well-protected.

## Features

- **User Registration & Login with Email Verification**
- **Password Management:** Securely store and manage your passwords.
- **Password Generation:** Generate strong, random passwords.
- **OTP-Based Authentication:** Optional two-factor authentication for enhanced security.
- **Mobile and Web Compatibility:** Accessible via mobile app and web interface.

## Technologies Used

- **Backend:** Spring Boot, PostgreSQL
- **Frontend:** React Native, Tailwind CSS (for styling)
- **Languages:** Java (backend), JavaScript (frontend)
- **Build Tools:** Maven
- **Version Control:** GitHub

## System Architecture

ShieldSafe follows a client-server architecture:

- **Frontend:** React Native handles the client-side logic and user interface.
- **Backend:** Spring Boot manages the server-side operations, including user authentication and data management.
- **Database:** PostgreSQL is used for secure data storage.

### Prerequisites

- Java 21
- Maven
- Node.js
- PostgreSQL

## Backend Implementation

The backend, powered by Spring Boot, includes the following features:

- **User Authentication:** Secure user login and registration, with email verification.
- **Data Management:** Secure storage and retrieval of passwords.
- **API Endpoints:** RESTful services for the frontend.

## Frontend Implementation

The frontend is developed using React Native and styled with Tailwind CSS. It offers a clean, intuitive user interface that adapts well across different devices and screen sizes.

## Security Features

- **Encryption:** All sensitive data, including passwords, is encrypted.
- **Two-Factor Authentication:** Users can enable OTP-based authentication for additional security.
- **Secure API Communication:** All API communications are secured using HTTPS.

## Deployment

ShieldSafe can be deployed on cloud platforms like AWS or Heroku:

1. **Backend:** Deploy the Spring Boot application.
2. **Frontend:** Deploy the React Native app via app stores or as a web app.
3. **Database:** Set up a PostgreSQL instance on the cloud.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.
