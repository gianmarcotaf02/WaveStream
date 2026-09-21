package com.revenuecat.purchases.paywalls.components;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import io.ktor.http.LinkHeader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p070h6.t;
import p078i6.w;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.C2696g;
import p153r8.k0;

@h("timeline")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0005@?ABCBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f¢\u0006\u0004\b\u0015\u0010\u0016B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b:\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b>\u0010=¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "items", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "overrides", "<init>", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getItemSpacing", "()I", "getItemSpacing$annotations", "()V", "getTextSpacing", "getTextSpacing$annotations", "getColumnGutter", "getColumnGutter$annotations", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment$annotations", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getOverrides", "Companion", "$serializer", "Connector", "IconAlignment", "Item", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TimelineComponent implements PaywallComponent {
    private final int columnGutter;
    private final IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List<Item> items;
    private final Padding margin;
    private final List<ComponentOverride<PartialTimelineComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final int textSpacing;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, new C2691d(TimelineComponent$Item$$serializer.INSTANCE, 0), new C2691d(ComponentOverride.INSTANCE.serializer(PartialTimelineComponent$$serializer.INSTANCE), 0)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return TimelineComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "", "", "width", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(ILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getWidth", "()I", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Connector {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorScheme color;
        private final Padding margin;
        private final int width;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return TimelineComponent$Connector$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public Connector(int i3, int i9, Padding padding, ColorScheme colorScheme, k0 k0Var) {
            if (7 != (i3 & 7)) {
                AbstractC2686a0.l(i3, 7, TimelineComponent$Connector$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.width = i9;
            this.margin = padding;
            this.color = colorScheme;
        }

        public static final void write$Self$purchases_defaultsRelease(Connector self, b output, SerialDescriptor serialDesc) {
            output.n(0, self.width, serialDesc);
            output.h(serialDesc, 1, Padding$$serializer.INSTANCE, self.margin);
            output.h(serialDesc, 2, ColorScheme$$serializer.INSTANCE, self.color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connector)) {
                return false;
            }
            Connector connector = (Connector) obj;
            return this.width == connector.width && m.a(this.margin, connector.margin) && m.a(this.color, connector.color);
        }

        public final ColorScheme getColor() {
            return this.color;
        }

        public final Padding getMargin() {
            return this.margin;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.color.hashCode() + ((this.margin.hashCode() + (this.width * 31)) * 31);
        }

        public String toString() {
            return "Connector(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }

        public Connector(int i3, Padding margin, ColorScheme color) {
            m.e(margin, "margin");
            m.e(color, "color");
            this.width = i3;
            this.margin = margin;
            this.color = color;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "", "(Ljava/lang/String;I)V", "Title", "TitleAndDescription", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = TimelineIconAlignmentDeserializer.class)
    public enum IconAlignment {
        Title,
        TitleAndDescription;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return TimelineIconAlignmentDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @c
    public TimelineComponent(int i3, @h("item_spacing") int i9, @h("text_spacing") int i10, @h("column_gutter") int i11, @h("icon_alignment") IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, k0 k0Var) {
        t tVar = null;
        Object[] objArr = 0;
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, TimelineComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.itemSpacing = i9;
        this.textSpacing = i10;
        this.columnGutter = i11;
        this.iconAlignment = iconAlignment;
        if ((i3 & 16) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i3 & 32) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit(tVar, 1, (AbstractC2541f) (objArr == true ? 1 : 0)));
        } else {
            this.size = size;
        }
        if ((i3 & 64) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i3 & 128) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        int i12 = i3 & 256;
        w wVar = w.f23205h;
        if (i12 == 0) {
            this.items = wVar;
        } else {
            this.items = list;
        }
        if ((i3 & 512) == 0) {
            this.overrides = wVar;
        } else {
            this.overrides = list2;
        }
    }

    @h("column_gutter")
    public static void getColumnGutter$annotations() {
    }

    @h("icon_alignment")
    public static void getIconAlignment$annotations() {
    }

    @h("item_spacing")
    public static void getItemSpacing$annotations() {
    }

    @h("text_spacing")
    public static void getTextSpacing$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(TimelineComponent self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.n(0, self.itemSpacing, serialDesc);
        int i3 = 1;
        output.n(1, self.textSpacing, serialDesc);
        output.n(2, self.columnGutter, serialDesc);
        output.h(serialDesc, 3, TimelineIconAlignmentDeserializer.INSTANCE, self.iconAlignment);
        if (output.E(serialDesc) || self.visible != null) {
            output.t(serialDesc, 4, C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit((t) null, i3, (AbstractC2541f) (0 == true ? 1 : 0))))) {
            output.h(serialDesc, 5, Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 6, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 7, Padding$$serializer.INSTANCE, self.margin);
        }
        boolean zE = output.E(serialDesc);
        w wVar = w.f23205h;
        if (zE || !m.a(self.items, wVar)) {
            output.h(serialDesc, 8, kSerializerArr[8], self.items);
        }
        if (!output.E(serialDesc) && m.a(self.overrides, wVar)) {
            return;
        }
        output.h(serialDesc, 9, kSerializerArr[9], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineComponent)) {
            return false;
        }
        TimelineComponent timelineComponent = (TimelineComponent) obj;
        return this.itemSpacing == timelineComponent.itemSpacing && this.textSpacing == timelineComponent.textSpacing && this.columnGutter == timelineComponent.columnGutter && this.iconAlignment == timelineComponent.iconAlignment && m.a(this.visible, timelineComponent.visible) && m.a(this.size, timelineComponent.size) && m.a(this.padding, timelineComponent.padding) && m.a(this.margin, timelineComponent.margin) && m.a(this.items, timelineComponent.items) && m.a(this.overrides, timelineComponent.overrides);
    }

    public final int getColumnGutter() {
        return this.columnGutter;
    }

    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    public final List getItems() {
        return this.items;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Size getSize() {
        return this.size;
    }

    public final int getTextSpacing() {
        return this.textSpacing;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.iconAlignment.hashCode() + (((((this.itemSpacing * 31) + this.textSpacing) * 31) + this.columnGutter) * 31)) * 31;
        Boolean bool = this.visible;
        return this.overrides.hashCode() + a.b((this.margin.hashCode() + ((this.padding.hashCode() + ((this.size.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.items);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimelineComponent(itemSpacing=");
        sb.append(this.itemSpacing);
        sb.append(", textSpacing=");
        sb.append(this.textSpacing);
        sb.append(", columnGutter=");
        sb.append(this.columnGutter);
        sb.append(", iconAlignment=");
        sb.append(this.iconAlignment);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", overrides=");
        return M0.n(sb, this.overrides, ')');
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", LinkHeader.Parameters.Title, "", "visible", "description", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "icon", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "connector", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/TextComponent;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "getTitle", "()Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getDescription", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "getIcon", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "getConnector", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Item {
        private final Connector connector;
        private final TextComponent description;
        private final IconComponent icon;
        private final List<ComponentOverride<PartialTimelineComponentItem>> overrides;
        private final TextComponent title;
        private final Boolean visible;

        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {null, null, null, null, null, new C2691d(ComponentOverride.INSTANCE.serializer(PartialTimelineComponentItem$$serializer.INSTANCE), 0)};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return TimelineComponent$Item$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public Item(int i3, TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, k0 k0Var) {
            if (9 != (i3 & 9)) {
                AbstractC2686a0.l(i3, 9, TimelineComponent$Item$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = textComponent;
            if ((i3 & 2) == 0) {
                this.visible = null;
            } else {
                this.visible = bool;
            }
            if ((i3 & 4) == 0) {
                this.description = null;
            } else {
                this.description = textComponent2;
            }
            this.icon = iconComponent;
            if ((i3 & 16) == 0) {
                this.connector = null;
            } else {
                this.connector = connector;
            }
            if ((i3 & 32) == 0) {
                this.overrides = w.f23205h;
            } else {
                this.overrides = list;
            }
        }

        public static final void write$Self$purchases_defaultsRelease(Item self, b output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            output.h(serialDesc, 0, textComponent$$serializer, self.title);
            if (output.E(serialDesc) || self.visible != null) {
                output.t(serialDesc, 1, C2696g.f26961a, self.visible);
            }
            if (output.E(serialDesc) || self.description != null) {
                output.t(serialDesc, 2, textComponent$$serializer, self.description);
            }
            output.h(serialDesc, 3, IconComponent$$serializer.INSTANCE, self.icon);
            if (output.E(serialDesc) || self.connector != null) {
                output.t(serialDesc, 4, TimelineComponent$Connector$$serializer.INSTANCE, self.connector);
            }
            if (!output.E(serialDesc) && m.a(self.overrides, w.f23205h)) {
                return;
            }
            output.h(serialDesc, 5, kSerializerArr[5], self.overrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return m.a(this.title, item.title) && m.a(this.visible, item.visible) && m.a(this.description, item.description) && m.a(this.icon, item.icon) && m.a(this.connector, item.connector) && m.a(this.overrides, item.overrides);
        }

        public final Connector getConnector() {
            return this.connector;
        }

        public final TextComponent getDescription() {
            return this.description;
        }

        public final IconComponent getIcon() {
            return this.icon;
        }

        public final List getOverrides() {
            return this.overrides;
        }

        public final TextComponent getTitle() {
            return this.title;
        }

        public final Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Boolean bool = this.visible;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            TextComponent textComponent = this.description;
            int iHashCode3 = (this.icon.hashCode() + ((iHashCode2 + (textComponent == null ? 0 : textComponent.hashCode())) * 31)) * 31;
            Connector connector = this.connector;
            return this.overrides.hashCode() + ((iHashCode3 + (connector != null ? connector.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Item(title=");
            sb.append(this.title);
            sb.append(", visible=");
            sb.append(this.visible);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", connector=");
            sb.append(this.connector);
            sb.append(", overrides=");
            return M0.n(sb, this.overrides, ')');
        }

        public Item(TextComponent title, Boolean bool, TextComponent textComponent, IconComponent icon, Connector connector, List<ComponentOverride<PartialTimelineComponentItem>> overrides) {
            m.e(title, "title");
            m.e(icon, "icon");
            m.e(overrides, "overrides");
            this.title = title;
            this.visible = bool;
            this.description = textComponent;
            this.icon = icon;
            this.connector = connector;
            this.overrides = overrides;
        }

        public Item(TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, int i3, AbstractC2541f abstractC2541f) {
            this(textComponent, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : textComponent2, iconComponent, (i3 & 16) != 0 ? null : connector, (i3 & 32) != 0 ? w.f23205h : list);
        }
    }

    public TimelineComponent(int i3, int i9, int i10, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding margin, List<Item> items, List<ComponentOverride<PartialTimelineComponent>> overrides) {
        m.e(iconAlignment, "iconAlignment");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(items, "items");
        m.e(overrides, "overrides");
        this.itemSpacing = i3;
        this.textSpacing = i9;
        this.columnGutter = i10;
        this.iconAlignment = iconAlignment;
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.items = items;
        this.overrides = overrides;
    }

    public TimelineComponent(int i3, int i9, int i10, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, int i11, AbstractC2541f abstractC2541f) {
        t tVar = null;
        Object[] objArr = 0;
        bool = (i11 & 16) != 0 ? null : bool;
        size = (i11 & 32) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit(tVar, 1, (AbstractC2541f) (objArr == true ? 1 : 0))) : size;
        padding = (i11 & 64) != 0 ? Padding.INSTANCE.getZero() : padding;
        padding2 = (i11 & 128) != 0 ? Padding.INSTANCE.getZero() : padding2;
        int i12 = i11 & 256;
        w wVar = w.f23205h;
        this(i3, i9, i10, iconAlignment, bool, size, padding, padding2, i12 != 0 ? wVar : list, (i11 & 512) != 0 ? wVar : list2);
    }
}
