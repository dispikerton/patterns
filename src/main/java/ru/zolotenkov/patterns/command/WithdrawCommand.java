package ru.zolotenkov.patterns.command;

import org.springframework.stereotype.Component;

@Component
public class WithdrawCommand implements Command {
  private final Bank bank;

  public WithdrawCommand(Bank bank) {
    this.bank = bank;
  }

  @Override
  public void execute(CommandInfo info) {
    bank.withdraw(info.getAccount(), info.getAmount());
  }
}
