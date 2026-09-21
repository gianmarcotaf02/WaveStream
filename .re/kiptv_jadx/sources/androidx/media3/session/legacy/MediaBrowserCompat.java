package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final java.lang.String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final java.lang.String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final java.lang.String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    static final java.lang.String TAG = "MediaBrowserCompat";
    private final androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl impl;

    public static class CallbackHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl> callbackImplRef;
        private java.lang.ref.WeakReference<android.os.Messenger> callbacksMessengerRef;

        public CallbackHandler(androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.callbackImplRef = new java.lang.ref.WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.ref.WeakReference<android.os.Messenger> weakReference = this.callbacksMessengerRef;
            if (weakReference == null) {
                return;
            }
            android.os.Messenger messenger = weakReference.get();
            androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.callbackImplRef.get();
            if (messenger == null || mediaBrowserServiceCallbackImpl == null) {
                return;
            }
            android.os.Bundle data = message.getData();
            androidx.media3.session.legacy.MediaSessionCompat.ensureClassLoader(data);
            try {
                if (message.what == 3) {
                    mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), androidx.media3.session.legacy.LegacyParcelableUtil.convertList(data.getParcelableArrayList(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.CREATOR), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_OPTIONS)), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS)));
                } else {
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                }
            } catch (android.os.BadParcelableException unused) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Could not unparcel the data.");
            }
        }

        public void setCallbacksMessenger(android.os.Messenger messenger) {
            this.callbacksMessengerRef = new java.lang.ref.WeakReference<>(messenger);
        }
    }

    public static class ConnectionCallback {
        final android.media.browse.MediaBrowser.ConnectionCallback connectionCallbackFwk = new androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackImpl();
        androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal connectionCallbackInternal;

        public class ConnectionCallbackImpl extends android.media.browse.MediaBrowser.ConnectionCallback {
            public ConnectionCallbackImpl() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal connectionCallbackInternal = androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal connectionCallbackInternal = androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal connectionCallbackInternal = androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.this.onConnectionSuspended();
            }
        }

        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal connectionCallbackInternal) {
            this.connectionCallbackInternal = connectionCallbackInternal;
        }
    }

    public static abstract class CustomActionCallback {
        public void onError(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        public void onProgressUpdate(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        public void onResult(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }
    }

    public static class CustomActionResultReceiver extends android.support.v4.os.e {
        private final java.lang.String action;
        private final androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback callback;
        private final android.os.Bundle extras;

        public CustomActionResultReceiver(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback customActionCallback, android.os.Handler handler) {
            super(handler);
            this.action = str;
            this.extras = bundle;
            this.callback = customActionCallback;
        }

        @Override // android.support.v4.os.e
        public void onReceiveResult(int i3, android.os.Bundle bundle) {
            if (this.callback == null) {
                return;
            }
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
            if (i3 == -1) {
                this.callback.onError(this.action, this.extras, bundleConvertToNullIfInvalid);
                return;
            }
            if (i3 == 0) {
                this.callback.onResult(this.action, this.extras, bundleConvertToNullIfInvalid);
                return;
            }
            if (i3 != 1) {
                java.lang.StringBuilder sbT = p121o0.p.t(i3, "Unknown result code: ", " (extras=");
                sbT.append(this.extras);
                sbT.append(", resultData=");
                sbT.append(bundleConvertToNullIfInvalid);
                sbT.append(")");
                androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserCompat.TAG, sbT.toString());
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback customActionCallback = this.callback;
            java.lang.String str = this.action;
            android.os.Bundle bundle2 = this.extras;
            if (bundle2 == null) {
                bundle2 = android.os.Bundle.EMPTY;
            }
            if (bundleConvertToNullIfInvalid == null) {
                bundleConvertToNullIfInvalid = android.os.Bundle.EMPTY;
            }
            customActionCallback.onProgressUpdate(str, bundle2, bundleConvertToNullIfInvalid);
        }
    }

    public static abstract class ItemCallback {
        final android.media.browse.MediaBrowser.ItemCallback itemCallbackFwk = new androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback.ItemCallbackImpl();

        public class ItemCallbackImpl extends android.media.browse.MediaBrowser.ItemCallback {
            public ItemCallbackImpl() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(java.lang.String str) {
                androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback.this.onError(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem mediaItem) {
                androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback.this.onItemLoaded(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.fromMediaItem(mediaItem));
            }
        }

        public void onError(java.lang.String str) {
        }

        public void onItemLoaded(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem) {
        }
    }

    public static class ItemReceiver extends android.support.v4.os.e {
        private final androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback callback;
        private final java.lang.String mediaId;

        public ItemReceiver(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback itemCallback, android.os.Handler handler) {
            super(handler);
            this.mediaId = str;
            this.callback = itemCallback;
        }

        @Override // android.support.v4.os.e
        public void onReceiveResult(int i3, android.os.Bundle bundle) {
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
            if (i3 != 0 || bundleConvertToNullIfInvalid == null || !bundleConvertToNullIfInvalid.containsKey(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.callback.onError(this.mediaId);
            } else {
                this.callback.onItemLoaded((androidx.media3.session.legacy.MediaBrowserCompat.MediaItem) androidx.media3.session.legacy.LegacyParcelableUtil.convert(bundleConvertToNullIfInvalid.getParcelable(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_MEDIA_ITEM), androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.CREATOR));
            }
        }
    }

    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        android.os.Bundle getExtras();

        void getItem(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback itemCallback);

        android.os.Bundle getNotifyChildrenChangedOptions();

        java.lang.String getRoot();

        androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback searchCallback);

        void sendCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback customActionCallback);

        void subscribe(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback);

        void unsubscribe(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback);
    }

    public static class MediaBrowserImplApi23 implements androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl, androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl, androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal {
        protected final android.media.browse.MediaBrowser browserFwk;
        protected android.os.Messenger callbacksMessenger;
        final android.content.Context context;
        private androidx.media3.session.legacy.MediaSessionCompat.Token mediaSessionToken;
        private android.os.Bundle notifyChildrenChangedOptions;
        protected final android.os.Bundle rootHints;
        protected androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper;
        protected int serviceVersion;
        protected final androidx.media3.session.legacy.MediaBrowserCompat.CallbackHandler handler = new androidx.media3.session.legacy.MediaBrowserCompat.CallbackHandler(this);
        private final p136q.C2661e subscriptions = new p136q.C2661e(0);

        public MediaBrowserImplApi23(android.content.Context context, android.content.ComponentName componentName, androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback connectionCallback, android.os.Bundle bundle) {
            this.context = context;
            android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
            this.rootHints = bundle2;
            bundle2.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bundle2.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CALLING_PID, android.os.Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            android.media.browse.MediaBrowser.ConnectionCallback connectionCallback2 = connectionCallback.connectionCallbackFwk;
            connectionCallback2.getClass();
            this.browserFwk = new android.media.browse.MediaBrowser(context, componentName, connectionCallback2, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            this.browserFwk.connect();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            android.os.Messenger messenger;
            androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper != null && (messenger = this.callbacksMessenger) != null) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (android.os.RemoteException unused) {
                    androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error unregistering client messenger.");
                }
            }
            this.browserFwk.disconnect();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getExtras() {
            return androidx.media3.common.util.Util.convertToNullIfInvalid(this.browserFwk.getExtras());
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final java.lang.String str, final androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback itemCallback) {
            if (this.serviceBinderWrapper == null) {
                this.browserFwk.getItem(str, itemCallback.itemCallbackFwk);
                return;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException("mediaId is empty");
            }
            if (!this.browserFwk.isConnected()) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            if (this.serviceBinderWrapper == null) {
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.2
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.ItemReceiver itemReceiver = new androidx.media3.session.legacy.MediaBrowserCompat.ItemReceiver(str, itemCallback, this.handler);
            try {
                androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
                android.os.Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.getMediaItem(str, itemReceiver, messenger);
            } catch (android.os.RemoteException unused) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getNotifyChildrenChangedOptions() {
            return this.notifyChildrenChangedOptions;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public java.lang.String getRoot() {
            return this.browserFwk.getRoot();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
            if (this.mediaSessionToken == null) {
                this.mediaSessionToken = androidx.media3.session.legacy.MediaSessionCompat.Token.fromToken(this.browserFwk.getSessionToken());
            }
            return this.mediaSessionToken;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.browserFwk.isConnected();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            try {
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(this.browserFwk.getExtras());
                if (bundleConvertToNullIfInvalid == null) {
                    return;
                }
                this.serviceVersion = bundleConvertToNullIfInvalid.getInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                android.os.IBinder binder = bundleConvertToNullIfInvalid.getBinder(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = new androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper(binder, this.rootHints);
                    this.serviceBinderWrapper = serviceBinderWrapper;
                    android.os.Messenger messenger = new android.os.Messenger(this.handler);
                    this.callbacksMessenger = messenger;
                    this.handler.setCallbacksMessenger(messenger);
                    try {
                        serviceBinderWrapper.registerCallbackMessenger(this.context, messenger);
                    } catch (android.os.RemoteException unused) {
                        androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error registering client messenger.");
                    }
                }
                androidx.media3.session.legacy.IMediaSession iMediaSessionAsInterface = androidx.media3.session.legacy.IMediaSession.Stub.asInterface(bundleConvertToNullIfInvalid.getBinder(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (iMediaSessionAsInterface != null) {
                    this.mediaSessionToken = androidx.media3.session.legacy.MediaSessionCompat.Token.fromToken(this.browserFwk.getSessionToken(), iMediaSessionAsInterface);
                }
            } catch (java.lang.IllegalStateException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Unexpected IllegalStateException", e6);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.serviceBinderWrapper = null;
            this.callbacksMessenger = null;
            this.mediaSessionToken = null;
            this.handler.setCallbacksMessenger(null);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(android.os.Messenger messenger, java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2) {
            if (this.callbacksMessenger != messenger) {
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.Subscription subscription = str == null ? null : (androidx.media3.session.legacy.MediaBrowserCompat.Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                androidx.media3.common.util.Log.d(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "onLoadChildren for id that isn't subscribed id=" + str);
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback callback = subscription.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.notifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.notifyChildrenChangedOptions = null;
                    return;
                }
                if (list == null) {
                    callback.onError(str, bundle);
                    return;
                }
                this.notifyChildrenChangedOptions = bundle2;
                callback.onChildrenLoaded(str, list, bundle);
                this.notifyChildrenChangedOptions = null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void search(final java.lang.String str, final android.os.Bundle bundle, final androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new java.lang.IllegalStateException("search() called while not connected");
            }
            if (this.serviceBinderWrapper == null) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "The connected service doesn't support search.");
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.4
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.SearchResultReceiver searchResultReceiver = new androidx.media3.session.legacy.MediaBrowserCompat.SearchResultReceiver(str, bundle, searchCallback, this.handler);
            try {
                androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
                android.os.Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.search(str, bundle, searchResultReceiver, messenger);
            } catch (android.os.RemoteException e6) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e6);
                this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.5
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(final java.lang.String str, final android.os.Bundle bundle, final androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new java.lang.IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper == null) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "The connected service doesn't support sendCustomAction.");
                if (customActionCallback != null) {
                    this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.6
                        @Override // java.lang.Runnable
                        public void run() {
                            customActionCallback.onError(str, bundle, null);
                        }
                    });
                    return;
                }
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = new androidx.media3.session.legacy.MediaBrowserCompat.CustomActionResultReceiver(str, bundle, customActionCallback, this.handler);
            try {
                android.os.Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.sendCustomAction(str, bundle, customActionResultReceiver, messenger);
            } catch (android.os.RemoteException e6) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e6);
                if (customActionCallback != null) {
                    this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.7
                        @Override // java.lang.Runnable
                        public void run() {
                            customActionCallback.onError(str, bundle, null);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
            androidx.media3.session.legacy.MediaBrowserCompat.Subscription subscription = (androidx.media3.session.legacy.MediaBrowserCompat.Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                subscription = new androidx.media3.session.legacy.MediaBrowserCompat.Subscription();
                this.subscriptions.put(str, subscription);
            }
            subscriptionCallback.setSubscription(subscription);
            android.os.Bundle bundle2 = bundle == null ? null : new android.os.Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper == null) {
                this.browserFwk.subscribe(str, subscriptionCallback.subscriptionCallbackFwk);
                return;
            }
            try {
                android.os.IBinder iBinder = subscriptionCallback.token;
                android.os.Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.addSubscription(str, iBinder, bundle2, messenger);
            } catch (android.os.RemoteException unused) {
                androidx.media3.common.util.Log.i(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "Remote error subscribing media item: " + str);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
            androidx.media3.session.legacy.MediaBrowserCompat.Subscription subscription = (androidx.media3.session.legacy.MediaBrowserCompat.Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                return;
            }
            androidx.media3.session.legacy.MediaBrowserCompat.ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper != null) {
                try {
                    if (subscriptionCallback == null) {
                        android.os.Messenger messenger = this.callbacksMessenger;
                        messenger.getClass();
                        serviceBinderWrapper.removeSubscription(str, null, messenger);
                    } else {
                        java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback> callbacks = subscription.getCallbacks();
                        java.util.List<android.os.Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                android.os.IBinder iBinder = subscriptionCallback.token;
                                android.os.Messenger messenger2 = this.callbacksMessenger;
                                messenger2.getClass();
                                serviceBinderWrapper.removeSubscription(str, iBinder, messenger2);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    }
                } catch (android.os.RemoteException unused) {
                    androidx.media3.common.util.Log.d(androidx.media3.session.legacy.MediaBrowserCompat.TAG, "removeSubscription failed with RemoteException parentId=" + str);
                }
            } else if (subscriptionCallback == null) {
                this.browserFwk.unsubscribe(str);
            } else {
                java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                java.util.List<android.os.Bundle> optionsList2 = subscription.getOptionsList();
                for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                    if (callbacks2.get(size2) == subscriptionCallback) {
                        callbacks2.remove(size2);
                        optionsList2.remove(size2);
                    }
                }
                if (callbacks2.isEmpty()) {
                    this.browserFwk.unsubscribe(str);
                }
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.subscriptions.remove(str);
            }
        }
    }

    public static class MediaBrowserImplApi26 extends androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(android.content.Context context, android.content.ComponentName componentName, androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback connectionCallback, android.os.Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23, androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
            if (this.serviceBinderWrapper != null && this.serviceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.browserFwk.subscribe(str, subscriptionCallback.subscriptionCallbackFwk);
            } else {
                this.browserFwk.subscribe(str, bundle, subscriptionCallback.subscriptionCallbackFwk);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23, androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
            if (this.serviceBinderWrapper != null && this.serviceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.browserFwk.unsubscribe(str);
            } else {
                this.browserFwk.unsubscribe(str, subscriptionCallback.subscriptionCallbackFwk);
            }
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        void onLoadChildren(android.os.Messenger messenger, java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2);
    }

    public static abstract class SearchCallback {
        public void onError(java.lang.String str, android.os.Bundle bundle) {
        }

        public void onSearchResult(java.lang.String str, android.os.Bundle bundle, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
        }
    }

    public static class SearchResultReceiver extends android.support.v4.os.e {
        private final androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback callback;
        private final android.os.Bundle extras;
        private final java.lang.String query;

        public SearchResultReceiver(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback searchCallback, android.os.Handler handler) {
            super(handler);
            this.query = str;
            this.extras = bundle;
            this.callback = searchCallback;
        }

        @Override // android.support.v4.os.e
        public void onReceiveResult(int i3, android.os.Bundle bundle) {
            android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
            if (i3 != 0 || bundleConvertToNullIfInvalid == null || !bundleConvertToNullIfInvalid.containsKey(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.callback.onError(this.query, this.extras);
                return;
            }
            android.os.Parcelable[] parcelableArray = bundleConvertToNullIfInvalid.getParcelableArray(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray == null) {
                this.callback.onError(this.query, this.extras);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
            for (android.os.Parcelable parcelable : parcelableArray) {
                arrayList.add((androidx.media3.session.legacy.MediaBrowserCompat.MediaItem) androidx.media3.session.legacy.LegacyParcelableUtil.convert(parcelable, androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.CREATOR));
            }
            this.callback.onSearchResult(this.query, this.extras, arrayList);
        }
    }

    public static class ServiceBinderWrapper {
        private final android.os.Messenger messenger;
        private final android.os.Bundle rootHints;

        public ServiceBinderWrapper(android.os.IBinder iBinder, android.os.Bundle bundle) {
            this.messenger = new android.os.Messenger(iBinder);
            this.rootHints = bundle;
        }

        private void sendRequest(int i3, android.os.Bundle bundle, android.os.Messenger messenger) throws android.os.RemoteException {
            if (this.messenger.getBinder().isBinderAlive()) {
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = i3;
                messageObtain.arg1 = 1;
                if (bundle != null) {
                    messageObtain.setData(bundle);
                }
                messageObtain.replyTo = messenger;
                this.messenger.send(messageObtain);
            }
        }

        public void addSubscription(java.lang.String str, android.os.IBinder iBinder, android.os.Bundle bundle, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBinder(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void getMediaItem(java.lang.String str, android.support.v4.os.e eVar, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER, androidx.media3.session.legacy.LegacyParcelableUtil.convert(eVar, android.support.v4.os.e.CREATOR));
            sendRequest(5, bundle, messenger);
        }

        public void registerCallbackMessenger(android.content.Context context, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_PID, android.os.Process.myPid());
            bundle.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_ROOT_HINTS, this.rootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(java.lang.String str, android.os.IBinder iBinder, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putBinder(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(java.lang.String str, android.os.Bundle bundle, android.support.v4.os.e eVar, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_SEARCH_QUERY, str);
            bundle2.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_SEARCH_EXTRAS, bundle);
            bundle2.putParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER, androidx.media3.session.legacy.LegacyParcelableUtil.convert(eVar, android.support.v4.os.e.CREATOR));
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(java.lang.String str, android.os.Bundle bundle, android.support.v4.os.e eVar, android.os.Messenger messenger) throws android.os.RemoteException {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CUSTOM_ACTION, str);
            bundle2.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS, bundle);
            bundle2.putParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER, androidx.media3.session.legacy.LegacyParcelableUtil.convert(eVar, android.support.v4.os.e.CREATOR));
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(android.os.Messenger messenger) throws android.os.RemoteException {
            sendRequest(7, null, messenger);
        }
    }

    public static class Subscription {
        private final java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback> callbacks = new java.util.ArrayList();
        private final java.util.List<android.os.Bundle> optionsList = new java.util.ArrayList();

        public androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback getCallback(android.os.Bundle bundle) {
            for (int i3 = 0; i3 < this.optionsList.size(); i3++) {
                if (androidx.media3.session.legacy.MediaBrowserCompatUtils.areSameOptions(this.optionsList.get(i3), bundle)) {
                    return this.callbacks.get(i3);
                }
            }
            return null;
        }

        public java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback> getCallbacks() {
            return this.callbacks;
        }

        public java.util.List<android.os.Bundle> getOptionsList() {
            return this.optionsList;
        }

        public boolean isEmpty() {
            return this.callbacks.isEmpty();
        }

        public void putCallback(android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
            for (int i3 = 0; i3 < this.optionsList.size(); i3++) {
                if (androidx.media3.session.legacy.MediaBrowserCompatUtils.areSameOptions(this.optionsList.get(i3), bundle)) {
                    this.callbacks.set(i3, subscriptionCallback);
                    return;
                }
            }
            this.callbacks.add(subscriptionCallback);
            this.optionsList.add(bundle);
        }
    }

    public static abstract class SubscriptionCallback {
        final android.media.browse.MediaBrowser.SubscriptionCallback subscriptionCallbackFwk;
        java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaBrowserCompat.Subscription> subscriptionRef;
        final android.os.IBinder token = new android.os.Binder();

        public class SubscriptionCallbackApi23 extends android.media.browse.MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi23() {
            }

            public java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
                int i3 = bundle.getInt(androidx.media3.session.legacy.MediaBrowserCompat.EXTRA_PAGE, -1);
                int i9 = bundle.getInt(androidx.media3.session.legacy.MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i3 == -1 && i9 == -1) {
                    return list;
                }
                int i10 = i9 * i3;
                int size = i10 + i9;
                if (i3 < 0 || i9 < 1 || i10 >= list.size()) {
                    return java.util.Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i10, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(java.lang.String str, java.util.List<android.media.browse.MediaBrowser.MediaItem> list) {
                java.lang.ref.WeakReference<androidx.media3.session.legacy.MediaBrowserCompat.Subscription> weakReference = androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.subscriptionRef;
                androidx.media3.session.legacy.MediaBrowserCompat.Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(str, androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.fromMediaItemList(list));
                    return;
                }
                java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> listFromMediaItemList = androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.fromMediaItemList(list);
                listFromMediaItemList.getClass();
                java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback> callbacks = subscription.getCallbacks();
                java.util.List<android.os.Bundle> optionsList = subscription.getOptionsList();
                for (int i3 = 0; i3 < callbacks.size(); i3++) {
                    android.os.Bundle bundle = optionsList.get(i3);
                    if (bundle == null) {
                        androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(str, listFromMediaItemList);
                    } else {
                        androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(listFromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(java.lang.String str) {
                androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onError(str);
            }
        }

        public class SubscriptionCallbackApi26 extends androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi23 {
            public SubscriptionCallbackApi26() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(java.lang.String str, java.util.List<android.media.browse.MediaBrowser.MediaItem> list, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(str, androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.fromMediaItemList(list), androidx.media3.common.util.Util.convertToNullIfInvalid(bundle));
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(java.lang.String str, android.os.Bundle bundle) {
                androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.this.onError(str, androidx.media3.common.util.Util.convertToNullIfInvalid(bundle));
            }
        }

        public SubscriptionCallback() {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.subscriptionCallbackFwk = new androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi26();
            } else {
                this.subscriptionCallbackFwk = new androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi23();
            }
        }

        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
        }

        public void onError(java.lang.String str) {
        }

        public void setSubscription(androidx.media3.session.legacy.MediaBrowserCompat.Subscription subscription) {
            this.subscriptionRef = new java.lang.ref.WeakReference<>(subscription);
        }

        public void onChildrenLoaded(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
        }

        public void onError(java.lang.String str, android.os.Bundle bundle) {
        }
    }

    public MediaBrowserCompat(android.content.Context context, android.content.ComponentName componentName, androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback connectionCallback, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.impl = new androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
        } else {
            this.impl = new androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        androidx.media3.common.util.Log.d(TAG, "Connecting to a MediaBrowserService.");
        this.impl.connect();
    }

    public void disconnect() {
        this.impl.disconnect();
    }

    public android.os.Bundle getExtras() {
        return this.impl.getExtras();
    }

    public void getItem(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback itemCallback) {
        this.impl.getItem(str, itemCallback);
    }

    public android.os.Bundle getNotifyChildrenChangedOptions() {
        return this.impl.getNotifyChildrenChangedOptions();
    }

    public java.lang.String getRoot() {
        return this.impl.getRoot();
    }

    public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
        return this.impl.getSessionToken();
    }

    public boolean isConnected() {
        return this.impl.isConnected();
    }

    public void search(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback searchCallback) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("query cannot be empty");
        }
        this.impl.search(str, bundle, searchCallback);
    }

    public void sendCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback customActionCallback) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("action cannot be empty");
        }
        this.impl.sendCustomAction(str, bundle, customActionCallback);
    }

    public void subscribe(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("parentId is empty");
        }
        this.impl.subscribe(str, bundle, subscriptionCallback);
    }

    public void unsubscribe(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("parentId is empty");
        }
        this.impl.unsubscribe(str, null);
    }

    public void unsubscribe(java.lang.String str, androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback subscriptionCallback) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.impl.unsubscribe(str, subscriptionCallback);
            return;
        }
        throw new java.lang.IllegalArgumentException("parentId is empty");
    }

    public static class MediaItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaBrowserCompat.MediaItem createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.MediaBrowserCompat.MediaItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.MediaBrowserCompat.MediaItem[] newArray(int i3) {
                return new androidx.media3.session.legacy.MediaBrowserCompat.MediaItem[i3];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final androidx.media3.session.legacy.MediaDescriptionCompat description;
        private final int flags;

        public MediaItem(androidx.media3.session.legacy.MediaDescriptionCompat mediaDescriptionCompat, int i3) {
            if (mediaDescriptionCompat == null) {
                throw new java.lang.IllegalArgumentException("description cannot be null");
            }
            if (android.text.TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new java.lang.IllegalArgumentException("description must have a non-empty media id");
            }
            this.flags = i3;
            this.description = mediaDescriptionCompat;
        }

        public static androidx.media3.session.legacy.MediaBrowserCompat.MediaItem fromMediaItem(android.media.browse.MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                return null;
            }
            return new androidx.media3.session.legacy.MediaBrowserCompat.MediaItem(androidx.media3.session.legacy.MediaDescriptionCompat.fromMediaDescription(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> fromMediaItemList(java.util.List<android.media.browse.MediaBrowser.MediaItem> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<android.media.browse.MediaBrowser.MediaItem> it = list.iterator();
            while (it.hasNext()) {
                androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItemFromMediaItem = fromMediaItem(it.next());
                if (mediaItemFromMediaItem != null) {
                    arrayList.add(mediaItemFromMediaItem);
                }
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

        public int getFlags() {
            return this.flags;
        }

        public java.lang.String getMediaId() {
            return this.description.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.flags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.flags & 2) != 0;
        }

        public java.lang.String toString() {
            return "MediaItem{mFlags=" + this.flags + ", mDescription=" + this.description + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeInt(this.flags);
            this.description.writeToParcel(parcel, i3);
        }

        public MediaItem(android.os.Parcel parcel) {
            this.flags = parcel.readInt();
            this.description = androidx.media3.session.legacy.MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
