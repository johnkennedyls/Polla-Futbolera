# 📁 infrastructure

The `infrastructure` layer contains the technical implementations that allow the application to interact with external systems. This includes APIs, databases, authentication providers, and other third-party services. It provides concrete implementations for the contracts defined in the `domain` layer.

---

## 📌 Responsibilities

- Implement gateways for external API communication.
- Handle persistence logic such as database access and data storage.
- Provide concrete implementations for domain contracts.
- Remain decoupled from the domain and application layers through interfaces.

---

## 📂 Folder Structure Example

infrastructure  
├── gateways                      # External service integrations  
│   └── HttpGateway.ts  
└── persistence                   # Data persistence and repositories  
    └── .gitkeep  

---

## ✅ Best Practices

1. **Respect dependency rules:**  
   This layer can depend on application and domain contracts, but not the other way around.

2. **Follow interface contracts strictly:**  
   Ensure the implementations align with the interfaces defined in the domain layer.

3. **Isolate infrastructure concerns:**  
   Keep third-party dependencies and SDKs encapsulated within this layer.

---

## 📚 Example: HTTP Gateway Implementation

File: `infrastructure/gateways/HttpGateway.ts`

```typescript
import axios from "axios";

export class HttpGateway {
  async get(url: string, params?: any) {
    const response = await axios.get(url, { params });
    return response.data;
  }

  async post(url: string, data: any) {
    const response = await axios.post(url, data);
    return response.data;
  }
}
