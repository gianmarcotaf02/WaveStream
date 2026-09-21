package p118n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p118n7.n f25928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p118n7.n f25929i;
    public static final /* synthetic */ p118n7.n[] j;

    static {
        p118n7.n nVar = new p118n7.n("RENDER_OVERRIDE", 0);
        f25928h = nVar;
        p118n7.n nVar2 = new p118n7.n("RENDER_OPEN", 1);
        f25929i = nVar2;
        p118n7.n[] nVarArr = {nVar, nVar2, new p118n7.n("RENDER_OPEN_OVERRIDE", 2)};
        j = nVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(nVarArr);
    }

    public static p118n7.n valueOf(java.lang.String str) {
        return (p118n7.n) java.lang.Enum.valueOf(p118n7.n.class, str);
    }

    public static p118n7.n[] values() {
        return (p118n7.n[]) j.clone();
    }
}
