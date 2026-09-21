package p034d5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p034d5.a f21230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p034d5.a f21231i;
    public static final p034d5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p034d5.a[] f21232k;

    static {
        p034d5.a aVar = new p034d5.a("CLOSED", 0);
        f21230h = aVar;
        p034d5.a aVar2 = new p034d5.a("OPEN", 1);
        f21231i = aVar2;
        p034d5.a aVar3 = new p034d5.a("HALF_OPEN", 2);
        j = aVar3;
        p034d5.a[] aVarArr = {aVar, aVar2, aVar3};
        f21232k = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static p034d5.a valueOf(java.lang.String str) {
        return (p034d5.a) java.lang.Enum.valueOf(p034d5.a.class, str);
    }

    public static p034d5.a[] values() {
        return (p034d5.a[]) f21232k.clone();
    }
}
