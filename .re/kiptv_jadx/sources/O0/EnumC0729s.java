package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0729s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O0.EnumC0729s f7686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O0.EnumC0729s f7687i;
    public static final /* synthetic */ O0.EnumC0729s[] j;

    static {
        O0.EnumC0729s enumC0729s = new O0.EnumC0729s("Width", 0);
        f7686h = enumC0729s;
        O0.EnumC0729s enumC0729s2 = new O0.EnumC0729s("Height", 1);
        f7687i = enumC0729s2;
        O0.EnumC0729s[] enumC0729sArr = {enumC0729s, enumC0729s2};
        j = enumC0729sArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0729sArr);
    }

    public static O0.EnumC0729s valueOf(java.lang.String str) {
        return (O0.EnumC0729s) java.lang.Enum.valueOf(O0.EnumC0729s.class, str);
    }

    public static O0.EnumC0729s[] values() {
        return (O0.EnumC0729s[]) j.clone();
    }
}
