package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1532n {
    private static final /* synthetic */ p126o6.a $ENTRIES;
    private static final /* synthetic */ androidx.lifecycle.EnumC1532n[] $VALUES;
    public static final androidx.lifecycle.C1530l Companion;
    public static final androidx.lifecycle.EnumC1532n ON_ANY;
    public static final androidx.lifecycle.EnumC1532n ON_CREATE;
    public static final androidx.lifecycle.EnumC1532n ON_DESTROY;
    public static final androidx.lifecycle.EnumC1532n ON_PAUSE;
    public static final androidx.lifecycle.EnumC1532n ON_RESUME;
    public static final androidx.lifecycle.EnumC1532n ON_START;
    public static final androidx.lifecycle.EnumC1532n ON_STOP;

    static {
        androidx.lifecycle.EnumC1532n enumC1532n = new androidx.lifecycle.EnumC1532n("ON_CREATE", 0);
        ON_CREATE = enumC1532n;
        androidx.lifecycle.EnumC1532n enumC1532n2 = new androidx.lifecycle.EnumC1532n("ON_START", 1);
        ON_START = enumC1532n2;
        androidx.lifecycle.EnumC1532n enumC1532n3 = new androidx.lifecycle.EnumC1532n("ON_RESUME", 2);
        ON_RESUME = enumC1532n3;
        androidx.lifecycle.EnumC1532n enumC1532n4 = new androidx.lifecycle.EnumC1532n("ON_PAUSE", 3);
        ON_PAUSE = enumC1532n4;
        androidx.lifecycle.EnumC1532n enumC1532n5 = new androidx.lifecycle.EnumC1532n("ON_STOP", 4);
        ON_STOP = enumC1532n5;
        androidx.lifecycle.EnumC1532n enumC1532n6 = new androidx.lifecycle.EnumC1532n("ON_DESTROY", 5);
        ON_DESTROY = enumC1532n6;
        androidx.lifecycle.EnumC1532n enumC1532n7 = new androidx.lifecycle.EnumC1532n("ON_ANY", 6);
        ON_ANY = enumC1532n7;
        androidx.lifecycle.EnumC1532n[] enumC1532nArr = {enumC1532n, enumC1532n2, enumC1532n3, enumC1532n4, enumC1532n5, enumC1532n6, enumC1532n7};
        $VALUES = enumC1532nArr;
        $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(enumC1532nArr);
        Companion = new androidx.lifecycle.C1530l();
    }

    public static androidx.lifecycle.EnumC1532n valueOf(java.lang.String str) {
        return (androidx.lifecycle.EnumC1532n) java.lang.Enum.valueOf(androidx.lifecycle.EnumC1532n.class, str);
    }

    public static androidx.lifecycle.EnumC1532n[] values() {
        return (androidx.lifecycle.EnumC1532n[]) $VALUES.clone();
    }

    public final androidx.lifecycle.EnumC1533o a() {
        switch (androidx.lifecycle.AbstractC1531m.f16363a[ordinal()]) {
            case 1:
            case 2:
                return androidx.lifecycle.EnumC1533o.j;
            case 3:
            case 4:
                return androidx.lifecycle.EnumC1533o.f16366k;
            case 5:
                return androidx.lifecycle.EnumC1533o.f16367l;
            case 6:
                return androidx.lifecycle.EnumC1533o.f16364h;
            case 7:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
            default:
                throw new I3.b();
        }
    }
}
