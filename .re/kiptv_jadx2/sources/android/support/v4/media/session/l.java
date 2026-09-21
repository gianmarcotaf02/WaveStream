package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.ts.TsExtractor;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends Binder implements d {

    public static final int f15603d = 0;

    public final AtomicReference f15604c;

    public l(m mVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f15604c = new AtomicReference(mVar);
    }

    @Override
    public final boolean C(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override
    public final void D(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void E(MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        throw new AssertionError();
    }

    @Override
    public final String F() {
        throw new AssertionError();
    }

    @Override
    public final void H(boolean z6) {
        throw new AssertionError();
    }

    @Override
    public final void L(int i3) {
        throw new AssertionError();
    }

    @Override
    public final void M(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override
    public final void O() {
        throw new AssertionError();
    }

    @Override
    public final void Q(long j) {
        throw new AssertionError();
    }

    @Override
    public final ParcelableVolumeInfo R() {
        throw new AssertionError();
    }

    @Override
    public final void adjustVolume(int i3, int i9) {
        throw new AssertionError();
    }

    @Override
    public final void c(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void d(b bVar) {
        m mVar = (m) this.f15604c.get();
        if (mVar == null) {
            return;
        }
        mVar.f15609e.register(bVar, new p082j2.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (mVar.f15608d) {
        }
    }

    @Override
    public final void e(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override
    public final void f(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final Bundle getExtras() {
        throw new AssertionError();
    }

    @Override
    public final long getFlags() {
        throw new AssertionError();
    }

    @Override
    public final MediaMetadataCompat getMetadata() {
        throw new AssertionError();
    }

    @Override
    public final String getPackageName() {
        throw new AssertionError();
    }

    @Override
    public final PlaybackStateCompat getPlaybackState() {
        long j;
        m mVar = (m) this.f15604c.get();
        if (mVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = mVar.f15610f;
        MediaMetadataCompat mediaMetadataCompat = mVar.g;
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
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = ((long) (playbackStateCompat.f15575k * (jElapsedRealtime - j11))) + j9;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f15558h;
            if (bundle.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION)) {
                j10 = bundle.getLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION, 0L);
            }
        }
        if (j10 < 0 || j12 <= j10) {
            j = j12 < 0 ? 0L : j12;
        } else {
            j = j10;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f15580p;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f15573h, j, playbackStateCompat.j, playbackStateCompat.f15575k, playbackStateCompat.f15576l, playbackStateCompat.f15577m, playbackStateCompat.f15578n, jElapsedRealtime, arrayList, playbackStateCompat.f15581q, playbackStateCompat.f15582r);
    }

    @Override
    public final CharSequence getQueueTitle() {
        throw new AssertionError();
    }

    @Override
    public final void getRatingType() {
    }

    @Override
    public final int getRepeatMode() {
        return ((m) this.f15604c.get()) != null ? 0 : -1;
    }

    @Override
    public final Bundle getSessionInfo() {
        ((m) this.f15604c.get()).getClass();
        return null;
    }

    @Override
    public final int getShuffleMode() {
        return ((m) this.f15604c.get()) != null ? 0 : -1;
    }

    @Override
    public final void i(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override
    public final void isCaptioningEnabled() {
    }

    @Override
    public final boolean j() {
        throw new AssertionError();
    }

    @Override
    public final void k(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override
    public final PendingIntent l() {
        throw new AssertionError();
    }

    @Override
    public final void n(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void next() {
        throw new AssertionError();
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i9) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        b bVar2 = null;
        switch (i3) {
            case 1:
                M(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) C2.a.e(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zC = C((KeyEvent) C2.a.e(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.f15587c = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                d(bVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                        a aVar2 = new a();
                        aVar2.f15587c = strongBinder2;
                        bVar2 = aVar2;
                    } else {
                        bVar2 = (b) iInterfaceQueryLocalInterface2;
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
                String packageName = getPackageName();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                String strF = F();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                PendingIntent pendingIntentL = l();
                parcel2.writeNoException();
                C2.a.d0(parcel2, pendingIntentL);
                return true;
            case 9:
                long flags = getFlags();
                parcel2.writeNoException();
                parcel2.writeLong(flags);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoR = R();
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
                s(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                u(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                x((Uri) C2.a.e(parcel, Uri.CREATOR), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
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
                e((RatingCompat) C2.a.e(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                c(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat metadata = getMetadata();
                parcel2.writeNoException();
                C2.a.d0(parcel2, metadata);
                return true;
            case 28:
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                C2.a.d0(parcel2, playbackState);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence queueTitle = getQueueTitle();
                parcel2.writeNoException();
                if (queueTitle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(queueTitle, parcel2, 1);
                return true;
            case 31:
                Bundle extras = getExtras();
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
                q(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                n(parcel.readString(), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case TsExtractor.TS_STREAM_TYPE_H265:
                f((Uri) C2.a.e(parcel, Uri.CREATOR), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int repeatMode = getRepeatMode();
                parcel2.writeNoException();
                parcel2.writeInt(repeatMode);
                return true;
            case FlacConstants.STREAM_INFO_BLOCK_SIZE:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI:
                setRepeatMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                k((MediaDescriptionCompat) C2.a.e(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                E((MediaDescriptionCompat) C2.a.e(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                i((MediaDescriptionCompat) C2.a.e(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                L(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case TsExtractor.TS_STREAM_TYPE_MHAS:
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
            case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                setShuffleMode(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                setPlaybackSpeed(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle sessionInfo = getSessionInfo();
                parcel2.writeNoException();
                C2.a.d0(parcel2, sessionInfo);
                return true;
            case 51:
                D((RatingCompat) C2.a.e(parcel, RatingCompat.CREATOR), (Bundle) C2.a.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i9);
        }
    }

    @Override
    public final void pause() {
        throw new AssertionError();
    }

    @Override
    public final void play() {
        throw new AssertionError();
    }

    @Override
    public final void prepare() {
        throw new AssertionError();
    }

    @Override
    public final void previous() {
        throw new AssertionError();
    }

    @Override
    public final void q(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void r(b bVar) {
        m mVar = (m) this.f15604c.get();
        if (mVar == null) {
            return;
        }
        mVar.f15609e.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (mVar.f15608d) {
        }
    }

    @Override
    public final void s(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void seekTo(long j) {
        throw new AssertionError();
    }

    @Override
    public final void setPlaybackSpeed(float f9) {
        throw new AssertionError();
    }

    @Override
    public final void setRepeatMode(int i3) {
        throw new AssertionError();
    }

    @Override
    public final void setShuffleMode(int i3) {
        throw new AssertionError();
    }

    @Override
    public final void setVolumeTo(int i3, int i9) {
        throw new AssertionError();
    }

    @Override
    public final void stop() {
        throw new AssertionError();
    }

    @Override
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void w() {
        throw new AssertionError();
    }

    @Override
    public final void x(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void getQueue() {
    }
}
