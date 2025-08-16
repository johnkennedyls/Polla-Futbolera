# 📁 application

The `application` layer is responsible for orchestrating the business logic of the application. It acts as an intermediary between the domain layer and the presentation layer, coordinating use cases and ensuring that the business rules defined in the domain are properly executed in response to user actions or external events.

This layer should not include any logic related to UI rendering or infrastructure implementations. Its main purpose is to handle application-specific workflows and coordinate the interaction between different parts of the system.

---

## 📌 Responsibilities

- Orchestrate business use cases by calling domain models and use cases.
- Handle application-specific processes, such as user sessions, validations, and data transformations.
- Coordinate between the presentation layer (UI) and domain logic.
- Provide actions that can be called from UI components or API endpoints.
- Ensure that data is properly validated and transformed before being sent to the domain or infrastructure layers.

---

## 📂 Folder Structure Example

```markdown
application  
├── actions                      # Actions to trigger use cases  
│   ├── client                   # Client-side actions  
│   │   └── user-actions.ts  
│   └── server                   # Server-side actions  
│       ├── category-actions.ts  
│       ├── invoice-actions.ts  
│       ├── rate-actions.ts  
│       ├── registry-actions.ts  
│       ├── toll-actions.ts  
│       ├── user-actions.ts  
│       └── vehicle-actions.ts  
├── auth                         # Authentication and session logic  
│   ├── index.ts  
│   └── session.ts  
├── decorators                   # Function decorators for handling cross-cutting concerns  
│   └── withPromiseHandling.ts  
├── mappers                      # Data mapping utilities  
│   ├── toll-mapper.ts  
│   └── user-mapper.ts  
├── utils                        # General utilities for the application layer  
│   └── role.utils.ts  
└── validations                  # Data validation schemas  
    └── auth-validations.ts  
```

---

## ✅ Best Practices

1. **Keep it framework agnostic:**  
   This layer should not depend on Next.js, React, or any other UI framework.

2. **Delegate business logic to the domain:**  
   Do not implement business rules here. Use domain services and entities for that.

3. **Handle orchestration and flow control:**  
   Actions in this layer should call use cases, handle application workflows, and coordinate data validation and transformation.

4. **Separate client and server actions:**  
   Client actions are executed in the browser, server actions are executed in API routes or server components.

---

## 📚 Example: Server Action for Vehicle Use Case

File: `application/actions/server/vehicle-actions.ts`

```typescript
import { createVehicle } from "@/domain/use-cases/vehicle.use-cases";
import { VehicleDto } from "@/domain/dto/vehicle.dto";
import { vehicleSchema } from "@/application/validations/vehicle-validations";

export async function createNewVehicle(data: VehicleDto) {
  const validatedData = vehicleSchema.parse(data);
  return await createVehicle(validatedData);
}
