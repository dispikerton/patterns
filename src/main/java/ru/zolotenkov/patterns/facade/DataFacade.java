package ru.zolotenkov.patterns.facade;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class DataFacade {
  private final JdbcDao jdbcDao;
  private final ElasticSearchDao elasticSearchDao;
  private final MongoDao mongoDao;

  public DataFacade(JdbcDao jdbcDao, ElasticSearchDao elasticSearchDao, MongoDao mongoDao) {
    this.jdbcDao = jdbcDao;
    this.elasticSearchDao = elasticSearchDao;
    this.mongoDao = mongoDao;
  }

  public List<String> collect() {
    List<String> jdbcData = jdbcDao.findData();
    List<String> elasticData = elasticSearchDao.findData();
    List<String> mongoData = mongoDao.findData();

    return Stream.of(jdbcData, elasticData, mongoData)
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
  }
}
