package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3061p0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x.EnumC3061p0 f30978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x.EnumC3061p0 f30979i;
    public static final /* synthetic */ x.EnumC3061p0[] j;

    static {
        x.EnumC3061p0 enumC3061p0 = new x.EnumC3061p0("Vertical", 0);
        f30978h = enumC3061p0;
        x.EnumC3061p0 enumC3061p1 = new x.EnumC3061p0("Horizontal", 1);
        f30979i = enumC3061p1;
        x.EnumC3061p0[] enumC3061p0Arr = {enumC3061p0, enumC3061p1};
        j = enumC3061p0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3061p0Arr);
    }

    public static x.EnumC3061p0 valueOf(java.lang.String str) {
        return (x.EnumC3061p0) java.lang.Enum.valueOf(x.EnumC3061p0.class, str);
    }

    public static x.EnumC3061p0[] values() {
        return (x.EnumC3061p0[]) j.clone();
    }
}
