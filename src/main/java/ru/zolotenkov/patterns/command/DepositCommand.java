package ru.zolotenkov.patterns.command;

import org.springframework.stereotype.Component;

@Component
public class DepositCommand implements Command {
  private final Bank bank;

  public DepositCommand(Bank bank) {
    this.bank = bank;
  }

  @Override
  public void execute(CommandInfo info) {
    bank.deposit(info.getAccount(), info.getAmount());
  }
}