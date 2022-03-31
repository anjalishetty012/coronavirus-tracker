package io.learn.coronavirustracker.controllers;

import io.learn.coronavirustracker.model.locationStats;
import io.learn.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.List;

@Controller
public class homeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    @GetMapping("/")
    public String home(Model model){

       //model.addAttribute("testName","TEST");
        List<locationStats> allStats=coronaVirusDataService.getAllStats();
        int totalCases=allStats.stream().mapToInt(stat ->stat.getLatestTotalCases()).sum();
       model.addAttribute("locationStats",allStats );
        model.addAttribute("totalCases",totalCases );

        return "home";
    }
}
