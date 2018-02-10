package com.jasty;

import com.jasty.Repository.CustomerRepository;
import com.jasty.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

import static java.lang.System.exit;

@SpringBootApplication
public class JastyApplication {
	public static void main(String[] args) {
		SpringApplication.run(JastyApplication.class, args);
	}
}
