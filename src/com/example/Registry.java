package com.example;

import java.util.List;

public class Registry {
  private final AbstractDocument[] documents = new AbstractDocument[10];
  private int documentCount = 0;

  public void saveDocument(AbstractDocument document) {
    if (documentCount < documents.length) {
      documents[documentCount++] = document;
      System.out.println("Документ успешно сохранен в регистре");
    } else {
      System.out.println("Регистр переполнен. Невозможно сохранить документ");
    }
  }

  public void getInfo(AbstractDocument document) {
    System.out.println(document.getInfo());
  }

  public void getInfo(int documentNumber) {
    for (AbstractDocument document : documents) {
      if (documentNumber == document.getDocumentNumber()) {
        getInfo(document);
      }
    }
  }
}
