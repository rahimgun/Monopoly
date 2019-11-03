package com.company.board;

public class TaxSquare extends Square {

    private int taxAmount;

    public TaxSquare(String name, int index, int taxAmount) {
        super(name, index);
        this.taxAmount = taxAmount;
    }

    public int getTaxtAmount() {
        return taxAmount;
    }

    public void setTaxtAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setIndex(int index) {
        super.setIndex(index);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getIndex() {
        return super.getIndex();
    }




}


