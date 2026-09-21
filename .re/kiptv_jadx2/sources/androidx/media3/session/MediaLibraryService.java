package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.List;
import p076i4.AbstractC2186b0;

public abstract class MediaLibraryService extends MediaSessionService {
    public static final String SERVICE_INTERFACE = "androidx.media3.session.MediaLibraryService";

    public static final class LibraryParams {
        public final Bundle extras;
        public final boolean isOffline;
        public final boolean isRecent;
        public final boolean isSuggested;
        private static final String FIELD_EXTRAS = Util.intToStringMaxRadix(0);
        private static final String FIELD_RECENT = Util.intToStringMaxRadix(1);
        private static final String FIELD_OFFLINE = Util.intToStringMaxRadix(2);
        private static final String FIELD_SUGGESTED = Util.intToStringMaxRadix(3);

        public static final class Builder {
            private Bundle extras = Bundle.EMPTY;
            private boolean offline;
            private boolean recent;
            private boolean suggested;

            public LibraryParams build() {
                return new LibraryParams(this.extras, this.recent, this.offline, this.suggested);
            }

            public Builder setExtras(Bundle bundle) {
                bundle.getClass();
                this.extras = bundle;
                return this;
            }

            public Builder setOffline(boolean z6) {
                this.offline = z6;
                return this;
            }

            public Builder setRecent(boolean z6) {
                this.recent = z6;
                return this;
            }

            public Builder setSuggested(boolean z6) {
                this.suggested = z6;
                return this;
            }
        }

