package com.example;

import java.util.Date;

public class FinanceContract extends AbstractDocument {
  private int monthTotal;
  private int departmentCode;

  public FinanceContract() {
  }

  public FinanceContract(int documentNumber, Date documentDate, int monthTotal, int departmentCode) {
    super(documentNumber, documentDate);
    this.monthTotal = monthTotal;
    this.departmentCode = departmentCode;
  }

  @Override
  public String getInfo() {
    return "fff";
  }

  public int getMonthTotal() {
    return monthTotal;
  }

  public void setMonthTotal(int monthTotal) {
    this.monthTotal = monthTotal;
  }

  public int getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(int departmentCode) {
    this.departmentCode = departmentCode;
  }
}
