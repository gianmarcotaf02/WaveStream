package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class BinderWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = new B3.e(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.os.IBinder f18706h;

    public BinderWrapper(B3.B b9) {
        this.f18706h = b9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeStrongBinder(this.f18706h);
    }

    public /* synthetic */ BinderWrapper(android.os.Parcel parcel) {
        this.f18706h = parcel.readStrongBinder();
    }
}
