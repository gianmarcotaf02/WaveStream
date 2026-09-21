package p168t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p168t6.b[] f28520h;

    /* JADX INFO: Fake field, exist only in values array */
    p168t6.b EF5;

    static {
        p168t6.b[] bVarArr = {new p168t6.b("PRESENT", 0), new p168t6.b("ABSENT", 1), new p168t6.b("PRESENT_OPTIONAL", 2), new p168t6.b("ABSENT_OPTIONAL", 3)};
        f28520h = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static p168t6.b valueOf(java.lang.String str) {
        return (p168t6.b) java.lang.Enum.valueOf(p168t6.b.class, str);
    }

    public static p168t6.b[] values() {
        return (p168t6.b[]) f28520h.clone();
    }
}
