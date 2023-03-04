package com.example;

import java.util.Date;

public class EmployeeContract extends AbstractDocument {
  private Date endDate;
  private String employeeName;

  public EmployeeContract() {
  }

  public EmployeeContract(int documentNumber, Date documentDate, Date endDate, String employeeName) {
    super(documentNumber, documentDate);
    this.endDate = endDate;
    this.employeeName = employeeName;
  }

  @Override
  public String getInfo() {
    return "Котракт на поставку товаров №" + documentNumber + " от " + documentDate.toString() +
        "\nТип товаров: " + endDate+
        "\nКоличество товаров: " + employeeName + "\n";
  }

  public void test() {
    System.out.println();
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
}
