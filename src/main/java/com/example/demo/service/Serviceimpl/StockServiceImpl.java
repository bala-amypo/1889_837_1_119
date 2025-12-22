package com.example.demo.service.serviceimpl;

import com.example.demo.model.Stock;
import com.example.demo.repository.StockRepository;
import com.example.demo.service.StockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock createStock(Stock stock) {
        stock.setIsActive(true);
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Long id, Stock stock) {
        Stock existing = stockRepository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setTicker(stock.getTicker());
        existing.setCompanyName(stock.getCompanyName());
        existing.setSector(stock.getSector());
        return stockRepository.save(existing);
    }

    @Override
    public Stock getStockById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public void deactivateStock(Long id) {
        Stock stock = stockRepository.findById(id).orElse(null);
        if (stock != null) {
            stock.setIsActive(false);
            stockRepository.save(stock);
        }
    }
}