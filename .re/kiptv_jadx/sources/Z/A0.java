package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z.A0 f12185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Z.A0[] f12186i;

    static {
        Z.A0 a2 = new Z.A0("Dismissed", 0);
        f12185h = a2;
        f12186i = new Z.A0[]{a2, new Z.A0("ActionPerformed", 1)};
    }

    public static Z.A0 valueOf(java.lang.String str) {
        return (Z.A0) java.lang.Enum.valueOf(Z.A0.class, str);
    }

    public static Z.A0[] values() {
        return (Z.A0[]) f12186i.clone();
    }
}
