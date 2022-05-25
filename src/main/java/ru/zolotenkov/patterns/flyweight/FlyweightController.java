package ru.zolotenkov.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FlyweightController {

  private final Factory factory;

  @GetMapping("/flyweight")
  public void getProduct() {
    List<Product> products = new ArrayList<>();

    products.add(factory.getProduct("мыло"));
    products.add(factory.getProduct("мыло"));
    products.add(factory.getProduct("мыло"));
    products.add(factory.getProduct("мыло"));
    products.add(factory.getProduct("крем"));
    products.add(factory.getProduct("крем"));
    products.add(factory.getProduct("крем"));
    products.add(factory.getProduct("крем"));

    products.forEach(Product::sayMyName);
  }
}
