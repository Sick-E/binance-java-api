package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossMarginData {

    private int vipLevel;
    private String coin;
    private boolean transferIn;
    private boolean borrowable;
    private String dailyInterest;
    private String yearlyInterest;
    private String borrowLimit;
    private List<String> marginablePairs;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("vipLevel", vipLevel)
                .append("coin", coin)
                .append("transferIn", transferIn)
                .append("borrowable", borrowable)
                .append("dailyInterest", dailyInterest)
                .append("yearlyInterest", yearlyInterest)
                .append("borrowLimit", borrowLimit)
                .append("marginablePairs",
                        Optional.ofNullable(marginablePairs).orElse(Collections.emptyList())
                                .stream()
                                .map(Object::toString)
                                .collect(Collectors.joining(", ")))
                .toString();
    }

    public List<String> getMarginablePairs() {
        return marginablePairs;
    }

    public void setMarginablePairs(List<String> marginablePairs) {
        this.marginablePairs = marginablePairs;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public boolean isTransferIn() {
        return transferIn;
    }

    public void setTransferIn(boolean transferIn) {
        this.transferIn = transferIn;
    }

    public boolean isBorrowable() {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
    }

    public String getDailyInterest() {
        return dailyInterest;
    }

    public void setDailyInterest(String dailyInterest) {
        this.dailyInterest = dailyInterest;
    }

    public String getYearlyInterest() {
        return yearlyInterest;
    }

    public void setYearlyInterest(String yearlyInterest) {
        this.yearlyInterest = yearlyInterest;
    }

    public String getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(String borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

}
