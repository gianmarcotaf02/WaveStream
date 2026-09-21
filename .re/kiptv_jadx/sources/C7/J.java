package C7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C7.J[] f1548h;

    /* JADX INFO: Fake field, exist only in values array */
    C7.J EF5;

    static {
        C7.J[] jArr = {new C7.J("CHECK_ONLY_LOWER", 0), new C7.J("CHECK_SUBTYPE_AND_LOWER", 1), new C7.J("SKIP_LOWER", 2)};
        f1548h = jArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(jArr);
    }

    public static C7.J valueOf(java.lang.String str) {
        return (C7.J) java.lang.Enum.valueOf(C7.J.class, str);
    }

    public static C7.J[] values() {
        return (C7.J[]) f1548h.clone();
    }
}
