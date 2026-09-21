package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001cJQ\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\u0014H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010F\u001a\b\u0012\u0004\u0012\u00020\b0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Jj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010P\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010C¨\u0006R"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "Ljava/io/Closeable;", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)V", "Lio/sentry/android/replay/ReplayFrame;", "frame", "", "encode", "(Lio/sentry/android/replay/ReplayFrame;)Z", "Ljava/io/File;", "file", "Lh6/A;", "deleteFile", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", "screen", "addFrame$sentry_android_replay_release", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "addFrame", "screenshot", "(Ljava/io/File;JLjava/lang/String;)V", "duration", "from", "", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.SEGMENT_ID, "height", "width", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "videoFile", "Lio/sentry/android/replay/GeneratedVideo;", "createVideoOf", "(JJIIIIILjava/io/File;)Lio/sentry/android/replay/GeneratedVideo;", "until", "rotate$sentry_android_replay_release", "(J)Ljava/lang/String;", "rotate", "close", "()V", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "value", "persistSegmentValues$sentry_android_replay_release", "(Ljava/lang/String;Ljava/lang/String;)V", "persistSegmentValues", "Lio/sentry/SentryOptions;", "Lio/sentry/protocol/SentryId;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/util/AutoClosableReentrantLock;", "encoderLock", "Lio/sentry/util/AutoClosableReentrantLock;", io.sentry.protocol.SentryStackFrame.JsonKeys.LOCK, "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "encoder", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "replayCacheDir$delegate", "Lh6/h;", "getReplayCacheDir$sentry_android_replay_release", "()Ljava/io/File;", "replayCacheDir", "", io.sentry.protocol.SentryStackTrace.JsonKeys.FRAMES, "Ljava/util/List;", "getFrames$sentry_android_replay_release", "()Ljava/util/List;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "ongoingSegment", "Ljava/util/LinkedHashMap;", "ongoingSegmentFile$delegate", "getOngoingSegmentFile$sentry_android_replay_release", "ongoingSegmentFile", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache implements java.io.Closeable, java.lang.AutoCloseable {
    public static final java.lang.String ONGOING_SEGMENT = ".ongoing_segment";
    public static final java.lang.String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final java.lang.String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final java.lang.String SEGMENT_KEY_HEIGHT = "config.height";
    public static final java.lang.String SEGMENT_KEY_ID = "segment.id";
    public static final java.lang.String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final java.lang.String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final java.lang.String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final java.lang.String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final java.lang.String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final java.lang.String SEGMENT_KEY_WIDTH = "config.width";
    private io.sentry.android.replay.video.SimpleVideoEncoder encoder;
    private final io.sentry.util.AutoClosableReentrantLock encoderLock;
    private final java.util.List<io.sentry.android.replay.ReplayFrame> frames;
    private final java.util.concurrent.atomic.AtomicBoolean isClosed;
    private final io.sentry.util.AutoClosableReentrantLock lock;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> ongoingSegment;

    /* JADX INFO: renamed from: ongoingSegmentFile$delegate, reason: from kotlin metadata */
    private final p070h6.h ongoingSegmentFile;
    private final io.sentry.SentryOptions options;

    /* JADX INFO: renamed from: replayCacheDir$delegate, reason: from kotlin metadata */
    private final p070h6.h replayCacheDir;
    private final io.sentry.protocol.SentryId replayId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.sentry.android.replay.ReplayCache.Companion INSTANCE = new io.sentry.android.replay.ReplayCache.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/ReplayCache$Companion;", "", "<init>", "()V", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "Ljava/io/File;", "makeReplayCacheDir", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)Ljava/io/File;", "Lkotlin/Function1;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "Lio/sentry/android/replay/LastSegmentData;", "fromDisk$sentry_android_replay_release", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;Lx6/j;)Lio/sentry/android/replay/LastSegmentData;", "fromDisk", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(io.sentry.android.replay.ReplayCache cache, java.io.File file, java.lang.String name) {
            kotlin.jvm.internal.m.e(cache, "$cache");
            kotlin.jvm.internal.m.d(name, "name");
            if (O7.x.q0(name, ".jpg", false)) {
                java.io.File file2 = new java.io.File(file, name);
                java.lang.String name2 = file2.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                java.lang.Long lA0 = O7.x.A0(O7.q.n1(name2, ".", name2));
                if (lA0 != null) {
                    io.sentry.android.replay.ReplayCache.addFrame$default(cache, file2, lA0.longValue(), null, 4, null);
                }
            }
            return false;
        }

        public static /* synthetic */ io.sentry.android.replay.LastSegmentData fromDisk$sentry_android_replay_release$default(io.sentry.android.replay.ReplayCache.Companion companion, io.sentry.SentryOptions sentryOptions, io.sentry.protocol.SentryId sentryId, p194x6.j jVar, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                jVar = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, jVar);
        }

        /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
        public final io.sentry.android.replay.LastSegmentData fromDisk$sentry_android_replay_release(io.sentry.SentryOptions options, io.sentry.protocol.SentryId replayId, p194x6.j replayCacheProvider) throws java.io.IOException {
            java.util.Date dateTime;
            io.sentry.SentryReplayEvent.ReplayType replayTypeValueOf;
            io.sentry.android.replay.LastSegmentData lastSegmentData;
            final io.sentry.android.replay.ReplayCache replayCache;
            java.lang.Iterable linkedList;
            java.lang.String str = "";
            kotlin.jvm.internal.m.e(options, "options");
            kotlin.jvm.internal.m.e(replayId, "replayId");
            java.io.File fileMakeReplayCacheDir = makeReplayCacheDir(options, replayId);
            java.io.File file = new java.io.File(fileMakeReplayCacheDir, io.sentry.android.replay.ReplayCache.ONGOING_SEGMENT);
            if (!file.exists()) {
                options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                return null;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), O7.a.f8024b), 8192);
            try {
                java.util.Iterator it = ((N7.a) N7.o.h0(new N7.p(5, bufferedReader))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.List listB1 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{"="}, 2, 2);
                    linkedHashMap.put((java.lang.String) listB1.get(0), (java.lang.String) listB1.get(1));
                }
                bufferedReader.close();
                java.lang.String str2 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_HEIGHT);
                java.lang.Integer numZ0 = str2 != null ? O7.x.z0(str2) : null;
                java.lang.String str3 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_WIDTH);
                java.lang.Integer numZ1 = str3 != null ? O7.x.z0(str3) : null;
                java.lang.String str4 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_FRAME_RATE);
                java.lang.Integer numZ2 = str4 != null ? O7.x.z0(str4) : null;
                java.lang.String str5 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_BIT_RATE);
                java.lang.Integer numZ3 = str5 != null ? O7.x.z0(str5) : null;
                java.lang.String str6 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_ID);
                java.lang.Integer numZ4 = str6 != null ? O7.x.z0(str6) : null;
                try {
                    java.lang.String str7 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_TIMESTAMP);
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateTime = io.sentry.DateUtils.getDateTime(str7);
                } catch (java.lang.Throwable unused) {
                    dateTime = null;
                }
                try {
                    java.lang.String str8 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_TYPE);
                    if (str8 != null) {
                        str = str8;
                    }
                    replayTypeValueOf = io.sentry.SentryReplayEvent.ReplayType.valueOf(str);
                } catch (java.lang.Throwable unused2) {
                    replayTypeValueOf = null;
                }
                if (numZ0 == null || numZ1 == null || numZ2 == null || numZ3 == null || numZ4 == null) {
                    lastSegmentData = null;
                } else {
                    lastSegmentData = null;
                    if (numZ4.intValue() != -1 && dateTime != null && replayTypeValueOf != null) {
                        io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig = new io.sentry.android.replay.ScreenshotRecorderConfig(numZ1.intValue(), numZ0.intValue(), 1.0f, 1.0f, numZ2.intValue(), numZ3.intValue());
                        if (replayCacheProvider == null || (replayCache = (io.sentry.android.replay.ReplayCache) replayCacheProvider.invoke(replayId)) == null) {
                            replayCache = new io.sentry.android.replay.ReplayCache(options, replayId);
                        }
                        java.io.File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
                        if (replayCacheDir$sentry_android_replay_release != null) {
                            replayCacheDir$sentry_android_replay_release.listFiles(new java.io.FilenameFilter() { // from class: io.sentry.android.replay.a
                                @Override // java.io.FilenameFilter
                                public final boolean accept(java.io.File file2, java.lang.String str9) {
                                    return io.sentry.android.replay.ReplayCache.Companion.fromDisk$lambda$3(replayCache, file2, str9);
                                }
                            });
                        }
                        if (replayCache.getFrames$sentry_android_replay_release().isEmpty()) {
                            options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            io.sentry.util.FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                            return null;
                        }
                        java.util.List<io.sentry.android.replay.ReplayFrame> frames$sentry_android_replay_release = replayCache.getFrames$sentry_android_replay_release();
                        if (frames$sentry_android_replay_release.size() > 1) {
                            p078i6.t.L0(new java.util.Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t9, T t10) {
                                    return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((io.sentry.android.replay.ReplayFrame) t9).getTimestamp()), java.lang.Long.valueOf(((io.sentry.android.replay.ReplayFrame) t10).getTimestamp()));
                                }
                            }, frames$sentry_android_replay_release);
                        }
                        io.sentry.SentryReplayEvent.ReplayType replayType = io.sentry.SentryReplayEvent.ReplayType.SESSION;
                        int iIntValue = replayTypeValueOf == replayType ? numZ4.intValue() : 0;
                        if (replayTypeValueOf != replayType) {
                            dateTime = io.sentry.DateUtils.getDateTime(((io.sentry.android.replay.ReplayFrame) p078i6.o.h1(replayCache.getFrames$sentry_android_replay_release())).getTimestamp());
                            kotlin.jvm.internal.m.d(dateTime, "{\n                // in ….timestamp)\n            }");
                        }
                        java.util.Date date = dateTime;
                        long timestamp = (((io.sentry.android.replay.ReplayFrame) p078i6.o.q1(replayCache.getFrames$sentry_android_replay_release())).getTimestamp() - date.getTime()) + ((long) (1000 / numZ2.intValue()));
                        java.lang.String str9 = (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_RECORDING);
                        if (str9 != null) {
                            io.sentry.ReplayRecording replayRecording = (io.sentry.ReplayRecording) options.getSerializer().deserialize(new java.io.StringReader(str9), io.sentry.ReplayRecording.class);
                            if ((replayRecording != null ? replayRecording.getPayload() : null) != null) {
                                java.util.List<? extends io.sentry.rrweb.RRWebEvent> payload = replayRecording.getPayload();
                                kotlin.jvm.internal.m.b(payload);
                                linkedList = new java.util.LinkedList(payload);
                            } else {
                                linkedList = null;
                            }
                            if (linkedList == null) {
                                linkedList = p078i6.w.f23205h;
                            }
                        } else {
                            linkedList = p078i6.w.f23205h;
                        }
                        return new io.sentry.android.replay.LastSegmentData(screenshotRecorderConfig, replayCache, date, iIntValue, timestamp, replayTypeValueOf, (java.lang.String) linkedHashMap.get(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START), p078i6.o.I1(linkedList, new java.util.Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t9, T t10) {
                                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((io.sentry.rrweb.RRWebEvent) t9).getTimestamp()), java.lang.Long.valueOf(((io.sentry.rrweb.RRWebEvent) t10).getTimestamp()));
                            }
                        }));
                    }
                }
                options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                io.sentry.util.FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                return lastSegmentData;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        }

        public final java.io.File makeReplayCacheDir(io.sentry.SentryOptions options, io.sentry.protocol.SentryId replayId) {
            kotlin.jvm.internal.m.e(options, "options");
            kotlin.jvm.internal.m.e(replayId, "replayId");
            java.lang.String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().log(io.sentry.SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new java.lang.Object[0]);
                return null;
            }
            java.lang.String cacheDirPath2 = options.getCacheDirPath();
            kotlin.jvm.internal.m.b(cacheDirPath2);
            java.io.File file = new java.io.File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(io.sentry.SentryOptions options, io.sentry.protocol.SentryId replayId) {
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.encoderLock = new io.sentry.util.AutoClosableReentrantLock();
        this.lock = new io.sentry.util.AutoClosableReentrantLock();
        this.replayCacheDir = com.google.common.util.concurrent.D.B(new io.sentry.android.replay.ReplayCache$replayCacheDir$2(this));
        this.frames = new java.util.ArrayList();
        this.ongoingSegment = new java.util.LinkedHashMap<>();
        this.ongoingSegmentFile = com.google.common.util.concurrent.D.B(new io.sentry.android.replay.ReplayCache$ongoingSegmentFile$2(this));
    }

    public static /* synthetic */ void addFrame$default(io.sentry.android.replay.ReplayCache replayCache, java.io.File file, long j, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(io.sentry.android.replay.ReplayCache replayCache, android.graphics.Bitmap bitmap, long j, java.lang.String str, int i3, java.lang.Object obj) throws java.io.IOException {
        if ((i3 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j, str);
    }

    public static /* synthetic */ io.sentry.android.replay.GeneratedVideo createVideoOf$default(io.sentry.android.replay.ReplayCache replayCache, long j, long j9, int i3, int i9, int i10, int i11, int i12, java.io.File file, int i13, java.lang.Object obj) {
        int i14;
        java.io.File file2;
        if ((i13 & 128) != 0) {
            i14 = i3;
            file2 = new java.io.File(replayCache.getReplayCacheDir$sentry_android_replay_release(), Y6.f.e(i14, ".mp4"));
        } else {
            i14 = i3;
            file2 = file;
        }
        return replayCache.createVideoOf(j, j9, i14, i9, i10, i11, i12, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(java.io.File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (java.lang.Throwable th) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(io.sentry.android.replay.ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
            try {
                io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    kotlin.jvm.internal.m.d(bitmap, "bitmap");
                    simpleVideoEncoder.encode(bitmap);
                }
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                bitmap.recycle();
                return true;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
            return false;
        }
    }

    public final void addFrame(java.io.File screenshot, long frameTimestamp, java.lang.String screen) {
        kotlin.jvm.internal.m.e(screenshot, "screenshot");
        this.frames.add(new io.sentry.android.replay.ReplayFrame(screenshot, frameTimestamp, screen));
    }

    public final void addFrame$sentry_android_replay_release(android.graphics.Bitmap bitmap, long frameTimestamp, java.lang.String screen) throws java.io.IOException {
        kotlin.jvm.internal.m.e(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        java.io.File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        java.io.File file = new java.io.File(getReplayCacheDir$sentry_android_replay_release(), frameTimestamp + ".jpg");
        file.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            addFrame(file, frameTimestamp, screen);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
            this.isClosed.set(true);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public final io.sentry.android.replay.GeneratedVideo createVideoOf(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, java.io.File videoFile) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleToken;
        int i3;
        kotlin.jvm.internal.m.e(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new java.lang.Object[0]);
            return null;
        }
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
            try {
                io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder = new io.sentry.android.replay.video.SimpleVideoEncoder(this.options, new io.sentry.android.replay.video.MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 4, null);
                simpleVideoEncoder.start();
                com.google.common.util.concurrent.D.h(iSentryLifecycleToken, null);
                this.encoder = simpleVideoEncoder;
                long j = ((long) 1000) / ((long) frameRate);
                io.sentry.android.replay.ReplayFrame replayFrame = (io.sentry.android.replay.ReplayFrame) p078i6.o.h1(this.frames);
                long j9 = from + duration;
                D6.j jVarX = O7.r.X(from, j9);
                kotlin.jvm.internal.m.e(jVarX, "<this>");
                O7.r.p(j > 0, java.lang.Long.valueOf(j));
                long j10 = jVarX.j > 0 ? j : -j;
                long j11 = jVarX.f2464h;
                long j12 = new D6.h(j11, jVarX.f2465i, j10).f2465i;
                if ((j10 > 0 && j11 <= j12) || (j10 < 0 && j12 <= j11)) {
                    i3 = 0;
                    while (true) {
                        for (io.sentry.android.replay.ReplayFrame replayFrame2 : this.frames) {
                            long j13 = j11 + j;
                            long timestamp = replayFrame2.getTimestamp();
                            if (j11 <= timestamp && timestamp <= j13) {
                                replayFrame = replayFrame2;
                                break;
                            }
                            if (replayFrame2.getTimestamp() > j13) {
                                break;
                            }
                        }
                        if (encode(replayFrame)) {
                            i3++;
                        } else if (replayFrame != null) {
                            deleteFile(replayFrame.getScreenshot());
                            this.frames.remove(replayFrame);
                            replayFrame = null;
                        }
                        if (j11 == j12) {
                            break;
                        }
                        j11 += j10;
                    }
                } else {
                    i3 = 0;
                }
                if (i3 == 0) {
                    this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new java.lang.Object[0]);
                    deleteFile(videoFile);
                    return null;
                }
                io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.encoderLock.acquire();
                try {
                    io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                    if (simpleVideoEncoder2 != null) {
                        simpleVideoEncoder2.release();
                    }
                    io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                    long duration2 = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                    this.encoder = null;
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire2, null);
                    rotate$sentry_android_replay_release(j9);
                    return new io.sentry.android.replay.GeneratedVideo(videoFile, i3, duration2);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire2, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                java.lang.Throwable th4 = th;
                try {
                    throw th4;
                } catch (java.lang.Throwable th5) {
                    com.google.common.util.concurrent.D.h(iSentryLifecycleToken, th4);
                    throw th5;
                }
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
        }
    }

    public final java.util.List<io.sentry.android.replay.ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final java.io.File getOngoingSegmentFile$sentry_android_replay_release() {
        return (java.io.File) this.ongoingSegmentFile.getValue();
    }

    public final java.io.File getReplayCacheDir$sentry_android_replay_release() {
        return (java.io.File) this.replayCacheDir.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(java.lang.String key, java.lang.String value) {
        java.io.File ongoingSegmentFile$sentry_android_replay_release;
        java.io.File ongoingSegmentFile$sentry_android_replay_release2;
        kotlin.jvm.internal.m.e(key, "key");
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            java.io.File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), O7.a.f8024b), 8192);
                try {
                    N7.m mVarH0 = N7.o.h0(new N7.p(5, bufferedReader));
                    java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap = this.ongoingSegment;
                    java.util.Iterator it = ((N7.a) mVarH0).iterator();
                    while (it.hasNext()) {
                        java.util.List listB1 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{"="}, 2, 2);
                        linkedHashMap.put((java.lang.String) listB1.get(0), (java.lang.String) listB1.get(1));
                    }
                    bufferedReader.close();
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            java.io.File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> setEntrySet = this.ongoingSegment.entrySet();
                kotlin.jvm.internal.m.d(setEntrySet, "ongoingSegment.entries");
                p160s6.k.T(ongoingSegmentFile$sentry_android_replay_release4, p078i6.o.o1(setEntrySet, "\n", null, null, io.sentry.android.replay.ReplayCache$persistSegmentValues$1$2.INSTANCE, 30));
            }
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th3);
                throw th4;
            }
        }
    }

    public final java.lang.String rotate$sentry_android_replay_release(long until) {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        p078i6.u.Q0(this.frames, new io.sentry.android.replay.ReplayCache$rotate$1(until, this, a2));
        return (java.lang.String) a2.f24539h;
    }
}
