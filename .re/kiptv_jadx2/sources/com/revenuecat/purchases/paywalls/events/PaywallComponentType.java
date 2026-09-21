package com.revenuecat.purchases.paywalls.events;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import io.sentry.protocol.SentryStackFrame;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import p070h6.h;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;", "", "(Ljava/lang/String;I)V", "TAB", "SWITCH", "CAROUSEL", "BUTTON", "TEXT", "PACKAGE", "PACKAGE_SELECTION_SHEET", "PURCHASE_BUTTON", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public enum PaywallComponentType {
    TAB,
    SWITCH,
    CAROUSEL,
    BUTTON,
    TEXT,
    PACKAGE,
    PACKAGE_SELECTION_SHEET,
    PURCHASE_BUTTON;


    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends o implements Function0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final KSerializer invoke() {
                return AbstractC2686a0.e("com.revenuecat.purchases.paywalls.events.PaywallComponentType", PaywallComponentType.values(), new String[]{"tab", "switch", "carousel", "button", "text", SentryStackFrame.JsonKeys.PACKAGE, "package_selection_sheet", "purchase_button"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            }
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private final KSerializer get$cachedSerializer() {
            return (KSerializer) PaywallComponentType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
