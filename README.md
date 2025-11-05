# 🧠 RecallHub — The Knowledge Memory System

> "Your mind, versioned and searchable."

RecallHub is a **secure knowledge management backend** built with **Java 21 + Spring Boot 3 + PostgreSQL**.  
It’s designed as a *digital memory vault* — a backend system that stores, searches, and analyzes knowledge entries for developers.

---

## 🚀 Tech Stack

| Layer | Technology |
|:------|:------------|
| Language | **Java 21** |
| Framework | **Spring Boot 3.3.4** |
| Database | **PostgreSQL 16** |
| Build Tool | **Maven 3.9.6** |
| Testing | **JUnit 5 + Mockito** |
| API Docs | **SpringDoc / Swagger UI** |
| Deployment | **Docker (planned)** |

---

## 🧱 Architecture Overview

<img width="428" height="213" alt="image" src="https://github.com/user-attachments/assets/9151272f-c61c-4af6-854c-f941b6d6bff7" />


The architecture follows the **Layered (N-Tier) pattern**:
`Controller → Service → Repository → Database`

---

## 🧩 Features Implemented

✅ Spring Boot project setup  
✅ PostgreSQL connection via JPA  
✅ First REST endpoint: `/api/health`  
✅ Maven build pipeline  
✅ Ready for Docker & CI/CD integration  

---

## 🧠 Next Features (Upcoming Phases)

- 🔐 JWT Authentication + Role Management  
- 📚 Knowledge Vault CRUD + Search Engine  
- 📊 Analytics module (usage statistics, keyword frequency)  
- 🐳 Docker deployment  
- ☁️ GitHub Actions (CI/CD pipeline)

---

## ⚙️ Run Locally

**1️⃣ Clone the repository**

git clone https://github.com/KevPrieto/RecallHub.git
cd RecallHub

Start PostgreSQL locally
psql -U recallhub_user -d recallhub_db


3️⃣ Run the app
mvn spring-boot:run


4️⃣ Test the endpoint
Open in your browser:

http://localhost:8080/api/health

Expected response:

RecallHub is running!
