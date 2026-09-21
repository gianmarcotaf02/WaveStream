package p109m6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p109m6.a f25430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p109m6.a f25431i;
    public static final p109m6.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p109m6.a[] f25432k;

    static {
        p109m6.a aVar = new p109m6.a("COROUTINE_SUSPENDED", 0);
        f25430h = aVar;
        p109m6.a aVar2 = new p109m6.a("UNDECIDED", 1);
        f25431i = aVar2;
        p109m6.a aVar3 = new p109m6.a("RESUMED", 2);
        j = aVar3;
        p109m6.a[] aVarArr = {aVar, aVar2, aVar3};
        f25432k = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static p109m6.a valueOf(java.lang.String str) {
        return (p109m6.a) java.lang.Enum.valueOf(p109m6.a.class, str);
    }

    public static p109m6.a[] values() {
        return (p109m6.a[]) f25432k.clone();
    }
}
