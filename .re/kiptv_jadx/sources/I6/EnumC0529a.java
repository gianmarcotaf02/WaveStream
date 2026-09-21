package I6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0529a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I6.EnumC0529a f5514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I6.EnumC0529a f5515i;
    public static final /* synthetic */ I6.EnumC0529a[] j;

    static {
        I6.EnumC0529a enumC0529a = new I6.EnumC0529a("CALL_BY_NAME", 0);
        f5514h = enumC0529a;
        I6.EnumC0529a enumC0529a2 = new I6.EnumC0529a("POSITIONAL_CALL", 1);
        f5515i = enumC0529a2;
        I6.EnumC0529a[] enumC0529aArr = {enumC0529a, enumC0529a2};
        j = enumC0529aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0529aArr);
    }

    public static I6.EnumC0529a valueOf(java.lang.String str) {
        return (I6.EnumC0529a) java.lang.Enum.valueOf(I6.EnumC0529a.class, str);
    }

    public static I6.EnumC0529a[] values() {
        return (I6.EnumC0529a[]) j.clone();
    }
}
