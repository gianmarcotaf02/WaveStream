package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class MediaBrowser extends MediaController {
    private static final String WRONG_THREAD_ERROR_MESSAGE = "MediaBrowser method is called from a wrong thread. See javadoc of MediaController for details.";

    @NotOnlyInitialized
    private MediaBrowserImpl impl;

    public static final class Builder {
        private boolean allowDeviceVolumeCommandsForLocalPlayback;
        private Looper applicationLooper;
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private Bundle connectionHints;
        private final Context context;
        private Listener listener;
        private int maxCommandsForMediaItems;
        private long platformSessionCallbackAggregationTimeoutMs;
        private final SessionToken token;

        public Builder(Context context, SessionToken sessionToken) {
            context.getClass();
            this.context = context;
            sessionToken.getClass();
            this.token = sessionToken;
            this.connectionHints = Bundle.EMPTY;
            this.listener = new Listener() {
            };
            this.applicationLooper = Util.getCurrentOrMainLooper();
            this.platformSessionCallbackAggregationTimeoutMs = 100L;
        }

        public com.google.common.util.concurrent.J buildAsync() {
            MediaControllerHolder mediaControllerHolder = new MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new CacheBitmapLoader(new DataSourceBitmapLoader.Builder(this.context).build());
            }
            Util.postOrRun(new Handler(this.applicationLooper), new RunnableC1579g(mediaControllerHolder, new MediaBrowser(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader, this.maxCommandsForMediaItems, this.platformSessionCallbackAggregationTimeoutMs, this.allowDeviceVolumeCommandsForLocalPlayback), 0));
            return mediaControllerHolder;
        }

        public Builder experimentalSetPlatformSessionCallbackAggregationTimeoutMs(long j) {
            this.platformSessionCallbackAggregationTimeoutMs = j;
            return this;
        }

        public Builder setAllowDeviceVolumeCommandsForLocalPlayback(boolean z6) {
            this.allowDeviceVolumeCommandsForLocalPlayback = z6;
            return this;
        }

        public Builder setApplicationLooper(Looper looper) {
            looper.getClass();
            this.applicationLooper = looper;
            return this;
        }

        public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            bitmapLoader.getClass();
            this.bitmapLoader = bitmapLoader;
            return this;
        }

        public Builder setConnectionHints(Bundle bundle) {
            bundle.getClass();
            this.connectionHints = new Bundle(bundle);
            return this;
        }

        public Builder setListener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public Builder setMaxCommandsForMediaItems(int i3) {
            AbstractC1864o0.L(i3 >= 0);
            this.maxCommandsForMediaItems = i3;
            return this;
        }
    }

    public interface Listener extends MediaController.Listener {
        default void onChildrenChanged(MediaBrowser mediaBrowser, String str, int i3, MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSearchResultChanged(MediaBrowser mediaBrowser, String str, int i3, MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    public interface MediaBrowserImpl extends MediaController.MediaControllerImpl {
        com.google.common.util.concurrent.J getChildren(String str, int i3, int i9, MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J getItem(String str);

        com.google.common.util.concurrent.J getLibraryRoot(MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J getSearchResult(String str, int i3, int i9, MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J search(String str, MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J subscribe(String str, MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.J unsubscribe(String str);
    }

    public MediaBrowser(Context context, SessionToken sessionToken, Bundle bundle, Listener listener, Looper looper, MediaController.ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader, int i3, long j, boolean z6) {
        super(context, sessionToken, bundle, listener, looper, connectionCallback, bitmapLoader, i3, j, z6);
    }

    private static <V> com.google.common.util.concurrent.J createDisconnectedFuture() {
        return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-100));
    }

    private void verifyApplicationThread() {
        AbstractC1864o0.Z(Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    public com.google.common.util.concurrent.J getChildren(String str, int i3, int i9, MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "parentId must not be empty");
        AbstractC1864o0.M(i3 >= 0, "page must not be negative");
        AbstractC1864o0.M(i9 >= 1, "pageSize must not be less than 1");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getChildren(str, i3, i9, libraryParams);
    }

    public com.google.common.util.concurrent.J getItem(String str) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "mediaId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getItem(str);
    }

    public com.google.common.util.concurrent.J getLibraryRoot(MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getLibraryRoot(libraryParams);
    }

    public com.google.common.util.concurrent.J getSearchResult(String str, int i3, int i9, MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "query must not be empty");
        AbstractC1864o0.M(i3 >= 0, "page must not be negative");
        AbstractC1864o0.M(i9 >= 1, "pageSize must not be less than 1");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.getSearchResult(str, i3, i9, libraryParams);
    }

    public void notifyBrowserListener(Consumer<Listener> consumer) {
        Listener listener = (Listener) this.listener;
        if (listener != null) {
            Util.postOrRun(this.applicationHandler, new RunnableC1579g(consumer, listener, 14));
        }
    }

    public com.google.common.util.concurrent.J search(String str, MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "query must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.search(str, libraryParams);
    }

    public com.google.common.util.concurrent.J subscribe(String str, MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "parentId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.subscribe(str, libraryParams);
    }

    public com.google.common.util.concurrent.J unsubscribe(String str) {
        verifyApplicationThread();
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "parentId must not be empty");
        if (!isConnected()) {
            return createDisconnectedFuture();
        }
        MediaBrowserImpl mediaBrowserImpl = this.impl;
        mediaBrowserImpl.getClass();
        return mediaBrowserImpl.unsubscribe(str);
    }

    @Override
    public MediaBrowserImpl createImpl(Context context, SessionToken sessionToken, Bundle bundle, Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j, boolean z6) {
        MediaBrowserImpl mediaBrowserImplBase;
        if (sessionToken.isLegacySession()) {
            bitmapLoader.getClass();
            mediaBrowserImplBase = new MediaBrowserImplLegacy(context, this, sessionToken, bundle, looper, bitmapLoader, j);
        } else {
            mediaBrowserImplBase = new MediaBrowserImplBase(context, this, sessionToken, bundle, looper, z6);
        }
        this.impl = mediaBrowserImplBase;
        return mediaBrowserImplBase;
    }
}
