package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeItem {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private byte[] data;
    private final java.util.concurrent.Callable<byte[]> dataFactory;
    private final io.sentry.SentryEnvelopeItemHeader header;

    public static class CachedItem {
        private byte[] bytes;
        private final java.util.concurrent.Callable<byte[]> dataFactory;

        public CachedItem(java.util.concurrent.Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        private static byte[] orEmptyArray(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] getBytes() {
            java.util.concurrent.Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }

    public SentryEnvelopeItem(io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (io.sentry.SentryEnvelopeItemHeader) io.sentry.util.Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    private static void ensureAttachmentSizeLimit(long j, long j9, java.lang.String str) throws io.sentry.exception.SentryEnvelopeException {
        if (j > j9) {
            throw new io.sentry.exception.SentryEnvelopeException(java.lang.String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j9)));
        }
    }

    public static io.sentry.SentryEnvelopeItem fromAttachment(io.sentry.ISerializer iSerializer, io.sentry.ILogger iLogger, io.sentry.Attachment attachment, long j) {
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.r(attachment, j, iSerializer, iLogger));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.Attachment, new io.sentry.p(12, cachedItem), attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), new io.sentry.p(13, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromCheckIn(io.sentry.ISerializer iSerializer, io.sentry.CheckIn checkIn) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "ISerializer is required.");
        io.sentry.util.Objects.requireNonNull(checkIn, "CheckIn is required.");
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.q(iSerializer, checkIn, 3));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.CheckIn, new io.sentry.p(9, cachedItem), "application/json", null), new io.sentry.p(10, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromClientReport(io.sentry.ISerializer iSerializer, io.sentry.clientreport.ClientReport clientReport) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "ISerializer is required.");
        io.sentry.util.Objects.requireNonNull(clientReport, "ClientReport is required.");
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.q(iSerializer, clientReport, 2));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.resolve(clientReport), new io.sentry.p(6, cachedItem), "application/json", null), new io.sentry.p(8, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromEvent(io.sentry.ISerializer iSerializer, io.sentry.SentryBaseEvent sentryBaseEvent) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "ISerializer is required.");
        io.sentry.util.Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.q(iSerializer, sentryBaseEvent, 0));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.resolve(sentryBaseEvent), new io.sentry.p(2, cachedItem), "application/json", null), new io.sentry.p(3, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromProfilingTrace(io.sentry.ProfilingTraceData profilingTraceData, long j, io.sentry.ISerializer iSerializer) {
        java.io.File traceFile = profilingTraceData.getTraceFile();
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.r(traceFile, j, profilingTraceData, iSerializer));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.Profile, new io.sentry.p(14, cachedItem), "application-json", traceFile.getName()), new io.sentry.p(15, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromReplay(final io.sentry.ISerializer iSerializer, final io.sentry.ILogger iLogger, final io.sentry.SentryReplayEvent sentryReplayEvent, final io.sentry.ReplayRecording replayRecording, final boolean z6) {
        final java.io.File videoFile = sentryReplayEvent.getVideoFile();
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new java.util.concurrent.Callable() { // from class: io.sentry.o
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return io.sentry.SentryEnvelopeItem.lambda$fromReplay$21(iSerializer, sentryReplayEvent, replayRecording, videoFile, iLogger, z6);
            }
        });
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.ReplayVideo, new io.sentry.p(7, cachedItem), null, null), new io.sentry.p(11, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromSession(io.sentry.ISerializer iSerializer, io.sentry.Session session) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "ISerializer is required.");
        io.sentry.util.Objects.requireNonNull(session, "Session is required.");
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.q(iSerializer, session, 4));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.Session, new io.sentry.p(0, cachedItem), "application/json", null), new io.sentry.p(1, cachedItem));
    }

    public static io.sentry.SentryEnvelopeItem fromUserFeedback(io.sentry.ISerializer iSerializer, io.sentry.UserFeedback userFeedback) {
        io.sentry.util.Objects.requireNonNull(iSerializer, "ISerializer is required.");
        io.sentry.util.Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        io.sentry.SentryEnvelopeItem.CachedItem cachedItem = new io.sentry.SentryEnvelopeItem.CachedItem(new io.sentry.q(iSerializer, userFeedback, 1));
        return new io.sentry.SentryEnvelopeItem(new io.sentry.SentryEnvelopeItemHeader(io.sentry.SentryItemType.UserFeedback, new io.sentry.p(4, cachedItem), "application/json", null), new io.sentry.p(5, cachedItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromAttachment$12(io.sentry.Attachment attachment, long j, io.sentry.ISerializer iSerializer, io.sentry.ILogger iLogger) throws io.sentry.exception.SentryEnvelopeException {
        if (attachment.getBytes() != null) {
            byte[] bytes = attachment.getBytes();
            ensureAttachmentSizeLimit(bytes.length, j, attachment.getFilename());
            return bytes;
        }
        if (attachment.getSerializable() != null) {
            byte[] bArrBytesFrom = io.sentry.util.JsonSerializationUtils.bytesFrom(iSerializer, iLogger, attachment.getSerializable());
            if (bArrBytesFrom != null) {
                ensureAttachmentSizeLimit(bArrBytesFrom.length, j, attachment.getFilename());
                return bArrBytesFrom;
            }
        } else if (attachment.getPathname() != null) {
            return io.sentry.util.FileUtils.readBytesFromFile(attachment.getPathname(), j);
        }
        throw new io.sentry.exception.SentryEnvelopeException(Y6.f.h("Couldn't attach the attachment ", attachment.getFilename(), ".\nPlease check that either bytes, serializable or a path is set."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromAttachment$13(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromCheckIn$10(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromCheckIn$9(io.sentry.ISerializer iSerializer, io.sentry.CheckIn checkIn) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(checkIn, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromClientReport$18(io.sentry.ISerializer iSerializer, io.sentry.clientreport.ClientReport clientReport) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(clientReport, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromClientReport$19(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromEvent$3(io.sentry.ISerializer iSerializer, io.sentry.SentryBaseEvent sentryBaseEvent) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryBaseEvent, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromEvent$4(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromProfilingTrace$15(java.io.File file, long j, io.sentry.ProfilingTraceData profilingTraceData, io.sentry.ISerializer iSerializer) throws io.sentry.exception.SentryEnvelopeException {
        if (!file.exists()) {
            throw new io.sentry.exception.SentryEnvelopeException(Y6.f.h("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
        }
        java.lang.String strEncodeToString = io.sentry.vendor.Base64.encodeToString(io.sentry.util.FileUtils.readBytesFromFile(file.getPath(), j), 3);
        if (strEncodeToString.isEmpty()) {
            throw new io.sentry.exception.SentryEnvelopeException("Profiling trace file is empty");
        }
        profilingTraceData.setSampledProfile(strEncodeToString);
        profilingTraceData.readDeviceCpuFrequencies();
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profilingTraceData, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (java.lang.Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.IOException e6) {
                throw new io.sentry.exception.SentryEnvelopeException("Failed to serialize profiling trace data\n" + e6.getMessage());
            }
        } catch (java.lang.Throwable th5) {
            file.delete();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromProfilingTrace$16(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromReplay$21(io.sentry.ISerializer iSerializer, io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.ReplayRecording replayRecording, java.io.File file, io.sentry.ILogger iLogger, boolean z6) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    iSerializer.serialize(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(io.sentry.SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (replayRecording != null) {
                        iSerializer.serialize(replayRecording, bufferedWriter);
                        linkedHashMap.put(io.sentry.SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bytesFromFile = io.sentry.util.FileUtils.readBytesFromFile(file.getPath(), io.sentry.SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE);
                        if (bytesFromFile.length > 0) {
                            linkedHashMap.put(io.sentry.SentryItemType.ReplayVideo.getItemType(), bytesFromFile);
                        }
                    }
                    byte[] bArrSerializeToMsgpack = serializeToMsgpack(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z6) {
                            io.sentry.util.FileUtils.deleteRecursively(file.getParentFile());
                            return bArrSerializeToMsgpack;
                        }
                        file.delete();
                    }
                    return bArrSerializeToMsgpack;
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            try {
                iLogger.log(io.sentry.SentryLevel.ERROR, "Could not serialize replay recording", th5);
                return null;
            } finally {
                if (file != null) {
                    if (z6) {
                        io.sentry.util.FileUtils.deleteRecursively(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromReplay$22(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromSession$0(io.sentry.ISerializer iSerializer, io.sentry.Session session) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromSession$1(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromUserFeedback$6(io.sentry.ISerializer iSerializer, io.sentry.UserFeedback userFeedback) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(userFeedback, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$fromUserFeedback$7(io.sentry.SentryEnvelopeItem.CachedItem cachedItem) {
        return java.lang.Integer.valueOf(cachedItem.getBytes().length);
    }

    private static byte[] serializeToMsgpack(java.util.Map<java.lang.String, byte[]> map) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (java.util.Map.Entry<java.lang.String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(UTF_8);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public io.sentry.clientreport.ClientReport getClientReport(io.sentry.ISerializer iSerializer) throws java.io.IOException {
        io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != io.sentry.SentryItemType.ClientReport) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(getData()), UTF_8));
        try {
            io.sentry.clientreport.ClientReport clientReport = (io.sentry.clientreport.ClientReport) iSerializer.deserialize(bufferedReader, io.sentry.clientreport.ClientReport.class);
            bufferedReader.close();
            return clientReport;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] getData() {
        java.util.concurrent.Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    public io.sentry.SentryEvent getEvent(io.sentry.ISerializer iSerializer) throws java.io.IOException {
        io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != io.sentry.SentryItemType.Event) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(getData()), UTF_8));
        try {
            io.sentry.SentryEvent sentryEvent = (io.sentry.SentryEvent) iSerializer.deserialize(bufferedReader, io.sentry.SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public io.sentry.SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    public io.sentry.protocol.SentryTransaction getTransaction(io.sentry.ISerializer iSerializer) throws java.io.IOException {
        io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != io.sentry.SentryItemType.Transaction) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(getData()), UTF_8));
        try {
            io.sentry.protocol.SentryTransaction sentryTransaction = (io.sentry.protocol.SentryTransaction) iSerializer.deserialize(bufferedReader, io.sentry.protocol.SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public SentryEnvelopeItem(io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader, java.util.concurrent.Callable<byte[]> callable) {
        this.header = (io.sentry.SentryEnvelopeItemHeader) io.sentry.util.Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (java.util.concurrent.Callable) io.sentry.util.Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }
}
