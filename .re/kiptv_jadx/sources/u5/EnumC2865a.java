package u5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2865a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u5.EnumC2865a f28704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u5.EnumC2865a[] f28705i;
    public static final /* synthetic */ p126o6.b j;

    static {
        u5.EnumC2865a enumC2865a = new u5.EnumC2865a("MAIN", 0);
        f28704h = enumC2865a;
        u5.EnumC2865a[] enumC2865aArr = {enumC2865a, new u5.EnumC2865a("SMART_HIDE", 1), new u5.EnumC2865a("ALL_HIDDEN", 2), new u5.EnumC2865a("ALL_LOCKED", 3)};
        f28705i = enumC2865aArr;
        j = com.google.crypto.tink.shaded.protobuf.q0.t(enumC2865aArr);
    }

    public static u5.EnumC2865a valueOf(java.lang.String str) {
        return (u5.EnumC2865a) java.lang.Enum.valueOf(u5.EnumC2865a.class, str);
    }

    public static u5.EnumC2865a[] values() {
        return (u5.EnumC2865a[]) f28705i.clone();
    }
}
