package p113n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p113n1.n f25566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p113n1.n f25567i;
    public static final /* synthetic */ p113n1.n[] j;

    static {
        p113n1.n nVar = new p113n1.n("Ltr", 0);
        f25566h = nVar;
        p113n1.n nVar2 = new p113n1.n("Rtl", 1);
        f25567i = nVar2;
        p113n1.n[] nVarArr = {nVar, nVar2};
        j = nVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(nVarArr);
    }

    public static p113n1.n valueOf(java.lang.String str) {
        return (p113n1.n) java.lang.Enum.valueOf(p113n1.n.class, str);
    }

    public static p113n1.n[] values() {
        return (p113n1.n[]) j.clone();
    }
}
