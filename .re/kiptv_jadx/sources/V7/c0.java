package V7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final V7.c0 f10447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V7.c0 f10448i;
    public static final V7.c0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ V7.c0[] f10449k;

    static {
        V7.c0 c0Var = new V7.c0("START", 0);
        f10447h = c0Var;
        V7.c0 c0Var2 = new V7.c0("STOP", 1);
        f10448i = c0Var2;
        V7.c0 c0Var3 = new V7.c0("STOP_AND_RESET_REPLAY_CACHE", 2);
        j = c0Var3;
        V7.c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        f10449k = c0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(c0VarArr);
    }

    public static V7.c0 valueOf(java.lang.String str) {
        return (V7.c0) java.lang.Enum.valueOf(V7.c0.class, str);
    }

    public static V7.c0[] values() {
        return (V7.c0[]) f10449k.clone();
    }
}
