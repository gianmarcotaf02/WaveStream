package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements androidx.media3.exoplayer.drm.DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 2;
    private static final int MSG_PROVISION = 1;
    private static final java.lang.String TAG = "DefaultDrmSession";
    private final androidx.media3.exoplayer.drm.MediaDrmCallback callback;
    private androidx.media3.decoder.CryptoConfig cryptoConfig;
    private androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest currentKeyRequest;
    private androidx.media3.exoplayer.drm.KeyRequestInfo.Builder currentKeyRequestInfo;
    private androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final androidx.media3.common.util.CopyOnWriteMultiset<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final java.lang.Object keyRequestInfoLock;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private androidx.media3.exoplayer.drm.DrmSession.DrmSessionException lastException;
    private final androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final androidx.media3.exoplayer.drm.ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final android.os.Looper playbackLooper;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager provisioningManager;
    private int referenceCount;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener referenceCountListener;
    private androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler requestHandler;
    private android.os.HandlerThread requestHandlerThread;
    private final androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler responseHandler;
    public final java.util.List<androidx.media3.common.DrmInitData.SchemeData> schemeDatas;
    private byte[] sessionId;
    private int state;
    private final java.util.UUID uuid;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(java.lang.Exception exc, boolean z6);

        void provisionRequired(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i3);

        void onReferenceCountIncremented(androidx.media3.exoplayer.drm.DefaultDrmSession defaultDrmSession, int i3);
    }

    public class RequestHandler extends android.os.Handler {
        private boolean isReleased;

        public RequestHandler(android.os.Looper looper) {
            super(looper);
        }

        private boolean maybeRetryRequest(android.os.Message message, androidx.media3.exoplayer.drm.MediaDrmCallbackException mediaDrmCallbackException) {
            androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask requestTask = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask) message.obj;
            if (!requestTask.allowRetry) {
                return false;
            }
            int i3 = requestTask.errorCount + 1;
            requestTask.errorCount = i3;
            if (i3 > androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo = new androidx.media3.exoplayer.source.LoadEventInfo(requestTask.taskId, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.elapsedRealtime() - requestTask.startTimeMs, mediaDrmCallbackException.bytesLoaded);
            long retryDelayMsFor = androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.getRetryDelayMsFor(new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(3), mediaDrmCallbackException.getCause() instanceof java.io.IOException ? (java.io.IOException) mediaDrmCallbackException.getCause() : new androidx.media3.exoplayer.drm.DefaultDrmSession.UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), requestTask.errorCount));
            if (retryDelayMsFor == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
            synchronized (androidx.media3.exoplayer.drm.DefaultDrmSession.this.keyRequestInfoLock) {
                try {
                    if (androidx.media3.exoplayer.drm.DefaultDrmSession.this.currentKeyRequestInfo != null) {
                        androidx.media3.exoplayer.drm.DefaultDrmSession.this.currentKeyRequestInfo.addLoadInfo(loadEventInfo);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            synchronized (this) {
                try {
                    if (this.isReleased) {
                        return false;
                    }
                    sendMessageDelayed(android.os.Message.obtain(message), retryDelayMsFor);
                    return true;
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object objExecuteProvisionRequest;
            androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask requestTask = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask) message.obj;
            try {
                int i3 = message.what;
                if (i3 == 1) {
                    objExecuteProvisionRequest = androidx.media3.exoplayer.drm.DefaultDrmSession.this.callback.executeProvisionRequest(androidx.media3.exoplayer.drm.DefaultDrmSession.this.uuid, (androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest) requestTask.request);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.RuntimeException();
                    }
                    androidx.media3.exoplayer.drm.MediaDrmCallback.Response responseExecuteKeyRequest = androidx.media3.exoplayer.drm.DefaultDrmSession.this.callback.executeKeyRequest(androidx.media3.exoplayer.drm.DefaultDrmSession.this.uuid, (androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest) requestTask.request);
                    synchronized (androidx.media3.exoplayer.drm.DefaultDrmSession.this.keyRequestInfoLock) {
                        try {
                            if (androidx.media3.exoplayer.drm.DefaultDrmSession.this.currentKeyRequestInfo != null && responseExecuteKeyRequest.loadEventInfo != null) {
                                androidx.media3.exoplayer.drm.DefaultDrmSession.this.currentKeyRequestInfo.addLoadInfo(responseExecuteKeyRequest.loadEventInfo.copyWithTaskIdAndDurationMs(requestTask.taskId, android.os.SystemClock.elapsedRealtime() - requestTask.startTimeMs));
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    objExecuteProvisionRequest = responseExecuteKeyRequest;
                }
            } catch (androidx.media3.exoplayer.drm.MediaDrmCallbackException e6) {
                boolean zMaybeRetryRequest = maybeRetryRequest(message, e6);
                objExecuteProvisionRequest = e6;
                if (zMaybeRetryRequest) {
                    return;
                }
            } catch (java.lang.Exception e9) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.drm.DefaultDrmSession.TAG, "Key/provisioning request produced an unexpected exception. Not retrying.", e9);
                objExecuteProvisionRequest = e9;
            }
            androidx.media3.exoplayer.drm.DefaultDrmSession.this.loadErrorHandlingPolicy.onLoadTaskConcluded(requestTask.taskId);
            synchronized (this) {
                try {
                    if (!this.isReleased) {
                        androidx.media3.exoplayer.drm.DefaultDrmSession.this.responseHandler.obtainMessage(message.what, android.util.Pair.create(requestTask.request, objExecuteProvisionRequest)).sendToTarget();
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }

        public void post(int i3, java.lang.Object obj, boolean z6) {
            obtainMessage(i3, new androidx.media3.exoplayer.drm.DefaultDrmSession.RequestTask(androidx.media3.exoplayer.source.LoadEventInfo.getNewId(), z6, android.os.SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.isReleased = true;
        }
    }

    public static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final java.lang.Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long j, boolean z6, long j9, java.lang.Object obj) {
            this.taskId = j;
            this.allowRetry = z6;
            this.startTimeMs = j9;
            this.request = obj;
        }
    }

    public class ResponseHandler extends android.os.Handler {
        public ResponseHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            android.util.Pair pair = (android.util.Pair) message.obj;
            java.lang.Object obj = pair.first;
            java.lang.Object obj2 = pair.second;
            int i3 = message.what;
            if (i3 == 1) {
                androidx.media3.exoplayer.drm.DefaultDrmSession.this.onProvisionResponse(obj, obj2);
            } else {
                if (i3 != 2) {
                    return;
                }
                androidx.media3.exoplayer.drm.DefaultDrmSession.this.onKeyResponse(obj, obj2);
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends java.io.IOException {
        public UnexpectedDrmSessionException(java.lang.Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm, androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager provisioningManager, androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener referenceCountListener, java.util.List<androidx.media3.common.DrmInitData.SchemeData> list, int i3, boolean z6, boolean z9, byte[] bArr, java.util.HashMap<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.drm.MediaDrmCallback mediaDrmCallback, android.os.Looper looper, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (i3 == 1 || i3 == 3) {
            bArr.getClass();
        }
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.referenceCountListener = referenceCountListener;
        this.mediaDrm = exoMediaDrm;
        this.mode = i3;
        this.playClearSamplesWithoutKeys = z6;
        this.isPlaceholderSession = z9;
        if (bArr != null) {
            this.offlineLicenseKeySetId = bArr;
            this.schemeDatas = null;
        } else {
            list.getClass();
            this.schemeDatas = java.util.Collections.unmodifiableList(list);
        }
        this.keyRequestParameters = map;
        this.callback = mediaDrmCallback;
        this.eventDispatchers = new androidx.media3.common.util.CopyOnWriteMultiset<>();
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playerId = playerId;
        this.state = 2;
        this.playbackLooper = looper;
        this.responseHandler = new androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler(looper);
        this.keyRequestInfoLock = new java.lang.Object();
    }

    private void dispatchEvent(androidx.media3.common.util.Consumer<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> consumer) {
        java.util.Iterator<androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher> it = this.eventDispatchers.elementSet().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    private void doLicense(boolean z6) {
        if (this.isPlaceholderSession) {
            return;
        }
        byte[] bArr = (byte[]) androidx.media3.common.util.Util.castNonNull(this.sessionId);
        int i3 = this.mode;
        if (i3 != 0 && i3 != 1) {
            if (i3 == 2) {
                if (this.offlineLicenseKeySetId == null || restoreKeys()) {
                    postKeyRequest(bArr, 2, z6);
                    return;
                }
                return;
            }
            if (i3 != 3) {
                return;
            }
            this.offlineLicenseKeySetId.getClass();
            this.sessionId.getClass();
            postKeyRequest(this.offlineLicenseKeySetId, 3, z6);
            return;
        }
        if (this.offlineLicenseKeySetId == null) {
            postKeyRequest(bArr, 1, z6);
            return;
        }
        if (this.state == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode == 0 && licenseDurationRemainingSec <= 60) {
                androidx.media3.common.util.Log.d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
                postKeyRequest(bArr, 2, z6);
                return;
            }
            if (licenseDurationRemainingSec <= 0) {
                onError(new androidx.media3.exoplayer.drm.KeysExpiredException(), 2);
            } else {
                this.state = 4;
                dispatchEvent(new androidx.media3.exoplayer.drm.a(2));
            }
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (!androidx.media3.common.C.WIDEVINE_UUID.equals(this.uuid)) {
            return Long.MAX_VALUE;
        }
        android.util.Pair<java.lang.Long, java.lang.Long> licenseDurationRemainingSec = androidx.media3.exoplayer.drm.WidevineUtil.getLicenseDurationRemainingSec(this);
        licenseDurationRemainingSec.getClass();
        return java.lang.Math.min(((java.lang.Long) licenseDurationRemainingSec.first).longValue(), ((java.lang.Long) licenseDurationRemainingSec.second).longValue());
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
        int i3 = this.state;
        return i3 == 3 || i3 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onError$2(java.lang.Throwable th, androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        eventDispatcher.drmSessionManagerError((java.lang.Exception) th);
    }

    private void onError(java.lang.Throwable th, int i3) {
        this.lastException = new androidx.media3.exoplayer.drm.DrmSession.DrmSessionException(th, androidx.media3.exoplayer.drm.DrmUtil.getErrorCodeForMediaDrmException(th, i3));
        androidx.media3.common.util.Log.e(TAG, "DRM session error", th);
        if (th instanceof java.lang.Exception) {
            dispatchEvent(new androidx.media3.exoplayer.drm.b(1, (java.lang.Exception) th));
        } else {
            if (!(th instanceof java.lang.Error)) {
                throw new java.lang.IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructResourceBusyException(th) && !androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(th)) {
                throw ((java.lang.Error) th);
            }
        }
        if (this.state != 4) {
            this.state = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(java.lang.Object obj, java.lang.Object obj2) {
        androidx.media3.exoplayer.drm.KeyRequestInfo keyRequestInfoBuild;
        if (obj == this.currentKeyRequest && isOpen()) {
            this.currentKeyRequest = null;
            synchronized (this.keyRequestInfoLock) {
                androidx.media3.exoplayer.drm.KeyRequestInfo.Builder builder = this.currentKeyRequestInfo;
                builder.getClass();
                keyRequestInfoBuild = builder.build();
                this.currentKeyRequestInfo = null;
            }
            if ((obj2 instanceof java.lang.Exception) || (obj2 instanceof java.lang.NoSuchMethodError)) {
                onKeysError((java.lang.Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((androidx.media3.exoplayer.drm.MediaDrmCallback.Response) obj2).data;
                if (this.mode == 3) {
                    this.mediaDrm.provideKeyResponse((byte[]) androidx.media3.common.util.Util.castNonNull(this.offlineLicenseKeySetId), bArr);
                    dispatchEvent(new androidx.media3.exoplayer.drm.a(1));
                    return;
                }
                byte[] bArrProvideKeyResponse = this.mediaDrm.provideKeyResponse(this.sessionId, bArr);
                int i3 = this.mode;
                if ((i3 == 2 || (i3 == 0 && this.offlineLicenseKeySetId != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.offlineLicenseKeySetId = bArrProvideKeyResponse;
                }
                this.state = 4;
                dispatchEvent(new androidx.media3.exoplayer.drm.b(0, keyRequestInfoBuild));
            } catch (java.lang.Exception e6) {
                e = e6;
                onKeysError(e, true);
            } catch (java.lang.NoSuchMethodError e9) {
                e = e9;
                onKeysError(e, true);
            }
        }
    }

    private void onKeysError(java.lang.Throwable th, boolean z6) {
        if ((th instanceof android.media.NotProvisionedException) || androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(th)) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(th, z6 ? 1 : 2);
        }
    }

    private void onKeysRequired() {
        if (this.mode == 0 && this.state == 4) {
            androidx.media3.common.util.Util.castNonNull(this.sessionId);
            doLicense(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == this.currentProvisionRequest) {
            if (this.state == 2 || isOpen()) {
                this.currentProvisionRequest = null;
                if (obj2 instanceof java.lang.Exception) {
                    this.provisioningManager.onProvisionError((java.lang.Exception) obj2, false);
                    return;
                }
                try {
                    this.mediaDrm.provideProvisionResponse(((androidx.media3.exoplayer.drm.MediaDrmCallback.Response) obj2).data);
                    this.provisioningManager.onProvisionCompleted();
                } catch (java.lang.Exception e6) {
                    this.provisioningManager.onProvisionError(e6, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean openInternal() {
        if (isOpen()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.mediaDrm.openSession();
            this.sessionId = bArrOpenSession;
            this.mediaDrm.setPlayerIdForSession(bArrOpenSession, this.playerId);
            this.cryptoConfig = this.mediaDrm.createCryptoConfig(this.sessionId);
            this.state = 3;
            dispatchEvent(new androidx.media3.exoplayer.drm.a(0));
            this.sessionId.getClass();
            return true;
        } catch (android.media.NotProvisionedException unused) {
            this.provisioningManager.provisionRequired(this);
            return false;
        } catch (java.lang.Exception e6) {
            e = e6;
            if (androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(e)) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e, 1);
            return false;
        } catch (java.lang.NoSuchMethodError e9) {
            e = e9;
            if (androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(e)) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e, 1);
            return false;
        }
    }

    private void postKeyRequest(byte[] bArr, int i3, boolean z6) {
        try {
            synchronized (this.keyRequestInfoLock) {
                try {
                    androidx.media3.exoplayer.drm.KeyRequestInfo.Builder builder = new androidx.media3.exoplayer.drm.KeyRequestInfo.Builder();
                    this.currentKeyRequestInfo = builder;
                    java.util.List<androidx.media3.common.DrmInitData.SchemeData> list = this.schemeDatas;
                    if (list != null) {
                        builder.setSchemeDatas(list);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.currentKeyRequest = this.mediaDrm.getKeyRequest(bArr, this.schemeDatas, i3, this.keyRequestParameters);
            androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler requestHandler = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler);
            androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest = this.currentKeyRequest;
            keyRequest.getClass();
            requestHandler.post(2, keyRequest, z6);
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e6) {
            onKeysError(e6, true);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e6) {
            onError(e6, 1);
            return false;
        }
    }

    private void verifyPlaybackThread() {
        if (java.lang.Thread.currentThread() != this.playbackLooper.getThread()) {
            androidx.media3.common.util.Log.w(TAG, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void acquire(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        if (this.referenceCount < 0) {
            androidx.media3.common.util.Log.e(TAG, "Session reference count less than zero: " + this.referenceCount);
            this.referenceCount = 0;
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.add(eventDispatcher);
        }
        int i3 = this.referenceCount + 1;
        this.referenceCount = i3;
        if (i3 == 1) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 2);
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DrmRequestHandler");
            this.requestHandlerThread = handlerThread;
            handlerThread.start();
            this.requestHandler = new androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler(this.requestHandlerThread.getLooper());
            if (openInternal()) {
                doLicense(true);
            }
        } else if (eventDispatcher != null && isOpen() && this.eventDispatchers.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.state);
        }
        this.referenceCountListener.onReferenceCountIncremented(this, this.referenceCount);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final androidx.media3.decoder.CryptoConfig getCryptoConfig() {
        verifyPlaybackThread();
        return this.cryptoConfig;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final androidx.media3.exoplayer.drm.DrmSession.DrmSessionException getError() {
        verifyPlaybackThread();
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        verifyPlaybackThread();
        return this.offlineLicenseKeySetId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
        verifyPlaybackThread();
        return this.uuid;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        verifyPlaybackThread();
        return this.state;
    }

    public boolean hasSessionId(byte[] bArr) {
        verifyPlaybackThread();
        return java.util.Arrays.equals(this.sessionId, bArr);
    }

    public void onMediaDrmEvent(int i3) {
        if (i3 != 2) {
            return;
        }
        onKeysRequired();
    }

    public void onProvisionCompleted() {
        if (openInternal()) {
            doLicense(true);
        }
    }

    public void onProvisionError(java.lang.Exception exc, boolean z6) {
        onError(exc, z6 ? 1 : 3);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        verifyPlaybackThread();
        return this.playClearSamplesWithoutKeys;
    }

    public void provision() {
        this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
        androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler requestHandler = (androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler);
        androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest = this.currentProvisionRequest;
        provisionRequest.getClass();
        requestHandler.post(1, provisionRequest, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
        verifyPlaybackThread();
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void release(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        int i3 = this.referenceCount;
        if (i3 <= 0) {
            androidx.media3.common.util.Log.e(TAG, "release() called on a session that's already fully released.");
            return;
        }
        int i9 = i3 - 1;
        this.referenceCount = i9;
        if (i9 == 0) {
            this.state = 0;
            ((androidx.media3.exoplayer.drm.DefaultDrmSession.ResponseHandler) androidx.media3.common.util.Util.castNonNull(this.responseHandler)).removeCallbacksAndMessages(null);
            ((androidx.media3.exoplayer.drm.DefaultDrmSession.RequestHandler) androidx.media3.common.util.Util.castNonNull(this.requestHandler)).release();
            this.requestHandler = null;
            ((android.os.HandlerThread) androidx.media3.common.util.Util.castNonNull(this.requestHandlerThread)).quit();
            this.requestHandlerThread = null;
            this.cryptoConfig = null;
            this.lastException = null;
            this.currentKeyRequest = null;
            synchronized (this.keyRequestInfoLock) {
                this.currentKeyRequestInfo = null;
            }
            this.currentProvisionRequest = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
            }
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.remove(eventDispatcher);
            if (this.eventDispatchers.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.referenceCountListener.onReferenceCountDecremented(this, this.referenceCount);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String str) {
        verifyPlaybackThread();
        androidx.media3.exoplayer.drm.ExoMediaDrm exoMediaDrm = this.mediaDrm;
        byte[] bArr = this.sessionId;
        bArr.getClass();
        return exoMediaDrm.requiresSecureDecoder(bArr, str);
    }
}
