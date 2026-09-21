package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"indefiniteArticle", "", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "configuredStore", "Lcom/revenuecat/purchases/Store;", "storeNameForLogging", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingStringsKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.revenuecat.purchases.Store.values().length];
            try {
                iArr[com.revenuecat.purchases.Store.PLAY_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.AMAZON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.GALAXY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.revenuecat.purchases.APIKeyValidator.ValidationResult.values().length];
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.SIMULATED_STORE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String indefiniteArticle(com.revenuecat.purchases.APIKeyValidator.ValidationResult validationResult, com.revenuecat.purchases.Store store) {
        switch (com.revenuecat.purchases.strings.OfferingStringsKt.WhenMappings.$EnumSwitchMapping$1[validationResult.ordinal()]) {
            case 1:
                int i3 = com.revenuecat.purchases.strings.OfferingStringsKt.WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
                return (i3 == 1 || i3 != 2) ? androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY : "an";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY;
            default:
                throw new I3.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String storeNameForLogging(com.revenuecat.purchases.APIKeyValidator.ValidationResult validationResult, com.revenuecat.purchases.Store store) {
        switch (com.revenuecat.purchases.strings.OfferingStringsKt.WhenMappings.$EnumSwitchMapping$1[validationResult.ordinal()]) {
            case 1:
                int i3 = com.revenuecat.purchases.strings.OfferingStringsKt.WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
                if (i3 == 1) {
                    return "Play Store";
                }
                if (i3 == 2) {
                    return "Amazon Appstore";
                }
                if (i3 != 3) {
                    return null;
                }
                return "Galaxy Store";
            case 2:
                return "Play Store";
            case 3:
                return "Test Store";
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return null;
            default:
                throw new I3.b();
        }
    }
}
