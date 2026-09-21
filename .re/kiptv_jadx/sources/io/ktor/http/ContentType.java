package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 $2\u00020\u0001:\t$%&'()*+,B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"¨\u0006-"}, d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", "", "contentType", "contentSubtype", "existingContent", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "name", "value", "withParameter", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/ContentType;", "", "hasParameter", "(Ljava/lang/String;Ljava/lang/String;)Z", "withoutParameters", "()Lio/ktor/http/ContentType;", "pattern", "match", "(Lio/ktor/http/ContentType;)Z", "(Ljava/lang/String;)Z", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "getContentSubtype", "Companion", "Application", "Audio", "Image", "Message", "MultiPart", "Text", "Video", "Font", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentType extends io.ktor.http.HeaderValueWithParameters {
    private final java.lang.String contentSubtype;
    private final java.lang.String contentType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.ContentType.Companion INSTANCE = new io.ktor.http.ContentType.Companion(null);
    private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("*", "*", null, 4, null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011R\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010\u0011R\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b-\u0010\u0011R\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0017\u00104\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011R\u0017\u00108\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0011R\u0017\u0010:\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b;\u0010\u0011R\u0017\u0010<\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b=\u0010\u0011¨\u0006>"}, d2 = {"Lio/ktor/http/ContentType$Application;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "Json", "getJson", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "OctetStream", "getOctetStream", "Rss", "getRss", "Soap", "getSoap", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Yaml", "getYaml", "Zip", "getZip", "GZip", "getGZip", "FormUrlEncoded", "getFormUrlEncoded", "Pdf", "getPdf", "Xlsx", "getXlsx", "Docx", "getDocx", "Pptx", "getPptx", "ProtoBuf", "getProtoBuf", "Wasm", "getWasm", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Application {
        private static final io.ktor.http.ContentType JavaScript;
        private static final io.ktor.http.ContentType ProtoBuf;
        public static final java.lang.String TYPE = "application";
        private static final io.ktor.http.ContentType Zip;
        public static final io.ktor.http.ContentType.Application INSTANCE = new io.ktor.http.ContentType.Application();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("application", "*", null, 4, null);
        private static final io.ktor.http.ContentType Atom = new io.ktor.http.ContentType("application", "atom+xml", null, 4, null);
        private static final io.ktor.http.ContentType Cbor = new io.ktor.http.ContentType("application", "cbor", null, 4, null);
        private static final io.ktor.http.ContentType Json = new io.ktor.http.ContentType("application", "json", null, 4, null);
        private static final io.ktor.http.ContentType HalJson = new io.ktor.http.ContentType("application", "hal+json", null, 4, null);
        private static final io.ktor.http.ContentType OctetStream = new io.ktor.http.ContentType("application", "octet-stream", null, 4, null);
        private static final io.ktor.http.ContentType Rss = new io.ktor.http.ContentType("application", "rss+xml", null, 4, null);
        private static final io.ktor.http.ContentType Soap = new io.ktor.http.ContentType("application", "soap+xml", null, 4, null);
        private static final io.ktor.http.ContentType Xml = new io.ktor.http.ContentType("application", "xml", null, 4, null);
        private static final io.ktor.http.ContentType Xml_Dtd = new io.ktor.http.ContentType("application", "xml-dtd", null, 4, 0 == true ? 1 : 0);
        private static final io.ktor.http.ContentType Yaml = new io.ktor.http.ContentType("application", "yaml", null, 4, null);
        private static final io.ktor.http.ContentType GZip = new io.ktor.http.ContentType("application", com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING, null, 4, null);
        private static final io.ktor.http.ContentType FormUrlEncoded = new io.ktor.http.ContentType("application", "x-www-form-urlencoded", null, 4, null);
        private static final io.ktor.http.ContentType Pdf = new io.ktor.http.ContentType("application", "pdf", null, 4, null);
        private static final io.ktor.http.ContentType Xlsx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
        private static final io.ktor.http.ContentType Docx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, 0 == true ? 1 : 0);
        private static final io.ktor.http.ContentType Pptx = new io.ktor.http.ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
        private static final io.ktor.http.ContentType Wasm = new io.ktor.http.ContentType("application", "wasm", null, 4, null);
        private static final io.ktor.http.ContentType ProblemJson = new io.ktor.http.ContentType("application", "problem+json", null, 4, null);
        private static final io.ktor.http.ContentType ProblemXml = new io.ktor.http.ContentType("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            kotlin.jvm.internal.AbstractC2541f abstractC2541f = null;
            JavaScript = new io.ktor.http.ContentType("application", "javascript", null, 4, abstractC2541f);
            Zip = new io.ktor.http.ContentType("application", "zip", null, 4, abstractC2541f);
            ProtoBuf = new io.ktor.http.ContentType("application", "protobuf", null, 4, abstractC2541f);
        }

        private Application() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "application/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getAtom() {
            return Atom;
        }

        public final io.ktor.http.ContentType getCbor() {
            return Cbor;
        }

        public final io.ktor.http.ContentType getDocx() {
            return Docx;
        }

        public final io.ktor.http.ContentType getFormUrlEncoded() {
            return FormUrlEncoded;
        }

        public final io.ktor.http.ContentType getGZip() {
            return GZip;
        }

        public final io.ktor.http.ContentType getHalJson() {
            return HalJson;
        }

        public final io.ktor.http.ContentType getJavaScript() {
            return JavaScript;
        }

        public final io.ktor.http.ContentType getJson() {
            return Json;
        }

        public final io.ktor.http.ContentType getOctetStream() {
            return OctetStream;
        }

        public final io.ktor.http.ContentType getPdf() {
            return Pdf;
        }

        public final io.ktor.http.ContentType getPptx() {
            return Pptx;
        }

        public final io.ktor.http.ContentType getProblemJson() {
            return ProblemJson;
        }

        public final io.ktor.http.ContentType getProblemXml() {
            return ProblemXml;
        }

        public final io.ktor.http.ContentType getProtoBuf() {
            return ProtoBuf;
        }

        public final io.ktor.http.ContentType getRss() {
            return Rss;
        }

        public final io.ktor.http.ContentType getSoap() {
            return Soap;
        }

        public final io.ktor.http.ContentType getWasm() {
            return Wasm;
        }

        public final io.ktor.http.ContentType getXlsx() {
            return Xlsx;
        }

        public final io.ktor.http.ContentType getXml() {
            return Xml;
        }

        public final io.ktor.http.ContentType getXml_Dtd() {
            return Xml_Dtd;
        }

        public final io.ktor.http.ContentType getYaml() {
            return Yaml;
        }

        public final io.ktor.http.ContentType getZip() {
            return Zip;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lio/ktor/http/ContentType$Audio;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Audio {
        public static final java.lang.String TYPE = "audio";
        public static final io.ktor.http.ContentType.Audio INSTANCE = new io.ktor.http.ContentType.Audio();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("audio", "*", null, 4, null);
        private static final io.ktor.http.ContentType MP4 = new io.ktor.http.ContentType("audio", io.sentry.rrweb.RRWebVideoEvent.REPLAY_CONTAINER, null, 4, null);
        private static final io.ktor.http.ContentType MPEG = new io.ktor.http.ContentType("audio", "mpeg", null, 4, null);
        private static final io.ktor.http.ContentType OGG = new io.ktor.http.ContentType("audio", "ogg", null, 4, null);

        private Audio() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "audio/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getMP4() {
            return MP4;
        }

        public final io.ktor.http.ContentType getMPEG() {
            return MPEG;
        }

        public final io.ktor.http.ContentType getOGG() {
            return OGG;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "<init>", "()V", "", "value", "Lio/ktor/http/ContentType;", "parse", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.http.ContentType getAny() {
            return io.ktor.http.ContentType.Any;
        }

        public final io.ktor.http.ContentType parse(java.lang.String value) throws io.ktor.http.BadContentTypeFormatException {
            kotlin.jvm.internal.m.e(value, "value");
            if (O7.q.N0(value)) {
                return getAny();
            }
            io.ktor.http.HeaderValueWithParameters.Companion companion = io.ktor.http.HeaderValueWithParameters.INSTANCE;
            io.ktor.http.HeaderValue headerValue = (io.ktor.http.HeaderValue) p078i6.o.q1(io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(value));
            java.lang.String value2 = headerValue.getValue();
            java.util.List<io.ktor.http.HeaderValueParam> params = headerValue.getParams();
            int iK0 = O7.q.K0(value2, '/', 0, 6);
            if (iK0 == -1) {
                if (kotlin.jvm.internal.m.a(O7.q.r1(value2).toString(), "*")) {
                    return io.ktor.http.ContentType.INSTANCE.getAny();
                }
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            java.lang.String strSubstring = value2.substring(0, iK0);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            java.lang.String string = O7.q.r1(strSubstring).toString();
            if (string.length() == 0) {
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            java.lang.String strSubstring2 = value2.substring(iK0 + 1);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            java.lang.String string2 = O7.q.r1(strSubstring2).toString();
            if (O7.q.C0(string, ' ') || O7.q.C0(string2, ' ')) {
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            if (string2.length() == 0 || O7.q.C0(string2, '/')) {
                throw new io.ktor.http.BadContentTypeFormatException(value);
            }
            return new io.ktor.http.ContentType(string, string2, params);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/ktor/http/ContentType$Font;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Collection", "getCollection", "Otf", "getOtf", "Sfnt", "getSfnt", "Ttf", "getTtf", "Woff", "getWoff", "Woff2", "getWoff2", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Font {
        public static final io.ktor.http.ContentType.Font INSTANCE = new io.ktor.http.ContentType.Font();
        public static final java.lang.String TYPE = "font";
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType(TYPE, "*", null, 4, null);
        private static final io.ktor.http.ContentType Collection = new io.ktor.http.ContentType(TYPE, "collection", null, 4, null);
        private static final io.ktor.http.ContentType Otf = new io.ktor.http.ContentType(TYPE, "otf", null, 4, null);
        private static final io.ktor.http.ContentType Sfnt = new io.ktor.http.ContentType(TYPE, "sfnt", null, 4, null);
        private static final io.ktor.http.ContentType Ttf = new io.ktor.http.ContentType(TYPE, "ttf", null, 4, null);
        private static final io.ktor.http.ContentType Woff = new io.ktor.http.ContentType(TYPE, "woff", null, 4, null);
        private static final io.ktor.http.ContentType Woff2 = new io.ktor.http.ContentType(TYPE, "woff2", null, 4, null);

        private Font() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "font/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getCollection() {
            return Collection;
        }

        public final io.ktor.http.ContentType getOtf() {
            return Otf;
        }

        public final io.ktor.http.ContentType getSfnt() {
            return Sfnt;
        }

        public final io.ktor.http.ContentType getTtf() {
            return Ttf;
        }

        public final io.ktor.http.ContentType getWoff() {
            return Woff;
        }

        public final io.ktor.http.ContentType getWoff2() {
            return Woff2;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/ktor/http/ContentType$Image;", "", "<init>", "()V", "", "contentSubtype", "", "contains", "(Ljava/lang/String;)Z", "Lio/ktor/http/ContentType;", "contentType", "(Lio/ktor/http/ContentType;)Z", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "GIF", "getGIF", "JPEG", "getJPEG", "PNG", "getPNG", "SVG", "getSVG", "XIcon", "getXIcon", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Image {
        public static final java.lang.String TYPE = "image";
        public static final io.ktor.http.ContentType.Image INSTANCE = new io.ktor.http.ContentType.Image();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("image", "*", null, 4, null);
        private static final io.ktor.http.ContentType GIF = new io.ktor.http.ContentType("image", "gif", null, 4, null);
        private static final io.ktor.http.ContentType JPEG = new io.ktor.http.ContentType("image", "jpeg", null, 4, null);
        private static final io.ktor.http.ContentType PNG = new io.ktor.http.ContentType("image", "png", null, 4, null);
        private static final io.ktor.http.ContentType SVG = new io.ktor.http.ContentType("image", "svg+xml", null, 4, null);
        private static final io.ktor.http.ContentType XIcon = new io.ktor.http.ContentType("image", "x-icon", null, 4, null);

        private Image() {
        }

        public final boolean contains(java.lang.String contentSubtype) {
            kotlin.jvm.internal.m.e(contentSubtype, "contentSubtype");
            return O7.x.x0(contentSubtype, "image/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getGIF() {
            return GIF;
        }

        public final io.ktor.http.ContentType getJPEG() {
            return JPEG;
        }

        public final io.ktor.http.ContentType getPNG() {
            return PNG;
        }

        public final io.ktor.http.ContentType getSVG() {
            return SVG;
        }

        public final io.ktor.http.ContentType getXIcon() {
            return XIcon;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/ktor/http/ContentType$Message;", "", "<init>", "()V", "", "contentSubtype", "", "contains", "(Ljava/lang/String;)Z", "Lio/ktor/http/ContentType;", "contentType", "(Lio/ktor/http/ContentType;)Z", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Http", "getHttp", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Message {
        public static final java.lang.String TYPE = "message";
        public static final io.ktor.http.ContentType.Message INSTANCE = new io.ktor.http.ContentType.Message();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("message", "*", null, 4, null);
        private static final io.ktor.http.ContentType Http = new io.ktor.http.ContentType("message", "http", null, 4, null);

        private Message() {
        }

        public final boolean contains(java.lang.String contentSubtype) {
            kotlin.jvm.internal.m.e(contentSubtype, "contentSubtype");
            return O7.x.x0(contentSubtype, "message/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getHttp() {
            return Http;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lio/ktor/http/ContentType$MultiPart;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Mixed", "getMixed", "Alternative", "getAlternative", "Related", "getRelated", "FormData", "getFormData", "Signed", "getSigned", "Encrypted", "getEncrypted", "ByteRanges", "getByteRanges", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class MultiPart {
        public static final io.ktor.http.ContentType.MultiPart INSTANCE = new io.ktor.http.ContentType.MultiPart();
        public static final java.lang.String TYPE = "multipart";
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType(TYPE, "*", null, 4, null);
        private static final io.ktor.http.ContentType Mixed = new io.ktor.http.ContentType(TYPE, "mixed", null, 4, null);
        private static final io.ktor.http.ContentType Alternative = new io.ktor.http.ContentType(TYPE, "alternative", null, 4, null);
        private static final io.ktor.http.ContentType Related = new io.ktor.http.ContentType(TYPE, "related", null, 4, null);
        private static final io.ktor.http.ContentType FormData = new io.ktor.http.ContentType(TYPE, "form-data", null, 4, null);
        private static final io.ktor.http.ContentType Signed = new io.ktor.http.ContentType(TYPE, "signed", null, 4, null);
        private static final io.ktor.http.ContentType Encrypted = new io.ktor.http.ContentType(TYPE, "encrypted", null, 4, null);
        private static final io.ktor.http.ContentType ByteRanges = new io.ktor.http.ContentType(TYPE, "byteranges", null, 4, null);

        private MultiPart() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "multipart/", true);
        }

        public final io.ktor.http.ContentType getAlternative() {
            return Alternative;
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getByteRanges() {
            return ByteRanges;
        }

        public final io.ktor.http.ContentType getEncrypted() {
            return Encrypted;
        }

        public final io.ktor.http.ContentType getFormData() {
            return FormData;
        }

        public final io.ktor.http.ContentType getMixed() {
            return Mixed;
        }

        public final io.ktor.http.ContentType getRelated() {
            return Related;
        }

        public final io.ktor.http.ContentType getSigned() {
            return Signed;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lio/ktor/http/ContentType$Text;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Plain", "getPlain", "CSS", "getCSS", "CSV", "getCSV", "Html", "getHtml", "JavaScript", "getJavaScript", "VCard", "getVCard", "Xml", "getXml", "EventStream", "getEventStream", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Text {
        public static final java.lang.String TYPE = "text";
        public static final io.ktor.http.ContentType.Text INSTANCE = new io.ktor.http.ContentType.Text();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("text", "*", null, 4, null);
        private static final io.ktor.http.ContentType Plain = new io.ktor.http.ContentType("text", "plain", null, 4, null);
        private static final io.ktor.http.ContentType CSS = new io.ktor.http.ContentType("text", "css", null, 4, null);
        private static final io.ktor.http.ContentType CSV = new io.ktor.http.ContentType("text", "csv", null, 4, null);
        private static final io.ktor.http.ContentType Html = new io.ktor.http.ContentType("text", "html", null, 4, null);
        private static final io.ktor.http.ContentType JavaScript = new io.ktor.http.ContentType("text", "javascript", null, 4, null);
        private static final io.ktor.http.ContentType VCard = new io.ktor.http.ContentType("text", "vcard", null, 4, null);
        private static final io.ktor.http.ContentType Xml = new io.ktor.http.ContentType("text", "xml", null, 4, null);
        private static final io.ktor.http.ContentType EventStream = new io.ktor.http.ContentType("text", "event-stream", null, 4, null);

        private Text() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "text/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getCSS() {
            return CSS;
        }

        public final io.ktor.http.ContentType getCSV() {
            return CSV;
        }

        public final io.ktor.http.ContentType getEventStream() {
            return EventStream;
        }

        public final io.ktor.http.ContentType getHtml() {
            return Html;
        }

        public final io.ktor.http.ContentType getJavaScript() {
            return JavaScript;
        }

        public final io.ktor.http.ContentType getPlain() {
            return Plain;
        }

        public final io.ktor.http.ContentType getVCard() {
            return VCard;
        }

        public final io.ktor.http.ContentType getXml() {
            return Xml;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0007\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lio/ktor/http/ContentType$Video;", "", "<init>", "()V", "", "contentType", "", "contains", "(Ljava/lang/CharSequence;)Z", "Lio/ktor/http/ContentType;", "(Lio/ktor/http/ContentType;)Z", "", "TYPE", "Ljava/lang/String;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MPEG", "getMPEG", "MP4", "getMP4", "OGG", "getOGG", "QuickTime", "getQuickTime", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Video {
        public static final java.lang.String TYPE = "video";
        public static final io.ktor.http.ContentType.Video INSTANCE = new io.ktor.http.ContentType.Video();
        private static final io.ktor.http.ContentType Any = new io.ktor.http.ContentType("video", "*", null, 4, null);
        private static final io.ktor.http.ContentType MPEG = new io.ktor.http.ContentType("video", "mpeg", null, 4, null);
        private static final io.ktor.http.ContentType MP4 = new io.ktor.http.ContentType("video", io.sentry.rrweb.RRWebVideoEvent.REPLAY_CONTAINER, null, 4, null);
        private static final io.ktor.http.ContentType OGG = new io.ktor.http.ContentType("video", "ogg", null, 4, null);
        private static final io.ktor.http.ContentType QuickTime = new io.ktor.http.ContentType("video", "quicktime", null, 4, null);

        private Video() {
        }

        public final boolean contains(java.lang.CharSequence contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return O7.q.e1(contentType, "video/", true);
        }

        public final io.ktor.http.ContentType getAny() {
            return Any;
        }

        public final io.ktor.http.ContentType getMP4() {
            return MP4;
        }

        public final io.ktor.http.ContentType getMPEG() {
            return MPEG;
        }

        public final io.ktor.http.ContentType getOGG() {
            return OGG;
        }

        public final io.ktor.http.ContentType getQuickTime() {
            return QuickTime;
        }

        public final boolean contains(io.ktor.http.ContentType contentType) {
            kotlin.jvm.internal.m.e(contentType, "contentType");
            return contentType.match(Any);
        }
    }

    public /* synthetic */ ContentType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, (i3 & 8) != 0 ? p078i6.w.f23205h : list);
    }

    private final boolean hasParameter(java.lang.String name, java.lang.String value) {
        int size = getParameters().size();
        if (size != 0) {
            if (size != 1) {
                java.util.List<io.ktor.http.HeaderValueParam> parameters = getParameters();
                if (parameters != null && parameters.isEmpty()) {
                    return false;
                }
                for (io.ktor.http.HeaderValueParam headerValueParam : parameters) {
                    if (O7.x.r0(headerValueParam.getName(), name, true) && O7.x.r0(headerValueParam.getValue(), value, true)) {
                        return true;
                    }
                }
                return false;
            }
            io.ktor.http.HeaderValueParam headerValueParam2 = getParameters().get(0);
            if (O7.x.r0(headerValueParam2.getName(), name, true) && O7.x.r0(headerValueParam2.getValue(), value, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof io.ktor.http.ContentType)) {
            return false;
        }
        io.ktor.http.ContentType contentType = (io.ktor.http.ContentType) other;
        return O7.x.r0(this.contentType, contentType.contentType, true) && O7.x.r0(this.contentSubtype, contentType.contentSubtype, true) && kotlin.jvm.internal.m.a(getParameters(), contentType.getParameters());
    }

    public final java.lang.String getContentSubtype() {
        return this.contentSubtype;
    }

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        java.lang.String str = this.contentType;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        java.lang.String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
        return (getParameters().hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final boolean match(io.ktor.http.ContentType pattern) {
        boolean zR0;
        kotlin.jvm.internal.m.e(pattern, "pattern");
        if (!kotlin.jvm.internal.m.a(pattern.contentType, "*") && !O7.x.r0(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.a(pattern.contentSubtype, "*") && !O7.x.r0(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (io.ktor.http.HeaderValueParam headerValueParam : pattern.getParameters()) {
            java.lang.String strComponent1 = headerValueParam.getName();
            java.lang.String strComponent2 = headerValueParam.getValue();
            if (!kotlin.jvm.internal.m.a(strComponent1, "*")) {
                java.lang.String strParameter = parameter(strComponent1);
                zR0 = kotlin.jvm.internal.m.a(strComponent2, "*") ? strParameter != null : O7.x.r0(strParameter, strComponent2, true);
            } else if (!kotlin.jvm.internal.m.a(strComponent2, "*")) {
                java.util.List<io.ktor.http.HeaderValueParam> parameters = getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    java.util.Iterator<T> it = parameters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (O7.x.r0(((io.ktor.http.HeaderValueParam) it.next()).getValue(), strComponent2, true)) {
                            }
                        }
                    }
                }
            }
            if (!zR0) {
                return false;
            }
        }
        return true;
    }

    public final io.ktor.http.ContentType withParameter(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        if (hasParameter(name, value)) {
            return this;
        }
        return new io.ktor.http.ContentType(this.contentType, this.contentSubtype, getContent(), p078i6.o.z1(new io.ktor.http.HeaderValueParam(name, value), getParameters()));
    }

    public final io.ktor.http.ContentType withoutParameters() {
        if (getParameters().isEmpty()) {
            return this;
        }
        return new io.ktor.http.ContentType(this.contentType, this.contentSubtype, null, 4, null);
    }

    private ContentType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<io.ktor.http.HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentType(java.lang.String str, java.lang.String str2, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, (i3 & 4) != 0 ? p078i6.w.f23205h : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(java.lang.String contentType, java.lang.String contentSubtype, java.util.List<io.ktor.http.HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.m.e(parameters, "parameters");
    }

    public final boolean match(java.lang.String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        return match(INSTANCE.parse(pattern));
    }
}
