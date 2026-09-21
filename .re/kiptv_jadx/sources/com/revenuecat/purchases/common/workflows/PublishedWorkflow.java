package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0097\u0001\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0088\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÁ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\u0016R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001aR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010\u001aR,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b=\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00101\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\u0016R\u001c\u0010D\u001a\u0004\u0018\u00010@8FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u00105\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "", "", "id", "displayName", "initialStepId", "", "Lcom/revenuecat/purchases/common/workflows/WorkflowStep;", "steps", "Lcom/revenuecat/purchases/common/workflows/WorkflowScreen;", "screens", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "hash", "singleStepFallbackId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getDisplayName", "getDisplayName$annotations", "()V", "getInitialStepId", "getInitialStepId$annotations", "Ljava/util/Map;", "getSteps", "getScreens", "getMetadata", "getMetadata$annotations", "getHash", "getSingleStepFallbackId", "getSingleStepFallbackId$annotations", "Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "getDismissExitOffer", "()Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "getDismissExitOffer$annotations", "dismissExitOffer", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PublishedWorkflow {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.workflows.PublishedWorkflow.Companion INSTANCE = new com.revenuecat.purchases.common.workflows.PublishedWorkflow.Companion(null);
    private final java.lang.String displayName;
    private final java.lang.String hash;
    private final java.lang.String id;
    private final java.lang.String initialStepId;
    private final java.util.Map<java.lang.String, java.lang.Object> metadata;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowScreen> screens;
    private final java.lang.String singleStepFallbackId;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowStep> steps;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.workflows.PublishedWorkflow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, null, null, new p153r8.F(p0Var, com.revenuecat.purchases.common.workflows.WorkflowStep$$serializer.INSTANCE, 1), new p153r8.F(p0Var, com.revenuecat.purchases.common.workflows.WorkflowScreen$$serializer.INSTANCE, 1), null, null, null};
    }

    @p070h6.c
    public /* synthetic */ PublishedWorkflow(int i3, java.lang.String str, @p119n8.h("display_name") java.lang.String str2, @p119n8.h("initial_step_id") java.lang.String str3, java.util.Map map, java.util.Map map2, @p119n8.i(with = com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer.class) java.util.Map map3, java.lang.String str4, @p119n8.h("single_step_fallback_id") java.lang.String str5, p153r8.k0 k0Var) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.revenuecat.purchases.common.workflows.PublishedWorkflow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.displayName = str2;
        this.initialStepId = str3;
        this.steps = map;
        this.screens = map2;
        if ((i3 & 32) == 0) {
            this.metadata = p078i6.x.f23206h;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.workflows.PublishedWorkflow copy$default(com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.Map map2, java.util.Map map3, java.lang.String str4, java.lang.String str5, int i3, java.lang.Object obj) {
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
        java.lang.String str6 = str4;
        java.lang.String str7 = str5;
        java.util.Map map4 = map2;
        java.util.Map map5 = map3;
        return publishedWorkflow.copy(str, str2, str3, map, map4, map5, str6, str7);
    }

    public static /* synthetic */ void getDismissExitOffer$annotations() {
    }

    @p119n8.h("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @p119n8.h("initial_step_id")
    public static /* synthetic */ void getInitialStepId$annotations() {
    }

    @p119n8.i(with = com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer.class)
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @p119n8.h("single_step_fallback_id")
    public static /* synthetic */ void getSingleStepFallbackId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.workflows.PublishedWorkflow self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.id);
        output.s(serialDesc, 1, self.displayName);
        output.s(serialDesc, 2, self.initialStepId);
        output.h(serialDesc, 3, kSerializerArr[3], self.steps);
        output.h(serialDesc, 4, kSerializerArr[4], self.screens);
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.metadata, p078i6.x.f23206h)) {
            output.h(serialDesc, 5, com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer.INSTANCE, self.metadata);
        }
        if (output.E(serialDesc) || self.hash != null) {
            output.t(serialDesc, 6, p153r8.p0.f26988a, self.hash);
        }
        if (!output.E(serialDesc) && self.singleStepFallbackId == null) {
            return;
        }
        output.t(serialDesc, 7, p153r8.p0.f26988a, self.singleStepFallbackId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getInitialStepId() {
        return this.initialStepId;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowStep> component4() {
        return this.steps;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowScreen> component5() {
        return this.screens;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component6() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getHash() {
        return this.hash;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getSingleStepFallbackId() {
        return this.singleStepFallbackId;
    }

    public final com.revenuecat.purchases.common.workflows.PublishedWorkflow copy(java.lang.String id, java.lang.String displayName, java.lang.String initialStepId, java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowStep> steps, java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowScreen> screens, java.util.Map<java.lang.String, ? extends java.lang.Object> metadata, java.lang.String hash, java.lang.String singleStepFallbackId) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(displayName, "displayName");
        kotlin.jvm.internal.m.e(initialStepId, "initialStepId");
        kotlin.jvm.internal.m.e(steps, "steps");
        kotlin.jvm.internal.m.e(screens, "screens");
        kotlin.jvm.internal.m.e(metadata, "metadata");
        return new com.revenuecat.purchases.common.workflows.PublishedWorkflow(id, displayName, initialStepId, steps, screens, metadata, hash, singleStepFallbackId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.workflows.PublishedWorkflow)) {
            return false;
        }
        com.revenuecat.purchases.common.workflows.PublishedWorkflow publishedWorkflow = (com.revenuecat.purchases.common.workflows.PublishedWorkflow) other;
        return kotlin.jvm.internal.m.a(this.id, publishedWorkflow.id) && kotlin.jvm.internal.m.a(this.displayName, publishedWorkflow.displayName) && kotlin.jvm.internal.m.a(this.initialStepId, publishedWorkflow.initialStepId) && kotlin.jvm.internal.m.a(this.steps, publishedWorkflow.steps) && kotlin.jvm.internal.m.a(this.screens, publishedWorkflow.screens) && kotlin.jvm.internal.m.a(this.metadata, publishedWorkflow.metadata) && kotlin.jvm.internal.m.a(this.hash, publishedWorkflow.hash) && kotlin.jvm.internal.m.a(this.singleStepFallbackId, publishedWorkflow.singleStepFallbackId);
    }

    public final com.revenuecat.purchases.common.workflows.WorkflowExitOffer getDismissExitOffer() {
        com.revenuecat.purchases.common.workflows.WorkflowStep workflowStep;
        java.lang.String screenId;
        com.revenuecat.purchases.common.workflows.WorkflowScreen workflowScreen;
        com.revenuecat.purchases.paywalls.components.common.ExitOffers exitOffers;
        com.revenuecat.purchases.paywalls.components.common.ExitOffer dismiss;
        java.lang.String offeringId;
        java.lang.String str = this.singleStepFallbackId;
        if (str == null || (workflowStep = this.steps.get(str)) == null || (screenId = workflowStep.getScreenId()) == null || (workflowScreen = this.screens.get(screenId)) == null || (exitOffers = workflowScreen.getExitOffers()) == null || (dismiss = exitOffers.getDismiss()) == null || (offeringId = dismiss.getOfferingId()) == null) {
            return null;
        }
        return new com.revenuecat.purchases.common.workflows.WorkflowExitOffer(offeringId, workflowStep.getId());
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getHash() {
        return this.hash;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getInitialStepId() {
        return this.initialStepId;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return this.metadata;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowScreen> getScreens() {
        return this.screens;
    }

    public final java.lang.String getSingleStepFallbackId() {
        return this.singleStepFallbackId;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int iC = B2.a.c(B2.a.c(B2.a.c(B2.a.a(B2.a.a(this.id.hashCode() * 31, 31, this.displayName), 31, this.initialStepId), 31, this.steps), 31, this.screens), 31, this.metadata);
        java.lang.String str = this.hash;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.singleStepFallbackId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PublishedWorkflow(id=");
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
        return Y6.f.l(sb, this.singleStepFallbackId, ')');
    }

    public PublishedWorkflow(java.lang.String id, java.lang.String displayName, java.lang.String initialStepId, java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowStep> steps, java.util.Map<java.lang.String, com.revenuecat.purchases.common.workflows.WorkflowScreen> screens, java.util.Map<java.lang.String, ? extends java.lang.Object> metadata, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(displayName, "displayName");
        kotlin.jvm.internal.m.e(initialStepId, "initialStepId");
        kotlin.jvm.internal.m.e(steps, "steps");
        kotlin.jvm.internal.m.e(screens, "screens");
        kotlin.jvm.internal.m.e(metadata, "metadata");
        this.id = id;
        this.displayName = displayName;
        this.initialStepId = initialStepId;
        this.steps = steps;
        this.screens = screens;
        this.metadata = metadata;
        this.hash = str;
        this.singleStepFallbackId = str2;
    }

    public /* synthetic */ PublishedWorkflow(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.Map map2, java.util.Map map3, java.lang.String str4, java.lang.String str5, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, map, map2, (i3 & 32) != 0 ? p078i6.x.f23206h : map3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5);
    }
}
