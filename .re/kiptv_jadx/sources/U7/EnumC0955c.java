package U7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0955c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U7.EnumC0955c f10175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U7.EnumC0955c f10176i;
    public static final U7.EnumC0955c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ U7.EnumC0955c[] f10177k;

    static {
        U7.EnumC0955c enumC0955c = new U7.EnumC0955c("SUSPEND", 0);
        f10175h = enumC0955c;
        U7.EnumC0955c enumC0955c2 = new U7.EnumC0955c("DROP_OLDEST", 1);
        f10176i = enumC0955c2;
        U7.EnumC0955c enumC0955c3 = new U7.EnumC0955c("DROP_LATEST", 2);
        j = enumC0955c3;
        U7.EnumC0955c[] enumC0955cArr = {enumC0955c, enumC0955c2, enumC0955c3};
        f10177k = enumC0955cArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0955cArr);
    }

    public static U7.EnumC0955c valueOf(java.lang.String str) {
        return (U7.EnumC0955c) java.lang.Enum.valueOf(U7.EnumC0955c.class, str);
    }

    public static U7.EnumC0955c[] values() {
        return (U7.EnumC0955c[]) f10177k.clone();
    }
}
