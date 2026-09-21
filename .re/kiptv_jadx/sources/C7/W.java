package C7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C7.W f1568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C7.W f1569i;
    public static final /* synthetic */ C7.W[] j;

    static {
        C7.W w6 = new C7.W("SUPERTYPE", 0);
        f1568h = w6;
        C7.W w9 = new C7.W("COMMON", 1);
        f1569i = w9;
        C7.W[] wArr = {w6, w9};
        j = wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(wArr);
    }

    public static C7.W valueOf(java.lang.String str) {
        return (C7.W) java.lang.Enum.valueOf(C7.W.class, str);
    }

    public static C7.W[] values() {
        return (C7.W[]) j.clone();
    }
}
