package p208z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3182a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p208z5.EnumC3182a f32609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p208z5.EnumC3182a f32610i;
    public static final p208z5.EnumC3182a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p208z5.EnumC3182a[] f32611k;

    static {
        p208z5.EnumC3182a enumC3182a = new p208z5.EnumC3182a("CHECKING", 0);
        f32609h = enumC3182a;
        p208z5.EnumC3182a enumC3182a2 = new p208z5.EnumC3182a("AVAILABLE", 1);
        f32610i = enumC3182a2;
        p208z5.EnumC3182a enumC3182a3 = new p208z5.EnumC3182a("UNAVAILABLE", 2);
        j = enumC3182a3;
        p208z5.EnumC3182a[] enumC3182aArr = {enumC3182a, enumC3182a2, enumC3182a3};
        f32611k = enumC3182aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3182aArr);
    }

    public static p208z5.EnumC3182a valueOf(java.lang.String str) {
        return (p208z5.EnumC3182a) java.lang.Enum.valueOf(p208z5.EnumC3182a.class, str);
    }

    public static p208z5.EnumC3182a[] values() {
        return (p208z5.EnumC3182a[]) f32611k.clone();
    }
}
