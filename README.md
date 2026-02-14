🚀 Spring AI Chatbot with Ollama

A simple Spring Boot + Spring AI chatbot powered by Ollama running locally.

This project demonstrates how to integrate Spring AI with a locally hosted LLM using Ollama and expose it via a REST API.

🛠 Tech Stack

Java 17

Spring Boot

Spring AI

Ollama (Local LLM Runtime)

REST API

📦 Features

Connects to Ollama running locally

Uses ChatClient from Spring AI

Simple REST endpoint for chatting

Configurable model & temperature

Lightweight and easy to extend

⚙️ Prerequisites
Before running this project, ensure you have:

Java 17+

Maven

Ollama installed

🧠 Install & Run Ollama

1️⃣ Install Ollama

Download from the official site.

2️⃣ Pull a Model

ollama pull codellama

3️⃣ Start Ollama

ollama run codellama

Ollama runs at:http://localhost:11434

🏃 Run the Spring Boot Application

mvn spring-boot:run

The app runs on:http://localhost:8081

💬 API Usage

Endpoint

GET /chat?q=your_question_here

Example

http://localhost:8081/chat?q=Explain%20Spring%20Boot


Response

"Spring Boot is a framework that..."

⚙️ Configuration

application.properties

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

Ollama processes using selected model

Response is returned via REST API

⚠️ Notes

This chatbot is stateless (no conversation memory).

Make sure Ollama is running before starting the app.

If you change models, run ollama pull <model-name> first.

🚀 Future Improvements

Add conversation memory

Add streaming responses

Create a simple web UI

Add Docker support

Add RAG (Retrieval-Augmented Generation)


👨‍💻 Author
Bhavesh






