package org.example;

class ZerodivisionException extends RuntimeException {
    public String toString() {
        return "0 input is not allowed";
    }
}
