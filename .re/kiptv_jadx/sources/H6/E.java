package H6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H6.E f4368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H6.E f4369i;
    public static final /* synthetic */ H6.E[] j;

    static {
        H6.E e6 = new H6.E("DECLARED", 0);
        f4368h = e6;
        H6.E e9 = new H6.E("INHERITED", 1);
        f4369i = e9;
        H6.E[] eArr = {e6, e9};
        j = eArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(eArr);
    }

    public static H6.E valueOf(java.lang.String str) {
        return (H6.E) java.lang.Enum.valueOf(H6.E.class, str);
    }

    public static H6.E[] values() {
        return (H6.E[]) j.clone();
    }
}
