package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0936i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U.EnumC0936i f10003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U.EnumC0936i f10004i;
    public static final U.EnumC0936i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final U.EnumC0936i f10005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ U.EnumC0936i[] f10006l;

    static {
        U.EnumC0936i enumC0936i = new U.EnumC0936i("Up", 0);
        f10003h = enumC0936i;
        U.EnumC0936i enumC0936i2 = new U.EnumC0936i("Drag", 1);
        f10004i = enumC0936i2;
        U.EnumC0936i enumC0936i3 = new U.EnumC0936i("Timeout", 2);
        j = enumC0936i3;
        U.EnumC0936i enumC0936i4 = new U.EnumC0936i("Cancel", 3);
        f10005k = enumC0936i4;
        U.EnumC0936i[] enumC0936iArr = {enumC0936i, enumC0936i2, enumC0936i3, enumC0936i4};
        f10006l = enumC0936iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0936iArr);
    }

    public static U.EnumC0936i valueOf(java.lang.String str) {
        return (U.EnumC0936i) java.lang.Enum.valueOf(U.EnumC0936i.class, str);
    }

    public static U.EnumC0936i[] values() {
        return (U.EnumC0936i[]) f10006l.clone();
    }
}
