package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lio/ktor/util/Platform;", "", "<init>", "()V", "Jvm", "Native", "Js", "WasmJs", "JsPlatform", "Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform$Jvm;", "Lio/ktor/util/Platform$Native;", "Lio/ktor/util/Platform$WasmJs;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class Platform {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "component1", "()Lio/ktor/util/Platform$JsPlatform;", "copy", "(Lio/ktor/util/Platform$JsPlatform;)Lio/ktor/util/Platform$Js;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/Platform$JsPlatform;", "getJsPlatform", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Js extends io.ktor.util.Platform {
        private final io.ktor.util.Platform.JsPlatform jsPlatform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Js(io.ktor.util.Platform.JsPlatform jsPlatform) {
            super(null);
            kotlin.jvm.internal.m.e(jsPlatform, "jsPlatform");
            this.jsPlatform = jsPlatform;
        }

        public static /* synthetic */ io.ktor.util.Platform.Js copy$default(io.ktor.util.Platform.Js js, io.ktor.util.Platform.JsPlatform jsPlatform, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                jsPlatform = js.jsPlatform;
            }
            return js.copy(jsPlatform);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public final io.ktor.util.Platform.Js copy(io.ktor.util.Platform.JsPlatform jsPlatform) {
            kotlin.jvm.internal.m.e(jsPlatform, "jsPlatform");
            return new io.ktor.util.Platform.Js(jsPlatform);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.util.Platform.Js) && this.jsPlatform == ((io.ktor.util.Platform.Js) other).jsPlatform;
        }

        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public int hashCode() {
            return this.jsPlatform.hashCode();
        }

        public java.lang.String toString() {
            return "Js(jsPlatform=" + this.jsPlatform + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/Platform$JsPlatform;", "", "<init>", "(Ljava/lang/String;I)V", "Browser", "Node", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum JsPlatform {
        Browser,
        Node;

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/util/Platform$Jvm;", "Lio/ktor/util/Platform;", "<init>", "()V", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Jvm extends io.ktor.util.Platform {
        public static final io.ktor.util.Platform.Jvm INSTANCE = new io.ktor.util.Platform.Jvm();

        private Jvm() {
            super(null);
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.ktor.util.Platform.Jvm);
        }

        public int hashCode() {
            return 1051825272;
        }

        public java.lang.String toString() {
            return "Jvm";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/util/Platform$Native;", "Lio/ktor/util/Platform;", "<init>", "()V", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Native extends io.ktor.util.Platform {
        public static final io.ktor.util.Platform.Native INSTANCE = new io.ktor.util.Platform.Native();

        private Native() {
            super(null);
        }

        public boolean equals(java.lang.Object other) {
            return this == other || (other instanceof io.ktor.util.Platform.Native);
        }

        public int hashCode() {
            return -1059277600;
        }

        public java.lang.String toString() {
            return "Native";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/util/Platform$WasmJs;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "component1", "()Lio/ktor/util/Platform$JsPlatform;", "copy", "(Lio/ktor/util/Platform$JsPlatform;)Lio/ktor/util/Platform$WasmJs;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/Platform$JsPlatform;", "getJsPlatform", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class WasmJs extends io.ktor.util.Platform {
        private final io.ktor.util.Platform.JsPlatform jsPlatform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WasmJs(io.ktor.util.Platform.JsPlatform jsPlatform) {
            super(null);
            kotlin.jvm.internal.m.e(jsPlatform, "jsPlatform");
            this.jsPlatform = jsPlatform;
        }

        public static /* synthetic */ io.ktor.util.Platform.WasmJs copy$default(io.ktor.util.Platform.WasmJs wasmJs, io.ktor.util.Platform.JsPlatform jsPlatform, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                jsPlatform = wasmJs.jsPlatform;
            }
            return wasmJs.copy(jsPlatform);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public final io.ktor.util.Platform.WasmJs copy(io.ktor.util.Platform.JsPlatform jsPlatform) {
            kotlin.jvm.internal.m.e(jsPlatform, "jsPlatform");
            return new io.ktor.util.Platform.WasmJs(jsPlatform);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof io.ktor.util.Platform.WasmJs) && this.jsPlatform == ((io.ktor.util.Platform.WasmJs) other).jsPlatform;
        }

        public final io.ktor.util.Platform.JsPlatform getJsPlatform() {
            return this.jsPlatform;
        }

        public int hashCode() {
            return this.jsPlatform.hashCode();
        }

        public java.lang.String toString() {
            return "WasmJs(jsPlatform=" + this.jsPlatform + ')';
        }
    }

    public /* synthetic */ Platform(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private Platform() {
    }
}
