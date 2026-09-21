package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f944b;

    public /* synthetic */ F0(int i3, java.lang.Object obj) {
        this.f943a = i3;
        this.f944b = obj;
    }

    @Override // p020c0.H
    public final void dispose() {
        java.lang.String str;
        com.kiptv.core.model.z0 z0Var;
        java.lang.Object obj = this.f944b;
        switch (this.f943a) {
            case 0:
                C5.c2 c2Var = (C5.c2) obj;
                p077i5.P p2 = (p077i5.P) c2Var.f1296z.getValue();
                if (p2 != null) {
                    com.kiptv.core.model.TraktMediaRef traktMediaRefF0 = c2Var.f0();
                    if (traktMediaRefF0 != null) {
                        c2Var.f1291t.c(traktMediaRefF0, c2Var.e0(null));
                    }
                    c2Var.T();
                    if (!p2.f23035b.f23089e && (str = c2Var.f1244K) != null) {
                        long jLongValue = ((java.lang.Number) ((V7.n0) p2.f23075w.f10419h).getValue()).longValue();
                        long jLongValue2 = ((java.lang.Number) ((V7.n0) p2.f23071u.f10419h).getValue()).longValue();
                        if (jLongValue2 > 1000) {
                            C5.AbstractC0108f0 abstractC0108f0 = c2Var.f1294w;
                            if (abstractC0108f0 instanceof C5.C0105e0) {
                                z0Var = com.kiptv.core.model.z0.j;
                            } else if (abstractC0108f0 instanceof C5.C0102d0) {
                                z0Var = com.kiptv.core.model.z0.f20885i;
                            }
                            int i3 = (int) (jLongValue2 / 1000);
                            java.lang.String str2 = c2Var.f1245L;
                            int i9 = (int) (jLongValue / 1000);
                            int i10 = i9 < 0 ? 0 : i9;
                            java.lang.String str3 = c2Var.f1246M;
                            java.lang.Integer num = c2Var.f1247N;
                            java.lang.Integer num2 = c2Var.f1248O;
                            java.lang.Integer num3 = c2Var.f1249P;
                            java.lang.String str4 = c2Var.f1250Q;
                            com.kiptv.core.model.A0 a2 = com.kiptv.core.model.A0.f19669h;
                            p005a5.i9 i9Var = c2Var.g;
                            i9Var.getClass();
                            S7.C.A(i9Var.f14626i, null, new p005a5.e9(i9Var, str, z0Var, str2, i3, i10, str3, num, num2, num3, str4, a2, null), 3);
                            c2Var.f1267f0 = i3;
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((F.C0358x) obj).f3504d = null;
                break;
            case 2:
                F.N n3 = (F.N) obj;
                F.i0 i0Var = n3.f3360c;
                if (i0Var != null) {
                    i0Var.f3464a = false;
                }
                n3.f3360c = null;
                break;
            case 3:
                ((F.I) obj).f3348f = true;
                break;
            case 4:
                ((U.i0) obj).o();
                break;
            case 5:
                J5.U1 u1 = (J5.U1) obj;
                com.kiptv.core.model.PlaylistSettings playlistSettingsA = u1.f6282b.a();
                if (playlistSettingsA != null) {
                    S7.C.A(androidx.lifecycle.X.h(u1), null, new J5.P1(u1, playlistSettingsA, null), 3);
                    break;
                }
                break;
            case 6:
                ((J5.N2) obj).f6196b.d();
                break;
            case 7:
                O.i iVar = (O.i) obj;
                p121o0.r rVar = iVar.f7537e;
                k3.h hVar = rVar.f26020h;
                if (hVar != null) {
                    hVar.a();
                }
                rVar.a();
                android.view.ActionMode actionMode = iVar.f7539h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                iVar.f7539h = null;
                break;
            case 8:
                Q.b bVar = (Q.b) ((Q.d) obj).f8197c.getValue();
                if (bVar != null) {
                    bVar.close();
                }
                break;
            case 9:
                ((R0.C0847s0) obj).f8989i.invoke();
                break;
            case 10:
                ((p029d.d) obj).e();
                break;
            case 11:
                ((p029d.j) obj).e();
                break;
            case 12:
                p108m5.m mVar = (p108m5.m) obj;
                org.videolan.libvlc.MediaPlayer mediaPlayer = mVar.f25427a;
                if (mediaPlayer != null) {
                    java.util.WeakHashMap weakHashMap = p108m5.n.f25429a;
                    org.videolan.libvlc.util.VLCVideoLayout vLCVideoLayout = mVar.f25428b;
                    java.util.WeakHashMap weakHashMap2 = p108m5.n.f25429a;
                    if (weakHashMap2.get(mediaPlayer) == vLCVideoLayout) {
                        weakHashMap2.remove(mediaPlayer);
                        try {
                            mediaPlayer.detachViews();
                        } catch (java.lang.Throwable th) {
                            com.google.common.util.concurrent.P.T(th);
                        }
                    }
                }
                mVar.f25427a = null;
                mVar.f25428b = null;
                break;
            case 13:
                androidx.media3.exoplayer.ExoPlayer exoPlayer = (androidx.media3.exoplayer.ExoPlayer) obj;
                exoPlayer.stop();
                exoPlayer.release();
                break;
            case 14:
                p146r1.y yVar = (p146r1.y) obj;
                yVar.dismiss();
                yVar.f26792n.c();
                break;
            case 15:
                p146r1.A a9 = (p146r1.A) obj;
                a9.c();
                a9.getClass();
                androidx.lifecycle.X.i(a9, null);
                a9.f26711v.removeViewImmediate(a9);
                break;
            default:
                ((v5.d1) obj).r();
                break;
        }
    }
}
