package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1533o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.lifecycle.EnumC1533o f16364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.lifecycle.EnumC1533o f16365i;
    public static final androidx.lifecycle.EnumC1533o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.lifecycle.EnumC1533o f16366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final androidx.lifecycle.EnumC1533o f16367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ androidx.lifecycle.EnumC1533o[] f16368m;

    static {
        androidx.lifecycle.EnumC1533o enumC1533o = new androidx.lifecycle.EnumC1533o("DESTROYED", 0);
        f16364h = enumC1533o;
        androidx.lifecycle.EnumC1533o enumC1533o2 = new androidx.lifecycle.EnumC1533o("INITIALIZED", 1);
        f16365i = enumC1533o2;
        androidx.lifecycle.EnumC1533o enumC1533o3 = new androidx.lifecycle.EnumC1533o("CREATED", 2);
        j = enumC1533o3;
        androidx.lifecycle.EnumC1533o enumC1533o4 = new androidx.lifecycle.EnumC1533o("STARTED", 3);
        f16366k = enumC1533o4;
        androidx.lifecycle.EnumC1533o enumC1533o5 = new androidx.lifecycle.EnumC1533o("RESUMED", 4);
        f16367l = enumC1533o5;
        androidx.lifecycle.EnumC1533o[] enumC1533oArr = {enumC1533o, enumC1533o2, enumC1533o3, enumC1533o4, enumC1533o5};
        f16368m = enumC1533oArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1533oArr);
    }

    public static androidx.lifecycle.EnumC1533o valueOf(java.lang.String str) {
        return (androidx.lifecycle.EnumC1533o) java.lang.Enum.valueOf(androidx.lifecycle.EnumC1533o.class, str);
    }

    public static androidx.lifecycle.EnumC1533o[] values() {
        return (androidx.lifecycle.EnumC1533o[]) f16368m.clone();
    }
}
