package p163t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p163t.T f27506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p163t.T f27507i;
    public static final /* synthetic */ p163t.T[] j;

    static {
        p163t.T t9 = new p163t.T("Restart", 0);
        f27506h = t9;
        p163t.T t10 = new p163t.T("Reverse", 1);
        f27507i = t10;
        p163t.T[] tArr = {t9, t10};
        j = tArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(tArr);
    }

    public static p163t.T valueOf(java.lang.String str) {
        return (p163t.T) java.lang.Enum.valueOf(p163t.T.class, str);
    }

    public static p163t.T[] values() {
        return (p163t.T[]) j.clone();
    }
}
