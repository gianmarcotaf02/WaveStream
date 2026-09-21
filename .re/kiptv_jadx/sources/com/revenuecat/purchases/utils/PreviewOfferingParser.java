package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/utils/PreviewOfferingParser;", "Lcom/revenuecat/purchases/common/OfferingParser;", "()V", "findMatchingProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "", "", "", "packageJson", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class PreviewOfferingParser extends com.revenuecat.purchases.common.OfferingParser {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PackageType.values().length];
            try {
                iArr[com.revenuecat.purchases.PackageType.LIFETIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.ANNUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.SIX_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.THREE_MONTH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.TWO_MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.MONTHLY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.revenuecat.purchases.PackageType.WEEKLY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PreviewOfferingParser() {
        super(null, 1, null);
    }

    @Override // com.revenuecat.purchases.common.OfferingParser
    public com.revenuecat.purchases.models.StoreProduct findMatchingProduct(java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> productsById, org.json.JSONObject packageJson) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(productsById, "productsById");
        kotlin.jvm.internal.m.e(packageJson, "packageJson");
        java.lang.String string = packageJson.getString(io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER);
        for (com.revenuecat.purchases.PackageType packageType : com.revenuecat.purchases.PackageType.values()) {
            if (kotlin.jvm.internal.m.a(packageType.getIdentifier(), string)) {
                switch (com.revenuecat.purchases.utils.PreviewOfferingParser.WhenMappings.$EnumSwitchMapping$0[packageType.ordinal()]) {
                    case 1:
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.lifetime_product", "Lifetime", "Lifetime (App name)", "Lifetime", new com.revenuecat.purchases.models.Price("$ 1,000.00", androidx.media3.common.C.NANOS_PER_SECOND, "USD"), null, null, null, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, null);
                    case 2:
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new com.revenuecat.purchases.models.Price("$ 67.99", 67990000L, "USD"), new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.YEAR, "P1Y"), new com.revenuecat.purchases.models.PricingPhase(new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.MONTH, "P1M"), com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING, 1, new com.revenuecat.purchases.models.Price("Free", 0L, "USD")), null, null, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, null);
                    case 3:
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new com.revenuecat.purchases.models.Price("$ 39.99", 39990000L, "USD"), new com.revenuecat.purchases.models.Period(6, com.revenuecat.purchases.models.Period.Unit.MONTH, "P6M"), null, null, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, null);
                    case 4:
                        com.revenuecat.purchases.models.Price price = new com.revenuecat.purchases.models.Price("$ 23.99", 23990000L, "USD");
                        com.revenuecat.purchases.models.Period.Unit unit = com.revenuecat.purchases.models.Period.Unit.MONTH;
                        com.revenuecat.purchases.models.Period period = new com.revenuecat.purchases.models.Period(3, unit, "P3M");
                        com.revenuecat.purchases.models.Period period2 = new com.revenuecat.purchases.models.Period(2, com.revenuecat.purchases.models.Period.Unit.WEEK, "P2W");
                        com.revenuecat.purchases.models.RecurrenceMode recurrenceMode = com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING;
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", price, period, new com.revenuecat.purchases.models.PricingPhase(period2, recurrenceMode, 1, new com.revenuecat.purchases.models.Price("Free", 0L, "USD")), new com.revenuecat.purchases.models.PricingPhase(new com.revenuecat.purchases.models.Period(1, unit, "P1M"), recurrenceMode, 1, new com.revenuecat.purchases.models.Price("$ 3.99", 3990000L, "USD")), null, 256, null);
                    case 5:
                        com.revenuecat.purchases.models.Price price2 = new com.revenuecat.purchases.models.Price("$ 15.99", 15990000L, "USD");
                        com.revenuecat.purchases.models.Period.Unit unit2 = com.revenuecat.purchases.models.Period.Unit.MONTH;
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.bimonthly_product", "2 month", "2 month (App name)", "2 month", price2, new com.revenuecat.purchases.models.Period(2, unit2, "P2M"), null, new com.revenuecat.purchases.models.PricingPhase(new com.revenuecat.purchases.models.Period(1, unit2, "P1M"), com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING, 1, new com.revenuecat.purchases.models.Price("$ 3.99", 3990000L, "USD")), null, 320, null);
                    case 6:
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", new com.revenuecat.purchases.models.Price("$ 7.99", 7990000L, "USD"), new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.MONTH, "P1M"), null, null, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, null);
                    case 7:
                        return new com.revenuecat.purchases.models.TestStoreProduct("com.revenuecat.weekly_product", "Weekly", "Weekly (App name)", "Weekly", new com.revenuecat.purchases.models.Price("$ 1.49", 1490000L, "USD"), new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.WEEK, "P1W"), null, null, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, null);
                    default:
                        return null;
                }
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }
}
