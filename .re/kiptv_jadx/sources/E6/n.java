package E6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E6.n f3218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E6.n f3219i;
    public static final E6.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ E6.n[] f3220k;

    static {
        E6.n nVar = new E6.n("INSTANCE", 0);
        f3218h = nVar;
        E6.n nVar2 = new E6.n("EXTENSION_RECEIVER", 1);
        f3219i = nVar2;
        E6.n nVar3 = new E6.n("VALUE", 2);
        j = nVar3;
        E6.n[] nVarArr = {nVar, nVar2, nVar3};
        f3220k = nVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(nVarArr);
    }

    public static E6.n valueOf(java.lang.String str) {
        return (E6.n) java.lang.Enum.valueOf(E6.n.class, str);
    }

    public static E6.n[] values() {
        return (E6.n[]) f3220k.clone();
    }
}
