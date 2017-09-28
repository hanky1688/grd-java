package com.hanky.study;

import com.hanky.study.context.Strategy;
import com.hanky.study.context.StrategyContext;
import com.hanky.study.strategy.DepositTransStrategy;
import com.hanky.study.strategy.TransStrategy;
import com.hanky.study.strategy.WithdrawTransStrategy;

import java.util.HashMap;
import java.util.Map;

public class TransContext implements StrategyContext<String, TransStrategy> {
    private Map<String, TransStrategy> strategyMap = new HashMap<>();

    public TransContext() {
        strategyMap.put(Consts.TransType.DEPOSIT, new DepositTransStrategy());
        strategyMap.put(Consts.TransType.WITHDRAW, new WithdrawTransStrategy());

    }

    @Override
    public TransStrategy register(String key, TransStrategy strategy) {
        return strategyMap.put(key, strategy);
    }

    @Override
    public TransStrategy resolve(String key) {
        return strategyMap.get(key);
    }
}
