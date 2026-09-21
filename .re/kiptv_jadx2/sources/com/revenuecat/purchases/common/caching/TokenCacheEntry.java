package com.revenuecat.purchases.common.caching;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.i;
import p143q8.b;
import p153r8.C2696g;
import p153r8.k0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0015¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "", "isAutoRenewing", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TokenCacheEntry {

    public static final Companion INSTANCE = new Companion(null);
    private final Boolean isAutoRenewing;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/caching/TokenCacheEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return TokenCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenCacheEntry() {
        this((Boolean) null, 1, (AbstractC2541f) (0 == true ? 1 : 0));
    }

    public static TokenCacheEntry copy$default(TokenCacheEntry tokenCacheEntry, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bool = tokenCacheEntry.isAutoRenewing;
        }
        return tokenCacheEntry.copy(bool);
    }

    public static final void write$Self$purchases_defaultsRelease(TokenCacheEntry self, b output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.isAutoRenewing == null) {
            return;
        }
        output.t(serialDesc, 0, C2696g.f26961a, self.isAutoRenewing);
    }

    public final Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final TokenCacheEntry copy(Boolean isAutoRenewing) {
        return new TokenCacheEntry(isAutoRenewing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenCacheEntry) && m.a(this.isAutoRenewing, ((TokenCacheEntry) other).isAutoRenewing);
    }

    public int hashCode() {
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "TokenCacheEntry(isAutoRenewing=" + this.isAutoRenewing + ')';
    }

    @c
    public TokenCacheEntry(int i3, Boolean bool, k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.isAutoRenewing = null;
        } else {
            this.isAutoRenewing = bool;
        }
    }

    public TokenCacheEntry(Boolean bool) {
        this.isAutoRenewing = bool;
    }

    public TokenCacheEntry(Boolean bool, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : bool);
    }
}
