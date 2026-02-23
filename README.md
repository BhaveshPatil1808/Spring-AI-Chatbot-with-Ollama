# 🚀 Spring AI Chatbot with Ollama

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green?logo=springboot)](https://spring.io/projects/spring-boot)
[![Spring AI](https://img.shields.io/badge/Spring%20AI-ChatClient-orange?logo=spring)](https://spring.io/projects/spring-ai)
[![Ollama](https://img.shields.io/badge/Ollama-Local%20LLM-purple)](https://ollama.ai)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

A simple **Spring Boot + Spring AI** chatbot powered by **Ollama** running locally.  
This project demonstrates how to integrate Spring AI with a locally hosted LLM using Ollama and expose it via a REST API.

---

## 🛠 Tech Stack
- ☕ **Java 17**  
- 🌱 **Spring Boot**  
- 🤖 **Spring AI**  
- 🧠 **Ollama (Local LLM Runtime)**  
- 🌐 **REST API**  

---

## 📦 Features
✅ Connects to Ollama running locally  
✅ Uses `ChatClient` from Spring AI  
✅ Simple REST endpoint for chatting  
✅ Configurable model & temperature  
✅ Lightweight and easy to extend  

---

## ⚙️ Prerequisites
Make sure you have:
- Java 17+  
- Maven  
- Ollama installed  

---

## 🧠 Install & Run Ollama

```bash
# 1️⃣ Install Ollama (from official site)
# 2️⃣ Pull a model
ollama pull codellama

# 3️⃣ Start Ollama
ollama run codellama
Ollama runs at: http://localhost:11434


🏃 Run the Spring Boot Application
mvn spring-boot:run

App runs at: http://localhost:8081

💬 API Usage

Endpoint
GET /chat?q=your_question_here


⚙️ Configuration
application.properties file

spring.application.name=SpringAi
server.port=8081
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.options.model=codellama:latest
spring.ai.ollama.chat.options.temperature=0.7

You can change:

model

temperature

server.port

🧪 How It Works
User sends a request to /chat

Spring AI ChatClient sends prompt to Ollama

Ollama processes using the selected model

Response is returned via REST API

⚠️ Notes
Stateless chatbot (no conversation memory)

Ollama must be running before starting the app

If you change models, run ollama pull <model-name> first


🚀 Future Improvements
🗂 Add conversation memory

🔄 Add streaming responses

🌐 Create a simple web UI

🐳 Add Docker support

📚 Add RAG (Retrieval-Augmented Generation)

👨‍💻 Author
Bhavesh
