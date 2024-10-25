/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public interface SquareMode {
    public void setKey (byte[] key);
    public void setIV (byte[] iv);
    //public void encrypt (byte in[], int in_offset, byte out[], int out_offset, int length);
    //public void decrypt (byte in[], int in_offset, byte out[], int out_offset, int length);
    public void encrypt (byte buf[], int offset, int length);
    public void decrypt (byte buf[], int offset, int length);
}
