package O6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O6.m f7997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O6.m f7998i;
    public static final O6.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ O6.m[] f7999k;

    static {
        O6.m mVar = new O6.m("RUNTIME", 0);
        f7997h = mVar;
        O6.m mVar2 = new O6.m("BINARY", 1);
        f7998i = mVar2;
        O6.m mVar3 = new O6.m("SOURCE", 2);
        j = mVar3;
        O6.m[] mVarArr = {mVar, mVar2, mVar3};
        f7999k = mVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mVarArr);
    }

    public static O6.m valueOf(java.lang.String str) {
        return (O6.m) java.lang.Enum.valueOf(O6.m.class, str);
    }

    public static O6.m[] values() {
        return (O6.m[]) f7999k.clone();
    }
}
