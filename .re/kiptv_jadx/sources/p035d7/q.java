package p035d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p035d7.q f21294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p035d7.q f21295i;
    public static final p035d7.q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p035d7.q[] f21296k;

    static {
        p035d7.q qVar = new p035d7.q("FLEXIBLE_LOWER", 0);
        f21294h = qVar;
        p035d7.q qVar2 = new p035d7.q("FLEXIBLE_UPPER", 1);
        f21295i = qVar2;
        p035d7.q qVar3 = new p035d7.q("INFLEXIBLE", 2);
        j = qVar3;
        p035d7.q[] qVarArr = {qVar, qVar2, qVar3};
        f21296k = qVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(qVarArr);
    }

    public static p035d7.q valueOf(java.lang.String str) {
        return (p035d7.q) java.lang.Enum.valueOf(p035d7.q.class, str);
    }

    public static p035d7.q[] values() {
        return (p035d7.q[]) f21296k.clone();
    }
}
