package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {
    public static final java.lang.String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final java.lang.String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final java.lang.String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final java.lang.String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final java.lang.String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final java.lang.String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final java.lang.String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final java.lang.String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final java.lang.String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final java.lang.String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final java.lang.String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final java.lang.String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final java.lang.String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final java.lang.String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final java.lang.String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final java.lang.String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final java.lang.String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final java.lang.String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final java.lang.String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final java.lang.String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final java.lang.String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final java.lang.String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final java.lang.String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    @java.lang.Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;

    @java.lang.Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final java.lang.String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final java.lang.String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final java.lang.String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    static final java.lang.String TAG = "MediaSessionCompat";
    private final androidx.media3.session.legacy.MediaControllerCompat controller;
    private final androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl impl;

    public static abstract class Callback {
        androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler callbackHandler;
        private boolean mediaPlayPausePendingOnHandler;
        final java.lang.Object lock = new java.lang.Object();
        final android.media.session.MediaSession.Callback callbackFwk = new androidx.media3.session.legacy.MediaSessionCompat.Callback.MediaSessionCallback();
        java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl> sessionImpl = new java.lang.ref.WeakReference<>(null);

        public class CallbackHandler extends android.os.Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

            public CallbackHandler(android.os.Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl;
                androidx.media3.session.legacy.MediaSessionCompat.Callback callback;
                androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (androidx.media3.session.legacy.MediaSessionCompat.Callback.this.lock) {
                        mediaSessionImpl = androidx.media3.session.legacy.MediaSessionCompat.Callback.this.sessionImpl.get();
                        callback = androidx.media3.session.legacy.MediaSessionCompat.Callback.this;
                        callbackHandler = callback.callbackHandler;
                    }
                    if (mediaSessionImpl == null || callback != mediaSessionImpl.getCallback() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.setCurrentControllerInfo((androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo) message.obj);
                    androidx.media3.session.legacy.MediaSessionCompat.Callback.this.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.setCurrentControllerInfo(null);
                }
            }
        }

        public class MediaSessionCallback extends android.media.session.MediaSession.Callback {
            public MediaSessionCallback() {
            }

            private void clearCurrentControllerInfo(androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo(null);
            }

            private androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 getSessionImplIfCallbackIsSet() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23;
                synchronized (androidx.media3.session.legacy.MediaSessionCompat.Callback.this.lock) {
                    mediaSessionImplApi23 = (androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23) androidx.media3.session.legacy.MediaSessionCompat.Callback.this.sessionImpl.get();
                }
                if (mediaSessionImplApi23 == null || androidx.media3.session.legacy.MediaSessionCompat.Callback.this != mediaSessionImplApi23.getCallback()) {
                    return null;
                }
                return mediaSessionImplApi23;
            }

            private void setCurrentControllerInfo(androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                java.lang.String callingPackage = mediaSessionImpl.getCallingPackage();
                if (android.text.TextUtils.isEmpty(callingPackage)) {
                    callingPackage = "android.media.session.MediaController";
                }
                mediaSessionImpl.setCurrentControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(callingPackage, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem = null;
                    android.os.IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        if (resultReceiver != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            androidx.media3.session.legacy.MediaSessionCompat.Token sessionToken = sessionImplIfCallbackIsSet.getSessionToken();
                            androidx.media3.session.legacy.IMediaSession extraBinder = sessionToken.getExtraBinder();
                            if (extraBinder != null) {
                                iBinderAsBinder = extraBinder.asBinder();
                            }
                            bundle2.putBinder(androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER, iBinderAsBinder);
                            C2.a.J(bundle2, sessionToken.getSession2Token());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onAddQueueItem((androidx.media3.session.legacy.MediaDescriptionCompat) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onAddQueueItem((androidx.media3.session.legacy.MediaDescriptionCompat) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR), bundleConvertToNullIfInvalid.getInt(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onRemoveQueueItem((androidx.media3.session.legacy.MediaDescriptionCompat) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list = sessionImplIfCallbackIsSet.queue;
                        if (list != null && bundleConvertToNullIfInvalid != null) {
                            int i3 = bundleConvertToNullIfInvalid.getInt(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                            if (i3 >= 0 && i3 < list.size()) {
                                queueItem = list.get(i3);
                            }
                            if (queueItem != null) {
                                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onRemoveQueueItem(queueItem.getDescription());
                            }
                        }
                    } else {
                        androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onCommand(str, bundleConvertToNullIfInvalid, resultReceiver);
                    }
                } catch (android.os.BadParcelableException unused) {
                    androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Could not unparcel the extra data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPlayFromUri((android.net.Uri) bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_URI), androidx.media3.common.util.Util.convertToNullIfInvalid(bundleConvertToNullIfInvalid.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE)) {
                        androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepare();
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromMediaId(bundleConvertToNullIfInvalid.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID), androidx.media3.common.util.Util.convertToNullIfInvalid(bundleConvertToNullIfInvalid.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromSearch(bundleConvertToNullIfInvalid.getString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_QUERY), androidx.media3.common.util.Util.convertToNullIfInvalid(bundleConvertToNullIfInvalid.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromUri((android.net.Uri) bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_URI), androidx.media3.common.util.Util.convertToNullIfInvalid(bundleConvertToNullIfInvalid.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetCaptioningEnabled(bundleConvertToNullIfInvalid.getBoolean(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetRepeatMode(bundleConvertToNullIfInvalid.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetShuffleMode(bundleConvertToNullIfInvalid.getInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                        }
                    } else if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_RATING)) {
                        if (bundleConvertToNullIfInvalid != null) {
                            androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetRating((androidx.media3.session.legacy.RatingCompat) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_RATING), androidx.media3.session.legacy.RatingCompat.CREATOR), androidx.media3.common.util.Util.convertToNullIfInvalid(bundleConvertToNullIfInvalid.getBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS)));
                        }
                    } else if (!str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                        androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onCustomAction(str, bundleConvertToNullIfInvalid);
                    } else if (bundleConvertToNullIfInvalid != null) {
                        androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetPlaybackSpeed(bundleConvertToNullIfInvalid.getFloat(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                    }
                } catch (android.os.BadParcelableException unused) {
                    androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Could not unparcel the data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onFastForward();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(android.content.Intent intent) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return false;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                boolean zOnMediaButtonEvent = androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPause();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPlay();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPlayFromMediaId(str, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPlayFromSearch(str, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepare();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromMediaId(str, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromSearch(str, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onPrepareFromUri(uri, bundleConvertToNullIfInvalid);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onRewind();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSeekTo(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f9) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetPlaybackSpeed(f9);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(android.media.Rating rating) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSetRating(androidx.media3.session.legacy.RatingCompat.fromRating(rating));
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSkipToNext();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSkipToPrevious();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onSkipToQueueItem(j);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                androidx.media3.session.legacy.MediaSessionCompat.Callback.this.onStop();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl, android.os.Handler handler) {
            if (this.mediaPlayPausePendingOnHandler) {
                this.mediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                androidx.media3.session.legacy.PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z6 = playbackState != null && playbackState.getState() == 3;
                boolean z9 = (516 & actions) != 0;
                boolean z10 = (actions & 514) != 0;
                if (z6 && z10) {
                    onPause();
                } else {
                    if (z6 || !z9) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        }

        public void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(android.content.Intent intent) {
            androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl;
            androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler callbackHandler;
            android.view.KeyEvent keyEvent;
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.lock) {
                mediaSessionImpl = this.sessionImpl.get();
                callbackHandler = this.callbackHandler;
            }
            if (mediaSessionImpl == null || callbackHandler == null || (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo currentControllerInfo = mediaSessionImpl.getCurrentControllerInfo();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
            } else if (this.mediaPlayPausePendingOnHandler) {
                callbackHandler.removeMessages(1);
                this.mediaPlayPausePendingOnHandler = false;
                androidx.media3.session.legacy.PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.mediaPlayPausePendingOnHandler = true;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, currentControllerInfo), android.view.ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        }

        public void onRemoveQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z6) {
        }

        public void onSetPlaybackSpeed(float f9) {
        }

        public void onSetRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i3) {
        }

        public void onSetShuffleMode(int i3) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public void setSessionImpl(androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl mediaSessionImpl, android.os.Handler handler) {
            synchronized (this.lock) {
                try {
                    this.sessionImpl = new java.lang.ref.WeakReference<>(mediaSessionImpl);
                    androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler callbackHandler = this.callbackHandler;
                    androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler callbackHandler2 = null;
                    if (callbackHandler != null) {
                        callbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        callbackHandler2 = new androidx.media3.session.legacy.MediaSessionCompat.Callback.CallbackHandler(handler.getLooper());
                    }
                    this.callbackHandler = callbackHandler2;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        public void onAddQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        }

        public void onSetRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) {
        }
    }

    public interface MediaSessionImpl {
        androidx.media3.session.legacy.MediaSessionCompat.Callback getCallback();

        java.lang.String getCallingPackage();

        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

        java.lang.Object getMediaSession();

        androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState();

        androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(java.lang.String str, android.os.Bundle bundle);

        void setActive(boolean z6);

        void setCallback(androidx.media3.session.legacy.MediaSessionCompat.Callback callback, android.os.Handler handler);

        void setCurrentControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo);

        void setExtras(android.os.Bundle bundle);

        void setFlags(int i3);

        void setMediaButtonReceiver(android.app.PendingIntent pendingIntent);

        void setMetadata(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(androidx.media3.common.AudioAttributes audioAttributes);

        void setPlaybackToRemote(androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat);

        void setQueue(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list);

        void setQueueTitle(java.lang.CharSequence charSequence);

        void setRatingType(int i3);

        void setRepeatMode(int i3);

        void setSessionActivity(android.app.PendingIntent pendingIntent);

        void setShuffleMode(int i3);
    }

    public static class MediaSessionImplApi23 implements androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl {
        androidx.media3.session.legacy.MediaSessionCompat.Callback callback;
        boolean captioningEnabled;
        final androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23.ExtraSession extraSession;
        androidx.media3.session.legacy.MediaMetadataCompat metadata;
        androidx.media3.session.legacy.PlaybackStateCompat playbackState;
        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> queue;
        androidx.media3.session.legacy.MediaSessionCompat.RegistrationCallbackHandler registrationCallbackHandler;
        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;
        int repeatMode;
        final android.media.session.MediaSession sessionFwk;
        android.os.Bundle sessionInfo;
        int shuffleMode;
        final androidx.media3.session.legacy.MediaSessionCompat.Token token;
        final java.lang.Object lock = new java.lang.Object();
        boolean destroyed = false;
        final android.os.RemoteCallbackList<androidx.media3.session.legacy.IMediaControllerCallback> extraControllerCallbacks = new android.os.RemoteCallbackList<>();

        public static class ExtraSession extends androidx.media3.session.legacy.IMediaSession.Stub {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23> mediaSessionImplRef;

            public ExtraSession(androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23) {
                this.mediaSessionImplRef = new java.lang.ref.WeakReference<>(mediaSessionImplApi23);
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 != null) {
                    return androidx.media3.session.legacy.MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi23.playbackState, mediaSessionImplApi23.metadata);
                }
                return null;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getRepeatMode() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 != null) {
                    return mediaSessionImplApi23.repeatMode;
                }
                return -1;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public android.os.Bundle getSessionInfo() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 == null || mediaSessionImplApi23.sessionInfo == null) {
                    return null;
                }
                return new android.os.Bundle(mediaSessionImplApi23.sessionInfo);
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public int getShuffleMode() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 != null) {
                    return mediaSessionImplApi23.shuffleMode;
                }
                return -1;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public boolean isCaptioningEnabled() {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                return mediaSessionImplApi23 != null && mediaSessionImplApi23.captioningEnabled;
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void registerCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 == null || iMediaControllerCallback == null) {
                    return;
                }
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                mediaSessionImplApi23.extraControllerCallbacks.register(iMediaControllerCallback, new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", callingPid, callingUid));
                synchronized (mediaSessionImplApi23.lock) {
                    try {
                        androidx.media3.session.legacy.MediaSessionCompat.RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi23.registrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }

            public void release() {
                this.mediaSessionImplRef.clear();
            }

            @Override // androidx.media3.session.legacy.IMediaSession
            public void unregisterCallbackListener(androidx.media3.session.legacy.IMediaControllerCallback iMediaControllerCallback) {
                androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 mediaSessionImplApi23 = this.mediaSessionImplRef.get();
                if (mediaSessionImplApi23 == null || iMediaControllerCallback == null) {
                    return;
                }
                mediaSessionImplApi23.extraControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = android.os.Binder.getCallingPid();
                int callingUid = android.os.Binder.getCallingUid();
                synchronized (mediaSessionImplApi23.lock) {
                    try {
                        androidx.media3.session.legacy.MediaSessionCompat.RegistrationCallbackHandler registrationCallbackHandler = mediaSessionImplApi23.registrationCallbackHandler;
                        if (registrationCallbackHandler != null) {
                            registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public MediaSessionImplApi23(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            android.media.session.MediaSession mediaSessionCreateFwkMediaSession = createFwkMediaSession(context, str, bundle);
            this.sessionFwk = mediaSessionCreateFwkMediaSession;
            androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23.ExtraSession extraSession = new androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23.ExtraSession(this);
            this.extraSession = extraSession;
            this.token = new androidx.media3.session.legacy.MediaSessionCompat.Token(mediaSessionCreateFwkMediaSession.getSessionToken(), extraSession);
            this.sessionInfo = bundle;
            setFlags(3);
        }

        public android.media.session.MediaSession createFwkMediaSession(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            return new android.media.session.MediaSession(context, str);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public androidx.media3.session.legacy.MediaSessionCompat.Callback getCallback() {
            androidx.media3.session.legacy.MediaSessionCompat.Callback callback;
            synchronized (this.lock) {
                callback = this.callback;
            }
            return callback;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public java.lang.String getCallingPackage() {
            try {
                return (java.lang.String) this.sessionFwk.getClass().getMethod("getCallingPackage", null).invoke(this.sessionFwk, null);
            } catch (java.lang.Exception e6) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Cannot execute MediaSession.getCallingPackage()", e6);
                return null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.lock) {
                remoteUserInfo = this.remoteUserInfo;
            }
            return remoteUserInfo;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getMediaSession() {
            return this.sessionFwk;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
            return this.playbackState;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
            return this.token;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.sessionFwk.isActive();
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.destroyed = true;
            this.extraControllerCallbacks.kill();
            if (android.os.Build.VERSION.SDK_INT == 27) {
                try {
                    java.lang.reflect.Field declaredField = this.sessionFwk.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    android.os.Handler handler = (android.os.Handler) declaredField.get(this.sessionFwk);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (java.lang.Exception e6) {
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Exception happened while accessing MediaSession.mCallback.", e6);
                }
            }
            this.sessionFwk.setCallback(null);
            this.extraSession.release();
            this.sessionFwk.release();
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String str, android.os.Bundle bundle) {
            this.sessionFwk.sendSessionEvent(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z6) {
            this.sessionFwk.setActive(z6);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setCallback(androidx.media3.session.legacy.MediaSessionCompat.Callback callback, android.os.Handler handler) {
            synchronized (this.lock) {
                try {
                    this.callback = callback;
                    this.sessionFwk.setCallback(callback == null ? null : callback.callbackFwk, handler);
                    if (callback != null) {
                        callback.setSessionImpl(this, handler);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.lock) {
                this.remoteUserInfo = remoteUserInfo;
            }
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setExtras(android.os.Bundle bundle) {
            this.sessionFwk.setExtras(bundle);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i3) {
            this.sessionFwk.setFlags(i3 | 3);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(android.app.PendingIntent pendingIntent) {
            this.sessionFwk.setMediaButtonReceiver(pendingIntent);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
            this.metadata = mediaMetadataCompat;
            this.sessionFwk.setMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getMediaMetadata());
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
            this.playbackState = playbackStateCompat;
            synchronized (this.lock) {
                for (int iBeginBroadcast = this.extraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((androidx.media3.session.legacy.IMediaControllerCallback) this.extraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                    } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                        androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Dead object in setPlaybackState.", e6);
                    }
                }
                this.extraControllerCallbacks.finishBroadcast();
            }
            this.sessionFwk.setPlaybackState(playbackStateCompat.getPlaybackState());
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(androidx.media3.common.AudioAttributes audioAttributes) {
            this.sessionFwk.setPlaybackToLocal(audioAttributes.getPlatformAudioAttributes());
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat) {
            this.sessionFwk.setPlaybackToRemote((android.media.VolumeProvider) volumeProviderCompat.getVolumeProvider());
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setQueue(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
            this.queue = list;
            if (list == null) {
                this.sessionFwk.setQueue(null);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getQueueItem());
            }
            this.sessionFwk.setQueue(arrayList);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(java.lang.CharSequence charSequence) {
            this.sessionFwk.setQueueTitle(charSequence);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i3) {
            this.sessionFwk.setRatingType(i3);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i3) {
            if (this.repeatMode != i3) {
                this.repeatMode = i3;
                synchronized (this.lock) {
                    for (int iBeginBroadcast = this.extraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((androidx.media3.session.legacy.IMediaControllerCallback) this.extraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i3);
                        } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                            androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Dead object in setRepeatMode.", e6);
                        }
                    }
                    this.extraControllerCallbacks.finishBroadcast();
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(android.app.PendingIntent pendingIntent) {
            this.sessionFwk.setSessionActivity(pendingIntent);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i3) {
            if (this.shuffleMode != i3) {
                this.shuffleMode = i3;
                synchronized (this.lock) {
                    for (int iBeginBroadcast = this.extraControllerCallbacks.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((androidx.media3.session.legacy.IMediaControllerCallback) this.extraControllerCallbacks.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i3);
                        } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                            androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaSessionCompat.TAG, "Dead object in setShuffleMode.", e6);
                        }
                    }
                    this.extraControllerCallbacks.finishBroadcast();
                }
            }
        }
    }

    public static class MediaSessionImplApi28 extends androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23 {
        public MediaSessionImplApi28(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23, androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            return new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(this.sessionFwk.getCurrentControllerInfo());
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23, androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }
    }

    public static class MediaSessionImplApi29 extends androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi28 {
        public MediaSessionImplApi29(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23
        public android.media.session.MediaSession createFwkMediaSession(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
            return androidx.media3.exoplayer.source.mediaparser.a.g(context, str, bundle);
        }
    }

    public static final class QueueItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.QueueItem>() { // from class: androidx.media3.session.legacy.MediaSessionCompat.QueueItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.QueueItem createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.MediaSessionCompat.QueueItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.QueueItem[] newArray(int i3) {
                return new androidx.media3.session.legacy.MediaSessionCompat.QueueItem[i3];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final androidx.media3.session.legacy.MediaDescriptionCompat description;
        private final long id;
        private android.media.session.MediaSession.QueueItem itemFwk;

        public QueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static androidx.media3.session.legacy.MediaSessionCompat.QueueItem fromQueueItem(android.media.session.MediaSession.QueueItem queueItem) {
            return new androidx.media3.session.legacy.MediaSessionCompat.QueueItem(queueItem, androidx.media3.session.legacy.MediaDescriptionCompat.fromMediaDescription(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> fromQueueItemList(java.util.List<android.media.session.MediaSession.QueueItem> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<android.media.session.MediaSession.QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public androidx.media3.session.legacy.MediaDescriptionCompat getDescription() {
            return this.description;
        }

        public long getQueueId() {
            return this.id;
        }

        public android.media.session.MediaSession.QueueItem getQueueItem() {
            android.media.session.MediaSession.QueueItem queueItem = this.itemFwk;
            if (queueItem != null) {
                return queueItem;
            }
            android.media.session.MediaSession.QueueItem queueItem2 = new android.media.session.MediaSession.QueueItem(this.description.getMediaDescription(), this.id);
            this.itemFwk = queueItem2;
            return queueItem2;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaSession.QueueItem { Description=");
            sb.append(this.description);
            sb.append(", Id=");
            return Y6.f.g(this.id, " }", sb);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            this.description.writeToParcel(parcel, i3);
            parcel.writeLong(this.id);
        }

        private QueueItem(android.media.session.MediaSession.QueueItem queueItem, androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (j == -1) {
                throw new java.lang.IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.description = mediaDescriptionCompat;
            this.id = j;
            this.itemFwk = queueItem;
        }

        public QueueItem(android.os.Parcel parcel) {
            this.description = androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.id = parcel.readLong();
        }
    }

    public interface RegistrationCallback {
        void onCallbackRegistered(int i3, int i9);

        void onCallbackUnregistered(int i3, int i9);
    }

    public static final class RegistrationCallbackHandler extends android.os.Handler {
        private static final int MSG_CALLBACK_REGISTERED = 1001;
        private static final int MSG_CALLBACK_UNREGISTERED = 1002;
        private final androidx.media3.session.legacy.MediaSessionCompat.RegistrationCallback callback;

        public RegistrationCallbackHandler(android.os.Looper looper, androidx.media3.session.legacy.MediaSessionCompat.RegistrationCallback registrationCallback) {
            super(looper);
            this.callback = registrationCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            int i3 = message.what;
            if (i3 == 1001) {
                this.callback.onCallbackRegistered(message.arg1, message.arg2);
            } else {
                if (i3 != 1002) {
                    return;
                }
                this.callback.onCallbackUnregistered(message.arg1, message.arg2);
            }
        }

        public void postCallbackRegistered(int i3, int i9) {
            obtainMessage(1001, i3, i9).sendToTarget();
        }

        public void postCallbackUnregistered(int i3, int i9) {
            obtainMessage(1002, i3, i9).sendToTarget();
        }
    }

    public static final class ResultReceiverWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper>() { // from class: androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper[] newArray(int i3) {
                return new androidx.media3.session.legacy.MediaSessionCompat.ResultReceiverWrapper[i3];
            }
        };
        android.os.ResultReceiver resultReceiver;

        public ResultReceiverWrapper(android.os.Parcel parcel) {
            this.resultReceiver = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            this.resultReceiver.writeToParcel(parcel, i3);
        }
    }

    public static final class Token implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.Token> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaSessionCompat.Token>() { // from class: androidx.media3.session.legacy.MediaSessionCompat.Token.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.Token createFromParcel(android.os.Parcel parcel) {
                android.media.session.MediaSession.Token token = (android.media.session.MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new androidx.media3.session.legacy.MediaSessionCompat.Token(token);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaSessionCompat.Token[] newArray(int i3) {
                return new androidx.media3.session.legacy.MediaSessionCompat.Token[i3];
            }
        };
        private androidx.media3.session.legacy.IMediaSession extraBinder;
        private final android.media.session.MediaSession.Token inner;
        private final java.lang.Object lock;
        private C2.d session2Token;

        public Token(android.media.session.MediaSession.Token token) {
            this(token, null);
        }

        public static androidx.media3.session.legacy.MediaSessionCompat.Token fromBundle(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(bundle);
            androidx.media3.session.legacy.IMediaSession iMediaSessionAsInterface = androidx.media3.session.legacy.IMediaSession.Stub.asInterface(bundle.getBinder(androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER));
            C2.d dVarG = C2.a.G(bundle);
            androidx.media3.session.legacy.MediaSessionCompat.Token token = (androidx.media3.session.legacy.MediaSessionCompat.Token) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundle.getParcelable(androidx.media3.session.legacy.MediaSessionCompat.KEY_TOKEN), CREATOR);
            if (token == null) {
                return null;
            }
            return new androidx.media3.session.legacy.MediaSessionCompat.Token(token.inner, iMediaSessionAsInterface, dVarG);
        }

        public static androidx.media3.session.legacy.MediaSessionCompat.Token fromToken(android.media.session.MediaSession.Token token) {
            return fromToken(token, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof androidx.media3.session.legacy.MediaSessionCompat.Token) {
                return this.inner.equals(((androidx.media3.session.legacy.MediaSessionCompat.Token) obj).inner);
            }
            return false;
        }

        public androidx.media3.session.legacy.IMediaSession getExtraBinder() {
            androidx.media3.session.legacy.IMediaSession iMediaSession;
            synchronized (this.lock) {
                iMediaSession = this.extraBinder;
            }
            return iMediaSession;
        }

        public C2.d getSession2Token() {
            C2.d dVar;
            synchronized (this.lock) {
                dVar = this.session2Token;
            }
            return dVar;
        }

        public android.media.session.MediaSession.Token getToken() {
            return this.inner;
        }

        public int hashCode() {
            return this.inner.hashCode();
        }

        public void setExtraBinder(androidx.media3.session.legacy.IMediaSession iMediaSession) {
            synchronized (this.lock) {
                this.extraBinder = iMediaSession;
            }
        }

        public void setSession2Token(C2.d dVar) {
            synchronized (this.lock) {
                this.session2Token = dVar;
            }
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.media3.session.legacy.MediaSessionCompat.KEY_TOKEN, androidx.media3.session.legacy.LegacyParcelableUtil.convert(this, android.support.v4.media.session.MediaSessionCompat$Token.CREATOR));
            synchronized (this.lock) {
                try {
                    androidx.media3.session.legacy.IMediaSession iMediaSession = this.extraBinder;
                    if (iMediaSession != null) {
                        bundle.putBinder(androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                    }
                    C2.d dVar = this.session2Token;
                    if (dVar != null) {
                        C2.a.J(bundle, dVar);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeParcelable(this.inner, i3);
        }

        public Token(android.media.session.MediaSession.Token token, androidx.media3.session.legacy.IMediaSession iMediaSession) {
            this(token, iMediaSession, null);
        }

        public static androidx.media3.session.legacy.MediaSessionCompat.Token fromToken(android.media.session.MediaSession.Token token, androidx.media3.session.legacy.IMediaSession iMediaSession) {
            return new androidx.media3.session.legacy.MediaSessionCompat.Token(token, iMediaSession);
        }

        public Token(android.media.session.MediaSession.Token token, androidx.media3.session.legacy.IMediaSession iMediaSession, C2.d dVar) {
            this.lock = new java.lang.Object();
            this.inner = token;
            this.extraBinder = iMediaSession;
            this.session2Token = dVar;
        }
    }

    public MediaSessionCompat(android.content.Context context, java.lang.String str, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = androidx.media3.session.legacy.MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
            androidx.media3.common.util.Log.i(TAG, "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, intent, android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.impl = new androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi29(context, str, bundle);
        } else if (i3 >= 28) {
            this.impl = new androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi28(context, str, bundle);
        } else {
            this.impl = new androidx.media3.session.legacy.MediaSessionCompat.MediaSessionImplApi23(context, str, bundle);
        }
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        setCallback(new androidx.media3.session.legacy.MediaSessionCompat.Callback() { // from class: androidx.media3.session.legacy.MediaSessionCompat.1
        }, new android.os.Handler(looperMyLooper == null ? android.os.Looper.getMainLooper() : looperMyLooper));
        this.impl.setMediaButtonReceiver(pendingIntent);
        this.controller = new androidx.media3.session.legacy.MediaControllerCompat(context, this);
    }

    public static void ensureClassLoader(android.os.Bundle bundle) {
        if (bundle != null) {
            java.lang.ClassLoader classLoader = androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static androidx.media3.session.legacy.PlaybackStateCompat getStateWithUpdatedPosition(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat, androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j9 = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
        if (lastPositionUpdateTime <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - lastPositionUpdateTime)));
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j9 = mediaMetadataCompat.getLong(androidx.media3.session.legacy.MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        if (j9 < 0 || position <= j9) {
            j = position < 0 ? 0L : position;
        } else {
            j = j9;
        }
        return new androidx.media3.session.legacy.PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), j, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    public androidx.media3.session.legacy.MediaControllerCompat getController() {
        return this.controller;
    }

    public final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        return this.impl.getCurrentControllerInfo();
    }

    public java.lang.Object getMediaSession() {
        return this.impl.getMediaSession();
    }

    public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
        return this.impl.getSessionToken();
    }

    public boolean isActive() {
        return this.impl.isActive();
    }

    public void release() {
        this.impl.release();
    }

    public void sendSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("event cannot be null or empty");
        }
        this.impl.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z6) {
        this.impl.setActive(z6);
    }

    public void setCallback(androidx.media3.session.legacy.MediaSessionCompat.Callback callback, android.os.Handler handler) {
        this.impl.setCallback(callback, handler);
    }

    public void setExtras(android.os.Bundle bundle) {
        this.impl.setExtras(bundle);
    }

    public void setFlags(int i3) {
        this.impl.setFlags(i3);
    }

    public void setMediaButtonReceiver(android.app.PendingIntent pendingIntent) {
        this.impl.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        this.impl.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        this.impl.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(androidx.media3.common.AudioAttributes audioAttributes) {
        this.impl.setPlaybackToLocal(audioAttributes);
    }

    public void setPlaybackToRemote(androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat) {
        this.impl.setPlaybackToRemote(volumeProviderCompat);
    }

    public void setQueue(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        if (list != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem : list) {
                if (hashSet.contains(java.lang.Long.valueOf(queueItem.getQueueId()))) {
                    androidx.media3.common.util.Log.e(TAG, "Found duplicate queue id: " + queueItem.getQueueId(), new java.lang.IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(java.lang.Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.impl.setQueue(list);
    }

    public void setQueueTitle(java.lang.CharSequence charSequence) {
        this.impl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i3) {
        this.impl.setRatingType(i3);
    }

    public void setRepeatMode(int i3) {
        this.impl.setRepeatMode(i3);
    }

    public void setSessionActivity(android.app.PendingIntent pendingIntent) {
        this.impl.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i3) {
        this.impl.setShuffleMode(i3);
    }
}
