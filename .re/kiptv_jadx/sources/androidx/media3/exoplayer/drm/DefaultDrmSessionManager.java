package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final java.lang.String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final java.lang.String TAG = "DefaultDrmSessionMgr";
    private final androidx.media3.exoplayer.drm.MediaDrmCallback callback;
    private androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm;
    private final androidx.media3.exoplayer.drm.ExoMediaDrm.Provider exoMediaDrmProvider;
    private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> keepaliveSessions;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private androidx.media3.exoplayer.drm.DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private androidx.media3.exoplayer.drm.DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private android.os.Handler playbackHandler;
    private android.os.Looper playbackLooper;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ProvisioningManagerImpl provisioningManagerImpl;
    private final androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final java.util.List<androidx.media3.exoplayer.drm.DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final java.util.UUID uuid;

    public static final class Builder {
        private boolean multiSession;
        private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters = new java.util.HashMap<>();
        private java.util.UUID uuid = androidx.media3.common.C.WIDEVINE_UUID;
        private androidx.media3.exoplayer.drm.ExoMediaDrm.Provider exoMediaDrmProvider = androidx.media3.exoplayer.drm.FrameworkMediaDrm.DEFAULT_PROVIDER;
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        private boolean playClearSamplesWithoutKeys = true;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = new androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy();
        private long sessionKeepaliveMs = 300000;

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager build(androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback) {
            return new androidx.media3.exoplayer.drm.DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setKeyRequestParameters(java.util.Map<java.lang.String, java.lang.String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            loadErrorHandlingPolicy.getClass();
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setMultiSession(boolean z6) {
            this.multiSession = z6;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setPlayClearSamplesWithoutKeys(boolean z6) {
            this.playClearSamplesWithoutKeys = z6;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setSessionKeepaliveMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.sessionKeepaliveMs = j;
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i3 : iArr) {
                boolean z6 = true;
                if (i3 != 2 && i3 != 1) {
                    z6 = false;
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder setUuidAndExoMediaDrmProvider(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.Provider provider) {
            uuid.getClass();
            this.uuid = uuid;
            provider.getClass();
            this.exoMediaDrmProvider = provider;
            return this;
        }
    }

    public class MediaDrmEventListener implements androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener {
        private MediaDrmEventListener() {
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener
        public void onEvent(androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, int i3, int i9, byte[] bArr2) {
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.mediaDrmHandler;
            mediaDrmHandler.getClass();
            mediaDrmHandler.obtainMessage(i3, bArr).sendToTarget();
        }
    }

    public class MediaDrmHandler extends android.os.Handler {
        public MediaDrmHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession : androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    public static final class MissingSchemeDataException extends java.lang.Exception {
        private MissingSchemeDataException(java.util.UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PreacquiredSessionReference implements androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference {
        private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private androidx.media3.exoplayer.drm.DrmSession session;

        public PreacquiredSessionReference(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$acquire$0(androidx.media3.common.Format format) {
            if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager defaultDrmSessionManager = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this;
            android.os.Looper looper = defaultDrmSessionManager.playbackLooper;
            looper.getClass();
            this.session = defaultDrmSessionManager.acquireSession(looper, this.eventDispatcher, format, false);
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$release$1() {
            if (this.isReleased) {
                return;
            }
            androidx.media3.exoplayer.drm.DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }

        public void acquire(androidx.media3.common.Format format) {
            android.os.Handler handler = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler;
            handler.getClass();
            handler.post(new androidx.media3.exoplayer.drm.c(this, format, 0));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            android.os.Handler handler = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler;
            handler.getClass();
            androidx.media3.common.util.Util.postOrRun(handler, new androidx.media3.exoplayer.drm.d(0, this));
        }
    }

    public class ProvisioningManagerImpl implements androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager {
        private androidx.media3.exoplayer.drm.DefaultDrmSession provisioningSession;
        private final java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> sessionsAwaitingProvisioning = new java.util.HashSet();

        public ProvisioningManagerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            p076i4.AbstractC2186b0 abstractC2186b0U = p076i4.AbstractC2186b0.u(this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            p076i4.Z zListIterator = abstractC2186b0U.listIterator(0);
            while (zListIterator.hasNext()) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) zListIterator.next()).onProvisionCompleted();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(java.lang.Exception exc, boolean z6) {
            this.provisioningSession = null;
            p076i4.AbstractC2186b0 abstractC2186b0U = p076i4.AbstractC2186b0.u(this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            p076i4.Z zListIterator = abstractC2186b0U.listIterator(0);
            while (zListIterator.hasNext()) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) zListIterator.next()).onProvisionError(exc, z6);
            }
        }

        public void onSessionFullyReleased(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }
    }

    public class ReferenceCountListenerImpl implements androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener {
        private ReferenceCountListenerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i3) {
            if (i3 == 1 && androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.prepareCallsCount > 0 && androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.add(defaultDrmSession);
                android.os.Handler handler = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler;
                handler.getClass();
                handler.postAtTime(new androidx.media3.exoplayer.drm.d(1, defaultDrmSession), defaultDrmSession, androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs + android.os.SystemClock.uptimeMillis());
            } else if (i3 == 0) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessions.remove(defaultDrmSession);
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.placeholderDrmSession == defaultDrmSession) {
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.placeholderDrmSession = null;
                }
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession == defaultDrmSession) {
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession = null;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                    android.os.Handler handler2 = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(defaultDrmSession);
                    androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.maybeReleaseMediaDrm();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i3) {
            if (androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                android.os.Handler handler = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this.playbackHandler;
                handler.getClass();
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        androidx.media3.exoplayer.drm.DrmSession.DrmSessionException error = drmSession.getError();
        error.getClass();
        java.lang.Throwable cause = error.getCause();
        return (cause instanceof android.media.ResourceBusyException) || androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructResourceBusyException(cause);
    }

    private boolean canAcquireSession(androidx.media3.common.DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.uuid, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(androidx.media3.common.C.COMMON_PSSH_UUID)) {
                return false;
            }
            androidx.media3.common.util.Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        java.lang.String str = drmInitData.schemeType;
        if (str == null || androidx.media3.common.C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (androidx.media3.common.C.CENC_TYPE_cbcs.equals(str)) {
            return android.os.Build.VERSION.SDK_INT >= 25;
        }
        return (androidx.media3.common.C.CENC_TYPE_cbc1.equals(str) || androidx.media3.common.C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private androidx.media3.exoplayer.drm.DefaultDrmSession createAndAcquireSession(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, boolean z6, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.exoMediaDrm.getClass();
        boolean z9 = this.playClearSamplesWithoutKeys | z6;
        java.util.UUID uuid = this.uuid;
        androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ProvisioningManagerImpl provisioningManagerImpl = this.provisioningManagerImpl;
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl referenceCountListenerImpl = this.referenceCountListener;
        int i3 = this.mode;
        byte[] bArr = this.offlineLicenseKeySetId;
        java.util.HashMap<java.lang.String, java.lang.String> map = this.keyRequestParameters;
        androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback = this.callback;
        android.os.Looper looper = this.playbackLooper;
        looper.getClass();
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        androidx.media3.exoplayer.analytics.PlayerId playerId = this.playerId;
        playerId.getClass();
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession = new androidx.media3.exoplayer.drm.DefaultDrmSession(uuid, exoMediaDrm, provisioningManagerImpl, referenceCountListenerImpl, list, i3, z9, z6, bArr, map, mediaDrmCallback, looper, loadErrorHandlingPolicy, playerId);
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    private androidx.media3.exoplayer.drm.DefaultDrmSession createAndAcquireSessionWithRetry(java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, boolean z6, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z9) {
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z6, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
            defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z6, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) || !z9 || this.preacquiredSessionReferences.isEmpty()) {
            return defaultDrmSessionCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z6, eventDispatcher);
    }

    private static java.util.List<androidx.media3.common.DrmInitData.SchemeData> getSchemeDatas(androidx.media3.common.DrmInitData drmInitData, java.util.UUID uuid, boolean z6) {
        java.util.ArrayList arrayList = new java.util.ArrayList(drmInitData.schemeDataCount);
        for (int i3 = 0; i3 < drmInitData.schemeDataCount; i3++) {
            androidx.media3.common.DrmInitData.SchemeData schemeData = drmInitData.get(i3);
            if ((schemeData.matches(uuid) || (androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(androidx.media3.common.C.COMMON_PSSH_UUID))) && (schemeData.data != null || z6)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(android.os.Looper looper) {
        try {
            android.os.Looper looper2 = this.playbackLooper;
            if (looper2 == null) {
                this.playbackLooper = looper;
                this.playbackHandler = new android.os.Handler(looper);
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(looper2 == looper);
                this.playbackHandler.getClass();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private androidx.media3.exoplayer.drm.DrmSession maybeAcquirePlaceholderSession(int i3, boolean z6) {
        androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        exoMediaDrm.getClass();
        if ((exoMediaDrm.getCryptoType() == 2 && androidx.media3.exoplayer.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || androidx.media3.common.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, i3) == -1 || exoMediaDrm.getCryptoType() == 1) {
            return null;
        }
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
        if (defaultDrmSession == null) {
            p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
            androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(p076i4.S0.f22832l, true, null, z6);
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            this.placeholderDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.placeholderDrmSession;
    }

    private void maybeCreateMediaDrmHandler(android.os.Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmHandler(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.exoMediaDrm = null;
        }
    }

    private void releaseAllKeepaliveSessions() {
        p076i4.j1 it = p076i4.AbstractC2214p0.t(this.keepaliveSessions).iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.drm.DrmSession) it.next()).release(null);
        }
    }

    private void releaseAllPreacquiredSessions() {
        p076i4.j1 it = p076i4.AbstractC2214p0.t(this.preacquiredSessionReferences).iterator();
        while (it.hasNext()) {
            ((androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference) it.next()).release();
        }
    }

    private void undoAcquisition(androidx.media3.exoplayer.drm.DrmSession drmSession, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            drmSession.release(null);
        }
    }

    private void verifyPlaybackThread(boolean z6) {
        if (z6 && this.playbackLooper == null) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new java.lang.IllegalStateException());
            return;
        }
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        android.os.Looper looper = this.playbackLooper;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public androidx.media3.exoplayer.drm.DrmSession acquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        verifyPlaybackThread(false);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.prepareCallsCount > 0);
        this.playbackLooper.getClass();
        return acquireSession(this.playbackLooper, eventDispatcher, format, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(androidx.media3.common.Format format) {
        verifyPlaybackThread(false);
        androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        exoMediaDrm.getClass();
        int cryptoType = exoMediaDrm.getCryptoType();
        androidx.media3.common.DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            if (androidx.media3.common.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType)) == -1) {
                return 0;
            }
        } else if (!canAcquireSession(drmInitData)) {
            return 1;
        }
        return cryptoType;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference preacquireSession(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.prepareCallsCount > 0);
        this.playbackLooper.getClass();
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.PreacquiredSessionReference(eventDispatcher);
        preacquiredSessionReference.acquire(format);
        return preacquiredSessionReference;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void prepare() {
        verifyPlaybackThread(true);
        int i3 = this.prepareCallsCount;
        this.prepareCallsCount = i3 + 1;
        if (i3 != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            for (int i9 = 0; i9 < this.sessions.size(); i9++) {
                this.sessions.get(i9).acquire(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        verifyPlaybackThread(true);
        int i3 = this.prepareCallsCount - 1;
        this.prepareCallsCount = i3;
        if (i3 != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != androidx.media3.common.C.TIME_UNSET) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.sessions);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((androidx.media3.exoplayer.drm.DefaultDrmSession) arrayList.get(i9)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    public void setMode(int i3, byte[] bArr) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.sessions.isEmpty());
        if (i3 == 1 || i3 == 3) {
            bArr.getClass();
        }
        this.mode = i3;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(android.os.Looper looper, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    private DefaultDrmSessionManager(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.Provider provider, androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> map, boolean z6, int[] iArr, boolean z9, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        uuid.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!androidx.media3.common.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = map;
        this.multiSession = z6;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z9;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ProvisioningManagerImpl();
        this.referenceCountListener = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new java.util.ArrayList();
        this.preacquiredSessionReferences = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        this.keepaliveSessions = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        this.sessionKeepaliveMs = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public androidx.media3.exoplayer.drm.DrmSession acquireSession(android.os.Looper looper, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, androidx.media3.common.Format format, boolean z6) {
        java.util.List<androidx.media3.common.DrmInitData.SchemeData> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        androidx.media3.common.DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return maybeAcquirePlaceholderSession(androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType), z6);
        }
        androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession = null;
        java.lang.Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            drmInitData.getClass();
            schemeDatas = getSchemeDatas(drmInitData, this.uuid, false);
            if (schemeDatas.isEmpty()) {
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException missingSchemeDataException = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException(this.uuid);
                androidx.media3.common.util.Log.e(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new androidx.media3.exoplayer.drm.ErrorStateDrmSession(new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(missingSchemeDataException, androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            schemeDatas = null;
        }
        if (!this.multiSession) {
            defaultDrmSession = this.noMultiSessionDrmSession;
        } else {
            for (androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession2 : this.sessions) {
                if (java.util.Objects.equals(defaultDrmSession2.schemeDatas, schemeDatas)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, eventDispatcher, z6);
            if (!this.multiSession) {
                this.noMultiSessionDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
            }
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            return defaultDrmSessionCreateAndAcquireSessionWithRetry;
        }
        defaultDrmSession.acquire(eventDispatcher);
        return defaultDrmSession;
    }
}
