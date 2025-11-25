package ru.netology.confitionalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"ru.netology.confitionalApp",
		"ru.netology.controller",
		"ru.netology.config",
		"ru.netology.profile"
})
public class ConfitionalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfitionalAppApplication.class, args);
	}
}
