package com.geekster.Stock.Service;

import com.geekster.Stock.Model.Stock;
import com.geekster.Stock.Repository.IStockRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {
    @Autowired
    IStockRepository iStockRepository;
    public List<Stock> getStocksByType(String stockType){
        return iStockRepository.findByStockType(stockType);
    }
    public String addStocks(List<Stock>stockList ){
        Iterable<Stock>list = iStockRepository.saveAll(stockList);
        if(list != null){
            return "Added successfully !!!";
        }else{
           return  "Could not be added !!!";
        }
    }
    public List<Stock>getStocksAbovePriceAndLowerDate(Double price, String date){
        LocalDateTime myDate = LocalDateTime.parse(date);
        return iStockRepository.findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(price,myDate);
    }
    public List<Stock>getAllStocksAboveMarketCap(Double capPercentage){
        return iStockRepository.getAllStocksAboveMarketCap(capPercentage);
    }
    @Transactional
    public void updateMarketCap(Double marketCap,Integer id){
        iStockRepository.updateMarketCapById(marketCap,id);
    }

    @Transactional
    public void deleteStocksBasedOnCount(Integer count){
        iStockRepository.deleteStocksBasedOnCount(count);
    }
}
