package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;

public interface IMediaSession extends IInterface {
    public static final String DESCRIPTOR = "androidx.media3.session.IMediaSession";

    public static class Default implements IMediaSession {
        @Override
        public void addMediaItem(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void addMediaItemWithIndex(IMediaController iMediaController, int i3, int i9, Bundle bundle) {
        }

        @Override
        public void addMediaItems(IMediaController iMediaController, int i3, IBinder iBinder) {
        }

        @Override
        public void addMediaItemsWithIndex(IMediaController iMediaController, int i3, int i9, IBinder iBinder) {
        }

        @Override
        public IBinder asBinder() {
            return null;
        }

        @Override
        public void clearMediaItems(IMediaController iMediaController, int i3) {
        }

        @Override
        public void connect(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void decreaseDeviceVolume(IMediaController iMediaController, int i3) {
        }

        @Override
        public void decreaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void flushCommandQueue(IMediaController iMediaController) {
        }

        @Override
        public void getChildren(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle) {
        }

        @Override
        public void getItem(IMediaController iMediaController, int i3, String str) {
        }

        @Override
        public void getLibraryRoot(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void getSearchResult(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle) {
        }

        @Override
        public void increaseDeviceVolume(IMediaController iMediaController, int i3) {
        }

        @Override
        public void increaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void moveMediaItem(IMediaController iMediaController, int i3, int i9, int i10) {
        }

        @Override
        public void moveMediaItems(IMediaController iMediaController, int i3, int i9, int i10, int i11) {
        }

        @Override
        public void mute(IMediaController iMediaController, int i3) {
        }

        @Override
        public void onControllerResult(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void onCustomCommand(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2) {
        }

        @Override
        public void onCustomCommandWithProgressUpdate(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2, boolean z6) {
        }

        @Override
        public void onSurfaceSizeChanged(IMediaController iMediaController, int i3, int i9, int i10) {
        }

        @Override
        public void pause(IMediaController iMediaController, int i3) {
        }

        @Override
        public void play(IMediaController iMediaController, int i3) {
        }

        @Override
        public void prepare(IMediaController iMediaController, int i3) {
        }

        @Override
        public void release(IMediaController iMediaController, int i3) {
        }

        @Override
        public void removeMediaItem(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void removeMediaItems(IMediaController iMediaController, int i3, int i9, int i10) {
        }

        @Override
        public void replaceMediaItem(IMediaController iMediaController, int i3, int i9, Bundle bundle) {
        }

        @Override
        public void replaceMediaItems(IMediaController iMediaController, int i3, int i9, int i10, IBinder iBinder) {
        }

        @Override
        public void search(IMediaController iMediaController, int i3, String str, Bundle bundle) {
        }

        @Override
        public void seekBack(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekForward(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekTo(IMediaController iMediaController, int i3, long j) {
        }

        @Override
        public void seekToDefaultPosition(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekToDefaultPositionWithMediaItemIndex(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void seekToNext(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekToNextMediaItem(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekToPrevious(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekToPreviousMediaItem(IMediaController iMediaController, int i3) {
        }

        @Override
        public void seekToWithMediaItemIndex(IMediaController iMediaController, int i3, int i9, long j) {
        }

        @Override
        public void setAudioAttributes(IMediaController iMediaController, int i3, Bundle bundle, boolean z6) {
        }

        @Override
        public void setDeviceMuted(IMediaController iMediaController, int i3, boolean z6) {
        }

        @Override
        public void setDeviceMutedWithFlags(IMediaController iMediaController, int i3, boolean z6, int i9) {
        }

        @Override
        public void setDeviceVolume(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void setDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9, int i10) {
        }

        @Override
        public void setMediaItem(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void setMediaItemWithResetPosition(IMediaController iMediaController, int i3, Bundle bundle, boolean z6) {
        }

        @Override
        public void setMediaItemWithStartPosition(IMediaController iMediaController, int i3, Bundle bundle, long j) {
        }

        @Override
        public void setMediaItems(IMediaController iMediaController, int i3, IBinder iBinder) {
        }

        @Override
        public void setMediaItemsWithResetPosition(IMediaController iMediaController, int i3, IBinder iBinder, boolean z6) {
        }

        @Override
        public void setMediaItemsWithStartIndex(IMediaController iMediaController, int i3, IBinder iBinder, int i9, long j) {
        }

        @Override
        public void setPlayWhenReady(IMediaController iMediaController, int i3, boolean z6) {
        }

        @Override
        public void setPlaybackParameters(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void setPlaybackSpeed(IMediaController iMediaController, int i3, float f9) {
        }

        @Override
        public void setPlaylistMetadata(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void setRating(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void setRatingWithMediaId(IMediaController iMediaController, int i3, String str, Bundle bundle) {
        }

        @Override
        public void setRepeatMode(IMediaController iMediaController, int i3, int i9) {
        }

        @Override
        public void setShuffleModeEnabled(IMediaController iMediaController, int i3, boolean z6) {
        }

        @Override
        public void setTrackSelectionParameters(IMediaController iMediaController, int i3, Bundle bundle) {
        }

        @Override
        public void setVideoSurface(IMediaController iMediaController, int i3, Surface surface) {
        }

        @Override
        public void setVideoSurfaceWithSize(IMediaController iMediaController, int i3, Surface surface, int i9, int i10) {
        }

        @Override
        public void setVolume(IMediaController iMediaController, int i3, float f9) {
        }

        @Override
        public void stop(IMediaController iMediaController, int i3) {
        }

        @Override
        public void subscribe(IMediaController iMediaController, int i3, String str, Bundle bundle) {
        }

        @Override
        public void unmute(IMediaController iMediaController, int i3) {
        }

        @Override
        public void unsubscribe(IMediaController iMediaController, int i3, String str) {
        }
    }

    public static abstract class Stub extends Binder implements IMediaSession {
        static final int TRANSACTION_addMediaItem = 3029;
        static final int TRANSACTION_addMediaItemWithIndex = 3030;
        static final int TRANSACTION_addMediaItems = 3031;
        static final int TRANSACTION_addMediaItemsWithIndex = 3032;
        static final int TRANSACTION_clearMediaItems = 3021;
        static final int TRANSACTION_connect = 3015;
        static final int TRANSACTION_decreaseDeviceVolume = 3005;
        static final int TRANSACTION_decreaseDeviceVolumeWithFlags = 3053;
        static final int TRANSACTION_flushCommandQueue = 3045;
        static final int TRANSACTION_getChildren = 4003;
        static final int TRANSACTION_getItem = 4002;
        static final int TRANSACTION_getLibraryRoot = 4001;
        static final int TRANSACTION_getSearchResult = 4005;
        static final int TRANSACTION_increaseDeviceVolume = 3004;
        static final int TRANSACTION_increaseDeviceVolumeWithFlags = 3052;
        static final int TRANSACTION_moveMediaItem = 3022;
        static final int TRANSACTION_moveMediaItems = 3023;
        static final int TRANSACTION_mute = 3058;
        static final int TRANSACTION_onControllerResult = 3014;
        static final int TRANSACTION_onCustomCommand = 3016;
        static final int TRANSACTION_onCustomCommandWithProgressUpdate = 3060;
        static final int TRANSACTION_onSurfaceSizeChanged = 3062;
        static final int TRANSACTION_pause = 3025;
        static final int TRANSACTION_play = 3024;
        static final int TRANSACTION_prepare = 3026;
        static final int TRANSACTION_release = 3035;
        static final int TRANSACTION_removeMediaItem = 3019;
        static final int TRANSACTION_removeMediaItems = 3020;
        static final int TRANSACTION_replaceMediaItem = 3055;
        static final int TRANSACTION_replaceMediaItems = 3056;
        static final int TRANSACTION_search = 4004;
        static final int TRANSACTION_seekBack = 3040;
        static final int TRANSACTION_seekForward = 3041;
        static final int TRANSACTION_seekTo = 3038;
        static final int TRANSACTION_seekToDefaultPosition = 3036;
        static final int TRANSACTION_seekToDefaultPositionWithMediaItemIndex = 3037;
        static final int TRANSACTION_seekToNext = 3047;
        static final int TRANSACTION_seekToNextMediaItem = 3043;
        static final int TRANSACTION_seekToPrevious = 3046;
        static final int TRANSACTION_seekToPreviousMediaItem = 3042;
        static final int TRANSACTION_seekToWithMediaItemIndex = 3039;
        static final int TRANSACTION_setAudioAttributes = 3057;
        static final int TRANSACTION_setDeviceMuted = 3006;
        static final int TRANSACTION_setDeviceMutedWithFlags = 3054;
        static final int TRANSACTION_setDeviceVolume = 3003;
        static final int TRANSACTION_setDeviceVolumeWithFlags = 3051;
        static final int TRANSACTION_setMediaItem = 3007;
        static final int TRANSACTION_setMediaItemWithResetPosition = 3009;
        static final int TRANSACTION_setMediaItemWithStartPosition = 3008;
        static final int TRANSACTION_setMediaItems = 3010;
        static final int TRANSACTION_setMediaItemsWithResetPosition = 3011;
        static final int TRANSACTION_setMediaItemsWithStartIndex = 3012;
        static final int TRANSACTION_setPlayWhenReady = 3013;
        static final int TRANSACTION_setPlaybackParameters = 3027;
        static final int TRANSACTION_setPlaybackSpeed = 3028;
        static final int TRANSACTION_setPlaylistMetadata = 3033;
        static final int TRANSACTION_setRating = 3050;
        static final int TRANSACTION_setRatingWithMediaId = 3049;
        static final int TRANSACTION_setRepeatMode = 3017;
        static final int TRANSACTION_setShuffleModeEnabled = 3018;
        static final int TRANSACTION_setTrackSelectionParameters = 3048;
        static final int TRANSACTION_setVideoSurface = 3044;
        static final int TRANSACTION_setVideoSurfaceWithSize = 3061;
        static final int TRANSACTION_setVolume = 3002;
        static final int TRANSACTION_stop = 3034;
        static final int TRANSACTION_subscribe = 4006;
        static final int TRANSACTION_unmute = 3059;
        static final int TRANSACTION_unsubscribe = 4007;

        public static class Proxy implements IMediaSession {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override
            public void addMediaItem(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_addMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void addMediaItemWithIndex(IMediaController iMediaController, int i3, int i9, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_addMediaItemWithIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void addMediaItems(IMediaController iMediaController, int i3, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_addMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void addMediaItemsWithIndex(IMediaController iMediaController, int i3, int i9, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_addMediaItemsWithIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override
            public void clearMediaItems(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_clearMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void connect(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_connect, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void decreaseDeviceVolume(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_decreaseDeviceVolume, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void decreaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_decreaseDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void flushCommandQueue(IMediaController iMediaController) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    this.mRemote.transact(Stub.TRANSACTION_flushCommandQueue, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void getChildren(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMediaSession.DESCRIPTOR;
            }

            @Override
            public void getItem(IMediaController iMediaController, int i3, String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void getLibraryRoot(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void getSearchResult(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void increaseDeviceVolume(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void increaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_increaseDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void moveMediaItem(IMediaController iMediaController, int i3, int i9, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(Stub.TRANSACTION_moveMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void moveMediaItems(IMediaController iMediaController, int i3, int i9, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(Stub.TRANSACTION_moveMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void mute(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_mute, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onControllerResult(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_onControllerResult, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onCustomCommand(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    this.mRemote.transact(Stub.TRANSACTION_onCustomCommand, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onCustomCommandWithProgressUpdate(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle2, 0);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_onCustomCommandWithProgressUpdate, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void onSurfaceSizeChanged(IMediaController iMediaController, int i3, int i9, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(Stub.TRANSACTION_onSurfaceSizeChanged, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void pause(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_pause, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void play(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_play, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void prepare(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_prepare, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void release(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_release, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void removeMediaItem(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_removeMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void removeMediaItems(IMediaController iMediaController, int i3, int i9, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(Stub.TRANSACTION_removeMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void replaceMediaItem(IMediaController iMediaController, int i3, int i9, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_replaceMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void replaceMediaItems(IMediaController iMediaController, int i3, int i9, int i10, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_replaceMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void search(IMediaController iMediaController, int i3, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekBack(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekBack, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekForward(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekForward, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekTo(IMediaController iMediaController, int i3, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_seekTo, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToDefaultPosition(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekToDefaultPosition, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToDefaultPositionWithMediaItemIndex(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_seekToDefaultPositionWithMediaItemIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToNext(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekToNext, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToNextMediaItem(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekToNextMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToPrevious(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekToPrevious, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToPreviousMediaItem(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_seekToPreviousMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void seekToWithMediaItemIndex(IMediaController iMediaController, int i3, int i9, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_seekToWithMediaItemIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setAudioAttributes(IMediaController iMediaController, int i3, Bundle bundle, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setAudioAttributes, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setDeviceMuted(IMediaController iMediaController, int i3, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setDeviceMuted, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setDeviceMutedWithFlags(IMediaController iMediaController, int i3, boolean z6, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_setDeviceMutedWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setDeviceVolume(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(Stub.TRANSACTION_setDeviceVolumeWithFlags, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItem(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItem, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItemWithResetPosition(IMediaController iMediaController, int i3, Bundle bundle, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItemWithResetPosition, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItemWithStartPosition(IMediaController iMediaController, int i3, Bundle bundle, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItemWithStartPosition, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItems(IMediaController iMediaController, int i3, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItems, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItemsWithResetPosition(IMediaController iMediaController, int i3, IBinder iBinder, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItemsWithResetPosition, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setMediaItemsWithStartIndex(IMediaController iMediaController, int i3, IBinder iBinder, int i9, long j) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_setMediaItemsWithStartIndex, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setPlayWhenReady(IMediaController iMediaController, int i3, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setPlayWhenReady, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setPlaybackParameters(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setPlaybackParameters, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setPlaybackSpeed(IMediaController iMediaController, int i3, float f9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeFloat(f9);
                    this.mRemote.transact(Stub.TRANSACTION_setPlaybackSpeed, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setPlaylistMetadata(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setPlaylistMetadata, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setRating(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setRating, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setRatingWithMediaId(IMediaController iMediaController, int i3, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setRatingWithMediaId, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setRepeatMode(IMediaController iMediaController, int i3, int i9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i9);
                    this.mRemote.transact(Stub.TRANSACTION_setRepeatMode, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setShuffleModeEnabled(IMediaController iMediaController, int i3, boolean z6) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(z6 ? 1 : 0);
                    this.mRemote.transact(Stub.TRANSACTION_setShuffleModeEnabled, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setTrackSelectionParameters(IMediaController iMediaController, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setTrackSelectionParameters, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setVideoSurface(IMediaController iMediaController, int i3, Surface surface) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, surface, 0);
                    this.mRemote.transact(Stub.TRANSACTION_setVideoSurface, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setVideoSurfaceWithSize(IMediaController iMediaController, int i3, Surface surface, int i9, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    _Parcel.writeTypedObject(parcelObtain, surface, 0);
                    parcelObtain.writeInt(i9);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(Stub.TRANSACTION_setVideoSurfaceWithSize, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void setVolume(IMediaController iMediaController, int i3, float f9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeFloat(f9);
                    this.mRemote.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void stop(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_stop, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void subscribe(IMediaController iMediaController, int i3, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void unmute(IMediaController iMediaController, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    this.mRemote.transact(Stub.TRANSACTION_unmute, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public void unsubscribe(IMediaController iMediaController, int i3, String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMediaSession.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMediaController);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_unsubscribe, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMediaSession.DESCRIPTOR);
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMediaSession.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) ? new Proxy(iBinder) : (IMediaSession) iInterfaceQueryLocalInterface;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
            if (i3 >= 1 && i3 <= 16777215) {
                parcel.enforceInterface(IMediaSession.DESCRIPTOR);
            }
            if (i3 == 1598968902) {
                parcel2.writeString(IMediaSession.DESCRIPTOR);
                return true;
            }
            switch (i3) {
                case 3002:
                    setVolume(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    setDeviceVolume(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    increaseDeviceVolume(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_decreaseDeviceVolume:
                    decreaseDeviceVolume(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setDeviceMuted:
                    setDeviceMuted(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_setMediaItem:
                    setMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_setMediaItemWithStartPosition:
                    setMediaItemWithStartPosition(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case TRANSACTION_setMediaItemWithResetPosition:
                    setMediaItemWithResetPosition(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_setMediaItems:
                    setMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_setMediaItemsWithResetPosition:
                    setMediaItemsWithResetPosition(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_setMediaItemsWithStartIndex:
                    setMediaItemsWithStartIndex(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_setPlayWhenReady:
                    setPlayWhenReady(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_onControllerResult:
                    onControllerResult(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_connect:
                    connect(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_onCustomCommand:
                    IMediaController iMediaControllerAsInterface = IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    int i10 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    onCustomCommand(iMediaControllerAsInterface, i10, (Bundle) _Parcel.readTypedObject(parcel, creator), (Bundle) _Parcel.readTypedObject(parcel, creator));
                    return true;
                case TRANSACTION_setRepeatMode:
                    setRepeatMode(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_setShuffleModeEnabled:
                    setShuffleModeEnabled(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_removeMediaItem:
                    removeMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_removeMediaItems:
                    removeMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_clearMediaItems:
                    clearMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_moveMediaItem:
                    moveMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_moveMediaItems:
                    moveMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_play:
                    play(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_pause:
                    pause(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_prepare:
                    prepare(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setPlaybackParameters:
                    setPlaybackParameters(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_setPlaybackSpeed:
                    setPlaybackSpeed(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case TRANSACTION_addMediaItem:
                    addMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_addMediaItemWithIndex:
                    addMediaItemWithIndex(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_addMediaItems:
                    addMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_addMediaItemsWithIndex:
                    addMediaItemsWithIndex(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_setPlaylistMetadata:
                    setPlaylistMetadata(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_stop:
                    stop(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_release:
                    release(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToDefaultPosition:
                    seekToDefaultPosition(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToDefaultPositionWithMediaItemIndex:
                    seekToDefaultPositionWithMediaItemIndex(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_seekTo:
                    seekTo(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_seekToWithMediaItemIndex:
                    seekToWithMediaItemIndex(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case TRANSACTION_seekBack:
                    seekBack(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekForward:
                    seekForward(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToPreviousMediaItem:
                    seekToPreviousMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToNextMediaItem:
                    seekToNextMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setVideoSurface:
                    setVideoSurface(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR));
                    return true;
                case TRANSACTION_flushCommandQueue:
                    flushCommandQueue(IMediaController.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case TRANSACTION_seekToPrevious:
                    seekToPrevious(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_seekToNext:
                    seekToNext(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_setTrackSelectionParameters:
                    setTrackSelectionParameters(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_setRatingWithMediaId:
                    setRatingWithMediaId(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_setRating:
                    setRating(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_setDeviceVolumeWithFlags:
                    setDeviceVolumeWithFlags(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_increaseDeviceVolumeWithFlags:
                    increaseDeviceVolumeWithFlags(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_decreaseDeviceVolumeWithFlags:
                    decreaseDeviceVolumeWithFlags(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_setDeviceMutedWithFlags:
                    setDeviceMutedWithFlags(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case TRANSACTION_replaceMediaItem:
                    replaceMediaItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case TRANSACTION_replaceMediaItems:
                    replaceMediaItems(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case TRANSACTION_setAudioAttributes:
                    setAudioAttributes(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_mute:
                    mute(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_unmute:
                    unmute(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case TRANSACTION_onCustomCommandWithProgressUpdate:
                    IMediaController iMediaControllerAsInterface2 = IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    int i11 = parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    onCustomCommandWithProgressUpdate(iMediaControllerAsInterface2, i11, (Bundle) _Parcel.readTypedObject(parcel, creator2), (Bundle) _Parcel.readTypedObject(parcel, creator2), parcel.readInt() != 0);
                    return true;
                case TRANSACTION_setVideoSurfaceWithSize:
                    setVideoSurfaceWithSize(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                    return true;
                case TRANSACTION_onSurfaceSizeChanged:
                    onSurfaceSizeChanged(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    switch (i3) {
                        case 4001:
                            getLibraryRoot(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case 4002:
                            getItem(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 4003:
                            getChildren(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case 4004:
                            search(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case 4005:
                            getSearchResult(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case 4006:
                            subscribe(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case TRANSACTION_unsubscribe:
                            unsubscribe(IMediaController.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i3, parcel, parcel2, i9);
                    }
            }
        }
    }

    public static class _Parcel {
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t9, int i3) {
            if (t9 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t9.writeToParcel(parcel, i3);
            }
        }
    }

    void addMediaItem(IMediaController iMediaController, int i3, Bundle bundle);

    void addMediaItemWithIndex(IMediaController iMediaController, int i3, int i9, Bundle bundle);

    void addMediaItems(IMediaController iMediaController, int i3, IBinder iBinder);

    void addMediaItemsWithIndex(IMediaController iMediaController, int i3, int i9, IBinder iBinder);

    void clearMediaItems(IMediaController iMediaController, int i3);

    void connect(IMediaController iMediaController, int i3, Bundle bundle);

    void decreaseDeviceVolume(IMediaController iMediaController, int i3);

    void decreaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9);

    void flushCommandQueue(IMediaController iMediaController);

    void getChildren(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle);

    void getItem(IMediaController iMediaController, int i3, String str);

    void getLibraryRoot(IMediaController iMediaController, int i3, Bundle bundle);

    void getSearchResult(IMediaController iMediaController, int i3, String str, int i9, int i10, Bundle bundle);

    void increaseDeviceVolume(IMediaController iMediaController, int i3);

    void increaseDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9);

    void moveMediaItem(IMediaController iMediaController, int i3, int i9, int i10);

    void moveMediaItems(IMediaController iMediaController, int i3, int i9, int i10, int i11);

    void mute(IMediaController iMediaController, int i3);

    void onControllerResult(IMediaController iMediaController, int i3, Bundle bundle);

    void onCustomCommand(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2);

    void onCustomCommandWithProgressUpdate(IMediaController iMediaController, int i3, Bundle bundle, Bundle bundle2, boolean z6);

    void onSurfaceSizeChanged(IMediaController iMediaController, int i3, int i9, int i10);

    void pause(IMediaController iMediaController, int i3);

    void play(IMediaController iMediaController, int i3);

    void prepare(IMediaController iMediaController, int i3);

    void release(IMediaController iMediaController, int i3);

    void removeMediaItem(IMediaController iMediaController, int i3, int i9);

    void removeMediaItems(IMediaController iMediaController, int i3, int i9, int i10);

    void replaceMediaItem(IMediaController iMediaController, int i3, int i9, Bundle bundle);

    void replaceMediaItems(IMediaController iMediaController, int i3, int i9, int i10, IBinder iBinder);

    void search(IMediaController iMediaController, int i3, String str, Bundle bundle);

    void seekBack(IMediaController iMediaController, int i3);

    void seekForward(IMediaController iMediaController, int i3);

    void seekTo(IMediaController iMediaController, int i3, long j);

    void seekToDefaultPosition(IMediaController iMediaController, int i3);

    void seekToDefaultPositionWithMediaItemIndex(IMediaController iMediaController, int i3, int i9);

    void seekToNext(IMediaController iMediaController, int i3);

    void seekToNextMediaItem(IMediaController iMediaController, int i3);

    void seekToPrevious(IMediaController iMediaController, int i3);

    void seekToPreviousMediaItem(IMediaController iMediaController, int i3);

    void seekToWithMediaItemIndex(IMediaController iMediaController, int i3, int i9, long j);

    void setAudioAttributes(IMediaController iMediaController, int i3, Bundle bundle, boolean z6);

    void setDeviceMuted(IMediaController iMediaController, int i3, boolean z6);

    void setDeviceMutedWithFlags(IMediaController iMediaController, int i3, boolean z6, int i9);

    void setDeviceVolume(IMediaController iMediaController, int i3, int i9);

    void setDeviceVolumeWithFlags(IMediaController iMediaController, int i3, int i9, int i10);

    void setMediaItem(IMediaController iMediaController, int i3, Bundle bundle);

    void setMediaItemWithResetPosition(IMediaController iMediaController, int i3, Bundle bundle, boolean z6);

    void setMediaItemWithStartPosition(IMediaController iMediaController, int i3, Bundle bundle, long j);

    void setMediaItems(IMediaController iMediaController, int i3, IBinder iBinder);

    void setMediaItemsWithResetPosition(IMediaController iMediaController, int i3, IBinder iBinder, boolean z6);

    void setMediaItemsWithStartIndex(IMediaController iMediaController, int i3, IBinder iBinder, int i9, long j);

    void setPlayWhenReady(IMediaController iMediaController, int i3, boolean z6);

    void setPlaybackParameters(IMediaController iMediaController, int i3, Bundle bundle);

    void setPlaybackSpeed(IMediaController iMediaController, int i3, float f9);

    void setPlaylistMetadata(IMediaController iMediaController, int i3, Bundle bundle);

    void setRating(IMediaController iMediaController, int i3, Bundle bundle);

    void setRatingWithMediaId(IMediaController iMediaController, int i3, String str, Bundle bundle);

    void setRepeatMode(IMediaController iMediaController, int i3, int i9);

    void setShuffleModeEnabled(IMediaController iMediaController, int i3, boolean z6);

    void setTrackSelectionParameters(IMediaController iMediaController, int i3, Bundle bundle);

    void setVideoSurface(IMediaController iMediaController, int i3, Surface surface);

    void setVideoSurfaceWithSize(IMediaController iMediaController, int i3, Surface surface, int i9, int i10);

    void setVolume(IMediaController iMediaController, int i3, float f9);

    void stop(IMediaController iMediaController, int i3);

    void subscribe(IMediaController iMediaController, int i3, String str, Bundle bundle);

    void unmute(IMediaController iMediaController, int i3);

    void unsubscribe(IMediaController iMediaController, int i3, String str);
}
