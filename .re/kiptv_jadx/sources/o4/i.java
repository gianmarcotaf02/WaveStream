package o4;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f26122a = new java.util.concurrent.CopyOnWriteArrayList();

    public static p174u4.c a(java.lang.String str) throws java.security.GeneralSecurityException {
        boolean zStartsWith;
        for (p174u4.c cVar : f26122a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(java.util.Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new java.security.GeneralSecurityException(p121o0.p.C("No KMS client does support: ", str));
    }
}
