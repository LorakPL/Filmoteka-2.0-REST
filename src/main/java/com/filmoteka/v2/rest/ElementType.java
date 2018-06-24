package com.filmoteka.v2.rest;

public enum ElementType {
    MOVIE("Film"),
    SERIES("Serial");

    ElementType(String type){
        this.type = type;
    }

    private String type;

    public String getElementType(){
        return this.type;
    }

    public String toString(){
        return this.type;
    }
}
