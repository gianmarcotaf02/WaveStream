package com.google.android.gms.cast;

/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends I3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.cast.CastDevice> CREATOR = new p184w3.D(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f18617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f18618i;
    public final java.net.InetAddress j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f18619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f18620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f18621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.List f18623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B3.z f18624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f18626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.lang.String f18627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.String f18629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f18630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.lang.String f18631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f18632x;
    public final B3.C0091d y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final java.lang.Integer f18633z;

    public CastDevice(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, java.util.ArrayList arrayList, int i9, int i10, java.lang.String str6, java.lang.String str7, int i11, java.lang.String str8, byte[] bArr, java.lang.String str9, boolean z6, B3.C0091d c0091d, java.lang.Integer num) {
        this.f18617h = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f18618i = str2;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                this.j = java.net.InetAddress.getByName(str2);
            } catch (java.net.UnknownHostException e6) {
                android.util.Log.i("CastDevice", "Unable to convert host address (" + this.f18618i + ") to ipaddress: " + e6.getMessage());
            }
        }
        this.f18619k = str3 == null ? "" : str3;
        this.f18620l = str4 == null ? "" : str4;
        this.f18621m = str5 == null ? "" : str5;
        this.f18622n = i3;
        this.f18623o = arrayList == null ? new java.util.ArrayList() : arrayList;
        this.f18625q = i10;
        this.f18626r = str6 == null ? "" : str6;
        this.f18627s = str7;
        this.f18628t = i11;
        this.f18629u = str8;
        this.f18630v = bArr;
        this.f18631w = str9;
        this.f18632x = z6;
        this.y = c0091d;
        this.f18633z = num;
        this.f18624p = new B3.z(i9, 0);
    }

    public static com.google.android.gms.cast.CastDevice a(android.os.Bundle bundle) {
        java.lang.ClassLoader classLoader;
        if (bundle == null || (classLoader = com.google.android.gms.cast.CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (com.google.android.gms.cast.CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final B3.C0091d b() {
        B3.C0091d c0091d = this.y;
        if (c0091d != null) {
            return c0091d;
        }
        B3.z zVar = this.f18624p;
        return (zVar.c() || zVar.b(128)) ? new B3.C0091d(1, false, false, null, null, null, null, null, false) : c0091d;
    }

    public final boolean equals(java.lang.Object obj) {
        int i3;
        int i9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.cast.CastDevice)) {
            return false;
        }
        com.google.android.gms.cast.CastDevice castDevice = (com.google.android.gms.cast.CastDevice) obj;
        java.lang.String str = this.f18617h;
        if (str == null) {
            return castDevice.f18617h == null;
        }
        if (B3.AbstractC0088a.e(str, castDevice.f18617h) && B3.AbstractC0088a.e(this.j, castDevice.j) && B3.AbstractC0088a.e(this.f18620l, castDevice.f18620l) && B3.AbstractC0088a.e(this.f18619k, castDevice.f18619k)) {
            java.lang.String str2 = this.f18621m;
            java.lang.String str3 = castDevice.f18621m;
            if (B3.AbstractC0088a.e(str2, str3) && (i3 = this.f18622n) == (i9 = castDevice.f18622n) && B3.AbstractC0088a.e(this.f18623o, castDevice.f18623o) && this.f18624p.f677i == castDevice.f18624p.f677i && this.f18625q == castDevice.f18625q && B3.AbstractC0088a.e(this.f18626r, castDevice.f18626r) && B3.AbstractC0088a.e(java.lang.Integer.valueOf(this.f18628t), java.lang.Integer.valueOf(castDevice.f18628t)) && B3.AbstractC0088a.e(this.f18629u, castDevice.f18629u) && B3.AbstractC0088a.e(this.f18627s, castDevice.f18627s) && B3.AbstractC0088a.e(str2, str3) && i3 == i9) {
                byte[] bArr = castDevice.f18630v;
                byte[] bArr2 = this.f18630v;
                if (((bArr2 == null && bArr == null) || java.util.Arrays.equals(bArr2, bArr)) && B3.AbstractC0088a.e(this.f18631w, castDevice.f18631w) && this.f18632x == castDevice.f18632x && B3.AbstractC0088a.e(b(), castDevice.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f18617h;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        B3.z zVar = this.f18624p;
        if (zVar.b(64)) {
            strConcat = "[dynamic group]";
        } else if (zVar.c()) {
            strConcat = "[static group]";
        } else {
            strConcat = (zVar.c() || zVar.b(128)) ? "[speaker pair]" : "";
        }
        if (zVar.b(262144)) {
            strConcat = strConcat.concat("[cast connect]");
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String str = this.f18619k;
        if (!android.text.TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = java.lang.String.format(locale, "%c%d%c", java.lang.Character.valueOf(str.charAt(0)), java.lang.Integer.valueOf(length - 2), java.lang.Character.valueOf(str.charAt(length - 1)));
            }
        }
        return B2.a.o(com.google.android.gms.internal.play_billing.M0.q("\"", str, "\" ("), this.f18617h, ") ", strConcat);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Z(parcel, 2, this.f18617h);
        E6.G.Z(parcel, 3, this.f18618i);
        E6.G.Z(parcel, 4, this.f18619k);
        E6.G.Z(parcel, 5, this.f18620l);
        E6.G.Z(parcel, 6, this.f18621m);
        E6.G.e0(parcel, 7, 4);
        parcel.writeInt(this.f18622n);
        E6.G.c0(parcel, java.util.Collections.unmodifiableList(this.f18623o), 8);
        int i9 = this.f18624p.f677i;
        E6.G.e0(parcel, 9, 4);
        parcel.writeInt(i9);
        E6.G.e0(parcel, 10, 4);
        parcel.writeInt(this.f18625q);
        E6.G.Z(parcel, 11, this.f18626r);
        E6.G.Z(parcel, 12, this.f18627s);
        E6.G.e0(parcel, 13, 4);
        parcel.writeInt(this.f18628t);
        E6.G.Z(parcel, 14, this.f18629u);
        E6.G.T(parcel, 15, this.f18630v);
        E6.G.Z(parcel, 16, this.f18631w);
        E6.G.e0(parcel, 17, 4);
        parcel.writeInt(this.f18632x ? 1 : 0);
        E6.G.Y(parcel, 18, b(), i3);
        E6.G.W(parcel, 19, this.f18633z);
        E6.G.g0(parcel, iF0);
    }
}
