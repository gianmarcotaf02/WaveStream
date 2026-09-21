package p076i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i4.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2223u0 implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p076i4.EnumC2223u0 f22942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p076i4.EnumC2223u0[] f22943i;

    static {
        p076i4.EnumC2223u0 enumC2223u0 = new p076i4.EnumC2223u0("INSTANCE", 0);
        f22942h = enumC2223u0;
        f22943i = new p076i4.EnumC2223u0[]{enumC2223u0};
    }

    public static p076i4.EnumC2223u0 valueOf(java.lang.String str) {
        return (p076i4.EnumC2223u0) java.lang.Enum.valueOf(p076i4.EnumC2223u0.class, str);
    }

    public static p076i4.EnumC2223u0[] values() {
        return (p076i4.EnumC2223u0[]) f22943i.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(false, "no calls to next() since the last call to remove()");
    }
}
