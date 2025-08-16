# 📁 app

The `app` folder is responsible for defining the routing, layouts, and pages of the application using the **Next.js App Router**. It follows the structure and conventions provided by Next.js, enabling a scalable and performant routing system that supports server-side rendering (SSR), static site generation (SSG), and client-side rendering (CSR).

This layer is considered part of the **Presentation Layer**, specifically handling the routing and composition of pages. It connects directly to the `presentation` layer (components and containers) but should not handle business logic directly.

---

## 📌 Responsibilities

- Define the routing structure for the application.
- Compose pages that are responsible for presenting data and handling UI events.
- Integrate layouts to provide consistent structure (headers, sidebars, footers).
- Implement Server Components and Client Components when necessary.
- Define API routes if serverless functions are required.

---

## 📂 Folder Structure Example

```plaintext

app
├── layout.tsx # Global layout applied to all routes
├── page.tsx # Home page or default route
├── api # Next.js API routes (optional)
│ └── auth
│ └── [...nextauth]
│ └── route.ts # Example of a NextAuth API route
└── dashboard # Protected dashboard area
├── layout.tsx # Layout specific to dashboard pages
├── page.tsx # Dashboard landing page
└── vehicle # Vehicle management section
├── [plate] # Dynamic route for vehicle details
│ └── page.tsx
└── create
└── page.tsx

```

---

## ✅ Best Practices

1. **Separate server and client components:**  
   Use Server Components by default and Client Components (`"use client";`) only when necessary (interactivity, hooks, etc.).

2. **Minimal logic in pages:**  
   Pages should orchestrate data fetching and render components but avoid containing business logic directly.

3. **Use layouts for shared UI:**  
   Layouts help maintain consistency and avoid code duplication across routes.

4. **Follow Next.js conventions:**  
   Stick to Next.js file and folder naming conventions for a predictable and scalable structure.

5. **Secure API routes:**  
   Place API routes within `app/api` and ensure proper authentication and authorization when needed.

---

## 📚 Example: Dashboard Vehicle Page

File: `app/dashboard/vehicle/[plate]/page.tsx`

```tsx
import { VehicleDetails } from "@/presentation/containers/vehicle/server/VehicleDetails";

export default function VehiclePage({ params }: { params: { plate: string } }) {
  return (
    <div>
      <h1>Vehicle Details - {params.plate}</h1>
      <VehicleDetails plate={params.plate} />
    </div>
  );
}
