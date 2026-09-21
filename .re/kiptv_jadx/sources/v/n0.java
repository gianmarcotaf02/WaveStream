package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v.n0 f28974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v.n0 f28975i;
    public static final /* synthetic */ v.n0[] j;

    static {
        v.n0 n0Var = new v.n0("Default", 0);
        f28974h = n0Var;
        v.n0 n0Var2 = new v.n0("UserInput", 1);
        f28975i = n0Var2;
        v.n0[] n0VarArr = {n0Var, n0Var2, new v.n0("PreventUserInput", 2)};
        j = n0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(n0VarArr);
    }

    public static v.n0 valueOf(java.lang.String str) {
        return (v.n0) java.lang.Enum.valueOf(v.n0.class, str);
    }

    public static v.n0[] values() {
        return (v.n0[]) j.clone();
    }
}
