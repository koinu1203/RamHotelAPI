package com.ram.hotel.proyect;

import com.ram.hotel.proyect.models.employee;
import com.ram.hotel.proyect.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RamHotelProyectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RamHotelProyectApplication.class, args);
    }

    public CommandLineRunner run(EmployeeRepository repository){
        return  (args ->{
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
        });
    }

    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new employee("Daniel","Ortiz"));
    }
}
