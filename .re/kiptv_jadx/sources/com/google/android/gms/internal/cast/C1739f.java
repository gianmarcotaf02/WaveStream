package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1739f extends X3.a {
    public final p191x3.o f0(p191x3.C3101b c3101b, O3.a aVar, p191x3.x xVar) {
        p191x3.o mVar;
        android.os.Parcel parcelY = Y();
        com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, c3101b);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, aVar);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, xVar);
        android.os.Parcel parcelZ = Z(parcelY, 3);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i3 = p191x3.n.f31201d;
        if (strongBinder == null) {
            mVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            mVar = iInterfaceQueryLocalInterface instanceof p191x3.o ? (p191x3.o) iInterfaceQueryLocalInterface : new p191x3.m(strongBinder, "com.google.android.gms.cast.framework.ICastSession", 3);
        }
        parcelZ.recycle();
        return mVar;
    }

    public final p191x3.s g0(O3.b bVar, O3.a aVar, O3.a aVar2) {
        p191x3.s qVar;
        android.os.Parcel parcelY = Y();
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, bVar);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, aVar);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, aVar2);
        android.os.Parcel parcelZ = Z(parcelY, 5);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i3 = p191x3.r.f31202d;
        if (strongBinder == null) {
            qVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            qVar = iInterfaceQueryLocalInterface instanceof p191x3.s ? (p191x3.s) iInterfaceQueryLocalInterface : new p191x3.q(strongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 3);
        }
        parcelZ.recycle();
        return qVar;
    }

    public final p191x3.v h0(java.lang.String str, java.lang.String str2, p191x3.x xVar) {
        p191x3.v tVar;
        android.os.Parcel parcelY = Y();
        parcelY.writeString(str);
        parcelY.writeString(str2);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, xVar);
        android.os.Parcel parcelZ = Z(parcelY, 2);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i3 = p191x3.u.f31203d;
        if (strongBinder == null) {
            tVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            tVar = iInterfaceQueryLocalInterface instanceof p191x3.v ? (p191x3.v) iInterfaceQueryLocalInterface : new p191x3.t(strongBinder, "com.google.android.gms.cast.framework.ISession", 3);
        }
        parcelZ.recycle();
        return tVar;
    }

    public final p206z3.e i0(O3.b bVar, p191x3.x xVar, int i3, int i9) {
        p206z3.e cVar;
        android.os.Parcel parcelY = Y();
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, bVar);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, xVar);
        parcelY.writeInt(i3);
        parcelY.writeInt(i9);
        parcelY.writeInt(0);
        parcelY.writeLong(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelY.writeInt(5);
        parcelY.writeInt(333);
        parcelY.writeInt(10000);
        android.os.Parcel parcelZ = Z(parcelY, 6);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i10 = p206z3.d.f32341d;
        if (strongBinder == null) {
            cVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = iInterfaceQueryLocalInterface instanceof p206z3.e ? (p206z3.e) iInterfaceQueryLocalInterface : new p206z3.c(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 3);
        }
        parcelZ.recycle();
        return cVar;
    }

    public final p206z3.e j0(O3.b bVar, O3.b bVar2, p191x3.x xVar, int i3, int i9) {
        p206z3.e cVar;
        android.os.Parcel parcelY = Y();
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, bVar);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, bVar2);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, xVar);
        parcelY.writeInt(i3);
        parcelY.writeInt(i9);
        parcelY.writeInt(0);
        parcelY.writeLong(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelY.writeInt(5);
        parcelY.writeInt(333);
        parcelY.writeInt(10000);
        android.os.Parcel parcelZ = Z(parcelY, 7);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i10 = p206z3.d.f32341d;
        if (strongBinder == null) {
            cVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = iInterfaceQueryLocalInterface instanceof p206z3.e ? (p206z3.e) iInterfaceQueryLocalInterface : new p206z3.c(strongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 3);
        }
        parcelZ.recycle();
        return cVar;
    }
}
