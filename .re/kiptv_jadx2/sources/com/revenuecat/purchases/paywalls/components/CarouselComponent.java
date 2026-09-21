package com.revenuecat.purchases.paywalls.components;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.StateUpdate;
import com.revenuecat.purchases.paywalls.components.common.StateUpdateSerializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
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
import p153r8.C;
import p153r8.C2691d;
import p153r8.C2696g;
import p153r8.K;
import p153r8.k0;
import p153r8.p0;
import p153r8.w0;

@h("carousel")
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\b\u0007\u0018\u0000 s2\u00020\u0001:\u0004tusvBÿ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*B\u008b\u0002\b\u0011\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0010\b\u0001\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÁ\u0001¢\u0006\u0004\b5\u00106R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bF\u0010B\u001a\u0004\bD\u0010ER\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010IR\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bK\u0010B\u001a\u0004\bJ\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bO\u0010B\u001a\u0004\bM\u0010NR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bS\u0010B\u001a\u0004\bQ\u0010RR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bZ\u0010YR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010a\u001a\u0004\bb\u0010cR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010d\u0012\u0004\bg\u0010B\u001a\u0004\be\u0010fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\bh\u0010=R\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010i\u0012\u0004\bl\u0010B\u001a\u0004\bj\u0010kR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00028\u0006¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\bm\u0010:R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010n\u001a\u0004\bo\u0010pR(\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u00108\u0012\u0004\br\u0010B\u001a\u0004\bq\u0010:¨\u0006w"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "pages", "", "visible", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "overrides", "", "name", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "stateUpdates", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "getOverrides", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getStateUpdates", "getStateUpdates$annotations", "Companion", "$serializer", "AutoAdvancePages", "PageControl", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class CarouselComponent implements PaywallComponent {
    private final AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final String name;
    private final List<ComponentOverride<PartialCarouselComponent>> overrides;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final List<StackComponent> pages;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final List<StateUpdate> stateUpdates;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {new C2691d(StackComponent$$serializer.INSTANCE, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C2691d(ComponentOverride.INSTANCE.serializer(PartialCarouselComponent$$serializer.INSTANCE), 0), null, new C2691d(StateUpdateSerializer.INSTANCE, 0)};

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\"!#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "", "", "msTimePerPage", "msTransitionTime", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "transitionType", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IIILcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getMsTimePerPage", "()I", "getMsTimePerPage$annotations", "()V", "getMsTransitionTime", "getMsTransitionTime$annotations", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "getTransitionType$annotations", "Companion", "$serializer", "TransitionType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class AutoAdvancePages {

        public static final Companion INSTANCE = new Companion(null);
        private final int msTimePerPage;
        private final int msTransitionTime;
        private final TransitionType transitionType;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CarouselComponent$AutoAdvancePages$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "SLIDE", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i(with = CarouselTransitionTypeDeserializer.class)
        public enum TransitionType {
            FADE,
            SLIDE;


            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages$TransitionType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return CarouselTransitionTypeDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @c
        public AutoAdvancePages(int i3, @h("ms_time_per_page") int i9, @h("ms_transition_time") int i10, @h("transition_type") TransitionType transitionType, k0 k0Var) {
            if (3 != (i3 & 3)) {
                AbstractC2686a0.l(i3, 3, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.msTimePerPage = i9;
            this.msTransitionTime = i10;
            if ((i3 & 4) == 0) {
                this.transitionType = null;
            } else {
                this.transitionType = transitionType;
            }
        }

        @h("ms_time_per_page")
        public static void getMsTimePerPage$annotations() {
        }

        @h("ms_transition_time")
        public static void getMsTransitionTime$annotations() {
        }

        @h("transition_type")
        public static void getTransitionType$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(AutoAdvancePages self, b output, SerialDescriptor serialDesc) {
            output.n(0, self.msTimePerPage, serialDesc);
            output.n(1, self.msTransitionTime, serialDesc);
            if (!output.E(serialDesc) && self.transitionType == null) {
                return;
            }
            output.t(serialDesc, 2, CarouselTransitionTypeDeserializer.INSTANCE, self.transitionType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoAdvancePages)) {
                return false;
            }
            AutoAdvancePages autoAdvancePages = (AutoAdvancePages) obj;
            return this.msTimePerPage == autoAdvancePages.msTimePerPage && this.msTransitionTime == autoAdvancePages.msTransitionTime && this.transitionType == autoAdvancePages.transitionType;
        }

        public final int getMsTimePerPage() {
            return this.msTimePerPage;
        }

        public final int getMsTransitionTime() {
            return this.msTransitionTime;
        }

        public final TransitionType getTransitionType() {
            return this.transitionType;
        }

        public int hashCode() {
            int i3 = ((this.msTimePerPage * 31) + this.msTransitionTime) * 31;
            TransitionType transitionType = this.transitionType;
            return i3 + (transitionType == null ? 0 : transitionType.hashCode());
        }

        public String toString() {
            return "AutoAdvancePages(msTimePerPage=" + this.msTimePerPage + ", msTransitionTime=" + this.msTransitionTime + ", transitionType=" + this.transitionType + ')';
        }

        public AutoAdvancePages(int i3, int i9, TransitionType transitionType) {
            this.msTimePerPage = i3;
            this.msTransitionTime = i9;
            this.transitionType = transitionType;
        }

        public AutoAdvancePages(int i3, int i9, TransitionType transitionType, int i10, AbstractC2541f abstractC2541f) {
            this(i3, i9, (i10 & 4) != 0 ? null : transitionType);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return CarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public CarouselComponent(int i3, List list, Boolean bool, @h("initial_page_index") Integer num, @h("page_alignment") VerticalAlignment verticalAlignment, Size size, @h("page_peek") Integer num2, @h("page_spacing") Float f9, @h("background_color") ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, @h("page_control") PageControl pageControl, Boolean bool2, @h("auto_advance") AutoAdvancePages autoAdvancePages, List list2, String str, @h("state_updates") List list3, k0 k0Var) {
        t tVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (9 != (i3 & 9)) {
            AbstractC2686a0.l(i3, 9, CarouselComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pages = list;
        if ((i3 & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i3 & 4) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        this.pageAlignment = verticalAlignment;
        if ((i3 & 16) == 0) {
            int i9 = 1;
            this.size = new Size(new SizeConstraint.Fit(tVar, i9, (AbstractC2541f) (objArr3 == true ? 1 : 0)), new SizeConstraint.Fit((t) (objArr2 == true ? 1 : 0), i9, (AbstractC2541f) (objArr == true ? 1 : 0)));
        } else {
            this.size = size;
        }
        if ((i3 & 32) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i3 & 64) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f9;
        }
        if ((i3 & 128) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i3 & 256) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i3 & 512) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i3 & 1024) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i3 & 2048) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i3 & 4096) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i3 & 8192) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i3 & 16384) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((32768 & i3) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((65536 & i3) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
        this.overrides = (131072 & i3) == 0 ? w.f23205h : list2;
        if ((262144 & i3) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i3 & 524288) == 0) {
            this.stateUpdates = null;
        } else {
            this.stateUpdates = list3;
        }
    }

    @h("auto_advance")
    public static void getAutoAdvance$annotations() {
    }

    @h("background_color")
    public static void getBackgroundColor$annotations() {
    }

    @h("initial_page_index")
    public static void getInitialPageIndex$annotations() {
    }

    @h("page_alignment")
    public static void getPageAlignment$annotations() {
    }

    @h("page_control")
    public static void getPageControl$annotations() {
    }

    @h("page_peek")
    public static void getPagePeek$annotations() {
    }

    @h("page_spacing")
    public static void getPageSpacing$annotations() {
    }

    @h("state_updates")
    public static void getStateUpdates$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(CarouselComponent self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, kSerializerArr[0], self.pages);
        int i3 = 1;
        if (output.E(serialDesc) || self.visible != null) {
            output.t(serialDesc, 1, C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || self.initialPageIndex != null) {
            output.t(serialDesc, 2, K.f26915a, self.initialPageIndex);
        }
        output.h(serialDesc, 3, VerticalAlignmentDeserializer.INSTANCE, self.pageAlignment);
        if (output.E(serialDesc) || !m.a(self.size, new Size(new SizeConstraint.Fit((t) null, i3, (AbstractC2541f) (0 == true ? 1 : 0)), new SizeConstraint.Fit((t) (0 == true ? 1 : 0), i3, (AbstractC2541f) (0 == true ? 1 : 0))))) {
            output.h(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || self.pagePeek != null) {
            output.t(serialDesc, 5, K.f26915a, self.pagePeek);
        }
        if (output.E(serialDesc) || self.pageSpacing != null) {
            output.t(serialDesc, 6, C.f26895a, self.pageSpacing);
        }
        if (output.E(serialDesc) || self.backgroundColor != null) {
            output.t(serialDesc, 7, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.E(serialDesc) || self.background != null) {
            output.t(serialDesc, 8, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.E(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 9, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
            output.h(serialDesc, 10, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.E(serialDesc) || self.shape != null) {
            output.t(serialDesc, 11, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.E(serialDesc) || self.border != null) {
            output.t(serialDesc, 12, Border$$serializer.INSTANCE, self.border);
        }
        if (output.E(serialDesc) || self.shadow != null) {
            output.t(serialDesc, 13, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (output.E(serialDesc) || self.pageControl != null) {
            output.t(serialDesc, 14, CarouselComponent$PageControl$$serializer.INSTANCE, self.pageControl);
        }
        if (output.E(serialDesc) || self.loop != null) {
            output.t(serialDesc, 15, C2696g.f26961a, self.loop);
        }
        if (output.E(serialDesc) || self.autoAdvance != null) {
            output.t(serialDesc, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, self.autoAdvance);
        }
        if (output.E(serialDesc) || !m.a(self.overrides, w.f23205h)) {
            output.h(serialDesc, 17, kSerializerArr[17], self.overrides);
        }
        if (output.E(serialDesc) || self.name != null) {
            output.t(serialDesc, 18, p0.f26988a, self.name);
        }
        if (!output.E(serialDesc) && self.stateUpdates == null) {
            return;
        }
        output.t(serialDesc, 19, kSerializerArr[19], self.stateUpdates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponent)) {
            return false;
        }
        CarouselComponent carouselComponent = (CarouselComponent) obj;
        return m.a(this.pages, carouselComponent.pages) && m.a(this.visible, carouselComponent.visible) && m.a(this.initialPageIndex, carouselComponent.initialPageIndex) && this.pageAlignment == carouselComponent.pageAlignment && m.a(this.size, carouselComponent.size) && m.a(this.pagePeek, carouselComponent.pagePeek) && m.a(this.pageSpacing, carouselComponent.pageSpacing) && m.a(this.backgroundColor, carouselComponent.backgroundColor) && m.a(this.background, carouselComponent.background) && m.a(this.padding, carouselComponent.padding) && m.a(this.margin, carouselComponent.margin) && m.a(this.shape, carouselComponent.shape) && m.a(this.border, carouselComponent.border) && m.a(this.shadow, carouselComponent.shadow) && m.a(this.pageControl, carouselComponent.pageControl) && m.a(this.loop, carouselComponent.loop) && m.a(this.autoAdvance, carouselComponent.autoAdvance) && m.a(this.overrides, carouselComponent.overrides) && m.a(this.name, carouselComponent.name) && m.a(this.stateUpdates, carouselComponent.stateUpdates);
    }

    public final AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final Boolean getLoop() {
        return this.loop;
    }

    public final Padding getMargin() {
        return this.margin;
    }

    public final String getName() {
        return this.name;
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final PageControl getPageControl() {
        return this.pageControl;
    }

    public final Integer getPagePeek() {
        return this.pagePeek;
    }

    public final Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final List getPages() {
        return this.pages;
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

    public final List getStateUpdates() {
        return this.stateUpdates;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.initialPageIndex;
        int iHashCode3 = (this.size.hashCode() + ((this.pageAlignment.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        Integer num2 = this.pagePeek;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f9 = this.pageSpacing;
        int iHashCode5 = (iHashCode4 + (f9 == null ? 0 : f9.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode6 = (iHashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode7 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode6 + (background == null ? 0 : background.hashCode())) * 31)) * 31)) * 31;
        Shape shape = this.shape;
        int iHashCode8 = (iHashCode7 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode9 = (iHashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode10 = (iHashCode9 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        PageControl pageControl = this.pageControl;
        int iHashCode11 = (iHashCode10 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AutoAdvancePages autoAdvancePages = this.autoAdvance;
        int iB = a.b((iHashCode12 + (autoAdvancePages == null ? 0 : autoAdvancePages.hashCode())) * 31, 31, this.overrides);
        String str = this.name;
        int iHashCode13 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        List<StateUpdate> list = this.stateUpdates;
        return iHashCode13 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CarouselComponent(pages=");
        sb.append(this.pages);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", initialPageIndex=");
        sb.append(this.initialPageIndex);
        sb.append(", pageAlignment=");
        sb.append(this.pageAlignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", pagePeek=");
        sb.append(this.pagePeek);
        sb.append(", pageSpacing=");
        sb.append(this.pageSpacing);
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
        sb.append(", pageControl=");
        sb.append(this.pageControl);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", autoAdvance=");
        sb.append(this.autoAdvance);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", stateUpdates=");
        return M0.n(sb, this.stateUpdates, ')');
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0004@?ABBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b>\u0010=¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "position", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "active", "default", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "getPosition", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "Ljava/lang/Integer;", "getSpacing", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getActive", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "getDefault", "Companion", "$serializer", "Indicator", "Position", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class PageControl {

        public static final Companion INSTANCE = new Companion(null);
        private final Indicator active;
        private final ColorScheme backgroundColor;
        private final Border border;
        private final Indicator default;
        private final Padding margin;
        private final Padding padding;
        private final Position position;
        private final Shadow shadow;
        private final Shape shape;
        private final Integer spacing;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CarouselComponent$PageControl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBQ\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u001fR(\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "", "Lh6/t;", "width", "height", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", TtmlNode.ATTR_TTS_COLOR, "strokeColor", "strokeWidth", "<init>", "(IILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lh6/t;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILh6/t;Lh6/t;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lh6/t;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getStrokeColor", "getStrokeColor$annotations", "()V", "Lh6/t;", "getStrokeWidth-0hXNFcg", "()Lh6/t;", "getStrokeWidth-0hXNFcg$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class Indicator {

            public static final Companion INSTANCE = new Companion(null);
            private final ColorScheme color;
            private final int height;
            private final ColorScheme strokeColor;
            private final t strokeWidth;
            private final int width;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Indicator(int i3, int i9, ColorScheme colorScheme, ColorScheme colorScheme2, t tVar, AbstractC2541f abstractC2541f) {
                this(i3, i9, colorScheme, colorScheme2, tVar);
            }

            @h("stroke_color")
            public static void getStrokeColor$annotations() {
            }

            @h("stroke_width")
            public static void m195getStrokeWidth0hXNFcg$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(Indicator self, b output, SerialDescriptor serialDesc) {
                w0 w0Var = w0.f27015a;
                output.h(serialDesc, 0, w0Var, new t(self.width));
                output.h(serialDesc, 1, w0Var, new t(self.height));
                ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
                output.h(serialDesc, 2, colorScheme$$serializer, self.color);
                if (output.E(serialDesc) || self.strokeColor != null) {
                    output.t(serialDesc, 3, colorScheme$$serializer, self.strokeColor);
                }
                if (!output.E(serialDesc) && self.strokeWidth == null) {
                    return;
                }
                output.t(serialDesc, 4, w0Var, self.strokeWidth);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) obj;
                return this.width == indicator.width && this.height == indicator.height && m.a(this.color, indicator.color) && m.a(this.strokeColor, indicator.strokeColor) && m.a(this.strokeWidth, indicator.strokeWidth);
            }

            public final ColorScheme getColor() {
                return this.color;
            }

            public final int getHeight() {
                return this.height;
            }

            public final ColorScheme getStrokeColor() {
                return this.strokeColor;
            }

            public final t getStrokeWidth() {
                return this.strokeWidth;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int iHashCode = (this.color.hashCode() + (((this.width * 31) + this.height) * 31)) * 31;
                ColorScheme colorScheme = this.strokeColor;
                int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
                t tVar = this.strokeWidth;
                return iHashCode2 + (tVar != null ? Integer.hashCode(tVar.f22551h) : 0);
            }

            public String toString() {
                return "Indicator(width=" + ((Object) t.a(this.width)) + ", height=" + ((Object) t.a(this.height)) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
            }

            @c
            public Indicator(int i3, t tVar, t tVar2, ColorScheme colorScheme, @h("stroke_color") ColorScheme colorScheme2, @h("stroke_width") t tVar3, k0 k0Var, AbstractC2541f abstractC2541f) {
                this(i3, tVar, tVar2, colorScheme, colorScheme2, tVar3, k0Var);
            }

            private Indicator(int i3, int i9, ColorScheme color, ColorScheme colorScheme, t tVar) {
                m.e(color, "color");
                this.width = i3;
                this.height = i9;
                this.color = color;
                this.strokeColor = colorScheme;
                this.strokeWidth = tVar;
            }

            private Indicator(int i3, t tVar, t tVar2, ColorScheme colorScheme, ColorScheme colorScheme2, t tVar3, k0 k0Var) {
                if (7 != (i3 & 7)) {
                    AbstractC2686a0.l(i3, 7, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.width = tVar.f22551h;
                this.height = tVar2.f22551h;
                this.color = colorScheme;
                if ((i3 & 8) == 0) {
                    this.strokeColor = null;
                } else {
                    this.strokeColor = colorScheme2;
                }
                if ((i3 & 16) == 0) {
                    this.strokeWidth = null;
                } else {
                    this.strokeWidth = tVar3;
                }
            }

            public Indicator(int i3, int i9, ColorScheme colorScheme, ColorScheme colorScheme2, t tVar, int i10, AbstractC2541f abstractC2541f) {
                this(i3, i9, colorScheme, (i10 & 8) != 0 ? null : colorScheme2, (i10 & 16) != 0 ? null : tVar, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i(with = CarouselPageControlPositionDeserializer.class)
        public enum Position {
            TOP,
            BOTTOM;


            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Position;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return CarouselPageControlPositionDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @c
        public PageControl(int i3, Position position, Integer num, Padding padding, Padding padding2, @h("background_color") ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, k0 k0Var) {
            if (769 != (i3 & 769)) {
                AbstractC2686a0.l(i3, 769, CarouselComponent$PageControl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.position = position;
            if ((i3 & 2) == 0) {
                this.spacing = null;
            } else {
                this.spacing = num;
            }
            if ((i3 & 4) == 0) {
                this.padding = Padding.INSTANCE.getZero();
            } else {
                this.padding = padding;
            }
            if ((i3 & 8) == 0) {
                this.margin = Padding.INSTANCE.getZero();
            } else {
                this.margin = padding2;
            }
            if ((i3 & 16) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = colorScheme;
            }
            if ((i3 & 32) == 0) {
                this.shape = null;
            } else {
                this.shape = shape;
            }
            if ((i3 & 64) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i3 & 128) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
            this.active = indicator;
            this.default = indicator2;
        }

        @h("background_color")
        public static void getBackgroundColor$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(PageControl self, b output, SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, CarouselPageControlPositionDeserializer.INSTANCE, self.position);
            if (output.E(serialDesc) || self.spacing != null) {
                output.t(serialDesc, 1, K.f26915a, self.spacing);
            }
            if (output.E(serialDesc) || !m.a(self.padding, Padding.INSTANCE.getZero())) {
                output.h(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
            }
            if (output.E(serialDesc) || !m.a(self.margin, Padding.INSTANCE.getZero())) {
                output.h(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
            }
            if (output.E(serialDesc) || self.backgroundColor != null) {
                output.t(serialDesc, 4, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
            }
            if (output.E(serialDesc) || self.shape != null) {
                output.t(serialDesc, 5, ShapeDeserializer.INSTANCE, self.shape);
            }
            if (output.E(serialDesc) || self.border != null) {
                output.t(serialDesc, 6, Border$$serializer.INSTANCE, self.border);
            }
            if (output.E(serialDesc) || self.shadow != null) {
                output.t(serialDesc, 7, Shadow$$serializer.INSTANCE, self.shadow);
            }
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            output.h(serialDesc, 8, carouselComponent$PageControl$Indicator$$serializer, self.active);
            output.h(serialDesc, 9, carouselComponent$PageControl$Indicator$$serializer, self.default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControl)) {
                return false;
            }
            PageControl pageControl = (PageControl) obj;
            return this.position == pageControl.position && m.a(this.spacing, pageControl.spacing) && m.a(this.padding, pageControl.padding) && m.a(this.margin, pageControl.margin) && m.a(this.backgroundColor, pageControl.backgroundColor) && m.a(this.shape, pageControl.shape) && m.a(this.border, pageControl.border) && m.a(this.shadow, pageControl.shadow) && m.a(this.active, pageControl.active) && m.a(this.default, pageControl.default);
        }

        public final Indicator getActive() {
            return this.active;
        }

        public final ColorScheme getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Border getBorder() {
            return this.border;
        }

        public final Indicator getDefault() {
            return this.default;
        }

        public final Padding getMargin() {
            return this.margin;
        }

        public final Padding getPadding() {
            return this.padding;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        public final Integer getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int iHashCode = this.position.hashCode() * 31;
            Integer num = this.spacing;
            int iHashCode2 = (this.margin.hashCode() + ((this.padding.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
            ColorScheme colorScheme = this.backgroundColor;
            int iHashCode3 = (iHashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
            Shape shape = this.shape;
            int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
            Border border = this.border;
            int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            return this.default.hashCode() + ((this.active.hashCode() + ((iHashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            return "PageControl(position=" + this.position + ", spacing=" + this.spacing + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }

        public PageControl(Position position, Integer num, Padding padding, Padding margin, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator active, Indicator indicator) {
            m.e(position, "position");
            m.e(padding, "padding");
            m.e(margin, "margin");
            m.e(active, "active");
            m.e(indicator, "default");
            this.position = position;
            this.spacing = num;
            this.padding = padding;
            this.margin = margin;
            this.backgroundColor = colorScheme;
            this.shape = shape;
            this.border = border;
            this.shadow = shadow;
            this.active = active;
            this.default = indicator;
        }

        public PageControl(Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, int i3, AbstractC2541f abstractC2541f) {
            this(position, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? Padding.INSTANCE.getZero() : padding, (i3 & 8) != 0 ? Padding.INSTANCE.getZero() : padding2, (i3 & 16) != 0 ? null : colorScheme, (i3 & 32) != 0 ? null : shape, (i3 & 64) != 0 ? null : border, (i3 & 128) != 0 ? null : shadow, indicator, indicator2);
        }
    }

    public CarouselComponent(List<StackComponent> pages, Boolean bool, Integer num, VerticalAlignment pageAlignment, Size size, Integer num2, Float f9, ColorScheme colorScheme, Background background, Padding padding, Padding margin, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List<ComponentOverride<PartialCarouselComponent>> overrides, String str, List<? extends StateUpdate> list) {
        m.e(pages, "pages");
        m.e(pageAlignment, "pageAlignment");
        m.e(size, "size");
        m.e(padding, "padding");
        m.e(margin, "margin");
        m.e(overrides, "overrides");
        this.pages = pages;
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = pageAlignment;
        this.size = size;
        this.pagePeek = num2;
        this.pageSpacing = f9;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.pageControl = pageControl;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
        this.overrides = overrides;
        this.name = str;
        this.stateUpdates = list;
    }

    public CarouselComponent(List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f9, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, String str, List list3, int i3, AbstractC2541f abstractC2541f) {
        Size size2;
        t tVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Boolean bool3 = (i3 & 2) != 0 ? null : bool;
        Integer num3 = (i3 & 4) != 0 ? null : num;
        if ((i3 & 16) != 0) {
            int i9 = 1;
            size2 = new Size(new SizeConstraint.Fit(tVar, i9, (AbstractC2541f) (objArr3 == true ? 1 : 0)), new SizeConstraint.Fit((t) (objArr2 == true ? 1 : 0), i9, (AbstractC2541f) (objArr == true ? 1 : 0)));
        } else {
            size2 = size;
        }
        this(list, bool3, num3, verticalAlignment, size2, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : f9, (i3 & 128) != 0 ? null : colorScheme, (i3 & 256) != 0 ? null : background, (i3 & 512) != 0 ? Padding.INSTANCE.getZero() : padding, (i3 & 1024) != 0 ? Padding.INSTANCE.getZero() : padding2, (i3 & 2048) != 0 ? null : shape, (i3 & 4096) != 0 ? null : border, (i3 & 8192) != 0 ? null : shadow, (i3 & 16384) != 0 ? null : pageControl, (32768 & i3) != 0 ? null : bool2, (65536 & i3) != 0 ? null : autoAdvancePages, (131072 & i3) != 0 ? w.f23205h : list2, (262144 & i3) != 0 ? null : str, (i3 & 524288) != 0 ? null : list3);
    }
}
