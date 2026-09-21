package p002a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p002a1.a f13076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p002a1.a f13077i;
    public static final /* synthetic */ p002a1.a[] j;

    static {
        p002a1.a aVar = new p002a1.a("On", 0);
        f13076h = aVar;
        p002a1.a aVar2 = new p002a1.a("Off", 1);
        f13077i = aVar2;
        p002a1.a[] aVarArr = {aVar, aVar2, new p002a1.a("Indeterminate", 2)};
        j = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static p002a1.a valueOf(java.lang.String str) {
        return (p002a1.a) java.lang.Enum.valueOf(p002a1.a.class, str);
    }

    public static p002a1.a[] values() {
        return (p002a1.a[]) j.clone();
    }
}
