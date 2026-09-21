package B4;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    static {
        java.util.regex.Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        java.util.regex.Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    public static void a(int i3) throws java.security.InvalidAlgorithmParameterException {
        if (i3 != 16 && i3 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i3 * 8)));
        }
    }

    public static java.lang.String b(java.lang.String str) {
        if (str.toLowerCase(java.util.Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new java.lang.IllegalArgumentException("key URI must start with android-keystore://");
    }

    public static void c(int i3) throws java.security.GeneralSecurityException {
        if (i3 < 0 || i3 > 0) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("key has version %d; only keys with version in range [0..%d] are supported", java.lang.Integer.valueOf(i3), 0));
        }
    }
}
