package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class G0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5.G0 f950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5.G0 f951i;
    public static final C5.G0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5.G0 f952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5.G0 f953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5.G0 f954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C5.G0[] f955n;

    static {
        C5.G0 g9 = new C5.G0("None", 0);
        f950h = g9;
        C5.G0 g10 = new C5.G0("Audio", 1);
        f951i = g10;
        C5.G0 g11 = new C5.G0("Subtitles", 2);
        j = g11;
        C5.G0 g12 = new C5.G0("Speed", 3);
        f952k = g12;
        C5.G0 g13 = new C5.G0("Quality", 4);
        f953l = g13;
        C5.G0 g14 = new C5.G0("Engine", 5);
        f954m = g14;
        C5.G0[] g0Arr = {g9, g10, g11, g12, g13, g14};
        f955n = g0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(g0Arr);
    }

    public static C5.G0 valueOf(java.lang.String str) {
        return (C5.G0) java.lang.Enum.valueOf(C5.G0.class, str);
    }

    public static C5.G0[] values() {
        return (C5.G0[]) f955n.clone();
    }
}