        public static LibraryParams fromBundle(Bundle bundle) {
            Bundle bundleConvertToNullIfInvalid = Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS));
            boolean z6 = bundle.getBoolean(FIELD_RECENT, false);
            boolean z9 = bundle.getBoolean(FIELD_OFFLINE, false);
            boolean z10 = bundle.getBoolean(FIELD_SUGGESTED, false);
            if (bundleConvertToNullIfInvalid == null) {
                bundleConvertToNullIfInvalid = Bundle.EMPTY;
            }
            return new LibraryParams(bundleConvertToNullIfInvalid, z6, z9, z10);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_EXTRAS, this.extras);
            bundle.putBoolean(FIELD_RECENT, this.isRecent);
            bundle.putBoolean(FIELD_OFFLINE, this.isOffline);
            bundle.putBoolean(FIELD_SUGGESTED, this.isSuggested);
            return bundle;
        }

        private LibraryParams(Bundle bundle, boolean z6, boolean z9, boolean z10) {
            this.extras = new Bundle(bundle);
            this.isRecent = z6;
            this.isOffline = z9;
            this.isSuggested = z10;
        }
    }

    public static final class MediaLibrarySession extends MediaSession {
        public static final int LIBRARY_ERROR_REPLICATION_MODE_FATAL = 1;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NONE = 0;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NON_FATAL = 2;

        public static final class Builder extends MediaSession.BuilderBase<MediaLibrarySession, Builder, Callback> {
            private boolean buildCalled;
            private int libraryErrorReplicationMode;

            public Builder(MediaLibraryService mediaLibraryService, Player player, Callback callback) {
                this((Context) mediaLibraryService, player, callback);
            }

            @Override
            public MediaSession.BuilderBase setCommandButtonsForMediaItems(List list) {
                return setCommandButtonsForMediaItems((List<CommandButton>) list);
            }

            @Override
            public MediaSession.BuilderBase setCustomLayout(List list) {
                return setCustomLayout((List<CommandButton>) list);
            }

            public Builder setLibraryErrorReplicationMode(int i3) {
                this.libraryErrorReplicationMode = i3;
                return this;
            }

            @Override
            public MediaSession.BuilderBase setMediaButtonPreferences(List list) {
                return setMediaButtonPreferences((List<CommandButton>) list);
            }

            public Builder(Context context, Player player, Callback callback) {
                super(context, player, callback);
                this.libraryErrorReplicationMode = 2;
            }

            @Override
            public MediaLibrarySession build() {
                AbstractC1864o0.Y(!this.buildCalled);
                this.buildCalled = true;
                ensureBitmapLoaderIsSizeLimited();
                return new MediaLibrarySession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, this.bitmapLoader, this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, this.libraryErrorReplicationMode);
            }

            @Override
            public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
                return (Builder) super.setBitmapLoader(bitmapLoader);
            }

            @Override
            public Builder setCommandButtonsForMediaItems(List<CommandButton> list) {
                return (Builder) super.setCommandButtonsForMediaItems(list);
            }

            @Override
            public Builder setCustomLayout(List<CommandButton> list) {
                return (Builder) super.setCustomLayout(list);
            }

            @Override
            public Builder setExtras(Bundle bundle) {
                return (Builder) super.setExtras(bundle);
            }

            @Override
            public Builder setId(String str) {
                return (Builder) super.setId(str);
            }

            @Override
            public Builder setMediaButtonPreferences(List<CommandButton> list) {
                return (Builder) super.setMediaButtonPreferences(list);
            }

            @Override
            public Builder setPeriodicPositionUpdateEnabled(boolean z6) {
                return (Builder) super.setPeriodicPositionUpdateEnabled(z6);
            }

            @Override
            public Builder setSessionActivity(PendingIntent pendingIntent) {
                return (Builder) super.setSessionActivity(pendingIntent);
            }

            @Override
            public Builder setSessionExtras(Bundle bundle) {
                return (Builder) super.setSessionExtras(bundle);
            }

            @Override
            public Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
                return (Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z6);
            }
        }

        public interface Callback extends MediaSession.Callback {
            static com.google.common.util.concurrent.J lambda$onSubscribe$0(MediaSession.ControllerInfo controllerInfo, MediaLibrarySession mediaLibrarySession, String str, LibraryParams libraryParams, LibraryResult libraryResult) {
                V v6;
                Boolean bool;
                if (libraryResult.resultCode == 0 && (v6 = libraryResult.value) != 0 && (bool = ((MediaItem) v6).mediaMetadata.isBrowsable) != null && bool.booleanValue()) {
                    if (controllerInfo.getControllerVersion() != 0) {
                        mediaLibrarySession.notifyChildrenChanged(controllerInfo, str, Log.LOG_LEVEL_OFF, libraryParams);
                    }
                    return com.google.common.util.concurrent.D.z(LibraryResult.ofVoid());
                }
                int i3 = libraryResult.resultCode;
                if (i3 == 0) {
                    i3 = -3;
                }
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(i3));
            }

            default com.google.common.util.concurrent.J onGetChildren(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, int i3, int i9, LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetItem(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetLibraryRoot(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetSearchResult(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, int i3, int i9, LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onSearch(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onSubscribe(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, LibraryParams libraryParams) {
                return Util.transformFutureAsync(onGetItem(mediaLibrarySession, controllerInfo, str), new C1587k(mediaLibrarySession, controllerInfo, str, libraryParams));
            }

            default com.google.common.util.concurrent.J onUnsubscribe(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str) {
                return com.google.common.util.concurrent.D.z(LibraryResult.ofVoid());
            }
        }

        public MediaLibrarySession(Context context, String str, Player player, PendingIntent pendingIntent, AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, AbstractC2186b0 abstractC2186b2, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3) {
            super(context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, i3, false);
        }

        public void clearReplicatedLibraryError() {
            getImpl().clearReplicatedLibraryError();
        }

        public AbstractC2186b0 getSubscribedControllers(String str) {
            return getImpl().getSubscribedControllers(str);
        }

        public void notifyChildrenChanged(MediaSession.ControllerInfo controllerInfo, String str, int i3, LibraryParams libraryParams) {
            AbstractC1864o0.L(i3 >= 0);
            AbstractC1864o0.L(true ^ TextUtils.isEmpty(str));
            MediaLibrarySessionImpl impl = getImpl();
            controllerInfo.getClass();
            impl.notifyChildrenChanged(controllerInfo, str, i3, libraryParams);
        }

        public void notifySearchResultChanged(MediaSession.ControllerInfo controllerInfo, String str, int i3, LibraryParams libraryParams) {
            AbstractC1864o0.L(!TextUtils.isEmpty(str));
            AbstractC1864o0.L(i3 >= 0);
            MediaLibrarySessionImpl impl = getImpl();
            controllerInfo.getClass();
            impl.notifySearchResultChanged(controllerInfo, str, i3, libraryParams);
        }

        @Override
        public MediaLibrarySessionImpl createImpl(Context context, String str, Player player, PendingIntent pendingIntent, AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, AbstractC2186b0 abstractC2186b2, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
            return new MediaLibrarySessionImpl(this, context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, (Callback) callback, bundle, bundle2, bitmapLoader, z6, z9, i3);
        }

        @Override
        public MediaLibrarySessionImpl getImpl() {
            return (MediaLibrarySessionImpl) super.getImpl();
        }

        public void notifyChildrenChanged(String str, int i3, LibraryParams libraryParams) {
            AbstractC1864o0.L(!TextUtils.isEmpty(str));
            AbstractC1864o0.L(i3 >= 0);
            getImpl().notifyChildrenChanged(str, i3, libraryParams);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        return SERVICE_INTERFACE.equals(intent.getAction()) ? getServiceBinder() : super.onBind(intent);
    }

    @Override
    public abstract MediaLibrarySession onGetSession(MediaSession.ControllerInfo controllerInfo);
}
