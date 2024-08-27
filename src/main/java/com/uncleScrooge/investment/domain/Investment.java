package com.uncleScrooge.investment.domain;

import ch.qos.logback.core.util.StringUtil;
import org.springframework.util.StringUtils;

public class Investment {
    private Integer id;
    private String name;
    private InvestmentType type;
    private Double value;
    private String broker;

    public Investment(String name, InvestmentType type, double value, String broker) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.broker = broker;
        validate();
    }

    private void validate() {
        if (this.value <= 0)
            throw new IllegalArgumentException("Value equal or lower then zero not supported");

        if (StringUtil.isNullOrEmpty(this.broker))
            throw new IllegalArgumentException("The field broker is mandatory");
    }
}
