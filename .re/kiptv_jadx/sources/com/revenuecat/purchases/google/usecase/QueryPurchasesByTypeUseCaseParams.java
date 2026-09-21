package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesByTypeUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "appInBackground", "", "productType", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;ZLjava/lang/String;)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "getProductType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class QueryPurchasesByTypeUseCaseParams implements com.revenuecat.purchases.google.usecase.UseCaseParams {
    private final boolean appInBackground;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final java.lang.String productType;

    public QueryPurchasesByTypeUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, java.lang.String productType) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(productType, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z6;
        this.productType = productType;
    }

    public static /* synthetic */ com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams copy$default(com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            dateProvider = queryPurchasesByTypeUseCaseParams.dateProvider;
        }
        if ((i3 & 2) != 0) {
            diagnosticsTracker = queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i3 & 4) != 0) {
            z6 = queryPurchasesByTypeUseCaseParams.appInBackground;
        }
        if ((i3 & 8) != 0) {
            str = queryPurchasesByTypeUseCaseParams.productType;
        }
        return queryPurchasesByTypeUseCaseParams.copy(dateProvider, diagnosticsTracker, z6, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getProductType() {
        return this.productType;
    }

    public final com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams copy(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled, boolean appInBackground, java.lang.String productType) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(productType, "productType");
        return new com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams(dateProvider, diagnosticsTrackerIfEnabled, appInBackground, productType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams)) {
            return false;
        }
        com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams = (com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams) other;
        return kotlin.jvm.internal.m.a(this.dateProvider, queryPurchasesByTypeUseCaseParams.dateProvider) && kotlin.jvm.internal.m.a(this.diagnosticsTrackerIfEnabled, queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesByTypeUseCaseParams.appInBackground && kotlin.jvm.internal.m.a(this.productType, queryPurchasesByTypeUseCaseParams.productType);
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

    public final java.lang.String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return this.productType.hashCode() + p121o0.p.f((iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31, 31, this.appInBackground);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QueryPurchasesByTypeUseCaseParams(dateProvider=");
        sb.append(this.dateProvider);
        sb.append(", diagnosticsTrackerIfEnabled=");
        sb.append(this.diagnosticsTrackerIfEnabled);
        sb.append(", appInBackground=");
        sb.append(this.appInBackground);
        sb.append(", productType=");
        return Y6.f.l(sb, this.productType, ')');
    }

    public /* synthetic */ QueryPurchasesByTypeUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider, diagnosticsTracker, z6, str);
    }
}
