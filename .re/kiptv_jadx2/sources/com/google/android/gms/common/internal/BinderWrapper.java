package com.google.android.gms.common.internal;

import B3.B;
import B3.e;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new e(15);

    public final IBinder f18706h;

    public BinderWrapper(B b9) {
        this.f18706h = b9;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStrongBinder(this.f18706h);
    }

    public BinderWrapper(Parcel parcel) {
        this.f18706h = parcel.readStrongBinder();
    }
}
