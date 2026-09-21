package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

public interface d extends IInterface {
    boolean C(KeyEvent keyEvent);

    void D(RatingCompat ratingCompat, Bundle bundle);

    void E(MediaDescriptionCompat mediaDescriptionCompat, int i3);

    String F();

    void H(boolean z6);

    void L(int i3);

    void M(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void O();

    void Q(long j);

    ParcelableVolumeInfo R();

    void adjustVolume(int i3, int i9);

    void c(String str, Bundle bundle);

    void d(b bVar);

    void e(RatingCompat ratingCompat);

    void f(Uri uri, Bundle bundle);

    Bundle getExtras();

    long getFlags();

    MediaMetadataCompat getMetadata();

    String getPackageName();

    PlaybackStateCompat getPlaybackState();

    void getQueue();

    CharSequence getQueueTitle();

    void getRatingType();

    int getRepeatMode();

    Bundle getSessionInfo();

    int getShuffleMode();

    void i(MediaDescriptionCompat mediaDescriptionCompat);

    void isCaptioningEnabled();

    boolean j();

    void k(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent l();

    void n(String str, Bundle bundle);

    void next();

    void pause();

    void play();

    void prepare();

    void previous();

    void q(String str, Bundle bundle);

    void r(b bVar);

    void s(String str, Bundle bundle);

    void seekTo(long j);

    void setPlaybackSpeed(float f9);

    void setRepeatMode(int i3);

    void setShuffleMode(int i3);

    void setVolumeTo(int i3, int i9);

    void stop();

    void u(String str, Bundle bundle);

    void w();

    void x(Uri uri, Bundle bundle);
}
