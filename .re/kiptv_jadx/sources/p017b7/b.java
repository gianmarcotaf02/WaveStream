package p017b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p017b7.b f18016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p017b7.b f18017i;
    public static final p017b7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p017b7.b[] f18018k;

    static {
        p017b7.b bVar = new p017b7.b("INFLEXIBLE", 0);
        f18016h = bVar;
        p017b7.b bVar2 = new p017b7.b("FLEXIBLE_UPPER_BOUND", 1);
        f18017i = bVar2;
        p017b7.b bVar3 = new p017b7.b("FLEXIBLE_LOWER_BOUND", 2);
        j = bVar3;
        p017b7.b[] bVarArr = {bVar, bVar2, bVar3};
        f18018k = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static p017b7.b valueOf(java.lang.String str) {
        return (p017b7.b) java.lang.Enum.valueOf(p017b7.b.class, str);
    }

    public static p017b7.b[] values() {
        return (p017b7.b[]) f18018k.clone();
    }
}
