package lotto.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LotteryStatisticTest {

  WinningLotteryNumbers winning;

  @BeforeEach
  void setup() {
    LotteryNumbers winningNumbers = new LotteryNumbers(Arrays.asList(1, 2, 3, 4, 5, 6));
    LotteryNumber bonusNumber = new LotteryNumber(7);
    winning = new WinningLotteryNumbers(winningNumbers, bonusNumber);
  }

  @Test
  @DisplayName("Test calculate statistic of tickets.")
  void testStatistic() {
    LotteryStatistic statistic = new LotteryStatistic();
    statistic.produceTickets(createTickets(), winning);

    double expected = (double) WinningLottery.FIFTH.getPrice() / (double) LotteryTicket.PRICE;
    assertEquals(expected, statistic.profit());
    assertEquals(expected, statistic.profit());
  }

  private LotteryTickets createTickets() {
    LotteryTickets tickets = new LotteryTickets(1);
    tickets.lotteryTicket(0).fixManual(new LotteryNumbers(Arrays.asList(4, 5, 6, 7, 8, 9)));
    return tickets;
  }
}
