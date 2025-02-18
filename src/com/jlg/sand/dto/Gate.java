package com.jlg.sand.dto;

public class Gate {
    public Gate(String gateType,
                int inputOneRow, int inputOneCol, String inputOneValue,
                int inputTwoRow, int inputTwoCol, String inputTwoValue,
                int outputRow, int outputCol, String outputValue) {
        this.gateType =gateType;
        this.inputOneRow = inputOneRow;
        this.inputOneCol = inputOneCol;
        this.inputOneValue = inputOneValue;
        this.inputTwoRow = inputTwoRow;
        this.inputTwoCol = inputTwoCol;
        this.inputTwoValue = inputTwoValue;
        this.outputRow = outputRow;
        this.outputCol = outputCol;
        this.outputValue = outputValue;
    }
    //public enum gateTypeEnum {AND, OR, NAND, NOR ,NOT};
    //public enum logicOptions {"true", "false", "unset"};
    private String gateType;
    private int inputOneRow;

    public int getInputOneCol() {
        return inputOneCol;
    }

    public void setInputOneCol(int inputOneCol) {
        this.inputOneCol = inputOneCol;
    }

    private int inputOneCol;
    private String inputOneValue;

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    public int getInputOneRow() {
        return inputOneRow;
    }

    public void setInputOneRow(int inputOneRow) {
        this.inputOneRow = inputOneRow;
    }

    public String getInputOneValue() {
        return inputOneValue;
    }

    public void setInputOneValue(String inputOneValue) {
        this.inputOneValue = inputOneValue;
    }

    public int getInputTwoRow() {
        return inputTwoRow;
    }

    public void setInputTwoRow(int inputTwoRow) {
        this.inputTwoRow = inputTwoRow;
    }

    public int getInputTwoCol() {
        return inputTwoCol;
    }

    public void setInputTwoCol(int inputTwoCol) {
        this.inputTwoCol = inputTwoCol;
    }

    public String getInputTwoValue() {
        return inputTwoValue;
    }

    public void setInputTwoValue(String inputTwoValue) {
        this.inputTwoValue = inputTwoValue;
    }

    public int getOutputRow() {
        return outputRow;
    }

    public void setOutputRow(int outputRow) {
        this.outputRow = outputRow;
    }

    public int getOutputCol() {
        return outputCol;
    }

    public void setOutputCol(int outputCol) {
        this.outputCol = outputCol;
    }

    public String getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    private int inputTwoRow;
    private int inputTwoCol;
    private String inputTwoValue;
    private int outputRow;
    private int outputCol;
    private String outputValue;
}
