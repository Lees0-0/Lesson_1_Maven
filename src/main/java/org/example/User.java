package org.example;

public class User {
    static class FirstName {
        private String firstName;

        public FirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }
    }

    static class SecondName {
        private String secondName;

        public SecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getSecondName() {
            return secondName;
        }
    }
}