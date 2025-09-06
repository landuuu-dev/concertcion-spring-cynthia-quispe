package org.concertcion.api.eventos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoConnectionTest implements CommandLineRunner {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            mongoTemplate.executeCommand("{ ping: 1 }");
            System.out.println("✅ Conexión a MongoDB Atlas exitosa!");
            System.out.println("📊 Base de datos: " + mongoTemplate.getDb().getName());
        } catch (Exception e) {
            System.out.println("❌ Error de conexión a MongoDB: " + e.getMessage());
            e.printStackTrace();
        }
    }
}