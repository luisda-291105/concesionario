/* 
configuracion 

spring.application.name=concesionario
spring.datasource.url="jdbc:mysql://localhost:3306/DBConcesionario"
spring.datasource.username="root"
spring.datasource.passwork=""
*/

package com.Cesde.concesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionarioApplication.class, args);
	}

}
