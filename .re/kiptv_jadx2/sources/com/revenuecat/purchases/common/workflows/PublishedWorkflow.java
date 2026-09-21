package com.revenuecat.purchases.common.workflows;

import B2.a;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.paywalls.components.common.ExitOffer;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p078i6.x;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.F;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0097\u0001\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0088\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÁ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\u0016R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001aR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010\u001aR,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b=\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00101\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\u0016R\u001c\u0010D\u001a\u0004\u0018\u00010@8FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u00105\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "", "", "id", "displayName", "initialStepId", "", "Lcom/revenuecat/purchases/common/workflows/WorkflowStep;", "steps", "Lcom/revenuecat/purchases/common/workflows/WorkflowScreen;", "screens", TtmlNode.TAG_METADATA, "hash", "singleStepFallbackId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getDisplayName", "getDisplayName$annotations", "()V", "getInitialStepId", "getInitialStepId$annotations", "Ljava/util/Map;", "getSteps", "getScreens", "getMetadata", "getMetadata$annotations", "getHash", "getSingleStepFallbackId", "getSingleStepFallbackId$annotations", "Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "getDismissExitOffer", "()Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "getDismissExitOffer$annotations", "dismissExitOffer", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PublishedWorkflow {
    private static final KSerializer[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final String displayName;
    private final String hash;
    private final String id;
    private final String initialStepId;
    private final Map<String, Object> metadata;
    private final Map<String, WorkflowScreen> screens;
    private final String singleStepFallbackId;
    private final Map<String, WorkflowStep> steps;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return PublishedWorkflow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        p0 p0Var = p0.f26988a;
        $childSerializers = new KSerializer[]{null, null, null, new F(p0Var, WorkflowStep$$serializer.INSTANCE, 1), new F(p0Var, WorkflowScreen$$serializer.INSTANCE, 1), null, null, null};
    }

    @c
    public PublishedWorkflow(int i3, String str, @h("display_name") String str2, @h("initial_step_id") String str3, Map map, Map map2, @i(with = JsonObjectToMapSerializer.class) Map map3, String str4, @h("single_step_fallback_id") String str5, k0 k0Var) {
        if (31 != (i3 & 31)) {
            AbstractC2686a0.l(i3, 31, PublishedWorkflow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.displayName = str2;
        this.initialStepId = str3;
        this.steps = map;
        this.screens = map2;
        if ((i3 & 32) == 0) {
            this.metadata = x.f23206h;
        } else {
            this.metadata = map3;
        }
        if ((i3 & 64) == 0) {
            this.hash = null;
        } else {
            this.hash = str4;
        }
        if ((i3 & 128) == 0) {
            this.singleStepFallbackId = null;
        } else {
            this.singleStepFallbackId = str5;
        }
    }

    public static PublishedWorkflow copy$default(PublishedWorkflow publishedWorkflow, String str, String str2, String str3, Map map, Map map2, Map map3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = publishedWorkflow.id;
        }
        if ((i3 & 2) != 0) {
            str2 = publishedWorkflow.displayName;
        }
        if ((i3 & 4) != 0) {
            str3 = publishedWorkflow.initialStepId;
        }
        if ((i3 & 8) != 0) {
            map = publishedWorkflow.steps;
        }
        if ((i3 & 16) != 0) {
            map2 = publishedWorkflow.screens;
        }
        if ((i3 & 32) != 0) {
            map3 = publishedWorkflow.metadata;
        }
        if ((i3 & 64) != 0) {
            str4 = publishedWorkflow.hash;
        }
        if ((i3 & 128) != 0) {
            str5 = publishedWorkflow.singleStepFallbackId;
        }
        String str6 = str4;
        String str7 = str5;
        Map map4 = map2;
        Map map5 = map3;
        return publishedWorkflow.copy(str, str2, str3, map, map4, map5, str6, str7);
    }

    public static void getDismissExitOffer$annotations() {
    }

    @h("display_name")
    public static void getDisplayName$annotations() {
    }

    @h("initial_step_id")
    public static void getInitialStepId$annotations() {
    }

    @i(with = JsonObjectToMapSerializer.class)
    public static void getMetadata$annotations() {
    }

    @h("single_step_fallback_id")
    public static void getSingleStepFallbackId$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(PublishedWorkflow self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.id);
        output.s(serialDesc, 1, self.displayName);
        output.s(serialDesc, 2, self.initialStepId);
        output.h(serialDesc, 3, kSerializerArr[3], self.steps);
        output.h(serialDesc, 4, kSerializerArr[4], self.screens);
        if (output.E(serialDesc) || !m.a(self.metadata, x.f23206h)) {
            output.h(serialDesc, 5, JsonObjectToMapSerializer.INSTANCE, self.metadata);
        }
        if (output.E(serialDesc) || self.hash != null) {
            output.t(serialDesc, 6, p0.f26988a, self.hash);
        }
        if (!output.E(serialDesc) && self.singleStepFallbackId == null) {
            return;
        }
        output.t(serialDesc, 7, p0.f26988a, self.singleStepFallbackId);
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getInitialStepId() {
        return this.initialStepId;
    }

    public final Map<String, WorkflowStep> component4() {
        return this.steps;
    }

    public final Map<String, WorkflowScreen> component5() {
        return this.screens;
    }

    public final Map<String, Object> component6() {
        return this.metadata;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getSingleStepFallbackId() {
        return this.singleStepFallbackId;
    }

    public final PublishedWorkflow copy(String id, String displayName, String initialStepId, Map<String, WorkflowStep> steps, Map<String, WorkflowScreen> screens, Map<String, ? extends Object> metadata, String hash, String singleStepFallbackId) {
        m.e(id, "id");
        m.e(displayName, "displayName");
        m.e(initialStepId, "initialStepId");
        m.e(steps, "steps");
        m.e(screens, "screens");
        m.e(metadata, "metadata");
        return new PublishedWorkflow(id, displayName, initialStepId, steps, screens, metadata, hash, singleStepFallbackId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishedWorkflow)) {
            return false;
        }
        PublishedWorkflow publishedWorkflow = (PublishedWorkflow) other;
        return m.a(this.id, publishedWorkflow.id) && m.a(this.displayName, publishedWorkflow.displayName) && m.a(this.initialStepId, publishedWorkflow.initialStepId) && m.a(this.steps, publishedWorkflow.steps) && m.a(this.screens, publishedWorkflow.screens) && m.a(this.metadata, publishedWorkflow.metadata) && m.a(this.hash, publishedWorkflow.hash) && m.a(this.singleStepFallbackId, publishedWorkflow.singleStepFallbackId);
    }

    public final WorkflowExitOffer getDismissExitOffer() {
        WorkflowStep workflowStep;
        String screenId;
        WorkflowScreen workflowScreen;
        ExitOffers exitOffers;
        ExitOffer dismiss;
        String offeringId;
        String str = this.singleStepFallbackId;
        if (str == null || (workflowStep = this.steps.get(str)) == null || (screenId = workflowStep.getScreenId()) == null || (workflowScreen = this.screens.get(screenId)) == null || (exitOffers = workflowScreen.getExitOffers()) == null || (dismiss = exitOffers.getDismiss()) == null || (offeringId = dismiss.getOfferingId()) == null) {
            return null;
        }
        return new WorkflowExitOffer(offeringId, workflowStep.getId());
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInitialStepId() {
        return this.initialStepId;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final Map<String, WorkflowScreen> getScreens() {
        return this.screens;
    }

    public final String getSingleStepFallbackId() {
        return this.singleStepFallbackId;
    }

    public final Map<String, WorkflowStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int iC = a.c(a.c(a.c(a.a(a.a(this.id.hashCode() * 31, 31, this.displayName), 31, this.initialStepId), 31, this.steps), 31, this.screens), 31, this.metadata);
        String str = this.hash;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.singleStepFallbackId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublishedWorkflow(id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", initialStepId=");
        sb.append(this.initialStepId);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", screens=");
        sb.append(this.screens);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", singleStepFallbackId=");
        return f.l(sb, this.singleStepFallbackId, ')');
    }

    public PublishedWorkflow(String id, String displayName, String initialStepId, Map<String, WorkflowStep> steps, Map<String, WorkflowScreen> screens, Map<String, ? extends Object> metadata, String str, String str2) {
        m.e(id, "id");
        m.e(displayName, "displayName");
        m.e(initialStepId, "initialStepId");
        m.e(steps, "steps");
        m.e(screens, "screens");
        m.e(metadata, "metadata");
        this.id = id;
        this.displayName = displayName;
        this.initialStepId = initialStepId;
        this.steps = steps;
        this.screens = screens;
        this.metadata = metadata;
        this.hash = str;
        this.singleStepFallbackId = str2;
    }

    public PublishedWorkflow(String str, String str2, String str3, Map map, Map map2, Map map3, String str4, String str5, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, map, map2, (i3 & 32) != 0 ? x.f23206h : map3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5);
    }
}
