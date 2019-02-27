package com.nikita_ogurnoy.lab_11;

import java.util.Date;

public class IncorrectRangeException extends Exception {
    Date throwDate;
    enum type {nonNaturalValue,minGreaterMax}
    type excType;

    IncorrectRangeException(type excType) {
        throwDate = new Date();
        this.excType = excType;
    }

    public Date getDate(String msg) {
        return throwDate;
    }

    public String toString(){
        return throwDate + " - возникла ошибка при вводе значений: " + excType;
    }
}
