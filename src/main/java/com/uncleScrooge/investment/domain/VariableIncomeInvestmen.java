package com.uncleScrooge.investment.domain;

public class VariableIncomeInvestmen extends Investment{

    private Integer qtd;
    private Double unitValue;
    private String company;

    public VariableIncomeInvestmen(String name, double value, String broker) {
        super(name, value, broker);
    }
}
