package com.revenuecat.purchases.utils;

import N7.g;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import p070h6.A;
import p078i6.x;
import p086j6.e;
import p194x6.j;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00112\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010%\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001a¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", "T", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventSerializer", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lx6/j;Lx6/j;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "Lh6/A;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "", "fileSizeInKB", "()D", "LN7/m;", "block", "readFile", "(Lx6/j;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", "clear", "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "Lx6/j;", "Lcom/revenuecat/purchases/DebugEvent;", "debugEventCallback", "getDebugEventCallback", "()Lx6/j;", "setDebugEventCallback", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class EventsFileHelper<T extends Event> {
    public static final int MAX_EVENT_PROPERTY_SIZE = 80;
    private j debugEventCallback;
    private final j eventDeserializer;
    private final j eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "", "e", "Lh6/A;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements j {
        final EventsFileHelper<T> this$0;

        public AnonymousClass1(EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.this$0 = eventsFileHelper;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Throwable) obj);
            return A.f22523a;
        }

        public final void invoke(Throwable e6) {
            m.e(e6, "e");
            j debugEventCallback = this.this$0.getDebugEventCallback();
            if (debugEventCallback != null) {
                DebugEventName debugEventName = DebugEventName.REMOVE_LINES_EXCEPTION;
                e eVar = new e();
                String strH = B.f24540a.b(e6.getClass()).h();
                if (strH == null) {
                    strH = "Unknown";
                }
                eVar.put("exceptionType", strH);
                String message = e6.getMessage();
                if (message != null) {
                    eVar.put("message", q.p1(80, message));
                }
                debugEventCallback.invoke(new DebugEvent(debugEventName, eVar.b()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21031 extends o implements j {
        final j $block;
        final EventsFileHelper<T> this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Lcom/revenuecat/purchases/utils/Event;", "line", "", "invoke", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class C00211 extends o implements j {
            final EventsFileHelper<T> this$0;

            public C00211(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override
            public final T invoke(String line) {
                m.e(line, "line");
                return (T) this.this$0.mapToEvent(line);
            }
        }

        public C21031(j jVar, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$block = jVar;
            this.this$0 = eventsFileHelper;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((N7.m) obj);
            return A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            m.e(sequence, "sequence");
            this.$block.invoke(N7.o.p0(sequence, new C00211(this.this$0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LN7/m;", "", "sequence", "Lh6/A;", "invoke", "(LN7/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C21041 extends o implements j {
        final j $block;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "T", "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class C00221 extends o implements j {
            public static final C00221 INSTANCE = new C00221();

            public C00221() {
                super(1);
            }

            @Override
            public final JSONObject invoke(String it) {
                m.e(it, "it");
                return new JSONObject(it);
            }
        }

        public C21041(j jVar) {
            super(1);
            this.$block = jVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((N7.m) obj);
            return A.f22523a;
        }

        public final void invoke(N7.m sequence) {
            m.e(sequence, "sequence");
            this.$block.invoke(N7.o.p0(sequence, C00221.INSTANCE));
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, j jVar, j jVar2) {
        m.e(fileHelper, "fileHelper");
        m.e(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = jVar;
        this.eventDeserializer = jVar2;
    }

    public final T mapToEvent(String string) {
        j jVar = this.eventDeserializer;
        if (jVar == null) {
            j jVar2 = this.debugEventCallback;
            if (jVar2 != null) {
                jVar2.invoke(new DebugEvent(DebugEventName.DESERIALIZATION_ERROR, x.f23206h));
                return null;
            }
        } else {
            try {
                return (T) jVar.invoke(string);
            } catch (SerializationException e6) {
                j jVar3 = this.debugEventCallback;
                if (jVar3 != null) {
                    DebugEventName debugEventName = DebugEventName.DESERIALIZATION_ERROR;
                    e eVar = new e();
                    eVar.put("exceptionType", "SerializationException");
                    String message = e6.getMessage();
                    if (message != null) {
                        eVar.put("message", q.p1(80, message));
                    }
                    jVar3.invoke(new DebugEvent(debugEventName, eVar.b()));
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e6);
            } catch (IllegalArgumentException e9) {
                j jVar4 = this.debugEventCallback;
                if (jVar4 != null) {
                    DebugEventName debugEventName2 = DebugEventName.DESERIALIZATION_ERROR;
                    e eVar2 = new e();
                    eVar2.put("exceptionType", "IllegalArgumentException");
                    String message2 = e9.getMessage();
                    if (message2 != null) {
                        eVar2.put("message", q.p1(80, message2));
                    }
                    jVar4.invoke(new DebugEvent(debugEventName2, eVar2.b()));
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e9);
            }
        }
        return null;
    }

    public final synchronized void appendEvent(T event) {
        String string;
        try {
            m.e(event, "event");
            try {
                FileHelper fileHelper = this.fileHelper;
                String str = this.filePath;
                StringBuilder sb = new StringBuilder();
                j jVar = this.eventSerializer;
                if (jVar == null || (string = (String) jVar.invoke(event)) == null) {
                    string = event.toString();
                }
                sb.append(string);
                sb.append('\n');
                fileHelper.appendToFile(str, sb.toString());
            } catch (Exception e6) {
                j jVar2 = this.debugEventCallback;
                if (jVar2 != null) {
                    DebugEventName debugEventName = DebugEventName.APPEND_EVENT_EXCEPTION;
                    e eVar = new e();
                    String strH = B.f24540a.b(e6.getClass()).h();
                    if (strH == null) {
                        strH = "Unknown";
                    }
                    eVar.put("exceptionType", strH);
                    String message = e6.getMessage();
                    if (message != null) {
                        eVar.put("message", q.p1(80, message));
                    }
                    jVar2.invoke(new DebugEvent(debugEventName, eVar.b()));
                }
                throw e6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount, new AnonymousClass1(this));
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + '.');
            }
        }
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final j getDebugEventCallback() {
        return this.debugEventCallback;
    }

    public final synchronized void readFile(j block) {
        try {
            m.e(block, "block");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(g.f7442a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C21031(block, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void readFileAsJson(j block) {
        try {
            m.e(block, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(g.f7442a);
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C21041(block));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setDebugEventCallback(j jVar) {
        this.debugEventCallback = jVar;
    }

    public EventsFileHelper(FileHelper fileHelper, String str, j jVar, j jVar2, int i3, AbstractC2541f abstractC2541f) {
        this(fileHelper, str, (i3 & 4) != 0 ? null : jVar, (i3 & 8) != 0 ? null : jVar2);
    }
}
