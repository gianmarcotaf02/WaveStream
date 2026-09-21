package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B3.C0089b f31195c = new B3.C0089b("SessionManager", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p191x3.w f31196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f31197b;

    public g(p191x3.w wVar, android.content.Context context) {
        this.f31196a = wVar;
        this.f31197b = context;
    }

    public final void a(p191x3.h hVar) {
        H3.q.d();
        try {
            p191x3.w wVar = this.f31196a;
            p191x3.y yVar = new p191x3.y(hVar);
            android.os.Parcel parcelY = wVar.Y();
            com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, yVar);
            wVar.a0(parcelY, 2);
        } catch (android.os.RemoteException e6) {
            f31195c.a(e6, "Unable to call %s on %s.", "addSessionManagerListener", p191x3.w.class.getSimpleName());
        }
    }

    public final void b(boolean z6) {
        B3.C0089b c0089b = f31195c;
        H3.q.d();
        try {
            android.util.Log.i(c0089b.f617a, c0089b.d("End session for %s", this.f31197b.getPackageName()));
            p191x3.w wVar = this.f31196a;
            android.os.Parcel parcelY = wVar.Y();
            int i3 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
            parcelY.writeInt(1);
            parcelY.writeInt(z6 ? 1 : 0);
            wVar.a0(parcelY, 6);
        } catch (android.os.RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "endCurrentSession", p191x3.w.class.getSimpleName());
        }
    }

    public final p191x3.f c() {
        H3.q.d();
        try {
            p191x3.w wVar = this.f31196a;
            android.os.Parcel parcelZ = wVar.Z(wVar.Y(), 1);
            O3.a aVarD0 = O3.b.d0(parcelZ.readStrongBinder());
            parcelZ.recycle();
            return (p191x3.f) O3.b.e0(aVarD0);
        } catch (android.os.RemoteException e6) {
            f31195c.a(e6, "Unable to call %s on %s.", "getWrappedCurrentSession", p191x3.w.class.getSimpleName());
            return null;
        }
    }
}
