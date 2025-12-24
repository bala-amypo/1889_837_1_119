package com.example.demo.service.impl;

import com.example.demo.model.RiskThreshold;
import com.example.demo.service.RiskThresholdService;
import org.springframework.stereotype.Service;

@Service
public class RiskThresholdServiceImpl implements RiskThresholdService {

    @Override
    public RiskThreshold saveThreshold(RiskThreshold threshold) {
        return threshold;
    }
}
