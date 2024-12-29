package ie.atu.project.controller;

import ie.atu.project.api.Region;
import ie.atu.project.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/api/regions")
    public List<Region> getAllRegions(){
        return regionService.getAllRegions();
    }
}
