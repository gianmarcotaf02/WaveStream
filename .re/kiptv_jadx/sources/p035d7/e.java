package p035d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p035d7.e f21259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p035d7.e f21260i;
    public static final /* synthetic */ p035d7.e[] j;

    static {
        p035d7.e eVar = new p035d7.e("READ_ONLY", 0);
        f21259h = eVar;
        p035d7.e eVar2 = new p035d7.e("MUTABLE", 1);
        f21260i = eVar2;
        p035d7.e[] eVarArr = {eVar, eVar2};
        j = eVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(eVarArr);
    }

    public static p035d7.e valueOf(java.lang.String str) {
        return (p035d7.e) java.lang.Enum.valueOf(p035d7.e.class, str);
    }

    public static p035d7.e[] values() {
        return (p035d7.e[]) j.clone();
    }
}
