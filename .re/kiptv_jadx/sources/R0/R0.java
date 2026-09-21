package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ R0.R0[] f8842h;

    /* JADX INFO: Fake field, exist only in values array */
    R0.R0 EF5;

    static {
        R0.R0[] r0Arr = {new R0.R0("Shown", 0), new R0.R0("Hidden", 1)};
        f8842h = r0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(r0Arr);
    }

    public static R0.R0 valueOf(java.lang.String str) {
        return (R0.R0) java.lang.Enum.valueOf(R0.R0.class, str);
    }

    public static R0.R0[] values() {
        return (R0.R0[]) f8842h.clone();
    }
}
