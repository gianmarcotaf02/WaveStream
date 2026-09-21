package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.i0 f8440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.i0 f8441i;
    public static final /* synthetic */ Q0.i0[] j;

    static {
        Q0.i0 i0Var = new Q0.i0("Width", 0);
        f8440h = i0Var;
        Q0.i0 i0Var2 = new Q0.i0("Height", 1);
        f8441i = i0Var2;
        Q0.i0[] i0VarArr = {i0Var, i0Var2};
        j = i0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(i0VarArr);
    }

    public static Q0.i0 valueOf(java.lang.String str) {
        return (Q0.i0) java.lang.Enum.valueOf(Q0.i0.class, str);
    }

    public static Q0.i0[] values() {
        return (Q0.i0[]) j.clone();
    }
}
