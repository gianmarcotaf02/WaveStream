package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: C5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0107f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5.EnumC0107f f1319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5.EnumC0107f f1320i;
    public static final C5.EnumC0107f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C5.EnumC0107f[] f1321k;

    static {
        C5.EnumC0107f enumC0107f = new C5.EnumC0107f("PIP", 0);
        f1319h = enumC0107f;
        C5.EnumC0107f enumC0107f2 = new C5.EnumC0107f("MULTIVIEW_ARMED", 1);
        f1320i = enumC0107f2;
        C5.EnumC0107f enumC0107f3 = new C5.EnumC0107f("MULTIVIEW", 2);
        j = enumC0107f3;
        C5.EnumC0107f[] enumC0107fArr = {enumC0107f, enumC0107f2, enumC0107f3};
        f1321k = enumC0107fArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0107fArr);
    }

    public static C5.EnumC0107f valueOf(java.lang.String str) {
        return (C5.EnumC0107f) java.lang.Enum.valueOf(C5.EnumC0107f.class, str);
    }

    public static C5.EnumC0107f[] values() {
        return (C5.EnumC0107f[]) f1321k.clone();
    }
}
