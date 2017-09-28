package com.hanky.study.strategy;

import com.hanky.study.Consts;
import com.hanky.study.TransContext;
import com.hanky.study.TransInput;
import com.hanky.study.TransOutput;
import com.hanky.study.context.Strategy;
import com.hanky.study.context.StrategyContext;

public class WithdrawTransStrategy extends TransStrategy {


    @Override
    public TransOutput process(TransInput input, String bizSeqNo) {
        TransOutput output = new TransOutput();
        output.setMsg("call WithdrawTransStrategy");
        return output;
    }

    @Override
    public Strategy register(StrategyContext context) {
        return context.register(Consts.TransType.WITHDRAW, this);
    }
}
