package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f31800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f31801i;
    public final p199y3.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p199y3.f f31802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f31803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final B3.C0089b f31799n = new B3.C0089b("CastMediaOptions", null);
    public static final android.os.Parcelable.Creator<p199y3.a> CREATOR = new p184w3.D(20);

    public a(java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, p199y3.f fVar, boolean z6, boolean z9) {
        p199y3.j jVar;
        this.f31800h = str;
        this.f31801i = str2;
        if (iBinder == null) {
            jVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            jVar = iInterfaceQueryLocalInterface instanceof p199y3.j ? (p199y3.j) iInterfaceQueryLocalInterface : new p199y3.j(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 3);
        }
        this.j = jVar;
        this.f31802k = fVar;
        this.f31803l = z6;
        this.f31804m = z9;
    }

    public final void a() {
        p199y3.j jVar = this.j;
        if (jVar != null) {
            try {
                android.os.Parcel parcelZ = jVar.Z(jVar.Y(), 2);
                O3.a aVarD0 = O3.b.d0(parcelZ.readStrongBinder());
                parcelZ.recycle();
                if (O3.b.e0(aVarD0) == null) {
                } else {
                    throw new java.lang.ClassCastException();
                }
            } catch (android.os.RemoteException e6) {
                f31799n.a(e6, "Unable to call %s on %s.", "getWrappedClientObject", p199y3.j.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f31800h);
        E6.G.Z(parcel, 3, this.f31801i);
        p199y3.j jVar = this.j;
        E6.G.U(parcel, 4, jVar == null ? null : jVar.f10839d);
        E6.G.Y(parcel, 5, this.f31802k, i3);
        E6.G.e0(parcel, 6, 4);
        parcel.writeInt(this.f31803l ? 1 : 0);
        E6.G.e0(parcel, 7, 4);
        parcel.writeInt(this.f31804m ? 1 : 0);
        E6.G.g0(parcel, iF0);
    }
}
