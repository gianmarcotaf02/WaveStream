package com.revenuecat.purchases.paywalls.components;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0003\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eBC\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "type", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "destination", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", Request.JsonKeys.URL, "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "sheet", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;)V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;Lr8/k0;)V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "toDestination", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/ActionTypeSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "getDestination", "()Lcom/revenuecat/purchases/paywalls/components/DestinationSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "getUrl", "()Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "getSheet", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
final class ActionSurrogate {

    public static final Companion INSTANCE = new Companion(null);
    private final DestinationSurrogate destination;
    private final ButtonComponent.Destination.Sheet sheet;
    private final ActionTypeSurrogate type;
    private final UrlSurrogate url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return ActionSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActionTypeSurrogate.values().length];
            try {
                iArr[ActionTypeSurrogate.unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionTypeSurrogate.restore_purchases.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionTypeSurrogate.navigate_back.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionTypeSurrogate.workflow.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionTypeSurrogate.close_workflow.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActionTypeSurrogate.navigate_to.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DestinationSurrogate.values().length];
            try {
                iArr2[DestinationSurrogate.customer_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DestinationSurrogate.privacy_policy.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DestinationSurrogate.terms.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DestinationSurrogate.url.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DestinationSurrogate.sheet.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DestinationSurrogate.unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @c
    public ActionSurrogate(int i3, ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, k0 k0Var) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, ActionSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = actionTypeSurrogate;
        if ((i3 & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = destinationSurrogate;
        }
        if ((i3 & 4) == 0) {
            this.url = null;
        } else {
            this.url = urlSurrogate;
        }
        if ((i3 & 8) == 0) {
            this.sheet = null;
        } else {
            this.sheet = sheet;
        }
    }

    private final ButtonComponent.Destination toDestination() {
        DestinationSurrogate destinationSurrogate = this.destination;
        switch (destinationSurrogate == null ? -1 : WhenMappings.$EnumSwitchMapping$1[destinationSurrogate.ordinal()]) {
            case -1:
                throw new IllegalStateException("`destination` cannot be null when `action` is `navigate_to`.");
            case 0:
            default:
                throw new b();
            case 1:
                return ButtonComponent.Destination.CustomerCenter.INSTANCE;
            case 2:
                if (this.url != null) {
                    return new ButtonComponent.Destination.PrivacyPolicy(this.url.getUrl_lid(), this.url.getMethod(), null);
                }
                throw new IllegalStateException("`url` cannot be null when `destination` is `privacy_policy`.");
            case 3:
                if (this.url != null) {
                    return new ButtonComponent.Destination.Terms(this.url.getUrl_lid(), this.url.getMethod(), null);
                }
                throw new IllegalStateException("`url` cannot be null when `destination` is `terms`.");
            case 4:
                if (this.url != null) {
                    return new ButtonComponent.Destination.Url(this.url.getUrl_lid(), this.url.getMethod(), null);
                }
                throw new IllegalStateException("`url` cannot be null when `destination` is `url`.");
            case 5:
                ButtonComponent.Destination.Sheet sheet = this.sheet;
                return sheet == null ? new ButtonComponent.Destination.Sheet((String) null, (String) null, (StackComponent) null, false, (Size) null, 31, (AbstractC2541f) null) : sheet;
            case 6:
                return ButtonComponent.Destination.Unknown.INSTANCE;
        }
    }

    public static final void write$Self$purchases_defaultsRelease(ActionSurrogate self, p143q8.b output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, ActionTypeSurrogateDeserializer.INSTANCE, self.type);
        if (output.E(serialDesc) || self.destination != null) {
            output.t(serialDesc, 1, DestinationSurrogateDeserializer.INSTANCE, self.destination);
        }
        if (output.E(serialDesc) || self.url != null) {
            output.t(serialDesc, 2, UrlSurrogate$$serializer.INSTANCE, self.url);
        }
        if (!output.E(serialDesc) && self.sheet == null) {
            return;
        }
        output.t(serialDesc, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, self.sheet);
    }

    public final DestinationSurrogate getDestination() {
        return this.destination;
    }

    public final ButtonComponent.Destination.Sheet getSheet() {
        return this.sheet;
    }

    public final ActionTypeSurrogate getType() {
        return this.type;
    }

    public final UrlSurrogate getUrl() {
        return this.url;
    }

    public final ButtonComponent.Action toAction() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                return ButtonComponent.Action.Unknown.INSTANCE;
            case 2:
                return ButtonComponent.Action.RestorePurchases.INSTANCE;
            case 3:
                return ButtonComponent.Action.NavigateBack.INSTANCE;
            case 4:
                return ButtonComponent.Action.WorkflowTrigger.INSTANCE;
            case 5:
                return ButtonComponent.Action.CloseWorkflow.INSTANCE;
            case 6:
                return new ButtonComponent.Action.NavigateTo(toDestination());
            default:
                throw new b();
        }
    }

    public ActionSurrogate(ActionTypeSurrogate type, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet) {
        m.e(type, "type");
        this.type = type;
        this.destination = destinationSurrogate;
        this.url = urlSurrogate;
        this.sheet = sheet;
    }

    public ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, int i3, AbstractC2541f abstractC2541f) {
        this(actionTypeSurrogate, (i3 & 2) != 0 ? null : destinationSurrogate, (i3 & 4) != 0 ? null : urlSurrogate, (i3 & 8) != 0 ? null : sheet);
    }

    public ActionSurrogate(ButtonComponent.Action action) {
        ActionTypeSurrogate actionTypeSurrogate;
        DestinationSurrogate destinationSurrogate;
        UrlSurrogate urlSurrogate;
        m.e(action, "action");
        boolean z6 = action instanceof ButtonComponent.Action.Unknown;
        if (z6) {
            actionTypeSurrogate = ActionTypeSurrogate.unknown;
        } else if (action instanceof ButtonComponent.Action.NavigateBack) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_back;
        } else if (action instanceof ButtonComponent.Action.NavigateTo) {
            actionTypeSurrogate = ActionTypeSurrogate.navigate_to;
        } else if (action instanceof ButtonComponent.Action.RestorePurchases) {
            actionTypeSurrogate = ActionTypeSurrogate.restore_purchases;
        } else if (action instanceof ButtonComponent.Action.WorkflowTrigger) {
            actionTypeSurrogate = ActionTypeSurrogate.workflow;
        } else {
            if (!(action instanceof ButtonComponent.Action.CloseWorkflow)) {
                throw new b();
            }
            actionTypeSurrogate = ActionTypeSurrogate.close_workflow;
        }
        ButtonComponent.Destination.Sheet sheet = 0;
        sheet = 0;
        if (z6 ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases ? true : action instanceof ButtonComponent.Action.WorkflowTrigger ? true : action instanceof ButtonComponent.Action.CloseWorkflow) {
            destinationSurrogate = null;
        } else if (action instanceof ButtonComponent.Action.NavigateTo) {
            ButtonComponent.Destination destination = ((ButtonComponent.Action.NavigateTo) action).getDestination();
            if (destination instanceof ButtonComponent.Destination.CustomerCenter) {
                destinationSurrogate = DestinationSurrogate.customer_center;
            } else if (destination instanceof ButtonComponent.Destination.PrivacyPolicy) {
                destinationSurrogate = DestinationSurrogate.privacy_policy;
            } else if (destination instanceof ButtonComponent.Destination.Terms) {
                destinationSurrogate = DestinationSurrogate.terms;
            } else if (destination instanceof ButtonComponent.Destination.Url) {
                destinationSurrogate = DestinationSurrogate.url;
            } else if (destination instanceof ButtonComponent.Destination.Sheet) {
                destinationSurrogate = DestinationSurrogate.sheet;
            } else {
                if (!(destination instanceof ButtonComponent.Destination.Unknown)) {
                    throw new b();
                }
                destinationSurrogate = DestinationSurrogate.unknown;
            }
        } else {
            throw new b();
        }
        if (z6 ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases ? true : action instanceof ButtonComponent.Action.WorkflowTrigger ? true : action instanceof ButtonComponent.Action.CloseWorkflow) {
            urlSurrogate = null;
        } else if (action instanceof ButtonComponent.Action.NavigateTo) {
            ButtonComponent.Action.NavigateTo navigateTo = (ButtonComponent.Action.NavigateTo) action;
            ButtonComponent.Destination destination2 = navigateTo.getDestination();
            if (destination2 instanceof ButtonComponent.Destination.Unknown ? true : destination2 instanceof ButtonComponent.Destination.CustomerCenter ? true : destination2 instanceof ButtonComponent.Destination.Sheet) {
                urlSurrogate = null;
            } else if (destination2 instanceof ButtonComponent.Destination.PrivacyPolicy) {
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).m186getUrlLidz7Tp4o(), ((ButtonComponent.Destination.PrivacyPolicy) navigateTo.getDestination()).getMethod(), sheet);
            } else if (destination2 instanceof ButtonComponent.Destination.Terms) {
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Terms) navigateTo.getDestination()).m190getUrlLidz7Tp4o(), ((ButtonComponent.Destination.Terms) navigateTo.getDestination()).getMethod(), sheet);
            } else if (destination2 instanceof ButtonComponent.Destination.Url) {
                urlSurrogate = new UrlSurrogate(((ButtonComponent.Destination.Url) navigateTo.getDestination()).m194getUrlLidz7Tp4o(), ((ButtonComponent.Destination.Url) navigateTo.getDestination()).getMethod(), sheet);
            } else {
                throw new b();
            }
        } else {
            throw new b();
        }
        if (!(z6 ? true : action instanceof ButtonComponent.Action.NavigateBack ? true : action instanceof ButtonComponent.Action.RestorePurchases ? true : action instanceof ButtonComponent.Action.WorkflowTrigger ? true : action instanceof ButtonComponent.Action.CloseWorkflow)) {
            if (action instanceof ButtonComponent.Action.NavigateTo) {
                ButtonComponent.Action.NavigateTo navigateTo2 = (ButtonComponent.Action.NavigateTo) action;
                ButtonComponent.Destination destination3 = navigateTo2.getDestination();
                if (!(destination3 instanceof ButtonComponent.Destination.CustomerCenter ? true : destination3 instanceof ButtonComponent.Destination.PrivacyPolicy ? true : destination3 instanceof ButtonComponent.Destination.Terms ? true : destination3 instanceof ButtonComponent.Destination.Unknown ? true : destination3 instanceof ButtonComponent.Destination.Url)) {
                    if (!(destination3 instanceof ButtonComponent.Destination.Sheet)) {
                        throw new b();
                    }
                    sheet = (ButtonComponent.Destination.Sheet) navigateTo2.getDestination();
                }
            } else {
                throw new b();
            }
        }
        this(actionTypeSurrogate, destinationSurrogate, urlSurrogate, sheet);
    }
}
