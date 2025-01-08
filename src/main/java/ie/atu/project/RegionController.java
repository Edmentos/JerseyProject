package ie.atu.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RegionController {

    @Autowired
    private RegionRepository regionRepository;

    @GetMapping("/api/regions")
    public List<Region> getAllRegions(){
        return regionRepository.findAll();
    }
}
