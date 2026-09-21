package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends I3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new B3.e(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f18684i;

    public Scope(int i3, java.lang.String str) {
        H3.q.f(str, "scopeUri must not be null or empty");
        this.f18683h = i3;
        this.f18684i = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.Scope)) {
            return false;
        }
        return this.f18684i.equals(((com.google.android.gms.common.api.Scope) obj).f18684i);
    }

    public final int hashCode() {
        return this.f18684i.hashCode();
    }

    public final java.lang.String toString() {
        return this.f18684i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18683h);
        E6.G.Z(parcel, 2, this.f18684i);
        E6.G.g0(parcel, iF0);
    }
}
