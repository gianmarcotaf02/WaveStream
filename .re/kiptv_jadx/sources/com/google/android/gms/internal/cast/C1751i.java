package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1751i extends p105m2.AbstractC2624w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.C0089b f18925b = new B3.C0089b("MediaRouterCallback", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1747h f18926a;

    public C1751i(com.google.android.gms.internal.cast.C1747h c1747h) {
        H3.q.g(c1747h);
        this.f18926a = c1747h;
    }

    @Override // p105m2.AbstractC2624w
    public final void a(p105m2.A a2) {
        try {
            com.google.android.gms.internal.cast.C1747h c1747h = this.f18926a;
            java.lang.String str = a2.f25195c;
            android.os.Bundle bundle = a2.f25208r;
            android.os.Parcel parcelY = c1747h.Y();
            parcelY.writeString(str);
            com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, bundle);
            c1747h.a0(parcelY, 1);
        } catch (android.os.RemoteException e6) {
            f18925b.a(e6, "Unable to call %s on %s.", "onRouteAdded", com.google.android.gms.internal.cast.C1747h.class.getSimpleName());
        }
    }

    @Override // p105m2.AbstractC2624w
    public final void b(p105m2.A a2) {
        p105m2.C.b();
        if (p105m2.C.c().e() == a2) {
            try {
                com.google.android.gms.internal.cast.C1747h c1747h = this.f18926a;
                java.lang.String str = a2.f25195c;
                android.os.Bundle bundle = a2.f25208r;
                android.os.Parcel parcelY = c1747h.Y();
                parcelY.writeString(str);
                com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, bundle);
                c1747h.a0(parcelY, 2);
            } catch (android.os.RemoteException e6) {
                f18925b.a(e6, "Unable to call %s on %s.", "onRouteChanged", com.google.android.gms.internal.cast.C1747h.class.getSimpleName());
            }
        }
    }

    @Override // p105m2.AbstractC2624w
    public final void c(p105m2.A a2) {
        try {
            com.google.android.gms.internal.cast.C1747h c1747h = this.f18926a;
            java.lang.String str = a2.f25195c;
            android.os.Bundle bundle = a2.f25208r;
            android.os.Parcel parcelY = c1747h.Y();
            parcelY.writeString(str);
            com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, bundle);
            c1747h.a0(parcelY, 3);
        } catch (android.os.RemoteException e6) {
            f18925b.a(e6, "Unable to call %s on %s.", "onRouteRemoved", com.google.android.gms.internal.cast.C1747h.class.getSimpleName());
        }
    }

    @Override // p105m2.AbstractC2624w
    public final void d(p105m2.C c9, p105m2.A a2, int i3) {
        com.google.android.gms.cast.CastDevice castDeviceA;
        java.lang.String str;
        com.google.android.gms.cast.CastDevice castDeviceA2;
        com.google.android.gms.internal.cast.C1747h c1747h = this.f18926a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.lang.String str2 = a2.f25195c;
        B3.C0089b c0089b = f18925b;
        android.util.Log.i(c0089b.f617a, c0089b.d("onRouteSelected with reason = %d, routeId = %s", numValueOf, str2));
        if (a2.f25201k != 1) {
            return;
        }
        if (str2 == null) {
            str = str2;
            break;
        }
        try {
            if (str2.endsWith("-groupRoute") && (castDeviceA = com.google.android.gms.cast.CastDevice.a(a2.f25208r)) != null) {
                java.lang.String strSubstring = castDeviceA.f18617h;
                if (strSubstring.startsWith("__cast_nearby__")) {
                    strSubstring = strSubstring.substring(16);
                }
                c9.getClass();
                p105m2.C.b();
                java.util.Iterator it = p105m2.C.c().g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        p105m2.A a9 = (p105m2.A) it.next();
                        str = a9.f25195c;
                        if (str != null && !str.endsWith("-groupRoute") && (castDeviceA2 = com.google.android.gms.cast.CastDevice.a(a9.f25208r)) != null) {
                            java.lang.String strSubstring2 = castDeviceA2.f18617h;
                            if (strSubstring2.startsWith("__cast_nearby__")) {
                                strSubstring2 = strSubstring2.substring(16);
                            }
                            if (android.text.TextUtils.equals(strSubstring2, strSubstring)) {
                                c0089b.b("routeId is changed from %s to %s", str2, str);
                                break;
                            }
                        }
                    }
                }
            }
            str = str2;
            break;
        } catch (android.os.RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "onRouteSelected", com.google.android.gms.internal.cast.C1747h.class.getSimpleName());
            return;
        }
        android.os.Parcel parcelZ = c1747h.Z(c1747h.Y(), 7);
        int i9 = parcelZ.readInt();
        parcelZ.recycle();
        if (i9 < 220400000) {
            android.os.Bundle bundle = a2.f25208r;
            android.os.Parcel parcelY = c1747h.Y();
            parcelY.writeString(str);
            com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, bundle);
            c1747h.a0(parcelY, 4);
            return;
        }
        android.os.Bundle bundle2 = a2.f25208r;
        android.os.Parcel parcelY2 = c1747h.Y();
        parcelY2.writeString(str);
        parcelY2.writeString(str2);
        com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY2, bundle2);
        c1747h.a0(parcelY2, 8);
    }

    @Override // p105m2.AbstractC2624w
    public final void e(p105m2.A a2, int i3) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.lang.String str = a2.f25195c;
        B3.C0089b c0089b = f18925b;
        android.util.Log.i(c0089b.f617a, c0089b.d("onRouteUnselected with reason = %d, routeId = %s", numValueOf, str));
        if (a2.f25201k != 1) {
            c0089b.b("skip route unselection for non-cast route", new java.lang.Object[0]);
            return;
        }
        try {
            com.google.android.gms.internal.cast.C1747h c1747h = this.f18926a;
            android.os.Bundle bundle = a2.f25208r;
            android.os.Parcel parcelY = c1747h.Y();
            parcelY.writeString(str);
            com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, bundle);
            parcelY.writeInt(i3);
            c1747h.a0(parcelY, 6);
        } catch (android.os.RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "onRouteUnselected", com.google.android.gms.internal.cast.C1747h.class.getSimpleName());
        }
    }
}
