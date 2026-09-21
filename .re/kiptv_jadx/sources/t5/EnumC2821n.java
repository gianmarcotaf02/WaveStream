package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2821n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t5.EnumC2821n f28292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t5.EnumC2821n f28293i;
    public static final /* synthetic */ t5.EnumC2821n[] j;

    static {
        t5.EnumC2821n enumC2821n = new t5.EnumC2821n("Start", 0);
        f28292h = enumC2821n;
        t5.EnumC2821n enumC2821n2 = new t5.EnumC2821n("Center", 1);
        f28293i = enumC2821n2;
        t5.EnumC2821n[] enumC2821nArr = {enumC2821n, enumC2821n2};
        j = enumC2821nArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2821nArr);
    }

    public static t5.EnumC2821n valueOf(java.lang.String str) {
        return (t5.EnumC2821n) java.lang.Enum.valueOf(t5.EnumC2821n.class, str);
    }

    public static t5.EnumC2821n[] values() {
        return (t5.EnumC2821n[]) j.clone();
    }
}
