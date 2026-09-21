package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.support.v4.media.session.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.IBinder f15587c;

    @Override // android.support.v4.media.session.b
    public final void V(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                parcelObtain.writeInt(1);
                playbackStateCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15587c.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f15587c;
    }
}
