package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/DailyUsageResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class DailyUsageResponse {

    public static final Companion INSTANCE = new Companion();

    public final int f19724a;

    public final int f19725b;

    public final int f19726c;

    public final int f19727d;

    public final double f19728e;

    public final boolean f19729f;
    public final boolean g;

    public final String f19730h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/DailyUsageResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/DailyUsageResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return DailyUsageResponse$$serializer.INSTANCE;
        }
    }

    public DailyUsageResponse(int i3, int i9, int i10, int i11, int i12, double d4, boolean z6, boolean z9, String str) {
        if (127 != (i3 & 127)) {
            AbstractC2686a0.l(i3, 127, DailyUsageResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19724a = i9;
        this.f19725b = i10;
        this.f19726c = i11;
        this.f19727d = i12;
        this.f19728e = d4;
        this.f19729f = z6;
        this.g = z9;
        if ((i3 & 128) == 0) {
            this.f19730h = null;
        } else {
            this.f19730h = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyUsageResponse)) {
            return false;
        }
        DailyUsageResponse dailyUsageResponse = (DailyUsageResponse) obj;
        return this.f19724a == dailyUsageResponse.f19724a && this.f19725b == dailyUsageResponse.f19725b && this.f19726c == dailyUsageResponse.f19726c && this.f19727d == dailyUsageResponse.f19727d && Double.compare(this.f19728e, dailyUsageResponse.f19728e) == 0 && this.f19729f == dailyUsageResponse.f19729f && this.g == dailyUsageResponse.g && kotlin.jvm.internal.m.a(this.f19730h, dailyUsageResponse.f19730h);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f((Double.hashCode(this.f19728e) + p121o0.p.d(this.f19727d, p121o0.p.d(this.f19726c, p121o0.p.d(this.f19725b, Integer.hashCode(this.f19724a) * 31, 31), 31), 31)) * 31, 31, this.f19729f), 31, this.g);
        String str = this.f19730h;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyUsageResponse(usedSeconds=");
        sb.append(this.f19724a);
        sb.append(", limitSeconds=");
        sb.append(this.f19725b);
        sb.append(", remainingSeconds=");
        sb.append(this.f19726c);
        sb.append(", sessionCount=");
        sb.append(this.f19727d);
        sb.append(", usagePercentage=");
        sb.append(this.f19728e);
        sb.append(", hasReachedLimit=");
        sb.append(this.f19729f);
        sb.append(", isPremium=");
        sb.append(this.g);
        sb.append(", lastActivity=");
        return Y6.f.m(sb, this.f19730h, ")");
    }
}
