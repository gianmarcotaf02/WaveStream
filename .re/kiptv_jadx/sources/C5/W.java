package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5.W f1156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5.W f1157i;
    public static final C5.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5.W f1158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C5.W[] f1159l;

    static {
        C5.W w6 = new C5.W("AUTO", 0);
        f1156h = w6;
        C5.W w9 = new C5.W("GRID", 1);
        f1157i = w9;
        C5.W w10 = new C5.W("STRIP", 2);
        j = w10;
        C5.W w11 = new C5.W("FOCUS", 3);
        f1158k = w11;
        C5.W[] wArr = {w6, w9, w10, w11};
        f1159l = wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(wArr);
    }

    public static C5.W valueOf(java.lang.String str) {
        return (C5.W) java.lang.Enum.valueOf(C5.W.class, str);
    }

    public static C5.W[] values() {
        return (C5.W[]) f1159l.clone();
    }
}
