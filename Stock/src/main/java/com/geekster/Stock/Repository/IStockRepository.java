package com.geekster.Stock.Repository;

import com.geekster.Stock.Model.Stock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IStockRepository extends CrudRepository<Stock,Integer> {
    public List<Stock>findByStockType(String stockType);

   public List<Stock>findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(Double price, LocalDateTime date);

   @Query(value="select*from STOCK where STOCK_MARKET_CAP >: capPercentage",nativeQuery = true)
    public List<Stock>getAllStocksAboveMarketCap(Double capPercentage);

    @Modifying
    @Query(value="update STOCK set STOCK_MARKET_CAP =: capPercentage where Stock_id:id",nativeQuery = true)
    public void updateMarketCapById(Double capPercentage, Integer id);
    @Modifying
    @Query(value="delete from STOCK where Stock_owner_count <: clientCount",nativeQuery = true)
    public void deleteStocksBasedOnCount(Integer clientCount);
}
