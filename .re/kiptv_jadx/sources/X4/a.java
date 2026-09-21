package X4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final X4.a f10855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final X4.a f10856i;
    public static final X4.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final X4.a f10857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ X4.a[] f10858l;

    static {
        X4.a aVar = new X4.a("OFFICIAL", 0);
        f10855h = aVar;
        X4.a aVar2 = new X4.a("OFFICIAL_WHEN_RATED", 1);
        f10856i = aVar2;
        X4.a aVar3 = new X4.a("TEXTUAL", 2);
        j = aVar3;
        X4.a aVar4 = new X4.a("NEUTRAL", 3);
        f10857k = aVar4;
        X4.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f10858l = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static X4.a valueOf(java.lang.String str) {
        return (X4.a) java.lang.Enum.valueOf(X4.a.class, str);
    }

    public static X4.a[] values() {
        return (X4.a[]) f10858l.clone();
    }
}
