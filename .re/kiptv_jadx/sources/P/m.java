package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P.m f8097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P.m f8098i;
    public static final P.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ P.m[] f8099k;

    static {
        P.m mVar = new P.m("Uninitialized", 0);
        f8097h = mVar;
        P.m mVar2 = new P.m("Detached", 1);
        f8098i = mVar2;
        P.m mVar3 = new P.m("Attached", 2);
        j = mVar3;
        P.m[] mVarArr = {mVar, mVar2, mVar3};
        f8099k = mVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mVarArr);
    }

    public static P.m valueOf(java.lang.String str) {
        return (P.m) java.lang.Enum.valueOf(P.m.class, str);
    }

    public static P.m[] values() {
        return (P.m[]) f8099k.clone();
    }
}
