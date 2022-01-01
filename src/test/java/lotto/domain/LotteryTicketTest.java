package lotto.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LotteryTicketTest {

  @Test
  @DisplayName("Test create lottery ticket.")
  void testCreate() {
    LotteryTicket lotteryTicket = new LotteryTicket();

    assertEquals(LotteryNumbers.LOTTERY_NUMBERS_SIZE, lotteryTicket.lotteryNumbers().size());
    assertEquals(1000, LotteryTicket.PRICE);
  }
}
