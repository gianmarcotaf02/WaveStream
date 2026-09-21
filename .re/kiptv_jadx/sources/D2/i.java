package D2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D2.i f2087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D2.i f2088i;
    public static final D2.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D2.i f2089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D2.i f2090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D2.i f2091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ D2.i[] f2092n;

    static {
        D2.i iVar = new D2.i("Verbose", 0);
        f2087h = iVar;
        D2.i iVar2 = new D2.i("Debug", 1);
        f2088i = iVar2;
        D2.i iVar3 = new D2.i("Info", 2);
        j = iVar3;
        D2.i iVar4 = new D2.i("Warn", 3);
        f2089k = iVar4;
        D2.i iVar5 = new D2.i("Error", 4);
        f2090l = iVar5;
        D2.i iVar6 = new D2.i("Assert", 5);
        f2091m = iVar6;
        D2.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        f2092n = iVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iVarArr);
    }

    public static D2.i valueOf(java.lang.String str) {
        return (D2.i) java.lang.Enum.valueOf(D2.i.class, str);
    }

    public static D2.i[] values() {
        return (D2.i[]) f2092n.clone();
    }
}
