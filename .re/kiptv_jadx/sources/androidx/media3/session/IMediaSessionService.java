package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSessionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.media3.session.IMediaSessionService";

    public static class Default implements androidx.media3.session.IMediaSessionService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.IMediaSessionService
        public void connect(androidx.media3.session.IMediaController iMediaController, android.os.Bundle bundle) {
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.IMediaSessionService {
        static final int TRANSACTION_connect = 3001;

        public static class Proxy implements androidx.media3.session.IMediaSessionService {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.media3.session.IMediaSessionService
            public void connect(androidx.media3.session.IMediaController iMediaController, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaSessionService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    androidx.media3.session.IMediaSessionService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.IMediaSessionService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, androidx.media3.session.IMediaSessionService.DESCRIPTOR);
        }

        public static androidx.media3.session.IMediaSessionService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.media3.session.IMediaSessionService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.media3.session.IMediaSessionService)) ? new androidx.media3.session.IMediaSessionService.Stub.Proxy(iBinder) : (androidx.media3.session.IMediaSessionService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
            if (i3 >= 1 && i3 <= 16777215) {
                parcel.enforceInterface(androidx.media3.session.IMediaSessionService.DESCRIPTOR);
            }
            if (i3 == 1598968902) {
                parcel2.writeString(androidx.media3.session.IMediaSessionService.DESCRIPTOR);
                return true;
            }
            if (i3 != 3001) {
                return super.onTransact(i3, parcel, parcel2, i9);
            }
            connect(androidx.media3.session.IMediaController.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) androidx.media3.session.IMediaSessionService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t9, int i3) {
            if (t9 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t9.writeToParcel(parcel, i3);
            }
        }
    }

    void connect(androidx.media3.session.IMediaController iMediaController, android.os.Bundle bundle);
}
