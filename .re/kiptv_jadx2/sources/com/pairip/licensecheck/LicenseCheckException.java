package com.pairip.licensecheck;

public final class LicenseCheckException extends Exception {
    public LicenseCheckException(String message) {
        super(message);
    }

    public LicenseCheckException(String message, Throwable cause) {
        super(message, cause);
    }
}
