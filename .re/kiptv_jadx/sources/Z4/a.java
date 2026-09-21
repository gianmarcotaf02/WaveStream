package Z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z4.a f12986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z4.a f12987i;
    public static final /* synthetic */ Z4.a[] j;

    static {
        Z4.a aVar = new Z4.a("MOST_POPULAR", 0);
        f12986h = aVar;
        Z4.a aVar2 = new Z4.a("BEST_VALUE", 1);
        f12987i = aVar2;
        Z4.a[] aVarArr = {aVar, aVar2};
        j = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static Z4.a valueOf(java.lang.String str) {
        return (Z4.a) java.lang.Enum.valueOf(Z4.a.class, str);
    }

    public static Z4.a[] values() {
        return (Z4.a[]) j.clone();
    }
}
