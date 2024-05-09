public class RewardValue {
  private double cashValue;
  private double milesValue;

  // Constructor for cash to miles conversion
  public RewardValue(double cashValue, String resultType) {
      if (resultType.equals("miles")) {
          this.cashValue = cashValue;
          this.milesValue = cashValue * 0.0035; // Conversion rate from cash to miles
      } else {
          this.milesValue = cashValue;
          this.cashValue = cashValue / 0.0035; // Conversion rate from miles to cash
      }
  }

  // Get cash value
  public double getCashValue() {
      return cashValue;
  }

  // Get miles value
  public double getMilesValue() {
      return milesValue;
  }
}
