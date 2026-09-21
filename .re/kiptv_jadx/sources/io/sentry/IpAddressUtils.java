package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class IpAddressUtils {
    public static final java.lang.String DEFAULT_IP_ADDRESS = "{{auto}}";
    private static final java.util.List<java.lang.String> DEFAULT_IP_ADDRESS_VALID_VALUES = java.util.Arrays.asList(DEFAULT_IP_ADDRESS, "{{ auto }}");

    private IpAddressUtils() {
    }

    public static boolean isDefault(java.lang.String str) {
        return str != null && DEFAULT_IP_ADDRESS_VALID_VALUES.contains(str);
    }
}
