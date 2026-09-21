package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
final class ClientReportKey {
    private final java.lang.String category;
    private final java.lang.String reason;

    public ClientReportKey(java.lang.String str, java.lang.String str2) {
        this.reason = str;
        this.category = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.sentry.clientreport.ClientReportKey)) {
            return false;
        }
        io.sentry.clientreport.ClientReportKey clientReportKey = (io.sentry.clientreport.ClientReportKey) obj;
        return io.sentry.util.Objects.equals(getReason(), clientReportKey.getReason()) && io.sentry.util.Objects.equals(getCategory(), clientReportKey.getCategory());
    }

    public java.lang.String getCategory() {
        return this.category;
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(getReason(), getCategory());
    }
}
