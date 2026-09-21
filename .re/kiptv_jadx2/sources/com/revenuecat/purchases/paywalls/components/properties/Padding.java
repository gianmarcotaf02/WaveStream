package com.revenuecat.purchases.paywalls.components.properties;

import androidx.media3.container.NalUnitUtil;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.i;
import p143q8.b;
import p153r8.k0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "", "", RRWebVideoEvent.JsonKeys.TOP, "bottom", "leading", "trailing", "<init>", "(DDDD)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IDDDDLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "D", "getTop", "()D", "getBottom", "getLeading", "getTrailing", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class Padding {
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;

    public static final Companion INSTANCE = new Companion(null);
    private static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);

    private static final Padding f3default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001R\u0013\u0010\u0003\u001a\u00020\u00048F¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u00020\u00048F¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getDefault", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "zero", "getZero", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final Padding getDefault() {
            return Padding.f3default;
        }

        public final Padding getZero() {
            return Padding.zero;
        }

        public final KSerializer serializer() {
            return Padding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Padding() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (AbstractC2541f) null);
    }

    public static final void write$Self$purchases_defaultsRelease(Padding self, b output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || Double.compare(self.top, 0.0d) != 0) {
            output.B(serialDesc, 0, self.top);
        }
        if (output.E(serialDesc) || Double.compare(self.bottom, 0.0d) != 0) {
            output.B(serialDesc, 1, self.bottom);
        }
        if (output.E(serialDesc) || Double.compare(self.leading, 0.0d) != 0) {
            output.B(serialDesc, 2, self.leading);
        }
        if (!output.E(serialDesc) && Double.compare(self.trailing, 0.0d) == 0) {
            return;
        }
        output.B(serialDesc, 3, self.trailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeading() {
        return this.leading;
    }

    public final double getTop() {
        return this.top;
    }

    public final double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return Double.hashCode(this.trailing) + ((Double.hashCode(this.leading) + ((Double.hashCode(this.bottom) + (Double.hashCode(this.top) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }

    public Padding(double d4, double d6, double d9, double d10) {
        this.top = d4;
        this.bottom = d6;
        this.leading = d9;
        this.trailing = d10;
    }

    @c
    public Padding(int i3, double d4, double d6, double d9, double d10, k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.top = 0.0d;
        } else {
            this.top = d4;
        }
        if ((i3 & 2) == 0) {
            this.bottom = 0.0d;
        } else {
            this.bottom = d6;
        }
        if ((i3 & 4) == 0) {
            this.leading = 0.0d;
        } else {
            this.leading = d9;
        }
        if ((i3 & 8) == 0) {
            this.trailing = 0.0d;
        } else {
            this.trailing = d10;
        }
    }

    public Padding(double d4, double d6, double d9, double d10, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? 0.0d : d4, (i3 & 2) != 0 ? 0.0d : d6, (i3 & 4) != 0 ? 0.0d : d9, (i3 & 8) != 0 ? 0.0d : d10);
    }
}
