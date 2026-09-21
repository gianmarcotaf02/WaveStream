package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00112\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010%\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001a¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", "T", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventSerializer", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lx6/j;Lx6/j;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Lh6/A;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "", "fileSizeInKB", "()D", "LN7/m;", "block", "readFile", "(Lx6/j;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", "clear", "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "Lx6/j;", "Lcom/revenuecat/purchases/DebugEvent;", "debugEventCallback", "getDebugEventCallback", "()Lx6/j;", "setDebugEventCallback", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class EventsFileHelper<T extends com.revenuecat.purchases.utils.Event> {
    public static final int MAX_EVENT_PROPERTY_SIZE = 80;
    private p194x6.j debugEventCallback;
    private final p194x6.j eventDeserializer;
    private final p194x6.j eventSerializer;
    private final com.revenuecat.purchases.common.FileHelper fileHelper;
    private final java.lang.String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$clear$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "", "e", "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.revenuecat.purchases.utils.EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.this$0 = eventsFileHelper;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.lang.Throwable) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.lang.Throwable e6) {
            kotlin.jvm.internal.m.e(e6, "e");
            p194x6.j debugEventCallback = this.this$0.getDebugEventCallback();
            if (debugEventCallback != null) {
                com.revenuecat.purchases.DebugEventName debugEventName = com.revenuecat.purchases.DebugEventName.REMOVE_LINES_EXCEPTION;
                p086j6.e eVar = new p086j6.e();
                java.lang.String strH = kotlin.jvm.internal.B.f24540a.b(e6.getClass()).h();
                if (strH == null) {
                    strH = "Unknown";
                }
                eVar.put("exceptionType", strH);
                java.lang.String message = e6.getMessage();
                if (message != null) {
                    eVar.put("message", O7.q.p1(80, message));
                }
                debugEventCallback.invoke(new com.revenuecat.purchases.DebugEvent(debugEventName, eVar.b()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21031 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $block;
        final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Lcom/revenuecat/purchases/utils/Event;", "line", "", "invoke", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class C00211 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ com.revenuecat.purchases.utils.EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(com.revenuecat.purchases.utils.EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // p194x6.j
            public final T invoke(java.lang.String line) {
                kotlin.jvm.internal.m.e(line, "line");
                return (T) this.this$0.mapToEvent(line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21031(p194x6.j jVar, com.revenuecat.purchases.utils.EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$block = jVar;
            this.this$0 = eventsFileHelper;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((N7.m) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            kotlin.jvm.internal.m.e(sequence, "sequence");
            this.$block.invoke(N7.o.p0(sequence, new com.revenuecat.purchases.utils.EventsFileHelper.C21031.C00211(this.this$0)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21041 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $block;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "T", "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class C00221 extends kotlin.jvm.internal.o implements p194x6.j {
            public static final com.revenuecat.purchases.utils.EventsFileHelper.C21041.C00221 INSTANCE = new com.revenuecat.purchases.utils.EventsFileHelper.C21041.C00221();

            public C00221() {
                super(1);
            }

            @Override // p194x6.j
            public final org.json.JSONObject invoke(java.lang.String it) {
                kotlin.jvm.internal.m.e(it, "it");
                return new org.json.JSONObject(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21041(p194x6.j jVar) {
            super(1);
            this.$block = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((N7.m) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            kotlin.jvm.internal.m.e(sequence, "sequence");
            this.$block.invoke(N7.o.p0(sequence, com.revenuecat.purchases.utils.EventsFileHelper.C21041.C00221.INSTANCE));
        }
    }

    public EventsFileHelper(com.revenuecat.purchases.common.FileHelper fileHelper, java.lang.String filePath, p194x6.j jVar, p194x6.j jVar2) {
        kotlin.jvm.internal.m.e(fileHelper, "fileHelper");
        kotlin.jvm.internal.m.e(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = jVar;
        this.eventDeserializer = jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(java.lang.String string) {
        p194x6.j jVar = this.eventDeserializer;
        if (jVar == null) {
            p194x6.j jVar2 = this.debugEventCallback;
            if (jVar2 != null) {
                jVar2.invoke(new com.revenuecat.purchases.DebugEvent(com.revenuecat.purchases.DebugEventName.DESERIALIZATION_ERROR, p078i6.x.f23206h));
                return null;
            }
        } else {
            try {
                return (T) jVar.invoke(string);
            } catch (com.revenuecat.purchases.utils.SerializationException e6) {
                p194x6.j jVar3 = this.debugEventCallback;
                if (jVar3 != null) {
                    com.revenuecat.purchases.DebugEventName debugEventName = com.revenuecat.purchases.DebugEventName.DESERIALIZATION_ERROR;
                    p086j6.e eVar = new p086j6.e();
                    eVar.put("exceptionType", "SerializationException");
                    java.lang.String message = e6.getMessage();
                    if (message != null) {
                        eVar.put("message", O7.q.p1(80, message));
                    }
                    jVar3.invoke(new com.revenuecat.purchases.DebugEvent(debugEventName, eVar.b()));
                }
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e6);
            } catch (java.lang.IllegalArgumentException e9) {
                p194x6.j jVar4 = this.debugEventCallback;
                if (jVar4 != null) {
                    com.revenuecat.purchases.DebugEventName debugEventName2 = com.revenuecat.purchases.DebugEventName.DESERIALIZATION_ERROR;
                    p086j6.e eVar2 = new p086j6.e();
                    eVar2.put("exceptionType", "IllegalArgumentException");
                    java.lang.String message2 = e9.getMessage();
                    if (message2 != null) {
                        eVar2.put("message", O7.q.p1(80, message2));
                    }
                    jVar4.invoke(new com.revenuecat.purchases.DebugEvent(debugEventName2, eVar2.b()));
                }
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e9);
            }
        }
        return null;
    }

    public final synchronized void appendEvent(T event) {
        java.lang.String string;
        try {
            kotlin.jvm.internal.m.e(event, "event");
            try {
                com.revenuecat.purchases.common.FileHelper fileHelper = this.fileHelper;
                java.lang.String str = this.filePath;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                p194x6.j jVar = this.eventSerializer;
                if (jVar == null || (string = (java.lang.String) jVar.invoke(event)) == null) {
                    string = event.toString();
                }
                sb.append(string);
                sb.append('\n');
                fileHelper.appendToFile(str, sb.toString());
            } catch (java.lang.Exception e6) {
                p194x6.j jVar2 = this.debugEventCallback;
                if (jVar2 != null) {
                    com.revenuecat.purchases.DebugEventName debugEventName = com.revenuecat.purchases.DebugEventName.APPEND_EVENT_EXCEPTION;
                    p086j6.e eVar = new p086j6.e();
                    java.lang.String strH = kotlin.jvm.internal.B.f24540a.b(e6.getClass()).h();
                    if (strH == null) {
                        strH = "Unknown";
                    }
                    eVar.put("exceptionType", strH);
                    java.lang.String message = e6.getMessage();
                    if (message != null) {
                        eVar.put("message", O7.q.p1(80, message));
                    }
                    jVar2.invoke(new com.revenuecat.purchases.DebugEvent(debugEventName, eVar.b()));
                }
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount, new com.revenuecat.purchases.utils.EventsFileHelper.AnonymousClass1(this));
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + '.');
            }
        }
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final p194x6.j getDebugEventCallback() {
        return this.debugEventCallback;
    }

    public final synchronized void readFile(p194x6.j block) {
        try {
            kotlin.jvm.internal.m.e(block, "block");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(N7.g.f7442a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new com.revenuecat.purchases.utils.EventsFileHelper.C21031(block, this));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void readFileAsJson(p194x6.j block) {
        try {
            kotlin.jvm.internal.m.e(block, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(N7.g.f7442a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new com.revenuecat.purchases.utils.EventsFileHelper.C21041(block));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void setDebugEventCallback(p194x6.j jVar) {
        this.debugEventCallback = jVar;
    }

    public /* synthetic */ EventsFileHelper(com.revenuecat.purchases.common.FileHelper fileHelper, java.lang.String str, p194x6.j jVar, p194x6.j jVar2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(fileHelper, str, (i3 & 4) != 0 ? null : jVar, (i3 & 8) != 0 ? null : jVar2);
    }
}
