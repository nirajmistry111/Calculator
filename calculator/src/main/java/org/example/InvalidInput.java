package org.example;

class InvalidInput extends RuntimeException {
    public String toString() {
        return "8 and 9 are not allowed.";
    }
}
