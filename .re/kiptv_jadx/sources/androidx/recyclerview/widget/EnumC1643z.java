package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1643z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.recyclerview.widget.EnumC1643z f17523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ androidx.recyclerview.widget.EnumC1643z[] f17524i;

    static {
        androidx.recyclerview.widget.EnumC1643z enumC1643z = new androidx.recyclerview.widget.EnumC1643z("ALLOW", 0);
        f17523h = enumC1643z;
        f17524i = new androidx.recyclerview.widget.EnumC1643z[]{enumC1643z, new androidx.recyclerview.widget.EnumC1643z("PREVENT_WHEN_EMPTY", 1), new androidx.recyclerview.widget.EnumC1643z("PREVENT", 2)};
    }

    public static androidx.recyclerview.widget.EnumC1643z valueOf(java.lang.String str) {
        return (androidx.recyclerview.widget.EnumC1643z) java.lang.Enum.valueOf(androidx.recyclerview.widget.EnumC1643z.class, str);
    }

    public static androidx.recyclerview.widget.EnumC1643z[] values() {
        return (androidx.recyclerview.widget.EnumC1643z[]) f17524i.clone();
    }
}
