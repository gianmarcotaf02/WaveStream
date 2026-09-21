package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U.I f9912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U.I f9913i;
    public static final U.I j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ U.I[] f9914k;

    static {
        U.I i3 = new U.I("Left", 0);
        f9912h = i3;
        U.I i9 = new U.I("Middle", 1);
        f9913i = i9;
        U.I i10 = new U.I("Right", 2);
        j = i10;
        U.I[] iArr = {i3, i9, i10};
        f9914k = iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iArr);
    }

    public static U.I valueOf(java.lang.String str) {
        return (U.I) java.lang.Enum.valueOf(U.I.class, str);
    }

    public static U.I[] values() {
        return (U.I[]) f9914k.clone();
    }
}
