package com.revenuecat.purchases.paywalls.components.common.serializers;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.StoreReplacementMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/serializers/DowngradeReplacementModeDeserializer;", "Lcom/revenuecat/purchases/paywalls/components/common/serializers/StoreReplacementModeDeserializer;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DowngradeReplacementModeDeserializer extends StoreReplacementModeDeserializer {
    public static final DowngradeReplacementModeDeserializer INSTANCE = new DowngradeReplacementModeDeserializer();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends o implements j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final String invoke(StoreReplacementMode value) {
            m.e(value, "value");
            String lowerCase = value.getName().toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private DowngradeReplacementModeDeserializer() {
        super(StoreReplacementMode.DEFERRED, AnonymousClass1.INSTANCE);
    }
}
