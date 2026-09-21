package B3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements F3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f671i;

    public /* synthetic */ u(B3.x xVar, java.lang.String[] strArr, int i3) {
        this.f670h = i3;
        this.f671i = strArr;
    }

    @Override // F3.l
    public final void K(java.lang.Object obj, java.lang.Object obj2) {
        B3.y yVar = (B3.y) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f670h) {
            case 0:
                B3.w wVar = new B3.w(1, dVar);
                B3.k kVar = (B3.k) yVar.p();
                android.os.Parcel parcelY = kVar.Y();
                com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, wVar);
                parcelY.writeStringArray(this.f671i);
                kVar.b0(parcelY, 6);
                break;
            default:
                B3.w wVar2 = new B3.w(2, dVar);
                B3.k kVar2 = (B3.k) yVar.p();
                android.os.Parcel parcelY2 = kVar2.Y();
                com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY2, wVar2);
                parcelY2.writeStringArray(this.f671i);
                kVar2.b0(parcelY2, 7);
                break;
        }
    }
}
