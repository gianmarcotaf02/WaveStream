package io.ktor.util.debug.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement;", "", "", "pluginName", "handler", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)Lio/ktor/util/debug/plugins/PluginTraceElement;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPluginName", "getHandler", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "getEvent", "PluginEvent", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class PluginTraceElement {
    private final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent event;
    private final java.lang.String handler;
    private final java.lang.String pluginName;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "FINISHED", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum PluginEvent {
        STARTED,
        FINISHED;

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }
    }

    public PluginTraceElement(java.lang.String pluginName, java.lang.String handler, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent event) {
        kotlin.jvm.internal.m.e(pluginName, "pluginName");
        kotlin.jvm.internal.m.e(handler, "handler");
        kotlin.jvm.internal.m.e(event, "event");
        this.pluginName = pluginName;
        this.handler = handler;
        this.event = event;
    }

    public static /* synthetic */ io.ktor.util.debug.plugins.PluginTraceElement copy$default(io.ktor.util.debug.plugins.PluginTraceElement pluginTraceElement, java.lang.String str, java.lang.String str2, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent pluginEvent, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = pluginTraceElement.pluginName;
        }
        if ((i3 & 2) != 0) {
            str2 = pluginTraceElement.handler;
        }
        if ((i3 & 4) != 0) {
            pluginEvent = pluginTraceElement.event;
        }
        return pluginTraceElement.copy(str, str2, pluginEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent getEvent() {
        return this.event;
    }

    public final io.ktor.util.debug.plugins.PluginTraceElement copy(java.lang.String pluginName, java.lang.String handler, io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent event) {
        kotlin.jvm.internal.m.e(pluginName, "pluginName");
        kotlin.jvm.internal.m.e(handler, "handler");
        kotlin.jvm.internal.m.e(event, "event");
        return new io.ktor.util.debug.plugins.PluginTraceElement(pluginName, handler, event);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.debug.plugins.PluginTraceElement)) {
            return false;
        }
        io.ktor.util.debug.plugins.PluginTraceElement pluginTraceElement = (io.ktor.util.debug.plugins.PluginTraceElement) other;
        return kotlin.jvm.internal.m.a(this.pluginName, pluginTraceElement.pluginName) && kotlin.jvm.internal.m.a(this.handler, pluginTraceElement.handler) && this.event == pluginTraceElement.event;
    }

    public final io.ktor.util.debug.plugins.PluginTraceElement.PluginEvent getEvent() {
        return this.event;
    }

    public final java.lang.String getHandler() {
        return this.handler;
    }

    public final java.lang.String getPluginName() {
        return this.pluginName;
    }

    public int hashCode() {
        return this.event.hashCode() + B2.a.a(this.pluginName.hashCode() * 31, 31, this.handler);
    }

    public java.lang.String toString() {
        return "PluginTraceElement(pluginName=" + this.pluginName + ", handler=" + this.handler + ", event=" + this.event + ')';
    }
}
