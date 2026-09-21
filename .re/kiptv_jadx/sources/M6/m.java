package M6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M6.m f7181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M6.m f7182i;
    public static final M6.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M6.m f7183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M6.m f7184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ M6.m[] f7185m;

    static {
        M6.m mVar = new M6.m("HIDDEN", 0);
        f7181h = mVar;
        M6.m mVar2 = new M6.m("VISIBLE", 1);
        f7182i = mVar2;
        M6.m mVar3 = new M6.m("DEPRECATED_LIST_METHODS", 2);
        j = mVar3;
        M6.m mVar4 = new M6.m("NOT_CONSIDERED", 3);
        f7183k = mVar4;
        M6.m mVar5 = new M6.m("DROP", 4);
        f7184l = mVar5;
        M6.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f7185m = mVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mVarArr);
    }

    public static M6.m valueOf(java.lang.String str) {
        return (M6.m) java.lang.Enum.valueOf(M6.m.class, str);
    }

    public static M6.m[] values() {
        return (M6.m[]) f7185m.clone();
    }
}
