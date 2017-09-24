package com.hanky.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptorTest {
    public static void main(String[] args) {
        StandardPBEStringEncryptor encryptor = Encryptor.encryptor();
        final String encryptStr = encryptor.encrypt("13390898777");
        final String decryptStr = encryptor.decrypt(encryptStr);

        System.out.println("encryptStr = [" + encryptStr + "]");
        System.out.println("decryptStr = [" + decryptStr + "]");
    }
}
