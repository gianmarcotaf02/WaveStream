package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "productIds", "", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Ljava/util/Set;Lcom/revenuecat/purchases/ProductType;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "getProductIds", "()Ljava/util/Set;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class QueryProductDetailsUseCaseParams implements com.revenuecat.purchases.google.usecase.UseCaseParams {
    private final boolean appInBackground;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final java.util.Set<java.lang.String> productIds;
    private final com.revenuecat.purchases.ProductType productType;

    public QueryProductDetailsUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, java.util.Set<java.lang.String> productIds, com.revenuecat.purchases.ProductType productType, boolean z6) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(productType, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productIds = productIds;
        this.productType = productType;
        this.appInBackground = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams copy$default(com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, java.util.Set set, com.revenuecat.purchases.ProductType productType, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            dateProvider = queryProductDetailsUseCaseParams.dateProvider;
        }
        if ((i3 & 2) != 0) {
            diagnosticsTracker = queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i3 & 4) != 0) {
            set = queryProductDetailsUseCaseParams.productIds;
        }
        if ((i3 & 8) != 0) {
            productType = queryProductDetailsUseCaseParams.productType;
        }
        if ((i3 & 16) != 0) {
            z6 = queryProductDetailsUseCaseParams.appInBackground;
        }
        boolean z9 = z6;
        java.util.Set set2 = set;
        return queryProductDetailsUseCaseParams.copy(dateProvider, diagnosticsTracker, set2, productType, z9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final java.util.Set<java.lang.String> component3() {
        return this.productIds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.ProductType getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams copy(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled, java.util.Set<java.lang.String> productIds, com.revenuecat.purchases.ProductType productType, boolean appInBackground) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(productType, "productType");
        return new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams(dateProvider, diagnosticsTrackerIfEnabled, productIds, productType, appInBackground);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams)) {
            return false;
        }
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams) other;
        return kotlin.jvm.internal.m.a(this.dateProvider, queryProductDetailsUseCaseParams.dateProvider) && kotlin.jvm.internal.m.a(this.diagnosticsTrackerIfEnabled, queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled) && kotlin.jvm.internal.m.a(this.productIds, queryProductDetailsUseCaseParams.productIds) && this.productType == queryProductDetailsUseCaseParams.productType && this.appInBackground == queryProductDetailsUseCaseParams.appInBackground;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final java.util.Set<java.lang.String> getProductIds() {
        return this.productIds;
    }

    public final com.revenuecat.purchases.ProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return java.lang.Boolean.hashCode(this.appInBackground) + ((this.productType.hashCode() + p121o0.p.g(this.productIds, (iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31, 31)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QueryProductDetailsUseCaseParams(dateProvider=");
        sb.append(this.dateProvider);
        sb.append(", diagnosticsTrackerIfEnabled=");
        sb.append(this.diagnosticsTrackerIfEnabled);
        sb.append(", productIds=");
        sb.append(this.productIds);
        sb.append(", productType=");
        sb.append(this.productType);
        sb.append(", appInBackground=");
        return v5.L.a(sb, this.appInBackground, ')');
    }

    public /* synthetic */ QueryProductDetailsUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, java.util.Set set, com.revenuecat.purchases.ProductType productType, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider, diagnosticsTracker, set, productType, z6);
    }
}
