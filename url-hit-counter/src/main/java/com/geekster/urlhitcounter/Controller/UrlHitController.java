package com.geekster.urlhitcounter.Controller;

import com.geekster.urlhitcounter.Model.UrlHitModel;
import com.geekster.urlhitcounter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;
   @GetMapping("/username/{username}/count")
    public UrlHitModel getCounter(String userName){
       return  urlHitService.getCount(userName);
       }

}
