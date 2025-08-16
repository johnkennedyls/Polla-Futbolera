# 📁 presentation

The `presentation` layer is responsible for everything related to the user interface. It contains reusable components, containers that handle data fetching and business logic integration, UI-specific constants, functions, styles, and TypeScript types.

This layer interacts with the `application` layer to request data and perform actions, and it displays the results to the user.

---

## 📌 Responsibilities

- Provide reusable UI components.
- Implement containers that integrate business logic and pass data to components.
- Manage UI constants such as routes, labels, and metadata.
- Define utility functions for UI behavior.
- Handle global and component-specific styles.
- Declare types for UI components and props.

---

## 📂 Folder Structure Example

presentation  
├── components                      # Reusable UI components  
│   ├── common                     # Common/shared components  
│   │   ├── app-sidebar.tsx  
│   │   ├── date-picker.tsx  
│   │   ├── logout-button.tsx  
│   │   ├── main-header.tsx  
│   │   ├── modal.tsx  
│   │   └── table.tsx  
│   ├── layout                     # Layout-related components  
│   │   └── .gitkeep  
│   └── ui                         # Shadcn/UI components  
│       ├── breadcrumb.tsx  
│       ├── button.tsx  
│       ├── calendar.tsx  
│       ├── card.tsx  
│       ├── checkbox.tsx  
│       ├── dialog.tsx  
│       ├── dropdown-menu.tsx  
│       ├── form.tsx  
│       ├── icons.tsx  
│       ├── input.tsx  
│       ├── label.tsx  
│       ├── popover.tsx  
│       ├── select.tsx  
│       ├── separator.tsx  
│       ├── sheet.tsx  
│       ├── sidebar.tsx  
│       ├── skeleton.tsx  
│       ├── toast.tsx  
│       ├── toaster.tsx  
│       ├── tooltip.tsx  
│       ├── use-mobile.tsx  
│       └── use-toast.ts  
├── constants                      # UI constants  
│   ├── auth.constants.ts  
│   └── metadata.constants.ts  
├── containers                     # Components connected to business logic  
│   ├── auth  
│   │   ├── client  
│   │   │   ├── Panel.tsx  
│   │   │   └── SignIn.tsx  
│   │   └── server  
│   │       ├── Auth.tsx  
│   │       ├── Providers.tsx  
│   │       └── SignUp.tsx  
│   ├── category  
│   │   ├── client  
│   │   │   ├── CategoryDashboard.tsx  
│   │   │   ├── CategoryEditForm.tsx  
│   │   │   └── CategoryForm.tsx  
│   │   └── server  
│   │       ├── CategoryInformation.tsx  
│   │       └── CategorySelector.tsx  
│   ├── invoice  
│   │   ├── client  
│   │   │   └── InvoiceDashboard.tsx  
│   │   └── server  
│   │       └── InvoiceInformation.tsx  
│   ├── registry  
│   │   ├── client  
│   │   │   └── RegistryDashboard.tsx  
│   │   └── server  
│   │       └── RegistryInformation.tsx  
│   ├── toll  
│   │   ├── client  
│   │   │   ├── TollDashboard.tsx  
│   │   │   ├── TollEditForm.tsx  
│   │   │   └── TollForm.tsx  
│   │   └── server  
│   │       └── TollInformation.tsx  
│   ├── vehicle  
│   │   ├── client  
│   │   │   ├── VehicleDashboard.tsx  
│   │   │   ├── VehicleEditor.tsx  
│   │   │   └── VehicleForm.tsx  
│   │   └── server  
│   │       ├── VehicleDetails.tsx  
│   │       └── VehicleList.tsx  
├── functions                      # Frontend utility functions  
│   └── get-relative-path.ts  
├── lib                            # Custom frontend hooks and helpers  
│   └── utils.ts  
├── styles                         # Global and component styles  
│   └── global.css  
└── types                          # UI-specific TypeScript types  
    └── Table.ts  

---

## ✅ Best Practices

1. **Keep components pure:**  
   Components should be stateless and reusable wherever possible.

2. **Separate concerns between components and containers:**  
   Containers should manage state and pass props to presentational components.

3. **Follow consistent naming conventions:**  
   Ensure consistency in naming components, files, and folders.

4. **Avoid business logic in the presentation layer:**  
   Delegate logic to the application layer and focus on rendering UI.

---

## 📚 Example: Reusable Button Component

File: `presentation/components/ui/button.tsx`

```tsx
import React from "react";

type ButtonProps = {
  label: string;
  onClick: () => void;
};

export const Button = ({ label, onClick }: ButtonProps) => {
  return (
    <button onClick={onClick} className="btn btn-primary">
      {label}
    </button>
  );
};
