package ru.zolotenkov.patterns.command;

import org.springframework.stereotype.Component;

@Component
public class CancelCommand implements Command{
  private final Bank bank;

  public CancelCommand(Bank bank) {
    this.bank = bank;
  }

  @Override
  public void execute(CommandInfo info) {
    bank.cancelTransaction(info.getTransactionId());
  }
}
