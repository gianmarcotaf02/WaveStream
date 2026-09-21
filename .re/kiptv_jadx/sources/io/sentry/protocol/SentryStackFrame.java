package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryStackFrame implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.Boolean _native;
    private java.lang.String _package;
    private java.lang.String absPath;
    private java.lang.Integer colno;
    private java.lang.String contextLine;
    private java.lang.String filename;
    private java.util.List<java.lang.Integer> framesOmitted;
    private java.lang.String function;
    private java.lang.String imageAddr;
    private java.lang.Boolean inApp;
    private java.lang.String instructionAddr;
    private java.lang.Integer lineno;
    private io.sentry.SentryLockReason lock;
    private java.lang.String module;
    private java.lang.String platform;
    private java.util.List<java.lang.String> postContext;
    private java.util.List<java.lang.String> preContext;
    private java.lang.String rawFunction;
    private java.lang.String symbol;
    private java.lang.String symbolAddr;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.util.Map<java.lang.String, java.lang.String> vars;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryStackFrame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryStackFrame deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.protocol.SentryStackFrame sentryStackFrame = new io.sentry.protocol.SentryStackFrame();
            objectReader.beginObject();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "image_addr":
                        sentryStackFrame.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "in_app":
                        sentryStackFrame.inApp = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_function":
                        sentryStackFrame.rawFunction = objectReader.nextStringOrNull();
                        break;
                    case "lineno":
                        sentryStackFrame.lineno = objectReader.nextIntegerOrNull();
                        break;
                    case "module":
                        sentryStackFrame.module = objectReader.nextStringOrNull();
                        break;
                    case "native":
                        sentryStackFrame._native = objectReader.nextBooleanOrNull();
                        break;
                    case "symbol":
                        sentryStackFrame.symbol = objectReader.nextStringOrNull();
                        break;
                    case "package":
                        sentryStackFrame._package = objectReader.nextStringOrNull();
                        break;
                    case "filename":
                        sentryStackFrame.filename = objectReader.nextStringOrNull();
                        break;
                    case "symbol_addr":
                        sentryStackFrame.symbolAddr = objectReader.nextStringOrNull();
                        break;
                    case "lock":
                        sentryStackFrame.lock = (io.sentry.SentryLockReason) objectReader.nextOrNull(iLogger, new io.sentry.SentryLockReason.Deserializer());
                        break;
                    case "colno":
                        sentryStackFrame.colno = objectReader.nextIntegerOrNull();
                        break;
                    case "instruction_addr":
                        sentryStackFrame.instructionAddr = objectReader.nextStringOrNull();
                        break;
                    case "context_line":
                        sentryStackFrame.contextLine = objectReader.nextStringOrNull();
                        break;
                    case "function":
                        sentryStackFrame.function = objectReader.nextStringOrNull();
                        break;
                    case "abs_path":
                        sentryStackFrame.absPath = objectReader.nextStringOrNull();
                        break;
                    case "platform":
                        sentryStackFrame.platform = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackFrame.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackFrame;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ABS_PATH = "abs_path";
        public static final java.lang.String COLNO = "colno";
        public static final java.lang.String CONTEXT_LINE = "context_line";
        public static final java.lang.String FILENAME = "filename";
        public static final java.lang.String FUNCTION = "function";
        public static final java.lang.String IMAGE_ADDR = "image_addr";
        public static final java.lang.String INSTRUCTION_ADDR = "instruction_addr";
        public static final java.lang.String IN_APP = "in_app";
        public static final java.lang.String LINENO = "lineno";
        public static final java.lang.String LOCK = "lock";
        public static final java.lang.String MODULE = "module";
        public static final java.lang.String NATIVE = "native";
        public static final java.lang.String PACKAGE = "package";
        public static final java.lang.String PLATFORM = "platform";
        public static final java.lang.String RAW_FUNCTION = "raw_function";
        public static final java.lang.String SYMBOL = "symbol";
        public static final java.lang.String SYMBOL_ADDR = "symbol_addr";
    }

    public java.lang.String getAbsPath() {
        return this.absPath;
    }

    public java.lang.Integer getColno() {
        return this.colno;
    }

    public java.lang.String getContextLine() {
        return this.contextLine;
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public java.util.List<java.lang.Integer> getFramesOmitted() {
        return this.framesOmitted;
    }

    public java.lang.String getFunction() {
        return this.function;
    }

    public java.lang.String getImageAddr() {
        return this.imageAddr;
    }

    public java.lang.String getInstructionAddr() {
        return this.instructionAddr;
    }

    public java.lang.Integer getLineno() {
        return this.lineno;
    }

    public io.sentry.SentryLockReason getLock() {
        return this.lock;
    }

    public java.lang.String getModule() {
        return this.module;
    }

    public java.lang.String getPackage() {
        return this._package;
    }

    public java.lang.String getPlatform() {
        return this.platform;
    }

    public java.util.List<java.lang.String> getPostContext() {
        return this.postContext;
    }

    public java.util.List<java.lang.String> getPreContext() {
        return this.preContext;
    }

    public java.lang.String getRawFunction() {
        return this.rawFunction;
    }

    public java.lang.String getSymbol() {
        return this.symbol;
    }

    public java.lang.String getSymbolAddr() {
        return this.symbolAddr;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.util.Map<java.lang.String, java.lang.String> getVars() {
        return this.vars;
    }

    public java.lang.Boolean isInApp() {
        return this.inApp;
    }

    public java.lang.Boolean isNative() {
        return this._native;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.filename != null) {
            objectWriter.name("filename").value(this.filename);
        }
        if (this.function != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.FUNCTION).value(this.function);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.lineno != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.LINENO).value(this.lineno);
        }
        if (this.colno != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.COLNO).value(this.colno);
        }
        if (this.absPath != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.ABS_PATH).value(this.absPath);
        }
        if (this.contextLine != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.CONTEXT_LINE).value(this.contextLine);
        }
        if (this.inApp != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.IN_APP).value(this.inApp);
        }
        if (this._package != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.PACKAGE).value(this._package);
        }
        if (this._native != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE).value(this._native);
        }
        if (this.platform != null) {
            objectWriter.name("platform").value(this.platform);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.symbolAddr != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.SYMBOL_ADDR).value(this.symbolAddr);
        }
        if (this.instructionAddr != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.INSTRUCTION_ADDR).value(this.instructionAddr);
        }
        if (this.rawFunction != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.RAW_FUNCTION).value(this.rawFunction);
        }
        if (this.symbol != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.SYMBOL).value(this.symbol);
        }
        if (this.lock != null) {
            objectWriter.name(io.sentry.protocol.SentryStackFrame.JsonKeys.LOCK).value(iLogger, this.lock);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setAbsPath(java.lang.String str) {
        this.absPath = str;
    }

    public void setColno(java.lang.Integer num) {
        this.colno = num;
    }

    public void setContextLine(java.lang.String str) {
        this.contextLine = str;
    }

    public void setFilename(java.lang.String str) {
        this.filename = str;
    }

    public void setFramesOmitted(java.util.List<java.lang.Integer> list) {
        this.framesOmitted = list;
    }

    public void setFunction(java.lang.String str) {
        this.function = str;
    }

    public void setImageAddr(java.lang.String str) {
        this.imageAddr = str;
    }

    public void setInApp(java.lang.Boolean bool) {
        this.inApp = bool;
    }

    public void setInstructionAddr(java.lang.String str) {
        this.instructionAddr = str;
    }

    public void setLineno(java.lang.Integer num) {
        this.lineno = num;
    }

    public void setLock(io.sentry.SentryLockReason sentryLockReason) {
        this.lock = sentryLockReason;
    }

    public void setModule(java.lang.String str) {
        this.module = str;
    }

    public void setNative(java.lang.Boolean bool) {
        this._native = bool;
    }

    public void setPackage(java.lang.String str) {
        this._package = str;
    }

    public void setPlatform(java.lang.String str) {
        this.platform = str;
    }

    public void setPostContext(java.util.List<java.lang.String> list) {
        this.postContext = list;
    }

    public void setPreContext(java.util.List<java.lang.String> list) {
        this.preContext = list;
    }

    public void setRawFunction(java.lang.String str) {
        this.rawFunction = str;
    }

    public void setSymbol(java.lang.String str) {
        this.symbol = str;
    }

    public void setSymbolAddr(java.lang.String str) {
        this.symbolAddr = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public void setVars(java.util.Map<java.lang.String, java.lang.String> map) {
        this.vars = map;
    }
}
