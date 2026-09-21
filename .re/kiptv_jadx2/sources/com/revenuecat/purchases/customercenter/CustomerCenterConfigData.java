package com.revenuecat.purchases.customercenter;

import B2.a;
import E6.InterfaceC0331d;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.flac.FlacConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import dev.jdtech.mpv.MPVLib;
import io.ktor.http.LinkHeader;
import io.sentry.protocol.Device;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p078i6.x;
import p119n8.f;
import p119n8.h;
import p119n8.i;
import p121o0.p;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.C2696g;
import p153r8.F;
import p153r8.k0;
import p153r8.p0;
import v5.L;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\bBCADEFGHB?\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*JP\u0010+\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010*¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "screens", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "appearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "support", "", "lastPublishedAppVersion", "<init>", "(Ljava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getManagementScreen", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "getNoActiveScreen", "component1", "()Ljava/util/Map;", "component2", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "component4", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "component5", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Ljava/lang/String;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getScreens", "getScreens$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "getAppearance", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "getLocalization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "getSupport", "Ljava/lang/String;", "getLastPublishedAppVersion", "getLastPublishedAppVersion$annotations", "Companion", "$serializer", "Appearance", "HelpPath", "Localization", "Screen", "ScreenOffering", "Support", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class CustomerCenterConfigData {

    public static final Companion INSTANCE = new Companion(null);
    private final Appearance appearance;
    private final String lastPublishedAppVersion;
    private final Localization localization;
    private final Map<Screen.ScreenType, Screen> screens;
    private final Support support;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "component2", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "getLight", "getDark", "Companion", "$serializer", "ColorInformation", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Appearance {

        public static final Companion INSTANCE = new Companion(null);
        private final ColorInformation dark;
        private final ColorInformation light;

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276Ba\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\t\u0010\nBu\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJj\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR(\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR(\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001aR(\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001aR(\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001a¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Lcom/revenuecat/purchases/customercenter/RCColor;", "accentColor", "textColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "buttonTextColor", "buttonBackgroundColor", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component2", "component3", "component4", "component5", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getAccentColor", "getAccentColor$annotations", "()V", "getTextColor", "getTextColor$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getButtonTextColor", "getButtonTextColor$annotations", "getButtonBackgroundColor", "getButtonBackgroundColor$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class ColorInformation {

            public static final Companion INSTANCE = new Companion(null);
            private final PaywallColor accentColor;
            private final PaywallColor backgroundColor;
            private final PaywallColor buttonBackgroundColor;
            private final PaywallColor buttonTextColor;
            private final PaywallColor textColor;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ColorInformation() {
                this((PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31, (AbstractC2541f) null);
            }

            public static ColorInformation copy$default(ColorInformation colorInformation, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    paywallColor = colorInformation.accentColor;
                }
                if ((i3 & 2) != 0) {
                    paywallColor2 = colorInformation.textColor;
                }
                if ((i3 & 4) != 0) {
                    paywallColor3 = colorInformation.backgroundColor;
                }
                if ((i3 & 8) != 0) {
                    paywallColor4 = colorInformation.buttonTextColor;
                }
                if ((i3 & 16) != 0) {
                    paywallColor5 = colorInformation.buttonBackgroundColor;
                }
                PaywallColor paywallColor6 = paywallColor5;
                PaywallColor paywallColor7 = paywallColor3;
                return colorInformation.copy(paywallColor, paywallColor2, paywallColor7, paywallColor4, paywallColor6);
            }

            @h("accent_color")
            @i(with = PaywallColor.Serializer.class)
            public static void getAccentColor$annotations() {
            }

            @h("background_color")
            @i(with = PaywallColor.Serializer.class)
            public static void getBackgroundColor$annotations() {
            }

            @h("button_background_color")
            @i(with = PaywallColor.Serializer.class)
            public static void getButtonBackgroundColor$annotations() {
            }

            @h("button_text_color")
            @i(with = PaywallColor.Serializer.class)
            public static void getButtonTextColor$annotations() {
            }

            @h("text_color")
            @i(with = PaywallColor.Serializer.class)
            public static void getTextColor$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(ColorInformation self, b output, SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.accentColor != null) {
                    output.t(serialDesc, 0, PaywallColor.Serializer.INSTANCE, self.accentColor);
                }
                if (output.E(serialDesc) || self.textColor != null) {
                    output.t(serialDesc, 1, PaywallColor.Serializer.INSTANCE, self.textColor);
                }
                if (output.E(serialDesc) || self.backgroundColor != null) {
                    output.t(serialDesc, 2, PaywallColor.Serializer.INSTANCE, self.backgroundColor);
                }
                if (output.E(serialDesc) || self.buttonTextColor != null) {
                    output.t(serialDesc, 3, PaywallColor.Serializer.INSTANCE, self.buttonTextColor);
                }
                if (!output.E(serialDesc) && self.buttonBackgroundColor == null) {
                    return;
                }
                output.t(serialDesc, 4, PaywallColor.Serializer.INSTANCE, self.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final ColorInformation copy(PaywallColor accentColor, PaywallColor textColor, PaywallColor backgroundColor, PaywallColor buttonTextColor, PaywallColor buttonBackgroundColor) {
                return new ColorInformation(accentColor, textColor, backgroundColor, buttonTextColor, buttonBackgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) other;
                return m.a(this.accentColor, colorInformation.accentColor) && m.a(this.textColor, colorInformation.textColor) && m.a(this.backgroundColor, colorInformation.backgroundColor) && m.a(this.buttonTextColor, colorInformation.buttonTextColor) && m.a(this.buttonBackgroundColor, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                PaywallColor paywallColor = this.accentColor;
                int iHashCode = (paywallColor == null ? 0 : paywallColor.hashCode()) * 31;
                PaywallColor paywallColor2 = this.textColor;
                int iHashCode2 = (iHashCode + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31;
                PaywallColor paywallColor3 = this.backgroundColor;
                int iHashCode3 = (iHashCode2 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.buttonTextColor;
                int iHashCode4 = (iHashCode3 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.buttonBackgroundColor;
                return iHashCode4 + (paywallColor5 != null ? paywallColor5.hashCode() : 0);
            }

            public String toString() {
                return "ColorInformation(accentColor=" + this.accentColor + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonTextColor=" + this.buttonTextColor + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ')';
            }

            @c
            public ColorInformation(int i3, @h("accent_color") @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @h("text_color") @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @h("background_color") @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @h("button_text_color") @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @h("button_background_color") @i(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.accentColor = null;
                } else {
                    this.accentColor = paywallColor;
                }
                if ((i3 & 2) == 0) {
                    this.textColor = null;
                } else {
                    this.textColor = paywallColor2;
                }
                if ((i3 & 4) == 0) {
                    this.backgroundColor = null;
                } else {
                    this.backgroundColor = paywallColor3;
                }
                if ((i3 & 8) == 0) {
                    this.buttonTextColor = null;
                } else {
                    this.buttonTextColor = paywallColor4;
                }
                if ((i3 & 16) == 0) {
                    this.buttonBackgroundColor = null;
                } else {
                    this.buttonBackgroundColor = paywallColor5;
                }
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                this.accentColor = paywallColor;
                this.textColor = paywallColor2;
                this.backgroundColor = paywallColor3;
                this.buttonTextColor = paywallColor4;
                this.buttonBackgroundColor = paywallColor5;
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : paywallColor, (i3 & 2) != 0 ? null : paywallColor2, (i3 & 4) != 0 ? null : paywallColor3, (i3 & 8) != 0 ? null : paywallColor4, (i3 & 16) != 0 ? null : paywallColor5);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$Appearance$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Appearance() {
            this((ColorInformation) null, (ColorInformation) (0 == true ? 1 : 0), 3, (AbstractC2541f) (0 == true ? 1 : 0));
        }

        public static Appearance copy$default(Appearance appearance, ColorInformation colorInformation, ColorInformation colorInformation2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                colorInformation = appearance.light;
            }
            if ((i3 & 2) != 0) {
                colorInformation2 = appearance.dark;
            }
            return appearance.copy(colorInformation, colorInformation2);
        }

        public static final void write$Self$purchases_defaultsRelease(Appearance self, b output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.light != null) {
                output.t(serialDesc, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, self.light);
            }
            if (!output.E(serialDesc) && self.dark == null) {
                return;
            }
            output.t(serialDesc, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, self.dark);
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final Appearance copy(ColorInformation light, ColorInformation dark) {
            return new Appearance(light, dark);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) other;
            return m.a(this.light, appearance.light) && m.a(this.dark, appearance.dark);
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public int hashCode() {
            ColorInformation colorInformation = this.light;
            int iHashCode = (colorInformation == null ? 0 : colorInformation.hashCode()) * 31;
            ColorInformation colorInformation2 = this.dark;
            return iHashCode + (colorInformation2 != null ? colorInformation2.hashCode() : 0);
        }

        public String toString() {
            return "Appearance(light=" + this.light + ", dark=" + this.dark + ')';
        }

        @c
        public Appearance(int i3, ColorInformation colorInformation, ColorInformation colorInformation2, k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.light = null;
            } else {
                this.light = colorInformation;
            }
            if ((i3 & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = colorInformation2;
            }
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2) {
            this.light = colorInformation;
            this.dark = colorInformation2;
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : colorInformation, (i3 & 2) != 0 ? null : colorInformation2);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return CustomerCenterConfigData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0005HGIJKB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J(\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/HÁ\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\bA\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010\u0017¨\u0006L"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "", "", "id", LinkHeader.Parameters.Title, "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "type", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "feedbackSurvey", Request.JsonKeys.URL, "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "openMethod", "actionIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "component4", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "component5", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "component6", "component7", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Ljava/lang/String;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getType", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "getPromotionalOffer", "getPromotionalOffer$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "getFeedbackSurvey", "getFeedbackSurvey$annotations", "getUrl", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "getOpenMethod", "getOpenMethod$annotations", "getActionIdentifier", "getActionIdentifier$annotations", "Companion", "$serializer", "OpenMethod", "PathDetail", "PathType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class HelpPath {
        private final String actionIdentifier;
        private final PathDetail.FeedbackSurvey feedbackSurvey;
        private final String id;
        private final OpenMethod openMethod;
        private final PathDetail.PromotionalOffer promotionalOffer;
        private final String title;
        private final PathType type;
        private final String url;

        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {null, null, PathType.INSTANCE.serializer(), null, null, null, OpenMethod.INSTANCE.serializer(), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$HelpPath$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "", "(Ljava/lang/String;I)V", "IN_APP", "EXTERNAL", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public enum OpenMethod {
            IN_APP,
            EXTERNAL;


            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        return AbstractC2686a0.f("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.OpenMethod", OpenMethod.values());
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) OpenMethod.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", "<init>", "()V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "FeedbackSurvey", "PromotionalOffer", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static abstract class PathDetail {

            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        C c9 = B.f24540a;
                        return new f("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail", c9.b(PathDetail.class), new InterfaceC0331d[]{c9.b(FeedbackSurvey.class), c9.b(PromotionalOffer.class)}, new KSerializer[]{CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) PathDetail.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*)+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", LinkHeader.Parameters.Title, "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", RRWebOptionsEvent.EVENT_TAG, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "toString", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "Option", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            @i
            public static final class FeedbackSurvey extends PathDetail {
                private final List<Option> options;
                private final String title;

                public static final Companion INSTANCE = new Companion(null);
                private static final KSerializer[] $childSerializers = {null, new C2691d(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE, 0)};

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class Companion {
                    public Companion(AbstractC2541f abstractC2541f) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001b¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "", "", "id", LinkHeader.Parameters.Title, "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "getPromotionalOffer", "getPromotionalOffer$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                @i
                public static final class Option {

                    public static final Companion INSTANCE = new Companion(null);
                    private final String id;
                    private final PromotionalOffer promotionalOffer;
                    private final String title;

                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    public static final class Companion {
                        public Companion(AbstractC2541f abstractC2541f) {
                            this();
                        }

                        public final KSerializer serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @c
                    public Option(int i3, String str, String str2, @h("promotional_offer") PromotionalOffer promotionalOffer, k0 k0Var) {
                        if (3 != (i3 & 3)) {
                            AbstractC2686a0.l(i3, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.id = str;
                        this.title = str2;
                        if ((i3 & 4) == 0) {
                            this.promotionalOffer = null;
                        } else {
                            this.promotionalOffer = promotionalOffer;
                        }
                    }

                    public static Option copy$default(Option option, String str, String str2, PromotionalOffer promotionalOffer, int i3, Object obj) {
                        if ((i3 & 1) != 0) {
                            str = option.id;
                        }
                        if ((i3 & 2) != 0) {
                            str2 = option.title;
                        }
                        if ((i3 & 4) != 0) {
                            promotionalOffer = option.promotionalOffer;
                        }
                        return option.copy(str, str2, promotionalOffer);
                    }

                    @h("promotional_offer")
                    public static void getPromotionalOffer$annotations() {
                    }

                    public static final void write$Self$purchases_defaultsRelease(Option self, b output, SerialDescriptor serialDesc) {
                        output.s(serialDesc, 0, self.id);
                        output.s(serialDesc, 1, self.title);
                        if (!output.E(serialDesc) && self.promotionalOffer == null) {
                            return;
                        }
                        output.t(serialDesc, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, self.promotionalOffer);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final Option copy(String id, String title, PromotionalOffer promotionalOffer) {
                        m.e(id, "id");
                        m.e(title, "title");
                        return new Option(id, title, promotionalOffer);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) other;
                        return m.a(this.id, option.id) && m.a(this.title, option.title) && m.a(this.promotionalOffer, option.promotionalOffer);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int iA = a.a(this.id.hashCode() * 31, 31, this.title);
                        PromotionalOffer promotionalOffer = this.promotionalOffer;
                        return iA + (promotionalOffer == null ? 0 : promotionalOffer.hashCode());
                    }

                    public String toString() {
                        return "Option(id=" + this.id + ", title=" + this.title + ", promotionalOffer=" + this.promotionalOffer + ')';
                    }

                    public Option(String id, String title, PromotionalOffer promotionalOffer) {
                        m.e(id, "id");
                        m.e(title, "title");
                        this.id = id;
                        this.title = title;
                        this.promotionalOffer = promotionalOffer;
                    }

                    public Option(String str, String str2, PromotionalOffer promotionalOffer, int i3, AbstractC2541f abstractC2541f) {
                        this(str, str2, (i3 & 4) != 0 ? null : promotionalOffer);
                    }
                }

                @c
                public FeedbackSurvey(int i3, String str, List list, k0 k0Var) {
                    super(i3, k0Var);
                    if (3 != (i3 & 3)) {
                        AbstractC2686a0.l(i3, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.options = list;
                }

                public static FeedbackSurvey copy$default(FeedbackSurvey feedbackSurvey, String str, List list, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = feedbackSurvey.title;
                    }
                    if ((i3 & 2) != 0) {
                        list = feedbackSurvey.options;
                    }
                    return feedbackSurvey.copy(str, list);
                }

                public static final void write$Self$purchases_defaultsRelease(FeedbackSurvey self, b output, SerialDescriptor serialDesc) {
                    PathDetail.write$Self(self, output, serialDesc);
                    KSerializer[] kSerializerArr = $childSerializers;
                    output.s(serialDesc, 0, self.title);
                    output.h(serialDesc, 1, kSerializerArr[1], self.options);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final List<Option> component2() {
                    return this.options;
                }

                public final FeedbackSurvey copy(String title, List<Option> options) {
                    m.e(title, "title");
                    m.e(options, "options");
                    return new FeedbackSurvey(title, options);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FeedbackSurvey)) {
                        return false;
                    }
                    FeedbackSurvey feedbackSurvey = (FeedbackSurvey) other;
                    return m.a(this.title, feedbackSurvey.title) && m.a(this.options, feedbackSurvey.options);
                }

                public final List<Option> getOptions() {
                    return this.options;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.options.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("FeedbackSurvey(title=");
                    sb.append(this.title);
                    sb.append(", options=");
                    return M0.n(sb, this.options, ')');
                }

                public FeedbackSurvey(String title, List<Option> options) {
                    super(null);
                    m.e(title, "title");
                    m.e(options, "options");
                    this.title = title;
                    this.options = options;
                }
            }

            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0003>=?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\f\u0010\u000eBs\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\bHÆ\u0003¢\u0006\u0004\b'\u0010&Jd\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b6\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b7\u0010 R,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010&R,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b<\u00103\u001a\u0004\b;\u0010&¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail;", "", "androidOfferId", "", "eligible", LinkHeader.Parameters.Title, "subtitle", "", "productMapping", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;", "crossProductPromotions", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "toString", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAndroidOfferId", "getAndroidOfferId$annotations", "()V", "Z", "getEligible", "getTitle", "getSubtitle", "Ljava/util/Map;", "getProductMapping", "getProductMapping$annotations", "getCrossProductPromotions", "getCrossProductPromotions$annotations", "Companion", "$serializer", "CrossProductPromotion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            @i
            public static final class PromotionalOffer extends PathDetail {
                private static final KSerializer[] $childSerializers;

                public static final Companion INSTANCE = new Companion(null);
                private final String androidOfferId;
                private final Map<String, CrossProductPromotion> crossProductPromotions;
                private final boolean eligible;
                private final Map<String, String> productMapping;
                private final String subtitle;
                private final String title;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class Companion {
                    public Companion(AbstractC2541f abstractC2541f) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;", "", "", "storeOfferIdentifier", "targetProductId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getStoreOfferIdentifier", "()Ljava/lang/String;", "getStoreOfferIdentifier$annotations", "()V", "getTargetProductId", "getTargetProductId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                @i
                public static final class CrossProductPromotion {

                    public static final Companion INSTANCE = new Companion(null);
                    private final String storeOfferIdentifier;
                    private final String targetProductId;

                    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    public static final class Companion {
                        public Companion(AbstractC2541f abstractC2541f) {
                            this();
                        }

                        public final KSerializer serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @c
                    public CrossProductPromotion(int i3, @h("store_offer_identifier") String str, @h("target_product_id") String str2, k0 k0Var) {
                        if (3 != (i3 & 3)) {
                            AbstractC2686a0.l(i3, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.storeOfferIdentifier = str;
                        this.targetProductId = str2;
                    }

                    @h("store_offer_identifier")
                    public static void getStoreOfferIdentifier$annotations() {
                    }

                    @h("target_product_id")
                    public static void getTargetProductId$annotations() {
                    }

                    public static final void write$Self$purchases_defaultsRelease(CrossProductPromotion self, b output, SerialDescriptor serialDesc) {
                        output.s(serialDesc, 0, self.storeOfferIdentifier);
                        output.s(serialDesc, 1, self.targetProductId);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CrossProductPromotion)) {
                            return false;
                        }
                        CrossProductPromotion crossProductPromotion = (CrossProductPromotion) obj;
                        return m.a(this.storeOfferIdentifier, crossProductPromotion.storeOfferIdentifier) && m.a(this.targetProductId, crossProductPromotion.targetProductId);
                    }

                    public final String getStoreOfferIdentifier() {
                        return this.storeOfferIdentifier;
                    }

                    public final String getTargetProductId() {
                        return this.targetProductId;
                    }

                    public int hashCode() {
                        return this.targetProductId.hashCode() + (this.storeOfferIdentifier.hashCode() * 31);
                    }

                    public String toString() {
                        StringBuilder sb = new StringBuilder("CrossProductPromotion(storeOfferIdentifier=");
                        sb.append(this.storeOfferIdentifier);
                        sb.append(", targetProductId=");
                        return Y6.f.l(sb, this.targetProductId, ')');
                    }

                    public CrossProductPromotion(String storeOfferIdentifier, String targetProductId) {
                        m.e(storeOfferIdentifier, "storeOfferIdentifier");
                        m.e(targetProductId, "targetProductId");
                        this.storeOfferIdentifier = storeOfferIdentifier;
                        this.targetProductId = targetProductId;
                    }
                }

                static {
                    p0 p0Var = p0.f26988a;
                    $childSerializers = new KSerializer[]{null, null, null, null, new F(p0Var, p0Var, 1), new F(p0Var, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE, 1)};
                }

                @c
                public PromotionalOffer(int i3, @h("android_offer_id") String str, boolean z6, String str2, String str3, @h("product_mapping") Map map, @h("cross_product_promotions") Map map2, k0 k0Var) {
                    super(i3, k0Var);
                    if (31 != (i3 & 31)) {
                        AbstractC2686a0.l(i3, 31, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.androidOfferId = str;
                    this.eligible = z6;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                    if ((i3 & 32) == 0) {
                        this.crossProductPromotions = x.f23206h;
                    } else {
                        this.crossProductPromotions = map2;
                    }
                }

                public static PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z6, String str2, String str3, Map map, Map map2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i3 & 2) != 0) {
                        z6 = promotionalOffer.eligible;
                    }
                    if ((i3 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    if ((i3 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    if ((i3 & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    if ((i3 & 32) != 0) {
                        map2 = promotionalOffer.crossProductPromotions;
                    }
                    Map map3 = map;
                    Map map4 = map2;
                    return promotionalOffer.copy(str, z6, str2, str3, map3, map4);
                }

                @h("android_offer_id")
                public static void getAndroidOfferId$annotations() {
                }

                @h("cross_product_promotions")
                public static void getCrossProductPromotions$annotations() {
                }

                @h("product_mapping")
                public static void getProductMapping$annotations() {
                }

                public static final void write$Self$purchases_defaultsRelease(PromotionalOffer self, b output, SerialDescriptor serialDesc) {
                    PathDetail.write$Self(self, output, serialDesc);
                    KSerializer[] kSerializerArr = $childSerializers;
                    output.s(serialDesc, 0, self.androidOfferId);
                    output.q(serialDesc, 1, self.eligible);
                    output.s(serialDesc, 2, self.title);
                    output.s(serialDesc, 3, self.subtitle);
                    output.h(serialDesc, 4, kSerializerArr[4], self.productMapping);
                    if (!output.E(serialDesc) && m.a(self.crossProductPromotions, x.f23206h)) {
                        return;
                    }
                    output.h(serialDesc, 5, kSerializerArr[5], self.crossProductPromotions);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final Map<String, String> component5() {
                    return this.productMapping;
                }

                public final Map<String, CrossProductPromotion> component6() {
                    return this.crossProductPromotions;
                }

                public final PromotionalOffer copy(String androidOfferId, boolean eligible, String title, String subtitle, Map<String, String> productMapping, Map<String, CrossProductPromotion> crossProductPromotions) {
                    m.e(androidOfferId, "androidOfferId");
                    m.e(title, "title");
                    m.e(subtitle, "subtitle");
                    m.e(productMapping, "productMapping");
                    m.e(crossProductPromotions, "crossProductPromotions");
                    return new PromotionalOffer(androidOfferId, eligible, title, subtitle, productMapping, crossProductPromotions);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromotionalOffer)) {
                        return false;
                    }
                    PromotionalOffer promotionalOffer = (PromotionalOffer) other;
                    return m.a(this.androidOfferId, promotionalOffer.androidOfferId) && this.eligible == promotionalOffer.eligible && m.a(this.title, promotionalOffer.title) && m.a(this.subtitle, promotionalOffer.subtitle) && m.a(this.productMapping, promotionalOffer.productMapping) && m.a(this.crossProductPromotions, promotionalOffer.crossProductPromotions);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final Map<String, CrossProductPromotion> getCrossProductPromotions() {
                    return this.crossProductPromotions;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final Map<String, String> getProductMapping() {
                    return this.productMapping;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.crossProductPromotions.hashCode() + a.c(a.a(a.a(p.f(this.androidOfferId.hashCode() * 31, 31, this.eligible), 31, this.title), 31, this.subtitle), 31, this.productMapping);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("PromotionalOffer(androidOfferId=");
                    sb.append(this.androidOfferId);
                    sb.append(", eligible=");
                    sb.append(this.eligible);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", subtitle=");
                    sb.append(this.subtitle);
                    sb.append(", productMapping=");
                    sb.append(this.productMapping);
                    sb.append(", crossProductPromotions=");
                    return p.r(sb, this.crossProductPromotions, ')');
                }

                public static PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z6, String str2, String str3, Map map, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i3 & 2) != 0) {
                        z6 = promotionalOffer.eligible;
                    }
                    if ((i3 & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    if ((i3 & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    if ((i3 & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    Map map2 = map;
                    String str4 = str2;
                    return promotionalOffer.copy(str, z6, str4, str3, map2);
                }

                @c
                public final PromotionalOffer copy(String androidOfferId, boolean eligible, String title, String subtitle, Map<String, String> productMapping) {
                    m.e(androidOfferId, "androidOfferId");
                    m.e(title, "title");
                    m.e(subtitle, "subtitle");
                    m.e(productMapping, "productMapping");
                    return copy(androidOfferId, eligible, title, subtitle, productMapping, x.f23206h);
                }

                public PromotionalOffer(String str, boolean z6, String str2, String str3, Map map, Map map2, int i3, AbstractC2541f abstractC2541f) {
                    this(str, z6, str2, str3, map, (i3 & 32) != 0 ? x.f23206h : map2);
                }

                public PromotionalOffer(String androidOfferId, boolean z6, String title, String subtitle, Map<String, String> productMapping, Map<String, CrossProductPromotion> crossProductPromotions) {
                    super(null);
                    m.e(androidOfferId, "androidOfferId");
                    m.e(title, "title");
                    m.e(subtitle, "subtitle");
                    m.e(productMapping, "productMapping");
                    m.e(crossProductPromotions, "crossProductPromotions");
                    this.androidOfferId = androidOfferId;
                    this.eligible = z6;
                    this.title = title;
                    this.subtitle = subtitle;
                    this.productMapping = productMapping;
                    this.crossProductPromotions = crossProductPromotions;
                }

                @c
                public PromotionalOffer(String androidOfferId, boolean z6, String title, String subtitle, Map<String, String> productMapping) {
                    this(androidOfferId, z6, title, subtitle, productMapping, x.f23206h);
                    m.e(androidOfferId, "androidOfferId");
                    m.e(title, "title");
                    m.e(subtitle, "subtitle");
                    m.e(productMapping, "productMapping");
                }
            }

            public PathDetail(AbstractC2541f abstractC2541f) {
                this();
            }

            private PathDetail() {
            }

            @c
            public PathDetail(int i3, k0 k0Var) {
            }

            public static final void write$Self(PathDetail self, b output, SerialDescriptor serialDesc) {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "", "(Ljava/lang/String;I)V", "MISSING_PURCHASE", "REFUND_REQUEST", "CHANGE_PLANS", "CANCEL", "CUSTOM_URL", "CUSTOM_ACTION", "UNKNOWN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public enum PathType {
            MISSING_PURCHASE,
            REFUND_REQUEST,
            CHANGE_PLANS,
            CANCEL,
            CUSTOM_URL,
            CUSTOM_ACTION,
            UNKNOWN;


            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        return AbstractC2686a0.f("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType", PathType.values());
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) PathType.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        @c
        public HelpPath(int i3, String str, String str2, PathType pathType, @h("promotional_offer") PathDetail.PromotionalOffer promotionalOffer, @h("feedback_survey") PathDetail.FeedbackSurvey feedbackSurvey, String str3, @h("open_method") OpenMethod openMethod, @h("action_identifier") String str4, k0 k0Var) {
            if (7 != (i3 & 7)) {
                AbstractC2686a0.l(i3, 7, CustomerCenterConfigData$HelpPath$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.title = str2;
            this.type = pathType;
            if ((i3 & 8) == 0) {
                this.promotionalOffer = null;
            } else {
                this.promotionalOffer = promotionalOffer;
            }
            if ((i3 & 16) == 0) {
                this.feedbackSurvey = null;
            } else {
                this.feedbackSurvey = feedbackSurvey;
            }
            if ((i3 & 32) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i3 & 64) == 0) {
                this.openMethod = null;
            } else {
                this.openMethod = openMethod;
            }
            if ((i3 & 128) == 0) {
                this.actionIdentifier = null;
            } else {
                this.actionIdentifier = str4;
            }
        }

        public static HelpPath copy$default(HelpPath helpPath, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = helpPath.id;
            }
            if ((i3 & 2) != 0) {
                str2 = helpPath.title;
            }
            if ((i3 & 4) != 0) {
                pathType = helpPath.type;
            }
            if ((i3 & 8) != 0) {
                promotionalOffer = helpPath.promotionalOffer;
            }
            if ((i3 & 16) != 0) {
                feedbackSurvey = helpPath.feedbackSurvey;
            }
            if ((i3 & 32) != 0) {
                str3 = helpPath.url;
            }
            if ((i3 & 64) != 0) {
                openMethod = helpPath.openMethod;
            }
            if ((i3 & 128) != 0) {
                str4 = helpPath.actionIdentifier;
            }
            OpenMethod openMethod2 = openMethod;
            String str5 = str4;
            PathDetail.FeedbackSurvey feedbackSurvey2 = feedbackSurvey;
            String str6 = str3;
            return helpPath.copy(str, str2, pathType, promotionalOffer, feedbackSurvey2, str6, openMethod2, str5);
        }

        @h("action_identifier")
        public static void getActionIdentifier$annotations() {
        }

        @h("feedback_survey")
        public static void getFeedbackSurvey$annotations() {
        }

        @h("open_method")
        public static void getOpenMethod$annotations() {
        }

        @h("promotional_offer")
        public static void getPromotionalOffer$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(HelpPath self, b output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            output.s(serialDesc, 0, self.id);
            output.s(serialDesc, 1, self.title);
            output.h(serialDesc, 2, kSerializerArr[2], self.type);
            if (output.E(serialDesc) || self.promotionalOffer != null) {
                output.t(serialDesc, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, self.promotionalOffer);
            }
            if (output.E(serialDesc) || self.feedbackSurvey != null) {
                output.t(serialDesc, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, self.feedbackSurvey);
            }
            if (output.E(serialDesc) || self.url != null) {
                output.t(serialDesc, 5, p0.f26988a, self.url);
            }
            if (output.E(serialDesc) || self.openMethod != null) {
                output.t(serialDesc, 6, kSerializerArr[6], self.openMethod);
            }
            if (!output.E(serialDesc) && self.actionIdentifier == null) {
                return;
            }
            output.t(serialDesc, 7, p0.f26988a, self.actionIdentifier);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getUrl() {
            return this.url;
        }

        public final OpenMethod getOpenMethod() {
            return this.openMethod;
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final HelpPath copy(String id, String title, PathType type, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String url, OpenMethod openMethod, String actionIdentifier) {
            m.e(id, "id");
            m.e(title, "title");
            m.e(type, "type");
            return new HelpPath(id, title, type, promotionalOffer, feedbackSurvey, url, openMethod, actionIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HelpPath)) {
                return false;
            }
            HelpPath helpPath = (HelpPath) other;
            return m.a(this.id, helpPath.id) && m.a(this.title, helpPath.title) && this.type == helpPath.type && m.a(this.promotionalOffer, helpPath.promotionalOffer) && m.a(this.feedbackSurvey, helpPath.feedbackSurvey) && m.a(this.url, helpPath.url) && this.openMethod == helpPath.openMethod && m.a(this.actionIdentifier, helpPath.actionIdentifier);
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getId() {
            return this.id;
        }

        public final OpenMethod getOpenMethod() {
            return this.openMethod;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + a.a(this.id.hashCode() * 31, 31, this.title)) * 31;
            PathDetail.PromotionalOffer promotionalOffer = this.promotionalOffer;
            int iHashCode2 = (iHashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode())) * 31;
            PathDetail.FeedbackSurvey feedbackSurvey = this.feedbackSurvey;
            int iHashCode3 = (iHashCode2 + (feedbackSurvey == null ? 0 : feedbackSurvey.hashCode())) * 31;
            String str = this.url;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            OpenMethod openMethod = this.openMethod;
            int iHashCode5 = (iHashCode4 + (openMethod == null ? 0 : openMethod.hashCode())) * 31;
            String str2 = this.actionIdentifier;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpPath(id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", promotionalOffer=");
            sb.append(this.promotionalOffer);
            sb.append(", feedbackSurvey=");
            sb.append(this.feedbackSurvey);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", openMethod=");
            sb.append(this.openMethod);
            sb.append(", actionIdentifier=");
            return Y6.f.l(sb, this.actionIdentifier, ')');
        }

        public HelpPath(String id, String title, PathType type, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str, OpenMethod openMethod, String str2) {
            m.e(id, "id");
            m.e(title, "title");
            m.e(type, "type");
            this.id = id;
            this.title = title;
            this.type = type;
            this.promotionalOffer = promotionalOffer;
            this.feedbackSurvey = feedbackSurvey;
            this.url = str;
            this.openMethod = openMethod;
            this.actionIdentifier = str2;
        }

        public HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i3, AbstractC2541f abstractC2541f) {
            this(str, str2, pathType, (i3 & 8) != 0 ? null : promotionalOffer, (i3 & 16) != 0 ? null : feedbackSurvey, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : openMethod, (i3 & 128) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0004./-0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001d¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "", "", Device.JsonKeys.LOCALE, "", "localizedStrings", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", SubscriberAttributeKt.JSON_NAME_KEY, "commonLocalizedString", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocale", "Ljava/util/Map;", "getLocalizedStrings", "getLocalizedStrings$annotations", "()V", "Companion", "$serializer", "CommonLocalizedString", "VariableName", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Localization {
        private static final KSerializer[] $childSerializers;

        public static final Companion INSTANCE = new Companion(null);
        private final String locale;
        private final Map<String, String> localizedStrings;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b[\b\u0087\u0001\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001^B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]¨\u0006_"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", "", "(Ljava/lang/String;I)V", "defaultValue", "", "getDefaultValue", "()Ljava/lang/String;", "NO_THANKS", "NO_SUBSCRIPTIONS_FOUND", "TRY_CHECK_RESTORE", "RESTORE_PURCHASES", "CANCEL", "BILLING_CYCLE", "CURRENT_PRICE", "EXPIRED", "EXPIRES", "NEXT_BILLING_DATE", "REFUND_CANCELED", "REFUND_ERROR_GENERIC", "REFUND_GRANTED", "REFUND_STATUS", "SUB_EARLIEST_EXPIRATION", "SUB_EARLIEST_RENEWAL", "SUB_EXPIRED", "CONTACT_SUPPORT", "DEFAULT_BODY", "DEFAULT_SUBJECT", "DISMISS", "UPDATE_WARNING_TITLE", "UPDATE_WARNING_DESCRIPTION", "UPDATE_WARNING_UPDATE", "UPDATE_WARNING_IGNORE", "PLEASE_CONTACT_SUPPORT", "APPLE_SUBSCRIPTION_MANAGE", "GOOGLE_SUBSCRIPTION_MANAGE", "AMAZON_SUBSCRIPTION_MANAGE", "PLATFORM_MISMATCH", "GOING_TO_CHECK_PURCHASES", "CHECK_PAST_PURCHASES", "PURCHASES_RECOVERED", "PURCHASES_RECOVERED_EXPLANATION", "PURCHASES_NOT_RECOVERED", "PURCHASES_NOT_FOUND", "PURCHASES_RESTORING", "MANAGE_SUBSCRIPTION", "YOU_HAVE_PROMO", "YOU_HAVE_LIFETIME", "WEB_SUBSCRIPTION_MANAGE", "FREE", "NEVER", "FREE_TRIAL_THEN_PRICE", "SINGLE_PAYMENT_THEN_PRICE", "DISCOUNTED_RECURRING_THEN_PRICE", "FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE", "FREE_TRIAL_DISCOUNTED_THEN_PRICE", "DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE", "FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE", "DONE", "RENEWS_ON_DATE_FOR_PRICE", "RENEWS_ON_DATE", "PURCHASE_INFO_EXPIRED_ON_DATE", "PURCHASE_INFO_EXPIRES_ON_DATE", "ACTIVE", "BADGE_CANCELLED", "BADGE_FREE_TRIAL", "BADGE_FREE_TRIAL_CANCELLED", "BADGE_LIFETIME", "APP_STORE", "MAC_APP_STORE", "GOOGLE_PLAY_STORE", "AMAZON_STORE", "GALAXY_STORE", "WEB_STORE", "UNKNOWN_STORE", "TEST_STORE", "CARD_STORE_PROMOTIONAL", "RESUBSCRIBE", "TYPE_SUBSCRIPTION", "TYPE_ONE_TIME_PURCHASE", "BUY_SUBSCRIPTION", "LAST_CHARGE_WAS", "NEXT_BILLING_DATE_ON", "SEE_ALL_VIRTUAL_CURRENCIES", "VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER", "NO_VIRTUAL_CURRENCY_BALANCES_FOUND", "SUPPORT_TICKET_CREATE", "EMAIL", "ENTER_EMAIL", "DESCRIPTION", "SENT", "SUPPORT_TICKET_FAILED", "SUBMIT_TICKET", "INVALID_EMAIL_ERROR", "CHARACTERS_REMAINING", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public enum CommonLocalizedString {
            NO_THANKS,
            NO_SUBSCRIPTIONS_FOUND,
            TRY_CHECK_RESTORE,
            RESTORE_PURCHASES,
            CANCEL,
            BILLING_CYCLE,
            CURRENT_PRICE,
            EXPIRED,
            EXPIRES,
            NEXT_BILLING_DATE,
            REFUND_CANCELED,
            REFUND_ERROR_GENERIC,
            REFUND_GRANTED,
            REFUND_STATUS,
            SUB_EARLIEST_EXPIRATION,
            SUB_EARLIEST_RENEWAL,
            SUB_EXPIRED,
            CONTACT_SUPPORT,
            DEFAULT_BODY,
            DEFAULT_SUBJECT,
            DISMISS,
            UPDATE_WARNING_TITLE,
            UPDATE_WARNING_DESCRIPTION,
            UPDATE_WARNING_UPDATE,
            UPDATE_WARNING_IGNORE,
            PLEASE_CONTACT_SUPPORT,
            APPLE_SUBSCRIPTION_MANAGE,
            GOOGLE_SUBSCRIPTION_MANAGE,
            AMAZON_SUBSCRIPTION_MANAGE,
            PLATFORM_MISMATCH,
            GOING_TO_CHECK_PURCHASES,
            CHECK_PAST_PURCHASES,
            PURCHASES_RECOVERED,
            PURCHASES_RECOVERED_EXPLANATION,
            PURCHASES_NOT_RECOVERED,
            PURCHASES_NOT_FOUND,
            PURCHASES_RESTORING,
            MANAGE_SUBSCRIPTION,
            YOU_HAVE_PROMO,
            YOU_HAVE_LIFETIME,
            WEB_SUBSCRIPTION_MANAGE,
            FREE,
            NEVER,
            FREE_TRIAL_THEN_PRICE,
            SINGLE_PAYMENT_THEN_PRICE,
            DISCOUNTED_RECURRING_THEN_PRICE,
            FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_THEN_PRICE,
            DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            DONE,
            RENEWS_ON_DATE_FOR_PRICE,
            RENEWS_ON_DATE,
            PURCHASE_INFO_EXPIRED_ON_DATE,
            PURCHASE_INFO_EXPIRES_ON_DATE,
            ACTIVE,
            BADGE_CANCELLED,
            BADGE_FREE_TRIAL,
            BADGE_FREE_TRIAL_CANCELLED,
            BADGE_LIFETIME,
            APP_STORE,
            MAC_APP_STORE,
            GOOGLE_PLAY_STORE,
            AMAZON_STORE,
            GALAXY_STORE,
            WEB_STORE,
            UNKNOWN_STORE,
            TEST_STORE,
            CARD_STORE_PROMOTIONAL,
            RESUBSCRIBE,
            TYPE_SUBSCRIPTION,
            TYPE_ONE_TIME_PURCHASE,
            BUY_SUBSCRIPTION,
            LAST_CHARGE_WAS,
            NEXT_BILLING_DATE_ON,
            SEE_ALL_VIRTUAL_CURRENCIES,
            VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER,
            NO_VIRTUAL_CURRENCY_BALANCES_FOUND,
            SUPPORT_TICKET_CREATE,
            EMAIL,
            ENTER_EMAIL,
            DESCRIPTION,
            SENT,
            SUPPORT_TICKET_FAILED,
            SUBMIT_TICKET,
            INVALID_EMAIL_ERROR,
            CHARACTERS_REMAINING;


            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        return AbstractC2686a0.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString", CommonLocalizedString.values(), new String[]{"no_thanks", "no_subscriptions_found", "try_check_restore", "restore_purchases", "cancel", "billing_cycle", "current_price", "expired", "expires", "next_billing_date", "refund_canceled", "refund_error_generic", "refund_granted", "refund_status", "sub_earliest_expiration", "sub_earliest_renewal", "sub_expired", "contact_support", "default_body", "default_subject", "dismiss", "update_warning_title", "update_warning_description", "update_warning_update", "update_warning_ignore", "please_contact_support", "apple_subscription_manage", "google_subscription_manage", "amazon_subscription_manage", "platform_mismatch", "going_to_check_purchases", "check_past_purchases", "purchases_recovered", "purchases_recovered_explanation", "purchases_not_recovered", "purchases_not_found", "purchases_restoring", "manage_subscription", "you_have_promo", "you_have_lifetime", "web_subscription_manage", "free", "never", "free_trial_then_price", "single_payment_then_price", "discounted_recurring_then_price", "free_trial_single_payment_then_price", "free_trial_discounted_then_price", "discounted_recurring_payment_then_price", "free_trial_discounted_recurring_payment_then_price", "done", "renews_on_date_for_price", "renews_on_date", "purchase_info_expired_on_date", "purchase_info_expires_on_date", "active", "badge_cancelled", "badge_free_trial", "badge_free_trial_cancelled", "badge_lifetime", "app_store", "mac_app_store", "google_play_store", "amazon_store", "galaxy_store", "web_store", "unknown_store", "test_store", "card_store_promotional", "resubscribe", "type_subscription", "type_one_time_purchase", "buy_subscription", "last_charge_was", "next_billing_date_on", "see_all_virtual_currencies", "virtual_currency_balances_screen_header", "no_virtual_currency_balances_found", "support_ticket_create", "email", "enter_email", "description", "sent", "support_ticket_failed", "submit_ticket", "invalid_email_error", "characters_remaining"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) CommonLocalizedString.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonLocalizedString.values().length];
                    try {
                        iArr[CommonLocalizedString.NO_THANKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_SUBSCRIPTIONS_FOUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonLocalizedString.TRY_CHECK_RESTORE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESTORE_PURCHASES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CommonLocalizedString.CANCEL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CommonLocalizedString.BILLING_CYCLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CommonLocalizedString.CURRENT_PRICE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRES.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_CANCELED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_ERROR_GENERIC.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_GRANTED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_STATUS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_EXPIRATION.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_RENEWAL.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EXPIRED.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[CommonLocalizedString.CONTACT_SUPPORT.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_BODY.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_SUBJECT.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISMISS.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_TITLE.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_DESCRIPTION.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_UPDATE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_IGNORE.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLATFORM_MISMATCH.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLEASE_CONTACT_SUPPORT.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[CommonLocalizedString.APPLE_SUBSCRIPTION_MANAGE.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_SUBSCRIPTION_MANAGE.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_SUBSCRIPTION_MANAGE.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOING_TO_CHECK_PURCHASES.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHECK_PAST_PURCHASES.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_RECOVERED.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_FOUND.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RESTORING.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[CommonLocalizedString.MANAGE_SUBSCRIPTION.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_PROMO.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_LIFETIME.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_SUBSCRIPTION_MANAGE.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEVER.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_THEN_PRICE.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_THEN_PRICE.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_THEN_PRICE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 49;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 50;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr[CommonLocalizedString.DONE.ordinal()] = 51;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE_FOR_PRICE.ordinal()] = 52;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE.ordinal()] = 53;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE.ordinal()] = 54;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE.ordinal()] = 55;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr[CommonLocalizedString.ACTIVE.ordinal()] = 56;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_CANCELLED.ordinal()] = 57;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL.ordinal()] = 58;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL_CANCELLED.ordinal()] = 59;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_LIFETIME.ordinal()] = 60;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr[CommonLocalizedString.APP_STORE.ordinal()] = 61;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr[CommonLocalizedString.MAC_APP_STORE.ordinal()] = 62;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_PLAY_STORE.ordinal()] = 63;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_STORE.ordinal()] = 64;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr[CommonLocalizedString.GALAXY_STORE.ordinal()] = 65;
                    } catch (NoSuchFieldError unused65) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_STORE.ordinal()] = 66;
                    } catch (NoSuchFieldError unused66) {
                    }
                    try {
                        iArr[CommonLocalizedString.UNKNOWN_STORE.ordinal()] = 67;
                    } catch (NoSuchFieldError unused67) {
                    }
                    try {
                        iArr[CommonLocalizedString.TEST_STORE.ordinal()] = 68;
                    } catch (NoSuchFieldError unused68) {
                    }
                    try {
                        iArr[CommonLocalizedString.CARD_STORE_PROMOTIONAL.ordinal()] = 69;
                    } catch (NoSuchFieldError unused69) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESUBSCRIBE.ordinal()] = 70;
                    } catch (NoSuchFieldError unused70) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_SUBSCRIPTION.ordinal()] = 71;
                    } catch (NoSuchFieldError unused71) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_ONE_TIME_PURCHASE.ordinal()] = 72;
                    } catch (NoSuchFieldError unused72) {
                    }
                    try {
                        iArr[CommonLocalizedString.BUY_SUBSCRIPTION.ordinal()] = 73;
                    } catch (NoSuchFieldError unused73) {
                    }
                    try {
                        iArr[CommonLocalizedString.LAST_CHARGE_WAS.ordinal()] = 74;
                    } catch (NoSuchFieldError unused74) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE_ON.ordinal()] = 75;
                    } catch (NoSuchFieldError unused75) {
                    }
                    try {
                        iArr[CommonLocalizedString.SEE_ALL_VIRTUAL_CURRENCIES.ordinal()] = 76;
                    } catch (NoSuchFieldError unused76) {
                    }
                    try {
                        iArr[CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER.ordinal()] = 77;
                    } catch (NoSuchFieldError unused77) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_VIRTUAL_CURRENCY_BALANCES_FOUND.ordinal()] = 78;
                    } catch (NoSuchFieldError unused78) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_CREATE.ordinal()] = 79;
                    } catch (NoSuchFieldError unused79) {
                    }
                    try {
                        iArr[CommonLocalizedString.EMAIL.ordinal()] = 80;
                    } catch (NoSuchFieldError unused80) {
                    }
                    try {
                        iArr[CommonLocalizedString.ENTER_EMAIL.ordinal()] = 81;
                    } catch (NoSuchFieldError unused81) {
                    }
                    try {
                        iArr[CommonLocalizedString.DESCRIPTION.ordinal()] = 82;
                    } catch (NoSuchFieldError unused82) {
                    }
                    try {
                        iArr[CommonLocalizedString.SENT.ordinal()] = 83;
                    } catch (NoSuchFieldError unused83) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_FAILED.ordinal()] = 84;
                    } catch (NoSuchFieldError unused84) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUBMIT_TICKET.ordinal()] = 85;
                    } catch (NoSuchFieldError unused85) {
                    }
                    try {
                        iArr[CommonLocalizedString.INVALID_EMAIL_ERROR.ordinal()] = 86;
                    } catch (NoSuchFieldError unused86) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHARACTERS_REMAINING.ordinal()] = 87;
                    } catch (NoSuchFieldError unused87) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final String getDefaultValue() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return "No, thanks";
                    case 2:
                        return "No Subscriptions found";
                    case 3:
                        return "We can try checking your Apple account for any previous purchases";
                    case 4:
                        return "Restore purchases";
                    case 5:
                        return "Cancel";
                    case 6:
                        return "Billing cycle";
                    case 7:
                        return "Current price";
                    case 8:
                        return "Expired";
                    case 9:
                        return "Expires";
                    case 10:
                        return "Next billing date";
                    case 11:
                        return "Refund canceled";
                    case 12:
                        return "An error occurred while processing the refund request. Please try again.";
                    case 13:
                        return "Refund granted successfully!";
                    case 14:
                        return "Refund status";
                    case 15:
                        return "This is your subscription with the earliest expiration date.";
                    case 16:
                        return "This is your subscription with the earliest billing date.";
                    case 17:
                        return "This subscription has expired.";
                    case 18:
                        return "Contact support";
                    case 19:
                        return "Please describe your issue or question.";
                    case 20:
                        return "Support Request";
                    case 21:
                        return "Dismiss";
                    case 22:
                        return "Update available";
                    case 23:
                        return "Downloading the latest version of the app may help solve the problem.";
                    case 24:
                        return "Update";
                    case 25:
                        return "Continue";
                    case 26:
                        return "Platform mismatch";
                    case 27:
                        return "Please contact support to manage your subscription.";
                    case 28:
                        return "You can manage your subscription by using the App Store app on an Apple device.";
                    case 29:
                        return "You have an active subscription from the Google Play Store";
                    case 30:
                        return "You have an active subscription from the Amazon Appstore. You can manage your subscription in the Amazon Appstore app.";
                    case 31:
                        return "Let's take a look! We're going to check your account for missing purchases.";
                    case 32:
                        return "Check past purchases";
                    case 33:
                        return "Purchases restored";
                    case 34:
                        return "We restored your past purchases and applied them to your account.";
                    case 35:
                        return "We could not find any purchases with your account. If you think this is an error, please contact support.";
                    case TsExtractor.TS_STREAM_TYPE_H265:
                        return "No past purchases";
                    case 37:
                        return "Restoring...";
                    case FlacConstants.STREAM_INFO_BLOCK_SIZE:
                        return "Manage your subscription";
                    case NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI:
                        return "You've been granted a subscription that doesn't renew";
                    case 40:
                        return "Your active lifetime subscription";
                    case 41:
                        return "You have an active subscription that was purchased on the web. You can manage your subscription using the button below.";
                    case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                        return "Free";
                    case 43:
                        return "Never";
                    case 44:
                        return "First {{ sub_offer_duration }} free, then {{ price }}";
                    case TsExtractor.TS_STREAM_TYPE_MHAS:
                        return "{{ sub_offer_duration }} for {{ sub_offer_price }}, then {{ price }}";
                    case 46:
                        return "{{ sub_offer_price }} during {{ sub_offer_duration }}, then {{ price }}";
                    case 47:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_duration_2 }} for {{ sub_offer_price_2 }}, and {{ price }} thereafter";
                    case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_price_2 }} during {{ sub_offer_duration_2 }}, and {{ price }} thereafter";
                    case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                        return "{{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, then {{ price }}";
                    case 50:
                        return "Try {{ sub_offer_duration }} for free, then {{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, and {{ price }} thereafter";
                    case 51:
                        return "Done";
                    case 52:
                        return "Your next charge is {{ price }} on {{ date }}.";
                    case 53:
                        return "Renews on {{ date }}";
                    case 54:
                        return "Expired on {{ date }}";
                    case 55:
                        return "Expires on {{ date }}";
                    case 56:
                        return "Active";
                    case 57:
                        return "Cancelled";
                    case 58:
                        return "Free Trial";
                    case 59:
                        return "Cancelled Trial";
                    case MPVLib.MPV_LOG_LEVEL_DEBUG:
                        return "Lifetime";
                    case 61:
                        return "App Store";
                    case 62:
                        return "Mac App Store";
                    case 63:
                        return "Google Play Store";
                    case 64:
                        return "Amazon Store";
                    case 65:
                        return "Galaxy Store";
                    case 66:
                        return "Web";
                    case MdtaMetadataEntry.TYPE_INDICATOR_INT32:
                        return "Unknown";
                    case 68:
                        return "Test Store";
                    case 69:
                        return "Via Support";
                    case MPVLib.MPV_LOG_LEVEL_TRACE:
                        return "Resubscribe";
                    case TsExtractor.TS_SYNC_BYTE:
                        return "Subscription";
                    case 72:
                        return "One time purchase";
                    case 73:
                        return "Buy Subscription";
                    case 74:
                        return "Last charge: {{ price }}";
                    case MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT:
                        return "Next billing date: {{ date }}";
                    case 76:
                        return "See all in-app currencies";
                    case 77:
                        return "In-App Currencies";
                    case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64:
                        return "It doesn't look like you've purchased any in-app currencies.";
                    case 79:
                        return "Create a support ticket";
                    case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                        return "Email";
                    case 81:
                        return "Enter your email";
                    case 82:
                        return "Description";
                    case 83:
                        return "Message sent";
                    case 84:
                        return "Failed to send, please try again.";
                    case 85:
                        return "Submit ticket";
                    case 86:
                        return "Please enter a valid email address";
                    case 87:
                        return "{{ count }} characters";
                    default:
                        throw new I3.b();
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$Localization$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "PRICE", "SUB_OFFER_DURATION", "SUB_OFFER_DURATION_2", "SUB_OFFER_PRICE", "SUB_OFFER_PRICE_2", "DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD", "DISCOUNTED_RECURRING_PAYMENT_CYCLES", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public enum VariableName {
            PRICE("price"),
            SUB_OFFER_DURATION("sub_offer_duration"),
            SUB_OFFER_DURATION_2("sub_offer_duration_2"),
            SUB_OFFER_PRICE("sub_offer_price"),
            SUB_OFFER_PRICE_2("sub_offer_price_2"),
            DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD("discounted_recurring_payment_price_per_period"),
            DISCOUNTED_RECURRING_PAYMENT_CYCLES("discounted_recurring_payment_cycles");

            private final String identifier;

            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h valueMap$delegate = D.B(CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2.INSTANCE);

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName$Companion;", "", "<init>", "()V", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "valueOfIdentifier", "(Ljava/lang/String;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "", "valueMap$delegate", "Lh6/h;", "getValueMap", "()Ljava/util/Map;", "valueMap", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final Map<String, VariableName> getValueMap() {
                    return (Map) VariableName.valueMap$delegate.getValue();
                }

                public final VariableName valueOfIdentifier(String identifier) {
                    m.e(identifier, "identifier");
                    return getValueMap().get(identifier);
                }

                private Companion() {
                }
            }

            VariableName(String str) {
                this.identifier = str;
            }

            public final String getIdentifier() {
                return this.identifier;
            }
        }

        static {
            p0 p0Var = p0.f26988a;
            $childSerializers = new KSerializer[]{null, new F(p0Var, p0Var, 1)};
        }

        @c
        public Localization(int i3, String str, @h("localized_strings") Map map, k0 k0Var) {
            if (3 != (i3 & 3)) {
                AbstractC2686a0.l(i3, 3, CustomerCenterConfigData$Localization$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.locale = str;
            this.localizedStrings = map;
        }

        public static Localization copy$default(Localization localization, String str, Map map, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = localization.locale;
            }
            if ((i3 & 2) != 0) {
                map = localization.localizedStrings;
            }
            return localization.copy(str, map);
        }

        @h("localized_strings")
        public static void getLocalizedStrings$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(Localization self, b output, SerialDescriptor serialDesc) {
            KSerializer[] kSerializerArr = $childSerializers;
            output.s(serialDesc, 0, self.locale);
            output.h(serialDesc, 1, kSerializerArr[1], self.localizedStrings);
        }

        public final String commonLocalizedString(CommonLocalizedString key) {
            m.e(key, "key");
            Map<String, String> map = this.localizedStrings;
            String lowerCase = key.name().toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            String str = map.get(lowerCase);
            return str == null ? key.getDefaultValue() : str;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map<String, String> component2() {
            return this.localizedStrings;
        }

        public final Localization copy(String locale, Map<String, String> localizedStrings) {
            m.e(locale, "locale");
            m.e(localizedStrings, "localizedStrings");
            return new Localization(locale, localizedStrings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) other;
            return m.a(this.locale, localization.locale) && m.a(this.localizedStrings, localization.localizedStrings);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map<String, String> getLocalizedStrings() {
            return this.localizedStrings;
        }

        public int hashCode() {
            return this.localizedStrings.hashCode() + (this.locale.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Localization(locale=");
            sb.append(this.locale);
            sb.append(", localizedStrings=");
            return p.r(sb, this.localizedStrings, ')');
        }

        public Localization(String locale, Map<String, String> localizedStrings) {
            m.e(locale, "locale");
            m.e(localizedStrings, "localizedStrings");
            this.locale = locale;
            this.localizedStrings = localizedStrings;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0003;:<B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001fR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010$¨\u0006="}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "type", "", LinkHeader.Parameters.Title, "subtitle", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "paths", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "offering", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "getType", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubtitle$annotations", "()V", "Ljava/util/List;", "getPaths", "getPaths$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "getOffering", "Companion", "$serializer", "ScreenType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Screen {
        private final ScreenOffering offering;
        private final List<HelpPath> paths;
        private final String subtitle;
        private final String title;
        private final ScreenType type;

        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {ScreenType.INSTANCE.serializer(), null, null, null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$Screen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "", "(Ljava/lang/String;I)V", "MANAGEMENT", "NO_ACTIVE", "UNKNOWN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public enum ScreenType {
            MANAGEMENT,
            NO_ACTIVE,
            UNKNOWN;


            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        return AbstractC2686a0.f("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType", ScreenType.values());
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) ScreenType.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }
        }

        @c
        public Screen(int i3, ScreenType screenType, String str, @i(with = EmptyStringToNullSerializer.class) String str2, @i(with = HelpPathsSerializer.class) List list, ScreenOffering screenOffering, k0 k0Var) {
            if (11 != (i3 & 11)) {
                AbstractC2686a0.l(i3, 11, CustomerCenterConfigData$Screen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = screenType;
            this.title = str;
            if ((i3 & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.paths = list;
            if ((i3 & 16) == 0) {
                this.offering = null;
            } else {
                this.offering = screenOffering;
            }
        }

        public static Screen copy$default(Screen screen, ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                screenType = screen.type;
            }
            if ((i3 & 2) != 0) {
                str = screen.title;
            }
            if ((i3 & 4) != 0) {
                str2 = screen.subtitle;
            }
            if ((i3 & 8) != 0) {
                list = screen.paths;
            }
            if ((i3 & 16) != 0) {
                screenOffering = screen.offering;
            }
            ScreenOffering screenOffering2 = screenOffering;
            String str3 = str2;
            return screen.copy(screenType, str, str3, list, screenOffering2);
        }

        @i(with = HelpPathsSerializer.class)
        public static void getPaths$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static void getSubtitle$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(Screen self, b output, SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, $childSerializers[0], self.type);
            output.s(serialDesc, 1, self.title);
            if (output.E(serialDesc) || self.subtitle != null) {
                output.t(serialDesc, 2, EmptyStringToNullSerializer.INSTANCE, self.subtitle);
            }
            output.h(serialDesc, 3, HelpPathsSerializer.INSTANCE, self.paths);
            if (!output.E(serialDesc) && self.offering == null) {
                return;
            }
            output.t(serialDesc, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, self.offering);
        }

        public final ScreenType getType() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<HelpPath> component4() {
            return this.paths;
        }

        public final ScreenOffering getOffering() {
            return this.offering;
        }

        public final Screen copy(ScreenType type, String title, String subtitle, List<HelpPath> paths, ScreenOffering offering) {
            m.e(type, "type");
            m.e(title, "title");
            m.e(paths, "paths");
            return new Screen(type, title, subtitle, paths, offering);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) other;
            return this.type == screen.type && m.a(this.title, screen.title) && m.a(this.subtitle, screen.subtitle) && m.a(this.paths, screen.paths) && m.a(this.offering, screen.offering);
        }

        public final ScreenOffering getOffering() {
            return this.offering;
        }

        public final List<HelpPath> getPaths() {
            return this.paths;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ScreenType getType() {
            return this.type;
        }

        public int hashCode() {
            int iA = a.a(this.type.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iB = a.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.paths);
            ScreenOffering screenOffering = this.offering;
            return iB + (screenOffering != null ? screenOffering.hashCode() : 0);
        }

        public String toString() {
            return "Screen(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paths=" + this.paths + ", offering=" + this.offering + ')';
        }

        public Screen(ScreenType type, String title, String str, List<HelpPath> paths, ScreenOffering screenOffering) {
            m.e(type, "type");
            m.e(title, "title");
            m.e(paths, "paths");
            this.type = type;
            this.title = title;
            this.subtitle = str;
            this.paths = paths;
            this.offering = screenOffering;
        }

        public Screen(ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i3, AbstractC2541f abstractC2541f) {
            this(screenType, str, (i3 & 4) != 0 ? null : str2, list, (i3 & 16) != 0 ? null : screenOffering);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0003.-/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB=\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001a¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;", "type", "", "offeringId", "buttonText", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;", "getType", "Ljava/lang/String;", "getOfferingId", "getOfferingId$annotations", "()V", "getButtonText", "getButtonText$annotations", "Companion", "$serializer", "ScreenOfferingType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class ScreenOffering {
        private final String buttonText;
        private final String offeringId;
        private final ScreenOfferingType type;

        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer[] $childSerializers = {ScreenOfferingType.INSTANCE.serializer(), null, null};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CURRENT", "SPECIFIC", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public enum ScreenOfferingType {
            CURRENT("CURRENT"),
            SPECIFIC("SPECIFIC");

            private final String value;

            public static final Companion INSTANCE = new Companion(null);
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$ScreenOffering$ScreenOfferingType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {

                @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class AnonymousClass1 extends o implements Function0 {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override
                    public final KSerializer invoke() {
                        return AbstractC2686a0.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering.ScreenOfferingType", ScreenOfferingType.values(), new String[]{"CURRENT", "SPECIFIC"}, new Annotation[][]{null, null});
                    }
                }

                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                private final KSerializer get$cachedSerializer() {
                    return (KSerializer) ScreenOfferingType.$cachedSerializer$delegate.getValue();
                }

                public final KSerializer serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            ScreenOfferingType(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        @c
        public ScreenOffering(int i3, ScreenOfferingType screenOfferingType, @h("offering_id") String str, @h("button_text") String str2, k0 k0Var) {
            if (1 != (i3 & 1)) {
                AbstractC2686a0.l(i3, 1, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = screenOfferingType;
            if ((i3 & 2) == 0) {
                this.offeringId = null;
            } else {
                this.offeringId = str;
            }
            if ((i3 & 4) == 0) {
                this.buttonText = null;
            } else {
                this.buttonText = str2;
            }
        }

        public static ScreenOffering copy$default(ScreenOffering screenOffering, ScreenOfferingType screenOfferingType, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                screenOfferingType = screenOffering.type;
            }
            if ((i3 & 2) != 0) {
                str = screenOffering.offeringId;
            }
            if ((i3 & 4) != 0) {
                str2 = screenOffering.buttonText;
            }
            return screenOffering.copy(screenOfferingType, str, str2);
        }

        @h("button_text")
        public static void getButtonText$annotations() {
        }

        @h("offering_id")
        public static void getOfferingId$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(ScreenOffering self, b output, SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, $childSerializers[0], self.type);
            if (output.E(serialDesc) || self.offeringId != null) {
                output.t(serialDesc, 1, p0.f26988a, self.offeringId);
            }
            if (!output.E(serialDesc) && self.buttonText == null) {
                return;
            }
            output.t(serialDesc, 2, p0.f26988a, self.buttonText);
        }

        public final ScreenOfferingType getType() {
            return this.type;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final ScreenOffering copy(ScreenOfferingType type, String offeringId, String buttonText) {
            m.e(type, "type");
            return new ScreenOffering(type, offeringId, buttonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenOffering)) {
                return false;
            }
            ScreenOffering screenOffering = (ScreenOffering) other;
            return this.type == screenOffering.type && m.a(this.offeringId, screenOffering.offeringId) && m.a(this.buttonText, screenOffering.buttonText);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final ScreenOfferingType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.offeringId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonText;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ScreenOffering(type=");
            sb.append(this.type);
            sb.append(", offeringId=");
            sb.append(this.offeringId);
            sb.append(", buttonText=");
            return Y6.f.l(sb, this.buttonText, ')');
        }

        public ScreenOffering(ScreenOfferingType type, String str, String str2) {
            m.e(type, "type");
            this.type = type;
            this.offeringId = str;
            this.buttonText = str2;
        }

        public ScreenOffering(ScreenOfferingType screenOfferingType, String str, String str2, int i3, AbstractC2541f abstractC2541f) {
            this(screenOfferingType, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0003546B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\u001f¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "", "", "email", "", "shouldWarnCustomerToUpdate", "displayVirtualCurrencies", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "supportTickets", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "Ljava/lang/Boolean;", "getShouldWarnCustomerToUpdate", "getShouldWarnCustomerToUpdate$annotations", "getDisplayVirtualCurrencies", "getDisplayVirtualCurrencies$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "getSupportTickets", "getSupportTickets$annotations", "Companion", "$serializer", "SupportTickets", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class Support {

        public static final Companion INSTANCE = new Companion(null);
        private final Boolean displayVirtualCurrencies;
        private final String email;
        private final Boolean shouldWarnCustomerToUpdate;
        private final SupportTickets supportTickets;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return CustomerCenterConfigData$Support$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00045467B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001f¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "", "", "allowCreation", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "customerDetails", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;", "customerType", "<init>", "(ZLcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IZLcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "allowsActiveCustomers", "()Z", "allowsNonActiveCustomers", "component1", "component2", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "component3", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;", "copy", "(ZLcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getAllowCreation", "getAllowCreation$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "getCustomerDetails", "getCustomerDetails$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;", "getCustomerType", "getCustomerType$annotations", "Companion", "$serializer", "CustomerDetails", "CustomerType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class SupportTickets {
            private final boolean allowCreation;
            private final CustomerDetails customerDetails;
            private final CustomerType customerType;

            public static final Companion INSTANCE = new Companion(null);
            private static final KSerializer[] $childSerializers = {null, null, CustomerType.INSTANCE.serializer()};

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u009d\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J(\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÁ\u0001¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\bA\u0010=\u001a\u0004\b@\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\bB\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\bE\u0010\u0019R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bH\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bI\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bJ\u0010\u0019R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010\u0019R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\bN\u0010=\u001a\u0004\bM\u0010\u0019R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\bP\u0010=\u001a\u0004\bO\u0010\u0019R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\bR\u0010=\u001a\u0004\bQ\u0010\u0019¨\u0006U"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "", "", "activeEntitlements", "appUserId", "attConsent", "country", "deviceVersion", "email", "facebookAnonId", "idfa", "idfv", "ip", "lastOpened", "lastSeenAppVersion", "totalSpent", "userSince", "<init>", "(ZZZZZZZZZZZZZZ)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IZZZZZZZZZZZZZZLr8/k0;)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ZZZZZZZZZZZZZZ)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Z", "getActiveEntitlements", "getActiveEntitlements$annotations", "()V", "getAppUserId", "getAppUserId$annotations", "getAttConsent", "getAttConsent$annotations", "getCountry", "getDeviceVersion", "getDeviceVersion$annotations", "getEmail", "getFacebookAnonId", "getFacebookAnonId$annotations", "getIdfa", "getIdfv", "getIp", "getLastOpened", "getLastOpened$annotations", "getLastSeenAppVersion", "getLastSeenAppVersion$annotations", "getTotalSpent", "getTotalSpent$annotations", "getUserSince", "getUserSince$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            @i
            public static final class CustomerDetails {

                public static final Companion INSTANCE = new Companion(null);
                private final boolean activeEntitlements;
                private final boolean appUserId;
                private final boolean attConsent;
                private final boolean country;
                private final boolean deviceVersion;
                private final boolean email;
                private final boolean facebookAnonId;
                private final boolean idfa;
                private final boolean idfv;
                private final boolean ip;
                private final boolean lastOpened;
                private final boolean lastSeenAppVersion;
                private final boolean totalSpent;
                private final boolean userSince;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class Companion {
                    public Companion(AbstractC2541f abstractC2541f) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public CustomerDetails() {
                    this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (AbstractC2541f) null);
                }

                @h("active_entitlements")
                public static void getActiveEntitlements$annotations() {
                }

                @h("app_user_id")
                public static void getAppUserId$annotations() {
                }

                @h("att_consent")
                public static void getAttConsent$annotations() {
                }

                @h("device_version")
                public static void getDeviceVersion$annotations() {
                }

                @h("facebook_anon_id")
                public static void getFacebookAnonId$annotations() {
                }

                @h("last_opened")
                public static void getLastOpened$annotations() {
                }

                @h("last_seen_app_version")
                public static void getLastSeenAppVersion$annotations() {
                }

                @h("total_spent")
                public static void getTotalSpent$annotations() {
                }

                @h("user_since")
                public static void getUserSince$annotations() {
                }

                public static final void write$Self$purchases_defaultsRelease(CustomerDetails self, b output, SerialDescriptor serialDesc) {
                    if (output.E(serialDesc) || self.activeEntitlements) {
                        output.q(serialDesc, 0, self.activeEntitlements);
                    }
                    if (output.E(serialDesc) || self.appUserId) {
                        output.q(serialDesc, 1, self.appUserId);
                    }
                    if (output.E(serialDesc) || self.attConsent) {
                        output.q(serialDesc, 2, self.attConsent);
                    }
                    if (output.E(serialDesc) || self.country) {
                        output.q(serialDesc, 3, self.country);
                    }
                    if (output.E(serialDesc) || self.deviceVersion) {
                        output.q(serialDesc, 4, self.deviceVersion);
                    }
                    if (output.E(serialDesc) || self.email) {
                        output.q(serialDesc, 5, self.email);
                    }
                    if (output.E(serialDesc) || self.facebookAnonId) {
                        output.q(serialDesc, 6, self.facebookAnonId);
                    }
                    if (output.E(serialDesc) || self.idfa) {
                        output.q(serialDesc, 7, self.idfa);
                    }
                    if (output.E(serialDesc) || self.idfv) {
                        output.q(serialDesc, 8, self.idfv);
                    }
                    if (output.E(serialDesc) || self.ip) {
                        output.q(serialDesc, 9, self.ip);
                    }
                    if (output.E(serialDesc) || self.lastOpened) {
                        output.q(serialDesc, 10, self.lastOpened);
                    }
                    if (output.E(serialDesc) || self.lastSeenAppVersion) {
                        output.q(serialDesc, 11, self.lastSeenAppVersion);
                    }
                    if (output.E(serialDesc) || self.totalSpent) {
                        output.q(serialDesc, 12, self.totalSpent);
                    }
                    if (output.E(serialDesc) || self.userSince) {
                        output.q(serialDesc, 13, self.userSince);
                    }
                }

                public final boolean getActiveEntitlements() {
                    return this.activeEntitlements;
                }

                public final boolean getIp() {
                    return this.ip;
                }

                public final boolean getLastOpened() {
                    return this.lastOpened;
                }

                public final boolean getLastSeenAppVersion() {
                    return this.lastSeenAppVersion;
                }

                public final boolean getTotalSpent() {
                    return this.totalSpent;
                }

                public final boolean getUserSince() {
                    return this.userSince;
                }

                public final boolean getAppUserId() {
                    return this.appUserId;
                }

                public final boolean getAttConsent() {
                    return this.attConsent;
                }

                public final boolean getCountry() {
                    return this.country;
                }

                public final boolean getDeviceVersion() {
                    return this.deviceVersion;
                }

                public final boolean getEmail() {
                    return this.email;
                }

                public final boolean getFacebookAnonId() {
                    return this.facebookAnonId;
                }

                public final boolean getIdfa() {
                    return this.idfa;
                }

                public final boolean getIdfv() {
                    return this.idfv;
                }

                public final CustomerDetails copy(boolean activeEntitlements, boolean appUserId, boolean attConsent, boolean country, boolean deviceVersion, boolean email, boolean facebookAnonId, boolean idfa, boolean idfv, boolean ip, boolean lastOpened, boolean lastSeenAppVersion, boolean totalSpent, boolean userSince) {
                    return new CustomerDetails(activeEntitlements, appUserId, attConsent, country, deviceVersion, email, facebookAnonId, idfa, idfv, ip, lastOpened, lastSeenAppVersion, totalSpent, userSince);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CustomerDetails)) {
                        return false;
                    }
                    CustomerDetails customerDetails = (CustomerDetails) other;
                    return this.activeEntitlements == customerDetails.activeEntitlements && this.appUserId == customerDetails.appUserId && this.attConsent == customerDetails.attConsent && this.country == customerDetails.country && this.deviceVersion == customerDetails.deviceVersion && this.email == customerDetails.email && this.facebookAnonId == customerDetails.facebookAnonId && this.idfa == customerDetails.idfa && this.idfv == customerDetails.idfv && this.ip == customerDetails.ip && this.lastOpened == customerDetails.lastOpened && this.lastSeenAppVersion == customerDetails.lastSeenAppVersion && this.totalSpent == customerDetails.totalSpent && this.userSince == customerDetails.userSince;
                }

                public final boolean getActiveEntitlements() {
                    return this.activeEntitlements;
                }

                public final boolean getAppUserId() {
                    return this.appUserId;
                }

                public final boolean getAttConsent() {
                    return this.attConsent;
                }

                public final boolean getCountry() {
                    return this.country;
                }

                public final boolean getDeviceVersion() {
                    return this.deviceVersion;
                }

                public final boolean getEmail() {
                    return this.email;
                }

                public final boolean getFacebookAnonId() {
                    return this.facebookAnonId;
                }

                public final boolean getIdfa() {
                    return this.idfa;
                }

                public final boolean getIdfv() {
                    return this.idfv;
                }

                public final boolean getIp() {
                    return this.ip;
                }

                public final boolean getLastOpened() {
                    return this.lastOpened;
                }

                public final boolean getLastSeenAppVersion() {
                    return this.lastSeenAppVersion;
                }

                public final boolean getTotalSpent() {
                    return this.totalSpent;
                }

                public final boolean getUserSince() {
                    return this.userSince;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.userSince) + p.f(p.f(p.f(p.f(p.f(p.f(p.f(p.f(p.f(p.f(p.f(p.f(Boolean.hashCode(this.activeEntitlements) * 31, 31, this.appUserId), 31, this.attConsent), 31, this.country), 31, this.deviceVersion), 31, this.email), 31, this.facebookAnonId), 31, this.idfa), 31, this.idfv), 31, this.ip), 31, this.lastOpened), 31, this.lastSeenAppVersion), 31, this.totalSpent);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("CustomerDetails(activeEntitlements=");
                    sb.append(this.activeEntitlements);
                    sb.append(", appUserId=");
                    sb.append(this.appUserId);
                    sb.append(", attConsent=");
                    sb.append(this.attConsent);
                    sb.append(", country=");
                    sb.append(this.country);
                    sb.append(", deviceVersion=");
                    sb.append(this.deviceVersion);
                    sb.append(", email=");
                    sb.append(this.email);
                    sb.append(", facebookAnonId=");
                    sb.append(this.facebookAnonId);
                    sb.append(", idfa=");
                    sb.append(this.idfa);
                    sb.append(", idfv=");
                    sb.append(this.idfv);
                    sb.append(", ip=");
                    sb.append(this.ip);
                    sb.append(", lastOpened=");
                    sb.append(this.lastOpened);
                    sb.append(", lastSeenAppVersion=");
                    sb.append(this.lastSeenAppVersion);
                    sb.append(", totalSpent=");
                    sb.append(this.totalSpent);
                    sb.append(", userSince=");
                    return L.a(sb, this.userSince, ')');
                }

                @c
                public CustomerDetails(int i3, @h("active_entitlements") boolean z6, @h("app_user_id") boolean z9, @h("att_consent") boolean z10, boolean z11, @h("device_version") boolean z12, boolean z13, @h("facebook_anon_id") boolean z14, boolean z15, boolean z16, boolean z17, @h("last_opened") boolean z18, @h("last_seen_app_version") boolean z19, @h("total_spent") boolean z20, @h("user_since") boolean z21, k0 k0Var) {
                    if ((i3 & 1) == 0) {
                        this.activeEntitlements = false;
                    } else {
                        this.activeEntitlements = z6;
                    }
                    if ((i3 & 2) == 0) {
                        this.appUserId = false;
                    } else {
                        this.appUserId = z9;
                    }
                    if ((i3 & 4) == 0) {
                        this.attConsent = false;
                    } else {
                        this.attConsent = z10;
                    }
                    if ((i3 & 8) == 0) {
                        this.country = false;
                    } else {
                        this.country = z11;
                    }
                    if ((i3 & 16) == 0) {
                        this.deviceVersion = false;
                    } else {
                        this.deviceVersion = z12;
                    }
                    if ((i3 & 32) == 0) {
                        this.email = false;
                    } else {
                        this.email = z13;
                    }
                    if ((i3 & 64) == 0) {
                        this.facebookAnonId = false;
                    } else {
                        this.facebookAnonId = z14;
                    }
                    if ((i3 & 128) == 0) {
                        this.idfa = false;
                    } else {
                        this.idfa = z15;
                    }
                    if ((i3 & 256) == 0) {
                        this.idfv = false;
                    } else {
                        this.idfv = z16;
                    }
                    if ((i3 & 512) == 0) {
                        this.ip = false;
                    } else {
                        this.ip = z17;
                    }
                    if ((i3 & 1024) == 0) {
                        this.lastOpened = false;
                    } else {
                        this.lastOpened = z18;
                    }
                    if ((i3 & 2048) == 0) {
                        this.lastSeenAppVersion = false;
                    } else {
                        this.lastSeenAppVersion = z19;
                    }
                    if ((i3 & 4096) == 0) {
                        this.totalSpent = false;
                    } else {
                        this.totalSpent = z20;
                    }
                    if ((i3 & 8192) == 0) {
                        this.userSince = false;
                    } else {
                        this.userSince = z21;
                    }
                }

                public CustomerDetails(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
                    this.activeEntitlements = z6;
                    this.appUserId = z9;
                    this.attConsent = z10;
                    this.country = z11;
                    this.deviceVersion = z12;
                    this.email = z13;
                    this.facebookAnonId = z14;
                    this.idfa = z15;
                    this.idfv = z16;
                    this.ip = z17;
                    this.lastOpened = z18;
                    this.lastSeenAppVersion = z19;
                    this.totalSpent = z20;
                    this.userSince = z21;
                }

                public CustomerDetails(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i3, AbstractC2541f abstractC2541f) {
                    this((i3 & 1) != 0 ? false : z6, (i3 & 2) != 0 ? false : z9, (i3 & 4) != 0 ? false : z10, (i3 & 8) != 0 ? false : z11, (i3 & 16) != 0 ? false : z12, (i3 & 32) != 0 ? false : z13, (i3 & 64) != 0 ? false : z14, (i3 & 128) != 0 ? false : z15, (i3 & 256) != 0 ? false : z16, (i3 & 512) != 0 ? false : z17, (i3 & 1024) != 0 ? false : z18, (i3 & 2048) != 0 ? false : z19, (i3 & 4096) != 0 ? false : z20, (i3 & 8192) != 0 ? false : z21);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;", "", "(Ljava/lang/String;I)V", "NOT_ACTIVE", "NONE", "ALL", "ACTIVE", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            @i
            public enum CustomerType {
                NOT_ACTIVE,
                NONE,
                ALL,
                ACTIVE;


                public static final Companion INSTANCE = new Companion(null);
                private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class Companion {

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    public static final class AnonymousClass1 extends o implements Function0 {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        public AnonymousClass1() {
                            super(0);
                        }

                        @Override
                        public final KSerializer invoke() {
                            return AbstractC2686a0.e("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerType", CustomerType.values(), new String[]{"not_active", "none", TtmlNode.COMBINE_ALL, "active"}, new Annotation[][]{null, null, null, null});
                        }
                    }

                    public Companion(AbstractC2541f abstractC2541f) {
                        this();
                    }

                    private final KSerializer get$cachedSerializer() {
                        return (KSerializer) CustomerType.$cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer serializer() {
                        return get$cachedSerializer();
                    }

                    private Companion() {
                    }
                }
            }

            public SupportTickets() {
                this(false, (CustomerDetails) null, (CustomerType) null, 7, (AbstractC2541f) null);
            }

            public static SupportTickets copy$default(SupportTickets supportTickets, boolean z6, CustomerDetails customerDetails, CustomerType customerType, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    z6 = supportTickets.allowCreation;
                }
                if ((i3 & 2) != 0) {
                    customerDetails = supportTickets.customerDetails;
                }
                if ((i3 & 4) != 0) {
                    customerType = supportTickets.customerType;
                }
                return supportTickets.copy(z6, customerDetails, customerType);
            }

            @h("allow_creation")
            public static void getAllowCreation$annotations() {
            }

            @h("customer_details")
            public static void getCustomerDetails$annotations() {
            }

            @h("customer_type")
            public static void getCustomerType$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(SupportTickets self, b output, SerialDescriptor serialDesc) {
                KSerializer[] kSerializerArr = $childSerializers;
                if (output.E(serialDesc) || self.allowCreation) {
                    output.q(serialDesc, 0, self.allowCreation);
                }
                if (output.E(serialDesc)) {
                    output.h(serialDesc, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, self.customerDetails);
                } else {
                    if (!m.a(self.customerDetails, new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (AbstractC2541f) null))) {
                        output.h(serialDesc, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, self.customerDetails);
                    }
                }
                if (!output.E(serialDesc) && self.customerType == CustomerType.NOT_ACTIVE) {
                    return;
                }
                output.h(serialDesc, 2, kSerializerArr[2], self.customerType);
            }

            public final boolean allowsActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.ACTIVE;
            }

            public final boolean allowsNonActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.NOT_ACTIVE;
            }

            public final boolean getAllowCreation() {
                return this.allowCreation;
            }

            public final CustomerDetails getCustomerDetails() {
                return this.customerDetails;
            }

            public final CustomerType getCustomerType() {
                return this.customerType;
            }

            public final SupportTickets copy(boolean allowCreation, CustomerDetails customerDetails, CustomerType customerType) {
                m.e(customerDetails, "customerDetails");
                m.e(customerType, "customerType");
                return new SupportTickets(allowCreation, customerDetails, customerType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SupportTickets)) {
                    return false;
                }
                SupportTickets supportTickets = (SupportTickets) other;
                return this.allowCreation == supportTickets.allowCreation && m.a(this.customerDetails, supportTickets.customerDetails) && this.customerType == supportTickets.customerType;
            }

            public final boolean getAllowCreation() {
                return this.allowCreation;
            }

            public final CustomerDetails getCustomerDetails() {
                return this.customerDetails;
            }

            public final CustomerType getCustomerType() {
                return this.customerType;
            }

            public int hashCode() {
                return this.customerType.hashCode() + ((this.customerDetails.hashCode() + (Boolean.hashCode(this.allowCreation) * 31)) * 31);
            }

            public String toString() {
                return "SupportTickets(allowCreation=" + this.allowCreation + ", customerDetails=" + this.customerDetails + ", customerType=" + this.customerType + ')';
            }

            @c
            public SupportTickets(int i3, @h("allow_creation") boolean z6, @h("customer_details") CustomerDetails customerDetails, @h("customer_type") CustomerType customerType, k0 k0Var) {
                this.allowCreation = (i3 & 1) == 0 ? false : z6;
                if ((i3 & 2) == 0) {
                    this.customerDetails = new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (AbstractC2541f) null);
                } else {
                    this.customerDetails = customerDetails;
                }
                this.customerType = (i3 & 4) == 0 ? CustomerType.NOT_ACTIVE : customerType;
            }

            public SupportTickets(boolean z6, CustomerDetails customerDetails, CustomerType customerType) {
                m.e(customerDetails, "customerDetails");
                m.e(customerType, "customerType");
                this.allowCreation = z6;
                this.customerDetails = customerDetails;
                this.customerType = customerType;
            }

            public SupportTickets(boolean z6, CustomerDetails customerDetails, CustomerType customerType, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? false : z6, (i3 & 2) != 0 ? new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (AbstractC2541f) null) : customerDetails, (i3 & 4) != 0 ? CustomerType.NOT_ACTIVE : customerType);
            }
        }

        public Support() {
            this((String) null, (Boolean) null, (Boolean) null, (SupportTickets) null, 15, (AbstractC2541f) null);
        }

        public static Support copy$default(Support support, String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = support.email;
            }
            if ((i3 & 2) != 0) {
                bool = support.shouldWarnCustomerToUpdate;
            }
            if ((i3 & 4) != 0) {
                bool2 = support.displayVirtualCurrencies;
            }
            if ((i3 & 8) != 0) {
                supportTickets = support.supportTickets;
            }
            return support.copy(str, bool, bool2, supportTickets);
        }

        @h("display_virtual_currencies")
        public static void getDisplayVirtualCurrencies$annotations() {
        }

        @i(with = EmptyStringToNullSerializer.class)
        public static void getEmail$annotations() {
        }

        @h("should_warn_customer_to_update")
        public static void getShouldWarnCustomerToUpdate$annotations() {
        }

        @h("support_tickets")
        public static void getSupportTickets$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(Support self, b output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.email != null) {
                output.t(serialDesc, 0, EmptyStringToNullSerializer.INSTANCE, self.email);
            }
            if (output.E(serialDesc) || self.shouldWarnCustomerToUpdate != null) {
                output.t(serialDesc, 1, C2696g.f26961a, self.shouldWarnCustomerToUpdate);
            }
            if (output.E(serialDesc) || self.displayVirtualCurrencies != null) {
                output.t(serialDesc, 2, C2696g.f26961a, self.displayVirtualCurrencies);
            }
            if (!output.E(serialDesc)) {
                if (m.a(self.supportTickets, new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (AbstractC2541f) null))) {
                    return;
                }
            }
            output.h(serialDesc, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, self.supportTickets);
        }

        public final String getEmail() {
            return this.email;
        }

        public final Boolean getShouldWarnCustomerToUpdate() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final Boolean getDisplayVirtualCurrencies() {
            return this.displayVirtualCurrencies;
        }

        public final SupportTickets getSupportTickets() {
            return this.supportTickets;
        }

        public final Support copy(String email, Boolean shouldWarnCustomerToUpdate, Boolean displayVirtualCurrencies, SupportTickets supportTickets) {
            m.e(supportTickets, "supportTickets");
            return new Support(email, shouldWarnCustomerToUpdate, displayVirtualCurrencies, supportTickets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Support)) {
                return false;
            }
            Support support = (Support) other;
            return m.a(this.email, support.email) && m.a(this.shouldWarnCustomerToUpdate, support.shouldWarnCustomerToUpdate) && m.a(this.displayVirtualCurrencies, support.displayVirtualCurrencies) && m.a(this.supportTickets, support.supportTickets);
        }

        public final Boolean getDisplayVirtualCurrencies() {
            return this.displayVirtualCurrencies;
        }

        public final String getEmail() {
            return this.email;
        }

        public final Boolean getShouldWarnCustomerToUpdate() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final SupportTickets getSupportTickets() {
            return this.supportTickets;
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.shouldWarnCustomerToUpdate;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.displayVirtualCurrencies;
            return this.supportTickets.hashCode() + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Support(email=" + this.email + ", shouldWarnCustomerToUpdate=" + this.shouldWarnCustomerToUpdate + ", displayVirtualCurrencies=" + this.displayVirtualCurrencies + ", supportTickets=" + this.supportTickets + ')';
        }

        @c
        public Support(int i3, @i(with = EmptyStringToNullSerializer.class) String str, @h("should_warn_customer_to_update") Boolean bool, @h("display_virtual_currencies") Boolean bool2, @h("support_tickets") SupportTickets supportTickets, k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
            }
            if ((i3 & 2) == 0) {
                this.shouldWarnCustomerToUpdate = null;
            } else {
                this.shouldWarnCustomerToUpdate = bool;
            }
            if ((i3 & 4) == 0) {
                this.displayVirtualCurrencies = null;
            } else {
                this.displayVirtualCurrencies = bool2;
            }
            if ((i3 & 8) != 0) {
                this.supportTickets = supportTickets;
                return;
            }
            this.supportTickets = new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (AbstractC2541f) null);
        }

        public Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets) {
            m.e(supportTickets, "supportTickets");
            this.email = str;
            this.shouldWarnCustomerToUpdate = bool;
            this.displayVirtualCurrencies = bool2;
            this.supportTickets = supportTickets;
        }

        public Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : bool2, (i3 & 8) != 0 ? new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (AbstractC2541f) null) : supportTickets);
        }
    }

    @c
    public CustomerCenterConfigData(int i3, @i(with = ScreenMapSerializer.class) Map map, Appearance appearance, Localization localization, Support support, @h("last_published_app_version") @i(with = EmptyStringToNullSerializer.class) String str, k0 k0Var) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, CustomerCenterConfigData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        if ((i3 & 16) == 0) {
            this.lastPublishedAppVersion = null;
        } else {
            this.lastPublishedAppVersion = str;
        }
    }

    public static CustomerCenterConfigData copy$default(CustomerCenterConfigData customerCenterConfigData, Map map, Appearance appearance, Localization localization, Support support, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = customerCenterConfigData.screens;
        }
        if ((i3 & 2) != 0) {
            appearance = customerCenterConfigData.appearance;
        }
        if ((i3 & 4) != 0) {
            localization = customerCenterConfigData.localization;
        }
        if ((i3 & 8) != 0) {
            support = customerCenterConfigData.support;
        }
        if ((i3 & 16) != 0) {
            str = customerCenterConfigData.lastPublishedAppVersion;
        }
        String str2 = str;
        Localization localization2 = localization;
        return customerCenterConfigData.copy(map, appearance, localization2, support, str2);
    }

    @h("last_published_app_version")
    @i(with = EmptyStringToNullSerializer.class)
    public static void getLastPublishedAppVersion$annotations() {
    }

    @i(with = ScreenMapSerializer.class)
    public static void getScreens$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(CustomerCenterConfigData self, b output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, ScreenMapSerializer.INSTANCE, self.screens);
        output.h(serialDesc, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, self.appearance);
        output.h(serialDesc, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, self.localization);
        output.h(serialDesc, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, self.support);
        if (!output.E(serialDesc) && self.lastPublishedAppVersion == null) {
            return;
        }
        output.t(serialDesc, 4, EmptyStringToNullSerializer.INSTANCE, self.lastPublishedAppVersion);
    }

    public final Map<Screen.ScreenType, Screen> component1() {
        return this.screens;
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Support getSupport() {
        return this.support;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final CustomerCenterConfigData copy(Map<Screen.ScreenType, Screen> screens, Appearance appearance, Localization localization, Support support, String lastPublishedAppVersion) {
        m.e(screens, "screens");
        m.e(appearance, "appearance");
        m.e(localization, "localization");
        m.e(support, "support");
        return new CustomerCenterConfigData(screens, appearance, localization, support, lastPublishedAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerCenterConfigData)) {
            return false;
        }
        CustomerCenterConfigData customerCenterConfigData = (CustomerCenterConfigData) other;
        return m.a(this.screens, customerCenterConfigData.screens) && m.a(this.appearance, customerCenterConfigData.appearance) && m.a(this.localization, customerCenterConfigData.localization) && m.a(this.support, customerCenterConfigData.support) && m.a(this.lastPublishedAppVersion, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Screen getManagementScreen() {
        return this.screens.get(Screen.ScreenType.MANAGEMENT);
    }

    public final Screen getNoActiveScreen() {
        return this.screens.get(Screen.ScreenType.NO_ACTIVE);
    }

    public final Map<Screen.ScreenType, Screen> getScreens() {
        return this.screens;
    }

    public final Support getSupport() {
        return this.support;
    }

    public int hashCode() {
        int iHashCode = (this.support.hashCode() + ((this.localization.hashCode() + ((this.appearance.hashCode() + (this.screens.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.lastPublishedAppVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerCenterConfigData(screens=");
        sb.append(this.screens);
        sb.append(", appearance=");
        sb.append(this.appearance);
        sb.append(", localization=");
        sb.append(this.localization);
        sb.append(", support=");
        sb.append(this.support);
        sb.append(", lastPublishedAppVersion=");
        return Y6.f.l(sb, this.lastPublishedAppVersion, ')');
    }

    public CustomerCenterConfigData(Map<Screen.ScreenType, Screen> screens, Appearance appearance, Localization localization, Support support, String str) {
        m.e(screens, "screens");
        m.e(appearance, "appearance");
        m.e(localization, "localization");
        m.e(support, "support");
        this.screens = screens;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        this.lastPublishedAppVersion = str;
    }

    public CustomerCenterConfigData(Map map, Appearance appearance, Localization localization, Support support, String str, int i3, AbstractC2541f abstractC2541f) {
        this(map, appearance, localization, support, (i3 & 16) != 0 ? null : str);
    }
}
