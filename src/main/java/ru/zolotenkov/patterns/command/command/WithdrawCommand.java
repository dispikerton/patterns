package ru.zolotenkov.patterns.command.command;

import org.springframework.stereotype.Component;

import ru.zolotenkov.patterns.command.BankService;
import ru.zolotenkov.patterns.command.CommandInfo;

@Component
public class WithdrawCommand implements Command {
  private final BankService bankService;

  public WithdrawCommand(BankService bankService) {
    this.bankService = bankService;
  }

  @Override
  public void execute(CommandInfo info) {
    bankService.withdraw(info.getAccount(), info.getAmount());
  }
}
