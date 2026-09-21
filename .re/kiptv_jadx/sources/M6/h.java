package M6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ M6.h[] f7173h;

    /* JADX INFO: Fake field, exist only in values array */
    M6.h EF5;

    static {
        M6.h[] hVarArr = {new M6.h("FROM_DEPENDENCIES", 0), new M6.h("FROM_CLASS_LOADER", 1), new M6.h("FALLBACK", 2)};
        f7173h = hVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(hVarArr);
    }

    public static M6.h valueOf(java.lang.String str) {
        return (M6.h) java.lang.Enum.valueOf(M6.h.class, str);
    }

    public static M6.h[] values() {
        return (M6.h[]) f7173h.clone();
    }
}
