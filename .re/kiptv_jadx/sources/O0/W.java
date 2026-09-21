package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O0.W f7614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O0.W f7615i;
    public static final /* synthetic */ O0.W[] j;

    static {
        O0.W w6 = new O0.W("Width", 0);
        f7614h = w6;
        O0.W w9 = new O0.W("Height", 1);
        f7615i = w9;
        O0.W[] wArr = {w6, w9};
        j = wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(wArr);
    }

    public static O0.W valueOf(java.lang.String str) {
        return (O0.W) java.lang.Enum.valueOf(O0.W.class, str);
    }

    public static O0.W[] values() {
        return (O0.W[]) j.clone();
    }
}
