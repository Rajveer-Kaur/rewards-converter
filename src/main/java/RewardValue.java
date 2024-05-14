// public class RewardValue {
//   private double cashValue;
//   private double milesValue;

//   // Constructor for cash to miles conversion
//   public RewardValue(double cashValue, String resultType) {
//       if (resultType.equals("miles")) {
//           this.cashValue = cashValue;
//           this.milesValue = cashValue * 0.0035; // Conversion rate from cash to miles
//       } else {
//           this.milesValue = cashValue;
//           this.cashValue = cashValue / 0.0035; // Conversion rate from miles to cash
//       }
//   }

//   // Get cash value
//   public double getCashValue() {
//       return cashValue;
//   }

//   // Get miles value
//   public double getMilesValue() {
//       return milesValue;
//   }
// }

public class RewardValue {
  private final double cashValue;
  public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

  public RewardValue(double cashValue) {
      this.cashValue = cashValue;
  }

  public RewardValue(int milesValue) {
      this.cashValue = convertToCash(milesValue);
  }

  private static int convertToMiles(double cashValue) {
      return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
  }

  private static double convertToCash(int milesValue) {
      return milesValue * MILES_TO_CASH_CONVERSION_RATE;
  }

  public double getCashValue() {
      return cashValue;
  }

  public int getMilesValue() {
      return convertToMiles(this.cashValue);
  }
}