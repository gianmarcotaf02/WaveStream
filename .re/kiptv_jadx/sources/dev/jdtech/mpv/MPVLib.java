package dev.jdtech.mpv;

/* JADX INFO: loaded from: classes4.dex */
public class MPVLib {
    public static final int MPV_EVENT_AUDIO_RECONFIG = 18;
    public static final int MPV_EVENT_CLIENT_MESSAGE = 16;
    public static final int MPV_EVENT_COMMAND_REPLY = 5;
    public static final int MPV_EVENT_END_FILE = 7;
    public static final int MPV_EVENT_FILE_LOADED = 8;
    public static final int MPV_EVENT_GET_PROPERTY_REPLY = 3;
    public static final int MPV_EVENT_HOOK = 25;
    public static final int MPV_EVENT_LOG_MESSAGE = 2;
    public static final int MPV_EVENT_NONE = 0;
    public static final int MPV_EVENT_PLAYBACK_RESTART = 21;
    public static final int MPV_EVENT_PROPERTY_CHANGE = 22;
    public static final int MPV_EVENT_QUEUE_OVERFLOW = 24;
    public static final int MPV_EVENT_SEEK = 20;
    public static final int MPV_EVENT_SET_PROPERTY_REPLY = 4;
    public static final int MPV_EVENT_SHUTDOWN = 1;
    public static final int MPV_EVENT_START_FILE = 6;
    public static final int MPV_EVENT_VIDEO_RECONFIG = 17;
    public static final int MPV_FORMAT_BYTE_ARRAY = 9;
    public static final int MPV_FORMAT_DOUBLE = 5;
    public static final int MPV_FORMAT_FLAG = 3;
    public static final int MPV_FORMAT_INT64 = 4;
    public static final int MPV_FORMAT_NODE = 6;
    public static final int MPV_FORMAT_NODE_ARRAY = 7;
    public static final int MPV_FORMAT_NODE_MAP = 8;
    public static final int MPV_FORMAT_NONE = 0;
    public static final int MPV_FORMAT_OSD_STRING = 2;
    public static final int MPV_FORMAT_STRING = 1;
    public static final int MPV_LOG_LEVEL_DEBUG = 60;
    public static final int MPV_LOG_LEVEL_ERROR = 20;
    public static final int MPV_LOG_LEVEL_FATAL = 10;
    public static final int MPV_LOG_LEVEL_INFO = 40;
    public static final int MPV_LOG_LEVEL_NONE = 0;
    public static final int MPV_LOG_LEVEL_TRACE = 70;
    public static final int MPV_LOG_LEVEL_V = 50;
    public static final int MPV_LOG_LEVEL_WARN = 30;
    private static final java.util.List<p016b6.b> log_observers;
    private static final java.util.List<p016b6.a> observers;

    static {
        java.lang.String[] strArr = {"mpv", "player"};
        for (int i3 = 0; i3 < 2; i3++) {
            java.lang.System.loadLibrary(strArr[i3]);
        }
        observers = new java.util.ArrayList();
        log_observers = new java.util.ArrayList();
    }

    public static void addLogObserver(p016b6.b bVar) {
        java.util.List<p016b6.b> list = log_observers;
        synchronized (list) {
            list.add(bVar);
        }
    }

