package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaLibraryService extends androidx.media3.session.MediaSessionService {
    public static final java.lang.String SERVICE_INTERFACE = "androidx.media3.session.MediaLibraryService";

    public static final class LibraryParams {
        public final android.os.Bundle extras;
        public final boolean isOffline;
        public final boolean isRecent;
        public final boolean isSuggested;
        private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_RECENT = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_OFFLINE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_SUGGESTED = androidx.media3.common.util.Util.intToStringMaxRadix(3);

        public static final class Builder {
            private android.os.Bundle extras = android.os.Bundle.EMPTY;
            private boolean offline;
            private boolean recent;
            private boolean suggested;

            public androidx.media3.session.MediaLibraryService.LibraryParams build() {
                return new androidx.media3.session.MediaLibraryService.LibraryParams(this.extras, this.recent, this.offline, this.suggested);
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setExtras(android.os.Bundle bundle) {
                bundle.getClass();
                this.extras = bundle;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setOffline(boolean z6) {
                this.offline = z6;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setRecent(boolean z6) {
                this.recent = z6;
                return this;
            }

            public androidx.media3.session.MediaLibraryService.LibraryParams.Builder setSuggested(boolean z6) {
                this.suggested = z6;
                return this;
            }
        }

        public static androidx.media3.session.MediaLibraryService.LibraryParams fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS));
            boolean z6 = bundle.getBoolean(FIELD_RECENT, false);
            boolean z9 = bundle.getBoolean(FIELD_OFFLINE, false);
            boolean z10 = bundle.getBoolean(FIELD_SUGGESTED, false);
            if (bundleConvertToNullIfInvalid == null) {
                bundleConvertToNullIfInvalid = android.os.Bundle.EMPTY;
            }
            return new androidx.media3.session.MediaLibraryService.LibraryParams(bundleConvertToNullIfInvalid, z6, z9, z10);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(FIELD_EXTRAS, this.extras);
            bundle.putBoolean(FIELD_RECENT, this.isRecent);
            bundle.putBoolean(FIELD_OFFLINE, this.isOffline);
            bundle.putBoolean(FIELD_SUGGESTED, this.isSuggested);
            return bundle;
        }

        private LibraryParams(android.os.Bundle bundle, boolean z6, boolean z9, boolean z10) {
            this.extras = new android.os.Bundle(bundle);
            this.isRecent = z6;
            this.isOffline = z9;
            this.isSuggested = z10;
        }
    }

    public static final class MediaLibrarySession extends androidx.media3.session.MediaSession {
        public static final int LIBRARY_ERROR_REPLICATION_MODE_FATAL = 1;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NONE = 0;
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NON_FATAL = 2;

        public static final class Builder extends androidx.media3.session.MediaSession.BuilderBase<androidx.media3.session.MediaLibraryService.MediaLibrarySession, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback> {
            private boolean buildCalled;
            private int libraryErrorReplicationMode;

            public Builder(androidx.media3.session.MediaLibraryService mediaLibraryService, androidx.media3.common.Player player, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback) {
                this((android.content.Context) mediaLibraryService, player, callback);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCommandButtonsForMediaItems(java.util.List list) {
                return setCommandButtonsForMediaItems((java.util.List<androidx.media3.session.CommandButton>) list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCustomLayout(java.util.List list) {
                return setCustomLayout((java.util.List<androidx.media3.session.CommandButton>) list);
            }

            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setLibraryErrorReplicationMode(int i3) {
                this.libraryErrorReplicationMode = i3;
                return this;
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setMediaButtonPreferences(java.util.List list) {
                return setMediaButtonPreferences((java.util.List<androidx.media3.session.CommandButton>) list);
            }

            public Builder(android.content.Context context, androidx.media3.common.Player player, androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback callback) {
                super(context, player, callback);
                this.libraryErrorReplicationMode = 2;
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession build() {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
                this.buildCalled = true;
                ensureBitmapLoaderIsSizeLimited();
                return new androidx.media3.session.MediaLibraryService.MediaLibrarySession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, this.bitmapLoader, this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, this.libraryErrorReplicationMode);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setBitmapLoader(bitmapLoader);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setCommandButtonsForMediaItems(java.util.List<androidx.media3.session.CommandButton> list) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setCommandButtonsForMediaItems(list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setCustomLayout(list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setExtras(android.os.Bundle bundle) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setExtras(bundle);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setId(java.lang.String str) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setId(str);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setMediaButtonPreferences(list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setPeriodicPositionUpdateEnabled(boolean z6) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setPeriodicPositionUpdateEnabled(z6);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setSessionActivity(android.app.PendingIntent pendingIntent) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setSessionActivity(pendingIntent);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setSessionExtras(android.os.Bundle bundle) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setSessionExtras(bundle);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            public androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
                return (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z6);
            }
        }

        public interface Callback extends androidx.media3.session.MediaSession.Callback {
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            static /* synthetic */ com.google.common.util.concurrent.J lambda$onSubscribe$0(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.LibraryResult libraryResult) {
                V v6;
                java.lang.Boolean bool;
                if (libraryResult.resultCode == 0 && (v6 = libraryResult.value) != 0 && (bool = ((androidx.media3.common.MediaItem) v6).mediaMetadata.isBrowsable) != null && bool.booleanValue()) {
                    if (controllerInfo.getControllerVersion() != 0) {
                        mediaLibrarySession.notifyChildrenChanged(controllerInfo, str, androidx.media3.common.util.Log.LOG_LEVEL_OFF, libraryParams);
                    }
                    return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofVoid());
                }
                int i3 = libraryResult.resultCode;
                if (i3 == 0) {
                    i3 = -3;
                }
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(i3));
            }

            default com.google.common.util.concurrent.J onGetChildren(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetItem(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetLibraryRoot(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onGetSearchResult(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onSearch(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.J onSubscribe(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
                return androidx.media3.common.util.Util.transformFutureAsync(onGetItem(mediaLibrarySession, controllerInfo, str), new androidx.media3.session.C1587k(mediaLibrarySession, controllerInfo, str, libraryParams));
            }

            default com.google.common.util.concurrent.J onUnsubscribe(androidx.media3.session.MediaLibraryService.MediaLibrarySession mediaLibrarySession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str) {
                return com.google.common.util.concurrent.D.z(androidx.media3.session.LibraryResult.ofVoid());
            }
        }

        public MediaLibrarySession(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, p076i4.AbstractC2186b0 abstractC2186b0, p076i4.AbstractC2186b0 abstractC2186b1, p076i4.AbstractC2186b0 abstractC2186b2, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3) {
            super(context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, i3, false);
        }

        public void clearReplicatedLibraryError() {
            getImpl().clearReplicatedLibraryError();
        }

        public p076i4.AbstractC2186b0 getSubscribedControllers(java.lang.String str) {
            return getImpl().getSubscribedControllers(str);
        }

        public void notifyChildrenChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(true ^ android.text.TextUtils.isEmpty(str));
            androidx.media3.session.MediaLibrarySessionImpl impl = getImpl();
            controllerInfo.getClass();
            impl.notifyChildrenChanged(controllerInfo, str, i3, libraryParams);
        }

        public void notifySearchResultChanged(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!android.text.TextUtils.isEmpty(str));
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            androidx.media3.session.MediaLibrarySessionImpl impl = getImpl();
            controllerInfo.getClass();
            impl.notifySearchResultChanged(controllerInfo, str, i3, libraryParams);
        }

        @Override // androidx.media3.session.MediaSession
        public androidx.media3.session.MediaLibrarySessionImpl createImpl(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, p076i4.AbstractC2186b0 abstractC2186b0, p076i4.AbstractC2186b0 abstractC2186b1, p076i4.AbstractC2186b0 abstractC2186b2, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
            return new androidx.media3.session.MediaLibrarySessionImpl(this, context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, (androidx.media3.session.MediaLibraryService.MediaLibrarySession.Callback) callback, bundle, bundle2, bitmapLoader, z6, z9, i3);
        }

        @Override // androidx.media3.session.MediaSession
        public androidx.media3.session.MediaLibrarySessionImpl getImpl() {
            return (androidx.media3.session.MediaLibrarySessionImpl) super.getImpl();
        }

        public void notifyChildrenChanged(java.lang.String str, int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!android.text.TextUtils.isEmpty(str));
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            getImpl().notifyChildrenChanged(str, i3, libraryParams);
        }
    }

    @Override // androidx.media3.session.MediaSessionService, androidx.lifecycle.AbstractServiceC1543z, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return SERVICE_INTERFACE.equals(intent.getAction()) ? getServiceBinder() : super.onBind(intent);
    }

    @Override // androidx.media3.session.MediaSessionService
    public abstract androidx.media3.session.MediaLibraryService.MediaLibrarySession onGetSession(androidx.media3.session.MediaSession.ControllerInfo controllerInfo);
}
