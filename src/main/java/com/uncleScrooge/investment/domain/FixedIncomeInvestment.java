package com.uncleScrooge.investment.domain;

public class FixedIncomeInvestment extends Investment{

    private Double taxReturn;
    private FixedIncomeType type;

    public FixedIncomeInvestment(String name, double value, String broker) {
        super(name, value, broker);
    }
}
