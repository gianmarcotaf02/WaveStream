package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002\u009d\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0086@¢\u0006\u0004\b+\u0010-J\u001a\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0086@¢\u0006\u0004\b.\u0010-J\u001a\u0010/\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0086@¢\u0006\u0004\b/\u0010-J*\u00102\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00100\u0018\u00012\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0086H¢\u0006\u0004\b2\u00103J>\u00102\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001002\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020\u00152\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00018\u000004H\u0086@¢\u0006\u0004\b2\u00107J0\u0010:\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00100\u0018\u00012\u0006\u0010+\u001a\u00020*2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001508H\u0086H¢\u0006\u0004\b:\u0010;JD\u0010:\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001002\u0006\u0010+\u001a\u00020*2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u0015082\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00018\u000004H\u0086@¢\u0006\u0004\b:\u0010=J/\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010>\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010?J\u0017\u0010B\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0002¢\u0006\u0004\bE\u0010FJ+\u0010M\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ?\u0010U\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ'\u0010W\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u0015H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u00020\u001b2\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b[\u0010\\J'\u0010]\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020G2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u001bH\u0002¢\u0006\u0004\ba\u0010)J\u0010\u0010b\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u001eH\u0082@¢\u0006\u0004\bd\u0010cJ\u001a\u0010e\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\be\u0010-J(\u0010f\u001a\u0004\u0018\u00010<2\u0006\u0010+\u001a\u00020*2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001508H\u0082@¢\u0006\u0004\bf\u0010;J\"\u0010g\u001a\u0004\u0018\u0001052\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0082@¢\u0006\u0004\bg\u00103J\"\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020\u0015H\u0082@¢\u0006\u0004\bi\u00103J+\u0010m\u001a\u00020\u001b2\b\u0010j\u001a\u0004\u0018\u00010I2\u0006\u0010l\u001a\u00020k2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bm\u0010nJ+\u0010q\u001a\u00020\u001b2\u0006\u0010l\u001a\u00020k2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020,0oH\u0002¢\u0006\u0004\bq\u0010rJ%\u0010u\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020K2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00150sH\u0002¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010wR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010xR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010yR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010zR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010{R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010|R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010}R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010~R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u007fR\u001d\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0091\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008d\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0086\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0014\u0010\u0098\u0001\u001a\u00020\u001e8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0014\u0010\u009c\u0001\u001a\u00020G8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigDiskCache;", "diskCache", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobStore;", "blobStore", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "LS7/A;", "scope", "LS7/w;", "ioDispatcher", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopicStore;", "topicStore", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceProvider;", "sourceProvider", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobFetcher;", "blobFetcher", "Lkotlin/Function0;", "", "appUserIDProvider", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigDiskCache;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobStore;Lcom/revenuecat/purchases/common/DateProvider;LS7/A;LS7/w;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopicStore;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceProvider;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobFetcher;Lkotlin/jvm/functions/Function0;)V", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigCommitListener;", "listener", "Lh6/A;", "registerListener", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigCommitListener;)V", "", "appInBackground", "appUserID", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigFetchContext;", "fetchContext", "refreshRemoteConfigIfStale", "(ZLjava/lang/String;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigFetchContext;)V", "refreshRemoteConfig", "clearCache", "(Ljava/lang/String;)V", "close", "()V", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;", "topic", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;Ll6/c;)Ljava/lang/Object;", "committedTopicOrNull", "awaitTopicAndPrefetchBlobsReady", "T", "itemKey", "blobData", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "transform", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "itemKeys", "mergeItemsBlobData", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;Ljava/util/Collection;Ll6/c;)Ljava/lang/Object;", "Lkotlinx/serialization/json/c;", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopic;Ljava/util/Collection;Lx6/j;Ll6/c;)Ljava/lang/Object;", "staleGated", "(ZLjava/lang/String;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigFetchContext;Z)V", "Ljava/util/Date;", "now", "isRefreshAttemptCooldownElapsed", "(Ljava/util/Date;)Z", "requested", "fetchContextForRequest", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigFetchContext;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigFetchContext;", "", "requestEpoch", "Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;", "persisted", "Lcom/revenuecat/purchases/common/networking/RCContainer;", "container", "handleMainRefreshSuccess", "(ILcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;Lcom/revenuecat/purchases/common/networking/RCContainer;)V", "domain", "hasCachedConfig", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;", "behavior", "handleMainRefreshError", "(IZLjava/lang/String;ZLcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;)V", "fetchFromFallback", "(IZLjava/lang/String;)V", "handleNotModified", "(I)V", "logRefreshStart", "(Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;Z)V", "handleRefreshError", "(ILcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;)V", "releaseGuardIfOwned", "(I)Z", "completeRefresh", "awaitConfigForRead", "(Ll6/c;)Ljava/lang/Object;", "awaitInFlightRefresh", "committedTopic", "mergedBlobObject", "resolveBlobBytes", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "committedItem", "previous", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", io.sentry.protocol.Response.TYPE, "persist", "(Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;Lcom/revenuecat/purchases/common/networking/RCContainer;)V", "", "mergedTopics", "prefetchBlobs", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;Ljava/util/Map;)V", "", "refsToKeep", "extractInlineBlobs", "(Lcom/revenuecat/purchases/common/networking/RCContainer;Ljava/util/Set;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigDiskCache;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobStore;", "Lcom/revenuecat/purchases/common/DateProvider;", "LS7/A;", "LS7/w;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigTopicStore;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceProvider;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigBlobFetcher;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRefreshing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicInteger;", "epoch", "Ljava/util/concurrent/atomic/AtomicInteger;", "cacheLock", "Ljava/lang/Object;", "lastRefreshedAt", "Ljava/util/Date;", "lastRefreshAttemptAt", "hasCommittedInitialConfig", "Z", "currentAppUserID", "Ljava/lang/String;", "LS7/p;", "refreshCompletion", "LS7/p;", "disabled", "generation", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "isDisabled", "()Z", "getConfigGeneration", "()I", "configGeneration", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigManager {
    private static final com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.Companion Companion = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.Companion(null);
    private static final java.lang.String DEFAULT_DOMAIN = "app";
    private static final long REFRESH_ATTEMPT_COOLDOWN;
    private final kotlin.jvm.functions.Function0 appUserIDProvider;
    private final com.revenuecat.purchases.common.Backend backend;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher blobFetcher;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobStore blobStore;
    private final java.lang.Object cacheLock;
    private volatile java.lang.String currentAppUserID;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private volatile boolean disabled;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigDiskCache diskCache;
    private final java.util.concurrent.atomic.AtomicInteger epoch;
    private final java.util.concurrent.atomic.AtomicInteger generation;
    private boolean hasCommittedInitialConfig;
    private final S7.AbstractC0906w ioDispatcher;
    private final java.util.concurrent.atomic.AtomicBoolean isRefreshing;
    private volatile java.util.Date lastRefreshAttemptAt;
    private volatile java.util.Date lastRefreshedAt;
    private final java.util.concurrent.CopyOnWriteArrayList<com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener> listeners;
    private volatile S7.InterfaceC0900p refreshCompletion;
    private final S7.A scope;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider sourceProvider;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopicStore topicStore;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Void invoke() {
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager$Companion;", "", "<init>", "()V", "", "DEFAULT_DOMAIN", "Ljava/lang/String;", "LP7/b;", "REFRESH_ATTEMPT_COOLDOWN", "J", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$awaitConfigForRead$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {478, 495}, m = "awaitConfigForRead")
    public static final class C20541 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20541(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.awaitConfigForRead(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$awaitInFlightRefresh$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {511}, m = "awaitInFlightRefresh")
    public static final class C20551 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C20551(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.awaitInFlightRefresh(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$awaitTopicAndPrefetchBlobsReady$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "<anonymous>", "(LS7/A;)Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$awaitTopicAndPrefetchBlobsReady$2", f = "RemoteConfigManager.kt", l = {563, 572, 577}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;
        java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
            super(2, cVar);
            this.$topic = remoteConfigTopic;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.new AnonymousClass2(this.$topic, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0045  */
        /* JADX WARN: Code duplicated, block: B:21:0x005a  */
        /* JADX WARN: Code duplicated, block: B:27:0x007a  */
        /* JADX WARN: Code duplicated, block: B:32:0x0090  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e4 A[PHI: r1
  0x00e4: PHI (r1v3 com.revenuecat.purchases.common.remoteconfig.ConfigTopic) = 
  (r1v4 com.revenuecat.purchases.common.remoteconfig.ConfigTopic)
  (r1v4 com.revenuecat.purchases.common.remoteconfig.ConfigTopic)
  (r1v11 com.revenuecat.purchases.common.remoteconfig.ConfigTopic)
 binds: [B:31:0x008e, B:36:0x00e1, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:48:0x0067 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x0054 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0086 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0074 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
        
            if (r11 == r0) goto L40;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a4, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f0 -> B:41:0x00f3). Please report as a decompilation issue!!! */
        @Override // p117n6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic;
            com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic2;
            java.util.ArrayList arrayList;
            java.util.ArrayList arrayList2;
            java.util.Iterator it;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic;
            com.revenuecat.purchases.LogLevel logLevel;
            com.revenuecat.purchases.LogHandler currentLogHandler;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher remoteConfigBlobFetcher;
            java.lang.String blobRef;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    com.google.common.util.concurrent.P.u0(obj);
                } else if (i3 == 2) {
                    configTopic2 = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) this.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic2 = this.$topic;
                    this.L$0 = configTopic2;
                    this.label = 3;
                    obj = remoteConfigManager.committedTopic(remoteConfigTopic2, this);
                } else {
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    configTopic2 = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) this.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                }
                configTopic = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) obj;
                if (!kotlin.jvm.internal.m.a(configTopic, configTopic2)) {
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic3 = this.$topic;
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Committed '" + remoteConfigTopic3.getWireName() + "' changed during prefetch wait; re-awaiting.");
                    }
                    configTopic2 = configTopic;
                    if (configTopic2 != null) {
                        java.util.Collection<com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem> collectionValues = configTopic2.values();
                        arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : collectionValues) {
                            if (((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) obj2).getPrefetch()) {
                                arrayList.add(obj2);
                            }
                        }
                        arrayList2 = new java.util.ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            blobRef = ((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) it.next()).getBlobRef();
                            if (blobRef != null) {
                                arrayList2.add(blobRef);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager2 = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic4 = this.$topic;
                            this.L$0 = configTopic2;
                            this.label = 3;
                            obj = remoteConfigManager2.committedTopic(remoteConfigTopic4, this);
                        } else {
                            remoteConfigTopic = this.$topic;
                            logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Awaiting " + arrayList2.size() + " prefetch blob(s) for topic '" + remoteConfigTopic.getWireName() + "'.");
                            }
                            remoteConfigBlobFetcher = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.blobFetcher;
                            this.L$0 = configTopic2;
                            this.label = 2;
                            if (remoteConfigBlobFetcher.ensureDownloaded(arrayList2, this) != aVar) {
                                com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager3 = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                                com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic5 = this.$topic;
                                this.L$0 = configTopic2;
                                this.label = 3;
                                obj = remoteConfigManager3.committedTopic(remoteConfigTopic5, this);
                            }
                        }
                        return aVar;
                    }
                }
                return configTopic2;
            }
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager4 = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic6 = this.$topic;
            this.label = 1;
            obj = remoteConfigManager4.committedTopic(remoteConfigTopic6, this);
            configTopic = (com.revenuecat.purchases.common.remoteconfig.ConfigTopic) obj;
            configTopic2 = configTopic;
            if (configTopic2 != null) {
                java.util.Collection<com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem> collectionValues2 = configTopic2.values();
                arrayList = new java.util.ArrayList();
                while (r11.hasNext()) {
                    if (((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) obj2).getPrefetch()) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new java.util.ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    blobRef = ((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) it.next()).getBlobRef();
                    if (blobRef != null) {
                        arrayList2.add(blobRef);
                    }
                }
                if (arrayList2.isEmpty()) {
                    remoteConfigTopic = this.$topic;
                    logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Awaiting " + arrayList2.size() + " prefetch blob(s) for topic '" + remoteConfigTopic.getWireName() + "'.");
                    }
                    remoteConfigBlobFetcher = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.blobFetcher;
                    this.L$0 = configTopic2;
                    this.label = 2;
                    if (remoteConfigBlobFetcher.ensureDownloaded(arrayList2, this) != aVar) {
                        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager5 = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                        com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic7 = this.$topic;
                        this.L$0 = configTopic2;
                        this.label = 3;
                        obj = remoteConfigManager5.committedTopic(remoteConfigTopic7, this);
                    }
                } else {
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager6 = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic8 = this.$topic;
                    this.L$0 = configTopic2;
                    this.label = 3;
                    obj = remoteConfigManager6.committedTopic(remoteConfigTopic8, this);
                }
                return aVar;
            }
            return configTopic2;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$blobData$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "bytes", "", "invoke", "([B)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C20562 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.lang.String $itemKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20562(java.lang.String str) {
            super(1);
            this.$itemKey = str;
        }

        @Override // p194x6.j
        public final T invoke(byte[] bytes) {
            kotlin.jvm.internal.m.e(bytes, "bytes");
            try {
                p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
                O7.x.n0(bytes);
                v8.d dVar = json.f27389b;
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (p119n8.j e6) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Failed to parse remote config blob for item '", this.$itemKey, "' as JSON."), e6);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$blobData$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LS7/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$blobData$4", f = "RemoteConfigManager.kt", l = {647}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends p117n6.i implements p194x6.m {
        final /* synthetic */ java.lang.String $itemKey;
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;
        final /* synthetic */ p194x6.j $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
            super(2, cVar);
            this.$topic = remoteConfigTopic;
            this.$itemKey = str;
            this.$transform = jVar;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.new AnonymousClass4(this.$topic, this.$itemKey, this.$transform, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass4) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = this.$topic;
                java.lang.String str = this.$itemKey;
                this.label = 1;
                obj = remoteConfigManager.resolveBlobBytes(remoteConfigTopic, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return this.$transform.invoke(bArr);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$committedItem$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {774}, m = "committedItem")
    public static final class C20571 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20571(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.committedItem(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$committedTopic$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {596}, m = "committedTopic")
    public static final class C20581 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20581(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.committedTopic(null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$committedTopicOrNull$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "<anonymous>", "(LS7/A;)Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$committedTopicOrNull$2", f = "RemoteConfigManager.kt", l = {}, m = "invokeSuspend")
    public static final class C20592 extends p117n6.i implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20592(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
            super(2, cVar);
            this.$topic = remoteConfigTopic;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.new C20592(this.$topic, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20592) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            if (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.disabled) {
                return null;
            }
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.topicStore.topic(this.$topic);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$fetchFromFallback$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", io.sentry.protocol.Response.TYPE, "Lcom/revenuecat/purchases/VerificationResult;", "<anonymous parameter 1>", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;Lcom/revenuecat/purchases/VerificationResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20602 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ int $requestEpoch;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$fetchFromFallback$2$1, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
        @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$fetchFromFallback$2$1", f = "RemoteConfigManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
            final /* synthetic */ int $requestEpoch;
            final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration $response;
            int label;
            final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager, int i3, com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration remoteConfiguration, p100l6.c cVar) {
                super(2, cVar);
                this.this$0 = remoteConfigManager;
                this.$requestEpoch = i3;
                this.$response = remoteConfiguration;
            }

            @Override // p117n6.a
            public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
                return new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20602.AnonymousClass1(this.this$0, this.$requestEpoch, this.$response, cVar);
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
                return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20602.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
            }

            @Override // p117n6.a
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                p109m6.a aVar = p109m6.a.f25430h;
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                try {
                    java.lang.Object obj2 = this.this$0.cacheLock;
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.this$0;
                    int i3 = this.$requestEpoch;
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration remoteConfiguration = this.$response;
                    synchronized (obj2) {
                        if (remoteConfigManager.epoch.get() != i3) {
                            p070h6.A a2 = p070h6.A.f22523a;
                            this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                            return a2;
                        }
                        remoteConfigManager.persist(null, remoteConfiguration, null);
                        this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                        return p070h6.A.f22523a;
                    }
                } catch (java.lang.Throwable th) {
                    this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20602(int i3) {
            super(2);
            this.$requestEpoch = i3;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration) obj, (com.revenuecat.purchases.VerificationResult) obj2);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration response, com.revenuecat.purchases.VerificationResult verificationResult) {
            kotlin.jvm.internal.m.e(response, "response");
            kotlin.jvm.internal.m.e(verificationResult, "<anonymous parameter 1>");
            if (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.epoch.get() != this.$requestEpoch) {
                return;
            }
            S7.C.A(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.scope, null, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20602.AnonymousClass1(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this, this.$requestEpoch, response, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$fetchFromFallback$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;", "behavior", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ int $requestEpoch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i3) {
            super(2);
            this.$requestEpoch = i3;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior) obj2);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior behavior) {
            kotlin.jvm.internal.m.e(error, "error");
            kotlin.jvm.internal.m.e(behavior, "behavior");
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.handleRefreshError(this.$requestEpoch, error, behavior);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$handleMainRefreshSuccess$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$handleMainRefreshSuccess$1", f = "RemoteConfigManager.kt", l = {}, m = "invokeSuspend")
    public static final class C20611 extends p117n6.i implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.common.networking.RCContainer $container;
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState $persisted;
        final /* synthetic */ int $requestEpoch;
        int label;
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20611(com.revenuecat.purchases.common.networking.RCContainer rCContainer, com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager, int i3, com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState, p100l6.c cVar) {
            super(2, cVar);
            this.$container = rCContainer;
            this.this$0 = remoteConfigManager;
            this.$requestEpoch = i3;
            this.$persisted = persistedRemoteConfigurationState;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20611(this.$container, this.this$0, this.$requestEpoch, this.$persisted, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20611) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            try {
                try {
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration remoteConfiguration = com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.INSTANCE.parse(this.$container.getConfig());
                    java.lang.Object obj2 = this.this$0.cacheLock;
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.this$0;
                    int i3 = this.$requestEpoch;
                    com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState = this.$persisted;
                    com.revenuecat.purchases.common.networking.RCContainer rCContainer = this.$container;
                    synchronized (obj2) {
                        if (remoteConfigManager.epoch.get() != i3) {
                            p070h6.A a2 = p070h6.A.f22523a;
                            this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                            return a2;
                        }
                        remoteConfigManager.persist(persistedRemoteConfigurationState, remoteConfiguration, rCContainer);
                        this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                        return p070h6.A.f22523a;
                    }
                } catch (com.revenuecat.purchases.common.networking.RCContainerFormatException e6) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to decode remote config response. Keeping the cached configuration.", e6);
                } catch (p119n8.j e9) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to parse remote config response. Keeping the cached configuration.", e9);
                }
            } catch (java.lang.Throwable th) {
                this.this$0.releaseGuardIfOwned(this.$requestEpoch);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergeItemsBlobData$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/serialization/json/c;", "merged", "invoke", "(Lkotlinx/serialization/json/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20622 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20622(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic) {
            super(1);
            this.$topic = remoteConfigTopic;
        }

        @Override // p194x6.j
        public final T invoke(kotlinx.serialization.json.c merged) {
            kotlin.jvm.internal.m.e(merged, "merged");
            try {
                v8.d dVar = com.revenuecat.purchases.JsonTools.INSTANCE.getJson().f27389b;
                kotlin.jvm.internal.m.j();
                throw null;
            } catch (p119n8.j e6) {
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = this.$topic;
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to decode merged remote config blobs from topic '" + remoteConfigTopic.getWireName() + "' as JSON.", e6);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergeItemsBlobData$4, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LS7/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergeItemsBlobData$4", f = "RemoteConfigManager.kt", l = {692}, m = "invokeSuspend")
    public static final class C20634 extends p117n6.i implements p194x6.m {
        final /* synthetic */ java.util.Collection<java.lang.String> $itemKeys;
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;
        final /* synthetic */ p194x6.j $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20634(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.util.Collection<java.lang.String> collection, p194x6.j jVar, p100l6.c cVar) {
            super(2, cVar);
            this.$topic = remoteConfigTopic;
            this.$itemKeys = collection;
            this.$transform = jVar;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.new C20634(this.$topic, this.$itemKeys, this.$transform, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20634) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
                com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = this.$topic;
                java.util.Collection<java.lang.String> collection = this.$itemKeys;
                this.label = 1;
                obj = remoteConfigManager.mergedBlobObject(remoteConfigTopic, collection, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
            if (cVar != null) {
                return this.$transform.invoke(cVar);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergedBlobObject$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {712}, m = "mergedBlobObject")
    public static final class C20641 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20641(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.mergedBlobObject(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$refreshRemoteConfig$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/networking/RCContainer;", "container", "Lcom/revenuecat/purchases/VerificationResult;", "<anonymous parameter 1>", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/networking/RCContainer;Lcom/revenuecat/purchases/VerificationResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20653 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState $persisted;
        final /* synthetic */ kotlin.jvm.internal.y $requestEpoch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20653(kotlin.jvm.internal.y yVar, com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState) {
            super(2);
            this.$requestEpoch = yVar;
            this.$persisted = persistedRemoteConfigurationState;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.common.networking.RCContainer) obj, (com.revenuecat.purchases.VerificationResult) obj2);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.common.networking.RCContainer rCContainer, com.revenuecat.purchases.VerificationResult verificationResult) {
            kotlin.jvm.internal.m.e(verificationResult, "<anonymous parameter 1>");
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.handleMainRefreshSuccess(this.$requestEpoch.f24555h, this.$persisted, rCContainer);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$refreshRemoteConfig$4, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;", "behavior", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetRemoteConfigErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20664 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ java.lang.String $domain;
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState $persisted;
        final /* synthetic */ kotlin.jvm.internal.y $requestEpoch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20664(kotlin.jvm.internal.y yVar, boolean z6, java.lang.String str, com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState) {
            super(2);
            this.$requestEpoch = yVar;
            this.$appInBackground = z6;
            this.$domain = str;
            this.$persisted = persistedRemoteConfigurationState;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
            invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior) obj2);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior behavior) throws java.lang.Throwable {
            kotlin.jvm.internal.m.e(error, "error");
            kotlin.jvm.internal.m.e(behavior, "behavior");
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.handleMainRefreshError(this.$requestEpoch.f24555h, this.$appInBackground, this.$domain, this.$persisted != null, error, behavior);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$resolveBlobBytes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager", f = "RemoteConfigManager.kt", l = {748, 754}, m = "resolveBlobBytes")
    public static final class C20671 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public C20671(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.resolveBlobBytes(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$topic$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "<anonymous>", "(LS7/A;)Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;"}, k = 3, mv = {1, 8, 0})
    @p117n6.e(c = "com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$topic$2", f = "RemoteConfigManager.kt", l = {527}, m = "invokeSuspend")
    public static final class C20682 extends p117n6.i implements p194x6.m {
        final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20682(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
            super(2, cVar);
            this.$topic = remoteConfigTopic;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this.new C20682(this.$topic, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20682) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.this;
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = this.$topic;
            this.label = 1;
            java.lang.Object objCommittedTopic = remoteConfigManager.committedTopic(remoteConfigTopic, this);
            return objCommittedTopic == aVar ? aVar : objCommittedTopic;
        }
    }

    static {
        P7.a aVar = P7.b.f8168i;
        REFRESH_ATTEMPT_COOLDOWN = E8.l.N(1, P7.d.MINUTES);
    }

    public RemoteConfigManager(com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.remoteconfig.RemoteConfigDiskCache diskCache, com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobStore blobStore, com.revenuecat.purchases.common.DateProvider dateProvider, S7.A scope, S7.AbstractC0906w ioDispatcher, com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopicStore topicStore, com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider sourceProvider, com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher blobFetcher, kotlin.jvm.functions.Function0 appUserIDProvider) {
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(diskCache, "diskCache");
        kotlin.jvm.internal.m.e(blobStore, "blobStore");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(scope, "scope");
        kotlin.jvm.internal.m.e(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.m.e(topicStore, "topicStore");
        kotlin.jvm.internal.m.e(sourceProvider, "sourceProvider");
        kotlin.jvm.internal.m.e(blobFetcher, "blobFetcher");
        kotlin.jvm.internal.m.e(appUserIDProvider, "appUserIDProvider");
        this.backend = backend;
        this.diskCache = diskCache;
        this.blobStore = blobStore;
        this.dateProvider = dateProvider;
        this.scope = scope;
        this.ioDispatcher = ioDispatcher;
        this.topicStore = topicStore;
        this.sourceProvider = sourceProvider;
        this.blobFetcher = blobFetcher;
        this.appUserIDProvider = appUserIDProvider;
        this.isRefreshing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.epoch = new java.util.concurrent.atomic.AtomicInteger(0);
        this.cacheLock = new java.lang.Object();
        this.generation = new java.util.concurrent.atomic.AtomicInteger(0);
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object awaitConfigForRead(p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20541 c20541;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20541) {
            c20541 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20541) cVar;
            int i3 = c20541.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20541.label = i3 - Integer.MIN_VALUE;
            } else {
                c20541 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20541(cVar);
            }
        } else {
            c20541 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20541(cVar);
        }
        java.lang.Object objAwaitInFlightRefresh = c20541.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20541.label;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 != 0) {
            if (i9 == 1) {
                remoteConfigManager = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager) c20541.L$0;
                com.google.common.util.concurrent.P.u0(objAwaitInFlightRefresh);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objAwaitInFlightRefresh);
            }
        }
        com.google.common.util.concurrent.P.u0(objAwaitInFlightRefresh);
        c20541.L$0 = this;
        c20541.label = 1;
        objAwaitInFlightRefresh = awaitInFlightRefresh(c20541);
        if (objAwaitInFlightRefresh != aVar) {
            remoteConfigManager = this;
        }
        if (((java.lang.Boolean) objAwaitInFlightRefresh).booleanValue()) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Cold remote config read waiting on the refresh already in progress.");
            }
            return a2;
        }
        java.lang.String str = remoteConfigManager.currentAppUserID;
        if (str == null) {
            str = (java.lang.String) remoteConfigManager.appUserIDProvider.invoke();
        }
        if (str == null || O7.q.N0(str)) {
            str = null;
        }
        if (!remoteConfigManager.disabled && str != null) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Cold remote config read triggering an on-demand sync.");
            }
            remoteConfigManager.refreshRemoteConfig(false, str, com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext.Read, true);
            c20541.L$0 = null;
            c20541.label = 2;
            return remoteConfigManager.awaitInFlightRefresh(c20541) == aVar ? aVar : a2;
        }
        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - "));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cold remote config read skipped on-demand sync (disabled=");
            sb.append(remoteConfigManager.disabled);
            sb.append(", user known=");
            sb.append(str != null);
            sb.append(").");
            currentLogHandler3.v(strM, sb.toString());
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object awaitInFlightRefresh(p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20551 c20551;
        S7.InterfaceC0900p interfaceC0900p;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20551) {
            c20551 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20551) cVar;
            int i3 = c20551.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20551.label = i3 - Integer.MIN_VALUE;
            } else {
                c20551 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20551(cVar);
            }
        } else {
            c20551 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20551(cVar);
        }
        java.lang.Object obj = c20551.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20551.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            synchronized (this.cacheLock) {
                interfaceC0900p = this.refreshCompletion;
            }
            if (interfaceC0900p == null) {
                return java.lang.Boolean.FALSE;
            }
            c20551.label = 1;
            if (((S7.C0901q) interfaceC0900p).k(c20551) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return java.lang.Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object committedItem(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20571 c20571;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20571) {
            c20571 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20571) cVar;
            int i3 = c20571.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20571.label = i3 - Integer.MIN_VALUE;
            } else {
                c20571 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20571(cVar);
            }
        } else {
            c20571 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20571(cVar);
        }
        java.lang.Object obj = c20571.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20571.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic = this.topicStore.topic(remoteConfigTopic);
            if (configTopic != null && (configItem = (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) configTopic.get((java.lang.Object) str)) != null) {
                return configItem;
            }
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Remote config item '" + str + "' not committed yet; awaiting config.");
            }
            c20571.L$0 = this;
            c20571.L$1 = remoteConfigTopic;
            c20571.L$2 = str;
            c20571.label = 1;
            if (awaitConfigForRead(c20571) == aVar) {
                return aVar;
            }
            remoteConfigManager = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) c20571.L$2;
            remoteConfigTopic = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic) c20571.L$1;
            remoteConfigManager = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager) c20571.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic2 = remoteConfigManager.topicStore.topic(remoteConfigTopic);
        com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem2 = configTopic2 != null ? (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) configTopic2.get((java.lang.Object) str) : null;
        if (configItem2 == null) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - "));
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Remote config item '", str, "' not found in topic '");
                sbQ.append(remoteConfigTopic.getWireName());
                sbQ.append("'.");
                currentLogHandler2.v(strM, sbQ.toString());
            }
        }
        return configItem2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00b2, please report this as an issue */
    public final java.lang.Object committedTopic(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20581 c20581;
        com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic2;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager;
        com.revenuecat.purchases.LogLevel logLevel;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20581) {
            c20581 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20581) cVar;
            int i3 = c20581.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20581.label = i3 - Integer.MIN_VALUE;
            } else {
                c20581 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20581(cVar);
            }
        } else {
            c20581 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20581(cVar);
        }
        java.lang.Object obj = c20581.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20581.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.disabled) {
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                    return null;
                }
                currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Remote config disabled (4xx); skipping topic read '" + remoteConfigTopic.getWireName() + "'.");
                return null;
            }
            configTopic = this.topicStore.topic(remoteConfigTopic);
            if (configTopic == null) {
                c20581.L$0 = remoteConfigTopic;
                c20581.L$1 = this;
                c20581.label = 1;
                if (awaitConfigForRead(c20581) == aVar) {
                    return aVar;
                }
                remoteConfigTopic2 = remoteConfigTopic;
                remoteConfigManager = this;
            }
            logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                if (configTopic != null) {
                    str = configTopic.size() + " items";
                    if (str == null) {
                        str = "not cached";
                    }
                } else {
                    str = "not cached";
                }
                currentLogHandler.v(strM, "Reading remote config topic '" + remoteConfigTopic.getWireName() + "': " + str + '.');
            }
            return configTopic;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        remoteConfigManager = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager) c20581.L$1;
        remoteConfigTopic2 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic) c20581.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        configTopic = remoteConfigManager.topicStore.topic(remoteConfigTopic2);
        remoteConfigTopic = remoteConfigTopic2;
        logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            java.lang.String strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
            if (configTopic != null) {
                str = configTopic.size() + " items";
                if (str == null) {
                    str = "not cached";
                }
            } else {
                str = "not cached";
            }
            currentLogHandler.v(strM2, "Reading remote config topic '" + remoteConfigTopic.getWireName() + "': " + str + '.');
        }
        return configTopic;
    }

    private final void completeRefresh() {
        S7.InterfaceC0900p interfaceC0900p = this.refreshCompletion;
        if (interfaceC0900p != null) {
            ((S7.C0901q) interfaceC0900p).J(p070h6.A.f22523a);
        }
        this.refreshCompletion = null;
    }

    private final void extractInlineBlobs(com.revenuecat.purchases.common.networking.RCContainer container, java.util.Set<java.lang.String> refsToKeep) {
        for (com.revenuecat.purchases.common.networking.RCElement rCElement : container.getContentElements()) {
            java.lang.String strChecksumBase64 = rCElement.checksumBase64();
            if (refsToKeep.contains(strChecksumBase64) && !this.blobStore.contains(strChecksumBase64)) {
                try {
                    byte[] bArrDecode = rCElement.decode();
                    if (this.blobStore.write(strChecksumBase64, bArrDecode)) {
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Stored inlined remote config blob '", strChecksumBase64, "' (");
                            sbQ.append(bArrDecode.length);
                            sbQ.append(" bytes).");
                            currentLogHandler.v(strM, sbQ.toString());
                        }
                    }
                } catch (com.revenuecat.purchases.common.networking.RCContainerFormatException e6) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", Y6.f.h("Skipping remote config blob '", strChecksumBase64, "': could not decode or verify its content."), e6);
                }
            }
        }
    }

    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext fetchContextForRequest(com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext requested) {
        return this.hasCommittedInitialConfig ? requested : com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext.AppStart;
    }

    private final void fetchFromFallback(int requestEpoch, boolean appInBackground, java.lang.String domain) throws java.lang.Throwable {
        if (this.epoch.get() != requestEpoch) {
            return;
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Main remote config request failed with no cached config; trying the fallback endpoint.");
        }
        this.backend.getRemoteConfigFallback(appInBackground, domain, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20602(requestEpoch), new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass3(requestEpoch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMainRefreshError(int requestEpoch, boolean appInBackground, java.lang.String domain, boolean hasCachedConfig, com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior behavior) throws java.lang.Throwable {
        if (behavior != com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior.SHOULD_RETRY || hasCachedConfig) {
            handleRefreshError(requestEpoch, error, behavior);
        } else {
            fetchFromFallback(requestEpoch, appInBackground, domain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMainRefreshSuccess(int requestEpoch, com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persisted, com.revenuecat.purchases.common.networking.RCContainer container) {
        if (this.epoch.get() != requestEpoch) {
            return;
        }
        if (container == null) {
            handleNotModified(requestEpoch);
        } else {
            S7.C.A(this.scope, null, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20611(container, this, requestEpoch, persisted, null), 3);
        }
    }

    private final void handleNotModified(int requestEpoch) {
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Remote config unchanged (204 Not Modified).");
        }
        synchronized (this.cacheLock) {
            if (this.epoch.get() == requestEpoch) {
                this.lastRefreshedAt = this.dateProvider.getNow();
                this.hasCommittedInitialConfig = true;
                this.isRefreshing.set(false);
                completeRefresh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRefreshError(int requestEpoch, com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior behavior) {
        if (behavior == com.revenuecat.purchases.common.GetRemoteConfigErrorHandlingBehavior.SHOULD_DISABLE && !this.disabled) {
            this.disabled = true;
            int iIncrementAndGet = this.generation.incrementAndGet();
            java.util.Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener) it.next()).onConfigInvalidated(iIncrementAndGet);
            }
            java.util.Iterator<T> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener) it2.next()).onRemoteConfigDisabled(iIncrementAndGet);
            }
        }
        if (releaseGuardIfOwned(requestEpoch)) {
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(error);
        }
    }

    private final boolean isRefreshAttemptCooldownElapsed(java.util.Date now) {
        java.util.Date date = this.lastRefreshAttemptAt;
        return date == null || P7.b.c(com.revenuecat.purchases.common.DurationExtensionsKt.between(P7.b.f8168i, date, now), REFRESH_ATTEMPT_COOLDOWN) >= 0;
    }

    private final void logRefreshStart(com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persisted, boolean appInBackground) {
        java.lang.String domain;
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Refreshing remote config (domain=");
            if (persisted == null || (domain = persisted.getDomain()) == null) {
                domain = "app";
            }
            sb.append(domain);
            sb.append(", manifest present=");
            sb.append((persisted != null ? persisted.getManifest() : null) != null);
            sb.append(", appInBackground=");
            sb.append(appInBackground);
            sb.append(").");
            currentLogHandler.v(strM, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object mergedBlobObject(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.util.Collection<java.lang.String> collection, p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20641 c20641;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic2;
        java.util.List<java.lang.String> list;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20641) {
            c20641 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20641) cVar;
            int i3 = c20641.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20641.label = i3 - Integer.MIN_VALUE;
            } else {
                c20641 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20641(cVar);
            }
        } else {
            c20641 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20641(cVar);
        }
        java.lang.Object objM = c20641.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20641.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objM);
            if (this.disabled) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Remote config disabled (4xx); skipping merged read for topic '" + remoteConfigTopic.getWireName() + "'.");
                }
                return null;
            }
            java.util.List listC1 = p078i6.o.c1(collection);
            if (listC1.isEmpty()) {
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "No item keys requested for merged remote config read in topic '" + remoteConfigTopic.getWireName() + "'.");
                }
                return null;
            }
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergedBlobObject$resolved$1 remoteConfigManager$mergedBlobObject$resolved$1 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$mergedBlobObject$resolved$1(listC1, this, remoteConfigTopic, null);
            c20641.L$0 = remoteConfigTopic;
            c20641.L$1 = listC1;
            c20641.label = 1;
            objM = S7.C.m(remoteConfigManager$mergedBlobObject$resolved$1, c20641);
            if (objM == aVar) {
                return aVar;
            }
            remoteConfigTopic2 = remoteConfigTopic;
            list = listC1;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) c20641.L$1;
            remoteConfigTopic2 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic) c20641.L$0;
            com.google.common.util.concurrent.P.u0(objM);
        }
        java.util.Map map = (java.util.Map) objM;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((byte[]) entry.getValue()) == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set setKeySet = linkedHashMap.keySet();
        if (!setKeySet.isEmpty()) {
            com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.WARN;
            com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                currentLogHandler3.w(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), "Could not resolve remote config blob(s) for " + setKeySet.size() + " of " + map.size() + " requested item(s) in topic '" + remoteConfigTopic2.getWireName() + "': " + setKeySet + ". Returning null.");
            }
            return null;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.String str : list) {
            try {
                p162s8.d defaultJson = com.revenuecat.purchases.common.JsonProvider.INSTANCE.getDefaultJson();
                java.lang.Object objM0 = p078i6.C.M0(str, map);
                kotlin.jvm.internal.m.b(objM0);
                linkedHashMap2.put(str, defaultJson.e(O7.x.n0((byte[]) objM0)));
            } catch (p119n8.j e6) {
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Remote config blob for item '", str, "' in topic '");
                sbQ.append(remoteConfigTopic2.getWireName());
                sbQ.append("' is not valid JSON.");
                currentLogHandler4.e("[Purchases] - ERROR", sbQ.toString(), e6);
                return null;
            }
        }
        return new kotlinx.serialization.json.c(linkedHashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persist(com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState previous, com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration response, com.revenuecat.purchases.common.networking.RCContainer container) {
        java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics;
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
            java.lang.String strO1 = p078i6.o.o1(response.getTopics().entrySet(), null, null, null, com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$persist$1$changed$1.INSTANCE, 31);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Received remote config: active topics=");
            sb.append(response.getActiveTopics());
            sb.append("; changed topics: [");
            if (strO1.length() == 0) {
                strO1 = "none";
            }
            sb.append(strO1);
            sb.append("].");
            currentLogHandler.d(strM, sb.toString());
        }
        if (previous == null || (topics = previous.getTopics()) == null) {
            topics = p078i6.x.f23206h;
        }
        java.util.LinkedHashMap linkedHashMapR0 = p078i6.C.R0(topics, response.getTopics());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : linkedHashMapR0.entrySet()) {
            if (response.getActiveTopics().contains((java.lang.String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set<java.lang.String> setO0 = p078i6.I.o0(p078i6.o.R1(response.getPrefetchBlobs()), p078i6.q.J0(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManagerKt.toTopicBlobRefs(linkedHashMap).values()));
        if (!this.diskCache.write(new com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState(response.getDomain(), response.getManifest(), response.getActiveTopics(), response.getPrefetchBlobs(), linkedHashMap))) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Skipping remote config blob sync: failed to persist the configuration.", null);
            return;
        }
        this.lastRefreshedAt = this.dateProvider.getNow();
        this.hasCommittedInitialConfig = true;
        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Persisted remote config (domain=" + response.getDomain() + ", " + response.getActiveTopics().size() + " active topics, " + setO0.size() + " blobs wanted).");
        }
        if (container != null) {
            extractInlineBlobs(container, setO0);
        }
        this.blobStore.retainOnly(setO0);
        prefetchBlobs(response, linkedHashMap);
        int iIncrementAndGet = this.generation.incrementAndGet();
        java.util.Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener) it.next()).onConfigCommitted(iIncrementAndGet);
        }
    }

    private final void prefetchBlobs(com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration response, java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> mergedTopics) {
        java.lang.String blobRef;
        this.sourceProvider.restartIfExhausted(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose.BLOB);
        p086j6.b bVarU = com.google.common.util.concurrent.P.U();
        bVarU.addAll(response.getPrefetchBlobs());
        java.util.Iterator<T> it = mergedTopics.values().iterator();
        while (it.hasNext()) {
            for (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem : ((com.revenuecat.purchases.common.remoteconfig.ConfigTopic) it.next()).values()) {
                if (configItem.getPrefetch() && (blobRef = configItem.getBlobRef()) != null) {
                    bVarU.add(blobRef);
                }
            }
        }
        java.util.List listC1 = p078i6.o.c1(com.google.common.util.concurrent.P.M(bVarU));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listC1) {
            if (!this.blobStore.contains((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Prefetching " + arrayList.size() + " remote config blob(s).");
        }
        this.blobFetcher.prefetch(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean releaseGuardIfOwned(int requestEpoch) {
        boolean z6;
        synchronized (this.cacheLock) {
            z6 = this.epoch.get() == requestEpoch;
            if (z6) {
                this.isRefreshing.set(false);
                completeRefresh();
            }
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0181  */
    /* JADX WARN: Code duplicated, block: B:54:0x0196  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object resolveBlobBytes(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.lang.String str, p100l6.c cVar) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20671 c20671;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager2;
        java.lang.String str2;
        com.revenuecat.purchases.LogLevel logLevel;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        byte[] bArr;
        com.revenuecat.purchases.LogLevel logLevel2;
        com.revenuecat.purchases.LogHandler currentLogHandler2;
        com.revenuecat.purchases.LogLevel logLevel3;
        com.revenuecat.purchases.LogHandler currentLogHandler3;
        if (cVar instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20671) {
            c20671 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20671) cVar;
            int i3 = c20671.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20671.label = i3 - Integer.MIN_VALUE;
            } else {
                c20671 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20671(cVar);
            }
        } else {
            c20671 = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20671(cVar);
        }
        java.lang.Object objCommittedItem = c20671.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c20671.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objCommittedItem);
            if (this.disabled) {
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.v(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), "Remote config disabled (4xx); skipping read of item '" + str + "'.");
                }
                return null;
            }
            com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                currentLogHandler5.v(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), "Reading remote config blob (topic='" + remoteConfigTopic.getWireName() + "', item='" + str + "').");
            }
            c20671.L$0 = this;
            c20671.L$1 = str;
            c20671.label = 1;
            objCommittedItem = committedItem(remoteConfigTopic, str, c20671);
            if (objCommittedItem != aVar) {
                remoteConfigManager = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            str = (java.lang.String) c20671.L$1;
            remoteConfigManager = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager) c20671.L$0;
            com.google.common.util.concurrent.P.u0(objCommittedItem);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) c20671.L$2;
            str = (java.lang.String) c20671.L$1;
            remoteConfigManager2 = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager) c20671.L$0;
            com.google.common.util.concurrent.P.u0(objCommittedItem);
        }
        if (((java.lang.Boolean) objCommittedItem).booleanValue()) {
            logLevel = com.revenuecat.purchases.LogLevel.WARN;
            currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), Y6.f.i("Failed to resolve remote config blob '", str2, "' for item '", str, "'."));
            }
            return null;
        }
        bArr = remoteConfigManager2.blobStore.read(str2);
        if (bArr != null) {
            logLevel3 = com.revenuecat.purchases.LogLevel.VERBOSE;
            currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - "));
                java.lang.StringBuilder sbO = Y6.f.o("Resolved '", str, "' from remote config blob '", str2, "' (");
                sbO.append(bArr.length);
                sbO.append(" bytes).");
                currentLogHandler3.v(strM, sbO.toString());
                return bArr;
            }
        } else {
            logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
            currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), Y6.f.i("Remote config blob '", str2, "' for item '", str, "' downloaded but read back null."));
            }
        }
        return bArr;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem = (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) objCommittedItem;
        java.lang.String blobRef = configItem != null ? configItem.getBlobRef() : null;
        if (blobRef == null) {
            com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                currentLogHandler6.v(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), "Remote config item '" + str + "' is missing or has no blob ref; returning null.");
            }
            return null;
        }
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher remoteConfigBlobFetcher = remoteConfigManager.blobFetcher;
        c20671.L$0 = remoteConfigManager;
        c20671.L$1 = str;
        c20671.L$2 = blobRef;
        c20671.label = 2;
        java.lang.Object objEnsureDownloaded = remoteConfigBlobFetcher.ensureDownloaded(blobRef, c20671);
        if (objEnsureDownloaded != aVar) {
            remoteConfigManager2 = remoteConfigManager;
            str2 = blobRef;
            objCommittedItem = objEnsureDownloaded;
            if (((java.lang.Boolean) objCommittedItem).booleanValue()) {
                logLevel = com.revenuecat.purchases.LogLevel.WARN;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.w(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), Y6.f.i("Failed to resolve remote config blob '", str2, "' for item '", str, "'."));
                }
                return null;
            }
            bArr = remoteConfigManager2.blobStore.read(str2);
            if (bArr != null) {
                logLevel3 = com.revenuecat.purchases.LogLevel.VERBOSE;
                currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    java.lang.String strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - "));
                    java.lang.StringBuilder sbO2 = Y6.f.o("Resolved '", str, "' from remote config blob '", str2, "' (");
                    sbO2.append(bArr.length);
                    sbO2.append(" bytes).");
                    currentLogHandler3.v(strM2, sbO2.toString());
                    return bArr;
                }
            } else {
                logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), Y6.f.i("Remote config blob '", str2, "' for item '", str, "' downloaded but read back null."));
                }
            }
            return bArr;
        }
        return aVar;
    }

    public final java.lang.Object awaitTopicAndPrefetchBlobsReady(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
        return S7.C.K(this.ioDispatcher, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass2(remoteConfigTopic, null), cVar);
    }

    public final <T> java.lang.Object blobData(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.lang.String str, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final void clearCache(java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        S7.C.l(this.scope.getCoroutineContext());
        synchronized (this.cacheLock) {
            this.epoch.incrementAndGet();
            this.currentAppUserID = appUserID;
            this.isRefreshing.set(false);
            this.lastRefreshedAt = null;
            this.lastRefreshAttemptAt = null;
            completeRefresh();
            this.diskCache.clear();
            this.blobStore.clear();
            this.sourceProvider.clear();
            int iIncrementAndGet = this.generation.incrementAndGet();
            java.util.Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener) it.next()).onConfigInvalidated(iIncrementAndGet);
            }
        }
    }

    public final void close() {
        S7.C.i(this.scope, null);
        synchronized (this.cacheLock) {
            this.isRefreshing.set(false);
            completeRefresh();
        }
    }

    public final java.lang.Object committedTopicOrNull(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
        return S7.C.K(this.ioDispatcher, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20592(remoteConfigTopic, null), cVar);
    }

    public final int getConfigGeneration() {
        return this.generation.get();
    }

    /* JADX INFO: renamed from: isDisabled, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final <T> java.lang.Object mergeItemsBlobData(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.util.Collection<java.lang.String> collection, p100l6.c cVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final void refreshRemoteConfig(boolean appInBackground, java.lang.String appUserID, com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext fetchContext) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(fetchContext, "fetchContext");
        refreshRemoteConfig(appInBackground, appUserID, fetchContext, false);
    }

    public final void refreshRemoteConfigIfStale(boolean appInBackground, java.lang.String appUserID, com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext fetchContext) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(fetchContext, "fetchContext");
        if (com.revenuecat.purchases.common.caching.DateExtensionsKt.isCacheStale(this.lastRefreshedAt, appInBackground, this.dateProvider)) {
            refreshRemoteConfig(appInBackground, appUserID, fetchContext, true);
        }
    }

    public final void registerListener(com.revenuecat.purchases.common.remoteconfig.RemoteConfigCommitListener listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        this.listeners.add(listener);
    }

    public final java.lang.Object topic(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, p100l6.c cVar) {
        return S7.C.K(this.ioDispatcher, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20682(remoteConfigTopic, null), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [i6.w] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revenuecat.purchases.common.Backend] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void refreshRemoteConfig(boolean appInBackground, java.lang.String appUserID, com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext fetchContext, boolean staleGated) {
        boolean z6;
        java.lang.String str;
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext remoteConfigFetchContext;
        java.lang.String domain;
        ?? arrayList;
        java.util.List<java.lang.String> prefetchBlobs;
        if (this.disabled) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Remote config is disabled for this session (4xx). Skipping refresh.");
                return;
            }
            return;
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        synchronized (this.cacheLock) {
            try {
                java.util.Date now = this.dateProvider.getNow();
                z6 = false;
                if (this.isRefreshing.get()) {
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Remote config refresh already in progress. Skipping.");
                    }
                } else if (!staleGated || isRefreshAttemptCooldownElapsed(now)) {
                    if (staleGated) {
                        this.lastRefreshAttemptAt = now;
                    }
                    z6 = true;
                    this.isRefreshing.set(true);
                    yVar.f24555h = this.epoch.get();
                    java.lang.String str2 = this.currentAppUserID;
                    if (str2 == null) {
                        str2 = appUserID;
                    }
                    com.revenuecat.purchases.common.remoteconfig.RemoteConfigFetchContext remoteConfigFetchContextFetchContextForRequest = fetchContextForRequest(fetchContext);
                    this.refreshCompletion = S7.C.b();
                    str = str2;
                    remoteConfigFetchContext = remoteConfigFetchContextFetchContextForRequest;
                } else {
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Remote config refresh was attempted recently. Skipping stale-gated refresh.");
                    }
                }
                str = appUserID;
                remoteConfigFetchContext = fetchContext;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState = this.diskCache.read();
            java.util.Set<java.lang.String> setCachedRefs = this.blobStore.cachedRefs();
            if (persistedRemoteConfigurationState == null || (domain = persistedRemoteConfigurationState.getDomain()) == null) {
                domain = "app";
            }
            java.lang.String str3 = domain;
            logRefreshStart(persistedRemoteConfigurationState, appInBackground);
            ?? r9 = this.backend;
            java.lang.String manifest = persistedRemoteConfigurationState != null ? persistedRemoteConfigurationState.getManifest() : null;
            if (persistedRemoteConfigurationState == null || (prefetchBlobs = persistedRemoteConfigurationState.getPrefetchBlobs()) == null) {
                arrayList = p078i6.w.f23205h;
            } else {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : prefetchBlobs) {
                    if (setCachedRefs.contains((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            r9.getRemoteConfig(appInBackground, str, remoteConfigFetchContext, str3, manifest, arrayList, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20653(yVar, persistedRemoteConfigurationState), new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20664(yVar, appInBackground, str3, persistedRemoteConfigurationState));
        }
    }

    public final <T> java.lang.Object blobData(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return S7.C.K(this.ioDispatcher, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass4(remoteConfigTopic, str, jVar, null), cVar);
    }

    public final <T> java.lang.Object mergeItemsBlobData(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic, java.util.Collection<java.lang.String> collection, p194x6.j jVar, p100l6.c cVar) {
        return S7.C.K(this.ioDispatcher, new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.C20634(remoteConfigTopic, collection, jVar, null), cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteConfigManager(com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.remoteconfig.RemoteConfigDiskCache remoteConfigDiskCache, com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobStore remoteConfigBlobStore, com.revenuecat.purchases.common.DateProvider dateProvider, S7.A a2, S7.AbstractC0906w abstractC0906w, com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopicStore remoteConfigTopicStore, com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceProvider remoteConfigSourceProvider, com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher remoteConfigBlobFetcher, kotlin.jvm.functions.Function0 function0, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        S7.A aC;
        S7.AbstractC0906w abstractC0906w2;
        com.revenuecat.purchases.common.DateProvider defaultDateProvider = (i3 & 8) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider;
        if ((i3 & 16) != 0) {
            S7.y0 y0VarE = S7.C.e();
            Z7.e eVar = S7.M.f9549a;
            aC = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, Z7.d.f13044i));
        } else {
            aC = a2;
        }
        if ((i3 & 32) != 0) {
            Z7.e eVar2 = S7.M.f9549a;
            abstractC0906w2 = Z7.d.f13044i;
        } else {
            abstractC0906w2 = abstractC0906w;
        }
        this(backend, remoteConfigDiskCache, remoteConfigBlobStore, defaultDateProvider, aC, abstractC0906w2, remoteConfigTopicStore, remoteConfigSourceProvider, (i3 & 256) != 0 ? new com.revenuecat.purchases.common.remoteconfig.RemoteConfigBlobFetcher(remoteConfigBlobStore, remoteConfigSourceProvider, null, null, 12, null) : remoteConfigBlobFetcher, (i3 & 512) != 0 ? com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager.AnonymousClass1.INSTANCE : function0);
    }
}
