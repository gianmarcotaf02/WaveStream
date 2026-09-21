package X3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.security.SecureRandom f10850a = new java.security.SecureRandom();

    public static java.lang.String a() {
        byte[] bArr = new byte[16];
        f10850a.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
