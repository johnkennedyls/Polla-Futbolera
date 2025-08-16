# 📁 domain

The `domain` layer contains the core business logic of the application. It represents the heart of the system and includes entities, value objects, domain services, use cases, and interfaces. This layer is completely independent of frameworks and external services, ensuring that the business rules remain pure and isolated.

---

## 📌 Responsibilities

- Define entities and domain models that represent the business concepts.
- Implement use cases that encapsulate business rules and workflows.
- Declare contracts (interfaces) for repositories and services.
- Provide enums and value objects that are specific to the domain.
- Remain independent of infrastructure, frameworks, and external services.

---

## 📂 Folder Structure Example

domain  
├── contracts                     # Interfaces for repositories and services  
│   └── roles.contract.ts  
├── dto                           # Data Transfer Objects for communication between layers  
│   ├── rate.dto.ts  
│   ├── toll.dto.ts  
│   ├── user.dto.ts  
│   └── vehicle.dto.ts  
├── enum                          # Enums representing domain-specific constants  
│   └── roles.enum.ts  
├── models                        # Core domain models and entities  
│   ├── Category.ts  
│   ├── Invoice.ts  
│   ├── Permission.ts  
│   ├── Rate.ts  
│   ├── Registry.ts  
│   ├── Role.ts  
│   ├── Toll.ts  
│   ├── User.ts  
│   └── Vehicle.ts  
└── use-cases                     # Business use cases and workflows  
    └── common.use-cases.ts  

---

## ✅ Best Practices

1. **Framework-agnostic code:**  
   No dependencies on frameworks or external libraries should exist in this layer.

2. **Pure business logic:**  
   All domain rules and workflows should reside here, making this layer highly testable.

3. **Stable abstractions:**  
   Contracts should define the expected behavior for infrastructure implementations.

---

## 📚 Example: Domain Model for Vehicle

File: `domain/models/Vehicle.ts`

```typescript
export class Vehicle {
  constructor(
    public readonly id: string,
    public plate: string,
    public model: string,
    public type: string
  ) {}

  updatePlate(newPlate: string) {
    this.plate = newPlate;
  }
}
