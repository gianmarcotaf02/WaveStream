package A8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f419a;

    static {
        int[] iArr = new int[java.net.Proxy.Type.values().length];
        try {
            iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        f419a = iArr;
    }
}
