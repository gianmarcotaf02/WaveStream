package com.revenuecat.purchases.common.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012<\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\"J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\"J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\"J\u0017\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050+H\u0002¢\u0006\u0004\b.\u0010-J'\u00100\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106RJ\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0012\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R.\u0010;\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010F¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager;", "", "Ljava/util/UUID;", "appSessionID", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lkotlin/Function4;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "Lcom/revenuecat/purchases/common/Delay;", "Lkotlin/Function0;", "Lh6/A;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "postEvents", "Lcom/revenuecat/purchases/utils/RateLimiter;", "priorityFlushRateLimiter", "<init>", "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lx6/o;Lcom/revenuecat/purchases/utils/RateLimiter;)V", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "event", "track", "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V", "delay", "flushEvents", "(Lcom/revenuecat/purchases/common/Delay;)V", "checkFileSizeAndClearIfNeeded", "()V", "", "batchNumber", "flushNextBatch", "(ILcom/revenuecat/purchases/common/Delay;)V", "performPriorityFlush", "onFlushComplete", "startPendingPriorityFlushIfNeeded", "flushLegacyEvents", "", "getStoredEvents", "()Ljava/util/List;", "getLegacyPaywallsStoredEvents", "command", "enqueue", "(Lcom/revenuecat/purchases/common/Delay;Lkotlin/jvm/functions/Function0;)V", "appSessionID$1", "Ljava/util/UUID;", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lx6/o;", "Lcom/revenuecat/purchases/utils/RateLimiter;", "Lcom/revenuecat/purchases/DebugEventListener;", "value", "debugEventListener", "Lcom/revenuecat/purchases/DebugEventListener;", "getDebugEventListener", "()Lcom/revenuecat/purchases/DebugEventListener;", "setDebugEventListener", "(Lcom/revenuecat/purchases/DebugEventListener;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flushInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<set-?>", "pendingPriorityFlush", "Z", "legacyFlushTriggered", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EventsManager {
    public static final java.lang.String AD_EVENTS_FILE_PATH = "RevenueCat/event_store/ad_event_store.jsonl";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.events.EventsManager.Companion INSTANCE = new com.revenuecat.purchases.common.events.EventsManager.Companion(null);
    public static final java.lang.String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    public static final int EVENTS_TO_CLEAR_ON_LIMIT = 50;
    public static final double FILE_SIZE_LIMIT_KB = 2048.0d;
    private static final int FLUSH_COUNT = 50;
    private static final int MAX_FLUSH_BATCHES = 10;
    private static final java.lang.String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private static final java.util.UUID appSessionID;
    private static final p162s8.d json;

    /* JADX INFO: renamed from: appSessionID$1, reason: from kotlin metadata */
    private final java.util.UUID appSessionID;
    private com.revenuecat.purchases.DebugEventListener debugEventListener;
    private final com.revenuecat.purchases.common.Dispatcher eventsDispatcher;
    private final com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.common.events.BackendStoredEvent> fileHelper;
    private java.util.concurrent.atomic.AtomicBoolean flushInProgress;
    private final com.revenuecat.purchases.identity.IdentityManager identityManager;
    private final com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> legacyEventsFileHelper;
    private boolean legacyFlushTriggered;
    private boolean pendingPriorityFlush;
    private final p194x6.o postEvents;
    private final com.revenuecat.purchases.utils.RateLimiter priorityFlushRateLimiter;

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "backendEvents", "(Lcom/revenuecat/purchases/common/FileHelper;)Lcom/revenuecat/purchases/utils/EventsFileHelper;", "adEvents", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "paywalls", "", "FILE_SIZE_LIMIT_KB", "D", "getFILE_SIZE_LIMIT_KB$annotations", "", "EVENTS_TO_CLEAR_ON_LIMIT", "I", "getEVENTS_TO_CLEAR_ON_LIMIT$annotations", "Ls8/d;", "json", "Ls8/d;", "getJson$annotations", "Ljava/util/UUID;", "appSessionID", "Ljava/util/UUID;", "getAppSessionID$purchases_defaultsRelease", "()Ljava/util/UUID;", "", "AD_EVENTS_FILE_PATH", "Ljava/lang/String;", "EVENTS_FILE_PATH_NEW", "FLUSH_COUNT", "MAX_FLUSH_BATCHES", "PAYWALL_EVENTS_FILE_PATH", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public static /* synthetic */ void getEVENTS_TO_CLEAR_ON_LIMIT$annotations() {
        }

        public static /* synthetic */ void getFILE_SIZE_LIMIT_KB$annotations() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        public final com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.common.events.BackendStoredEvent> adEvents(com.revenuecat.purchases.common.FileHelper fileHelper) {
            kotlin.jvm.internal.m.e(fileHelper, "fileHelper");
            return new com.revenuecat.purchases.utils.EventsFileHelper<>(fileHelper, com.revenuecat.purchases.common.events.EventsManager.AD_EVENTS_FILE_PATH, com.revenuecat.purchases.common.events.EventsManager$Companion$adEvents$1.INSTANCE, com.revenuecat.purchases.common.events.EventsManager$Companion$adEvents$2.INSTANCE);
        }

        public final com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.common.events.BackendStoredEvent> backendEvents(com.revenuecat.purchases.common.FileHelper fileHelper) {
            kotlin.jvm.internal.m.e(fileHelper, "fileHelper");
            return new com.revenuecat.purchases.utils.EventsFileHelper<>(fileHelper, com.revenuecat.purchases.common.events.EventsManager.EVENTS_FILE_PATH_NEW, com.revenuecat.purchases.common.events.EventsManager$Companion$backendEvents$1.INSTANCE, com.revenuecat.purchases.common.events.EventsManager$Companion$backendEvents$2.INSTANCE);
        }

        public final java.util.UUID getAppSessionID$purchases_defaultsRelease() {
            return com.revenuecat.purchases.common.events.EventsManager.appSessionID;
        }

        public final com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> paywalls(com.revenuecat.purchases.common.FileHelper fileHelper) {
            kotlin.jvm.internal.m.e(fileHelper, "fileHelper");
            return new com.revenuecat.purchases.utils.EventsFileHelper<>(fileHelper, com.revenuecat.purchases.common.events.EventsManager.PAYWALL_EVENTS_FILE_PATH, com.revenuecat.purchases.common.events.EventsManager$Companion$paywalls$1.INSTANCE, new com.revenuecat.purchases.common.events.EventsManager$Companion$paywalls$2(com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.INSTANCE));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushEvents$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.common.Delay $delay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.revenuecat.purchases.common.Delay delay) {
            super(0);
            this.$delay = delay;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m151invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m151invoke() {
            if (com.revenuecat.purchases.common.events.EventsManager.this.flushInProgress.getAndSet(true)) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Flush already in progress.");
                    return;
                }
                return;
            }
            com.revenuecat.purchases.DebugEventListener debugEventListener = com.revenuecat.purchases.common.events.EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new com.revenuecat.purchases.DebugEvent(com.revenuecat.purchases.DebugEventName.FLUSH_STARTED, null, 2, null));
            }
            com.revenuecat.purchases.common.events.EventsManager.this.flushNextBatch(1, this.$delay);
            if (com.revenuecat.purchases.common.events.EventsManager.this.legacyFlushTriggered) {
                return;
            }
            com.revenuecat.purchases.common.events.EventsManager.this.legacyFlushTriggered = true;
            com.revenuecat.purchases.common.events.EventsManager.this.flushLegacyEvents();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20401 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $legacyEventsFileHelper;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$4, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $legacyEventsFileHelper;
            final /* synthetic */ java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final /* synthetic */ com.revenuecat.purchases.common.events.EventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$4$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $legacyEventsFileHelper;
                final /* synthetic */ java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper, java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> list) {
                    super(0);
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m154invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m154invoke() {
                    this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(com.revenuecat.purchases.common.events.EventsManager eventsManager, com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper, java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> list) {
                super(0);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m153invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m153invoke() {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Legacy event flush: success.");
                }
                com.revenuecat.purchases.common.events.EventsManager.enqueue$default(this.this$0, null, new com.revenuecat.purchases.common.events.EventsManager.C20401.AnonymousClass4.AnonymousClass2(this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$5, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass5 extends kotlin.jvm.internal.o implements p194x6.m {
            final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $legacyEventsFileHelper;
            final /* synthetic */ java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $storedLegacyEventsWithNullValues;
            final /* synthetic */ com.revenuecat.purchases.common.events.EventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1$5$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $legacyEventsFileHelper;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> $storedLegacyEventsWithNullValues;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(boolean z6, com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper, java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z6;
                    this.$legacyEventsFileHelper = eventsFileHelper;
                    this.$storedLegacyEventsWithNullValues = list;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m155invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m155invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.$legacyEventsFileHelper.clear(this.$storedLegacyEventsWithNullValues.size());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(com.revenuecat.purchases.common.events.EventsManager eventsManager, com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper, java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> list) {
                super(2);
                this.this$0 = eventsManager;
                this.$legacyEventsFileHelper = eventsFileHelper;
                this.$storedLegacyEventsWithNullValues = list;
            }

            @Override // p194x6.m
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((com.revenuecat.purchases.PurchasesError) obj, ((java.lang.Boolean) obj2).booleanValue());
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.PurchasesError error, boolean z6) {
                kotlin.jvm.internal.m.e(error, "error");
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Legacy event flush error: " + error + '.', null);
                com.revenuecat.purchases.common.events.EventsManager.enqueue$default(this.this$0, null, new com.revenuecat.purchases.common.events.EventsManager.C20401.AnonymousClass5.AnonymousClass2(z6, this.$legacyEventsFileHelper, this.$storedLegacyEventsWithNullValues), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20401(com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper) {
            super(0);
            this.$legacyEventsFileHelper = eventsFileHelper;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m152invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m152invoke() {
            java.util.List legacyPaywallsStoredEvents = com.revenuecat.purchases.common.events.EventsManager.this.getLegacyPaywallsStoredEvents();
            java.util.ArrayList arrayListF1 = p078i6.o.f1(legacyPaywallsStoredEvents);
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(arrayListF1, 10));
            java.util.Iterator it = arrayListF1.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.revenuecat.purchases.common.events.BackendStoredEvent.Paywalls(((com.revenuecat.purchases.paywalls.events.PaywallStoredEvent) it.next()).toBackendEvent()));
            }
            if (arrayListF1.isEmpty()) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "No legacy events to sync. Skipping legacy flush.");
                    return;
                }
                return;
            }
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Legacy event flush: posting " + arrayList.size() + " events.");
            }
            p194x6.o oVar = com.revenuecat.purchases.common.events.EventsManager.this.postEvents;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendEvent((com.revenuecat.purchases.common.events.BackendStoredEvent.Paywalls) it2.next()));
            }
            oVar.invoke(new com.revenuecat.purchases.common.events.EventsRequest(arrayList2), com.revenuecat.purchases.common.Delay.LONG, new com.revenuecat.purchases.common.events.EventsManager.C20401.AnonymousClass4(com.revenuecat.purchases.common.events.EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents), new com.revenuecat.purchases.common.events.EventsManager.C20401.AnonymousClass5(com.revenuecat.purchases.common.events.EventsManager.this, this.$legacyEventsFileHelper, legacyPaywallsStoredEvents));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ long $batchStartTimeMillis;
        final /* synthetic */ com.revenuecat.purchases.common.Delay $delay;
        final /* synthetic */ java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> $storedEventsWithNullValues;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5$2, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ int $batchNumber;
            final /* synthetic */ com.revenuecat.purchases.common.Delay $delay;
            final /* synthetic */ java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> $storedEventsWithNullValues;
            final /* synthetic */ com.revenuecat.purchases.common.events.EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(com.revenuecat.purchases.common.events.EventsManager eventsManager, java.util.List<? extends com.revenuecat.purchases.common.events.BackendStoredEvent> list, int i3, com.revenuecat.purchases.common.Delay delay) {
                super(0);
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
                this.$batchNumber = i3;
                this.$delay = delay;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m157invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m157invoke() {
                this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                this.this$0.flushNextBatch(this.$batchNumber + 1, this.$delay);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(int i3, long j, java.util.List<? extends com.revenuecat.purchases.common.events.BackendStoredEvent> list, com.revenuecat.purchases.common.Delay delay) {
            super(0);
            this.$batchNumber = i3;
            this.$batchStartTimeMillis = j;
            this.$storedEventsWithNullValues = list;
            this.$delay = delay;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m156invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m156invoke() {
            int i3 = this.$batchNumber;
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "New event flush (batch " + i3 + "): success.");
            }
            com.revenuecat.purchases.DebugEventListener debugEventListener = com.revenuecat.purchases.common.events.EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new com.revenuecat.purchases.DebugEvent(com.revenuecat.purchases.DebugEventName.FLUSH_COMPLETED, p078i6.C.N0(new p070h6.k("batch_number", java.lang.String.valueOf(this.$batchNumber)), new p070h6.k("elapsed_millis", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.$batchStartTimeMillis)))));
            }
            com.revenuecat.purchases.common.events.EventsManager eventsManager = com.revenuecat.purchases.common.events.EventsManager.this;
            com.revenuecat.purchases.common.events.EventsManager.enqueue$default(eventsManager, null, new com.revenuecat.purchases.common.events.EventsManager.AnonymousClass5.AnonymousClass2(eventsManager, this.$storedEventsWithNullValues, this.$batchNumber, this.$delay), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldMarkAsSynced", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass6 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ int $batchNumber;
        final /* synthetic */ java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> $storedEventsWithNullValues;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6$3, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ boolean $shouldMarkAsSynced;
            final /* synthetic */ java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> $storedEventsWithNullValues;
            final /* synthetic */ com.revenuecat.purchases.common.events.EventsManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(boolean z6, com.revenuecat.purchases.common.events.EventsManager eventsManager, java.util.List<? extends com.revenuecat.purchases.common.events.BackendStoredEvent> list) {
                super(0);
                this.$shouldMarkAsSynced = z6;
                this.this$0 = eventsManager;
                this.$storedEventsWithNullValues = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m158invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m158invoke() {
                if (this.$shouldMarkAsSynced) {
                    this.this$0.fileHelper.clear(this.$storedEventsWithNullValues.size());
                }
                this.this$0.onFlushComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(int i3, java.util.List<? extends com.revenuecat.purchases.common.events.BackendStoredEvent> list) {
            super(2);
            this.$batchNumber = i3;
            this.$storedEventsWithNullValues = list;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, ((java.lang.Boolean) obj2).booleanValue());
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error, boolean z6) {
            kotlin.jvm.internal.m.e(error, "error");
            int i3 = this.$batchNumber;
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "New event flush (batch " + i3 + ") error: " + error + '.', null);
            com.revenuecat.purchases.DebugEventListener debugEventListener = com.revenuecat.purchases.common.events.EventsManager.this.getDebugEventListener();
            if (debugEventListener != null) {
                com.revenuecat.purchases.DebugEventName debugEventName = com.revenuecat.purchases.DebugEventName.FLUSH_ERROR;
                p086j6.e eVar = new p086j6.e();
                eVar.put("errorCode", error.getCode().name());
                java.lang.String underlyingErrorMessage = error.getUnderlyingErrorMessage();
                if (underlyingErrorMessage != null) {
                    eVar.put("underlyingErrorMessage", O7.q.p1(80, underlyingErrorMessage));
                }
                debugEventListener.onDebugEventReceived(new com.revenuecat.purchases.DebugEvent(debugEventName, eVar.b()));
            }
            com.revenuecat.purchases.common.events.EventsManager eventsManager = com.revenuecat.purchases.common.events.EventsManager.this;
            com.revenuecat.purchases.common.events.EventsManager.enqueue$default(eventsManager, null, new com.revenuecat.purchases.common.events.EventsManager.AnonymousClass6.AnonymousClass3(z6, eventsManager, this.$storedEventsWithNullValues), 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$getLegacyPaywallsStoredEvents$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LN7/m;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20411 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ kotlin.jvm.internal.A $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20411(kotlin.jvm.internal.A a2) {
            super(1);
            this.$events = a2;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((N7.m) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            kotlin.jvm.internal.m.e(sequence, "sequence");
            this.$events.f24539h = N7.o.s0(N7.o.r0(sequence, 50));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$getStoredEvents$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LN7/m;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20421 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ kotlin.jvm.internal.A $events;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20421(kotlin.jvm.internal.A a2) {
            super(1);
            this.$events = a2;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((N7.m) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            kotlin.jvm.internal.m.e(sequence, "sequence");
            this.$events.f24539h = N7.o.s0(N7.o.r0(sequence, 50));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.EventsManager$track$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20431 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.common.events.FeatureEvent $event;
        final /* synthetic */ com.revenuecat.purchases.common.events.EventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20431(com.revenuecat.purchases.common.events.FeatureEvent featureEvent, com.revenuecat.purchases.common.events.EventsManager eventsManager) {
            super(0);
            this.$event = featureEvent;
            this.this$0 = eventsManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m159invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m159invoke() {
            com.revenuecat.purchases.common.events.BackendStoredEvent backendStoredEvent;
            com.revenuecat.purchases.common.events.FeatureEvent featureEvent = this.$event;
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            com.revenuecat.purchases.common.Config config = com.revenuecat.purchases.common.Config.INSTANCE;
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Tracking event: " + featureEvent);
            }
            com.revenuecat.purchases.common.events.FeatureEvent featureEvent2 = this.$event;
            if (featureEvent2 instanceof com.revenuecat.purchases.paywalls.events.PaywallEvent) {
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.paywalls.events.PaywallEvent) featureEvent2, this.this$0.identityManager.getCurrentAppUserID());
            } else if (featureEvent2 instanceof com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent) {
                java.lang.String currentAppUserID = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent) featureEvent2, currentAppUserID, string);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent) {
                java.lang.String currentAppUserID2 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string2 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string2, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent) featureEvent2, currentAppUserID2, string2);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.ads.events.AdEvent.Displayed) {
                java.lang.String currentAppUserID3 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string3 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string3, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.ads.events.AdEvent.Displayed) featureEvent2, currentAppUserID3, string3);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.ads.events.AdEvent.Open) {
                java.lang.String currentAppUserID4 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string4 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string4, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.ads.events.AdEvent.Open) featureEvent2, currentAppUserID4, string4);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.ads.events.AdEvent.Revenue) {
                java.lang.String currentAppUserID5 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string5 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string5, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.ads.events.AdEvent.Revenue) featureEvent2, currentAppUserID5, string5);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.ads.events.AdEvent.Loaded) {
                java.lang.String currentAppUserID6 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string6 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string6, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.ads.events.AdEvent.Loaded) featureEvent2, currentAppUserID6, string6);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.ads.events.AdEvent.FailedToLoad) {
                java.lang.String currentAppUserID7 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string7 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string7, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.ads.events.AdEvent.FailedToLoad) featureEvent2, currentAppUserID7, string7);
            } else if (featureEvent2 instanceof com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression) {
                java.lang.String currentAppUserID8 = this.this$0.identityManager.getCurrentAppUserID();
                java.lang.String string8 = this.this$0.appSessionID.toString();
                kotlin.jvm.internal.m.d(string8, "appSessionID.toString()");
                backendStoredEvent = com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression) featureEvent2, currentAppUserID8, string8);
            } else {
                backendStoredEvent = featureEvent2 instanceof com.revenuecat.purchases.common.workflows.events.WorkflowEvent ? com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendStoredEvent((com.revenuecat.purchases.common.workflows.events.WorkflowEvent) featureEvent2, this.this$0.identityManager.getCurrentAppUserID()) : null;
            }
            if (backendStoredEvent != null) {
                this.this$0.checkFileSizeAndClearIfNeeded();
                this.this$0.fileHelper.appendEvent(backendStoredEvent);
                if (this.$event.isPriorityEvent()) {
                    this.this$0.performPriorityFlush();
                    return;
                }
                return;
            }
            com.revenuecat.purchases.common.events.FeatureEvent featureEvent3 = this.$event;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (config.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Backend event not implemented for: " + featureEvent3);
            }
        }
    }

    static {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.m.d(uuidRandomUUID, "randomUUID()");
        appSessionID = uuidRandomUUID;
        json = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(com.revenuecat.purchases.common.events.EventsManager$Companion$json$1.INSTANCE);
    }

    public EventsManager(java.util.UUID appSessionID2, com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper, com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.common.events.BackendStoredEvent> fileHelper, com.revenuecat.purchases.identity.IdentityManager identityManager, com.revenuecat.purchases.common.Dispatcher eventsDispatcher, p194x6.o postEvents, com.revenuecat.purchases.utils.RateLimiter priorityFlushRateLimiter) {
        kotlin.jvm.internal.m.e(appSessionID2, "appSessionID");
        kotlin.jvm.internal.m.e(fileHelper, "fileHelper");
        kotlin.jvm.internal.m.e(identityManager, "identityManager");
        kotlin.jvm.internal.m.e(eventsDispatcher, "eventsDispatcher");
        kotlin.jvm.internal.m.e(postEvents, "postEvents");
        kotlin.jvm.internal.m.e(priorityFlushRateLimiter, "priorityFlushRateLimiter");
        this.appSessionID = appSessionID2;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.eventsDispatcher = eventsDispatcher;
        this.postEvents = postEvents;
        this.priorityFlushRateLimiter = priorityFlushRateLimiter;
        this.flushInProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFileSizeAndClearIfNeeded() {
        if (this.fileHelper.fileSizeInKB() >= 2048.0d) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Event store size limit reached. Clearing oldest events to free up space.");
            }
            this.fileHelper.clear(50);
            com.revenuecat.purchases.DebugEventListener debugEventListener = this.debugEventListener;
            if (debugEventListener != null) {
                debugEventListener.onDebugEventReceived(new com.revenuecat.purchases.DebugEvent(com.revenuecat.purchases.DebugEventName.FILE_SIZE_LIMIT_REACHED, null, 2, null));
            }
        }
    }

    private final void enqueue(com.revenuecat.purchases.common.Delay delay, kotlin.jvm.functions.Function0 command) {
        this.eventsDispatcher.enqueue(new O.c(4, command), delay);
    }

    public static /* synthetic */ void enqueue$default(com.revenuecat.purchases.common.events.EventsManager eventsManager, com.revenuecat.purchases.common.Delay delay, kotlin.jvm.functions.Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            delay = com.revenuecat.purchases.common.Delay.NONE;
        }
        eventsManager.enqueue(delay, function0);
    }

    public static /* synthetic */ void flushEvents$default(com.revenuecat.purchases.common.events.EventsManager eventsManager, com.revenuecat.purchases.common.Delay delay, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            delay = com.revenuecat.purchases.common.Delay.DEFAULT;
        }
        eventsManager.flushEvents(delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushLegacyEvents() {
        com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper == null) {
            return;
        }
        enqueue$default(this, null, new com.revenuecat.purchases.common.events.EventsManager.C20401(eventsFileHelper), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushNextBatch(int batchNumber, com.revenuecat.purchases.common.Delay delay) {
        com.revenuecat.purchases.DebugEventListener debugEventListener;
        if (batchNumber > 10) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Reached maximum number of flush batches (10). Stopping flush.");
            }
            onFlushComplete();
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> storedEvents = getStoredEvents();
        java.util.ArrayList arrayListF1 = p078i6.o.f1(storedEvents);
        if (arrayListF1.isEmpty()) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No new events to sync.");
            }
            if (batchNumber == 1 && (debugEventListener = this.debugEventListener) != null) {
                debugEventListener.onDebugEventReceived(new com.revenuecat.purchases.DebugEvent(com.revenuecat.purchases.DebugEventName.FLUSH_SKIPPED_NO_EVENTS, null, 2, null));
            }
            onFlushComplete();
            return;
        }
        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            java.lang.String strM = com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - "));
            java.lang.StringBuilder sbT = p121o0.p.t(batchNumber, "New event flush (batch ", "): posting ");
            sbT.append(arrayListF1.size());
            sbT.append(" events.");
            currentLogHandler3.v(strM, sbT.toString());
        }
        p194x6.o oVar = this.postEvents;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(arrayListF1, 10));
        java.util.Iterator it = arrayListF1.iterator();
        while (it.hasNext()) {
            arrayList.add(com.revenuecat.purchases.common.events.BackendStoredEventKt.toBackendEvent((com.revenuecat.purchases.common.events.BackendStoredEvent) it.next()));
        }
        oVar.invoke(new com.revenuecat.purchases.common.events.EventsRequest(arrayList), delay, new com.revenuecat.purchases.common.events.EventsManager.AnonymousClass5(batchNumber, jCurrentTimeMillis, storedEvents, delay), new com.revenuecat.purchases.common.events.EventsManager.AnonymousClass6(batchNumber, storedEvents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> getLegacyPaywallsStoredEvents() {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = p078i6.w.f23205h;
        com.revenuecat.purchases.utils.EventsFileHelper<com.revenuecat.purchases.paywalls.events.PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper != null) {
            eventsFileHelper.readFile(new com.revenuecat.purchases.common.events.EventsManager.C20411(a2));
        }
        return (java.util.List) a2.f24539h;
    }

    private final java.util.List<com.revenuecat.purchases.common.events.BackendStoredEvent> getStoredEvents() {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = p078i6.w.f23205h;
        this.fileHelper.readFile(new com.revenuecat.purchases.common.events.EventsManager.C20421(a2));
        return (java.util.List) a2.f24539h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlushComplete() {
        this.flushInProgress.set(false);
        startPendingPriorityFlushIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performPriorityFlush() {
        this.pendingPriorityFlush = true;
        if (!this.flushInProgress.get()) {
            startPendingPriorityFlushIfNeeded();
            return;
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Flush in progress. Queuing priority flush.");
        }
    }

    private final void startPendingPriorityFlushIfNeeded() {
        if (this.pendingPriorityFlush) {
            this.pendingPriorityFlush = false;
            if (!this.priorityFlushRateLimiter.shouldProceed()) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Priority flush rate limited. Skipping.");
                    return;
                }
                return;
            }
            if (this.flushInProgress.getAndSet(true)) {
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    com.google.android.gms.internal.play_billing.M0.t(logLevel2, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler2, "Flush in progress. Queuing priority flush.");
                }
                this.pendingPriorityFlush = true;
                return;
            }
            com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                com.google.android.gms.internal.play_billing.M0.t(logLevel3, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler3, "Starting priority flush.");
            }
            flushNextBatch(1, com.revenuecat.purchases.common.Delay.NONE);
        }
    }

    public final synchronized void flushEvents(com.revenuecat.purchases.common.Delay delay) {
        kotlin.jvm.internal.m.e(delay, "delay");
        enqueue$default(this, null, new com.revenuecat.purchases.common.events.EventsManager.AnonymousClass1(delay), 1, null);
    }

    public final synchronized com.revenuecat.purchases.DebugEventListener getDebugEventListener() {
        return this.debugEventListener;
    }

    public final synchronized void setDebugEventListener(com.revenuecat.purchases.DebugEventListener debugEventListener) {
        try {
            this.debugEventListener = debugEventListener;
            this.fileHelper.setDebugEventCallback(debugEventListener != null ? new com.revenuecat.purchases.common.events.EventsManager$debugEventListener$callback$1$1(debugEventListener) : null);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void track(com.revenuecat.purchases.common.events.FeatureEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        enqueue$default(this, null, new com.revenuecat.purchases.common.events.EventsManager.C20431(event, this), 1, null);
    }

    public /* synthetic */ EventsManager(java.util.UUID uuid, com.revenuecat.purchases.utils.EventsFileHelper eventsFileHelper, com.revenuecat.purchases.utils.EventsFileHelper eventsFileHelper2, com.revenuecat.purchases.identity.IdentityManager identityManager, com.revenuecat.purchases.common.Dispatcher dispatcher, p194x6.o oVar, com.revenuecat.purchases.utils.RateLimiter rateLimiter, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        uuid = (i3 & 1) != 0 ? appSessionID : uuid;
        if ((i3 & 64) != 0) {
            P7.a aVar = P7.b.f8168i;
            rateLimiter = new com.revenuecat.purchases.utils.RateLimiter(5, E8.l.N(60, P7.d.SECONDS), null);
        }
        this(uuid, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, oVar, rateLimiter);
    }
}
