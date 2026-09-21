package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142 \u0010\u0017\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u00112\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\u00112\n\u0010\"\u001a\u00060\rj\u0002`!2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00112\n\u0010&\u001a\u00060\rj\u0002`!2\n\u0010'\u001a\u00060\rj\u0002`!¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\"\u0010\u0017\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`*\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0004\b+\u0010,J7\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0010\u00103\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f¢\u0006\u0004\b4\u00105J1\u00106\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "", "automaticDeviceIdentifierCollectionEnabled", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;Z)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "Lh6/A;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lx6/j;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;Lx6/j;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "data", "setAppsFlyerConversionData", "(Ljava/lang/String;Ljava/util/Map;)V", "setAppstackAttributionParams", "(Ljava/lang/String;Ljava/util/Map;Landroid/app/Application;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Z", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "ObtainDeviceIdentifiersObservable", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesManager {
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster backend;
    private final com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache deviceCache;
    private final com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00128BX\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "Lh6/A;", "completion", "waitUntilIdle", "(Lkotlin/jvm/functions/Function0;)V", "", "value", "numberOfProcesses", "I", "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ObtainDeviceIdentifiersObservable extends java.util.Observable {
        private final java.util.ArrayList<kotlin.jvm.functions.Function0> listeners = new java.util.ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new java.util.Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(java.util.Observable observable, java.lang.Object obj) {
                    com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f21073a, observable, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, java.util.Observable observable, java.lang.Object obj) {
            kotlin.jvm.internal.m.c(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        java.util.Iterator<T> it = obtainDeviceIdentifiersObservable.listeners.iterator();
                        while (it.hasNext()) {
                            ((kotlin.jvm.functions.Function0) it.next()).invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i3) {
            if (this.numberOfProcesses == i3) {
                return;
            }
            this.numberOfProcesses = i3;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(kotlin.jvm.functions.Function0 completion) {
            try {
                kotlin.jvm.internal.m.e(completion, "completion");
                if (this.numberOfProcesses == 0) {
                    completion.invoke();
                } else {
                    this.listeners.add(new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(completion));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.lang.String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.lang.String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.Map<java.lang.String, java.lang.String>) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.Map<java.lang.String, java.lang.String> deviceIdentifiers) {
            kotlin.jvm.internal.m.e(deviceIdentifiers, "deviceIdentifiers");
            com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.this.setAttributes(deviceIdentifiers, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20991 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $completion;
        final /* synthetic */ com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20991(p194x6.j jVar, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = jVar;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.Map<java.lang.String, java.lang.String>) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.Map<java.lang.String, java.lang.String> deviceIdentifiers) {
            kotlin.jvm.internal.m.e(deviceIdentifiers, "deviceIdentifiers");
            this.$completion.invoke(deviceIdentifiers);
            com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.this$0.obtainingDeviceIdentifiersObservable;
            obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21001 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ p194x6.j $completion;
        final /* synthetic */ com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21001(p194x6.j jVar, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, java.lang.String str) {
            super(0);
            this.$completion = jVar;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m280invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m280invoke() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21011 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $setAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21011(p194x6.j jVar) {
            super(1);
            this.$setAttributes = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.Map<java.lang.String, java.lang.String>) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.Map<java.lang.String, java.lang.String> deviceIdentifiers) {
            kotlin.jvm.internal.m.e(deviceIdentifiers, "deviceIdentifiers");
            this.$setAttributes.invoke(deviceIdentifiers);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21021 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ kotlin.jvm.functions.Function0 $completion;
        final /* synthetic */ java.lang.String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21021(kotlin.jvm.functions.Function0 function0, java.lang.String str) {
            super(0);
            this.$completion = function0;
            this.$currentAppUserID = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m281invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m281invoke() {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> unsyncedSubscriberAttributes = com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!O7.q.N0(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                int size = linkedHashMap.size();
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager = com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.this;
                kotlin.jvm.internal.y yVar2 = yVar;
                java.lang.String str2 = this.$currentAppUserID;
                kotlin.jvm.functions.Function0 function0 = this.$completion;
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry2.getKey();
                    java.util.Map map = (java.util.Map) entry2.getValue();
                    com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster backend = subscriberAttributesManager.getBackend();
                    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> backendMap = com.revenuecat.purchases.subscriberattributes.BackendHelpersKt.toBackendMap(map);
                    com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1(subscriberAttributesManager, str3, map, str2, yVar2, function0, size);
                    java.lang.String str4 = str2;
                    kotlin.jvm.internal.y yVar3 = yVar2;
                    kotlin.jvm.functions.Function0 function1 = function0;
                    com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2(subscriberAttributesManager, str3, map, yVar3, function1, size);
                    function0 = function1;
                    yVar2 = yVar3;
                    backend.postSubscriberAttributes(backendMap, str3, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2);
                    str2 = str4;
                }
                return;
            }
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            kotlin.jvm.functions.Function0 function2 = this.$completion;
            if (function2 != null) {
                function2.invoke();
            }
        }
    }

    public SubscriberAttributesManager(com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache deviceCache, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster backend, com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher deviceIdentifiersFetcher, boolean z6) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.automaticDeviceIdentifierCollectionEnabled = z6;
        this.obtainingDeviceIdentifiersObservable = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(android.app.Application applicationContext, p194x6.j completion) {
        com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(applicationContext, new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.C20991(completion, this));
    }

    private final void storeAttributesIfNeeded(java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> attributesAsObjects, java.lang.String appUserID) {
        java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry : attributesAsObjects.entrySet()) {
            java.lang.String key = entry.getKey();
            com.revenuecat.purchases.subscriberattributes.SubscriberAttribute value = entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                com.revenuecat.purchases.subscriberattributes.SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (!kotlin.jvm.internal.m.a(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.deviceCache.setAttributes(appUserID, linkedHashMap);
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, function0);
    }

    public final void collectDeviceIdentifiers(java.lang.String appUserID, android.app.Application applicationContext) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.AnonymousClass1(appUserID));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(java.lang.String originalAppUserId, java.lang.String newAppUserID) {
        try {
            kotlin.jvm.internal.m.e(originalAppUserId, "originalAppUserId");
            kotlin.jvm.internal.m.e(newAppUserID, "newAppUserID");
            java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(originalAppUserId);
            if (unsyncedSubscriberAttributes.isEmpty()) {
                return;
            }
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.INFO;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), java.lang.String.format(com.revenuecat.purchases.strings.AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, java.util.Arrays.copyOf(new java.lang.Object[]{originalAppUserId, newAppUserID}, 2)));
            }
            this.deviceCache.setAttributes(newAppUserID, unsyncedSubscriberAttributes);
            this.deviceCache.clearAllSubscriberAttributesFromUser(originalAppUserId);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(java.lang.String appUserID, p194x6.j completion) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(completion, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.C21001(completion, this, appUserID));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final synchronized void markAsSynced(java.lang.String appUserID, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> attributesToMarkAsSynced, java.util.List<com.revenuecat.purchases.common.SubscriberAttributeError> attributeErrors) {
        java.lang.String str;
        com.revenuecat.purchases.subscriberattributes.SubscriberAttribute subscriberAttribute;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str2;
        java.lang.String str3;
        try {
            kotlin.jvm.internal.m.e(appUserID, "appUserID");
            kotlin.jvm.internal.m.e(attributesToMarkAsSynced, "attributesToMarkAsSynced");
            kotlin.jvm.internal.m.e(attributeErrors, "attributeErrors");
            if (!attributeErrors.isEmpty()) {
                com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_ERROR;
                str = "[Purchases] - ";
                com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$markAsSynced$$inlined$log$1 subscriberAttributesManager$markAsSynced$$inlined$log$1 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$markAsSynced$$inlined$log$1(logIntent, attributeErrors);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                }
            } else {
                str = "[Purchases] - ";
            }
            if (attributesToMarkAsSynced.isEmpty()) {
                return;
            }
            com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.INFO;
            com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$markAsSynced$$inlined$log$2 subscriberAttributesManager$markAsSynced$$inlined$log$2 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$markAsSynced$$inlined$log$2(logIntent2, appUserID, attributesToMarkAsSynced);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    subscriberAttribute = null;
                    com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    subscriberAttribute = null;
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(str + logLevel20.name(), (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                default:
                    subscriberAttribute = null;
                    break;
            }
            java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
            java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(allStoredSubscriberAttributes);
            for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry : attributesToMarkAsSynced.entrySet()) {
                java.lang.String key = entry.getKey();
                com.revenuecat.purchases.subscriberattributes.SubscriberAttribute value = entry.getValue();
                com.revenuecat.purchases.subscriberattributes.SubscriberAttribute subscriberAttribute2 = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute2 != null) {
                    if (subscriberAttribute2.isSynced()) {
                        subscriberAttribute2 = subscriberAttribute;
                    }
                    if (subscriberAttribute2 != null) {
                        if (!kotlin.jvm.internal.m.a(subscriberAttribute2.getValue(), value.getValue())) {
                            subscriberAttribute2 = subscriberAttribute;
                        }
                        if (subscriberAttribute2 != null) {
                            linkedHashMapZ0.put(key, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(appUserID, linkedHashMapZ0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void setAppsFlyerConversionData(java.lang.String appUserID, java.util.Map<?, ?> data) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        if (data == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String stringValueForPrimitive = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "media_source");
        if (stringValueForPrimitive != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), stringValueForPrimitive);
        } else {
            java.lang.String stringValueForPrimitive2 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "af_status");
            if (stringValueForPrimitive2 != null && stringValueForPrimitive2.equalsIgnoreCase("Organic")) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), "Organic");
            }
        }
        java.lang.String stringValueForPrimitive3 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "campaign");
        if (stringValueForPrimitive3 != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), stringValueForPrimitive3);
        }
        java.lang.String stringValueForPrimitive4 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "adgroup");
        if (stringValueForPrimitive4 == null) {
            stringValueForPrimitive4 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "adset");
        }
        if (stringValueForPrimitive4 != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), stringValueForPrimitive4);
        }
        java.lang.String stringValueForPrimitive5 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "af_ad");
        if (stringValueForPrimitive5 == null) {
            stringValueForPrimitive5 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "ad_id");
        }
        if (stringValueForPrimitive5 != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), stringValueForPrimitive5);
        }
        java.lang.String stringValueForPrimitive6 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "af_keywords");
        if (stringValueForPrimitive6 == null) {
            stringValueForPrimitive6 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "keyword");
        }
        if (stringValueForPrimitive6 != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), stringValueForPrimitive6);
        }
        java.lang.String stringValueForPrimitive7 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "creative");
        if (stringValueForPrimitive7 == null) {
            stringValueForPrimitive7 = com.revenuecat.purchases.utils.MapExtensionsKt.getStringValueForPrimitive(data, "af_creative");
        }
        if (stringValueForPrimitive7 != null) {
            linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE.getBackendKey(), stringValueForPrimitive7);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        setAttributes(linkedHashMap, appUserID);
    }

    public final void setAppstackAttributionParams(java.lang.String appUserID, java.util.Map<java.lang.String, java.lang.String> data, android.app.Application applicationContext) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = data.get("appstack_adnetwork");
        if (str != null) {
            if (O7.q.N0(str)) {
                str = null;
            }
            if (str != null) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), str);
                linkedHashMap.put("appstack_adnetwork", str);
            }
        }
        java.lang.String str2 = data.get("appstack_campaign");
        if (str2 != null) {
            if (O7.q.N0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), str2);
                linkedHashMap.put("appstack_campaign", str2);
            }
        }
        java.lang.String str3 = data.get("appstack_adset");
        if (str3 != null) {
            if (O7.q.N0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), str3);
                linkedHashMap.put("appstack_adset", str3);
            }
        }
        java.lang.String str4 = data.get("appstack_ad");
        if (str4 != null) {
            if (O7.q.N0(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), str4);
                linkedHashMap.put("appstack_ad", str4);
            }
        }
        java.lang.String str5 = data.get("appstack_keywords");
        if (str5 != null) {
            if (O7.q.N0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                linkedHashMap.put(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), str5);
                linkedHashMap.put("appstack_keywords", str5);
            }
        }
        for (java.lang.String str6 : p078i6.p.B0("fbclid", "gclid", "wbraid", "gbraid", "ttclid")) {
            java.lang.String str7 = data.get(str6);
            if (str7 != null) {
                if (O7.q.N0(str7)) {
                    str7 = null;
                }
                if (str7 != null) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            setAttributes(linkedHashMap, appUserID);
        }
        java.lang.String str8 = data.get("appstack_id");
        if (str8 != null) {
            java.lang.String str9 = O7.q.N0(str8) ? null : str8;
            if (str9 != null) {
                setAttributionID(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Appstack.INSTANCE, str9, appUserID, applicationContext);
            }
        }
    }

    public final synchronized void setAttribute(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey key, java.lang.String value, java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        setAttributes(p078i6.D.J0(new p070h6.k(key.getBackendKey(), value)), appUserID);
    }

    public final synchronized void setAttributes(java.util.Map<java.lang.String, java.lang.String> attributesToSet, java.lang.String appUserID) {
        try {
            kotlin.jvm.internal.m.e(attributesToSet, "attributesToSet");
            kotlin.jvm.internal.m.e(appUserID, "appUserID");
            java.util.ArrayList arrayList = new java.util.ArrayList(attributesToSet.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : attributesToSet.entrySet()) {
                java.lang.String key = entry.getKey();
                arrayList.add(new p070h6.k(key, new com.revenuecat.purchases.subscriberattributes.SubscriberAttribute(key, entry.getValue(), (com.revenuecat.purchases.common.DateProvider) null, (java.util.Date) null, false, 28, (kotlin.jvm.internal.AbstractC2541f) null)));
            }
            storeAttributesIfNeeded(p078i6.C.X0(arrayList), appUserID);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void setAttributionID(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds attributionKey, java.lang.String value, java.lang.String appUserID, android.app.Application applicationContext) {
        kotlin.jvm.internal.m.e(attributionKey, "attributionKey");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(applicationContext, "applicationContext");
        com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$setAttributes$1 subscriberAttributesManager$setAttributionID$setAttributes$1 = new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$setAttributes$1(attributionKey, value, this, appUserID);
        if (this.automaticDeviceIdentifierCollectionEnabled) {
            getDeviceIdentifiers(applicationContext, new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.C21011(subscriberAttributesManager$setAttributionID$setAttributes$1));
        } else {
            subscriberAttributesManager$setAttributionID$setAttributes$1.invoke((java.lang.Object) p078i6.x.f23206h);
        }
    }

    public final void synchronizeSubscriberAttributesForAllUsers(java.lang.String currentAppUserID, kotlin.jvm.functions.Function0 completion) {
        kotlin.jvm.internal.m.e(currentAppUserID, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.C21021(completion, currentAppUserID));
    }
}
