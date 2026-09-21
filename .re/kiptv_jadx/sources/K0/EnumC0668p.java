package K0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0668p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final K0.EnumC0668p f6730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final K0.EnumC0668p f6731i;
    public static final K0.EnumC0668p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ K0.EnumC0668p[] f6732k;

    static {
        K0.EnumC0668p enumC0668p = new K0.EnumC0668p("Initial", 0);
        f6730h = enumC0668p;
        K0.EnumC0668p enumC0668p2 = new K0.EnumC0668p("Main", 1);
        f6731i = enumC0668p2;
        K0.EnumC0668p enumC0668p3 = new K0.EnumC0668p("Final", 2);
        j = enumC0668p3;
        K0.EnumC0668p[] enumC0668pArr = {enumC0668p, enumC0668p2, enumC0668p3};
        f6732k = enumC0668pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0668pArr);
    }

    public static K0.EnumC0668p valueOf(java.lang.String str) {
        return (K0.EnumC0668p) java.lang.Enum.valueOf(K0.EnumC0668p.class, str);
    }

    public static K0.EnumC0668p[] values() {
        return (K0.EnumC0668p[]) f6732k.clone();
    }
}
