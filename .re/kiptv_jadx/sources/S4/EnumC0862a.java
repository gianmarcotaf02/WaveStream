package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0862a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S4.EnumC0862a f9358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S4.EnumC0862a f9359i;
    public static final S4.EnumC0862a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final S4.EnumC0862a f9360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ S4.EnumC0862a[] f9361l;

    static {
        S4.EnumC0862a enumC0862a = new S4.EnumC0862a("DEFAULT", 0);
        f9358h = enumC0862a;
        S4.EnumC0862a enumC0862a2 = new S4.EnumC0862a("CUSTOM", 1);
        f9359i = enumC0862a2;
        S4.EnumC0862a enumC0862a3 = new S4.EnumC0862a("ALPHABETICAL_ASC", 2);
        j = enumC0862a3;
        S4.EnumC0862a enumC0862a4 = new S4.EnumC0862a("ALPHABETICAL_DESC", 3);
        f9360k = enumC0862a4;
        S4.EnumC0862a[] enumC0862aArr = {enumC0862a, enumC0862a2, enumC0862a3, enumC0862a4};
        f9361l = enumC0862aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0862aArr);
    }

    public static S4.EnumC0862a valueOf(java.lang.String str) {
        return (S4.EnumC0862a) java.lang.Enum.valueOf(S4.EnumC0862a.class, str);
    }

    public static S4.EnumC0862a[] values() {
        return (S4.EnumC0862a[]) f9361l.clone();
    }
}
