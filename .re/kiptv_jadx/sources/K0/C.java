package K0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final K0.C f6643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final K0.C f6644i;
    public static final K0.C j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ K0.C[] f6645k;

    static {
        K0.C c9 = new K0.C("Unknown", 0);
        f6643h = c9;
        K0.C c10 = new K0.C("Dispatching", 1);
        f6644i = c10;
        K0.C c11 = new K0.C("NotDispatching", 2);
        j = c11;
        K0.C[] cArr = {c9, c10, c11};
        f6645k = cArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(cArr);
    }

    public static K0.C valueOf(java.lang.String str) {
        return (K0.C) java.lang.Enum.valueOf(K0.C.class, str);
    }

    public static K0.C[] values() {
        return (K0.C[]) f6645k.clone();
    }
}
