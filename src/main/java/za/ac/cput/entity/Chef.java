
/* Chef java
        Entity for Chef
        Author: Aristoteles Pascoal (218290276)
        Date: 15 March 2022
        */
package za.ac.cput.entity;

public class Chef {

    private String name;
    private String id;
    private String email;
    private String address;


    // private constructor

    public Chef(Builder builder){
        this.address = builder.address;
        this.name = builder.name;
        this.email = builder.email;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String id;
        private String email;
        private String address;




        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
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


        // Unnecessary for the sake of not making mistake
        public Builder copy(Chef builder){
            this.email = builder.email;
            this.address = builder.address;
            this.name = builder.name;
            this.id = builder.id;

            /// internal point of the object self

            return this;
        }
        public Chef build(){
            return new Chef(this);
        }
    }
}
