package com.nikita_ogurnoy.lab_11.RandomCreator;

public class RandText {
    RandInt wordsInRow;
    RandString word;
    int rowNum;

    public RandText(int minWordsInRow, int maxWordsInRow, RandString randWord){
        wordsInRow = new RandInt(minWordsInRow, maxWordsInRow);
        word = randWord;
    }

    public String nextText(int rowNum){
        String text = "";

        for(int i = 0; i < rowNum; i++){
            int wordsNum = wordsInRow.nextInt();
            for (int j = 0; j < wordsNum; j++)
                text += word.nextString() + ' ';
            text += '\n';
        }

        return text;
    }

}
