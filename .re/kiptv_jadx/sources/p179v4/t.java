package p179v4;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29193a = 0;

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static int a() {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        byte[] bArr = new byte[4];
        int i3 = 0;
        while (i3 == 0) {
            secureRandom.nextBytes(bArr);
            i3 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i3;
    }

    public static final C4.a b(java.lang.String str) {
        byte[] bArr = new byte[str.length()];
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new I3.b("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i3] = (byte) cCharAt;
        }
        return C4.a.a(bArr);
    }
}
