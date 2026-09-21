package com.google.android.gms.fido.common;

/* JADX INFO: loaded from: classes.dex */
public enum Transport implements com.google.android.gms.common.internal.ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.common.Transport> CREATOR = new B3.e(19);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f18731h;

    Transport(java.lang.String str) {
        this.f18731h = str;
    }

    public static com.google.android.gms.fido.common.Transport a(java.lang.String str) throws R3.a {
        if (str.equals("hybrid")) {
            p014b4.C.f17874a.getClass();
            if (p014b4.AbstractC1659a.f17878i == null) {
                p014b4.AbstractC1659a.f17878i = new F6.a();
            }
            synchronized (p014b4.AbstractC1659a.f17877h) {
            }
            throw new java.lang.IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        for (com.google.android.gms.fido.common.Transport transport : values()) {
            if (str.equals(transport.f18731h)) {
                return transport;
            }
        }
        throw new R3.a(Y6.f.h("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f18731h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f18731h);
    }
}
