package com.company;

public enum COUNTRY {
    POLAND ("polish","PL", 50000000),
    USA ("english", "US", 500000000),
    France("french","FR", 1500000),
    Finland("finish", "FI", 400000000);

    final String language;
    final String code;
    Double GDP;

    private COUNTRY(String language, String code, Double GDP)
    this.code = code;
    this.language = language;
    this.GDP = GDP;


}
public Double gdpInPLN(){
    return this.GDP * 4,27;
}
