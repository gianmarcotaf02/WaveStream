package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.legacy.IMediaControllerCallback {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;

        public static class Proxy implements androidx.media3.session.legacy.IMediaControllerCallback {
            public static androidx.media3.session.legacy.IMediaControllerCallback defaultImpl;
            private android.os.IBinder remote;

            public Proxy(android.os.IBinder iBinder) {
                this.remote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.remote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR;
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z6) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    if (this.remote.transact(11, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.media3.session.legacy.IMediaControllerCallback defaultImpl2 = androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onCaptioningEnabledChanged(z6);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR);
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.remote.transact(3, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.media3.session.legacy.IMediaControllerCallback defaultImpl2 = androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onPlaybackStateChanged(playbackStateCompat);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onRepeatModeChanged(int i3) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    if (this.remote.transact(9, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.media3.session.legacy.IMediaControllerCallback defaultImpl2 = androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onRepeatModeChanged(i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionReady() {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR);
                    if (this.remote.transact(13, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.media3.session.legacy.IMediaControllerCallback defaultImpl2 = androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onSessionReady();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChanged(int i3) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaControllerCallback.Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    if (this.remote.transact(12, parcelObtain, null, 1) || androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl() == null) {
                        return;
                    }
                    androidx.media3.session.legacy.IMediaControllerCallback defaultImpl2 = androidx.media3.session.legacy.IMediaControllerCallback.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onShuffleModeChanged(i3);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.media3.session.legacy.IMediaControllerCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.media3.session.legacy.IMediaControllerCallback)) ? new androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy(iBinder) : (androidx.media3.session.legacy.IMediaControllerCallback) iInterfaceQueryLocalInterface;
        }

        public static androidx.media3.session.legacy.IMediaControllerCallback getDefaultImpl() {
            return androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.defaultImpl;
        }

        public static boolean setDefaultImpl(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
            if (androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.defaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaControllerCallback == null) {
                return false;
            }
            androidx.media3.session.legacy.IMediaControllerCallback.Stub.Proxy.defaultImpl = iMediaControllerCallback;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
            if (i3 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onPlaybackStateChanged(parcel.readInt() != 0 ? androidx.media3.session.legacy.PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i3 == 9) {
                parcel.enforceInterface(DESCRIPTOR);
                onRepeatModeChanged(parcel.readInt());
                return true;
            }
            if (i3 == 1598968902) {
                parcel2.getClass();
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i3) {
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCaptioningEnabledChanged(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onShuffleModeChanged(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSessionReady();
                    return true;
                default:
                    return super.onTransact(i3, parcel, parcel2, i9);
            }
        }
    }

    void onCaptioningEnabledChanged(boolean z6);

    void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat);

    void onRepeatModeChanged(int i3);

    void onSessionReady();

    void onShuffleModeChanged(int i3);
}
