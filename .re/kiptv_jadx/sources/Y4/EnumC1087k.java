package Y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Y4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1087k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Y4.EnumC1087k f11954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Y4.EnumC1087k f11955i;
    public static final Y4.EnumC1087k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Y4.EnumC1087k[] f11956k;

    static {
        Y4.EnumC1087k enumC1087k = new Y4.EnumC1087k("LIVE", 0);
        f11954h = enumC1087k;
        Y4.EnumC1087k enumC1087k2 = new Y4.EnumC1087k("VOD", 1);
        f11955i = enumC1087k2;
        Y4.EnumC1087k enumC1087k3 = new Y4.EnumC1087k("SERIES", 2);
        j = enumC1087k3;
        Y4.EnumC1087k[] enumC1087kArr = {enumC1087k, enumC1087k2, enumC1087k3};
        f11956k = enumC1087kArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1087kArr);
    }

    public static Y4.EnumC1087k valueOf(java.lang.String str) {
        return (Y4.EnumC1087k) java.lang.Enum.valueOf(Y4.EnumC1087k.class, str);
    }

    public static Y4.EnumC1087k[] values() {
        return (Y4.EnumC1087k[]) f11956k.clone();
    }
}
