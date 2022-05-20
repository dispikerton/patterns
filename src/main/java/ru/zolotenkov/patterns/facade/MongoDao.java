package ru.zolotenkov.patterns.facade;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDao {
  public List<String> findData() {
    return List.of("mongo");
  }
}
