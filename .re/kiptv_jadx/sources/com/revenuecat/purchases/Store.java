package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/Store;", "", "(Ljava/lang/String;I)V", "managementUrl", "", "getManagementUrl$purchases_defaultsRelease", "()Ljava/lang/String;", "stringValue", "getStringValue$purchases_defaultsRelease", "APP_STORE", "MAC_APP_STORE", "PLAY_STORE", "STRIPE", "PROMOTIONAL", "UNKNOWN_STORE", "AMAZON", "RC_BILLING", "EXTERNAL", "PADDLE", "TEST_STORE", "GALAXY", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.StoreSerializer.class)
public enum Store {
    APP_STORE,
    MAC_APP_STORE,
    PLAY_STORE,
    STRIPE,
    PROMOTIONAL,
    UNKNOWN_STORE,
    AMAZON,
    RC_BILLING,
    EXTERNAL,
    PADDLE,
    TEST_STORE,
    GALAXY;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.Store.Companion INSTANCE = new com.revenuecat.purchases.Store.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/Store$Companion;", "", "()V", "fromString", "Lcom/revenuecat/purchases/Store;", "text", "", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final /* synthetic */ com.revenuecat.purchases.Store fromString(java.lang.String text) {
            kotlin.jvm.internal.m.e(text, "text");
            switch (text.hashCode()) {
                case -1820761141:
                    if (text.equals("external")) {
                        return com.revenuecat.purchases.Store.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (text.equals("rc_billing")) {
                        return com.revenuecat.purchases.Store.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (text.equals("amazon")) {
                        return com.revenuecat.purchases.Store.AMAZON;
                    }
                    break;
                case -1253268720:
                    if (text.equals("galaxy")) {
                        return com.revenuecat.purchases.Store.GALAXY;
                    }
                    break;
                case -995842198:
                    if (text.equals("paddle")) {
                        return com.revenuecat.purchases.Store.PADDLE;
                    }
                    break;
                case -891985843:
                    if (text.equals("stripe")) {
                        return com.revenuecat.purchases.Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (text.equals("mac_app_store")) {
                        return com.revenuecat.purchases.Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (text.equals("promotional")) {
                        return com.revenuecat.purchases.Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (text.equals("app_store")) {
                        return com.revenuecat.purchases.Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (text.equals("play_store")) {
                        return com.revenuecat.purchases.Store.PLAY_STORE;
                    }
                    break;
                case 2070440692:
                    if (text.equals("test_store")) {
                        return com.revenuecat.purchases.Store.TEST_STORE;
                    }
                    break;
            }
            return com.revenuecat.purchases.Store.UNKNOWN_STORE;
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.StoreSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.Store.values().length];
            try {
                iArr[com.revenuecat.purchases.Store.APP_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.MAC_APP_STORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.PLAY_STORE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.STRIPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.PROMOTIONAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.UNKNOWN_STORE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.AMAZON.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.RC_BILLING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.EXTERNAL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.PADDLE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.TEST_STORE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.GALAXY.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final /* synthetic */ java.lang.String getManagementUrl$purchases_defaultsRelease() {
        int i3 = com.revenuecat.purchases.Store.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i3 == 3) {
            return com.revenuecat.purchases.common.Constants.GOOGLE_PLAY_MANAGEMENT_URL;
        }
        if (i3 == 7) {
            return com.revenuecat.purchases.common.Constants.AMAZON_STORE_MANAGEMENT_URL;
        }
        if (i3 != 12) {
            return null;
        }
        return com.revenuecat.purchases.common.Constants.GALAXY_STORE_MANAGEMENT_URL;
    }

    public final java.lang.String getStringValue$purchases_defaultsRelease() {
        switch (com.revenuecat.purchases.Store.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "app_store";
            case 2:
                return "mac_app_store";
            case 3:
                return "play_store";
            case 4:
                return "stripe";
            case 5:
                return "promotional";
            case 6:
                return "unknown";
            case 7:
                return "amazon";
            case 8:
                return "rc_billing";
            case 9:
                return "external";
            case 10:
                return "paddle";
            case 11:
                return "test_store";
            case 12:
                return "galaxy";
            default:
                throw new I3.b();
        }
    }
}
