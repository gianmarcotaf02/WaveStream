package io.sentry.android.replay;

import N7.o;
import N7.p;
import O7.q;
import O7.r;
import O7.x;
import Y6.f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.D;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.DateUtils;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ReplayRecording;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.h;
import p078i6.t;
import p078i6.u;
import p078i6.w;
import p160s6.k;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001cJQ\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\u0014H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010F\u001a\b\u0012\u0004\u0012\u00020\b0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Jj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010P\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010C¨\u0006R"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "Ljava/io/Closeable;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)V", "Lio/sentry/android/replay/ReplayFrame;", "frame", "", "encode", "(Lio/sentry/android/replay/ReplayFrame;)Z", "Ljava/io/File;", "file", "Lh6/A;", "deleteFile", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", "screen", "addFrame$sentry_android_replay_release", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "addFrame", "screenshot", "(Ljava/io/File;JLjava/lang/String;)V", "duration", "from", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "height", "width", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "videoFile", "Lio/sentry/android/replay/GeneratedVideo;", "createVideoOf", "(JJIIIIILjava/io/File;)Lio/sentry/android/replay/GeneratedVideo;", "until", "rotate$sentry_android_replay_release", "(J)Ljava/lang/String;", "rotate", "close", "()V", SubscriberAttributeKt.JSON_NAME_KEY, "value", "persistSegmentValues$sentry_android_replay_release", "(Ljava/lang/String;Ljava/lang/String;)V", "persistSegmentValues", "Lio/sentry/SentryOptions;", "Lio/sentry/protocol/SentryId;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/util/AutoClosableReentrantLock;", "encoderLock", "Lio/sentry/util/AutoClosableReentrantLock;", SentryStackFrame.JsonKeys.LOCK, "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "encoder", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "replayCacheDir$delegate", "Lh6/h;", "getReplayCacheDir$sentry_android_replay_release", "()Ljava/io/File;", "replayCacheDir", "", SentryStackTrace.JsonKeys.FRAMES, "Ljava/util/List;", "getFrames$sentry_android_replay_release", "()Ljava/util/List;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "ongoingSegment", "Ljava/util/LinkedHashMap;", "ongoingSegmentFile$delegate", "getOngoingSegmentFile$sentry_android_replay_release", "ongoingSegmentFile", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayCache implements Closeable, AutoCloseable {
    public static final String ONGOING_SEGMENT = ".ongoing_segment";
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final String SEGMENT_KEY_HEIGHT = "config.height";
    public static final String SEGMENT_KEY_ID = "segment.id";
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final String SEGMENT_KEY_WIDTH = "config.width";
    private SimpleVideoEncoder encoder;
    private final AutoClosableReentrantLock encoderLock;
    private final List<ReplayFrame> frames;
    private final AtomicBoolean isClosed;
    private final AutoClosableReentrantLock lock;
    private final LinkedHashMap<String, String> ongoingSegment;

    private final h ongoingSegmentFile;
    private final SentryOptions options;

    private final h replayCacheDir;
    private final SentryId replayId;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/ReplayCache$Companion;", "", "<init>", "()V", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "Ljava/io/File;", "makeReplayCacheDir", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)Ljava/io/File;", "Lkotlin/Function1;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "Lio/sentry/android/replay/LastSegmentData;", "fromDisk$sentry_android_replay_release", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;Lx6/j;)Lio/sentry/android/replay/LastSegmentData;", "fromDisk", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public static final boolean fromDisk$lambda$3(ReplayCache cache, File file, String name) {
            m.e(cache, "$cache");
            m.d(name, "name");
            if (x.q0(name, ".jpg", false)) {
                File file2 = new File(file, name);
                String name2 = file2.getName();
                m.d(name2, "getName(...)");
                Long lA0 = x.A0(q.n1(name2, ".", name2));
                if (lA0 != null) {
                    ReplayCache.addFrame$default(cache, file2, lA0.longValue(), null, 4, null);
                }
            }
            return false;
        }

        public static LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, j jVar, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                jVar = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, jVar);
        }

        public final LastSegmentData fromDisk$sentry_android_replay_release(SentryOptions options, SentryId replayId, j replayCacheProvider) throws IOException {
            Date dateTime;
            SentryReplayEvent.ReplayType replayTypeValueOf;
            LastSegmentData lastSegmentData;
            final ReplayCache replayCache;
            Iterable linkedList;
            String str = "";
            m.e(options, "options");
            m.e(replayId, "replayId");
            File fileMakeReplayCacheDir = makeReplayCacheDir(options, replayId);
            File file = new File(fileMakeReplayCacheDir, ReplayCache.ONGOING_SEGMENT);
            if (!file.exists()) {
                options.getLogger().log(SentryLevel.DEBUG, "No ongoing segment found for replay: %s", replayId);
                FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), O7.a.f8024b), 8192);
            try {
                Iterator it = ((N7.a) o.h0(new p(5, bufferedReader))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List listB1 = q.b1((String) it.next(), new String[]{"="}, 2, 2);
                    linkedHashMap.put((String) listB1.get(0), (String) listB1.get(1));
                }
                bufferedReader.close();
                String str2 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_HEIGHT);
                Integer numZ0 = str2 != null ? x.z0(str2) : null;
                String str3 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_WIDTH);
                Integer numZ1 = str3 != null ? x.z0(str3) : null;
                String str4 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_FRAME_RATE);
                Integer numZ2 = str4 != null ? x.z0(str4) : null;
                String str5 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_BIT_RATE);
                Integer numZ3 = str5 != null ? x.z0(str5) : null;
                String str6 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_ID);
                Integer numZ4 = str6 != null ? x.z0(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_TIMESTAMP);
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateTime = DateUtils.getDateTime(str7);
                } catch (Throwable unused) {
                    dateTime = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_TYPE);
                    if (str8 != null) {
                        str = str8;
                    }
                    replayTypeValueOf = SentryReplayEvent.ReplayType.valueOf(str);
                } catch (Throwable unused2) {
                    replayTypeValueOf = null;
                }
                if (numZ0 == null || numZ1 == null || numZ2 == null || numZ3 == null || numZ4 == null) {
                    lastSegmentData = null;
                } else {
                    lastSegmentData = null;
                    if (numZ4.intValue() != -1 && dateTime != null && replayTypeValueOf != null) {
                        ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(numZ1.intValue(), numZ0.intValue(), 1.0f, 1.0f, numZ2.intValue(), numZ3.intValue());
                        if (replayCacheProvider == null || (replayCache = (ReplayCache) replayCacheProvider.invoke(replayId)) == null) {
                            replayCache = new ReplayCache(options, replayId);
                        }
                        File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
                        if (replayCacheDir$sentry_android_replay_release != null) {
                            replayCacheDir$sentry_android_replay_release.listFiles(new FilenameFilter() {
                                @Override
                                public final boolean accept(File file2, String str9) {
                                    return ReplayCache.Companion.fromDisk$lambda$3(replayCache, file2, str9);
                                }
                            });
                        }
                        if (replayCache.getFrames$sentry_android_replay_release().isEmpty()) {
                            options.getLogger().log(SentryLevel.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                            return null;
                        }
                        List<ReplayFrame> frames$sentry_android_replay_release = replayCache.getFrames$sentry_android_replay_release();
                        if (frames$sentry_android_replay_release.size() > 1) {
                            t.L0(new Comparator() {
                                @Override
                                public final int compare(T t9, T t10) {
                                    return q0.o(Long.valueOf(((ReplayFrame) t9).getTimestamp()), Long.valueOf(((ReplayFrame) t10).getTimestamp()));
                                }
                            }, frames$sentry_android_replay_release);
                        }
                        SentryReplayEvent.ReplayType replayType = SentryReplayEvent.ReplayType.SESSION;
                        int iIntValue = replayTypeValueOf == replayType ? numZ4.intValue() : 0;
                        if (replayTypeValueOf != replayType) {
                            dateTime = DateUtils.getDateTime(((ReplayFrame) p078i6.o.h1(replayCache.getFrames$sentry_android_replay_release())).getTimestamp());
                            m.d(dateTime, "{\n                // in ….timestamp)\n            }");
                        }
                        Date date = dateTime;
                        long timestamp = (((ReplayFrame) p078i6.o.q1(replayCache.getFrames$sentry_android_replay_release())).getTimestamp() - date.getTime()) + ((long) (1000 / numZ2.intValue()));
                        String str9 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_RECORDING);
                        if (str9 != null) {
                            ReplayRecording replayRecording = (ReplayRecording) options.getSerializer().deserialize(new StringReader(str9), ReplayRecording.class);
                            if ((replayRecording != null ? replayRecording.getPayload() : null) != null) {
                                List<? extends RRWebEvent> payload = replayRecording.getPayload();
                                m.b(payload);
                                linkedList = new LinkedList(payload);
                            } else {
                                linkedList = null;
                            }
                            if (linkedList == null) {
                                linkedList = w.f23205h;
                            }
                        } else {
                            linkedList = w.f23205h;
                        }
                        return new LastSegmentData(screenshotRecorderConfig, replayCache, date, iIntValue, timestamp, replayTypeValueOf, (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START), p078i6.o.I1(linkedList, new Comparator() {
                            @Override
                            public final int compare(T t9, T t10) {
                                return q0.o(Long.valueOf(((RRWebEvent) t9).getTimestamp()), Long.valueOf(((RRWebEvent) t10).getTimestamp()));
                            }
                        }));
                    }
                }
                options.getLogger().log(SentryLevel.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                FileUtils.deleteRecursively(fileMakeReplayCacheDir);
                return lastSegmentData;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1833d1.l(bufferedReader, th);
                    throw th2;
                }
            }
        }

        public final File makeReplayCacheDir(SentryOptions options, SentryId replayId) {
            m.e(options, "options");
            m.e(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            m.b(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(SentryOptions options, SentryId replayId) {
        m.e(options, "options");
        m.e(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new AutoClosableReentrantLock();
        this.lock = new AutoClosableReentrantLock();
        this.replayCacheDir = D.B(new ReplayCache$replayCacheDir$2(this));
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile = D.B(new ReplayCache$ongoingSegmentFile$2(this));
    }

    public static void addFrame$default(ReplayCache replayCache, File file, long j, String str, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j, str);
    }

    public static void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j, String str, int i3, Object obj) throws IOException {
        if ((i3 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j, str);
    }

    public static GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j, long j9, int i3, int i9, int i10, int i11, int i12, File file, int i13, Object obj) {
        int i14;
        File file2;
        if ((i13 & 128) != 0) {
            i14 = i3;
            file2 = new File(replayCache.getReplayCacheDir$sentry_android_replay_release(), f.e(i14, ".mp4"));
        } else {
            i14 = i3;
            file2 = file;
        }
        return replayCache.createVideoOf(j, j9, i14, i9, i10, i11, i12, file2);
    }

    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    m.d(bitmap, "bitmap");
                    simpleVideoEncoder.encode(bitmap);
                }
                D.h(iSentryLifecycleTokenAcquire, null);
                bitmap.recycle();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    D.h(iSentryLifecycleTokenAcquire, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
            return false;
        }
    }

    public final void addFrame(File screenshot, long frameTimestamp, String screen) {
        m.e(screenshot, "screenshot");
        this.frames.add(new ReplayFrame(screenshot, frameTimestamp, screen));
    }

    public final void addFrame$sentry_android_replay_release(Bitmap bitmap, long frameTimestamp, String screen) throws IOException {
        m.e(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), frameTimestamp + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            addFrame(file, frameTimestamp, screen);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1833d1.l(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            D.h(iSentryLifecycleTokenAcquire, null);
            this.isClosed.set(true);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public final GeneratedVideo createVideoOf(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, File videoFile) {
        ISentryLifecycleToken iSentryLifecycleToken;
        int i3;
        m.e(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
            try {
                SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 4, null);
                simpleVideoEncoder.start();
                D.h(iSentryLifecycleToken, null);
                this.encoder = simpleVideoEncoder;
                long j = ((long) 1000) / ((long) frameRate);
                ReplayFrame replayFrame = (ReplayFrame) p078i6.o.h1(this.frames);
                long j9 = from + duration;
                D6.j jVarX = r.X(from, j9);
                m.e(jVarX, "<this>");
                r.p(j > 0, Long.valueOf(j));
                long j10 = jVarX.j > 0 ? j : -j;
                long j11 = jVarX.f2464h;
                long j12 = new D6.h(j11, jVarX.f2465i, j10).f2465i;
                if ((j10 > 0 && j11 <= j12) || (j10 < 0 && j12 <= j11)) {
                    i3 = 0;
                    while (true) {
                        for (ReplayFrame replayFrame2 : this.frames) {
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
                    this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    deleteFile(videoFile);
                    return null;
                }
                ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.encoderLock.acquire();
                try {
                    SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                    if (simpleVideoEncoder2 != null) {
                        simpleVideoEncoder2.release();
                    }
                    SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                    long duration2 = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                    this.encoder = null;
                    D.h(iSentryLifecycleTokenAcquire2, null);
                    rotate$sentry_android_replay_release(j9);
                    return new GeneratedVideo(videoFile, i3, duration2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        D.h(iSentryLifecycleTokenAcquire2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                try {
                    throw th4;
                } catch (Throwable th5) {
                    D.h(iSentryLifecycleToken, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            iSentryLifecycleToken = iSentryLifecycleTokenAcquire;
        }
    }

    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(String key, String value) {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        m.e(key, "key");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), O7.a.f8024b), 8192);
                try {
                    N7.m mVarH0 = o.h0(new p(5, bufferedReader));
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator it = ((N7.a) mVarH0).iterator();
                    while (it.hasNext()) {
                        List listB1 = q.b1((String) it.next(), new String[]{"="}, 2, 2);
                        linkedHashMap.put((String) listB1.get(0), (String) listB1.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1833d1.l(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                m.d(setEntrySet, "ongoingSegment.entries");
                k.T(ongoingSegmentFile$sentry_android_replay_release4, p078i6.o.o1(setEntrySet, "\n", null, null, ReplayCache$persistSegmentValues$1$2.INSTANCE, 30));
            }
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                D.h(iSentryLifecycleTokenAcquire, th3);
                throw th4;
            }
        }
    }

    public final String rotate$sentry_android_replay_release(long until) {
        A a2 = new A();
        u.Q0(this.frames, new ReplayCache$rotate$1(until, this, a2));
        return (String) a2.f24539h;
    }
}
