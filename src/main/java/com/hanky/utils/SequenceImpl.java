package com.hanky.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;


public class SequenceImpl implements Sequence {


    @Override
    public String genLogId() {

        return next("1");
    }

    private synchronized String next(String type){
        final String nowDate = DateUtils.formatDate(new Date(), "yyMMdd");

        final long timestamp = System.currentTimeMillis();

        return StringUtils.join(nowDate,timestamp);
    }

    public static void main(String[] args) {
//        final String nowDate = DateUtils.formatDate(new Date(), "yyMMdd");
//
//        System.out.println(nowDate);
//        final long timeMillis = System.currentTimeMillis();
//        System.out.println(timeMillis);
//        String ret = StringUtils.join(nowDate,"1",timeMillis);
//        System.out.println(ret);
        Sequence sequence = new SequenceImpl();
        final String logId = sequence.genLogId();
        System.out.println(logId);
    }
}
