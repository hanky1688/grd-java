package com.hanky.study.context;

public interface StrategyContext<K, S extends Strategy> {

    S register(K key, S strategy);

    S resolve(K key);

}
