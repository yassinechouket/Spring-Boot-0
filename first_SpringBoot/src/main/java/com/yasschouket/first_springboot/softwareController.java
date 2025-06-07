package com.yasschouket.first_springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software")
public class softwareController {
    private final softwareService Service;

    public softwareController(softwareService service) {
        Service = service;
    }

    @GetMapping
    public List<software> getSoftware() {
        return Service.getAllsoftware();
    }
    @GetMapping("{id}")
    public software getSoftwareById(@PathVariable Integer id) {
        return Service.getAllSoftwareById(id);
    }

    @PostMapping
    public void addSoftwre(@RequestBody software Software) {
        softwareService.insertSoftware(Software);
    }


}
