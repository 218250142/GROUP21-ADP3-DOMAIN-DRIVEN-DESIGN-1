package za.ac.cput.entity;

/* Zelino Pestana - 218325991
 *
 */

public class Payment {
    private String paymentID;
    private double orderAmount;
    private String paymentOption;

    private Payment() {
    }

    private Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.orderAmount = builder.orderAmount;
        this.paymentOption = builder.paymentOption;
    }

    public String getPaymentID() {
        return paymentID;
    }
    public double getOrderAmount() {
        return orderAmount;
    }
    public String getPaymentOption() {
        return paymentOption;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", orderAmount=" + orderAmount + '\'' +
                ", paymentOption='" + paymentOption +
                '}';
    }

    public static class Builder {

        private String paymentID;
        private double orderAmount;
        private String paymentOption;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setPaymentOption(String paymentOption) {
            this.paymentOption = paymentOption;
            return this;
        }

        public Builder setOrderAmount(double orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }

        public Builder copy(Payment payment) {
            this.paymentID = payment.paymentID;
            this.paymentOption = payment.paymentOption;
            this.orderAmount = payment.orderAmount;

            return this;
        }

        public Payment build() {

            return new Payment(this);

        }

    }

}


