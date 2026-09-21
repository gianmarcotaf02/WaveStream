package p191x3;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3101b extends I3.a {
    public static final android.os.Parcelable.Creator<p191x3.C3101b> CREATOR;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p191x3.z f31166x = new p191x3.z(false);
    public static final p191x3.A y = new p191x3.A(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p199y3.a f31167z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f31168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f31169i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p184w3.i f31170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f31171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p199y3.a f31172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f31173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double f31174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f31175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f31176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f31177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f31178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f31179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f31180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p191x3.z f31181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p191x3.A f31182w;

    static {
        new p199y3.f(p199y3.f.f31828P, p199y3.f.f31829Q, androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US, null, com.google.common.util.concurrent.AbstractC1903s.N("smallIconDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("stopLiveStreamDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("pauseDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("playDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("skipNextDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("skipPrevDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("forwardDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("forward10DrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("forward30DrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewindDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewind10DrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewind30DrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("disconnectDrawableResId"), com.google.common.util.concurrent.AbstractC1903s.N("notificationImageSizeDimenResId"), com.google.common.util.concurrent.AbstractC1903s.N("castingToDeviceStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("stopLiveStreamStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("pauseStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("playStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("skipNextStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("skipPrevStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("forwardStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("forward10StringResId"), com.google.common.util.concurrent.AbstractC1903s.N("forward30StringResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewindStringResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewind10StringResId"), com.google.common.util.concurrent.AbstractC1903s.N("rewind30StringResId"), com.google.common.util.concurrent.AbstractC1903s.N("disconnectStringResId"), null, false, false);
        f31167z = new p199y3.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new p184w3.D(19);
    }

    public C3101b(java.lang.String str, java.util.ArrayList arrayList, boolean z6, p184w3.i iVar, boolean z9, p199y3.a aVar, boolean z10, double d4, boolean z11, boolean z12, boolean z13, java.util.ArrayList arrayList2, boolean z14, boolean z15, p191x3.z zVar, p191x3.A a2) {
        this.f31168h = true == android.text.TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        this.f31169i = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.j = z6;
        this.f31170k = iVar == null ? new p184w3.i() : iVar;
        this.f31171l = z9;
        this.f31172m = aVar;
        this.f31173n = z10;
        this.f31174o = d4;
        this.f31175p = z11;
        this.f31176q = z12;
        this.f31177r = z13;
        this.f31178s = arrayList2;
        this.f31179t = z14;
        this.f31180u = z15;
        this.f31181v = zVar;
        this.f31182w = a2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f31168h);
        E6.G.a0(parcel, java.util.Collections.unmodifiableList(this.f31169i), 3);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        E6.G.Y(parcel, 5, this.f31170k, i3);
        E6.G.e0(parcel, 6, 4);
        parcel.writeInt(this.f31171l ? 1 : 0);
        E6.G.Y(parcel, 7, this.f31172m, i3);
        E6.G.e0(parcel, 8, 4);
        parcel.writeInt(this.f31173n ? 1 : 0);
        E6.G.e0(parcel, 9, 8);
        parcel.writeDouble(this.f31174o);
        E6.G.e0(parcel, 10, 4);
        parcel.writeInt(this.f31175p ? 1 : 0);
        E6.G.e0(parcel, 11, 4);
        parcel.writeInt(this.f31176q ? 1 : 0);
        E6.G.e0(parcel, 12, 4);
        parcel.writeInt(this.f31177r ? 1 : 0);
        E6.G.a0(parcel, java.util.Collections.unmodifiableList(this.f31178s), 13);
        E6.G.e0(parcel, 14, 4);
        parcel.writeInt(this.f31179t ? 1 : 0);
        E6.G.e0(parcel, 15, 4);
        parcel.writeInt(0);
        E6.G.e0(parcel, 16, 4);
        parcel.writeInt(this.f31180u ? 1 : 0);
        E6.G.Y(parcel, 17, this.f31181v, i3);
        E6.G.Y(parcel, 18, this.f31182w, i3);
        E6.G.g0(parcel, iF0);
    }
}
