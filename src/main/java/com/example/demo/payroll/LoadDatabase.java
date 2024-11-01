package com.example.demo.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
      return args -> {
          log.info("Carregando " + repository.save(new Employee("Gandalf", "mago")));
          log.info("Carregando " + repository.save(new Employee("Aragorn", "rei")));
          log.info("Carregando " + repository.save(new Employee("Legolas", "elfo")));
          log.info("Carregando " + repository.save(new Employee("Gimli", "anão")));
          log.info("Carregando " + repository.save(new Employee("Samwise Gamgi", "jardineiro")));
      };
  }
}
