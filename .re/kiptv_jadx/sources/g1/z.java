package g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1.z f21852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1.z f21853i;
    public static final g1.z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g1.z f21854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g1.z[] f21855l;

    static {
        g1.z zVar = new g1.z("StartInput", 0);
        f21852h = zVar;
        g1.z zVar2 = new g1.z("StopInput", 1);
        f21853i = zVar2;
        g1.z zVar3 = new g1.z("ShowKeyboard", 2);
        j = zVar3;
        g1.z zVar4 = new g1.z("HideKeyboard", 3);
        f21854k = zVar4;
        g1.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f21855l = zVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(zVarArr);
    }

    public static g1.z valueOf(java.lang.String str) {
        return (g1.z) java.lang.Enum.valueOf(g1.z.class, str);
    }

    public static g1.z[] values() {
        return (g1.z[]) f21855l.clone();
    }
}
