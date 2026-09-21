package com.revenuecat.purchases.paywalls.components;

import I3.b;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import io.sentry.protocol.Request;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.h;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.C2696g;
import p153r8.C2714z;
import p153r8.k0;
import p153r8.p0;

@h("purchase_button")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 &2\u00020\u0001:\u0005'(&)*B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", Request.JsonKeys.METHOD, "", "name", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion", "$serializer", "Action", "CustomUrl", "Method", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PurchaseButtonComponent implements PaywallComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final Action action;
    private final Method method;
    private final String name;
    private final StackComponent stack;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "", "(Ljava/lang/String;I)V", "toMethod", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "IN_APP_CHECKOUT", "WEB_CHECKOUT", "WEB_PRODUCT_SELECTION", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = ActionDeserializer.class)
    public enum Action {
        IN_APP_CHECKOUT,
        WEB_CHECKOUT,
        WEB_PRODUCT_SELECTION;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return ActionDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Action.values().length];
                try {
                    iArr[Action.IN_APP_CHECKOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.WEB_CHECKOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.WEB_PRODUCT_SELECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Method toMethod() {
            int i3 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i3 == 1) {
                return Method.InAppCheckout.INSTANCE;
            }
            int i9 = 3;
            Boolean bool = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (i3 == 2) {
                return new Method.WebCheckout((Boolean) (objArr3 == true ? 1 : 0), (ButtonComponent.UrlMethod) (objArr2 == true ? 1 : 0), i9, (AbstractC2541f) (objArr == true ? 1 : 0));
            }
            if (i3 == 3) {
                return new Method.WebProductSelection(bool, (ButtonComponent.UrlMethod) (objArr5 == true ? 1 : 0), i9, (AbstractC2541f) (objArr4 == true ? 1 : 0));
            }
            throw new b();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return PurchaseButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "", "packageParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "copy-26kQY28", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "copy", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "getUrlLid-z7Tp-4o$annotations", "()V", "getPackageParam", "getPackageParam$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i
    public static final class CustomUrl {

        public static final Companion INSTANCE = new Companion(null);
        private final String packageParam;
        private final String urlLid;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @c
        public CustomUrl(int i3, @h("url_lid") String str, @h("package_param") String str2, k0 k0Var, AbstractC2541f abstractC2541f) {
            this(i3, str, str2, k0Var);
        }

        public static CustomUrl m209copy26kQY28$default(CustomUrl customUrl, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = customUrl.urlLid;
            }
            if ((i3 & 2) != 0) {
                str2 = customUrl.packageParam;
            }
            return customUrl.m212copy26kQY28(str, str2);
        }

        @h("package_param")
        public static void getPackageParam$annotations() {
        }

        @h("url_lid")
        public static void m210getUrlLidz7Tp4o$annotations() {
        }

        public static final void write$Self$purchases_defaultsRelease(CustomUrl self, p143q8.b output, SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m257boximpl(self.urlLid));
            if (!output.E(serialDesc) && self.packageParam == null) {
                return;
            }
            output.t(serialDesc, 1, p0.f26988a, self.packageParam);
        }

        public final String getUrlLid() {
            return this.urlLid;
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        public final CustomUrl m212copy26kQY28(String urlLid, String packageParam) {
            m.e(urlLid, "urlLid");
            return new CustomUrl(urlLid, packageParam, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomUrl)) {
                return false;
            }
            CustomUrl customUrl = (CustomUrl) other;
            return LocalizationKey.m260equalsimpl0(this.urlLid, customUrl.urlLid) && m.a(this.packageParam, customUrl.packageParam);
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        public final String m213getUrlLidz7Tp4o() {
            return this.urlLid;
        }

        public int hashCode() {
            int iM261hashCodeimpl = LocalizationKey.m261hashCodeimpl(this.urlLid) * 31;
            String str = this.packageParam;
            return iM261hashCodeimpl + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CustomUrl(urlLid=");
            sb.append((Object) LocalizationKey.m262toStringimpl(this.urlLid));
            sb.append(", packageParam=");
            return f.l(sb, this.packageParam, ')');
        }

        public CustomUrl(String str, String str2, AbstractC2541f abstractC2541f) {
            this(str, str2);
        }

        private CustomUrl(int i3, String str, String str2, k0 k0Var) {
            if (1 != (i3 & 1)) {
                AbstractC2686a0.l(i3, 1, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.urlLid = str;
            if ((i3 & 2) == 0) {
                this.packageParam = null;
            } else {
                this.packageParam = str2;
            }
        }

        private CustomUrl(String urlLid, String str) {
            m.e(urlLid, "urlLid");
            this.urlLid = urlLid;
            this.packageParam = str;
        }

        public CustomUrl(String str, String str2, int i3, AbstractC2541f abstractC2541f) {
            this(str, (i3 & 2) != 0 ? null : str2, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "Companion", "CustomWebCheckout", "InAppCheckout", "Unknown", "WebCheckout", "WebProductSelection", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = PurchaseButtonMethodDeserializer.class)
    public interface Method {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                return PurchaseButtonMethodDeserializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "customUrl", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "getCustomUrl", "getCustomUrl$annotations", "()V", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class CustomWebCheckout implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final CustomUrl customUrl;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @c
            public CustomWebCheckout(int i3, @h("custom_url") CustomUrl customUrl, @h("auto_dismiss") Boolean bool, @h("open_method") ButtonComponent.UrlMethod urlMethod, k0 k0Var) {
                if (1 != (i3 & 1)) {
                    AbstractC2686a0.l(i3, 1, PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.customUrl = customUrl;
                if ((i3 & 2) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 4) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public static CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    customUrl = customWebCheckout.customUrl;
                }
                if ((i3 & 2) != 0) {
                    bool = customWebCheckout.autoDismiss;
                }
                if ((i3 & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                return customWebCheckout.copy(customUrl, bool, urlMethod);
            }

            @h("auto_dismiss")
            public static void getAutoDismiss$annotations() {
            }

            @h("custom_url")
            public static void getCustomUrl$annotations() {
            }

            @h("open_method")
            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(CustomWebCheckout self, p143q8.b output, SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, self.customUrl);
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 1, C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 2, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final CustomWebCheckout copy(CustomUrl customUrl, Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                m.e(customUrl, "customUrl");
                return new CustomWebCheckout(customUrl, autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) other;
                return m.a(this.customUrl, customWebCheckout.customUrl) && m.a(this.autoDismiss, customWebCheckout.autoDismiss) && this.openMethod == customWebCheckout.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                int iHashCode = this.customUrl.hashCode() * 31;
                Boolean bool = this.autoDismiss;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode2 + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "CustomWebCheckout(customUrl=" + this.customUrl + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                m.e(customUrl, "customUrl");
                this.customUrl = customUrl;
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, AbstractC2541f abstractC2541f) {
                this(customUrl, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : urlMethod);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class InAppCheckout implements Method {
            public static final InAppCheckout INSTANCE = new InAppCheckout();
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends o implements Function0 {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final KSerializer invoke() {
                    return new C2714z("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout", InAppCheckout.INSTANCE, new Annotation[0]);
                }
            }

            private InAppCheckout() {
            }

            private final KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class Unknown implements Method {
            public static final Unknown INSTANCE = new Unknown();
            private static final p070h6.h $cachedSerializer$delegate = D.A(p070h6.i.f22537i, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends o implements Function0 {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final KSerializer invoke() {
                    return new C2714z("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class WebCheckout implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return PurchaseButtonComponent$Method$WebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebCheckout() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static WebCheckout copy$default(WebCheckout webCheckout, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    bool = webCheckout.autoDismiss;
                }
                if ((i3 & 2) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(bool, urlMethod);
            }

            @h("auto_dismiss")
            public static void getAutoDismiss$annotations() {
            }

            @h("open_method")
            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(WebCheckout self, p143q8.b output, SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 0, C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final WebCheckout copy(Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                return new WebCheckout(autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) other;
                return m.a(this.autoDismiss, webCheckout.autoDismiss) && this.openMethod == webCheckout.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebCheckout(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @c
            public WebCheckout(int i3, @h("auto_dismiss") Boolean bool, @h("open_method") ButtonComponent.UrlMethod urlMethod, k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? null : urlMethod);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @i
        public static final class WebProductSelection implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public Companion(AbstractC2541f abstractC2541f) {
                    this();
                }

                public final KSerializer serializer() {
                    return PurchaseButtonComponent$Method$WebProductSelection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebProductSelection() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static WebProductSelection copy$default(WebProductSelection webProductSelection, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    bool = webProductSelection.autoDismiss;
                }
                if ((i3 & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(bool, urlMethod);
            }

            @h("auto_dismiss")
            public static void getAutoDismiss$annotations() {
            }

            @h("open_method")
            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsRelease(WebProductSelection self, p143q8.b output, SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 0, C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final WebProductSelection copy(Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                return new WebProductSelection(autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) other;
                return m.a(this.autoDismiss, webProductSelection.autoDismiss) && this.openMethod == webProductSelection.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @c
            public WebProductSelection(int i3, @h("auto_dismiss") Boolean bool, @h("open_method") ButtonComponent.UrlMethod urlMethod, k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i3, AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? null : urlMethod);
            }
        }
    }

    @c
    public PurchaseButtonComponent(int i3, StackComponent stackComponent, Action action, Method method, String str, k0 k0Var) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        if ((i3 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i3 & 4) == 0) {
            this.method = null;
        } else {
            this.method = method;
        }
        if ((i3 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static final void write$Self$purchases_defaultsRelease(PurchaseButtonComponent self, p143q8.b output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, StackComponent$$serializer.INSTANCE, self.stack);
        if (output.E(serialDesc) || self.action != null) {
            output.t(serialDesc, 1, ActionDeserializer.INSTANCE, self.action);
        }
        if (output.E(serialDesc) || self.method != null) {
            output.t(serialDesc, 2, PurchaseButtonMethodDeserializer.INSTANCE, self.method);
        }
        if (!output.E(serialDesc) && self.name == null) {
            return;
        }
        output.t(serialDesc, 3, p0.f26988a, self.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseButtonComponent)) {
            return false;
        }
        PurchaseButtonComponent purchaseButtonComponent = (PurchaseButtonComponent) obj;
        return m.a(this.stack, purchaseButtonComponent.stack) && this.action == purchaseButtonComponent.action && m.a(this.method, purchaseButtonComponent.method) && m.a(this.name, purchaseButtonComponent.name);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final String getName() {
        return this.name;
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int iHashCode = this.stack.hashCode() * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Method method = this.method;
        int iHashCode3 = (iHashCode2 + (method == null ? 0 : method.hashCode())) * 31;
        String str = this.name;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseButtonComponent(stack=");
        sb.append(this.stack);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", name=");
        return f.l(sb, this.name, ')');
    }

    public PurchaseButtonComponent(StackComponent stack, Action action, Method method, String str) {
        m.e(stack, "stack");
        this.stack = stack;
        this.action = action;
        this.method = method;
        this.name = str;
    }

    public PurchaseButtonComponent(StackComponent stackComponent, Action action, Method method, String str, int i3, AbstractC2541f abstractC2541f) {
        this(stackComponent, (i3 & 2) != 0 ? null : action, (i3 & 4) != 0 ? null : method, (i3 & 8) != 0 ? null : str);
    }
}
