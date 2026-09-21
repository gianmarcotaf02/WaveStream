package com.google.android.gms.cast.framework;

/* JADX INFO: loaded from: classes.dex */
public class ReconnectionService extends android.app.Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B3.C0089b f18664i = new B3.C0089b("ReconnectionService", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p191x3.s f18665h;

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        p191x3.s sVar = this.f18665h;
        if (sVar != null) {
            try {
                p191x3.q qVar = (p191x3.q) sVar;
                android.os.Parcel parcelY = qVar.Y();
                com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, intent);
                android.os.Parcel parcelZ = qVar.Z(parcelY, 3);
                android.os.IBinder strongBinder = parcelZ.readStrongBinder();
                parcelZ.recycle();
                return strongBinder;
            } catch (android.os.RemoteException e6) {
                f18664i.a(e6, "Unable to call %s on %s.", "onBind", p191x3.s.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        O3.a aVarD0;
        O3.a aVarD1;
        p191x3.C3100a c3100aA = p191x3.C3100a.a(this);
        c3100aA.getClass();
        H3.q.d();
        p191x3.g gVar = c3100aA.f31159b;
        gVar.getClass();
        p191x3.s sVarG0 = null;
        try {
            p191x3.w wVar = gVar.f31196a;
            android.os.Parcel parcelZ = wVar.Z(wVar.Y(), 7);
            aVarD0 = O3.b.d0(parcelZ.readStrongBinder());
            parcelZ.recycle();
        } catch (android.os.RemoteException e6) {
            p191x3.g.f31195c.a(e6, "Unable to call %s on %s.", "getWrappedThis", p191x3.w.class.getSimpleName());
            aVarD0 = null;
        }
        H3.q.d();
        p191x3.i iVar = c3100aA.f31160c;
        iVar.getClass();
        try {
            p191x3.p pVar = iVar.f31199a;
            android.os.Parcel parcelZ2 = pVar.Z(pVar.Y(), 5);
            aVarD1 = O3.b.d0(parcelZ2.readStrongBinder());
            parcelZ2.recycle();
        } catch (android.os.RemoteException e9) {
            p191x3.i.f31198b.a(e9, "Unable to call %s on %s.", "getWrappedThis", p191x3.p.class.getSimpleName());
            aVarD1 = null;
        }
        B3.C0089b c0089b = com.google.android.gms.internal.cast.AbstractC1731d.f18886a;
        if (aVarD0 != null && aVarD1 != null) {
            try {
                sVarG0 = com.google.android.gms.internal.cast.AbstractC1731d.b(getApplicationContext()).g0(new O3.b(this), aVarD0, aVarD1);
            } catch (android.os.RemoteException | p191x3.C3103d e10) {
                com.google.android.gms.internal.cast.AbstractC1731d.f18886a.a(e10, "Unable to call %s on %s.", "newReconnectionServiceImpl", com.google.android.gms.internal.cast.C1739f.class.getSimpleName());
            }
        }
        this.f18665h = sVarG0;
        if (sVarG0 != null) {
            try {
                p191x3.q qVar = (p191x3.q) sVarG0;
                qVar.a0(qVar.Y(), 1);
            } catch (android.os.RemoteException e11) {
                f18664i.a(e11, "Unable to call %s on %s.", "onCreate", p191x3.s.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        p191x3.s sVar = this.f18665h;
        if (sVar != null) {
            try {
                p191x3.q qVar = (p191x3.q) sVar;
                qVar.a0(qVar.Y(), 4);
            } catch (android.os.RemoteException e6) {
                f18664i.a(e6, "Unable to call %s on %s.", "onDestroy", p191x3.s.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i3, int i9) {
        p191x3.s sVar = this.f18665h;
        if (sVar != null) {
            try {
                p191x3.q qVar = (p191x3.q) sVar;
                android.os.Parcel parcelY = qVar.Y();
                com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, intent);
                parcelY.writeInt(i3);
                parcelY.writeInt(i9);
                android.os.Parcel parcelZ = qVar.Z(parcelY, 2);
                int i10 = parcelZ.readInt();
                parcelZ.recycle();
                return i10;
            } catch (android.os.RemoteException e6) {
                f18664i.a(e6, "Unable to call %s on %s.", "onStartCommand", p191x3.s.class.getSimpleName());
            }
        }
        return 2;
    }
}
