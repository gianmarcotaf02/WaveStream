package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0935h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U.EnumC0935h f9997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U.EnumC0935h f9998i;
    public static final U.EnumC0935h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ U.EnumC0935h[] f9999k;

    static {
        U.EnumC0935h enumC0935h = new U.EnumC0935h("CROSSED", 0);
        f9997h = enumC0935h;
        U.EnumC0935h enumC0935h2 = new U.EnumC0935h("NOT_CROSSED", 1);
        f9998i = enumC0935h2;
        U.EnumC0935h enumC0935h3 = new U.EnumC0935h("COLLAPSED", 2);
        j = enumC0935h3;
        U.EnumC0935h[] enumC0935hArr = {enumC0935h, enumC0935h2, enumC0935h3};
        f9999k = enumC0935hArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0935hArr);
    }

    public static U.EnumC0935h valueOf(java.lang.String str) {
        return (U.EnumC0935h) java.lang.Enum.valueOf(U.EnumC0935h.class, str);
    }

    public static U.EnumC0935h[] values() {
        return (U.EnumC0935h[]) f9999k.clone();
    }
}
