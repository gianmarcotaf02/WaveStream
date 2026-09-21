package com.revenuecat.purchases.common.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0015¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "", "isAutoRenewing", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TokenCacheEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.caching.TokenCacheEntry.Companion INSTANCE = new com.revenuecat.purchases.common.caching.TokenCacheEntry.Companion(null);
    private final java.lang.Boolean isAutoRenewing;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.caching.TokenCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenCacheEntry() {
        this((java.lang.Boolean) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ com.revenuecat.purchases.common.caching.TokenCacheEntry copy$default(com.revenuecat.purchases.common.caching.TokenCacheEntry tokenCacheEntry, java.lang.Boolean bool, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            bool = tokenCacheEntry.isAutoRenewing;
        }
        return tokenCacheEntry.copy(bool);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.caching.TokenCacheEntry self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.isAutoRenewing == null) {
            return;
        }
        output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.isAutoRenewing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final com.revenuecat.purchases.common.caching.TokenCacheEntry copy(java.lang.Boolean isAutoRenewing) {
        return new com.revenuecat.purchases.common.caching.TokenCacheEntry(isAutoRenewing);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.revenuecat.purchases.common.caching.TokenCacheEntry) && kotlin.jvm.internal.m.a(this.isAutoRenewing, ((com.revenuecat.purchases.common.caching.TokenCacheEntry) other).isAutoRenewing);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final java.lang.Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public java.lang.String toString() {
        return "TokenCacheEntry(isAutoRenewing=" + this.isAutoRenewing + ')';
    }

    @p070h6.c
    public /* synthetic */ TokenCacheEntry(int i3, java.lang.Boolean bool, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.isAutoRenewing = null;
        } else {
            this.isAutoRenewing = bool;
        }
    }

    public TokenCacheEntry(java.lang.Boolean bool) {
        this.isAutoRenewing = bool;
    }

    public /* synthetic */ TokenCacheEntry(java.lang.Boolean bool, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : bool);
    }
}
