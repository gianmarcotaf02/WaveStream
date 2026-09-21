package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    Transaction("transaction"),
    Replay("replay"),
    Span(androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final java.lang.String category;

    DataCategory(java.lang.String str) {
        this.category = str;
    }

    public java.lang.String getCategory() {
        return this.category;
    }
}
