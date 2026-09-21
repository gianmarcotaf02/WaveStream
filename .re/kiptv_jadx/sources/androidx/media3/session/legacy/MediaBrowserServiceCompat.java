package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends android.app.Service {
    private static final float EPSILON = 1.0E-5f;
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";
    public static final java.lang.String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final java.lang.String TAG = "MBServiceCompat";
    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord curConnection;
    private androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl impl;
    androidx.media3.session.legacy.MediaSessionCompat.Token session;
    private final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl serviceBinderImpl = new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl();
    final androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionFromFwk = new androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);
    final java.util.ArrayList<androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord> pendingConnections = new java.util.ArrayList<>();
    final p136q.C2661e connections = new p136q.C2661e(0);
    final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceHandler handler = new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceHandler(this);

    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final android.os.Bundle extras;
        private final java.lang.String rootId;

        public BrowserRoot(java.lang.String str, android.os.Bundle bundle) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.rootId = str;
            this.extras = bundle;
        }

        public android.os.Bundle getExtras() {
            return this.extras;
        }

        public java.lang.String getRootId() {
            return this.rootId;
        }
    }

    public class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        public final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo browserInfo;
        public final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks callbacks;
        public final int pid;
        public final java.lang.String pkg;
        public final android.os.Bundle rootHints;
        public final java.util.HashMap<java.lang.String, java.util.List<C1.b>> subscriptions = new java.util.HashMap<>();
        public final int uid;

        public ConnectionRecord(java.lang.String str, int i3, int i9, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i3;
            this.uid = i9;
            this.browserInfo = new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(str, i3, i9);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord.this;
                    p136q.C2661e c2661e = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections;
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks = connectionRecord.callbacks;
                    serviceCallbacks.getClass();
                    c2661e.remove(serviceCallbacks.asBinder());
                }
            });
        }
    }

    public interface MediaBrowserServiceImpl {
        android.os.Bundle getBrowserRootHints();

        androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle);

        void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle);

        android.os.IBinder onBind(android.content.Intent intent);

        void onCreate();

        void setSessionToken(androidx.media3.session.legacy.MediaSessionCompat.Token token);
    }

    public class MediaBrowserServiceImplApi23 implements androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        android.os.Messenger messenger;
        final java.util.List<android.os.Bundle> rootExtrasList = new java.util.ArrayList();
        android.service.media.MediaBrowserService serviceFwk;

        public class MediaBrowserServiceApi23 extends android.service.media.MediaBrowserService {
            public MediaBrowserServiceApi23(android.content.Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i3, android.os.Bundle bundle) {
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot browserRootOnGetRoot = androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.onGetRoot(str, i3, bundleConvertToNullIfInvalid == null ? null : new android.os.Bundle(bundleConvertToNullIfInvalid));
                if (browserRootOnGetRoot == null) {
                    return null;
                }
                return new android.service.media.MediaBrowserService.BrowserRoot(browserRootOnGetRoot.rootId, browserRootOnGetRoot.extras);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result) {
                androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.onLoadChildren(str, new androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<>(result));
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(java.lang.String str, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> result) {
                androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.onLoadItem(str, new androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<>(result));
            }
        }

        public MediaBrowserServiceImplApi23() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
            if (this.messenger == null) {
                return null;
            }
            androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection;
            if (connectionRecord == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new android.os.Bundle(androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection;
            if (connectionRecord != null) {
                return connectionRecord.browserInfo;
            }
            throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle) {
            notifyChildrenChangedForFramework(str, bundle);
            notifyChildrenChangedForCompat(str, bundle);
        }

        public void notifyChildrenChangedForCompat(final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.3
                @Override // java.lang.Runnable
                public void run() {
                    java.util.Iterator it = ((p136q.C2658b) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.keySet()).iterator();
                    while (true) {
                        p136q.C2657a c2657a = (p136q.C2657a) it;
                        if (!c2657a.hasNext()) {
                            return;
                        }
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get((android.os.IBinder) c2657a.next());
                        connectionRecord.getClass();
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.notifyChildrenChangedForCompatOnHandler(connectionRecord, str, bundle);
                    }
                }
            });
        }

        public void notifyChildrenChangedForCompatOnHandler(androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, java.lang.String str, android.os.Bundle bundle) {
            java.util.List<C1.b> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (C1.b bVar : list) {
                    if (androidx.media3.session.legacy.MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (android.os.Bundle) bVar.f868b)) {
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, (android.os.Bundle) bVar.f868b, bundle);
                    }
                }
            }
        }

        public void notifyChildrenChangedForFramework(java.lang.String str, android.os.Bundle bundle) {
            android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.notifyChildrenChanged(str);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent intent) {
            android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            return mediaBrowserService.onBind(intent);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23(androidx.media3.session.legacy.MediaBrowserServiceCompat.this);
            this.serviceFwk = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        public androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i3, android.os.Bundle bundle) {
            android.os.Bundle bundle2;
            int i9 = -1;
            if (bundle == null || bundle.getInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
                this.messenger = new android.os.Messenger(androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler);
                bundle2 = new android.os.Bundle();
                bundle2.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
                bundle2.putBinder(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.messenger.getBinder());
                androidx.media3.session.legacy.MediaSessionCompat.Token token = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.session;
                if (token != null) {
                    androidx.media3.session.legacy.IMediaSession extraBinder = token.getExtraBinder();
                    bundle2.putBinder(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.rootExtrasList.add(bundle2);
                }
                i9 = bundle.getInt(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CALLING_PID, -1);
                bundle.remove(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_CALLING_PID);
            }
            androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.new ConnectionRecord(str, i9, i3, bundle, null);
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = connectionRecord;
            androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot browserRootOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i3, bundle);
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat2 = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.curConnection = null;
            if (browserRootOnGetRoot == null) {
                return null;
            }
            if (this.messenger != null) {
                mediaBrowserServiceCompat2.pendingConnections.add(connectionRecord);
            }
            android.os.Bundle extras = browserRootOnGetRoot.getExtras();
            if (bundle2 == null) {
                bundle2 = extras;
            } else if (extras != null) {
                bundle2.putAll(extras);
            }
            return new androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot(browserRootOnGetRoot.getRootId(), bundle2);
        }

        public void onLoadChildren(java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> resultWrapper) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.2
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
                    java.util.ArrayList arrayList;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                        for (androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem : list) {
                            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList2.add(parcelObtain);
                        }
                        arrayList = arrayList2;
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result);
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection = null;
        }

        public void onLoadItem(java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<android.os.Parcel> resultWrapper) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.5
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    resultWrapper.sendResult(parcelObtain);
                }
            };
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, result);
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection = null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.setSessionTokenOnHandler(token);
                }
            });
        }

        public void setSessionTokenOnHandler(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
            if (!this.rootExtrasList.isEmpty()) {
                androidx.media3.session.legacy.IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    java.util.Iterator<android.os.Bundle> it = this.rootExtrasList.iterator();
                    while (it.hasNext()) {
                        it.next().putBinder(androidx.media3.session.legacy.MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder.asBinder());
                    }
                }
                this.rootExtrasList.clear();
            }
            android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.setSessionToken(token.getToken());
        }

        public void notifyChildrenChangedForCompat(final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, final java.lang.String str, final android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.post(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.4
                @Override // java.lang.Runnable
                public void run() {
                    int i3 = 0;
                    while (true) {
                        p136q.C2661e c2661e = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections;
                        if (i3 >= c2661e.j) {
                            return;
                        }
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) c2661e.i(i3);
                        if (connectionRecord.browserInfo.equals(remoteUserInfo)) {
                            androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this.notifyChildrenChangedForCompatOnHandler(connectionRecord, str, bundle);
                        }
                        i3++;
                    }
                }
            });
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle) {
            notifyChildrenChangedForCompat(remoteUserInfo, str, bundle);
        }
    }

    public class MediaBrowserServiceImplApi26 extends androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 {

        public class MediaBrowserServiceApi26 extends androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(android.content.Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> result, android.os.Bundle bundle) {
                android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle);
                androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.this;
                androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
                mediaBrowserServiceImplApi26.onLoadChildren(str, new androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<>(result), bundleConvertToNullIfInvalid);
                androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection = null;
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = mediaBrowserServiceCompat.curConnection;
            if (connectionRecord == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (connectionRecord == mediaBrowserServiceCompat.connectionFromFwk) {
                android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
                mediaBrowserService.getClass();
                return mediaBrowserService.getBrowserRootHints();
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new android.os.Bundle(androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
        public void notifyChildrenChangedForFramework(java.lang.String str, android.os.Bundle bundle) {
            if (bundle == null) {
                super.notifyChildrenChangedForFramework(str, bundle);
                return;
            }
            android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.notifyChildrenChanged(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26(androidx.media3.session.legacy.MediaBrowserServiceCompat.this);
            this.serviceFwk = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        public void onLoadChildren(java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> resultWrapper, final android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    if ((getFlags() & 1) != 0) {
                        list = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(list == null ? 0 : list.size());
                    if (list != null) {
                        for (androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem : list) {
                            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList.add(parcelObtain);
                        }
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result, bundle);
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.curConnection = null;
        }
    }

    public class MediaBrowserServiceImplApi28 extends androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 {
        public MediaBrowserServiceImplApi28() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = androidx.media3.session.legacy.MediaBrowserServiceCompat.this;
            androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = mediaBrowserServiceCompat.curConnection;
            if (connectionRecord == null) {
                throw new java.lang.IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (connectionRecord != mediaBrowserServiceCompat.connectionFromFwk) {
                return connectionRecord.browserInfo;
            }
            android.service.media.MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            return new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(mediaBrowserService.getCurrentBrowserInfo());
        }
    }

    public static class Result<T> {
        private final java.lang.Object debug;
        private boolean detachCalled;
        private int flags;
        private boolean sendErrorCalled;
        private boolean sendResultCalled;

        public Result(java.lang.Object obj) {
            this.debug = obj;
        }

        private void checkExtraFields(android.os.Bundle bundle) {
            if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f9 = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                float fConstrainValue = androidx.media3.common.util.Util.constrainValue(f9, -1.0E-5f, 1.00001f);
                if (f9 != fConstrainValue) {
                    bundle.putFloat("android.media.browse.extra.DOWNLOAD_PROGRESS", fConstrainValue);
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]. Actual value clamped to " + fConstrainValue + " from " + f9);
                }
            }
        }

        public void detach() {
            if (this.detachCalled) {
                throw new java.lang.IllegalStateException("detach() called when detach() had already been called for: " + this.debug);
            }
            if (this.sendResultCalled) {
                throw new java.lang.IllegalStateException("detach() called when sendResult() had already been called for: " + this.debug);
            }
            if (!this.sendErrorCalled) {
                this.detachCalled = true;
            } else {
                throw new java.lang.IllegalStateException("detach() called when sendError() had already been called for: " + this.debug);
            }
        }

        public int getFlags() {
            return this.flags;
        }

        public boolean isDone() {
            return this.detachCalled || this.sendResultCalled || this.sendErrorCalled;
        }

        public void onErrorSent(android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("It is not supported to send an error for " + this.debug);
        }

        public void onProgressUpdateSent(android.os.Bundle bundle) {
            throw new java.lang.UnsupportedOperationException("It is not supported to send an interim update for " + this.debug);
        }

        public void onResultSent(T t9) {
        }

        public void sendError(android.os.Bundle bundle) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                throw new java.lang.IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.debug);
            }
            this.sendErrorCalled = true;
            onErrorSent(bundle);
        }

        public void sendProgressUpdate(android.os.Bundle bundle) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                throw new java.lang.IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.debug);
            }
            checkExtraFields(bundle);
            onProgressUpdateSent(bundle);
        }

        public void sendResult(T t9) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.debug);
            }
            this.sendResultCalled = true;
            onResultSent(t9);
        }

        public void setFlags(int i3) {
            this.flags = i3;
        }
    }

    public static class ResultWrapper<T> {
        android.service.media.MediaBrowserService.Result resultFwk;

        public ResultWrapper(android.service.media.MediaBrowserService.Result result) {
            this.resultFwk = result;
        }

        public void detach() {
            this.resultFwk.detach();
        }

        public java.util.List<android.media.browse.MediaBrowser.MediaItem> parcelListToItemList(java.util.List<android.os.Parcel> list) {
            if (list == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (android.os.Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((android.media.browse.MediaBrowser.MediaItem) android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(T t9) {
            if (t9 instanceof java.util.List) {
                this.resultFwk.sendResult(parcelListToItemList((java.util.List) t9));
                return;
            }
            if (!(t9 instanceof android.os.Parcel)) {
                this.resultFwk.sendResult(null);
                return;
            }
            android.os.Parcel parcel = (android.os.Parcel) t9;
            parcel.setDataPosition(0);
            this.resultFwk.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public class ServiceBinderImpl {
        public ServiceBinderImpl() {
        }

        public void addSubscription(final java.lang.String str, final android.os.IBinder iBinder, final android.os.Bundle bundle, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, iBinder, bundle);
                        return;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "addSubscription for callback that isn't registered id=" + str);
                }
            });
        }

        public void getMediaItem(final java.lang.String str, final android.support.v4.os.e eVar, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || eVar == null) {
                return;
            }
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, eVar);
                        return;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "getMediaItem for callback that isn't registered id=" + str);
                }
            });
        }

        public void registerCallbacks(final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks, final java.lang.String str, final int i3, final int i9, final android.os.Bundle bundle) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord;
                    android.os.IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.remove(iBinderAsBinder);
                    java.util.Iterator<androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord> it = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.pendingConnections.iterator();
                    while (true) {
                        connectionRecord = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord next = it.next();
                        if (next.uid == i9) {
                            connectionRecord = (android.text.TextUtils.isEmpty(str) || i3 <= 0) ? androidx.media3.session.legacy.MediaBrowserServiceCompat.this.new ConnectionRecord(next.pkg, next.pid, next.uid, bundle, serviceCallbacks) : null;
                            it.remove();
                            break;
                        }
                    }
                    if (connectionRecord == null) {
                        connectionRecord = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.new ConnectionRecord(str, i3, i9, bundle, serviceCallbacks);
                    }
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.put(iBinderAsBinder, connectionRecord);
                    try {
                        iBinderAsBinder.linkToDeath(connectionRecord, 0);
                    } catch (android.os.RemoteException unused) {
                        androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "IBinder is already dead.");
                    }
                }
            });
        }

        public void removeSubscription(final java.lang.String str, final android.os.IBinder iBinder, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "removeSubscription for callback that isn't registered id=" + str);
                    } else {
                        if (androidx.media3.session.legacy.MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                            return;
                        }
                        androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        public void search(final java.lang.String str, final android.os.Bundle bundle, final android.support.v4.os.e eVar, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || eVar == null) {
                return;
            }
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.this.performSearch(str, bundle, connectionRecord, eVar);
                        return;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "search for callback that isn't registered query=" + str);
                }
            });
        }

        public void sendCustomAction(final java.lang.String str, final android.os.Bundle bundle, final android.support.v4.os.e eVar, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            if (android.text.TextUtils.isEmpty(str) || eVar == null) {
                return;
            }
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        androidx.media3.session.legacy.MediaBrowserServiceCompat.this.performCustomAction(str, bundle, connectionRecord, eVar);
                        return;
                    }
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                }
            });
        }

        public void unregisterCallbacks(final androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.this.handler.postOrRun(new java.lang.Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    android.os.IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord) androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections.remove(iBinderAsBinder);
                    if (connectionRecord != null) {
                        iBinderAsBinder.unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }
    }

    public interface ServiceCallbacks {
        android.os.IBinder asBinder();

        void onLoadChildren(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2);
    }

    public static class ServiceCallbacksCompat implements androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks {
        final android.os.Messenger callbacks;

        public ServiceCallbacksCompat(android.os.Messenger messenger) {
            this.callbacks = messenger;
        }

        private void sendRequest(int i3, android.os.Bundle bundle) throws android.os.RemoteException {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = i3;
            messageObtain.arg1 = 2;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            this.callbacks.send(messageObtain);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public android.os.IBinder asBinder() {
            return this.callbacks.getBinder();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(java.lang.String str, java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle3.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_OPTIONS, bundle);
            bundle3.putBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, androidx.media3.session.legacy.LegacyParcelableUtil.convertList(list, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR));
            }
            sendRequest(3, bundle3);
        }
    }

    public static final class ServiceHandler extends android.os.Handler {
        private androidx.media3.session.legacy.MediaBrowserServiceCompat service;

        /* JADX WARN: Illegal instructions before constructor call */
        public ServiceHandler(androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            looperMyLooper.getClass();
            super(looperMyLooper);
            this.service = mediaBrowserServiceCompat;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat mediaBrowserServiceCompat = this.service;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void postOrRun(java.lang.Runnable runnable) {
            if (java.lang.Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void release() {
            this.service = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(android.os.Message message, long j) {
            android.os.Bundle data = message.getData();
            java.lang.ClassLoader classLoader = androidx.media3.session.legacy.MediaBrowserCompat.class.getClassLoader();
            classLoader.getClass();
            data.setClassLoader(classLoader);
            data.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_UID, android.os.Binder.getCallingUid());
            int callingPid = android.os.Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_PID, callingPid);
            } else if (!data.containsKey(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_PID)) {
                data.putInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_PID, -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, android.os.IBinder iBinder, android.os.Bundle bundle) {
        java.util.List<C1.b> arrayList = connectionRecord.subscriptions.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        for (C1.b bVar : arrayList) {
            if (iBinder == bVar.f867a && androidx.media3.session.legacy.MediaBrowserCompatUtils.areSameOptions(bundle, (android.os.Bundle) bVar.f868b)) {
                return;
            }
        }
        arrayList.add(new C1.b(iBinder, bundle));
        connectionRecord.subscriptions.put(str, arrayList);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.curConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.curConnection = null;
    }

    public java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list, android.os.Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i3 = bundle.getInt(androidx.media3.session.legacy.MediaBrowserCompat.EXTRA_PAGE, -1);
            int i9 = bundle.getInt(androidx.media3.session.legacy.MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
            if (i3 != -1 || i9 != -1) {
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
        }
        return list;
    }

    public void attachToBaseContext(android.content.Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public final android.os.Bundle getBrowserRootHints() {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.getBrowserRootHints();
    }

    public final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.getCurrentBrowserInfo();
    }

    public androidx.media3.session.legacy.MediaSessionCompat.Token getSessionToken() {
        return this.session;
    }

    public void handleMessageInternal(android.os.Message message) {
        android.os.Bundle data = message.getData();
        switch (message.what) {
            case 3:
                this.serviceBinderImpl.addSubscription(data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLBACK_TOKEN), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_OPTIONS)), new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 4:
                this.serviceBinderImpl.removeSubscription(data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLBACK_TOKEN), new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 5:
                this.serviceBinderImpl.getMediaItem(data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (android.support.v4.os.e) data.getParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER), new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 6:
                this.serviceBinderImpl.registerCallbacks(new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo), data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CALLING_UID), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_ROOT_HINTS)));
                break;
            case 7:
                this.serviceBinderImpl.unregisterCallbacks(new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 8:
                this.serviceBinderImpl.search(data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_SEARCH_QUERY), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_SEARCH_EXTRAS)), (android.support.v4.os.e) data.getParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER), new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            case 9:
                this.serviceBinderImpl.sendCustomAction(data.getString(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CUSTOM_ACTION), androidx.media3.common.util.Util.convertToNullIfInvalid(data.getBundle(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS)), (android.support.v4.os.e) data.getParcelable(androidx.media3.session.legacy.MediaBrowserProtocol.DATA_RESULT_RECEIVER), new androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacksCompat(message.replyTo));
                break;
            default:
                androidx.media3.common.util.Log.w(TAG, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    public void notifyChildrenChanged(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        mediaBrowserServiceImpl.notifyChildrenChanged(str, null);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            this.impl = new androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi28();
        } else if (i3 >= 26) {
            this.impl = new androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26();
        } else {
            this.impl = new androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23();
        }
        this.impl.onCreate();
    }

    public void onCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<android.os.Bundle> result) {
        result.sendError(null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.handler.release();
    }

    public abstract androidx.media3.session.legacy.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String str, int i3, android.os.Bundle bundle);

    public abstract void onLoadChildren(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result, android.os.Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void onSubscribe(java.lang.String str, android.os.Bundle bundle) {
    }

    public void onUnsubscribe(java.lang.String str) {
    }

    public void performCustomAction(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.e eVar) {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<android.os.Bundle> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<android.os.Bundle>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.4
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onErrorSent(android.os.Bundle bundle2) {
                eVar.send(-1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onProgressUpdateSent(android.os.Bundle bundle2) {
                eVar.send(1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(android.os.Bundle bundle2) {
                eVar.send(0, bundle2);
            }
        };
        this.curConnection = connectionRecord;
        onCustomAction(str, bundle == null ? android.os.Bundle.EMPTY : bundle, result);
        this.curConnection = null;
        if (result.isDone()) {
            return;
        }
        throw new java.lang.IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void performLoadChildren(final java.lang.String str, final androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.os.Bundle bundle, final android.os.Bundle bundle2) {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.1
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
                p136q.C2661e c2661e = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.connections;
                androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks serviceCallbacks = connectionRecord.callbacks;
                serviceCallbacks.getClass();
                if (c2661e.get(serviceCallbacks.asBinder()) != connectionRecord) {
                    androidx.media3.common.util.Log.d(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.pkg + " id=" + str);
                    return;
                }
                if ((getFlags() & 1) != 0) {
                    list = androidx.media3.session.legacy.MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                }
                try {
                    connectionRecord.callbacks.onLoadChildren(str, list, bundle, bundle2);
                } catch (android.os.RemoteException unused) {
                    androidx.media3.common.util.Log.w(androidx.media3.session.legacy.MediaBrowserServiceCompat.TAG, "Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.pkg);
                }
            }
        };
        this.curConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.curConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException(B2.a.o(new java.lang.StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.pkg, " id=", str));
        }
    }

    public void performLoadItem(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.e eVar) {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.2
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(androidx.media3.session.legacy.MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    eVar.send(-1, null);
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_MEDIA_ITEM, androidx.media3.session.legacy.LegacyParcelableUtil.convert(mediaItem, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR));
                eVar.send(0, bundle);
            }
        };
        this.curConnection = connectionRecord;
        onLoadItem(str, result);
        this.curConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException(p121o0.p.C("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public void performSearch(java.lang.String str, android.os.Bundle bundle, androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, final android.support.v4.os.e eVar) {
        androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>> result = new androidx.media3.session.legacy.MediaBrowserServiceCompat.Result<java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.3
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(java.util.List<androidx.media3.session.legacy.MediaBrowserCompat.MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    eVar.send(-1, null);
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelableArray(androidx.media3.session.legacy.MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (android.os.Parcelable[]) androidx.media3.session.legacy.LegacyParcelableUtil.convertList(list, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR).toArray(new android.support.v4.media.MediaBrowserCompat$MediaItem[0]));
                eVar.send(0, bundle2);
            }
        };
        this.curConnection = connectionRecord;
        onSearch(str, bundle, result);
        this.curConnection = null;
        if (!result.isDone()) {
            throw new java.lang.IllegalStateException(p121o0.p.C("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    public boolean removeSubscription(java.lang.String str, androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord connectionRecord, android.os.IBinder iBinder) {
        boolean z6 = false;
        try {
            if (iBinder != null) {
                java.util.List<C1.b> list = connectionRecord.subscriptions.get(str);
                if (list != null) {
                    java.util.Iterator<C1.b> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f867a) {
                            it.remove();
                            z6 = true;
                        }
                    }
                    if (list.isEmpty()) {
                        connectionRecord.subscriptions.remove(str);
                    }
                }
            } else if (connectionRecord.subscriptions.remove(str) != null) {
                z6 = true;
            }
            this.curConnection = connectionRecord;
            onUnsubscribe(str);
            this.curConnection = null;
            return z6;
        } catch (java.lang.Throwable th) {
            this.curConnection = connectionRecord;
            onUnsubscribe(str);
            this.curConnection = null;
            throw th;
        }
    }

    public void setSessionToken(androidx.media3.session.legacy.MediaSessionCompat.Token token) {
        if (token == null) {
            throw new java.lang.IllegalArgumentException("Session token may not be null");
        }
        if (this.session != null) {
            throw new java.lang.IllegalStateException("The session token has already been set");
        }
        this.session = token;
        androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        mediaBrowserServiceImpl.setSessionToken(token);
    }

    public void notifyChildrenChanged(java.lang.String str, android.os.Bundle bundle) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
            mediaBrowserServiceImpl.getClass();
            mediaBrowserServiceImpl.notifyChildrenChanged(str, bundle);
            return;
        }
        throw new java.lang.IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, java.lang.String str, android.os.Bundle bundle) {
        if (remoteUserInfo == null) {
            throw new java.lang.IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
            mediaBrowserServiceImpl.getClass();
            mediaBrowserServiceImpl.notifyChildrenChanged(remoteUserInfo, str, bundle);
            return;
        }
        throw new java.lang.IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
}