    public static void addObserver(p016b6.a aVar) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            list.add(aVar);
        }
    }

    public static native void attachSurface(android.view.Surface surface);

    public static native void command(java.lang.String[] strArr);

    public static native void create(android.content.Context context);

    public static native void destroy();

    public static native void detachSurface();

    public static void event(int i3) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    p085j5.K k9 = (p085j5.K) it.next();
                    k9.f24010p.post(new S.e(k9, i3, 2));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(java.lang.String str, long j) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    ((p085j5.K) it.next()).z(str, j);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static native java.lang.Boolean getPropertyBoolean(java.lang.String str);

    public static native java.lang.Double getPropertyDouble(java.lang.String str);

    public static native java.lang.Integer getPropertyInt(java.lang.String str);

    public static native java.lang.String getPropertyString(java.lang.String str);

    public static native void init();

    public static void logMessage(java.lang.String str, int i3, java.lang.String str2) {
        java.util.List<p016b6.b> list = log_observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.b> it = list.iterator();
                while (it.hasNext()) {
                    ((p085j5.C2531v) it.next()).a(str, i3, str2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static native void observeProperty(java.lang.String str, int i3);

    public static void removeLogObserver(p016b6.b bVar) {
        java.util.List<p016b6.b> list = log_observers;
        synchronized (list) {
            list.remove(bVar);
        }
    }

    public static void removeObserver(p016b6.a aVar) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            list.remove(aVar);
        }
    }

    public static native int setOptionString(java.lang.String str, java.lang.String str2);

    public static native void setPropertyBoolean(java.lang.String str, java.lang.Boolean bool);

    public static native void setPropertyDouble(java.lang.String str, java.lang.Double d4);

    public static native void setPropertyInt(java.lang.String str, java.lang.Integer num);

    public static native void setPropertyString(java.lang.String str, java.lang.String str2);

    public static void eventProperty(java.lang.String str, double d4) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    ((p085j5.K) it.next()).y(str, d4);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(final java.lang.String property, final boolean z6) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    final p085j5.K k9 = (p085j5.K) it.next();
                    k9.getClass();
                    kotlin.jvm.internal.m.e(property, "property");
                    k9.f23989d0++;
                    if (property.equals("vo-configured")) {
                        k9.f24019w = z6;
                    }
                    k9.f24010p.post(new java.lang.Runnable() { // from class: j5.r
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.lang.Runnable
                        public final void run() {
                            p085j5.K k10 = k9;
                            java.lang.String str = property;
                            boolean z9 = z6;
                            int iHashCode = str.hashCode();
                            java.lang.Object obj = p099l5.k.f24786a;
                            switch (iHashCode) {
                                case -1539434030:
                                    if (str.equals("vo-configured") && z9 && !k10.f23965F) {
                                        k10.f23965F = true;
                                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - k10.y;
                                        int i3 = k10.f23993f0;
                                        int i9 = k10.f23994g0;
                                        java.lang.String str2 = k10.f24016t;
                                        if (str2 == null) {
                                            str2 = "?";
                                        }
                                        p085j5.K.w("mpv_vo_configured", "after=" + jElapsedRealtime + "ms " + i3 + "x" + i9 + " hwdec=" + str2);
                                    }
                                    break;
                                case 106440182:
                                    if (str.equals("pause")) {
                                        k10.f24014r = z9;
                                        if (!(k10.f23995h.getValue() instanceof p099l5.g)) {
                                            V7.n0 n0Var = k10.f23995h;
                                            if (z9) {
                                                obj = p099l5.j.f24785a;
                                            }
                                            n0Var.getClass();
                                            n0Var.i(null, obj);
                                        }
                                    }
                                    break;
                                case 1029320607:
                                    if (str.equals("paused-for-cache")) {
                                        if (z9 && !k10.f24014r && !(k10.f23995h.getValue() instanceof p099l5.g)) {
                                            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                            if (jElapsedRealtime2 - k10.f23961B >= androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                                                k10.f23961B = jElapsedRealtime2;
                                                long j = k10.f23991e0;
                                                double d4 = k10.f24007n0;
                                                java.lang.StringBuilder sbU = p121o0.p.u(j, "position=", "ms cache=");
                                                sbU.append(d4);
                                                sbU.append(androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS);
                                                p085j5.K.w("mpv_buffering", sbU.toString());
                                            }
                                            V7.n0 n0Var2 = k10.f23995h;
                                            p099l5.e eVar = p099l5.e.f24780a;
                                            n0Var2.getClass();
                                            n0Var2.i(null, eVar);
                                            break;
                                        } else if (!z9 && !k10.f24014r && (k10.f23995h.getValue() instanceof p099l5.e)) {
                                            V7.n0 n0Var3 = k10.f23995h;
                                            n0Var3.getClass();
                                            n0Var3.i(null, obj);
                                            break;
                                        }
                                    }
                                    break;
                                case 1079051649:
                                    if (str.equals("eof-reached") && z9 && k10.f23971M && !k10.f23974P) {
                                        V7.n0 n0Var4 = k10.f23995h;
                                        p099l5.f fVar = p099l5.f.f24781a;
                                        n0Var4.getClass();
                                        n0Var4.i(null, fVar);
                                    }
                                    break;
                            }
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(java.lang.String str, java.lang.String str2) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    ((p085j5.K) it.next()).A(str, str2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void eventProperty(java.lang.String str) {
        java.util.List<p016b6.a> list = observers;
        synchronized (list) {
            try {
                java.util.Iterator<p016b6.a> it = list.iterator();
                while (it.hasNext()) {
                    ((p085j5.K) it.next()).x(str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
