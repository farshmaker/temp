package com.example;

import java.util.Date;

public class GoodsContract extends AbstractDocument {
  private String goodsType;
  private int goodsQuantity;

  public GoodsContract() {
  }

  @Override
  public String getInfo() {
    return "Котракт на поставку товаров №" + documentNumber + " от " + documentDate.toString() +
        "\nТип товаров: " + goodsType+
        "\nКоличество товаров: " + goodsQuantity + "\n";
  }

  public GoodsContract(int documentNumber, Date documentDate, String goodsType, int goodsQuantity) {
    super(documentNumber, documentDate);
    this.goodsType = goodsType;
    this.goodsQuantity = goodsQuantity;
  }

  public String getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }

  public int getGoodsQuantity() {
    return goodsQuantity;
  }

  public void setGoodsQuantity(int goodsQuantity) {
    this.goodsQuantity = goodsQuantity;
  }
}
