package androidx.media3.session.legacy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IMediaControllerCallback extends IInterface {

    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;

        public static class Proxy implements IMediaControllerCallback {
            public static IMediaControllerCallback defaultImpl;
            private IBinder remote;

            public Proxy(IBinder iBinder) {
                this.remote = iBinder;
            }

            @Override
            public IBinder asBinder() {
                return this.remote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override
            public void onCaptioningEnabledChanged(boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    if (this.remote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    IMediaControllerCallback defaultImpl2 = Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onCaptioningEnabledChanged(z6);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.remote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    IMediaControllerCallback defaultImpl2 = Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onPlaybackStateChanged(playbackStateCompat);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onRepeatModeChanged(int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    if (this.remote.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    IMediaControllerCallback defaultImpl2 = Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onRepeatModeChanged(i3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onSessionReady() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.remote.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    IMediaControllerCallback defaultImpl2 = Stub.getDefaultImpl();
                    defaultImpl2.getClass();
                    defaultImpl2.onSessionReady();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onShuffleModeChanged(int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    if (this.remote.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    IMediaControllerCallback defaultImpl2 = Stub.getDefaultImpl();
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

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) ? new Proxy(iBinder) : (IMediaControllerCallback) iInterfaceQueryLocalInterface;
        }

        public static IMediaControllerCallback getDefaultImpl() {
            return Proxy.defaultImpl;
        }

        public static boolean setDefaultImpl(IMediaControllerCallback iMediaControllerCallback) {
            if (Proxy.defaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaControllerCallback == null) {
                return false;
            }
            Proxy.defaultImpl = iMediaControllerCallback;
            return true;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
            if (i3 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                onPlaybackStateChanged(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
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

    void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

    void onRepeatModeChanged(int i3);

    void onSessionReady();

    void onShuffleModeChanged(int i3);
}
