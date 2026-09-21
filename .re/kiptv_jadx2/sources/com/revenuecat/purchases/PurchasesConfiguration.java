package com.revenuecat.purchases;

import O7.q;
import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.galaxy.GalaxyBillingMode;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u00109\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b:J\u0013\u0010;\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\f8@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000eR\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "automaticDeviceIdentifierCollectionEnabled", "", "getAutomaticDeviceIdentifierCollectionEnabled", "()Z", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "getDiagnosticsEnabled", "galaxyBillingMode", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "getGalaxyBillingMode", "()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "iamEnabled", "getIamEnabled$purchases_defaultsRelease", "observerMode", "getObserverMode$annotations", "()V", "getObserverMode", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled", "preferredUILocaleOverride", "getPreferredUILocaleOverride", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "service", "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "copy", "copy$purchases_defaultsRelease", "equals", Request.JsonKeys.OTHER, "hashCode", "", "Builder", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final GalaxyBillingMode galaxyBillingMode;
    private final boolean iamEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final String preferredUILocaleOverride;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010I\u001a\u00020JH\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010D\u001a\u00020CJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000eH\u0007J\u0010\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u000eH\u0007J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000eH\u0007J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u0005J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000eJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R&\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R&\u0010(\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R*\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\rR&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0004\u0018\u0001042\b\u0010\t\u001a\u0004\u0018\u0001048@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R&\u0010:\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R&\u0010>\u001a\u00020=2\u0006\u0010\t\u001a\u00020=8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR&\u0010D\u001a\u00020C2\u0006\u0010\t\u001a\u00020C8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006P"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_defaultsRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_defaultsRelease", "setAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "", "automaticDeviceIdentifierCollectionEnabled", "getAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease", "()Z", "setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease", "(Z)V", "getContext$purchases_defaultsRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_defaultsRelease", "setDiagnosticsEnabled$purchases_defaultsRelease", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "galaxyBillingMode", "getGalaxyBillingMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "setGalaxyBillingMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;)V", "iamEnabled", "getIamEnabled$purchases_defaultsRelease", "setIamEnabled$purchases_defaultsRelease", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "preferredUILocaleOverride", "getPreferredUILocaleOverride$purchases_defaultsRelease", "setPreferredUILocaleOverride$purchases_defaultsRelease", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getPurchasesAreCompletedBy$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "Ljava/util/concurrent/ExecutorService;", "service", "getService$purchases_defaultsRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_defaultsRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_defaultsRelease", "setShowInAppMessagesAutomatically$purchases_defaultsRelease", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getStore$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", OperatingSystem.JsonKeys.BUILD, "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "observerMode", "localeString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private boolean automaticDeviceIdentifierCollectionEnabled;
        private final Context context;
        private DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private GalaxyBillingMode galaxyBillingMode;
        private boolean iamEnabled;
        private boolean pendingTransactionsForPrepaidPlansEnabled;
        private String preferredUILocaleOverride;
        private PurchasesAreCompletedBy purchasesAreCompletedBy;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private Store store;
        private EntitlementVerificationMode verificationMode;

        public Builder(Context context, String apiKey) {
            m.e(context, "context");
            m.e(apiKey, "apiKey");
            this.context = context;
            this.apiKey = apiKey;
            this.purchasesAreCompletedBy = PurchasesAreCompletedBy.REVENUECAT;
            this.showInAppMessagesAutomatically = true;
            this.store = Store.PLAY_STORE;
            this.verificationMode = EntitlementVerificationMode.INSTANCE.getDefault();
            this.dangerousSettings = new DangerousSettings(false, 1, null);
            this.automaticDeviceIdentifierCollectionEnabled = true;
            this.galaxyBillingMode = GalaxyBillingMode.PRODUCTION;
        }

        public final Builder appUserID(String appUserID) {
            this.appUserID = appUserID;
            return this;
        }

        public final Builder automaticDeviceIdentifierCollectionEnabled(boolean automaticDeviceIdentifierCollectionEnabled) {
            this.automaticDeviceIdentifierCollectionEnabled = automaticDeviceIdentifierCollectionEnabled;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            m.e(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean diagnosticsEnabled) {
            this.diagnosticsEnabled = diagnosticsEnabled;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode verificationMode) {
            m.e(verificationMode, "verificationMode");
            this.verificationMode = verificationMode;
            return this;
        }

        public final Builder galaxyBillingMode(GalaxyBillingMode galaxyBillingMode) {
            m.e(galaxyBillingMode, "galaxyBillingMode");
            this.galaxyBillingMode = galaxyBillingMode;
            return this;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getAutomaticDeviceIdentifierCollectionEnabled() {
            return this.automaticDeviceIdentifierCollectionEnabled;
        }

        public final Context getContext() {
            return this.context;
        }

        public final DangerousSettings getDangerousSettings() {
            return this.dangerousSettings;
        }

        public final boolean getDiagnosticsEnabled() {
            return this.diagnosticsEnabled;
        }

        public final GalaxyBillingMode getGalaxyBillingMode() {
            return this.galaxyBillingMode;
        }

        public final boolean getIamEnabled() {
            return this.iamEnabled;
        }

        public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        public final String getPreferredUILocaleOverride() {
            return this.preferredUILocaleOverride;
        }

        public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
            return this.purchasesAreCompletedBy;
        }

        public final ExecutorService getService() {
            return this.service;
        }

        public final boolean getShowInAppMessagesAutomatically() {
            return this.showInAppMessagesAutomatically;
        }

        public final Store getStore() {
            return this.store;
        }

        public final EntitlementVerificationMode getVerificationMode() {
            return this.verificationMode;
        }

        public final Builder iamEnabled(boolean iamEnabled) {
            this.iamEnabled = iamEnabled;
            return this;
        }

        @p070h6.c
        public final Builder informationalVerificationModeAndDiagnosticsEnabled(boolean enabled) {
            if (enabled) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
                return this;
            }
            this.verificationMode = EntitlementVerificationMode.DISABLED;
            this.diagnosticsEnabled = false;
            return this;
        }

        @p070h6.c
        public final Builder observerMode(boolean observerMode) {
            purchasesAreCompletedBy(observerMode ? PurchasesAreCompletedBy.MY_APP : PurchasesAreCompletedBy.REVENUECAT);
            return this;
        }

        public final Builder pendingTransactionsForPrepaidPlansEnabled(boolean pendingTransactionsForPrepaidPlansEnabled) {
            this.pendingTransactionsForPrepaidPlansEnabled = pendingTransactionsForPrepaidPlansEnabled;
            return this;
        }

        public final Builder preferredUILocaleOverride(String localeString) {
            this.preferredUILocaleOverride = localeString;
            return this;
        }

        public final Builder purchasesAreCompletedBy(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
            return this;
        }

        public final Builder service(ExecutorService service) {
            m.e(service, "service");
            this.service = service;
            return this;
        }

        public final void setAppUserID$purchases_defaultsRelease(String str) {
            this.appUserID = str;
        }

        public final void setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease(boolean z6) {
            this.automaticDeviceIdentifierCollectionEnabled = z6;
        }

        public final void setDangerousSettings$purchases_defaultsRelease(DangerousSettings dangerousSettings) {
            m.e(dangerousSettings, "<set-?>");
            this.dangerousSettings = dangerousSettings;
        }

        public final void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z6) {
            this.diagnosticsEnabled = z6;
        }

        public final void setGalaxyBillingMode$purchases_defaultsRelease(GalaxyBillingMode galaxyBillingMode) {
            m.e(galaxyBillingMode, "<set-?>");
            this.galaxyBillingMode = galaxyBillingMode;
        }

        public final void setIamEnabled$purchases_defaultsRelease(boolean z6) {
            this.iamEnabled = z6;
        }

        public final void setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease(boolean z6) {
            this.pendingTransactionsForPrepaidPlansEnabled = z6;
        }

        public final void setPreferredUILocaleOverride$purchases_defaultsRelease(String str) {
            this.preferredUILocaleOverride = str;
        }

        public final void setPurchasesAreCompletedBy$purchases_defaultsRelease(PurchasesAreCompletedBy purchasesAreCompletedBy) {
            m.e(purchasesAreCompletedBy, "<set-?>");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        }

        public final void setService$purchases_defaultsRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z6) {
            this.showInAppMessagesAutomatically = z6;
        }

        public final void setStore$purchases_defaultsRelease(Store store) {
            m.e(store, "<set-?>");
            this.store = store;
        }

        public final void setVerificationMode$purchases_defaultsRelease(EntitlementVerificationMode entitlementVerificationMode) {
            m.e(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean showInAppMessagesAutomatically) {
            this.showInAppMessagesAutomatically = showInAppMessagesAutomatically;
            return this;
        }

        public final Builder store(Store store) {
            m.e(store, "store");
            this.store = store;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        Context applicationContext;
        m.e(builder, "builder");
        if (UtilsKt.isDeviceProtectedStorageCompat(builder.getContext())) {
            applicationContext = builder.getContext();
        } else {
            applicationContext = builder.getContext().getApplicationContext();
            m.d(applicationContext, "{\n                builde…tionContext\n            }");
        }
        this.context = applicationContext;
        this.apiKey = q.r1(builder.getApiKey()).toString();
        this.appUserID = builder.getAppUserID();
        this.purchasesAreCompletedBy = builder.getPurchasesAreCompletedBy();
        this.service = builder.getService();
        this.store = builder.getStore();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled();
        this.verificationMode = builder.getVerificationMode();
        this.dangerousSettings = builder.getDangerousSettings();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically();
        this.pendingTransactionsForPrepaidPlansEnabled = builder.getPendingTransactionsForPrepaidPlansEnabled();
        this.automaticDeviceIdentifierCollectionEnabled = builder.getAutomaticDeviceIdentifierCollectionEnabled();
        this.preferredUILocaleOverride = builder.getPreferredUILocaleOverride();
        this.galaxyBillingMode = builder.getGalaxyBillingMode();
        this.iamEnabled = builder.getIamEnabled();
    }

    public static PurchasesConfiguration copy$purchases_defaultsRelease$default(PurchasesConfiguration purchasesConfiguration, String str, ExecutorService executorService, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i3 & 1) != 0) {
            str = purchasesConfiguration.appUserID;
        }
        if ((i3 & 2) != 0) {
            executorService = purchasesConfiguration.service;
        }
        return purchasesConfiguration.copy$purchases_defaultsRelease(str, executorService);
    }

    @p070h6.c
    public static void getObserverMode$annotations() {
    }

    public final PurchasesConfiguration copy$purchases_defaultsRelease(String appUserID, ExecutorService service) {
        Builder builderIamEnabled = new Builder(this.context, this.apiKey).appUserID(appUserID).purchasesAreCompletedBy(this.purchasesAreCompletedBy).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled).automaticDeviceIdentifierCollectionEnabled(this.automaticDeviceIdentifierCollectionEnabled).preferredUILocaleOverride(this.preferredUILocaleOverride).galaxyBillingMode(this.galaxyBillingMode).iamEnabled(this.iamEnabled);
        if (service != null) {
            builderIamEnabled = builderIamEnabled.service(service);
        }
        return builderIamEnabled.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesConfiguration");
        PurchasesConfiguration purchasesConfiguration = (PurchasesConfiguration) other;
        return m.a(this.apiKey, purchasesConfiguration.apiKey) && m.a(this.appUserID, purchasesConfiguration.appUserID) && this.purchasesAreCompletedBy == purchasesConfiguration.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == purchasesConfiguration.showInAppMessagesAutomatically && this.store == purchasesConfiguration.store && this.diagnosticsEnabled == purchasesConfiguration.diagnosticsEnabled && m.a(this.dangerousSettings, purchasesConfiguration.dangerousSettings) && this.verificationMode == purchasesConfiguration.verificationMode && this.pendingTransactionsForPrepaidPlansEnabled == purchasesConfiguration.pendingTransactionsForPrepaidPlansEnabled && this.automaticDeviceIdentifierCollectionEnabled == purchasesConfiguration.automaticDeviceIdentifierCollectionEnabled && m.a(this.preferredUILocaleOverride, purchasesConfiguration.preferredUILocaleOverride) && m.a(this.galaxyBillingMode, purchasesConfiguration.galaxyBillingMode) && this.iamEnabled == purchasesConfiguration.iamEnabled;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getAutomaticDeviceIdentifierCollectionEnabled() {
        return this.automaticDeviceIdentifierCollectionEnabled;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final GalaxyBillingMode getGalaxyBillingMode() {
        return this.galaxyBillingMode;
    }

    public final boolean getIamEnabled() {
        return this.iamEnabled;
    }

    public final boolean getObserverMode() {
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.purchasesAreCompletedBy.ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        throw new I3.b();
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final String getPreferredUILocaleOverride() {
        return this.preferredUILocaleOverride;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        String str = this.appUserID;
        int iF = p.f(p.f((this.verificationMode.hashCode() + ((this.dangerousSettings.hashCode() + p.f((this.store.hashCode() + p.f((this.purchasesAreCompletedBy.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.showInAppMessagesAutomatically)) * 31, 31, this.diagnosticsEnabled)) * 31)) * 31, 31, this.pendingTransactionsForPrepaidPlansEnabled), 31, this.automaticDeviceIdentifierCollectionEnabled);
        String str2 = this.preferredUILocaleOverride;
        return Boolean.hashCode(this.iamEnabled) + ((this.galaxyBillingMode.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
