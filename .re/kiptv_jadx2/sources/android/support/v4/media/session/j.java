package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaSessionCompat;

public final class j extends MediaSession.Callback {

    public final k f15597a;

    public j(k kVar) {
        this.f15597a = kVar;
    }

    public static void b(m mVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = mVar.f15605a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e6) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e6);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        mVar.f(new p082j2.a(str, -1, -1));
    }

    public final m a() {
        m mVar;
        synchronized (this.f15597a.f15598a) {
            mVar = (m) this.f15597a.f15601d.get();
        }
        if (mVar == null || this.f15597a != mVar.b()) {
            return null;
        }
        return mVar;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        d dVar;
        C2.d dVar2;
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        try {
            if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = mVarA.f15607c;
                synchronized (mediaSessionCompat$Token.f15566h) {
                    dVar = mediaSessionCompat$Token.j;
                }
                bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, dVar == null ? null : dVar.asBinder());
                synchronized (mediaSessionCompat$Token.f15566h) {
                    dVar2 = mediaSessionCompat$Token.f15568k;
                }
                C2.a.J(bundle2, dVar2);
                resultReceiver.send(0, bundle2);
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                k kVar = this.f15597a;
                kVar.getClass();
            } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                k kVar2 = this.f15597a;
                bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX);
                kVar2.getClass();
            } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                k kVar3 = this.f15597a;
                kVar3.getClass();
            } else if (!str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                this.f15597a.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        mVarA.f(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        try {
            boolean zEquals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
            k kVar = this.f15597a;
            if (zEquals) {
                q.p(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                q.p(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                q.p(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                q.p(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE);
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE);
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                q.p(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f);
                kVar.getClass();
            } else {
                kVar.b(str);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        mVarA.f(null);
    }

    @Override
    public final void onFastForward() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        m mVarA = a();
        if (mVarA == null) {
            return false;
        }
        b(mVarA);
        boolean zC = this.f15597a.c(intent);
        mVarA.f(null);
        return zC || super.onMediaButtonEvent(intent);
    }

    @Override
    public final void onPause() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.d();
        mVarA.f(null);
    }

    @Override
    public final void onPlay() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.e();
        mVarA.f(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPrepare() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onRewind() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onSeekTo(long j) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.f(j);
        mVarA.f(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f9) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        float f9;
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iB = android.support.v4.media.c.b(rating);
            if (android.support.v4.media.c.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, android.support.v4.media.c.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, android.support.v4.media.c.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fC = android.support.v4.media.c.c(rating);
                        if (iB == 3) {
                            f9 = 3.0f;
                        } else if (iB == 4) {
                            f9 = 4.0f;
                        } else if (iB != 5) {
                            Log.e("Rating", "Invalid rating style (" + iB + ") for a star rating");
                        } else {
                            f9 = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f9) {
                            ratingCompat = new RatingCompat(iB, fC);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fA = android.support.v4.media.c.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fA);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iB, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onSkipToNext() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.g();
        mVarA.f(null);
    }

    @Override
    public final void onSkipToPrevious() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.h();
        mVarA.f(null);
    }

    @Override
    public final void onSkipToQueueItem(long j) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override
    public final void onStop() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }
}
