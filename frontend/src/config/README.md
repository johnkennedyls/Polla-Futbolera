# 📁 config

The `config` layer contains the global configuration files required by the application. It centralizes environment variables, third-party integrations, and system-wide settings. By isolating these configurations, the application becomes easier to maintain and configure across different environments (development, staging, production).

---

## 📌 Responsibilities

- Define and export environment variables.
- Provide configuration for authentication providers and external services.
- Centralize global application settings.
- Ensure sensitive data is securely managed and not hardcoded in the codebase.

---

## 📂 Folder Structure Example

config  
└── auth.config.ts                # Configuration for authentication strategies and providers  

---

## ✅ Best Practices

1. **Do not hardcode sensitive information:**  
   Use environment variables and load them securely in configuration files.

2. **Keep configuration files clean and specific:**  
   Separate concerns by grouping related configuration in separate files (e.g., auth, database, API endpoints).

3. **Use TypeScript for type safety:**  
   Define types for configuration objects to avoid runtime errors.

---

## 📚 Example: Authentication Configuration

File: `config/auth.config.ts`

```typescript
export const authOptions = {
  providers: [
    // Example: NextAuth provider configuration
  ],
  pages: {
    signIn: "/auth/signin",
  },
  session: {
    strategy: "jwt",
  },
};
