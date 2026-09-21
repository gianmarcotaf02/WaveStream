package com.google.android.gms.common.api;

import B3.e;
import E6.G;
import H3.q;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new e(6);

    public final int f18683h;

    public final String f18684i;

    public Scope(int i3, String str) {
        q.f(str, "scopeUri must not be null or empty");
        this.f18683h = i3;
        this.f18684i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f18684i.equals(((Scope) obj).f18684i);
    }

    public final int hashCode() {
        return this.f18684i.hashCode();
    }

    public final String toString() {
        return this.f18684i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18683h);
        G.Z(parcel, 2, this.f18684i);
        G.g0(parcel, iF0);
    }
}
