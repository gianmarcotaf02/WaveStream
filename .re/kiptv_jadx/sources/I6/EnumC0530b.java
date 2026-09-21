package I6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0530b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I6.EnumC0530b f5516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I6.EnumC0530b f5517i;
    public static final /* synthetic */ I6.EnumC0530b[] j;

    static {
        I6.EnumC0530b enumC0530b = new I6.EnumC0530b("JAVA", 0);
        f5516h = enumC0530b;
        I6.EnumC0530b enumC0530b2 = new I6.EnumC0530b("KOTLIN", 1);
        f5517i = enumC0530b2;
        I6.EnumC0530b[] enumC0530bArr = {enumC0530b, enumC0530b2};
        j = enumC0530bArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0530bArr);
    }

    public static I6.EnumC0530b valueOf(java.lang.String str) {
        return (I6.EnumC0530b) java.lang.Enum.valueOf(I6.EnumC0530b.class, str);
    }

    public static I6.EnumC0530b[] values() {
        return (I6.EnumC0530b[]) j.clone();
    }
}
