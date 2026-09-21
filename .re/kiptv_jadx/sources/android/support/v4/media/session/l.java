package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class l extends android.os.Binder implements android.support.v4.media.session.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15603d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f15604c;

    public l(android.support.v4.media.session.m mVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f15604c = new java.util.concurrent.atomic.AtomicReference(mVar);
    }

    @Override // android.support.v4.media.session.d
    public final boolean C(android.view.KeyEvent keyEvent) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void D(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void E(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final java.lang.String F() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void H(boolean z6) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void L(int i3) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void M(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void O() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void Q(long j) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final android.support.v4.media.session.ParcelableVolumeInfo R() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void adjustVolume(int i3, int i9) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void c(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void d(android.support.v4.media.session.b bVar) {
        android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) this.f15604c.get();
        if (mVar == null) {
            return;
        }
        mVar.f15609e.register(bVar, new p082j2.a("android.media.session.MediaController", android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()));
        synchronized (mVar.f15608d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void e(android.support.v4.media.RatingCompat ratingCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void f(android.net.Uri uri, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final android.os.Bundle getExtras() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final long getFlags() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final android.support.v4.media.MediaMetadataCompat getMetadata() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final java.lang.String getPackageName() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
        long j;
        android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) this.f15604c.get();
        if (mVar == null) {
            return null;
        }
        android.support.v4.media.session.PlaybackStateCompat playbackStateCompat = mVar.f15610f;
        android.support.v4.media.MediaMetadataCompat mediaMetadataCompat = mVar.g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j9 = playbackStateCompat.f15574i;
        long j10 = -1;
        if (j9 == -1) {
            return playbackStateCompat;
        }
        int i3 = playbackStateCompat.f15573h;
        if (i3 != 3 && i3 != 4 && i3 != 5) {
            return playbackStateCompat;
        }
        long j11 = playbackStateCompat.f15579o;
        if (j11 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j12 = ((long) (playbackStateCompat.f15575k * (jElapsedRealtime - j11))) + j9;
        if (mediaMetadataCompat != null) {
            android.os.Bundle bundle = mediaMetadataCompat.f15558h;
            if (bundle.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION)) {
                j10 = bundle.getLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0L);
            }
        }
        if (j10 < 0 || j12 <= j10) {
            j = j12 < 0 ? 0L : j12;
        } else {
            j = j10;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = playbackStateCompat.f15580p;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new android.support.v4.media.session.PlaybackStateCompat(playbackStateCompat.f15573h, j, playbackStateCompat.j, playbackStateCompat.f15575k, playbackStateCompat.f15576l, playbackStateCompat.f15577m, playbackStateCompat.f15578n, jElapsedRealtime, arrayList, playbackStateCompat.f15581q, playbackStateCompat.f15582r);
    }

    @Override // android.support.v4.media.session.d
    public final java.lang.CharSequence getQueueTitle() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void getRatingType() {
    }

    @Override // android.support.v4.media.session.d
    public final int getRepeatMode() {
        return ((android.support.v4.media.session.m) this.f15604c.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final android.os.Bundle getSessionInfo() {
        ((android.support.v4.media.session.m) this.f15604c.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.d
    public final int getShuffleMode() {
        return ((android.support.v4.media.session.m) this.f15604c.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.d
    public final void i(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void isCaptioningEnabled() {
    }

    @Override // android.support.v4.media.session.d
    public final boolean j() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void k(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final android.app.PendingIntent l() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void n(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void next() {
        throw new java.lang.AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, android.os.Parcel parcel, android.os.Parcel parcel2, int i9) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        android.support.v4.media.session.b bVar = null;
        android.support.v4.media.session.b bVar2 = null;
        switch (i3) {
            case 1:
                M(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR), (android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper) C2.a.e(parcel, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zC = C((android.view.KeyEvent) C2.a.e(parcel, android.view.KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 3:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.b)) {
                        android.support.v4.media.session.a aVar = new android.support.v4.media.session.a();
                        aVar.f15587c = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (android.support.v4.media.session.b) iInterfaceQueryLocalInterface;
                    }
                }
                d(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof android.support.v4.media.session.b)) {
                        android.support.v4.media.session.a aVar2 = new android.support.v4.media.session.a();
                        aVar2.f15587c = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (android.support.v4.media.session.b) iInterfaceQueryLocalInterface2;
                    }
                }
                r(bVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zJ = j();
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 6:
                java.lang.String packageName = getPackageName();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                java.lang.String strF = F();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                android.app.PendingIntent pendingIntentL = l();
                parcel2.writeNoException();
                C2.a.d0(parcel2, pendingIntentL);
                return true;
            case 9:
                long flags = getFlags();
                parcel2.writeNoException();
                parcel2.writeLong(flags);
                return true;
            case 10:
                android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfoR = R();
                parcel2.writeNoException();
                C2.a.d0(parcel2, parcelableVolumeInfoR);
                return true;
            case 11:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                parcel.readString();
                adjustVolume(i10, i11);
                parcel2.writeNoException();
                return true;
            case 12:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                parcel.readString();
                setVolumeTo(i12, i13);
                parcel2.writeNoException();
                return true;
            case 13:
                play();
                parcel2.writeNoException();
                return true;
            case 14:
                s(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                u(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                x((android.net.Uri) C2.a.e(parcel, android.net.Uri.CREATOR), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                Q(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                w();
                parcel2.writeNoException();
                return true;
            case 23:
                O();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                e((android.support.v4.media.RatingCompat) C2.a.e(parcel, android.support.v4.media.RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                c(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                android.support.v4.media.MediaMetadataCompat metadata = getMetadata();
                parcel2.writeNoException();
                C2.a.d0(parcel2, metadata);
                return true;
            case 28:
                android.support.v4.media.session.PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                C2.a.d0(parcel2, playbackState);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                java.lang.CharSequence queueTitle = getQueueTitle();
                parcel2.writeNoException();
                if (queueTitle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                android.text.TextUtils.writeToParcel(queueTitle, parcel2, 1);
                return true;
            case 31:
                android.os.Bundle extras = getExtras();
                parcel2.writeNoException();
                C2.a.d0(parcel2, extras);
                return true;
            case 32:
                getRatingType();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                prepare();
                parcel2.writeNoException();
                return true;
            case 34:
                q(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                n(parcel.readString(), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                f((android.net.Uri) C2.a.e(parcel, android.net.Uri.CREATOR), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int repeatMode = getRepeatMode();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                setRepeatMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                k((android.support.v4.media.MediaDescriptionCompat) C2.a.e(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                E((android.support.v4.media.MediaDescriptionCompat) C2.a.e(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                i((android.support.v4.media.MediaDescriptionCompat) C2.a.e(parcel, android.support.v4.media.MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                L(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                isCaptioningEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                H(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int shuffleMode = getShuffleMode();
                parcel2.writeNoException();
                parcel2.writeInt(shuffleMode);
                return true;
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                setShuffleMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                setPlaybackSpeed(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                android.os.Bundle sessionInfo = getSessionInfo();
                parcel2.writeNoException();
                C2.a.d0(parcel2, sessionInfo);
                return true;
            case 51:
                D((android.support.v4.media.RatingCompat) C2.a.e(parcel, android.support.v4.media.RatingCompat.CREATOR), (android.os.Bundle) C2.a.e(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i9);
        }
    }

    @Override // android.support.v4.media.session.d
    public final void pause() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void play() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void prepare() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void previous() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void q(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void r(android.support.v4.media.session.b bVar) {
        android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) this.f15604c.get();
        if (mVar == null) {
            return;
        }
        mVar.f15609e.unregister(bVar);
        android.os.Binder.getCallingPid();
        android.os.Binder.getCallingUid();
        synchronized (mVar.f15608d) {
        }
    }

    @Override // android.support.v4.media.session.d
    public final void s(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void seekTo(long j) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void setPlaybackSpeed(float f9) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void setRepeatMode(int i3) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void setShuffleMode(int i3) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void setVolumeTo(int i3, int i9) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void stop() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void u(java.lang.String str, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void w() {
        throw new java.lang.AssertionError();
    }

    @Override // android.support.v4.media.session.d
    public final void x(android.net.Uri uri, android.os.Bundle bundle) {
        throw new java.lang.AssertionError();
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.d
    public final void getQueue() {
    }
}
