package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "", "(Ljava/lang/String;I)V", "postReceiptFieldValue", "", "getPostReceiptFieldValue", "()Ljava/lang/String;", "RESTORE", "PURCHASE", "UNSYNCED_ACTIVE_PURCHASES", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.PostReceiptInitiationSource.Companion INSTANCE = new com.revenuecat.purchases.PostReceiptInitiationSource.Companion(null);
    private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.PostReceiptInitiationSource.Companion.AnonymousClass1.INSTANCE);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptInitiationSource$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptInitiationSource$Companion$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.PostReceiptInitiationSource.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.PostReceiptInitiationSource.Companion.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return p153r8.AbstractC2686a0.f("com.revenuecat.purchases.PostReceiptInitiationSource", com.revenuecat.purchases.PostReceiptInitiationSource.values());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.PostReceiptInitiationSource.$cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PostReceiptInitiationSource.values().length];
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final java.lang.String getPostReceiptFieldValue() {
        int i3 = com.revenuecat.purchases.PostReceiptInitiationSource.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i3 == 1) {
            return "restore";
        }
        if (i3 == 2) {
            return "purchase";
        }
        if (i3 == 3) {
            return "unsynced_active_purchases";
        }
        throw new I3.b();
    }
}
