package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final java.lang.String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public static final java.lang.String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final java.lang.String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    static final java.lang.String TAG = "MediaControllerCompat";
    private final androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl impl;
    private final java.util.Set<androidx.media3.session.legacy.MediaControllerCompat.Callback> registeredCallbacks;
    private final androidx.media3.session.legacy.MediaSessionCompat.Token token;

    public static abstract class Callback implements android.os.IBinder.DeathRecipient {
        final android.media.session.MediaController.Callback callbackFwk = new androidx.media3.session.legacy.MediaControllerCompat.Callback.MediaControllerCallback(this);
        private androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler handler;
        androidx.media3.session.legacy.IMediaControllerCallback iControllerCallback;

        public static class CallbackStub extends androidx.media3.session.legacy.IMediaControllerCallback.Stub {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.Callback> callback;

            public CallbackStub(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
                this.callback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z6) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.postToHandler(11, java.lang.Boolean.valueOf(z6), null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onRepeatModeChanged(int i3) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.postToHandler(9, java.lang.Integer.valueOf(i3), null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onSessionReady() {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.postToHandler(13, null, null);
                }
            }

            @Override // androidx.media3.session.legacy.IMediaControllerCallback
            public void onShuffleModeChanged(int i3) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.postToHandler(12, java.lang.Integer.valueOf(i3), null);
                }
            }
        }

        public static class MediaControllerCallback extends android.media.session.MediaController.Callback {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.Callback> callback;

            public MediaControllerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
                this.callback = new java.lang.ref.WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback == null || playbackInfo == null) {
                    return;
                }
                int playbackType = playbackInfo.getPlaybackType();
                java.lang.String volumeControlId = android.os.Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null;
                boolean z6 = true;
                if (playbackType == 1 && volumeControlId != null) {
                    z6 = false;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
                callback.onAudioInfoChanged(new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(playbackType, androidx.media3.common.AudioAttributes.fromPlatformAudioAttributes(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId));
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(android.os.Bundle bundle) {
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundleConvertToNullIfInvalid);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(android.media.MediaMetadata mediaMetadata) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(android.media.session.PlaybackState playbackState) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback == null || callback.iControllerCallback != null) {
                    return;
                }
                callback.onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat.fromPlaybackState(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> list) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onQueueChanged(androidx.media3.session.legacy.MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                androidx.media3.session.legacy.MediaControllerCompat.Callback callback = this.callback.get();
                if (callback != null) {
                    callback.onSessionEvent(str, bundleConvertToNullIfInvalid);
                }
            }
        }

        public class MessageHandler extends android.os.Handler {
            private static final int MSG_DESTROYED = 8;
            private static final int MSG_SESSION_READY = 13;
            private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
            private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
            private static final int MSG_UPDATE_REPEAT_MODE = 9;
            private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
            boolean registered;

            public MessageHandler(android.os.Looper looper) {
                super(looper);
                this.registered = false;
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (this.registered) {
                    int i3 = message.what;
                    if (i3 == 2) {
                        androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onPlaybackStateChanged((androidx.media3.session.legacy.PlaybackStateCompat) message.obj);
                        return;
                    }
                    if (i3 == 8) {
                        androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onSessionDestroyed();
                        return;
                    }
                    if (i3 == 9) {
                        androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onRepeatModeChanged(((java.lang.Integer) message.obj).intValue());
                        return;
                    }
                    switch (i3) {
                        case 11:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onCaptioningEnabledChanged(((java.lang.Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onShuffleModeChanged(((java.lang.Integer) message.obj).intValue());
                            break;
                        case 13:
                            androidx.media3.session.legacy.MediaControllerCompat.Callback.this.onSessionReady();
                            break;
                    }
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            postToHandler(8, null, null);
        }

        public void onAudioInfoChanged(androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo playbackInfo) {
        }

        public void onCaptioningEnabledChanged(boolean z6) {
        }

        public void onExtrasChanged(android.os.Bundle bundle) {
        }

        public void onMetadataChanged(androidx.media3.session.legacy.MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(java.lang.CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i3) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i3) {
        }

        public void postToHandler(int i3, java.lang.Object obj, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler = this.handler;
            if (messageHandler != null) {
                android.os.Message messageObtainMessage = messageHandler.obtainMessage(i3, obj);
                if (bundle != null) {
                    messageObtainMessage.setData(bundle);
                }
                messageObtainMessage.sendToTarget();
            }
        }

        public void setHandler(android.os.Handler handler) {
            if (handler != null) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler = new androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler(handler.getLooper());
                this.handler = messageHandler;
                messageHandler.registered = true;
            } else {
                androidx.media3.session.legacy.MediaControllerCompat.Callback.MessageHandler messageHandler2 = this.handler;
                if (messageHandler2 != null) {
                    messageHandler2.registered = false;
                    messageHandler2.removeCallbacksAndMessages(null);
                    this.handler = null;
                }
            }
        }
    }

    public interface MediaControllerImpl {
        void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i3);

        void adjustVolume(int i3, int i9);

        boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent);

        android.os.Bundle getExtras();

        long getFlags();

        java.lang.Object getMediaController();

        androidx.media3.session.legacy.MediaMetadataCompat getMetadata();

        java.lang.String getPackageName();

        androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo();

        androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState();

        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue();

        java.lang.CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        android.app.PendingIntent getSessionActivity();

        android.os.Bundle getSessionInfo();

        int getShuffleMode();

        androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler);

        void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver);

        void setVolumeTo(int i3, int i9);

        void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback);
    }

    public static class MediaControllerImplApi29 extends androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23 {
        public MediaControllerImplApi29(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23, androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.sessionInfo != null) {
                return new android.os.Bundle(this.sessionInfo);
            }
            android.os.Bundle sessionInfo = this.controllerFwk.getSessionInfo();
            this.sessionInfo = sessionInfo;
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(sessionInfo);
            this.sessionInfo = bundleConvertToNullIfInvalid;
            return bundleConvertToNullIfInvalid == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.sessionInfo);
        }
    }

    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final androidx.media3.common.AudioAttributes audioAttributes;
        private final int currentVolume;
        private final int maxVolume;
        private final int playbackType;
        private final int volumeControl;
        private final java.lang.String volumeControlId;

        public PlaybackInfo(int i3, androidx.media3.common.AudioAttributes audioAttributes, int i9, int i10, int i11, java.lang.String str) {
            this.playbackType = i3;
            this.audioAttributes = audioAttributes;
            this.volumeControl = i9;
            this.maxVolume = i10;
            this.currentVolume = i11;
            this.volumeControlId = str;
        }

        public androidx.media3.common.AudioAttributes getAudioAttributes() {
            return this.audioAttributes;
        }

        public int getCurrentVolume() {
            return this.currentVolume;
        }

        public int getMaxVolume() {
            return this.maxVolume;
        }

        public int getPlaybackType() {
            return this.playbackType;
        }

        public int getVolumeControl() {
            return this.volumeControl;
        }

        public java.lang.String getVolumeControlId() {
            return this.volumeControlId;
        }
    }

    public static abstract class TransportControls {

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(java.lang.String str, android.os.Bundle bundle);

        public abstract void playFromSearch(java.lang.String str, android.os.Bundle bundle);

        public abstract void playFromUri(android.net.Uri uri, android.os.Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle);

        public abstract void prepareFromSearch(java.lang.String str, android.os.Bundle bundle);

        public abstract void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j);

        public abstract void sendCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle);

        public abstract void sendCustomAction(java.lang.String str, android.os.Bundle bundle);

        public void setPlaybackSpeed(float f9) {
        }

        public abstract void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat);

        public abstract void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle);

        public abstract void setRepeatMode(int i3);

        public abstract void setShuffleMode(int i3);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j);

        public abstract void stop();
    }

    public static class TransportControlsApi23 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControls {
        protected final android.media.session.MediaController.TransportControls controlsFwk;

        public TransportControlsApi23(android.media.session.MediaController.TransportControls transportControls) {
            this.controlsFwk = transportControls;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void fastForward() {
            this.controlsFwk.fastForward();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void pause() {
            this.controlsFwk.pause();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void play() {
            this.controlsFwk.play();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.controlsFwk.playFromMediaId(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.controlsFwk.playFromSearch(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.controlsFwk.playFromUri(uri, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepare() {
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE, (android.os.Bundle) null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);
            bundle2.putBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);
            bundle2.putBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
            bundle2.putBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void rewind() {
            this.controlsFwk.rewind();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            this.controlsFwk.seekTo(j);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
            this.controlsFwk.sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f9) {
            if (f9 == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, f9);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat) {
            this.controlsFwk.setRating((android.media.Rating) ratingCompat.getRating());
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i3) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i3);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i3) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i3);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToNext() {
            this.controlsFwk.skipToNext();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            this.controlsFwk.skipToPrevious();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            this.controlsFwk.skipToQueueItem(j);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void stop() {
            this.controlsFwk.stop();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setRating(androidx.media3.session.legacy.RatingCompat ratingCompat, android.os.Bundle bundle) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_RATING, androidx.media3.session.legacy.LegacyParcelableUtil.convert(ratingCompat, android.support.v4.media.RatingCompat.CREATOR));
            bundle2.putBundle(androidx.media3.session.legacy.MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(androidx.media3.session.legacy.MediaSessionCompat.ACTION_SET_RATING, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaControllerCompat.validateCustomAction(str, bundle);
            this.controlsFwk.sendCustomAction(str, bundle);
        }
    }

    public static class TransportControlsApi24 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23 {
        public TransportControlsApi24(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepare() {
            this.controlsFwk.prepare();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
            this.controlsFwk.prepareFromMediaId(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
            this.controlsFwk.prepareFromSearch(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
            this.controlsFwk.prepareFromUri(uri, bundle);
        }
    }

    public static class TransportControlsApi29 extends androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi24 {
        public TransportControlsApi29(android.media.session.MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi23, androidx.media3.session.legacy.MediaControllerCompat.TransportControls
        public void setPlaybackSpeed(float f9) {
            if (f9 == 0.0f) {
                throw new java.lang.IllegalArgumentException("speed must not be zero");
            }
            this.controlsFwk.setPlaybackSpeed(f9);
        }
    }

    public MediaControllerCompat(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.getSessionToken());
    }

    public static void validateCustomAction(java.lang.String str, android.os.Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_FOLLOW) || str.equals(androidx.media3.session.legacy.MediaSessionCompat.ACTION_UNFOLLOW)) {
            if (bundle == null || !bundle.containsKey(androidx.media3.session.legacy.MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
                throw new java.lang.IllegalArgumentException(Y6.f.h("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
            }
        }
    }

    public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        this.impl.addQueueItem(mediaDescriptionCompat);
    }

    public void adjustVolume(int i3, int i9) {
        this.impl.adjustVolume(i3, i9);
    }

    public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.impl.dispatchMediaButtonEvent(keyEvent);
        }
        throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
    }

    public android.os.Bundle getExtras() {
        return this.impl.getExtras();
    }

    public long getFlags() {
        return this.impl.getFlags();
    }

    public java.lang.Object getMediaController() {
        return this.impl.getMediaController();
    }

    public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() {
        return this.impl.getMetadata();
    }

    public java.lang.String getPackageName() {
        return this.impl.getPackageName();
    }

    public androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
        return this.impl.getPlaybackInfo();
    }

    public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
        return this.impl.getPlaybackState();
    }

    public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() {
        return this.impl.getQueue();
    }

    public java.lang.CharSequence getQueueTitle() {
        return this.impl.getQueueTitle();
    }

    public int getRatingType() {
        return this.impl.getRatingType();
    }

    public int getRepeatMode() {
        return this.impl.getRepeatMode();
    }

    public android.app.PendingIntent getSessionActivity() {
        return this.impl.getSessionActivity();
    }

    public android.os.Bundle getSessionInfo() {
        return this.impl.getSessionInfo();
    }

    public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
        return this.token;
    }

    public int getShuffleMode() {
        return this.impl.getShuffleMode();
    }

    public androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls() {
        return this.impl.getTransportControls();
    }

    public boolean isCaptioningEnabled() {
        return this.impl.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.impl.isSessionReady();
    }

    public void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler) {
        if (!this.registeredCallbacks.add(callback)) {
            androidx.media3.common.util.Log.w(TAG, "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new android.os.Handler();
        }
        callback.setHandler(handler);
        this.impl.registerCallback(callback, handler);
    }

    public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
        this.impl.removeQueueItem(mediaDescriptionCompat);
    }

    @java.lang.Deprecated
    public void removeQueueItemAt(int i3) {
        androidx.media3.session.legacy.MediaSessionCompat.QueueItem queueItem;
        java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i3 < 0 || i3 >= queue.size() || (queueItem = queue.get(i3)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("command must neither be null nor empty");
        }
        this.impl.sendCommand(str, bundle, resultReceiver);
    }

    public void setVolumeTo(int i3, int i9) {
        this.impl.setVolumeTo(i3, i9);
    }

    public void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
        if (!this.registeredCallbacks.remove(callback)) {
            androidx.media3.common.util.Log.w(TAG, "the callback has never been registered");
            return;
        }
        try {
            this.impl.unregisterCallback(callback);
        } finally {
            callback.setHandler(null);
        }
    }

    public MediaControllerCompat(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        this.registeredCallbacks = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.token = token;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.impl = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi29(context, token);
        } else {
            this.impl = new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23(context, token);
        }
    }

    public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        this.impl.addQueueItem(mediaDescriptionCompat, i3);
    }

    public static class MediaControllerImplApi23 implements androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl {
        protected final android.media.session.MediaController controllerFwk;
        protected android.os.Bundle sessionInfo;
        final androidx.media3.session.legacy.MediaSessionCompat.Token sessionToken;
        final java.lang.Object lock = new java.lang.Object();
        private final java.util.List<androidx.media3.session.legacy.MediaControllerCompat.Callback> pendingCallbacks = new java.util.ArrayList();
        private final java.util.HashMap<androidx.media3.session.legacy.MediaControllerCompat.Callback, androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub> callbackMap = new java.util.HashMap<>();

        public static class ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
            private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23> mediaControllerImpl;

            public ExtraBinderRequestResultReceiver(androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23 mediaControllerImplApi23) {
                super(null);
                this.mediaControllerImpl = new java.lang.ref.WeakReference<>(mediaControllerImplApi23);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i3, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23 mediaControllerImplApi23 = this.mediaControllerImpl.get();
                if (mediaControllerImplApi23 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi23.lock) {
                    mediaControllerImplApi23.sessionToken.setExtraBinder(androidx.media3.session.legacy.IMediaSession.Stub.asInterface(bundle.getBinder(androidx.media3.session.legacy.MediaSessionCompat.KEY_EXTRA_BINDER)));
                    mediaControllerImplApi23.sessionToken.setSession2Token(C2.a.G(bundle));
                    mediaControllerImplApi23.processPendingCallbacksLocked();
                }
            }
        }

        public MediaControllerImplApi23(android.content.Context context, androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            this.sessionToken = token;
            this.controllerFwk = new android.media.session.MediaController(context, token.getToken());
            if (token.getExtraBinder() == null) {
                requestExtraBinder();
            }
        }

        private void requestExtraBinder() {
            sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImplApi23.ExtraBinderRequestResultReceiver(this));
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i3, int i9) {
            this.controllerFwk.adjustVolume(i3, i9);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent keyEvent) {
            return this.controllerFwk.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
            return androidx.media3.common.util.Util.convertToNullIfInvalid(this.controllerFwk.getExtras());
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            return this.controllerFwk.getFlags();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
            return this.controllerFwk;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaMetadataCompat getMetadata() {
            android.media.MediaMetadata metadata = this.controllerFwk.getMetadata();
            if (metadata != null) {
                return androidx.media3.session.legacy.MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
            return this.controllerFwk.getPackageName();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            android.media.session.MediaController.PlaybackInfo playbackInfo = this.controllerFwk.getPlaybackInfo();
            if (playbackInfo != null) {
                return new androidx.media3.session.legacy.MediaControllerCompat.PlaybackInfo(playbackInfo.getPlaybackType(), androidx.media3.common.AudioAttributes.fromPlatformAudioAttributes(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), android.os.Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.PlaybackStateCompat getPlaybackState() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder != null) {
                try {
                    return extraBinder.getPlaybackState();
                } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                    androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getPlaybackState.", e6);
                }
            }
            android.media.session.PlaybackState playbackState = this.controllerFwk.getPlaybackState();
            if (playbackState != null) {
                return androidx.media3.session.legacy.PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.util.List<androidx.media3.session.legacy.MediaSessionCompat.QueueItem> getQueue() {
            java.util.List<android.media.session.MediaSession.QueueItem> queue = this.controllerFwk.getQueue();
            if (queue != null) {
                return androidx.media3.session.legacy.MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
            return this.controllerFwk.getQueueTitle();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            return this.controllerFwk.getRatingType();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder == null) {
                return -1;
            }
            try {
                return extraBinder.getRepeatMode();
            } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getRepeatMode.", e6);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
            return this.controllerFwk.getSessionActivity();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getSessionInfo() {
            if (this.sessionInfo != null) {
                return new android.os.Bundle(this.sessionInfo);
            }
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder != null) {
                try {
                    this.sessionInfo = extraBinder.getSessionInfo();
                } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                    androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getSessionInfo.", e6);
                    this.sessionInfo = android.os.Bundle.EMPTY;
                }
            }
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(this.sessionInfo);
            this.sessionInfo = bundleConvertToNullIfInvalid;
            return bundleConvertToNullIfInvalid == null ? android.os.Bundle.EMPTY : new android.os.Bundle(this.sessionInfo);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder == null) {
                return -1;
            }
            try {
                return extraBinder.getShuffleMode();
            } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in getShuffleMode.", e6);
                return -1;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public androidx.media3.session.legacy.MediaControllerCompat.TransportControls getTransportControls() {
            android.media.session.MediaController.TransportControls transportControls = this.controllerFwk.getTransportControls();
            return android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi29(transportControls) : new androidx.media3.session.legacy.MediaControllerCompat.TransportControlsApi24(transportControls);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder == null) {
                return false;
            }
            try {
                return extraBinder.isCaptioningEnabled();
            } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in isCaptioningEnabled.", e6);
                return false;
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return this.sessionToken.getExtraBinder() != null;
        }

        public void processPendingCallbacksLocked() {
            androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
            if (extraBinder == null) {
                return;
            }
            for (androidx.media3.session.legacy.MediaControllerCompat.Callback callback : this.pendingCallbacks) {
                androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub callbackStub = new androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub(callback);
                this.callbackMap.put(callback, callbackStub);
                callback.iControllerCallback = callbackStub;
                try {
                    extraBinder.registerCallbackListener(callbackStub);
                    callback.postToHandler(13, null, null);
                } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                    androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in registerCallback.", e6);
                }
            }
            this.pendingCallbacks.clear();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback, android.os.Handler handler) {
            android.media.session.MediaController mediaController = this.controllerFwk;
            android.media.session.MediaController.Callback callback2 = callback.callbackFwk;
            callback2.getClass();
            mediaController.registerCallback(callback2, handler);
            synchronized (this.lock) {
                androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
                if (extraBinder != null) {
                    androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub callbackStub = new androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub(callback);
                    this.callbackMap.put(callback, callbackStub);
                    callback.iControllerCallback = callbackStub;
                    try {
                        extraBinder.registerCallbackListener(callbackStub);
                        callback.postToHandler(13, null, null);
                    } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                        androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in registerCallback.", e6);
                    }
                } else {
                    callback.iControllerCallback = null;
                    this.pendingCallbacks.add(callback);
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
            this.controllerFwk.sendCommand(str, bundle, resultReceiver);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i3, int i9) {
            this.controllerFwk.setVolumeTo(i3, i9);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(androidx.media3.session.legacy.MediaControllerCompat.Callback callback) {
            android.media.session.MediaController mediaController = this.controllerFwk;
            android.media.session.MediaController.Callback callback2 = callback.callbackFwk;
            callback2.getClass();
            mediaController.unregisterCallback(callback2);
            synchronized (this.lock) {
                androidx.media3.session.legacy.IMediaSession extraBinder = this.sessionToken.getExtraBinder();
                if (extraBinder != null) {
                    androidx.media3.session.legacy.MediaControllerCompat.Callback.CallbackStub callbackStubRemove = this.callbackMap.remove(callback);
                    if (callbackStubRemove != null) {
                        callback.iControllerCallback = null;
                        if (extraBinder.asBinder().isBinderAlive()) {
                            try {
                                extraBinder.unregisterCallbackListener(callbackStubRemove);
                            } catch (android.os.RemoteException | java.lang.SecurityException e6) {
                                androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaControllerCompat.TAG, "Dead object in unregisterCallbackListener.", e6);
                            }
                        }
                    }
                } else {
                    this.pendingCallbacks.remove(callback);
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i3) {
            if ((getFlags() & 4) == 0) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
            bundle.putInt(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i3);
            sendCommand(androidx.media3.session.legacy.MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
        }
    }
}
