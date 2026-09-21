package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public interface d extends android.os.IInterface {
    boolean C(android.view.KeyEvent keyEvent);

    void D(android.support.v4.media.RatingCompat ratingCompat, android.os.Bundle bundle);

    void E(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat, int i3);

    java.lang.String F();

    void H(boolean z6);

    void L(int i3);

    void M(java.lang.String str, android.os.Bundle bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void O();

    void Q(long j);

    android.support.v4.media.session.ParcelableVolumeInfo R();

    void adjustVolume(int i3, int i9);

    void c(java.lang.String str, android.os.Bundle bundle);

    void d(android.support.v4.media.session.b bVar);

    void e(android.support.v4.media.RatingCompat ratingCompat);

    void f(android.net.Uri uri, android.os.Bundle bundle);

    android.os.Bundle getExtras();

    long getFlags();

    android.support.v4.media.MediaMetadataCompat getMetadata();

    java.lang.String getPackageName();

    android.support.v4.media.session.PlaybackStateCompat getPlaybackState();

    void getQueue();

    java.lang.CharSequence getQueueTitle();

    void getRatingType();

    int getRepeatMode();

    android.os.Bundle getSessionInfo();

    int getShuffleMode();

    void i(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

    void isCaptioningEnabled();

    boolean j();

    void k(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat);

    android.app.PendingIntent l();

    void n(java.lang.String str, android.os.Bundle bundle);

    void next();

    void pause();

    void play();

    void prepare();

    void previous();

    void q(java.lang.String str, android.os.Bundle bundle);

    void r(android.support.v4.media.session.b bVar);

    void s(java.lang.String str, android.os.Bundle bundle);

    void seekTo(long j);

    void setPlaybackSpeed(float f9);

    void setRepeatMode(int i3);

    void setShuffleMode(int i3);

    void setVolumeTo(int i3, int i9);

    void stop();

    void u(java.lang.String str, android.os.Bundle bundle);

    void w();

    void x(android.net.Uri uri, android.os.Bundle bundle);
}
