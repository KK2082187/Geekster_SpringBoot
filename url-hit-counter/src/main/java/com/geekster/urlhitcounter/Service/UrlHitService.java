package com.geekster.urlhitcounter.Service;

import com.geekster.urlhitcounter.Model.UrlHitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.HashMap;

import java.util.Map;


@Service
public class UrlHitService {
  static Map<String,Integer> map = new HashMap<>();

  public UrlHitModel getCount(String userName){
      int count = map.getOrDefault(userName,0)+1;
      map.put(userName,count);
      UrlHitModel urlhitmodel = new UrlHitModel(userName,count);
      return urlhitmodel;
  }


}
