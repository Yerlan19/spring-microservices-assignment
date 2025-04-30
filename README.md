# Spring Boot Microservices Project

**Student:** Zhakyp Yerlan  
**Branch:** zhakyp-microservice  
**Commit Hash:** 21ba13f (вставь свой)

## What I Built
- **Eureka Server:** Централизованный сервис регистрации (порт 8761).
- **API Gateway:** Прокси, маршрутизирует запросы на student-service (порт 8085).
- **Student-Service:** Отдаёт данные о студентах (порт 9090).

## Unique Feature
Реализован endpoint `/students/by-hobby/{hobby}`, который возвращает имя, хобби и любимый напиток. Это связано с моими личными интересами.

## Why These Technologies
- **Eureka** помогает регистрировать и находить микросервисы автоматически.
- **API Gateway** даёт единый вход и управляет маршрутизацией.

## How to Run
1. Клонируй проект и перейди в папку:
```bash
git clone https://github.com/Yerlan19/spring-microservices-assignment.git
cd spring-microservices-assignment
