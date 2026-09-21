package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3.C0089b f18886a = new B3.C0089b("CastDynamiteModule", null);

    public static p191x3.l a(android.content.Context context, p191x3.C3101b c3101b, com.google.android.gms.internal.cast.BinderC1783q binderC1783q, java.util.HashMap map) throws p191x3.C3103d {
        p191x3.l jVar;
        com.google.android.gms.internal.cast.C1739f c1739fB = b(context);
        O3.b bVar = new O3.b(context.getApplicationContext());
        android.os.Parcel parcelY = c1739fB.Y();
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, bVar);
        com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, c3101b);
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, binderC1783q);
        parcelY.writeMap(map);
        android.os.Parcel parcelZ = c1739fB.Z(parcelY, 1);
        android.os.IBinder strongBinder = parcelZ.readStrongBinder();
        int i3 = p191x3.k.f31200d;
        if (strongBinder == null) {
            jVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            jVar = iInterfaceQueryLocalInterface instanceof p191x3.l ? (p191x3.l) iInterfaceQueryLocalInterface : new p191x3.j(strongBinder, "com.google.android.gms.cast.framework.ICastContext", 3);
        }
        parcelZ.recycle();
        return jVar;
    }

    public static com.google.android.gms.internal.cast.C1739f b(android.content.Context context) throws p191x3.C3103d {
        try {
            try {
                android.os.IBinder iBinder = (android.os.IBinder) P3.d.b(context, P3.d.f8108b).f8117a.getClassLoader().loadClass("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl").newInstance();
                if (iBinder == null) {
                    return null;
                }
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
                return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.cast.C1739f ? (com.google.android.gms.internal.cast.C1739f) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.cast.C1739f(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 3);
            } catch (java.lang.ClassNotFoundException e6) {
                e = e6;
                throw new P3.b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (java.lang.IllegalAccessException e9) {
                e = e9;
                throw new P3.b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            } catch (java.lang.InstantiationException e10) {
                e = e10;
                throw new P3.b("Failed to instantiate module class: ".concat("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"), e);
            }
        } catch (P3.b e11) {
            throw new p191x3.C3103d(e11);
        }
    }
}
