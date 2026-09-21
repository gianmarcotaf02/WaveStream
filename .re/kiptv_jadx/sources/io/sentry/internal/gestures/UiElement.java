package io.sentry.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public final class UiElement {
    final java.lang.String className;
    final java.lang.String origin;
    final java.lang.String resourceName;
    final java.lang.String tag;
    final java.lang.ref.WeakReference<java.lang.Object> viewRef;

    public enum Type {
        CLICKABLE,
        SCROLLABLE
    }

    public UiElement(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.viewRef = new java.lang.ref.WeakReference<>(obj);
        this.className = str;
        this.resourceName = str2;
        this.tag = str3;
        this.origin = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.internal.gestures.UiElement.class == obj.getClass()) {
            io.sentry.internal.gestures.UiElement uiElement = (io.sentry.internal.gestures.UiElement) obj;
            if (io.sentry.util.Objects.equals(this.className, uiElement.className) && io.sentry.util.Objects.equals(this.resourceName, uiElement.resourceName) && io.sentry.util.Objects.equals(this.tag, uiElement.tag)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getClassName() {
        return this.className;
    }

    public java.lang.String getIdentifier() {
        java.lang.String str = this.resourceName;
        return str != null ? str : (java.lang.String) io.sentry.util.Objects.requireNonNull(this.tag, "UiElement.tag can't be null");
    }

    public java.lang.String getOrigin() {
        return this.origin;
    }

    public java.lang.String getResourceName() {
        return this.resourceName;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public java.lang.Object getView() {
        return this.viewRef.get();
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.viewRef, this.resourceName, this.tag);
    }
}
