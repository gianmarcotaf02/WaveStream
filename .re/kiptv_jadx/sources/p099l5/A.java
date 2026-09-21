package p099l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p099l5.A f24746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p099l5.A f24747i;
    public static final p099l5.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p099l5.A f24748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p099l5.A f24749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p099l5.A f24750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p099l5.A f24751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p099l5.A f24752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p099l5.A f24753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p099l5.A f24754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p099l5.A f24755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p099l5.A f24756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p099l5.A f24757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p099l5.A[] f24758u;

    static {
        p099l5.A a2 = new p099l5.A("Unknown", 0);
        f24746h = a2;
        p099l5.A a9 = new p099l5.A("Mono", 1);
        f24747i = a9;
        p099l5.A a10 = new p099l5.A("Stereo", 2);
        j = a10;
        p099l5.A a11 = new p099l5.A("Surround", 3);
        f24748k = a11;
        p099l5.A a12 = new p099l5.A("DolbyDigital", 4);
        f24749l = a12;
        p099l5.A a13 = new p099l5.A("DolbyDigitalPlus", 5);
        f24750m = a13;
        p099l5.A a14 = new p099l5.A("DolbyAtmos", 6);
        f24751n = a14;
        p099l5.A a15 = new p099l5.A("DolbyTrueHD", 7);
        f24752o = a15;
        p099l5.A a16 = new p099l5.A("Dts", 8);
        f24753p = a16;
        p099l5.A a17 = new p099l5.A("DtsHd", 9);
        f24754q = a17;
        p099l5.A a18 = new p099l5.A("Aac", 10);
        f24755r = a18;
        p099l5.A a19 = new p099l5.A("Opus", 11);
        f24756s = a19;
        p099l5.A a20 = new p099l5.A("Flac", 12);
        f24757t = a20;
        p099l5.A[] aArr = {a2, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20};
        f24758u = aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aArr);
    }

    public static java.lang.String a(int i3) {
        if (i3 >= 8) {
            return "7.1";
        }
        if (i3 >= 6) {
            return "5.1";
        }
        if (i3 >= 2) {
            return "Stereo";
        }
        if (i3 == 1) {
            return "Mono";
        }
        return null;
    }

    public static p099l5.A valueOf(java.lang.String str) {
        return (p099l5.A) java.lang.Enum.valueOf(p099l5.A.class, str);
    }

    public static p099l5.A[] values() {
        return (p099l5.A[]) f24758u.clone();
    }
}
