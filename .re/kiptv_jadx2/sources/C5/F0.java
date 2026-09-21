package C5;

import F.C0358x;
import J5.N2;
import R0.C0847s0;
import android.view.ActionMode;
import androidx.media3.exoplayer.ExoPlayer;
import com.kiptv.core.model.PlaylistSettings;
import com.kiptv.core.model.TraktMediaRef;
import java.util.WeakHashMap;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.util.VLCVideoLayout;
import p005a5.e9;
import p005a5.i9;

public final class F0 implements p020c0.H {

    public final int f943a;

    public final Object f944b;

    public F0(int i3, Object obj) {
        this.f943a = i3;
        this.f944b = obj;
    }

    @Override
    public final void dispose() {
        String str;
        com.kiptv.core.model.z0 z0Var;
        Object obj = this.f944b;
        switch (this.f943a) {
            case 0:
                c2 c2Var = (c2) obj;
                p077i5.P p2 = (p077i5.P) c2Var.f1296z.getValue();
                if (p2 != null) {
                    TraktMediaRef traktMediaRefF0 = c2Var.f0();
                    if (traktMediaRefF0 != null) {
                        c2Var.f1291t.c(traktMediaRefF0, c2Var.e0(null));
                    }
                    c2Var.T();
                    if (!p2.f23035b.f23089e && (str = c2Var.f1244K) != null) {
                        long jLongValue = ((Number) ((V7.n0) p2.f23075w.f10419h).getValue()).longValue();
                        long jLongValue2 = ((Number) ((V7.n0) p2.f23071u.f10419h).getValue()).longValue();
                        if (jLongValue2 > 1000) {
                            AbstractC0108f0 abstractC0108f0 = c2Var.f1294w;
                            if (abstractC0108f0 instanceof C0105e0) {
                                z0Var = com.kiptv.core.model.z0.j;
                            } else if (abstractC0108f0 instanceof C0102d0) {
                                z0Var = com.kiptv.core.model.z0.f20885i;
                            }
                            int i3 = (int) (jLongValue2 / 1000);
                            String str2 = c2Var.f1245L;
                            int i9 = (int) (jLongValue / 1000);
                            int i10 = i9 < 0 ? 0 : i9;
                            String str3 = c2Var.f1246M;
                            Integer num = c2Var.f1247N;
                            Integer num2 = c2Var.f1248O;
                            Integer num3 = c2Var.f1249P;
                            String str4 = c2Var.f1250Q;
                            com.kiptv.core.model.A0 a2 = com.kiptv.core.model.A0.f19669h;
                            i9 i9Var = c2Var.g;
                            i9Var.getClass();
                            S7.C.A(i9Var.f14626i, null, new e9(i9Var, str, z0Var, str2, i3, i10, str3, num, num2, num3, str4, a2, null), 3);
                            c2Var.f1267f0 = i3;
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((C0358x) obj).f3504d = null;
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
                PlaylistSettings playlistSettingsA = u1.f6282b.a();
                if (playlistSettingsA != null) {
                    S7.C.A(androidx.lifecycle.X.h(u1), null, new J5.P1(u1, playlistSettingsA, null), 3);
                    break;
                }
                break;
            case 6:
                ((N2) obj).f6196b.d();
                break;
            case 7:
                O.i iVar = (O.i) obj;
                p121o0.r rVar = iVar.f7537e;
                k3.h hVar = rVar.f26020h;
                if (hVar != null) {
                    hVar.a();
                }
                rVar.a();
                ActionMode actionMode = iVar.f7539h;
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
                ((C0847s0) obj).f8989i.invoke();
                break;
            case 10:
                ((p029d.d) obj).e();
                break;
            case 11:
                ((p029d.j) obj).e();
                break;
            case 12:
                p108m5.m mVar = (p108m5.m) obj;
                MediaPlayer mediaPlayer = mVar.f25427a;
                if (mediaPlayer != null) {
                    WeakHashMap weakHashMap = p108m5.n.f25429a;
                    VLCVideoLayout vLCVideoLayout = mVar.f25428b;
                    WeakHashMap weakHashMap2 = p108m5.n.f25429a;
                    if (weakHashMap2.get(mediaPlayer) == vLCVideoLayout) {
                        weakHashMap2.remove(mediaPlayer);
                        try {
                            mediaPlayer.detachViews();
                        } catch (Throwable th) {
                            com.google.common.util.concurrent.P.T(th);
                        }
                    }
                }
                mVar.f25427a = null;
                mVar.f25428b = null;
                break;
            case 13:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
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
