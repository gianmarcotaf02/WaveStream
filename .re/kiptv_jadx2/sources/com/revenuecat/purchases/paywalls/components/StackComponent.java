package com.revenuecat.purchases.paywalls.components;

import B2.a;
import E6.InterfaceC0331d;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p070h6.t;
import p078i6.w;
import p119n8.f;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.C2696g;
import p153r8.k0;
import p153r8.p0;

@h("stack")
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u0000 `2\u00020\u0001:\u0003a`bBË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#BÏ\u0001\b\u0011\u0012\u0006\u0010%\u001a\u00020$\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\"\u0010(J(\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,HÁ\u0001¢\u0006\u0004\b/\u00100R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bL\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010Y\u001a\u0004\bZ\u0010[R#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b\\\u00104R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010]\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "components", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "badge", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "overflow", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "overrides", "", "name", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/util/List;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "getDimension", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/Float;", "getSpacing", "()Ljava/lang/Float;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "getBadge", "()Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverflow", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverrides", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion", "$serializer", "Overflow", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class StackComponent implements PaywallComponent {
    private static final KSerializer[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Badge badge;
    private final Border border;
    private final List<PaywallComponent> components;
    private final Dimension dimension;
    private final Padding margin;
    private final String name;
    private final Overflow overflow;
    private final List<ComponentOverride<PartialStackComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return StackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "", "(Ljava/lang/String;I)V", "NONE", "SCROLL", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = StackOverflowDeserializer.class)
    public enum Overflow {
        NONE,
        SCROLL;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return StackOverflowDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    static {
        C2691d c2691d = new C2691d(new PaywallComponentSerializer(), 0);
        C c9 = B.f24540a;
        $childSerializers = new KSerializer[]{c2691d, null, new f("com.revenuecat.purchases.paywalls.components.properties.Dimension", c9.b(Dimension.class), new InterfaceC0331d[]{c9.b(Dimension.Horizontal.class), c9.b(Dimension.Vertical.class), c9.b(Dimension.ZLayer.class)}, new KSerializer[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, null, null, null, null, null, null, new C2691d(ComponentOverride.INSTANCE.serializer(PartialStackComponent$$serializer.INSTANCE), 0), null};
    }

    @c
    public StackComponent(int i3, List list, Boolean bool, Dimension dimension, Size size, Float f9, @h("background_color") ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List list2, String str, k0 k0Var) {
        t tVar = null;
        Object[] objArr = 0;
        int i9 = 1;
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, StackComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.components = list;
        if ((i3 & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i3 & 4) == 0) {
            this.dimension = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
        } else {
            this.dimension = dimension;
        }
        if ((i3 & 8) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit(tVar, i9, (AbstractC2541f) (objArr == true ? 1 : 0)));
        } else {
            this.size = size;
        }
        if ((i3 & 16) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f9;
        }
        if ((i3 & 32) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i3 & 64) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i3 & 128) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i3 & 256) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i3 & 512) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i3 & 1024) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i3 & 2048) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i3 & 4096) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
        if ((i3 & 8192) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow;
        }
        this.overrides = (i3 & 16384) == 0 ? w.f23205h : list2;
        if ((i3 & 32768) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    @h("background_color")
    public static void getBackgroundColor$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(StackComponent self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, kSerializerArr[0], self.components);
        int i3 = 1;
        if (output.E(serialDesc) || self.visible != null) {
            output.t(serialDesc, 1, C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || !m.a(self.dimension, new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START))) {
            output.h(serialDesc, 2, kSerializerArr[2], self.dimension);
        }
        if (output.E(serialDesc) || !m.a(self.size, new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit((t) null, i3, (AbstractC2541f) (0 == true ? 1 : 0))))) {
            output.h(serialDesc, 3, Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || self.spacing != null) {
            output.t(serialDesc, 4, p153r8.C.f26895a, self.spacing);
        }
        if (output.E(serialDesc) || self.backgroundColor != null) {
            output.t(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.E(serialDesc) || self.background != null) {
            output.t(serialDesc, 6, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.E(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 7, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 8, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.E(serialDesc) || self.shape != null) {
            output.t(serialDesc, 9, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.E(serialDesc) || self.border != null) {
            output.t(serialDesc, 10, Border$$serializer.INSTANCE, self.border);
        }
        if (output.E(serialDesc) || self.shadow != null) {
            output.t(serialDesc, 11, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (output.E(serialDesc) || self.badge != null) {
            output.t(serialDesc, 12, Badge$$serializer.INSTANCE, self.badge);
        }
        if (output.E(serialDesc) || self.overflow != null) {
            output.t(serialDesc, 13, StackOverflowDeserializer.INSTANCE, self.overflow);
        }
        if (output.E(serialDesc) || !m.a(self.overrides, w.f23205h)) {
            output.h(serialDesc, 14, kSerializerArr[14], self.overrides);
        }
        if (!output.E(serialDesc) && self.name == null) {
            return;
        }
        output.t(serialDesc, 15, p0.f26988a, self.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponent)) {
            return false;
        }
        StackComponent stackComponent = (StackComponent) obj;
        return m.a(this.components, stackComponent.components) && m.a(this.visible, stackComponent.visible) && m.a(this.dimension, stackComponent.dimension) && m.a(this.size, stackComponent.size) && m.a(this.spacing, stackComponent.spacing) && m.a(this.backgroundColor, stackComponent.backgroundColor) && m.a(this.background, stackComponent.background) && m.a(this.padding, stackComponent.padding) && m.a(this.margin, stackComponent.margin) && m.a(this.shape, stackComponent.shape) && m.a(this.border, stackComponent.border) && m.a(this.shadow, stackComponent.shadow) && m.a(this.badge, stackComponent.badge) && this.overflow == stackComponent.overflow && m.a(this.overrides, stackComponent.overrides) && m.a(this.name, stackComponent.name);
    }

    public final Background getBackground() {
        return this.background;
    }

    public final ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final List getComponents() {
        return this.components;
    }

    public final Dimension getDimension() {
        return this.dimension;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final String getName() {
        return this.name;
    }

    public final Overflow getOverflow() {
        return this.overflow;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Float getSpacing() {
        return this.spacing;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.components.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (this.size.hashCode() + ((this.dimension.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        Float f9 = this.spacing;
        int iHashCode3 = (iHashCode2 + (f9 == null ? 0 : f9.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode5 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode4 + (background == null ? 0 : background.hashCode())) * 31)) * 31)) * 31;
        Shape shape = this.shape;
        int iHashCode6 = (iHashCode5 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode7 = (iHashCode6 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (iHashCode7 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        Badge badge = this.badge;
        int iHashCode9 = (iHashCode8 + (badge == null ? 0 : badge.hashCode())) * 31;
        Overflow overflow = this.overflow;
        int iB = a.b((iHashCode9 + (overflow == null ? 0 : overflow.hashCode())) * 31, 31, this.overrides);
        String str = this.name;
        return iB + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StackComponent(components=");
        sb.append(this.components);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", dimension=");
        sb.append(this.dimension);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", spacing=");
        sb.append(this.spacing);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(", name=");
        return Y6.f.l(sb, this.name, ')');
    }

    public StackComponent(List<? extends PaywallComponent> components, Boolean bool, Dimension dimension, Size size, Float f9, ColorScheme colorScheme, Background background, Padding padding, Padding margin, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List<ComponentOverride<PartialStackComponent>> overrides, String str) {
        m.e(components, "components");
        m.e(dimension, "dimension");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.components = components;
        this.visible = bool;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f9;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.badge = badge;
        this.overflow = overflow;
        this.overrides = overrides;
        this.name = str;
    }

    public StackComponent(List list, Boolean bool, Dimension dimension, Size size, Float f9, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List list2, String str, int i3, AbstractC2541f abstractC2541f) {
        Size size2;
        t tVar = null;
        Object[] objArr = 0;
        Boolean bool2 = (i3 & 2) != 0 ? null : bool;
        Dimension vertical = (i3 & 4) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : dimension;
        if ((i3 & 8) != 0) {
            size2 = new Size(SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fit(tVar, 1, (AbstractC2541f) (objArr == true ? 1 : 0)));
        } else {
            size2 = size;
        }
        this(list, bool2, vertical, size2, (i3 & 16) != 0 ? null : f9, (i3 & 32) != 0 ? null : colorScheme, (i3 & 64) != 0 ? null : background, (i3 & 128) != 0 ? Padding.INSTANCE.getZero() : padding, (i3 & 256) != 0 ? Padding.INSTANCE.getZero() : padding2, (i3 & 512) != 0 ? null : shape, (i3 & 1024) != 0 ? null : border, (i3 & 2048) != 0 ? null : shadow, (i3 & 4096) != 0 ? null : badge, (i3 & 8192) != 0 ? null : overflow, (i3 & 16384) != 0 ? w.f23205h : list2, (i3 & 32768) != 0 ? null : str);
    }
}
