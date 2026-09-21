package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class s implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p048f1.s f21666i;
    public static final p048f1.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p048f1.s f21667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p048f1.s f21668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p048f1.s f21669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p048f1.s f21670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p048f1.s f21671o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21672h;

    static {
        p048f1.s sVar = new p048f1.s(100);
        p048f1.s sVar2 = new p048f1.s(200);
        p048f1.s sVar3 = new p048f1.s(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNSUCCESSFUL);
        p048f1.s sVar4 = new p048f1.s(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST);
        f21666i = sVar4;
        p048f1.s sVar5 = new p048f1.s(500);
        j = sVar5;
        p048f1.s sVar6 = new p048f1.s(600);
        f21667k = sVar6;
        p048f1.s sVar7 = new p048f1.s(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
        p048f1.s sVar8 = new p048f1.s(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING);
        p048f1.s sVar9 = new p048f1.s(org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR);
        f21668l = sVar4;
        f21669m = sVar5;
        f21670n = sVar6;
        f21671o = sVar7;
        p078i6.p.B0(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }

    public s(int i3) {
        this.f21672h = i3;
        boolean z6 = false;
        if (1 <= i3 && i3 < 1001) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        p065h1.a.a("Font weight can be in range [1, 1000]. Current value: " + i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p048f1.s sVar) {
        return kotlin.jvm.internal.m.f(this.f21672h, sVar.f21672h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p048f1.s) {
            return this.f21672h == ((p048f1.s) obj).f21672h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21672h;
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("FontWeight(weight="), this.f21672h, ')');
    }
}
