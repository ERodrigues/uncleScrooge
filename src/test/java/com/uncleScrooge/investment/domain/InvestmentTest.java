package com.uncleScrooge.investment.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentTest {

    private Investment investment;

    @Test
    public void should_return_erro_when_value_of_investment_is_equal_or_lower_then_zero(){
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> investment = new Investment("Test Investment", InvestmentType.FIXED_INCOME, 0, "Test"));
        assertEquals("Value equal or lower then zero not supported", e.getMessage());
    }

    @Test
    public void should_return_erro_when_broker_of_investment_is_not_informed(){
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> investment = new Investment("Test Investment", InvestmentType.FIXED_INCOME, 1, ""));
        assertEquals("The field broker is mandatory", e.getMessage());
    }

}