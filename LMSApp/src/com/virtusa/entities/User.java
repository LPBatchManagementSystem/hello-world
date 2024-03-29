package com.virtusa.entities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User {
    private String userId;
 
    private String name;

    private String password;

    public User() {
    }

    public User(String userId, String password) {
        this.userId = userId;
        setPassword(password);
    }

    /**
     * Encodes a string to MD5
     *
     * @param str String to encode
     * @return Encoded String
     */
    private static String toMD5(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String to encrypt cannot be null or empty.");
        }
        StringBuilder hexString = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash = md.digest();
            for (byte aHash : hash) {
                if ((0xff & aHash) < 0x10) {
                    hexString.append("0").append(Integer.toHexString((0xFF & aHash)));
                } else {
                    hexString.append(Integer.toHexString(0xFF & aHash));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.printf("This string cannot be encrypted to md5", str);
        }
        return hexString.toString();
    }

    private boolean isIllegal(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;,\\[\\].<>/?！￥…（）—【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isIllegal(password)) {
            throw new IllegalArgumentException("Illegal chars in password");
        }

        if (password.equals(this.password)) {
            throw new IllegalArgumentException("Reusing passwords");
        }
        this.password = toMD5(password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean res = this.getClass() == obj.getClass();
        if (!res) {
            return false;
        }
        User other = (User) obj;
        return this.userId.equals(other.userId) && this.password.equals(other.password);
    }

    @Override
    public String toString() {
        return String.format("UserID: %s Name: %s", userId, name);
    }
}
