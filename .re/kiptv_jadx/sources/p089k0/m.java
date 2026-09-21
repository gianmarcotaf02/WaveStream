package p089k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f24435a;

    static {
        long id;
        try {
            id = android.os.Looper.getMainLooper().getThread().getId();
        } catch (java.lang.Exception unused) {
            id = -1;
        }
        f24435a = id;
    }
}
