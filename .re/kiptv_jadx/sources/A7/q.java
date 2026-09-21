package A7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A7.q f344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A7.q f345i;
    public static final /* synthetic */ A7.q[] j;

    static {
        A7.q qVar = new A7.q("STABLE", 0);
        f344h = qVar;
        A7.q qVar2 = new A7.q("UNSTABLE", 1);
        f345i = qVar2;
        A7.q[] qVarArr = {qVar, qVar2};
        j = qVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(qVarArr);
    }

    public static A7.q valueOf(java.lang.String str) {
        return (A7.q) java.lang.Enum.valueOf(A7.q.class, str);
    }

    public static A7.q[] values() {
        return (A7.q[]) j.clone();
    }
}
