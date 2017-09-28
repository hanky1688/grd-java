package com.hanky.study.strategy;

import com.hanky.study.Consts;
import com.hanky.study.TransInput;
import com.hanky.study.TransOutput;
import com.hanky.study.context.Strategy;
import com.hanky.study.context.StrategyContext;

public class DepositTransStrategy extends TransStrategy {


    @Override
    public TransOutput process(TransInput input, String bizSeqNo) {
        TransOutput output = new TransOutput();
        output.setMsg("call DepositTransStrategy");
        return output;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Strategy register(StrategyContext context) {
        return context.register(Consts.TransType.DEPOSIT,this);
    }
}
