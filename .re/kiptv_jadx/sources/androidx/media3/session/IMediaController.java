package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.media3.session.IMediaController";

    public static class Default implements androidx.media3.session.IMediaController {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.media3.session.IMediaController
        public void onAvailableCommandsChangedFromPlayer(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onAvailableCommandsChangedFromSession(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onChildrenChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onConnected(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onCustomCommand(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onCustomCommandProgressUpdate(int i3, android.os.Bundle bundle, android.os.Bundle bundle2, android.os.Bundle bundle3) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onDisconnected(int i3) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onError(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onExtrasChanged(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onLibraryResult(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPeriodicSessionPositionInfoChanged(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPlayerInfoChanged(int i3, android.os.Bundle bundle, boolean z6) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onPlayerInfoChangedWithExclusions(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onRenderedFirstFrame(int i3) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSearchResultChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSessionActivityChanged(int i3, android.app.PendingIntent pendingIntent) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSessionResult(int i3, android.os.Bundle bundle) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSetCustomLayout(int i3, java.util.List<android.os.Bundle> list) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSetMediaButtonPreferences(int i3, java.util.List<android.os.Bundle> list) {
        }

        @Override // androidx.media3.session.IMediaController
        public void onSurfaceSizeChanged(int i3, int i9, int i10) {
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.media3.session.IMediaController {
        static final int TRANSACTION_onAvailableCommandsChangedFromPlayer = 3009;
        static final int TRANSACTION_onAvailableCommandsChangedFromSession = 3010;
        static final int TRANSACTION_onChildrenChanged = 4001;
        static final int TRANSACTION_onConnected = 3001;
        static final int TRANSACTION_onCustomCommand = 3005;
        static final int TRANSACTION_onCustomCommandProgressUpdate = 3017;
        static final int TRANSACTION_onDisconnected = 3006;
        static final int TRANSACTION_onError = 3015;
        static final int TRANSACTION_onExtrasChanged = 3012;
        static final int TRANSACTION_onLibraryResult = 3003;
        static final int TRANSACTION_onPeriodicSessionPositionInfoChanged = 3008;
        static final int TRANSACTION_onPlayerInfoChanged = 3007;
        static final int TRANSACTION_onPlayerInfoChangedWithExclusions = 3013;
        static final int TRANSACTION_onRenderedFirstFrame = 3011;
        static final int TRANSACTION_onSearchResultChanged = 4002;
        static final int TRANSACTION_onSessionActivityChanged = 3014;
        static final int TRANSACTION_onSessionResult = 3002;
        static final int TRANSACTION_onSetCustomLayout = 3004;
        static final int TRANSACTION_onSetMediaButtonPreferences = 3016;
        static final int TRANSACTION_onSurfaceSizeChanged = 3018;

        public static class Proxy implements androidx.media3.session.IMediaController {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.media3.session.IMediaController.DESCRIPTOR;
            }

            @Override // androidx.media3.session.IMediaController
            public void onAvailableCommandsChangedFromPlayer(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onAvailableCommandsChangedFromPlayer, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onAvailableCommandsChangedFromSession(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onAvailableCommandsChangedFromSession, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onChildrenChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i9);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onConnected(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onCustomCommand(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onCustomCommand, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onCustomCommandProgressUpdate(int i3, android.os.Bundle bundle, android.os.Bundle bundle2, android.os.Bundle bundle3) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle3, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onCustomCommandProgressUpdate, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onDisconnected(int i3) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onDisconnected, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onError(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onError, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onExtrasChanged(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onExtrasChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onLibraryResult(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPeriodicSessionPositionInfoChanged(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onPeriodicSessionPositionInfoChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPlayerInfoChanged(int i3, android.os.Bundle bundle, boolean z6) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onPlayerInfoChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onPlayerInfoChangedWithExclusions(int i3, android.os.Bundle bundle, android.os.Bundle bundle2) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onPlayerInfoChangedWithExclusions, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onRenderedFirstFrame(int i3) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onRenderedFirstFrame, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSearchResultChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i9);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSessionActivityChanged(int i3, android.app.PendingIntent pendingIntent) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onSessionActivityChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSessionResult(int i3, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSetCustomLayout(int i3, java.util.List<android.os.Bundle> list) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSetMediaButtonPreferences(int i3, java.util.List<android.os.Bundle> list) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    androidx.media3.session.IMediaController._Parcel.writeTypedList(parcelObtain, list, 0);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onSetMediaButtonPreferences, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.IMediaController
            public void onSurfaceSizeChanged(int i3, int i9, int i10) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.media3.session.IMediaController.DESCRIPTOR);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(androidx.media3.session.IMediaController.Stub.TRANSACTION_onSurfaceSizeChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, androidx.media3.session.IMediaController.DESCRIPTOR);
        }

        public static androidx.media3.session.IMediaController asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.media3.session.IMediaController.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.media3.session.IMediaController)) ? new androidx.media3.session.IMediaController.Stub.Proxy(iBinder) : (androidx.media3.session.IMediaController) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
            if (i3 >= 1 && i3 <= 16777215) {
                parcel.enforceInterface(androidx.media3.session.IMediaController.DESCRIPTOR);
            }
            if (i3 == 1598968902) {
                parcel2.writeString(androidx.media3.session.IMediaController.DESCRIPTOR);
                return true;
            }
            if (i3 == 4001) {
                onChildrenChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
            } else if (i3 != 4002) {
                switch (i3) {
                    case 3001:
                        onConnected(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3002:
                        onSessionResult(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3003:
                        onLibraryResult(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case 3004:
                        onSetCustomLayout(parcel.readInt(), parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onCustomCommand /* 3005 */:
                        int i10 = parcel.readInt();
                        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
                        onCustomCommand(i10, (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator));
                        break;
                    case TRANSACTION_onDisconnected /* 3006 */:
                        onDisconnected(parcel.readInt());
                        break;
                    case TRANSACTION_onPlayerInfoChanged /* 3007 */:
                        onPlayerInfoChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case TRANSACTION_onPeriodicSessionPositionInfoChanged /* 3008 */:
                        onPeriodicSessionPositionInfoChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onAvailableCommandsChangedFromPlayer /* 3009 */:
                        onAvailableCommandsChangedFromPlayer(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onAvailableCommandsChangedFromSession /* 3010 */:
                        int i11 = parcel.readInt();
                        android.os.Parcelable.Creator creator2 = android.os.Bundle.CREATOR;
                        onAvailableCommandsChangedFromSession(i11, (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator2), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator2));
                        break;
                    case TRANSACTION_onRenderedFirstFrame /* 3011 */:
                        onRenderedFirstFrame(parcel.readInt());
                        break;
                    case TRANSACTION_onExtrasChanged /* 3012 */:
                        onExtrasChanged(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onPlayerInfoChangedWithExclusions /* 3013 */:
                        int i12 = parcel.readInt();
                        android.os.Parcelable.Creator creator3 = android.os.Bundle.CREATOR;
                        onPlayerInfoChangedWithExclusions(i12, (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator3), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator3));
                        break;
                    case TRANSACTION_onSessionActivityChanged /* 3014 */:
                        onSessionActivityChanged(parcel.readInt(), (android.app.PendingIntent) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.app.PendingIntent.CREATOR));
                        break;
                    case TRANSACTION_onError /* 3015 */:
                        onError(parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onSetMediaButtonPreferences /* 3016 */:
                        onSetMediaButtonPreferences(parcel.readInt(), parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                        break;
                    case TRANSACTION_onCustomCommandProgressUpdate /* 3017 */:
                        int i13 = parcel.readInt();
                        android.os.Parcelable.Creator creator4 = android.os.Bundle.CREATOR;
                        onCustomCommandProgressUpdate(i13, (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator4), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator4), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, creator4));
                        break;
                    case TRANSACTION_onSurfaceSizeChanged /* 3018 */:
                        onSurfaceSizeChanged(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        break;
                    default:
                        return super.onTransact(i3, parcel, parcel2, i9);
                }
            } else {
                onSearchResultChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (android.os.Bundle) androidx.media3.session.IMediaController._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
            }
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
        public static <T extends android.os.Parcelable> void writeTypedList(android.os.Parcel parcel, java.util.List<T> list, int i3) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                writeTypedObject(parcel, list.get(i9), i3);
            }
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

    void onAvailableCommandsChangedFromPlayer(int i3, android.os.Bundle bundle);

    void onAvailableCommandsChangedFromSession(int i3, android.os.Bundle bundle, android.os.Bundle bundle2);

    void onChildrenChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle);

    void onConnected(int i3, android.os.Bundle bundle);

    void onCustomCommand(int i3, android.os.Bundle bundle, android.os.Bundle bundle2);

    void onCustomCommandProgressUpdate(int i3, android.os.Bundle bundle, android.os.Bundle bundle2, android.os.Bundle bundle3);

    void onDisconnected(int i3);

    void onError(int i3, android.os.Bundle bundle);

    void onExtrasChanged(int i3, android.os.Bundle bundle);

    void onLibraryResult(int i3, android.os.Bundle bundle);

    void onPeriodicSessionPositionInfoChanged(int i3, android.os.Bundle bundle);

    void onPlayerInfoChanged(int i3, android.os.Bundle bundle, boolean z6);

    void onPlayerInfoChangedWithExclusions(int i3, android.os.Bundle bundle, android.os.Bundle bundle2);

    void onRenderedFirstFrame(int i3);

    void onSearchResultChanged(int i3, java.lang.String str, int i9, android.os.Bundle bundle);

    void onSessionActivityChanged(int i3, android.app.PendingIntent pendingIntent);

    void onSessionResult(int i3, android.os.Bundle bundle);

    void onSetCustomLayout(int i3, java.util.List<android.os.Bundle> list);

    void onSetMediaButtonPreferences(int i3, java.util.List<android.os.Bundle> list);

    void onSurfaceSizeChanged(int i3, int i9, int i10);
}
