package com.revenuecat.purchases.subscriberattributes;

import O7.q;
import android.app.Application;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import p070h6.A;
import p070h6.k;
import p078i6.C;
import p078i6.D;
import p078i6.p;
import p078i6.x;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142 \u0010\u0017\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0004\u0012\u00020\u00110\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\u00112\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\u00112\n\u0010\"\u001a\u00060\rj\u0002`!2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00112\n\u0010&\u001a\u00060\rj\u0002`!2\n\u0010'\u001a\u00060\rj\u0002`!¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\"\u0010\u0017\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`*\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0004\b+\u0010,J7\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0010\u00103\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f¢\u0006\u0004\b4\u00105J1\u00106\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "", "automaticDeviceIdentifierCollectionEnabled", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;Z)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "Lh6/A;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lx6/j;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;Lx6/j;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "data", "setAppsFlyerConversionData", "(Ljava/lang/String;Ljava/util/Map;)V", "setAppstackAttributionParams", "(Ljava/lang/String;Ljava/util/Map;Landroid/app/Application;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Z", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "ObtainDeviceIdentifiersObservable", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesManager {
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0011j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00128BX\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "<init>", "()V", "Lkotlin/Function0;", "Lh6/A;", "completion", "waitUntilIdle", "(Lkotlin/jvm/functions/Function0;)V", "", "value", "numberOfProcesses", "I", "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<Function0> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() {
                @Override
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f21073a, observable, obj);
                }
            });
        }

        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            m.c(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        Iterator<T> it = obtainDeviceIdentifiersObservable.listeners.iterator();
                        while (it.hasNext()) {
                            ((Function0) it.next()).invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                    } catch (Throwable th) {
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

        public final synchronized void waitUntilIdle(Function0 completion) {
            try {
                m.e(completion, "completion");
                if (this.numberOfProcesses == 0) {
                    completion.invoke();
                } else {
                    this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(completion));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements j {
        final String $appUserID;

        public AnonymousClass1(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return A.f22523a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            m.e(deviceIdentifiers, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(deviceIdentifiers, this.$appUserID);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20991 extends o implements j {
        final j $completion;
        final SubscriberAttributesManager this$0;

        public C20991(j jVar, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = jVar;
            this.this$0 = subscriberAttributesManager;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return A.f22523a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            m.e(deviceIdentifiers, "deviceIdentifiers");
            this.$completion.invoke(deviceIdentifiers);
            ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.this$0.obtainingDeviceIdentifiersObservable;
            obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() - 1);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21001 extends o implements Function0 {
        final String $appUserID;
        final j $completion;
        final SubscriberAttributesManager this$0;

        public C21001(j jVar, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = jVar;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override
        public Object invoke() {
            m280invoke();
            return A.f22523a;
        }

        public final void m280invoke() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21011 extends o implements j {
        final j $setAttributes;

        public C21011(j jVar) {
            super(1);
            this.$setAttributes = jVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, String>) obj);
            return A.f22523a;
        }

        public final void invoke(Map<String, String> deviceIdentifiers) {
            m.e(deviceIdentifiers, "deviceIdentifiers");
            this.$setAttributes.invoke(deviceIdentifiers);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21021 extends o implements Function0 {
        final Function0 $completion;
        final String $currentAppUserID;

        public C21021(Function0 function0, String str) {
            super(0);
            this.$completion = function0;
            this.$currentAppUserID = str;
        }

        @Override
        public Object invoke() {
            m281invoke();
            return A.f22523a;
        }

        public final void m281invoke() {
            LogHandler currentLogHandler;
            String strM;
            String str;
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!q.N0(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                int size = linkedHashMap.size();
                y yVar = new y();
                SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
                y yVar2 = yVar;
                String str2 = this.$currentAppUserID;
                Function0 function0 = this.$completion;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    Map map = (Map) entry2.getValue();
                    SubscriberAttributesPoster backend = subscriberAttributesManager.getBackend();
                    Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(map);
                    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1(subscriberAttributesManager, str3, map, str2, yVar2, function0, size);
                    String str4 = str2;
                    y yVar3 = yVar2;
                    Function0 function1 = function0;
                    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2(subscriberAttributesManager, str3, map, yVar3, function1, size);
                    function0 = function1;
                    yVar2 = yVar3;
                    backend.postSubscriberAttributes(backendMap, str3, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$1, subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2);
                    str2 = str4;
                }
                return;
            }
            LogIntent logIntent = LogIntent.DEBUG;
            SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1 = new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            Function0 function2 = this.$completion;
            if (function2 != null) {
                function2.invoke();
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache deviceCache, SubscriberAttributesPoster backend, DeviceIdentifiersFetcher deviceIdentifiersFetcher, boolean z6) {
        m.e(deviceCache, "deviceCache");
        m.e(backend, "backend");
        m.e(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.automaticDeviceIdentifierCollectionEnabled = z6;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(Application applicationContext, j completion) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(applicationContext, new C20991(completion, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> attributesAsObjects, String appUserID) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : attributesAsObjects.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (!m.a(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        this.deviceCache.setAttributes(appUserID, linkedHashMap);
    }

    public static void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, function0);
    }

    public final void collectDeviceIdentifiers(String appUserID, Application applicationContext) {
        m.e(appUserID, "appUserID");
        m.e(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new AnonymousClass1(appUserID));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String originalAppUserId, String newAppUserID) {
        try {
            m.e(originalAppUserId, "originalAppUserId");
            m.e(newAppUserID, "newAppUserID");
            Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(originalAppUserId);
            if (unsyncedSubscriberAttributes.isEmpty()) {
                return;
            }
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{originalAppUserId, newAppUserID}, 2)));
            }
            this.deviceCache.setAttributes(newAppUserID, unsyncedSubscriberAttributes);
            this.deviceCache.clearAllSubscriberAttributesFromUser(originalAppUserId);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String appUserID, j completion) {
        m.e(appUserID, "appUserID");
        m.e(completion, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C21001(completion, this, appUserID));
    }

    public final synchronized void markAsSynced(String appUserID, Map<String, SubscriberAttribute> attributesToMarkAsSynced, List<SubscriberAttributeError> attributeErrors) {
        String str;
        SubscriberAttribute subscriberAttribute;
        LogHandler currentLogHandler;
        String str2;
        String str3;
        try {
            m.e(appUserID, "appUserID");
            m.e(attributesToMarkAsSynced, "attributesToMarkAsSynced");
            m.e(attributeErrors, "attributeErrors");
            if (!attributeErrors.isEmpty()) {
                LogIntent logIntent = LogIntent.RC_ERROR;
                str = "[Purchases] - ";
                SubscriberAttributesManager$markAsSynced$$inlined$log$1 subscriberAttributesManager$markAsSynced$$inlined$log$1 = new SubscriberAttributesManager$markAsSynced$$inlined$log$1(logIntent, attributeErrors);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke();
                            currentLogHandler.d(str2, str3);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$1.invoke(), null);
                        break;
                }
            } else {
                str = "[Purchases] - ";
            }
            if (attributesToMarkAsSynced.isEmpty()) {
                return;
            }
            LogIntent logIntent2 = LogIntent.INFO;
            SubscriberAttributesManager$markAsSynced$$inlined$log$2 subscriberAttributesManager$markAsSynced$$inlined$log$2 = new SubscriberAttributesManager$markAsSynced$$inlined$log$2(logIntent2, appUserID, attributesToMarkAsSynced);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    subscriberAttribute = null;
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    subscriberAttribute = null;
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(str + logLevel20.name(), (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke());
                    }
                    subscriberAttribute = null;
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) subscriberAttributesManager$markAsSynced$$inlined$log$2.invoke(), null);
                    subscriberAttribute = null;
                    break;
                default:
                    subscriberAttribute = null;
                    break;
            }
            Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
            LinkedHashMap linkedHashMapZ0 = C.Z0(allStoredSubscriberAttributes);
            for (Map.Entry<String, SubscriberAttribute> entry : attributesToMarkAsSynced.entrySet()) {
                String key = entry.getKey();
                SubscriberAttribute value = entry.getValue();
                SubscriberAttribute subscriberAttribute2 = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute2 != null) {
                    if (subscriberAttribute2.isSynced()) {
                        subscriberAttribute2 = subscriberAttribute;
                    }
                    if (subscriberAttribute2 != null) {
                        if (!m.a(subscriberAttribute2.getValue(), value.getValue())) {
                            subscriberAttribute2 = subscriberAttribute;
                        }
                        if (subscriberAttribute2 != null) {
                            linkedHashMapZ0.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(appUserID, linkedHashMapZ0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAppsFlyerConversionData(String appUserID, Map<?, ?> data) {
        m.e(appUserID, "appUserID");
        if (data == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String stringValueForPrimitive = MapExtensionsKt.getStringValueForPrimitive(data, "media_source");
        if (stringValueForPrimitive != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), stringValueForPrimitive);
        } else {
            String stringValueForPrimitive2 = MapExtensionsKt.getStringValueForPrimitive(data, "af_status");
            if (stringValueForPrimitive2 != null && stringValueForPrimitive2.equalsIgnoreCase("Organic")) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), "Organic");
            }
        }
        String stringValueForPrimitive3 = MapExtensionsKt.getStringValueForPrimitive(data, "campaign");
        if (stringValueForPrimitive3 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), stringValueForPrimitive3);
        }
        String stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(data, "adgroup");
        if (stringValueForPrimitive4 == null) {
            stringValueForPrimitive4 = MapExtensionsKt.getStringValueForPrimitive(data, "adset");
        }
        if (stringValueForPrimitive4 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), stringValueForPrimitive4);
        }
        String stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(data, "af_ad");
        if (stringValueForPrimitive5 == null) {
            stringValueForPrimitive5 = MapExtensionsKt.getStringValueForPrimitive(data, "ad_id");
        }
        if (stringValueForPrimitive5 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), stringValueForPrimitive5);
        }
        String stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(data, "af_keywords");
        if (stringValueForPrimitive6 == null) {
            stringValueForPrimitive6 = MapExtensionsKt.getStringValueForPrimitive(data, "keyword");
        }
        if (stringValueForPrimitive6 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), stringValueForPrimitive6);
        }
        String stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(data, "creative");
        if (stringValueForPrimitive7 == null) {
            stringValueForPrimitive7 = MapExtensionsKt.getStringValueForPrimitive(data, "af_creative");
        }
        if (stringValueForPrimitive7 != null) {
            linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE.getBackendKey(), stringValueForPrimitive7);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        setAttributes(linkedHashMap, appUserID);
    }

    public final void setAppstackAttributionParams(String appUserID, Map<String, String> data, Application applicationContext) {
        m.e(appUserID, "appUserID");
        m.e(data, "data");
        m.e(applicationContext, "applicationContext");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = data.get("appstack_adnetwork");
        if (str != null) {
            if (q.N0(str)) {
                str = null;
            }
            if (str != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE.getBackendKey(), str);
                linkedHashMap.put("appstack_adnetwork", str);
            }
        }
        String str2 = data.get("appstack_campaign");
        if (str2 != null) {
            if (q.N0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE.getBackendKey(), str2);
                linkedHashMap.put("appstack_campaign", str2);
            }
        }
        String str3 = data.get("appstack_adset");
        if (str3 != null) {
            if (q.N0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE.getBackendKey(), str3);
                linkedHashMap.put("appstack_adset", str3);
            }
        }
        String str4 = data.get("appstack_ad");
        if (str4 != null) {
            if (q.N0(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE.getBackendKey(), str4);
                linkedHashMap.put("appstack_ad", str4);
            }
        }
        String str5 = data.get("appstack_keywords");
        if (str5 != null) {
            if (q.N0(str5)) {
                str5 = null;
            }
            if (str5 != null) {
                linkedHashMap.put(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE.getBackendKey(), str5);
                linkedHashMap.put("appstack_keywords", str5);
            }
        }
        for (String str6 : p.B0("fbclid", "gclid", "wbraid", "gbraid", "ttclid")) {
            String str7 = data.get(str6);
            if (str7 != null) {
                if (q.N0(str7)) {
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
        String str8 = data.get("appstack_id");
        if (str8 != null) {
            String str9 = q.N0(str8) ? null : str8;
            if (str9 != null) {
                setAttributionID(SubscriberAttributeKey.AttributionIds.Appstack.INSTANCE, str9, appUserID, applicationContext);
            }
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey key, String value, String appUserID) {
        m.e(key, "key");
        m.e(appUserID, "appUserID");
        setAttributes(D.J0(new k(key.getBackendKey(), value)), appUserID);
    }

    public final synchronized void setAttributes(Map<String, String> attributesToSet, String appUserID) {
        try {
            m.e(attributesToSet, "attributesToSet");
            m.e(appUserID, "appUserID");
            ArrayList arrayList = new ArrayList(attributesToSet.size());
            for (Map.Entry<String, String> entry : attributesToSet.entrySet()) {
                String key = entry.getKey();
                arrayList.add(new k(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (AbstractC2541f) null)));
            }
            storeAttributesIfNeeded(C.X0(arrayList), appUserID);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionKey, String value, String appUserID, Application applicationContext) {
        m.e(attributionKey, "attributionKey");
        m.e(appUserID, "appUserID");
        m.e(applicationContext, "applicationContext");
        SubscriberAttributesManager$setAttributionID$setAttributes$1 subscriberAttributesManager$setAttributionID$setAttributes$1 = new SubscriberAttributesManager$setAttributionID$setAttributes$1(attributionKey, value, this, appUserID);
        if (this.automaticDeviceIdentifierCollectionEnabled) {
            getDeviceIdentifiers(applicationContext, new C21011(subscriberAttributesManager$setAttributionID$setAttributes$1));
        } else {
            subscriberAttributesManager$setAttributionID$setAttributes$1.invoke((Object) x.f23206h);
        }
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String currentAppUserID, Function0 completion) {
        m.e(currentAppUserID, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C21021(completion, currentAppUserID));
    }
}
