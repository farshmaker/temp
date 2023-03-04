package com.example;

import java.util.Date;

public abstract class AbstractDocument implements Document {
  protected int documentNumber;
  protected Date documentDate;

  public AbstractDocument() {
  }

  public AbstractDocument(int documentNumber, Date documentDate) {
    this.documentNumber = documentNumber;
    this.documentDate = documentDate;
  }

  public int getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(int documentNumber) {
    this.documentNumber = documentNumber;
  }

  public Date getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(Date documentDate) {
    this.documentDate = documentDate;
  }
}
