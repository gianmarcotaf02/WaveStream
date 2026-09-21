package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Attachment {
    private static final java.lang.String DEFAULT_ATTACHMENT_TYPE = "event.attachment";
    private static final java.lang.String VIEW_HIERARCHY_ATTACHMENT_TYPE = "event.view_hierarchy";
    private final boolean addToTransactions;
    private java.lang.String attachmentType;
    private byte[] bytes;
    private final java.lang.String contentType;
    private final java.lang.String filename;
    private java.lang.String pathname;
    private final io.sentry.JsonSerializable serializable;

    public Attachment(byte[] bArr, java.lang.String str) {
        this(bArr, str, (java.lang.String) null);
    }

    public static io.sentry.Attachment fromScreenshot(byte[] bArr) {
        return new io.sentry.Attachment(bArr, "screenshot.png", androidx.media3.common.MimeTypes.IMAGE_PNG, false);
    }

    public static io.sentry.Attachment fromThreadDump(byte[] bArr) {
        return new io.sentry.Attachment(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static io.sentry.Attachment fromViewHierarchy(io.sentry.protocol.ViewHierarchy viewHierarchy) {
        return new io.sentry.Attachment((io.sentry.JsonSerializable) viewHierarchy, "view-hierarchy.json", "application/json", VIEW_HIERARCHY_ATTACHMENT_TYPE, false);
    }

    public java.lang.String getAttachmentType() {
        return this.attachmentType;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public java.lang.String getContentType() {
        return this.contentType;
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public java.lang.String getPathname() {
        return this.pathname;
    }

    public io.sentry.JsonSerializable getSerializable() {
        return this.serializable;
    }

    public boolean isAddToTransactions() {
        return this.addToTransactions;
    }

    public Attachment(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this(bArr, str, str2, false);
    }

    public Attachment(byte[] bArr, java.lang.String str, java.lang.String str2, boolean z6) {
        this(bArr, str, str2, DEFAULT_ATTACHMENT_TYPE, z6);
    }

    public Attachment(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        this.bytes = bArr;
        this.serializable = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z6;
    }

    public Attachment(io.sentry.JsonSerializable jsonSerializable, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        this.bytes = null;
        this.serializable = jsonSerializable;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z6;
    }

    public Attachment(java.lang.String str) {
        this(str, new java.io.File(str).getName());
    }

    public Attachment(java.lang.String str, java.lang.String str2) {
        this(str, str2, (java.lang.String) null);
    }

    public Attachment(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, DEFAULT_ATTACHMENT_TYPE, false);
    }

    public Attachment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z6) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.contentType = str3;
        this.attachmentType = str4;
        this.addToTransactions = z6;
    }

    public Attachment(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        this.attachmentType = DEFAULT_ATTACHMENT_TYPE;
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.contentType = str3;
        this.addToTransactions = z6;
    }

    public Attachment(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, java.lang.String str4) {
        this.pathname = str;
        this.filename = str2;
        this.serializable = null;
        this.contentType = str3;
        this.addToTransactions = z6;
        this.attachmentType = str4;
    }
}
