package za.ac.cput.entity;

/*
Mpho Sefoloko
218336322
group 21
March
 */

public class ReserveLimit {

    public int totalLimit;
    public boolean availability;

    private ReserveLimit (Builder builder) {
        this.totalLimit = builder.totalLimit;
        this.availability = builder.availability;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public boolean isAvailability() {
        return availability;
    }



    @Override
    public String toString() {
        return "ReserveLimit{" +
                "totalLimit=" + totalLimit +
                ", availability=" + availability +
                '}';
    }

    public static class Builder {

        public int totalLimit;
        public boolean availability;

        public Builder setTotalLimit(int totalLimit) {
            this.totalLimit = totalLimit;
            return this;
        }

        public Builder setAvailability(boolean availability) {
            this.availability = availability;
            return this;
        }

        public Builder copy (ReserveLimit reservelimit){

            this.totalLimit = reservelimit.totalLimit;
            this.availability = reservelimit.availability;


            return this;
        }
        public ReserveLimit build(){

            return new ReserveLimit(this);
        }
    }
}
