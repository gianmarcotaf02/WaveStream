package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T2.d f9733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final T2.d f9734i;
    public static final /* synthetic */ T2.d[] j;

    static {
        T2.d dVar = new T2.d("EXACT", 0);
        f9733h = dVar;
        T2.d dVar2 = new T2.d("INEXACT", 1);
        f9734i = dVar2;
        T2.d[] dVarArr = {dVar, dVar2};
        j = dVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dVarArr);
    }

    public static T2.d valueOf(java.lang.String str) {
        return (T2.d) java.lang.Enum.valueOf(T2.d.class, str);
    }

    public static T2.d[] values() {
        return (T2.d[]) j.clone();
    }
}
