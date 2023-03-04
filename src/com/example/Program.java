package com.example;

import java.util.Date;

public class Program {
  public static void main(String[] args) {
    Registry registry = new Registry();

    GoodsContract goodsContract = new GoodsContract(111, new Date(), "Товары для дома", 4);
    registry.saveDocument(goodsContract);
    registry.getInfo(goodsContract);

    EmployeeContract employeeContract = new EmployeeContract(10212, new Date(), new Date(2023, 3, 15), "Иванов Иван Иванович");
    registry.saveDocument(employeeContract);
    registry.getInfo(employeeContract);

  }
}
