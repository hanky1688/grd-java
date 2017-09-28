package com.hanky.study.context;

public interface Strategy<I,O> {
    O process(I input,String bizSeqNo);
    Strategy register(StrategyContext context);
}
