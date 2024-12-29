package ie.atu.project.service;

import ie.atu.project.api.Region;
import ie.atu.project.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegions(){
        return regionRepository.findAll();
    }
}
