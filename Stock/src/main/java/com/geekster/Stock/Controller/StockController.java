package com.geekster.Stock.Controller;

import com.geekster.Stock.Model.Stock;
import com.geekster.Stock.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;
    @GetMapping(value="/type/{stockType}")
    public List<Stock> getStocksBasedOnType(@PathVariable String stockType){
        return stockService.getStocksByType(stockType);
    }
    @GetMapping(value="abovePrice/price/{price}/lowerData/date/{date}")
    public List<Stock>getStockAbovePriceLowerDate(@PathVariable Double price,@PathVariable String date){
        return stockService.getStocksAbovePriceAndLowerDate(price, date);
    }
    @GetMapping(value = "/cap/{capPercentage}")
    public List<Stock>getAllStockAboveMarketCap(@PathVariable Double capPercentage){
        return stockService.getAllStocksAboveMarketCap(capPercentage);
    }
    @PostMapping(value = "/")
    public String insertStocks(@RequestBody  List<Stock>stockList){
        return stockService.addStocks(stockList);
    }
    @PutMapping(value="/marketCap/{marketCap}/id/{id}")
    public void insertStocks(@PathVariable Double marketCap,@PathVariable Integer id){
         stockService.updateMarketCap(marketCap,id);
    }
    @DeleteMapping(value = "/ownerCount/{count}")
    public void removeStocksByOwnerCount(@PathVariable Integer count){
        stockService.deleteStocksBasedOnCount(count);
    }
}
