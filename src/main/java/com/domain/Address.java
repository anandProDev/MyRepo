package com.domain;


public class Address {

    private String houseNumber;
    private String addressLine1;
    private String addressLine2;
    private String postcode;

    public Address(String houseNumber, String addressLine1, String addressLine2, String postcode) {
        this.houseNumber = houseNumber;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postcode = postcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public static class AddressBuilder {

        private String houseNumber;
        private String addressLine1;
        private String addressLine2;
        private String postcode;

        public AddressBuilder setHouseNumber(String houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public AddressBuilder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public AddressBuilder setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public AddressBuilder setPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }
    }

}
