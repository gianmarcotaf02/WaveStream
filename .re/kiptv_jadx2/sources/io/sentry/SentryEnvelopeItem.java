package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class SentryEnvelopeItem {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] data;
    private final Callable<byte[]> dataFactory;
    private final SentryEnvelopeItemHeader header;

    public static class CachedItem {
        private byte[] bytes;
        private final Callable<byte[]> dataFactory;

        public CachedItem(Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        private static byte[] orEmptyArray(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] getBytes() {
            Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    private static void ensureAttachmentSizeLimit(long j, long j9, String str) throws SentryEnvelopeException {
        if (j > j9) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j9)));
        }
    }

    public static SentryEnvelopeItem fromAttachment(ISerializer iSerializer, ILogger iLogger, Attachment attachment, long j) {
        CachedItem cachedItem = new CachedItem(new r(attachment, j, iSerializer, iLogger));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Attachment, new p(12, cachedItem), attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), new p(13, cachedItem));
    }

    public static SentryEnvelopeItem fromCheckIn(ISerializer iSerializer, CheckIn checkIn) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(checkIn, "CheckIn is required.");
        CachedItem cachedItem = new CachedItem(new q(iSerializer, checkIn, 3));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.CheckIn, new p(9, cachedItem), "application/json", null), new p(10, cachedItem));
    }

    public static SentryEnvelopeItem fromClientReport(ISerializer iSerializer, ClientReport clientReport) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(clientReport, "ClientReport is required.");
        CachedItem cachedItem = new CachedItem(new q(iSerializer, clientReport, 2));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(clientReport), new p(6, cachedItem), "application/json", null), new p(8, cachedItem));
    }

    public static SentryEnvelopeItem fromEvent(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        CachedItem cachedItem = new CachedItem(new q(iSerializer, sentryBaseEvent, 0));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(sentryBaseEvent), new p(2, cachedItem), "application/json", null), new p(3, cachedItem));
    }

    public static SentryEnvelopeItem fromProfilingTrace(ProfilingTraceData profilingTraceData, long j, ISerializer iSerializer) {
        File traceFile = profilingTraceData.getTraceFile();
        CachedItem cachedItem = new CachedItem(new r(traceFile, j, profilingTraceData, iSerializer));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Profile, new p(14, cachedItem), "application-json", traceFile.getName()), new p(15, cachedItem));
    }

    public static SentryEnvelopeItem fromReplay(final ISerializer iSerializer, final ILogger iLogger, final SentryReplayEvent sentryReplayEvent, final ReplayRecording replayRecording, final boolean z6) {
        final File videoFile = sentryReplayEvent.getVideoFile();
        CachedItem cachedItem = new CachedItem(new Callable() {
            @Override
            public final Object call() {
                return SentryEnvelopeItem.lambda$fromReplay$21(iSerializer, sentryReplayEvent, replayRecording, videoFile, iLogger, z6);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ReplayVideo, new p(7, cachedItem), null, null), new p(11, cachedItem));
    }

    public static SentryEnvelopeItem fromSession(ISerializer iSerializer, Session session) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(session, "Session is required.");
        CachedItem cachedItem = new CachedItem(new q(iSerializer, session, 4));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Session, new p(0, cachedItem), "application/json", null), new p(1, cachedItem));
    }

    public static SentryEnvelopeItem fromUserFeedback(ISerializer iSerializer, UserFeedback userFeedback) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        CachedItem cachedItem = new CachedItem(new q(iSerializer, userFeedback, 1));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, new p(4, cachedItem), "application/json", null), new p(5, cachedItem));
    }

    public static byte[] lambda$fromAttachment$12(Attachment attachment, long j, ISerializer iSerializer, ILogger iLogger) throws SentryEnvelopeException {
        if (attachment.getBytes() != null) {
            byte[] bytes = attachment.getBytes();
            ensureAttachmentSizeLimit(bytes.length, j, attachment.getFilename());
            return bytes;
        }
        if (attachment.getSerializable() != null) {
            byte[] bArrBytesFrom = JsonSerializationUtils.bytesFrom(iSerializer, iLogger, attachment.getSerializable());
            if (bArrBytesFrom != null) {
                ensureAttachmentSizeLimit(bArrBytesFrom.length, j, attachment.getFilename());
                return bArrBytesFrom;
            }
        } else if (attachment.getPathname() != null) {
            return FileUtils.readBytesFromFile(attachment.getPathname(), j);
        }
        throw new SentryEnvelopeException(Y6.f.h("Couldn't attach the attachment ", attachment.getFilename(), ".\nPlease check that either bytes, serializable or a path is set."));
    }

    public static Integer lambda$fromAttachment$13(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static Integer lambda$fromCheckIn$10(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromCheckIn$9(ISerializer iSerializer, CheckIn checkIn) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(checkIn, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static byte[] lambda$fromClientReport$18(ISerializer iSerializer, ClientReport clientReport) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(clientReport, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static Integer lambda$fromClientReport$19(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromEvent$3(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryBaseEvent, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static Integer lambda$fromEvent$4(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromProfilingTrace$15(File file, long j, ProfilingTraceData profilingTraceData, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(Y6.f.h("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
        }
        String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), j), 3);
        if (strEncodeToString.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        profilingTraceData.setSampledProfile(strEncodeToString);
        profilingTraceData.readDeviceCpuFrequencies();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profilingTraceData, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e6) {
                throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e6.getMessage());
            }
        } catch (Throwable th5) {
            file.delete();
            throw th5;
        }
    }

    public static Integer lambda$fromProfilingTrace$16(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromReplay$21(ISerializer iSerializer, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, File file, ILogger iLogger, boolean z6) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    iSerializer.serialize(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (replayRecording != null) {
                        iSerializer.serialize(replayRecording, bufferedWriter);
                        linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bytesFromFile = FileUtils.readBytesFromFile(file.getPath(), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE);
                        if (bytesFromFile.length > 0) {
                            linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bytesFromFile);
                        }
                    }
                    byte[] bArrSerializeToMsgpack = serializeToMsgpack(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z6) {
                            FileUtils.deleteRecursively(file.getParentFile());
                            return bArrSerializeToMsgpack;
                        }
                        file.delete();
                    }
                    return bArrSerializeToMsgpack;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                iLogger.log(SentryLevel.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z6) {
                        FileUtils.deleteRecursively(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static Integer lambda$fromReplay$22(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromSession$0(ISerializer iSerializer, Session session) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static Integer lambda$fromSession$1(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    public static byte[] lambda$fromUserFeedback$6(ISerializer iSerializer, UserFeedback userFeedback) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(userFeedback, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static Integer lambda$fromUserFeedback$7(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    private static byte[] serializeToMsgpack(Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(UTF_8);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ClientReport getClientReport(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            ClientReport clientReport = (ClientReport) iSerializer.deserialize(bufferedReader, ClientReport.class);
            bufferedReader.close();
            return clientReport;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] getData() {
        Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    public SentryEvent getEvent(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryEvent sentryEvent = (SentryEvent) iSerializer.deserialize(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    public SentryTransaction getTransaction(ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryTransaction sentryTransaction = (SentryTransaction) iSerializer.deserialize(bufferedReader, SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, Callable<byte[]> callable) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (Callable) Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }
}
