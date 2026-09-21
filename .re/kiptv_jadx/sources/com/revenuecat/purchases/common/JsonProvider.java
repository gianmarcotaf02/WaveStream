package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b0\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/JsonProvider;", "", "()V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class JsonProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.JsonProvider.Companion INSTANCE = new com.revenuecat.purchases.common.JsonProvider.Companion(null);
    private static final p162s8.d defaultJson = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(com.revenuecat.purchases.common.JsonProvider$Companion$defaultJson$1.INSTANCE);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/JsonProvider$Companion;", "", "<init>", "()V", "Ls8/d;", "defaultJson", "Ls8/d;", "getDefaultJson", "()Ls8/d;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final p162s8.d getDefaultJson() {
            return com.revenuecat.purchases.common.JsonProvider.defaultJson;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JsonProvider(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private JsonProvider() {
    }
}
