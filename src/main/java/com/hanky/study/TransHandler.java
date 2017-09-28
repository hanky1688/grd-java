package com.hanky.study;

import com.hanky.study.strategy.TransStrategy;

public class TransHandler {

    public static void main(String[] args) {
        TransInput input = new TransInput();
        String bizSeqNo = "123";
        TransContext context = new TransContext();

        final TransStrategy strategy = context.resolve(Consts.TransType.DEPOSIT);
        final TransOutput output = strategy.process(input, bizSeqNo);
        System.out.println(output.getMsg());

    }
}
