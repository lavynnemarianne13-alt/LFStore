# LFStore

🇺🇸 English | [🇧🇷 Português](README.pt-BR.md)

E-commerce REST API built with **Java 25** and **Spring Boot 4.1**, following a layered architecture and backend development best practices.

## Tech Stack

- Java 25
- Spring Boot 4.1 (Web MVC, Data JPA)
- Hibernate / JPA
- Bean Validation (Hibernate Validator)
- H2 Database (test environment)
- Maven

## Architecture

```
controllers  ->  services  ->  repositories  ->  entities
     |              |
    dto         exceptions
```

- **controllers**: REST endpoints and global exception handling (`@ControllerAdvice`)
- **services**: business rules and custom exceptions (`ResourceNotFoundException`, `DatabaseException`)
- **repositories**: data access with Spring Data JPA
- **dto**: data transfer objects and standardized error responses
- **entities**: domain model

## Domain Model

`User`, `Product`, `Category`, `Order`, `OrderItem` (composite key via `OrderItemPK`), `Payment` and the `OrderStatus` enum.

## Endpoints

| Method | Route            | Description               |
|--------|------------------|---------------------------|
| GET    | /products        | List products (paginated) |
| GET    | /products/{id}   | Find product by id        |
| POST   | /products        | Create product            |
| PUT    | /products/{id}   | Update product            |
| DELETE | /products/{id}   | Delete product            |

## Error Handling

Error responses follow a standardized format. On validation failures, the API returns the list of invalid fields with their messages:

```json
{
  "timestamp": "2026-10-20T12:00:00Z",
  "status": 422,
  "error": "Invalid data",
  "path": "/products",
  "errors": [
    { "fieldName": "name", "message": "Required field" }
  ]
}
```

## Getting Started

Prerequisite: Java 25 installed.

```bash
git clone https://github.com/lavynnemarianne13-alt/LFStore.git
cd LFStore
./mvnw spring-boot:run
```

On Windows: `mvnw.cmd spring-boot:run`

The API runs at `http://localhost:8080`.
H2 console: `http://localhost:8080/h2-console`

## Roadmap

- [ ] Order and category endpoints
- [ ] Automated tests
- [ ] Migration to PostgreSQL
- [ ] Containerization with Docker

## Author

**Lavynne Marianne da Silva Sousa**
Software Engineering student
[GitHub](https://github.com/lavynnemarianne13-alt)
