package ru.zolotenkov.patterns.command.command;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.command.BankService;
import ru.zolotenkov.patterns.command.CommandInfo;

@Component
public class DepositCommand implements Command {
  private final BankService bankService;

  public DepositCommand(BankService bankService) {
    this.bankService = bankService;
  }

  @Override
  public void execute(CommandInfo info) {
    bankService.deposit(info.getAccount(), info.getAmount());
  }
}
