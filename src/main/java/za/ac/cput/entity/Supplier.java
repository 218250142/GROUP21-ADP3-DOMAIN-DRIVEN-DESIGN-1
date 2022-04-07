
/* Supplier.java
        Entity for Supplier
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
         */
package za.ac.cput.entity;

public class Supplier {
    private String nameCompany;
    private String email;

    private String address;

    private String id;

    //private constructor

    private Supplier(Builder builder){
        this.nameCompany = builder.nameCompany;
        this.id = builder.id;;
        this.email = builder.email;
        this.address = builder.address;

    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "nameCompany='" + nameCompany + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    // builder patterns

    public static class Builder{
        private String nameCompany;
        private String email;

        private String address;

        private String id;

        public Builder setNameCompany(String nameCompany) {
            this.nameCompany = nameCompany;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }



        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }



        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder copy(Supplier supplier){

            this.nameCompany = supplier.nameCompany;
            this.email = supplier.email;

            this.address = supplier.address;
            this.id = supplier.id;

            return this;


        }
        public Supplier build(){
            return new Supplier(this);
        }
    }


}
