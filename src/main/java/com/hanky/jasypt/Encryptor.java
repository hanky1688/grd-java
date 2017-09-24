package com.hanky.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

public class Encryptor {
    private Encryptor() {

    }

    public static void main(String[] args) {
        encryptedStr();

        testCheckPassword(); //vkP26iDSw61X6owplZSJc3VMd0gbGxHERqHns1lw1YJyVVAmGvmxa8riSIieGhYR
//        testEncryptText();

    }

    public static void encryptedStr() {
        System.out.println("Encryptor.encryptedStr");
        StandardPBEStringEncryptor encryptor = encryptor();
        final String encryptStr = encryptor.encrypt("13390898777");
        final String decryptStr = encryptor.decrypt(encryptStr);

        System.out.println("encryptStr = [" + encryptStr + "]");
        System.out.println("decryptStr = [" + decryptStr + "]");
    }

    public static void testCheckPassword() {
        System.out.println("Encryptor.testCheckPassword");
        String srcUsePwd = "mpbs3244123";
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        final String encryptPwd = passwordEncryptor.encryptPassword(srcUsePwd);
        System.out.println("encryptPwd:" + encryptPwd);

        final boolean result = passwordEncryptor.checkPassword(srcUsePwd, encryptPwd);
        if (result) {
            System.out.println("password is correct!");
        } else {
            System.out.println("password is error!");
        }
    }


    public static StandardPBEStringEncryptor encryptor() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("123");
        return encryptor;
    }

    public static void testEncryptText() {
        String text = "hankycai";

        String key = "123";
        StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
        textEncryptor.setPassword(key);
        final String encrypt = textEncryptor.encrypt(text);

        final String decrypt = textEncryptor.decrypt(encrypt);

        System.out.println("text:" + text);
        System.out.println("encrypt text; " + encrypt);
        System.out.println("decrypt text: " + decrypt);

    }

    public static void encryptedText(String myStr) {

        String myEncryptionPassword = "123";
        StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
        textEncryptor.setPassword(myEncryptionPassword);
        String myEncryptedText = textEncryptor.encrypt(myStr);

        System.out.println("myStr = [" + myStr + "]");
        System.out.println("myEncryptedText = [" + myEncryptedText + "]");

        String plainText = textEncryptor.decrypt(myEncryptedText);
        System.out.println("plainText = [" + plainText + "]");
    }
}
