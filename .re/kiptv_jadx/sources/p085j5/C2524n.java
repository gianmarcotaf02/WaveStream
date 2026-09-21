package p085j5;

/* JADX INFO: renamed from: j5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2524n implements p085j5.O {
    public static final p085j5.C2511a Companion = new p085j5.C2511a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public S7.w0 f24162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p028c8.b f24163B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f24164C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f24165D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f24166E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public java.lang.String f24167F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public java.lang.String f24168G;
    public androidx.media3.common.Format H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public androidx.media3.common.Format f24169I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f24170J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f24171K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f24172L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f24173M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p085j5.b0 f24174N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final X7.c f24175O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public S7.w0 f24176P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public S7.w0 f24177Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public java.lang.Object f24178R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public java.lang.Object f24179S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public S7.C0895k f24180T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f24181U;
    public final p085j5.C2512b V;
    public java.lang.Integer W;
    public java.lang.Integer X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p085j5.C2515e f24182Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f24184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f24185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f24186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p077i5.C2237d f24187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.AudioAttributes f24188f;
    public androidx.media3.exoplayer.audio.AudioCapabilities g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver f24189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f24190i;
    public final V7.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f24191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f24192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f24193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f24194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.n0 f24195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.media3.exoplayer.ExoPlayer f24196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.media3.exoplayer.trackselection.DefaultTrackSelector f24197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f24198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24203w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24204x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24205z;

    public C2524n(android.content.Context context, java.lang.String str, java.lang.Integer num, java.lang.String hardwareAcceleration) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(hardwareAcceleration, "hardwareAcceleration");
        this.f24183a = context;
        this.f24184b = str;
        this.f24185c = num;
        this.f24186d = hardwareAcceleration;
        androidx.media3.common.AudioAttributes DEFAULT = androidx.media3.common.AudioAttributes.DEFAULT;
        kotlin.jvm.internal.m.d(DEFAULT, "DEFAULT");
        this.f24188f = DEFAULT;
        androidx.media3.exoplayer.audio.AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        kotlin.jvm.internal.m.d(DEFAULT_AUDIO_CAPABILITIES, "DEFAULT_AUDIO_CAPABILITIES");
        this.g = DEFAULT_AUDIO_CAPABILITIES;
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver(context.getApplicationContext(), new F1.e(26, this), DEFAULT, null);
        this.f24189h = audioCapabilitiesReceiver;
        this.g = audioCapabilitiesReceiver.register();
        V7.n0 n0VarB = V7.r.b(p099l5.h.f24783a);
        this.f24190i = n0VarB;
        this.j = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(0L);
        this.f24191k = n0VarB2;
        this.f24192l = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(0L);
        this.f24193m = n0VarB3;
        this.f24194n = new V7.W(n0VarB3);
        this.f24195o = V7.r.b(null);
        this.f24171K = true;
        this.f24174N = new p085j5.b0(12000L, androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
        S7.y0 y0VarE = S7.C.e();
        Z7.e eVar = S7.M.f9549a;
        this.f24175O = S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(y0VarE, X7.m.f10930a));
        p078i6.w wVar = p078i6.w.f23205h;
        this.f24178R = wVar;
        this.f24179S = wVar;
        this.V = new p085j5.C2512b(this);
        this.f24182Y = new p085j5.C2515e(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object o(p085j5.C2524n c2524n, p117n6.c cVar) throws java.lang.Throwable {
        p085j5.C2521k c2521k;
        java.lang.String str;
        androidx.media3.exoplayer.ExoPlayer exoPlayer;
        long currentPosition;
        boolean playWhenReady;
        long j;
        java.lang.Throwable th;
        p085j5.C2524n c2524n2;
        c2524n.getClass();
        if (cVar instanceof p085j5.C2521k) {
            c2521k = (p085j5.C2521k) cVar;
            int i3 = c2521k.f24157o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2521k.f24157o = i3 - Integer.MIN_VALUE;
            } else {
                c2521k = new p085j5.C2521k(c2524n, cVar);
            }
        } else {
            c2521k = new p085j5.C2521k(c2524n, cVar);
        }
        java.lang.Object obj = c2521k.f24155m;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2521k.f24157o;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c2524n.f24205z = false;
            str = c2524n.f24198r;
            if (str == null || (exoPlayer = c2524n.f24196p) == null) {
                return a2;
            }
            if (c2524n.f24199s) {
                currentPosition = androidx.media3.common.C.TIME_UNSET;
            } else {
                currentPosition = exoPlayer.getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
            }
            playWhenReady = exoPlayer.getPlayWhenReady();
            if (!c2524n.y) {
                c2524n.y = true;
                s("exo_ts_permissive", "enabling non-IDR keyframes after a failed strict pass");
            }
            android.util.Log.d("ExoPlayerEngine", "Soft retry: re-preparing at " + currentPosition + "ms (wasPlaying=" + playWhenReady + ")");
            s("exo_soft_retry", "n=" + c2524n.f24200t + "/3 at=" + currentPosition + "ms live=" + c2524n.f24199s + " wasPlaying=" + playWhenReady + " permissiveTs=" + c2524n.y);
            S7.w0 w0Var = c2524n.f24177Q;
            if (w0Var != null) {
                w0Var.e(null);
            }
            c2524n.f24177Q = null;
            p099l5.e eVar = p099l5.e.f24780a;
            V7.n0 n0Var = c2524n.f24190i;
            n0Var.getClass();
            n0Var.i(null, eVar);
            c2524n.f24204x = true;
            try {
                exoPlayer.stop();
                c2521k.f24151h = c2524n;
                c2521k.f24152i = str;
                c2521k.j = exoPlayer;
                c2521k.f24153k = currentPosition;
                c2521k.f24154l = playWhenReady;
                c2521k.f24157o = 1;
                if (S7.C.n(300L, c2521k) == aVar) {
                    return aVar;
                }
                j = currentPosition;
            } catch (java.lang.Throwable th2) {
                c2524n2 = c2524n;
                th = th2;
                c2524n2.f24204x = false;
                throw th;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z6 = c2521k.f24154l;
            j = c2521k.f24153k;
            exoPlayer = c2521k.j;
            str = c2521k.f24152i;
            c2524n2 = c2521k.f24151h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                playWhenReady = z6;
                c2524n = c2524n2;
            } catch (java.lang.Throwable th3) {
                th = th3;
                c2524n2.f24204x = false;
                throw th;
            }
        }
        exoPlayer.setMediaSource(c2524n.p(str, p085j5.AbstractC2525o.a(str)), j);
        c2524n.f24170J = false;
        c2524n.f24166E = true;
        c2524n.f24174N.b();
        c2524n.f24164C = android.os.SystemClock.elapsedRealtime();
        exoPlayer.prepare();
        if (c2524n.f24199s || playWhenReady) {
            exoPlayer.play();
        }
        c2524n.f24204x = false;
        return a2;
    }

    public static java.lang.String r(java.lang.Exception exc) {
        java.lang.String strM;
        java.lang.String message;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Throwable cause = exc.getCause();
        java.util.Iterator it = ((java.util.ArrayList) p078i6.m.l0(new java.lang.Throwable[]{exc, cause})).iterator();
        do {
            strM = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Throwable th = (java.lang.Throwable) it.next();
            if (th instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException) {
                androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException = (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException) th;
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInitializationException.codecInfo;
                if (mediaCodecInfo == null || (str2 = mediaCodecInfo.name) == null) {
                    str2 = "none";
                }
                java.lang.String str3 = decoderInitializationException.mimeType;
                java.lang.String str4 = decoderInitializationException.diagnosticInfo;
                java.lang.StringBuilder sbO = Y6.f.o(" decoder=", str2, " mime=", str3, " diag=");
                sbO.append(str4);
                strM = sbO.toString();
            } else if (th instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) {
                androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException mediaCodecDecoderException = (androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) th;
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo2 = mediaCodecDecoderException.codecInfo;
                if (mediaCodecInfo2 == null || (str = mediaCodecInfo2.name) == null) {
                    str = "none";
                }
                strM = B2.a.m(" decoder=", str, " diag=", mediaCodecDecoderException.diagnosticInfo);
            }
        } while (strM == null);
        java.lang.String str5 = "";
        if (strM == null) {
            strM = "";
        }
        if (cause == null || (message = cause.getMessage()) == null) {
            java.lang.String message2 = exc.getMessage();
            if (message2 != null) {
                str5 = message2;
            }
        } else {
            str5 = message;
        }
        return Y6.f.i("cause=", cause != null ? cause.getClass().getSimpleName() : "none", " msg=", O7.q.p1(160, str5), strM);
    }

    public static void s(java.lang.String str, java.lang.String details) {
        kotlin.jvm.internal.m.e(details, "details");
        R4.a aVar = R4.b.Companion;
        java.lang.String str2 = str + io.ktor.sse.ServerSentEventKt.SPACE + details;
        aVar.getClass();
        java.lang.String strP1 = O7.q.p1(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST, R4.a.a(str2));
        android.util.Log.i("ExoPlayerEngine", strP1);
        p015b5.AbstractC1664a.a(strP1, "player");
    }

    public static p099l5.v t(androidx.media3.common.PlaybackException playbackException) {
        int i3 = playbackException.errorCode;
        if (i3 == 3003 || i3 == 3004 || i3 == 4001 || i3 == 4004 || i3 == 4005) {
            java.lang.String message = playbackException.getMessage();
            if (message == null) {
                message = "Unsupported format";
            }
            return new p099l5.t(message);
        }
        switch (i3) {
            case androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED /* 2001 */:
            case androidx.media3.common.PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT /* 2002 */:
                java.lang.String message2 = playbackException.getMessage();
                if (message2 == null) {
                    message2 = "Network error";
                }
                return new p099l5.p(message2, null);
            case androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE /* 2003 */:
            case androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND /* 2005 */:
                java.lang.String message3 = playbackException.getMessage();
                if (message3 == null) {
                    message3 = "Failed to load media";
                }
                return new p099l5.o(message3, p121o0.p.C("ExoPlayer error: ", playbackException.getErrorCodeName()));
            case androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS /* 2004 */:
                java.lang.String message4 = playbackException.getMessage();
                if (message4 == null) {
                    message4 = "HTTP error";
                }
                java.lang.Throwable cause = playbackException.getCause();
                androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = cause instanceof androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException ? (androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException) cause : null;
                return new p099l5.p(message4, invalidResponseCodeException != null ? java.lang.Integer.valueOf(invalidResponseCodeException.responseCode) : null);
            default:
                java.lang.String message5 = playbackException.getMessage();
                if (message5 == null) {
                    message5 = "Playback failed";
                }
                return new p099l5.q(message5, "ExoPlayer error code: " + playbackException.errorCode + " (" + playbackException.getErrorCodeName() + ")");
        }
    }

    public static final java.lang.String w(androidx.media3.common.Tracks tracks, int i3, java.lang.String str) {
        p076i4.AbstractC2186b0 groups = tracks.getGroups();
        kotlin.jvm.internal.m.d(groups, "getGroups(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : groups) {
            if (((androidx.media3.common.Tracks.Group) obj).getType() == i3) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((androidx.media3.common.Tracks.Group) it.next()).isSupported()) {
                    return null;
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            java.lang.String str2 = ((androidx.media3.common.Tracks.Group) it2.next()).getTrackFormat(0).sampleMimeType;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        return str + " track not decodable on this device (" + p078i6.o.o1(p078i6.o.c1(arrayList2), ", ", null, null, null, 62) + ")";
    }

    @Override // p085j5.O
    public final V7.W a() {
        return this.f24194n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final java.util.List b() {
        return this.f24178R;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p085j5.O
    public final java.lang.Object c(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        p085j5.C2513c c2513c;
        p085j5.N n3;
        p085j5.C2524n c2524n;
        if (cVar instanceof p085j5.C2513c) {
            c2513c = (p085j5.C2513c) cVar;
            int i3 = c2513c.f24120k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2513c.f24120k = i3 - Integer.MIN_VALUE;
            } else {
                c2513c = new p085j5.C2513c(this, cVar);
            }
        } else {
            c2513c = new p085j5.C2513c(this, cVar);
        }
        java.lang.Object objL = c2513c.f24119i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2513c.f24120k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            android.util.Log.d("ExoPlayerEngine", "Loading: " + str);
            u();
            this.f24198r = str;
            this.f24200t = 0;
            this.y = false;
            this.f24201u = false;
            this.f24203w = false;
            V7.n0 n0Var = this.f24190i;
            p099l5.i iVar = p099l5.i.f24784a;
            n0Var.getClass();
            n0Var.i(null, iVar);
            p085j5.P pA = p085j5.AbstractC2525o.a(str);
            android.util.Log.d("ExoPlayerEngine", "Detected format: ".concat(pA.f24045h));
            androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(this.f24183a);
            defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setPreferredTextLanguage(androidx.media3.common.C.LANGUAGE_UNDETERMINED).build());
            this.f24197q = defaultTrackSelector;
            P4.b bVar = P4.c.f8139b;
            boolean z6 = bVar != null ? bVar.f8137e : false;
            boolean z9 = this.f24199s;
            java.lang.Integer num = this.f24185c;
            if (z9) {
                n3 = new p085j5.N(2000, 8000, 500, 1000);
            } else {
                n3 = z6 ? new p085j5.N(8000, 20000, 2500, 5000) : new p085j5.N(15000, 50000, 2500, 5000);
            }
            if (num != null) {
                int iIntValue = num.intValue() * 1000;
                if (z6) {
                    iIntValue = java.lang.Math.min(iIntValue, n3.f24029b);
                }
                int iMin = java.lang.Math.min(n3.f24028a, iIntValue);
                int iMin2 = java.lang.Math.min(n3.f24030c, iIntValue / 2);
                if (iMin2 < 250) {
                    iMin2 = 250;
                }
                int iMin3 = java.lang.Math.min(n3.f24031d, iIntValue);
                if (iMin3 < iMin2) {
                    iMin3 = iMin2;
                }
                n3 = new p085j5.N(iMin, iIntValue, iMin2, iMin3);
            }
            java.lang.Integer num2 = z6 ? 25165824 : null;
            boolean z10 = this.f24199s;
            int i10 = n3.f24028a;
            int i11 = n3.f24029b;
            java.lang.Object obj = num2 == null ? "default" : num2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Load control: live=");
            sb.append(z10);
            sb.append(" lowMemory=");
            sb.append(z6);
            sb.append(" buffer=");
            Y6.f.w(sb, i10, "/", i11, "ms targetBytes=");
            sb.append(obj);
            android.util.Log.i("ExoPlayerEngine", sb.toString());
            androidx.media3.exoplayer.DefaultLoadControl.Builder bufferDurationsMs = new androidx.media3.exoplayer.DefaultLoadControl.Builder().setBufferDurationsMs(n3.f24028a, n3.f24029b, n3.f24030c, n3.f24031d);
            if (num2 != null) {
                bufferDurationsMs.setTargetBufferBytes(num2.intValue());
            }
            androidx.media3.exoplayer.DefaultLoadControl defaultLoadControlBuild = bufferDurationsMs.build();
            kotlin.jvm.internal.m.d(defaultLoadControlBuild, "build(...)");
            androidx.media3.exoplayer.DefaultRenderersFactory enableDecoderFallback = new androidx.media3.exoplayer.DefaultRenderersFactory(this.f24183a).setEnableDecoderFallback(true);
            kotlin.jvm.internal.m.d(enableDecoderFallback, "setEnableDecoderFallback(...)");
            if (kotlin.jvm.internal.m.a(this.f24186d, "off")) {
                enableDecoderFallback.setMediaCodecSelector(new io.sentry.protocol.a(4));
            }
            androidx.media3.exoplayer.ExoPlayer exoPlayerBuild = new androidx.media3.exoplayer.ExoPlayer.Builder(this.f24183a, enableDecoderFallback).setTrackSelector(defaultTrackSelector).setLoadControl(defaultLoadControlBuild).build();
            kotlin.jvm.internal.m.d(exoPlayerBuild, "build(...)");
            exoPlayerBuild.addListener(this.f24182Y);
            exoPlayerBuild.addAnalyticsListener(this.V);
            this.f24181U = 0;
            this.f24165D = 0L;
            this.f24166E = true;
            this.f24167F = null;
            this.f24168G = null;
            this.H = null;
            this.f24169I = null;
            this.f24170J = false;
            this.f24171K = true;
            this.f24172L = 0L;
            this.f24173M = false;
            this.f24174N.b();
            this.f24196p = exoPlayerBuild;
            exoPlayerBuild.setMediaSource(p(str, pA));
            this.f24164C = android.os.SystemClock.elapsedRealtime();
            exoPlayerBuild.prepare();
            S7.w0 w0Var = this.f24176P;
            if (w0Var != null) {
                w0Var.e(null);
            }
            this.f24176P = S7.C.A(this.f24175O, null, new p085j5.C2522l(this, null), 3);
            p085j5.C2514d c2514d = new p085j5.C2514d(this, exoPlayerBuild, null);
            c2513c.f24118h = this;
            c2513c.f24120k = 1;
            objL = S7.C.L(30000L, c2514d, c2513c);
            if (objL == aVar) {
                return aVar;
            }
            c2524n = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2524n = c2513c.f24118h;
            com.google.common.util.concurrent.P.u0(objL);
        }
        if (((p070h6.A) objL) == null && !(c2524n.f24190i.getValue() instanceof p099l5.g)) {
            android.util.Log.e("ExoPlayerEngine", "Load timed out after 30000ms");
            V7.n0 n0Var2 = c2524n.f24190i;
            p099l5.g gVar = new p099l5.g(new p099l5.r("Load timed out", 30));
            n0Var2.getClass();
            n0Var2.i(null, gVar);
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer = c2524n.f24196p;
        if (exoPlayer != null && exoPlayer.isCurrentMediaItemLive()) {
            c2524n.f24199s = true;
            android.util.Log.d("ExoPlayerEngine", "Auto-detected live stream");
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p085j5.O
    public final java.util.List d() {
        return this.f24179S;
    }

    @Override // p085j5.O
    public final void e(long j) {
        long jQ = q(j);
        java.lang.Long lValueOf = java.lang.Long.valueOf(jQ);
        V7.n0 n0Var = this.f24191k;
        n0Var.getClass();
        n0Var.i(null, lValueOf);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.seekTo(jQ);
        }
    }

    @Override // p085j5.O
    public final void g(int i3) {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = this.f24197q;
        if (defaultTrackSelector == null) {
            return;
        }
        if (i3 < 0) {
            defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setTrackTypeDisabled(3, true).build());
            this.X = -1;
            android.util.Log.d("ExoPlayerEngine", "Subtitles disabled");
            return;
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer == null) {
            return;
        }
        p076i4.AbstractC2186b0 groups = exoPlayer.getCurrentTracks().getGroups();
        kotlin.jvm.internal.m.d(groups, "getGroups(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : groups) {
            if (((androidx.media3.common.Tracks.Group) obj).getType() == 3) {
                arrayList.add(obj);
            }
        }
        androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) p078i6.o.k1(i3, arrayList);
        if (group == null) {
            return;
        }
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setTrackTypeDisabled(3, false).setOverrideForType(new androidx.media3.common.TrackSelectionOverride(group.getMediaTrackGroup(), 0)).build());
        this.X = java.lang.Integer.valueOf(i3);
        android.util.Log.d("ExoPlayerEngine", "Selected subtitle track " + i3);
    }

    @Override // p085j5.O
    public final V7.W getPlaybackState() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p085j5.O
    public final java.lang.Object h(long j, p117n6.c cVar) throws java.lang.Throwable {
        p085j5.C2517g c2517g;
        java.lang.Throwable th;
        p085j5.C2524n c2524n;
        kotlin.jvm.internal.A a2;
        androidx.media3.exoplayer.ExoPlayer exoPlayer;
        androidx.media3.common.Player.Listener listener;
        if (cVar instanceof p085j5.C2517g) {
            c2517g = (p085j5.C2517g) cVar;
            int i3 = c2517g.f24142m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2517g.f24142m = i3 - Integer.MIN_VALUE;
            } else {
                c2517g = new p085j5.C2517g(this, cVar);
            }
        } else {
            c2517g = new p085j5.C2517g(this, cVar);
        }
        java.lang.Object objL = c2517g.f24140k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2517g.f24142m;
        p070h6.A a9 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            androidx.media3.exoplayer.ExoPlayer exoPlayer2 = this.f24196p;
            if (exoPlayer2 == null) {
                return a9;
            }
            long jQ = q(j);
            this.f24202v = true;
            java.lang.Long l2 = new java.lang.Long(jQ);
            V7.n0 n0Var = this.f24191k;
            n0Var.getClass();
            n0Var.i(null, l2);
            kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
            try {
                p085j5.C2520j c2520j = new p085j5.C2520j(a10, exoPlayer2, jQ, null);
                c2517g.f24138h = this;
                c2517g.f24139i = exoPlayer2;
                c2517g.j = a10;
                c2517g.f24142m = 1;
                objL = S7.C.L(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, c2520j, c2517g);
                if (objL == aVar) {
                    return aVar;
                }
                c2524n = this;
                a2 = a10;
                exoPlayer = exoPlayer2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                c2524n = this;
                a2 = a10;
                exoPlayer = exoPlayer2;
                listener = (androidx.media3.common.Player.Listener) a2.f24539h;
                if (listener != null) {
                    exoPlayer.removeListener(listener);
                }
                c2524n.f24202v = false;
                throw th;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c2517g.j;
            exoPlayer = c2517g.f24139i;
            c2524n = c2517g.f24138h;
            try {
                com.google.common.util.concurrent.P.u0(objL);
            } catch (java.lang.Throwable th3) {
                th = th3;
                listener = (androidx.media3.common.Player.Listener) a2.f24539h;
                if (listener != null) {
                    exoPlayer.removeListener(listener);
                }
                c2524n.f24202v = false;
                throw th;
            }
        }
        androidx.media3.common.Player.Listener listener2 = (androidx.media3.common.Player.Listener) a2.f24539h;
        if (listener2 != null) {
            exoPlayer.removeListener(listener2);
        }
        c2524n.f24202v = false;
        return a9;
    }

    @Override // p085j5.O
    public final void i(int i3) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = this.f24197q;
        if (defaultTrackSelector == null || (exoPlayer = this.f24196p) == null) {
            return;
        }
        p076i4.AbstractC2186b0 groups = exoPlayer.getCurrentTracks().getGroups();
        kotlin.jvm.internal.m.d(groups, "getGroups(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : groups) {
            if (((androidx.media3.common.Tracks.Group) obj).getType() == 1) {
                arrayList.add(obj);
            }
        }
        androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) p078i6.o.k1(i3, arrayList);
        if (group == null) {
            return;
        }
        defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setOverrideForType(new androidx.media3.common.TrackSelectionOverride(group.getMediaTrackGroup(), 0)).build());
        this.W = java.lang.Integer.valueOf(i3);
        android.util.Log.d("ExoPlayerEngine", "Selected audio track " + i3);
    }

    @Override // p085j5.O
    public final V7.W j() {
        return this.f24192l;
    }

    @Override // p085j5.O
    public final java.lang.Integer l() {
        return this.W;
    }

    @Override // p085j5.O
    public final java.lang.Integer m() {
        return this.X;
    }

    @Override // p085j5.O
    public final boolean n() {
        return false;
    }

    public final androidx.media3.exoplayer.source.BaseMediaSource p(java.lang.String str, p085j5.P p2) {
        int i3 = this.y ? 9 : 8;
        androidx.media3.datasource.DefaultHttpDataSource.Factory allowCrossProtocolRedirects = new androidx.media3.datasource.DefaultHttpDataSource.Factory().setConnectTimeoutMs(15000).setReadTimeoutMs(15000).setAllowCrossProtocolRedirects(true);
        java.lang.String str2 = this.f24184b;
        if (str2 != null) {
            if (O7.q.N0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                allowCrossProtocolRedirects.setUserAgent(str2);
            }
        }
        kotlin.jvm.internal.m.d(allowCrossProtocolRedirects, "apply(...)");
        androidx.media3.common.MediaItem mediaItemFromUri = androidx.media3.common.MediaItem.fromUri(str);
        kotlin.jvm.internal.m.d(mediaItemFromUri, "fromUri(...)");
        int iOrdinal = p2.ordinal();
        if (iOrdinal == 0) {
            androidx.media3.exoplayer.hls.HlsMediaSource hlsMediaSourceCreateMediaSource = new androidx.media3.exoplayer.hls.HlsMediaSource.Factory(allowCrossProtocolRedirects).setExtractorFactory(new androidx.media3.exoplayer.hls.DefaultHlsExtractorFactory(i3, true)).createMediaSource(mediaItemFromUri);
            kotlin.jvm.internal.m.d(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
            return hlsMediaSourceCreateMediaSource;
        }
        if (iOrdinal != 1) {
            androidx.media3.exoplayer.source.ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(allowCrossProtocolRedirects, new androidx.media3.extractor.DefaultExtractorsFactory().setTsExtractorFlags(i3)).createMediaSource(mediaItemFromUri);
            kotlin.jvm.internal.m.d(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
            return progressiveMediaSourceCreateMediaSource;
        }
        androidx.media3.exoplayer.dash.DashMediaSource dashMediaSourceCreateMediaSource = new androidx.media3.exoplayer.dash.DashMediaSource.Factory(allowCrossProtocolRedirects).createMediaSource(mediaItemFromUri);
        kotlin.jvm.internal.m.d(dashMediaSourceCreateMediaSource, "createMediaSource(...)");
        return dashMediaSourceCreateMediaSource;
    }

    @Override // p085j5.O
    public final void pause() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.pause();
            if (exoPlayer.getPlaybackState() == 3) {
                p099l5.j jVar = p099l5.j.f24785a;
                V7.n0 n0Var = this.f24190i;
                n0Var.getClass();
                n0Var.i(null, jVar);
            }
            android.util.Log.d("ExoPlayerEngine", "Pause");
        }
    }

    @Override // p085j5.O
    public final void play() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.play();
            if (exoPlayer.getPlaybackState() == 3) {
                p099l5.k kVar = p099l5.k.f24786a;
                V7.n0 n0Var = this.f24190i;
                n0Var.getClass();
                n0Var.i(null, kVar);
            }
            android.util.Log.d("ExoPlayerEngine", "Play");
        }
    }

    public final long q(long j) {
        long jLongValue = ((java.lang.Number) this.f24193m.getValue()).longValue();
        if (jLongValue > 0) {
            return O7.r.t(j, 0L, jLongValue);
        }
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    @Override // p085j5.O
    public final void release() {
        android.util.Log.d("ExoPlayerEngine", "Release");
        this.f24189h.unregister();
        this.f24187e = null;
        this.f24163B = null;
        u();
        S7.C.i(this.f24175O, null);
    }

    @Override // p085j5.O
    public final void setPlaybackSpeed(float f9) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.setPlaybackParameters(new androidx.media3.common.PlaybackParameters(f9));
        }
        android.util.Log.d("ExoPlayerEngine", "Speed set to " + f9 + "x");
    }

    @Override // p085j5.O
    public final void setVolume(float f9) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.setVolume(O7.r.r(f9, 0.0f, 1.0f));
        }
    }

    @Override // p085j5.O
    public final void stop() {
        S7.w0 w0Var = this.f24162A;
        if (w0Var != null) {
            w0Var.e(null);
        }
        this.f24162A = null;
        this.f24205z = false;
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        p099l5.h hVar = p099l5.h.f24783a;
        V7.n0 n0Var = this.f24190i;
        n0Var.getClass();
        n0Var.i(null, hVar);
        V7.n0 n0Var2 = this.f24191k;
        n0Var2.getClass();
        n0Var2.i(null, 0L);
        V7.n0 n0Var3 = this.f24193m;
        n0Var3.getClass();
        n0Var3.i(null, 0L);
        this.f24195o.h(null);
        android.util.Log.d("ExoPlayerEngine", "Stop");
    }

    public final void u() {
        S7.w0 w0Var = this.f24176P;
        if (w0Var != null) {
            w0Var.e(null);
        }
        this.f24176P = null;
        S7.w0 w0Var2 = this.f24177Q;
        if (w0Var2 != null) {
            w0Var2.e(null);
        }
        this.f24177Q = null;
        S7.w0 w0Var3 = this.f24162A;
        if (w0Var3 != null) {
            w0Var3.e(null);
        }
        this.f24162A = null;
        this.f24205z = false;
        S7.C0895k c0895k = this.f24180T;
        if (c0895k != null) {
            if (c0895k.isActive()) {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
            this.f24180T = null;
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f24196p;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.f24182Y);
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer2 = this.f24196p;
        if (exoPlayer2 != null) {
            exoPlayer2.removeAnalyticsListener(this.V);
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer3 = this.f24196p;
        if (exoPlayer3 != null) {
            exoPlayer3.release();
        }
        this.f24196p = null;
        this.f24197q = null;
        p099l5.h hVar = p099l5.h.f24783a;
        V7.n0 n0Var = this.f24190i;
        n0Var.getClass();
        n0Var.i(null, hVar);
        V7.n0 n0Var2 = this.f24191k;
        n0Var2.getClass();
        n0Var2.i(null, 0L);
        V7.n0 n0Var3 = this.f24193m;
        n0Var3.getClass();
        n0Var3.i(null, 0L);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f24178R = wVar;
        this.f24179S = wVar;
        this.W = null;
        this.X = null;
        this.f24200t = 0;
        this.f24202v = false;
    }

    public final void v() {
        S7.C0895k c0895k = this.f24180T;
        if (c0895k != null) {
            if (c0895k.isActive()) {
                c0895k.resumeWith(p070h6.A.f22523a);
            }
            this.f24180T = null;
        }
    }

    @Override // p085j5.O
    public final void f(long j) {
    }

    @Override // p085j5.O
    public final void k(long j) {
    }
}
