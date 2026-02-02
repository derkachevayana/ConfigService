package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("=".repeat(60));
        System.out.println("✅ Config Server запущен успешно!");
        System.out.println("=".repeat(60));
        System.out.println("🔧 Конфигурационные параметры:");
        System.out.println("  • Порт: 8888");
        System.out.println("  • Режим: Native (classpath)");
        System.out.println("  • Директория конфигов: classpath:/config/");
        System.out.println("=".repeat(60));
        System.out.println("📡 Доступные эндпоинты:");
        System.out.println("  • Конфиг user-service: http://localhost:8888/user-service/default");
        System.out.println("  • Конфиг notification-service: http://localhost:8888/notification-service/default");
        System.out.println("  • Здоровье: http://localhost:8888/actuator/health");
        System.out.println("=".repeat(60));
    }
}
