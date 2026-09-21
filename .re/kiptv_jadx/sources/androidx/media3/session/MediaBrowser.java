package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowser extends androidx.media3.session.MediaController {
    private static final java.lang.String WRONG_THREAD_ERROR_MESSAGE = "MediaBrowser method is called from a wrong thread. See javadoc of MediaController for details.";

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private androidx.media3.session.MediaBrowser.MediaBrowserImpl impl;

    public static final class Builder {
        private boolean allowDeviceVolumeCommandsForLocalPlayback;
        private android.os.Looper applicationLooper;
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private android.os.Bundle connectionHints;
        private final android.content.Context context;
        private androidx.media3.session.MediaBrowser.Listener listener;
        private int maxCommandsForMediaItems;
        private long platformSessionCallbackAggregationTimeoutMs;
        private final androidx.media3.session.SessionToken token;

        public Builder(android.content.Context context, androidx.media3.session.SessionToken sessionToken) {
            context.getClass();
            this.context = context;
            sessionToken.getClass();
            this.token = sessionToken;
            this.connectionHints = android.os.Bundle.EMPTY;
            this.listener = new androidx.media3.session.MediaBrowser.Listener() { // from class: androidx.media3.session.MediaBrowser.Builder.1
            };
            this.applicationLooper = androidx.media3.common.util.Util.getCurrentOrMainLooper();
            this.platformSessionCallbackAggregationTimeoutMs = 100L;
        }

        public com.google.common.util.concurrent.J buildAsync() {
            androidx.media3.session.MediaControllerHolder mediaControllerHolder = new androidx.media3.session.MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader.Builder(this.context).build());
            }
            androidx.media3.common.util.Util.postOrRun(new android.os.Handler(this.applicationLooper), new androidx.media3.session.RunnableC1579g(mediaControllerHolder, new androidx.media3.session.MediaBrowser(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader, this.maxCommandsForMediaItems, this.platformSessionCallbackAggregationTimeoutMs, this.allowDeviceVolumeCommandsForLocalPlayback), 0));
            return mediaControllerHolder;
        }

        public androidx.media3.session.MediaBrowser.Builder experimentalSetPlatformSessionCallbackAggregationTimeoutMs(long j) {
            this.platformSessionCallbackAggregationTimeoutMs = j;
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setAllowDeviceVolumeCommandsForLocalPlayback(boolean z6) {
            this.allowDeviceVolumeCommandsForLocalPlayback = z6;
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setApplicationLooper(android.os.Looper looper) {
            looper.getClass();
            this.applicationLooper = looper;
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            bitmapLoader.getClass();
            this.bitmapLoader = bitmapLoader;
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setConnectionHints(android.os.Bundle bundle) {
            bundle.getClass();
            this.connectionHints = new android.os.Bundle(bundle);
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setListener(androidx.media3.session.MediaBrowser.Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public androidx.media3.session.MediaBrowser.Builder setMaxCommandsForMediaItems(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            this.maxCommandsForMediaItems = i3;
            return this;
        }
    }

    public interface Listener extends androidx.media3.session.MediaController.Listener {
        default void onChildrenChanged(androidx.media3.session.MediaBrowser mediaBrowser, java.lang.String str, int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSearchResultChanged(androidx.media3.session.MediaBrowser mediaBrowser, java.lang.String str, int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    public interface MediaBrowserImpl extends androidx.media3.session.MediaController.MediaControllerImpl {
        com.google.common.util.concurrent.J getChildren(java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J getItem(java.lang.String str);

        com.google.common.util.concurrent.J getLibraryRoot(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J getSearchResult(java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J search(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J subscribe(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J unsubscribe(java.lang.String str);
    }

    public MediaBrowser(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, androidx.media3.session.MediaBrowser.Listener listener, android.os.Looper looper, androidx.media3.session.MediaController.ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader, int i3, long j, boolean z6) {
        super(context, sessionToken, bundle, listener, looper, connectionCallback, bitmapLoader, i3, j, z6);
    }

    private static <V> com.google.common.util.concurrent.J createDisconnectedFuture() {
        return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-100));
    }

    private void verifyApplicationThread() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(android.os.Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    public com.google.common.util.concurrent.J getChildren(java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "parentId must not be empty");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 >= 0, "page must not be negative");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i9 >= 1, "pageSize must not be less than 1");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getChildren(str, i3, i9, libraryParams);
    }

    public com.google.common.util.concurrent.J getItem(java.lang.String str) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "mediaId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getItem(str);
    }

    public com.google.common.util.concurrent.J getLibraryRoot(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getLibraryRoot(libraryParams);
    }

    public com.google.common.util.concurrent.J getSearchResult(java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "query must not be empty");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 >= 0, "page must not be negative");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i9 >= 1, "pageSize must not be less than 1");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getSearchResult(str, i3, i9, libraryParams);
    }

    public void notifyBrowserListener(androidx.media3.common.util.Consumer<androidx.media3.session.MediaBrowser.Listener> consumer) {
        androidx.media3.session.MediaBrowser.Listener listener = (androidx.media3.session.MediaBrowser.Listener) this.listener;
        if (listener != null) {
            androidx.media3.common.util.Util.postOrRun(this.applicationHandler, new androidx.media3.session.RunnableC1579g(consumer, listener, 14));
        }
    }

    public com.google.common.util.concurrent.J search(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "query must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.search(str, libraryParams);
    }

    public com.google.common.util.concurrent.J subscribe(java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "parentId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.subscribe(str, libraryParams);
    }

    public com.google.common.util.concurrent.J unsubscribe(java.lang.String str) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "parentId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.unsubscribe(str);
    }

    @Override // androidx.media3.session.MediaController
    public androidx.media3.session.MediaBrowser.MediaBrowserImpl createImpl(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j, boolean z6) {
        androidx.media3.session.MediaBrowser.MediaBrowserImpl mediaBrowserImplBase;
        if (sessionToken.isLegacySession()) {
            bitmapLoader.getClass();
            mediaBrowserImplBase = new androidx.media3.session.MediaBrowserImplLegacy(context, this, sessionToken, bundle, looper, bitmapLoader, j);
        } else {
            mediaBrowserImplBase = new androidx.media3.session.MediaBrowserImplBase(context, this, sessionToken, bundle, looper, z6);
        }
        this.impl = mediaBrowserImplBase;
        return mediaBrowserImplBase;
    }
}
