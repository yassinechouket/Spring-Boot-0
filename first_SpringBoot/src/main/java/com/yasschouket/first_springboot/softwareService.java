package com.yasschouket.first_springboot;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class softwareService {

    private static softwareRepository repository;

    public softwareService(softwareRepository repository) {
        this.repository = repository;
    }

    public List<software> getAllsoftware(){
        return repository.findAll();
    }
    public static void insertSoftware(software software){
        repository.save(software);
    }

    public software getAllSoftwareById(Integer id) {
        return repository.findById(id).orElseThrow(()-> new IllegalStateException(id + " not found"));
    }
}
