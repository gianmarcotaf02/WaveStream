package B4;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B4.a f735a = new B4.a(3);

    public static byte[] a(int i3) {
        byte[] bArr = new byte[i3];
        ((java.security.SecureRandom) f735a.get()).nextBytes(bArr);
        return bArr;
    }
}
