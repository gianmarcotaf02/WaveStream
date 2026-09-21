package android.support.v4.media.session;

/* JADX INFO: loaded from: classes.dex */
public final class j extends android.media.session.MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.k f15597a;

    public j(android.support.v4.media.session.k kVar) {
        this.f15597a = kVar;
    }

    public static void b(android.support.v4.media.session.m mVar) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        android.media.session.MediaSession mediaSession = mVar.f15605a;
        java.lang.String str = null;
        try {
            str = (java.lang.String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (java.lang.Exception e6) {
            android.util.Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e6);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        mVar.f(new p082j2.a(str, -1, -1));
    }

    public final android.support.v4.media.session.m a() {
        android.support.v4.media.session.m mVar;
        synchronized (this.f15597a.f15598a) {
            mVar = (android.support.v4.media.session.m) this.f15597a.f15601d.get();
        }
        if (mVar == null || this.f15597a != mVar.b()) {
            return null;
        }
        return mVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        android.support.v4.media.session.d dVar;
        C2.d dVar2;
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        try {
            if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = mVarA.f15607c;
                synchronized (mediaSessionCompat$Token.f15566h) {
                    dVar = mediaSessionCompat$Token.j;
                }
                bundle2.putBinder(androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER, dVar == null ? null : dVar.asBinder());
                synchronized (mediaSessionCompat$Token.f15566h) {
                    dVar2 = mediaSessionCompat$Token.f15568k;
                }
                C2.a.J(bundle2, dVar2);
                resultReceiver.send(0, bundle2);
            } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                android.support.v4.media.session.k kVar = this.f15597a;
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                android.support.v4.media.session.k kVar2 = this.f15597a;
                bundle.getInt(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_INDEX);
                kVar2.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                android.support.v4.media.session.k kVar3 = this.f15597a;
                kVar3.getClass();
            } else if (!str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                this.f15597a.getClass();
            }
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        try {
            boolean zEquals = str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PLAY_FROM_URI);
            android.support.v4.media.session.k kVar = this.f15597a;
            if (zEquals) {
                android.support.v4.media.session.q.p(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE)) {
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                bundle.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                android.support.v4.media.session.q.p(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                bundle.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                android.support.v4.media.session.q.p(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                android.support.v4.media.session.q.p(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                bundle.getBoolean(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                bundle.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE);
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                bundle.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE);
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_RATING)) {
                android.support.v4.media.session.q.p(bundle.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                kVar.getClass();
            } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                bundle.getFloat(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f);
                kVar.getClass();
            } else {
                kVar.b(str);
            }
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(android.content.Intent intent) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return false;
        }
        b(mVarA);
        boolean zC = this.f15597a.c(intent);
        mVarA.f(null);
        return zC || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.d();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.e();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        android.support.v4.media.session.q.p(bundle);
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.f(j);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f9) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(android.media.Rating rating) {
        float f9;
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        android.support.v4.media.RatingCompat ratingCompat = null;
        if (rating != null) {
            int iB = android.support.v4.media.c.b(rating);
            if (android.support.v4.media.c.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompat = new android.support.v4.media.RatingCompat(1, android.support.v4.media.c.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new android.support.v4.media.RatingCompat(2, android.support.v4.media.c.f(rating) ? 1.0f : 0.0f);
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
                            android.util.Log.e("Rating", "Invalid rating style (" + iB + ") for a star rating");
                        } else {
                            f9 = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f9) {
                            ratingCompat = new android.support.v4.media.RatingCompat(iB, fC);
                        } else {
                            android.util.Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fA = android.support.v4.media.c.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat = new android.support.v4.media.RatingCompat(6, fA);
                        } else {
                            android.util.Log.e("Rating", "Invalid percentage-based rating value");
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
                        ratingCompat = new android.support.v4.media.RatingCompat(iB, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.g();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.h();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        android.support.v4.media.session.m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f15597a.getClass();
        mVarA.f(null);
    }
}
