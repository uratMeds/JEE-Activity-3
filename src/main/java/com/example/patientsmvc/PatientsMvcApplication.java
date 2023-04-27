package com.example.patientsmvc;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args ->{
            patientRepository.save(new Patient(null , "Tarik" , new Date() , true , 11));
            patientRepository.save(new Patient(null , "Ibtissam" , new Date() , false , 17));
            patientRepository.save(new Patient(null , "Soha" , new Date() , true , 73));
            patientRepository.save(new Patient(null , "Yasser" , new Date() , false , 99));

            patientRepository.findAll().forEach(p->{
                System.out.println("------------------------------------");
                System.out.println(p.getId());
                System.out.println(p.getNom());
                System.out.println(p.getDateNaissance());
                System.out.println(p.isMalade());
                System.out.println(p.getScore());
                System.out.println("------------------------------------");
            });




        };
    }

}
