package com.nikita_ogurnoy.lab_11.RandomCreator;

public class RandString {
    RandInt charRange;
    RandInt lenRange;
    int fixLen = 0;

    public RandString(char firstChar, char lastChar, int fixLen){
        charRange = new RandInt(firstChar,lastChar);
        this.fixLen = fixLen;
    }

    public RandString(char firstChar, char lastChar, int minLen, int maxLen){
        charRange = new RandInt(firstChar,lastChar);
        lenRange = new RandInt(minLen, maxLen);
    }

    String nextString(){
        int len = lenRange != null ? lenRange.nextInt() : fixLen;

        String randStr = "";
        for (int i = 0; i < len; i++) {
            randStr += (char) (int) charRange.nextInt();
        }
        return randStr;
    }


}
