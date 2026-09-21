package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "appInBackground", "", "(Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Z)V", "getAppInBackground", "()Z", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDiagnosticsTrackerIfEnabled", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "component1", "component2", "component3", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class QueryPurchasesUseCaseParams implements com.revenuecat.purchases.google.usecase.UseCaseParams {
    private final boolean appInBackground;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;

    public QueryPurchasesUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z6;
    }

    public static /* synthetic */ com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams copy$default(com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            dateProvider = queryPurchasesUseCaseParams.dateProvider;
        }
        if ((i3 & 2) != 0) {
            diagnosticsTracker = queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i3 & 4) != 0) {
            z6 = queryPurchasesUseCaseParams.appInBackground;
        }
        return queryPurchasesUseCaseParams.copy(dateProvider, diagnosticsTracker, z6);
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

    public final com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams copy(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled, boolean appInBackground) {
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        return new com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams(dateProvider, diagnosticsTrackerIfEnabled, appInBackground);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams)) {
            return false;
        }
        com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams queryPurchasesUseCaseParams = (com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams) other;
        return kotlin.jvm.internal.m.a(this.dateProvider, queryPurchasesUseCaseParams.dateProvider) && kotlin.jvm.internal.m.a(this.diagnosticsTrackerIfEnabled, queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesUseCaseParams.appInBackground;
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

    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return java.lang.Boolean.hashCode(this.appInBackground) + ((iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QueryPurchasesUseCaseParams(dateProvider=");
        sb.append(this.dateProvider);
        sb.append(", diagnosticsTrackerIfEnabled=");
        sb.append(this.diagnosticsTrackerIfEnabled);
        sb.append(", appInBackground=");
        return v5.L.a(sb, this.appInBackground, ')');
    }

    public /* synthetic */ QueryPurchasesUseCaseParams(com.revenuecat.purchases.common.DateProvider dateProvider, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider, diagnosticsTracker, z6);
    }
}
