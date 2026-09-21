package p191x3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.C0089b f31193b = new B3.C0089b("Session", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p191x3.v f31194a;

    public f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        p191x3.v vVarH0;
        try {
            vVarH0 = com.google.android.gms.internal.cast.AbstractC1731d.b(context).h0(str, str2, new p191x3.x(this));
        } catch (android.os.RemoteException | p191x3.C3103d e6) {
            com.google.android.gms.internal.cast.AbstractC1731d.f18886a.a(e6, "Unable to call %s on %s.", "newSessionImpl", com.google.android.gms.internal.cast.C1739f.class.getSimpleName());
            vVarH0 = null;
        }
        this.f31194a = vVarH0;
    }

    public final void a(int i3) {
        p191x3.v vVar = this.f31194a;
        if (vVar == null) {
            return;
        }
        try {
            p191x3.t tVar = (p191x3.t) vVar;
            android.os.Parcel parcelY = tVar.Y();
            parcelY.writeInt(i3);
            tVar.a0(parcelY, 13);
        } catch (android.os.RemoteException e6) {
            f31193b.a(e6, "Unable to call %s on %s.", "notifySessionEnded", p191x3.v.class.getSimpleName());
        }
    }

    public final int b() {
        H3.q.d();
        p191x3.v vVar = this.f31194a;
        if (vVar == null) {
            return 0;
        }
        try {
            p191x3.t tVar = (p191x3.t) vVar;
            android.os.Parcel parcelZ = tVar.Z(tVar.Y(), 17);
            int i3 = parcelZ.readInt();
            parcelZ.recycle();
            if (i3 < 211100000) {
                return 0;
            }
            p191x3.t tVar2 = (p191x3.t) vVar;
            android.os.Parcel parcelZ2 = tVar2.Z(tVar2.Y(), 18);
            int i9 = parcelZ2.readInt();
            parcelZ2.recycle();
            return i9;
        } catch (android.os.RemoteException e6) {
            f31193b.a(e6, "Unable to call %s on %s.", "getSessionStartType", p191x3.v.class.getSimpleName());
            return 0;
        }
    }

    public final O3.a c() {
        p191x3.v vVar = this.f31194a;
        if (vVar != null) {
            try {
                p191x3.t tVar = (p191x3.t) vVar;
                android.os.Parcel parcelZ = tVar.Z(tVar.Y(), 1);
                O3.a aVarD0 = O3.b.d0(parcelZ.readStrongBinder());
                parcelZ.recycle();
                return aVarD0;
            } catch (android.os.RemoteException e6) {
                f31193b.a(e6, "Unable to call %s on %s.", "getWrappedObject", p191x3.v.class.getSimpleName());
            }
        }
        return null;
    }
}
