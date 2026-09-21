package p045e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p045e8.a0 f21530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p045e8.a0 f21531i;
    public static final p045e8.a0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p045e8.a0[] f21532k;

    static {
        p045e8.a0 a0Var = new p045e8.a0("NONE", 0);
        f21530h = a0Var;
        p045e8.a0 a0Var2 = new p045e8.a0("ZERO", 1);
        f21531i = a0Var2;
        p045e8.a0 a0Var3 = new p045e8.a0("SPACE", 2);
        j = a0Var3;
        p045e8.a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        f21532k = a0VarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(a0VarArr);
    }

    public static p045e8.a0 valueOf(java.lang.String str) {
        return (p045e8.a0) java.lang.Enum.valueOf(p045e8.a0.class, str);
    }

    public static p045e8.a0[] values() {
        return (p045e8.a0[]) f21532k.clone();
    }
}
