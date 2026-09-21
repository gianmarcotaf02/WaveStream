package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements p085j5.O {
    public static final p085j5.Q Companion = new p085j5.Q();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f24069T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f24070A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24071B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24072C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f24073D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f24074E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f24075F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public org.videolan.libvlc.interfaces.IMedia.Stats f24076G;
    public S7.w0 H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p085j5.b0 f24077I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f24078J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public java.lang.Object f24079K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public java.lang.Object f24080L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public java.lang.Object f24081M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public java.lang.Object f24082N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public java.lang.Integer f24083O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public java.lang.Integer f24084P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f24085Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f24086R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final F1.e f24087S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f24088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f24089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f24091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final org.videolan.libvlc.LibVLC f24092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.videolan.libvlc.MediaPlayer f24093f;
    public org.videolan.libvlc.Media g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f24094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f24095i;
    public final V7.n0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.W f24096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.n0 f24097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.W f24098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.n0 f24099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X7.c f24100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.os.Handler f24101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.Long f24102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S7.C0895k f24105t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S7.w0 f24106u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public S7.w0 f24107v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24109x;
    public p028c8.b y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f24110z;

    static {
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new p085j5.L(1));
        kotlin.jvm.internal.m.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f24069T = executorServiceNewSingleThreadExecutor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb  */
    public a0(android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.String hardwareAcceleration, java.lang.String deinterlacingMode, p108m5.l subtitleStyle) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(hardwareAcceleration, "hardwareAcceleration");
        kotlin.jvm.internal.m.e(deinterlacingMode, "deinterlacingMode");
        kotlin.jvm.internal.m.e(subtitleStyle, "subtitleStyle");
        this.f24088a = str;
        this.f24089b = num;
        this.f24090c = hardwareAcceleration;
        this.f24091d = deinterlacingMode;
        android.content.Context applicationContext = context.getApplicationContext();
        java.util.ArrayList arrayListD0 = p078i6.p.D0("--stats", "--no-sub-autodetect-file", "--no-drop-late-frames", "--no-skip-frames");
        arrayListD0.add("--network-caching=" + ((num != null ? num.intValue() : 2) * 1000));
        if (hardwareAcceleration.equals("on")) {
            arrayListD0.add("--avcodec-hw=any");
        } else if (hardwareAcceleration.equals("off")) {
            arrayListD0.add("--avcodec-hw=none");
        }
        int iHashCode = deinterlacingMode.hashCode();
        if (iHashCode != -1408594701) {
            if (iHashCode != 109935) {
                if (iHashCode == 114735225 && deinterlacingMode.equals("yadif")) {
                    arrayListD0.add("--deinterlace=1");
                    arrayListD0.add("--deinterlace-mode=yadif");
                }
            } else if (deinterlacingMode.equals("off")) {
                arrayListD0.add("--deinterlace=0");
            }
        } else if (deinterlacingMode.equals("yadifx2")) {
            arrayListD0.add("--deinterlace=1");
            arrayListD0.add("--deinterlace-mode=yadif2x");
        }
        int i3 = subtitleStyle.f25419a;
        int iS = 100;
        if (subtitleStyle.f25426i) {
            iS = O7.r.s((i3 * 100) / 18, 50, 200);
        } else if (Integer.MIN_VALUE <= i3 && i3 < 15) {
            iS = 75;
        } else if (15 > i3 || i3 >= 19) {
            iS = (19 > i3 || i3 >= 23) ? 200 : 150;
        }
        arrayListD0.add("--sub-text-scale=" + iS);
        arrayListD0.add("--freetype-rel-fontsize=" + (iS >= 200 ? 6 : iS >= 150 ? 12 : iS <= 75 ? 20 : 16));
        long j = subtitleStyle.f25420b;
        arrayListD0.add("--freetype-color=" + (p188x0.z.H(j) & 16777215));
        arrayListD0.add("--freetype-opacity=" + O7.r.s((int) (p188x0.C3098s.e(j) * 255.0f), 0, 255));
        long j9 = subtitleStyle.f25421c;
        arrayListD0.add("--freetype-background-color=" + (p188x0.z.H(j9) & 16777215));
        arrayListD0.add("--freetype-background-opacity=" + O7.r.s((int) (p188x0.C3098s.e(j9) * 255.0f), 0, 255));
        if (subtitleStyle.f25424f) {
            arrayListD0.add("--freetype-bold");
        }
        switch (subtitleStyle.f25425h) {
            case "outline":
                arrayListD0.add("--freetype-outline-color=0");
                arrayListD0.add("--freetype-outline-opacity=255");
                arrayListD0.add("--freetype-outline-thickness=4");
                arrayListD0.add("--freetype-shadow-opacity=0");
                break;
            case "raised":
            case "shadow":
            case "depressed":
                arrayListD0.add("--freetype-outline-opacity=0");
                arrayListD0.add("--freetype-shadow-color=0");
                arrayListD0.add("--freetype-shadow-opacity=255");
                break;
            default:
                arrayListD0.add("--freetype-outline-opacity=0");
                arrayListD0.add("--freetype-shadow-opacity=0");
                break;
        }
        this.f24092e = new org.videolan.libvlc.LibVLC(applicationContext, arrayListD0);
        V7.n0 n0VarB = V7.r.b(p099l5.h.f24783a);
        this.f24094h = n0VarB;
        this.f24095i = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(0L);
        this.j = n0VarB2;
        this.f24096k = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(0L);
        this.f24097l = n0VarB3;
        this.f24098m = new V7.W(n0VarB3);
        this.f24099n = V7.r.b(null);
        S7.y0 y0VarE = S7.C.e();
        Z7.e eVar = S7.M.f9549a;
        this.f24100o = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, X7.m.f10930a));
        this.f24101p = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f24077I = new p085j5.b0(12000L, androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f24079K = wVar;
        this.f24080L = wVar;
        this.f24081M = wVar;
        this.f24082N = wVar;
        this.f24087S = new F1.e(27, this);
    }

    public static java.lang.String p(org.videolan.libvlc.interfaces.IMedia.VideoTrack videoTrack) {
        int i3 = videoTrack.frameRateDen;
        java.lang.String str = i3 > 0 ? java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(videoTrack.frameRateNum / i3)}, 1)) : "?";
        java.lang.String str2 = videoTrack.codec;
        java.lang.String str3 = videoTrack.originalCodec;
        int i9 = videoTrack.width;
        int i10 = videoTrack.height;
        int i11 = videoTrack.profile;
        int i12 = videoTrack.level;
        int i13 = videoTrack.bitrate;
        java.lang.StringBuilder sbO = Y6.f.o("codec=", str2, "/", str3, io.ktor.sse.ServerSentEventKt.SPACE);
        Y6.f.w(sbO, i9, "x", i10, " fps=");
        sbO.append(str);
        sbO.append(" profile=");
        sbO.append(i11);
        sbO.append(" level=");
        sbO.append(i12);
        sbO.append(" bitrate=");
        sbO.append(i13);
        return sbO.toString();
    }

    public static void q(java.lang.String str, java.lang.String details) {
        kotlin.jvm.internal.m.e(details, "details");
        R4.a aVar = R4.b.Companion;
        java.lang.String str2 = str + io.ktor.sse.ServerSentEventKt.SPACE + details;
        aVar.getClass();
        java.lang.String strP1 = O7.q.p1(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, R4.a.a(str2));
        android.util.Log.i("VLCPlayerEngine", strP1);
        p015b5.AbstractC1664a.a(strP1, "player");
    }

    @Override // p085j5.O
    public final V7.W a() {
        return this.f24098m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final java.util.List b() {
        return this.f24079K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final java.lang.Object c(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        p085j5.S s9;
        p085j5.a0 a0Var;
        org.videolan.libvlc.MediaPlayer mediaPlayer;
        org.videolan.libvlc.MediaPlayer mediaPlayer2;
        org.videolan.libvlc.MediaPlayer mediaPlayer3;
        if (cVar instanceof p085j5.S) {
            s9 = (p085j5.S) cVar;
            int i3 = s9.f24048k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9.f24048k = i3 - Integer.MIN_VALUE;
            } else {
                s9 = new p085j5.S(this, cVar);
            }
        } else {
            s9 = new p085j5.S(this, cVar);
        }
        java.lang.Object objL = s9.f24047i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = s9.f24048k;
        long j = 0;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            android.util.Log.d("VLCPlayerEngine", "Loading: " + str);
            r();
            p099l5.i iVar = p099l5.i.f24784a;
            V7.n0 n0Var = this.f24094h;
            n0Var.getClass();
            n0Var.i(null, iVar);
            this.f24103r = false;
            this.f24102q = null;
            this.f24108w = false;
            this.f24109x = false;
            S7.w0 w0Var = this.f24107v;
            if (w0Var != null) {
                w0Var.e(null);
            }
            this.f24107v = null;
            this.f24110z = android.os.SystemClock.elapsedRealtime();
            this.f24070A = 0L;
            this.f24071B = 0;
            this.f24072C = false;
            this.f24074E = 0L;
            this.f24076G = null;
            this.f24078J = false;
            this.f24077I.b();
            org.videolan.libvlc.LibVLC libVLC = this.f24092e;
            org.videolan.libvlc.MediaPlayer mediaPlayer4 = new org.videolan.libvlc.MediaPlayer(libVLC);
            mediaPlayer4.setEventListener((org.videolan.libvlc.MediaPlayer.EventListener) this.f24087S);
            this.f24093f = mediaPlayer4;
            org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(libVLC, android.net.Uri.parse(str));
            java.lang.String str2 = this.f24088a;
            if (str2 != null) {
                if (O7.q.N0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    media.addOption(":http-user-agent=".concat(str2));
                }
            }
            this.g = media;
            mediaPlayer4.setMedia(media);
            media.release();
            mediaPlayer4.play();
            java.lang.Integer num = this.f24089b;
            q("vlc_load", "hw=" + this.f24090c + " deinterlace=" + this.f24091d + " caching=" + ((num != null ? num.intValue() : 2) * 1000) + "ms");
            S7.w0 w0Var2 = this.H;
            if (w0Var2 != null) {
                w0Var2.e(null);
            }
            this.H = S7.C.A(this.f24100o, null, new p085j5.Z(this, null), 3);
            p085j5.U u6 = new p085j5.U(this, null);
            s9.f24046h = this;
            s9.f24048k = 1;
            objL = S7.C.L(30000L, u6, s9);
            if (objL == aVar) {
                return aVar;
            }
            a0Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = s9.f24046h;
            com.google.common.util.concurrent.P.u0(objL);
        }
        p070h6.A a2 = (p070h6.A) objL;
        S7.w0 w0Var3 = a0Var.f24106u;
        if (w0Var3 != null) {
            w0Var3.e(null);
        }
        a0Var.f24106u = null;
        V7.n0 n0Var2 = a0Var.f24094h;
        if (a2 == null && !(n0Var2.getValue() instanceof p099l5.g)) {
            android.util.Log.e("VLCPlayerEngine", "Load timed out after 30000ms");
            q("vlc_load_timeout", "vout=" + a0Var.f24071B + " buffered=" + a0Var.f24072C + io.ktor.sse.ServerSentEventKt.SPACE + a0Var.u());
            p099l5.g gVar = new p099l5.g(new p099l5.r("VLC loading timeout", 30));
            n0Var2.getClass();
            n0Var2.i(null, gVar);
        }
        if (!(n0Var2.getValue() instanceof p099l5.g) && (mediaPlayer = a0Var.f24093f) != null) {
            org.videolan.libvlc.interfaces.IMedia.Track[] tracks = mediaPlayer.getTracks(0);
            if (tracks == null) {
                tracks = new org.videolan.libvlc.interfaces.IMedia.Track[0];
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int length = tracks.length;
            int i10 = 0;
            while (i10 < length) {
                org.videolan.libvlc.interfaces.IMedia.Track track = tracks[i10];
                java.lang.String id = track.id;
                kotlin.jvm.internal.m.d(id, "id");
                if (id.length() > 0) {
                    int size = arrayList.size();
                    java.lang.String str3 = track.language;
                    if (str3 == null || O7.q.N0(str3)) {
                        str3 = null;
                    }
                    arrayList.add(new p099l5.C2548a(size, str3, track.name));
                    java.lang.String id2 = track.id;
                    kotlin.jvm.internal.m.d(id2, "id");
                    arrayList2.add(id2);
                }
                i10++;
                j = j;
            }
            long j9 = j;
            a0Var.f24079K = arrayList;
            a0Var.f24081M = arrayList2;
            org.videolan.libvlc.interfaces.IMedia.Track[] tracks2 = mediaPlayer.getTracks(2);
            if (tracks2 == null) {
                tracks2 = new org.videolan.libvlc.interfaces.IMedia.Track[0];
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (org.videolan.libvlc.interfaces.IMedia.Track track2 : tracks2) {
                java.lang.String id3 = track2.id;
                kotlin.jvm.internal.m.d(id3, "id");
                if (id3.length() > 0) {
                    int size2 = arrayList3.size();
                    java.lang.String str4 = track2.language;
                    if (str4 == null || O7.q.N0(str4)) {
                        str4 = null;
                    }
                    arrayList3.add(new p099l5.D(size2, str4, track2.name));
                    java.lang.String id4 = track2.id;
                    kotlin.jvm.internal.m.d(id4, "id");
                    arrayList4.add(id4);
                }
            }
            a0Var.f24080L = arrayList3;
            a0Var.f24082N = arrayList4;
            android.util.Log.d("VLCPlayerEngine", "Tracks: " + a0Var.f24079K.size() + " audio, " + a0Var.f24080L.size() + " subtitle");
            long j10 = a0Var.f24085Q;
            if (j10 != j9 && (mediaPlayer3 = a0Var.f24093f) != null) {
                mediaPlayer3.setAudioDelay(j10);
            }
            long j11 = a0Var.f24086R;
            if (j11 != j9 && (mediaPlayer2 = a0Var.f24093f) != null) {
                mediaPlayer2.setSpuDelay(j11);
            }
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final java.util.List d() {
        return this.f24080L;
    }

    @Override // p085j5.O
    public final void e(long j) {
        long jO = o(j);
        java.lang.Long lValueOf = java.lang.Long.valueOf(jO);
        V7.n0 n0Var = this.j;
        n0Var.getClass();
        n0Var.i(null, lValueOf);
        if (((java.lang.Number) this.f24097l.getValue()).longValue() <= 0) {
            this.f24102q = java.lang.Long.valueOf(jO);
            return;
        }
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.setTime(jO);
        }
    }

    @Override // p085j5.O
    public final void f(long j) {
        long j9 = 1000 * j;
        this.f24086R = j9;
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.setSpuDelay(j9);
        }
        android.util.Log.d("VLCPlayerEngine", "Subtitle delay set to " + j + "ms");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final void g(int i3) {
        if (i3 < 0) {
            org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
            if (mediaPlayer != null) {
                mediaPlayer.unselectTrackType(2);
            }
            this.f24084P = -1;
            android.util.Log.d("VLCPlayerEngine", "Subtitles disabled");
            return;
        }
        java.lang.String str = (java.lang.String) p078i6.o.k1(i3, this.f24082N);
        if (str == null) {
            return;
        }
        org.videolan.libvlc.MediaPlayer mediaPlayer2 = this.f24093f;
        if (mediaPlayer2 != null) {
            mediaPlayer2.selectTrack(str);
        }
        this.f24084P = java.lang.Integer.valueOf(i3);
        android.util.Log.d("VLCPlayerEngine", "Selected subtitle track index=" + i3 + " vlcId=" + str);
    }

    @Override // p085j5.O
    public final V7.W getPlaybackState() {
        return this.f24095i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p085j5.O
    public final java.lang.Object h(long j, p117n6.c cVar) {
        p085j5.V v6;
        long jO;
        p085j5.a0 a0Var;
        if (cVar instanceof p085j5.V) {
            v6 = (p085j5.V) cVar;
            int i3 = v6.f24058l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v6.f24058l = i3 - Integer.MIN_VALUE;
            } else {
                v6 = new p085j5.V(this, cVar);
            }
        } else {
            v6 = new p085j5.V(this, cVar);
        }
        java.lang.Object obj = v6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = v6.f24058l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
            if (mediaPlayer == null) {
                return a2;
            }
            jO = o(j);
            if (((java.lang.Number) this.f24097l.getValue()).longValue() <= 0) {
                this.f24102q = new java.lang.Long(jO);
                android.util.Log.d("VLCPlayerEngine", "Seek to " + jO + "ms stored as pending (waiting for duration)");
                return a2;
            }
            this.f24104s = true;
            java.lang.Long l2 = new java.lang.Long(jO);
            V7.n0 n0Var = this.j;
            n0Var.getClass();
            n0Var.i(null, l2);
            mediaPlayer.setTime(jO);
            p085j5.X x9 = new p085j5.X(this, jO, null);
            v6.f24055h = this;
            v6.f24056i = jO;
            v6.f24058l = 1;
            if (S7.C.L(5000L, x9, v6) == aVar) {
                return aVar;
            }
            a0Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jO = v6.f24056i;
            a0Var = v6.f24055h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        a0Var.f24104s = false;
        android.util.Log.d("VLCPlayerEngine", "Seeked to " + jO + "ms");
        return a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final void i(int i3) {
        java.lang.String str = (java.lang.String) p078i6.o.k1(i3, this.f24081M);
        if (str == null) {
            return;
        }
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.selectTrack(str);
        }
        this.f24083O = java.lang.Integer.valueOf(i3);
        android.util.Log.d("VLCPlayerEngine", "Selected audio track index=" + i3 + " vlcId=" + str);
    }

    @Override // p085j5.O
    public final V7.W j() {
        return this.f24096k;
    }

    @Override // p085j5.O
    public final void k(long j) {
        long j9 = 1000 * j;
        this.f24085Q = j9;
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioDelay(j9);
        }
        android.util.Log.d("VLCPlayerEngine", "Audio delay set to " + j + "ms");
    }

    @Override // p085j5.O
    public final java.lang.Integer l() {
        return this.f24083O;
    }

    @Override // p085j5.O
    public final java.lang.Integer m() {
        return this.f24084P;
    }

    @Override // p085j5.O
    public final boolean n() {
        return true;
    }

    public final long o(long j) {
        long jLongValue = ((java.lang.Number) this.f24097l.getValue()).longValue();
        if (jLongValue > 0) {
            return O7.r.t(j, 0L, jLongValue);
        }
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p085j5.O
    public final void pause() {
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        p099l5.j jVar = p099l5.j.f24785a;
        V7.n0 n0Var = this.f24094h;
        n0Var.getClass();
        n0Var.i(null, jVar);
        android.util.Log.d("VLCPlayerEngine", "Pause");
    }

    @Override // p085j5.O
    public final void play() {
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
        p099l5.k kVar = p099l5.k.f24786a;
        V7.n0 n0Var = this.f24094h;
        n0Var.getClass();
        n0Var.i(null, kVar);
        android.util.Log.d("VLCPlayerEngine", "Play");
    }

    public final void r() {
        S7.w0 w0Var = this.f24106u;
        if (w0Var != null) {
            w0Var.e(null);
        }
        this.f24106u = null;
        S7.w0 w0Var2 = this.H;
        if (w0Var2 != null) {
            w0Var2.e(null);
        }
        this.H = null;
        this.f24077I.b();
        S7.C0895k c0895k = this.f24105t;
        if (c0895k != null) {
            if (c0895k.isActive()) {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
            this.f24105t = null;
        }
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            this.f24093f = null;
            v(mediaPlayer);
        }
        p099l5.h hVar = p099l5.h.f24783a;
        V7.n0 n0Var = this.f24094h;
        n0Var.getClass();
        n0Var.i(null, hVar);
        V7.n0 n0Var2 = this.j;
        n0Var2.getClass();
        n0Var2.i(null, 0L);
        V7.n0 n0Var3 = this.f24097l;
        n0Var3.getClass();
        n0Var3.i(null, 0L);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f24079K = wVar;
        this.f24080L = wVar;
        this.f24081M = wVar;
        this.f24082N = wVar;
        this.f24083O = null;
        this.f24084P = null;
        this.f24103r = false;
        this.f24102q = null;
        this.f24104s = false;
    }

    @Override // p085j5.O
    public final void release() {
        android.util.Log.d("VLCPlayerEngine", "Release");
        this.y = null;
        r();
        f24069T.execute(new D1.RunnableC0239y(this, this.f24092e, 23));
        S7.C.i(this.f24100o, null);
    }

    public final void s() {
        S7.C0895k c0895k = this.f24105t;
        if (c0895k != null) {
            if (c0895k.isActive()) {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
            this.f24105t = null;
        }
    }

    @Override // p085j5.O
    public final void setPlaybackSpeed(float f9) {
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.setRate(f9);
        }
        android.util.Log.d("VLCPlayerEngine", "Speed set to " + f9 + "x");
    }

    @Override // p085j5.O
    public final void setVolume(float f9) {
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume((int) (O7.r.r(f9, 0.0f, 1.0f) * 100.0f));
        }
    }

    @Override // p085j5.O
    public final void stop() {
        this.f24109x = true;
        S7.w0 w0Var = this.f24107v;
        if (w0Var != null) {
            w0Var.e(null);
        }
        this.f24107v = null;
        S7.w0 w0Var2 = this.H;
        if (w0Var2 != null) {
            w0Var2.e(null);
        }
        this.H = null;
        s();
        org.videolan.libvlc.MediaPlayer mediaPlayer = this.f24093f;
        if (mediaPlayer != null) {
            this.f24093f = null;
            v(mediaPlayer);
        }
        this.f24102q = null;
        this.f24103r = false;
        p099l5.h hVar = p099l5.h.f24783a;
        V7.n0 n0Var = this.f24094h;
        n0Var.getClass();
        n0Var.i(null, hVar);
        V7.n0 n0Var2 = this.j;
        n0Var2.getClass();
        n0Var2.i(null, 0L);
        V7.n0 n0Var3 = this.f24097l;
        n0Var3.getClass();
        n0Var3.i(null, 0L);
        this.f24099n.h(null);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f24079K = wVar;
        this.f24080L = wVar;
        this.f24081M = wVar;
        this.f24082N = wVar;
        android.util.Log.d("VLCPlayerEngine", "Stop");
    }

    public final void t() {
        if (this.f24108w || this.f24109x) {
            return;
        }
        S7.w0 w0Var = this.f24107v;
        if (w0Var != null) {
            w0Var.e(null);
        }
        this.f24107v = S7.C.A(this.f24100o, null, new p085j5.Y(this, null), 3);
    }

    public final java.lang.String u() {
        org.videolan.libvlc.interfaces.IMedia.Stats stats = this.f24076G;
        if (stats == null) {
            return "stats=none";
        }
        long j = stats.displayedPictures;
        long j9 = stats.lostPictures;
        long j10 = stats.decodedVideo;
        long j11 = stats.demuxCorrupted;
        long j12 = stats.demuxDiscontinuity;
        float f9 = stats.inputBitrate;
        java.lang.StringBuilder sbU = p121o0.p.u(j, "displayed=", " lost=");
        sbU.append(j9);
        sbU.append(" decoded=");
        sbU.append(j10);
        sbU.append(" corrupted=");
        sbU.append(j11);
        sbU.append(" discontinuity=");
        sbU.append(j12);
        sbU.append(" inputBitrate=");
        sbU.append(f9);
        return sbU.toString();
    }

    public final void v(org.videolan.libvlc.MediaPlayer mediaPlayer) {
        java.lang.Object objT;
        mediaPlayer.setEventListener((org.videolan.libvlc.MediaPlayer.EventListener) null);
        try {
            mediaPlayer.detachViews();
            objT = p070h6.A.f22523a;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Throwable thA = p070h6.n.a(objT);
        if (thA != null) {
            B2.a.v("detachViews before teardown failed: ", thA.getMessage(), "VLCPlayerEngine");
        }
        f24069T.execute(new D1.RunnableC0239y(this, mediaPlayer, 24));
    }
}
