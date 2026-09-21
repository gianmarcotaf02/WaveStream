package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0.a f27196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0.a f27197i;
    public static final /* synthetic */ s0.a[] j;

    static {
        s0.a aVar = new s0.a("SHOW_ORIGINAL", 0);
        f27196h = aVar;
        s0.a aVar2 = new s0.a("SHOW_TRANSLATED", 1);
        f27197i = aVar2;
        s0.a[] aVarArr = {aVar, aVar2};
        j = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static s0.a valueOf(java.lang.String str) {
        return (s0.a) java.lang.Enum.valueOf(s0.a.class, str);
    }

    public static s0.a[] values() {
        return (s0.a[]) j.clone();
    }
}
