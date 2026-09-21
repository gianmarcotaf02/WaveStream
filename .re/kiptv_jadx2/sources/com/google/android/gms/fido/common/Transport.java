package com.google.android.gms.fido.common;

import B3.e;
import R3.a;
import Y6.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p014b4.AbstractC1659a;
import p014b4.C;

public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new e(19);

    public final String f18731h;

    Transport(String str) {
        this.f18731h = str;
    }

    public static Transport a(String str) throws a {
        if (str.equals("hybrid")) {
            C.f17874a.getClass();
            if (AbstractC1659a.f17878i == null) {
                AbstractC1659a.f17878i = new F6.a();
            }
            synchronized (AbstractC1659a.f17877h) {
            }
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        for (Transport transport : values()) {
            if (str.equals(transport.f18731h)) {
                return transport;
            }
        }
        throw new a(f.h("Transport ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f18731h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f18731h);
    }
}
