package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3060p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x.EnumC3060p f30975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x.EnumC3060p f30976i;
    public static final x.EnumC3060p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x.EnumC3060p[] f30977k;

    static {
        x.EnumC3060p enumC3060p = new x.EnumC3060p("Yes", 0);
        f30975h = enumC3060p;
        x.EnumC3060p enumC3060p2 = new x.EnumC3060p("No", 1);
        f30976i = enumC3060p2;
        x.EnumC3060p enumC3060p3 = new x.EnumC3060p("NotInitialized", 2);
        j = enumC3060p3;
        x.EnumC3060p[] enumC3060pArr = {enumC3060p, enumC3060p2, enumC3060p3};
        f30977k = enumC3060pArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3060pArr);
    }

    public static x.EnumC3060p valueOf(java.lang.String str) {
        return (x.EnumC3060p) java.lang.Enum.valueOf(x.EnumC3060p.class, str);
    }

    public static x.EnumC3060p[] values() {
        return (x.EnumC3060p[]) f30977k.clone();
    }
}
