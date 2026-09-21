package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Q0.h0 f8438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q0.h0 f8439i;
    public static final /* synthetic */ Q0.h0[] j;

    static {
        Q0.h0 h0Var = new Q0.h0("Min", 0);
        f8438h = h0Var;
        Q0.h0 h0Var2 = new Q0.h0("Max", 1);
        f8439i = h0Var2;
        Q0.h0[] h0VarArr = {h0Var, h0Var2};
        j = h0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(h0VarArr);
    }

    public static Q0.h0 valueOf(java.lang.String str) {
        return (Q0.h0) java.lang.Enum.valueOf(Q0.h0.class, str);
    }

    public static Q0.h0[] values() {
        return (Q0.h0[]) j.clone();
    }
}
