package p175v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2907b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p175v0.EnumC2907b f29062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p175v0.EnumC2907b f29063i;
    public static final p175v0.EnumC2907b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p175v0.EnumC2907b[] f29064k;

    static {
        p175v0.EnumC2907b enumC2907b = new p175v0.EnumC2907b("None", 0);
        f29062h = enumC2907b;
        p175v0.EnumC2907b enumC2907b2 = new p175v0.EnumC2907b("Cancelled", 1);
        f29063i = enumC2907b2;
        p175v0.EnumC2907b enumC2907b3 = new p175v0.EnumC2907b("Redirected", 2);
        j = enumC2907b3;
        p175v0.EnumC2907b[] enumC2907bArr = {enumC2907b, enumC2907b2, enumC2907b3, new p175v0.EnumC2907b("RedirectCancelled", 3)};
        f29064k = enumC2907bArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2907bArr);
    }

    public static p175v0.EnumC2907b valueOf(java.lang.String str) {
        return (p175v0.EnumC2907b) java.lang.Enum.valueOf(p175v0.EnumC2907b.class, str);
    }

    public static p175v0.EnumC2907b[] values() {
        return (p175v0.EnumC2907b[]) f29064k.clone();
    }
}
