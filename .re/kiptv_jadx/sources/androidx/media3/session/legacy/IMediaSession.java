package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.legacy.IMediaSession {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getSessionInfo = 50;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        public static class Proxy implements androidx.media3.session.legacy.IMediaSession {
            public static androidx.media3.session.legacy.IMediaSession defaultImpl;
            private android.os.IBinder remote;

            public Proxy(android.os.IBinder iBinder) {
                this.remote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.remote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
                androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompatCreateFromParcel;
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    if (this.remote.transact(28, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? androidx.media3.session.legacy.PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        playbackStateCompatCreateFromParcel = defaultImpl2.getPlaybackState();
                    }
                    return playbackStateCompatCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getRepeatMode() {
                int repeatMode;
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    if (this.remote.transact(androidx.media3.session.legacy.IMediaSession.Stub.TRANSACTION_getRepeatMode, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        repeatMode = parcelObtain2.readInt();
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        repeatMode = defaultImpl2.getRepeatMode();
                    }
                    return repeatMode;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public android.os.Bundle getSessionInfo() {
                android.os.Bundle sessionInfo;
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    if (this.remote.transact(50, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        sessionInfo = parcelObtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        sessionInfo = defaultImpl2.getSessionInfo();
                    }
                    return sessionInfo;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getShuffleMode() {
                int shuffleMode;
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    if (this.remote.transact(androidx.media3.session.legacy.IMediaSession.Stub.TRANSACTION_getShuffleMode, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        shuffleMode = parcelObtain2.readInt();
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        shuffleMode = defaultImpl2.getShuffleMode();
                    }
                    return shuffleMode;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean isCaptioningEnabled() {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    if (this.remote.transact(45, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        return parcelObtain2.readInt() != 0;
                    }
                    androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    return defaultImpl2.isCaptioningEnabled();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (this.remote.transact(3, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        defaultImpl2.registerCallbackListener(iMediaControllerCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.legacy.IMediaSession.Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (this.remote.transact(4, parcelObtain, parcelObtain2, 0) || androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        androidx.media3.session.legacy.IMediaSession defaultImpl2 = androidx.media3.session.legacy.IMediaSession.Stub.getDefaultImpl();
                        defaultImpl2.getClass();
                        defaultImpl2.unregisterCallbackListener(iMediaControllerCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.media3.session.legacy.IMediaSession asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.media3.session.legacy.IMediaSession)) ? new androidx.media3.session.legacy.IMediaSession.Stub.Proxy(iBinder) : (androidx.media3.session.legacy.IMediaSession) iInterfaceQueryLocalInterface;
        }

        public static androidx.media3.session.legacy.IMediaSession getDefaultImpl() {
            return androidx.media3.session.legacy.IMediaSession.Stub.Proxy.defaultImpl;
        }

        public static boolean setDefaultImpl(androidx.media3.session.legacy.IMediaSession iMediaSession) {
            if (androidx.media3.session.legacy.IMediaSession.Stub.Proxy.defaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            androidx.media3.session.legacy.IMediaSession.Stub.Proxy.defaultImpl = iMediaSession;
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
                registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            }
            if (i3 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            }
            if (i3 == 28) {
                parcel.enforceInterface(DESCRIPTOR);
                androidx.media3.session.legacy.PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.getClass();
                parcel2.writeNoException();
                if (playbackState != null) {
                    parcel2.writeInt(1);
                    playbackState.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i3 == TRANSACTION_getRepeatMode) {
                parcel.enforceInterface(DESCRIPTOR);
                int repeatMode = getRepeatMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            }
            if (i3 == 45) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsCaptioningEnabled = isCaptioningEnabled();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zIsCaptioningEnabled ? 1 : 0);
                return true;
            }
            if (i3 == TRANSACTION_getShuffleMode) {
                parcel.enforceInterface(DESCRIPTOR);
                int shuffleMode = getShuffleMode();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(shuffleMode);
                return true;
            }
            if (i3 != 50) {
                if (i3 != 1598968902) {
                    return super.onTransact(i3, parcel, parcel2, i9);
                }
                parcel2.getClass();
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            android.os.Bundle sessionInfo = getSessionInfo();
            parcel2.getClass();
            parcel2.writeNoException();
            if (sessionInfo != null) {
                parcel2.writeInt(1);
                sessionInfo.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState();

    int getRepeatMode();

    android.os.Bundle getSessionInfo();

    int getShuffleMode();

    boolean isCaptioningEnabled();

    void registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback);

    void unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback);
}
