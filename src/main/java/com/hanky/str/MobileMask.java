package com.hanky.str;

public class MobileMask {

    public static void main(String[] args) {
        String phone = "13123456789";
        String phoneNumber = genMobileMask(phone);
        System.out.println("正则phone中4*：" + phoneNumber);
        System.out.println(genMobileMask("1234444"));
        System.out.println(genMobileMask("12345678901234"));
        System.out.println(genMobileMask("1234aaaaa01234"));
    }

    private static String genMobileMask(String phone) {
        String phoneNumber = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        return phoneNumber;
    }
}
