package p175v0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements p175v0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f29080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f29081b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p175v0.k f29083d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p136q.A f29085f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p175v0.F f29086h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p175v0.F f29082c = new p175v0.F(2, null, 14);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p175v0.o f29084e = new p175v0.o(this);
    public final p136q.D g = new p136q.D(1);

    public p(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.ui.platform.AndroidComposeView androidComposeView2) {
        this.f29080a = androidComposeView;
        this.f29081b = androidComposeView2;
        this.f29083d = new p175v0.k(this, androidComposeView2);
    }

    public final boolean a(boolean z6) {
        Q0.C0765b0 c0765b0;
        if (f() != null) {
            p175v0.F f9 = f();
            i(null);
            if (f9 != null) {
                f9.O0(p175v0.D.f29046h, p175v0.D.j);
                if (!f9.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = f9.f26475h.f26478l;
                Q0.F fT = Q0.AbstractC0777k.t(f9);
                while (fT != null) {
                    if ((fT.f8232N.f8391f.f26477k & 1024) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 1024) != 0) {
                                p038e0.e eVar = null;
                                p137q0.o oVarE = oVar;
                                while (oVarE != null) {
                                    if (oVarE instanceof p175v0.F) {
                                        ((p175v0.F) oVarE).O0(p175v0.D.f29047i, p175v0.D.j);
                                    } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                                        int i3 = 0;
                                        for (p137q0.o oVar2 = ((Q0.AbstractC0776j) oVarE).f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
                                            if ((oVar2.j & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    oVarE = oVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (oVarE != null) {
                                                        eVar.c(oVarE);
                                                        oVarE = null;
                                                    }
                                                    eVar.c(oVar2);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    oVarE = Q0.AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i3, boolean z6, boolean z9) {
        int iOrdinal;
        boolean z10 = true;
        if (z6 || (iOrdinal = p175v0.AbstractC2909d.v(this.f29082c, i3).ordinal()) == 0) {
            a(z6);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new I3.b();
            }
            z10 = false;
        }
        if (z10 && z9) {
            c();
        }
        return z10;
    }

    public final void c() {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f29080a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            android.view.View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0162 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:315:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:344:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0146 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[ADDED_TO_REGION, LOOP:12: B:41:0x0079->B:69:0x00c5, LOOP_START, PHI: r7
  0x0079: PHI (r7v27 q0.o) = (r7v22 q0.o), (r7v28 q0.o) binds: [B:40:0x0077, B:69:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff A[ADDED_TO_REGION, LOOP:16: B:87:0x00ff->B:115:0x014b, LOOP_START, PHI: r1
  0x00ff: PHI (r1v14 q0.o) = (r1v9 q0.o), (r1v15 q0.o) binds: [B:86:0x00fd, B:115:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0101 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0110 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0116 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r15v5, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r15v9, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    public final boolean d(android.view.KeyEvent keyEvent, kotlin.jvm.functions.Function0 function0) {
        p137q0.o oVar;
        Q0.F fT;
        java.lang.Object obj;
        java.lang.Object obj2;
        p137q0.o oVar2;
        Q0.C0765b0 c0765b0;
        p137q0.o oVarE;
        p038e0.e eVar;
        p137q0.o oVar3;
        Q0.F fT2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        Q0.C0765b0 c0765b1;
        p038e0.e eVar2;
        p137q0.o oVarE2;
        int size;
        Q0.C0765b0 c0765b2;
        p175v0.F f9 = this.f29082c;
        android.os.Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f29083d.f29077e) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                android.os.Trace.endSection();
                return false;
            }
            if (!j(keyEvent)) {
                android.os.Trace.endSection();
                return false;
            }
            p175v0.F f10 = p175v0.AbstractC2909d.f(f9);
            if (f10 != null) {
                if (!f10.f26475h.f26487u) {
                    N0.a.b("visitLocalDescendants called on an unattached node");
                }
                p137q0.o oVar4 = f10.f26475h;
                if ((oVar4.f26477k & 9216) != 0) {
                    oVar2 = null;
                    for (p137q0.o oVar5 = oVar4.f26479m; oVar5 != null; oVar5 = oVar5.f26479m) {
                        int i3 = oVar5.j;
                        if ((i3 & 9216) != 0) {
                            if ((i3 & 1024) != 0) {
                                break;
                            }
                            oVar2 = oVar5;
                        }
                    }
                } else {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    if (f10 == null) {
                        if (!f9.f26475h.f26487u) {
                            N0.a.b("visitAncestors called on an unattached node");
                        }
                        oVar = f9.f26475h.f26478l;
                        fT = Q0.AbstractC0777k.t(f9);
                        loop15: while (true) {
                            if (fT != null) {
                                obj = null;
                                break;
                            }
                            if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                                while (oVar != null) {
                                    if ((oVar.j & 8192) != 0) {
                                        oVarE = oVar;
                                        eVar = null;
                                        while (oVarE != null) {
                                            if (oVarE instanceof I0.e) {
                                                obj = oVarE;
                                                break loop15;
                                            }
                                            if ((oVarE.j & 8192) == 0) {
                                            }
                                            oVarE = Q0.AbstractC0777k.e(eVar);
                                        }
                                    }
                                    oVar = oVar.f26478l;
                                }
                            }
                            fT = fT.x();
                            if (fT != null) {
                            }
                        }
                        obj2 = (I0.e) obj;
                        if (obj2 != null) {
                            oVar2 = ((p137q0.o) obj2).f26475h;
                        } else {
                            oVar2 = null;
                        }
                    } else {
                        if (!f10.f26475h.f26487u) {
                            N0.a.b("visitAncestors called on an unattached node");
                        }
                        oVar3 = f10.f26475h;
                        fT2 = Q0.AbstractC0777k.t(f10);
                        loop11: while (true) {
                            if (fT2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((fT2.f8232N.f8391f.f26477k & 8192) != 0) {
                                while (oVar3 != null) {
                                    if ((oVar3.j & 8192) != 0) {
                                        eVar2 = null;
                                        oVarE2 = oVar3;
                                        while (oVarE2 != null) {
                                            if (oVarE2 instanceof I0.e) {
                                                obj3 = oVarE2;
                                                break loop11;
                                            }
                                            if ((oVarE2.j & 8192) == 0) {
                                            }
                                            oVarE2 = Q0.AbstractC0777k.e(eVar2);
                                        }
                                    }
                                    oVar3 = oVar3.f26478l;
                                }
                            }
                            fT2 = fT2.x();
                            if (fT2 != null) {
                            }
                        }
                        obj4 = (I0.e) obj3;
                        if (obj4 != null) {
                            oVar2 = ((p137q0.o) obj4).f26475h;
                        } else {
                            if (!f9.f26475h.f26487u) {
                                N0.a.b("visitAncestors called on an unattached node");
                            }
                            oVar = f9.f26475h.f26478l;
                            fT = Q0.AbstractC0777k.t(f9);
                            loop15: while (true) {
                                if (fT != null) {
                                    obj = null;
                                    break;
                                }
                                if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                                    while (oVar != null) {
                                        if ((oVar.j & 8192) != 0) {
                                            oVarE = oVar;
                                            eVar = null;
                                            while (oVarE != null) {
                                                if (oVarE instanceof I0.e) {
                                                    obj = oVarE;
                                                    break loop15;
                                                }
                                                if ((oVarE.j & 8192) == 0) {
                                                }
                                                oVarE = Q0.AbstractC0777k.e(eVar);
                                            }
                                        }
                                        oVar = oVar.f26478l;
                                    }
                                }
                                fT = fT.x();
                                if (fT != null) {
                                }
                            }
                            obj2 = (I0.e) obj;
                            if (obj2 != null) {
                                oVar2 = ((p137q0.o) obj2).f26475h;
                            } else {
                                oVar2 = null;
                            }
                        }
                    }
                }
            } else if (f10 == null) {
                if (!f9.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                oVar = f9.f26475h.f26478l;
                fT = Q0.AbstractC0777k.t(f9);
                loop15: while (true) {
                    if (fT != null) {
                        obj = null;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 8192) != 0) {
                                oVarE = oVar;
                                eVar = null;
                                while (oVarE != null) {
                                    if (oVarE instanceof I0.e) {
                                        obj = oVarE;
                                        break loop15;
                                    }
                                    if ((oVarE.j & 8192) == 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar6 = ((Q0.AbstractC0776j) oVarE).f8443w;
                                        int i9 = 0;
                                        while (oVar6 != null) {
                                            if ((oVar6.j & 8192) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    oVarE = oVarE;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    oVarE = oVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (oVarE != null) {
                                                        eVar.c(oVarE);
                                                        oVarE = null;
                                                    }
                                                    eVar.c(oVar6);
                                                }
                                            } else {
                                                oVarE = oVarE;
                                                eVar = eVar;
                                            }
                                            oVar6 = oVar6.f26479m;
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        }
                                        if (i9 == 1) {
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        } else {
                                            oVarE = oVarE;
                                            eVar = eVar;
                                        }
                                    }
                                    oVarE = Q0.AbstractC0777k.e(eVar);
                                }
                            }
                            oVar = oVar.f26478l;
                        }
                    }
                    fT = fT.x();
                    oVar = (fT != null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                }
                obj2 = (I0.e) obj;
                if (obj2 != null) {
                    oVar2 = ((p137q0.o) obj2).f26475h;
                } else {
                    oVar2 = null;
                }
            } else {
                if (!f10.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                oVar3 = f10.f26475h;
                fT2 = Q0.AbstractC0777k.t(f10);
                loop11: while (true) {
                    if (fT2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((fT2.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar3 != null) {
                            if ((oVar3.j & 8192) != 0) {
                                eVar2 = null;
                                oVarE2 = oVar3;
                                while (oVarE2 != null) {
                                    if (oVarE2 instanceof I0.e) {
                                        obj3 = oVarE2;
                                        break loop11;
                                    }
                                    if ((oVarE2.j & 8192) == 0 && (oVarE2 instanceof Q0.AbstractC0776j)) {
                                        p137q0.o oVar7 = ((Q0.AbstractC0776j) oVarE2).f8443w;
                                        int i10 = 0;
                                        while (oVar7 != null) {
                                            if ((oVar7.j & 8192) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    oVarE2 = oVarE2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    oVarE2 = oVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (oVarE2 != null) {
                                                        eVar2.c(oVarE2);
                                                        oVarE2 = null;
                                                    }
                                                    eVar2.c(oVar7);
                                                }
                                            } else {
                                                oVarE2 = oVarE2;
                                                eVar2 = eVar2;
                                            }
                                            oVar7 = oVar7.f26479m;
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        }
                                        if (i10 == 1) {
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        } else {
                                            oVarE2 = oVarE2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    oVarE2 = Q0.AbstractC0777k.e(eVar2);
                                }
                            }
                            oVar3 = oVar3.f26478l;
                        }
                    }
                    fT2 = fT2.x();
                    oVar3 = (fT2 != null || (c0765b1 = fT2.f8232N) == null) ? null : c0765b1.f8390e;
                }
                obj4 = (I0.e) obj3;
                if (obj4 != null) {
                    oVar2 = ((p137q0.o) obj4).f26475h;
                } else {
                    if (!f9.f26475h.f26487u) {
                        N0.a.b("visitAncestors called on an unattached node");
                    }
                    oVar = f9.f26475h.f26478l;
                    fT = Q0.AbstractC0777k.t(f9);
                    loop15: while (true) {
                        if (fT != null) {
                            obj = null;
                            break;
                        }
                        if ((fT.f8232N.f8391f.f26477k & 8192) != 0) {
                            while (oVar != null) {
                                if ((oVar.j & 8192) != 0) {
                                    oVarE = oVar;
                                    eVar = null;
                                    while (oVarE != null) {
                                        if (oVarE instanceof I0.e) {
                                            obj = oVarE;
                                            break loop15;
                                        }
                                        if ((oVarE.j & 8192) == 0) {
                                        }
                                        oVarE = Q0.AbstractC0777k.e(eVar);
                                    }
                                }
                                oVar = oVar.f26478l;
                            }
                        }
                        fT = fT.x();
                        if (fT != null) {
                        }
                    }
                    obj2 = (I0.e) obj;
                    if (obj2 != null) {
                        oVar2 = ((p137q0.o) obj2).f26475h;
                    } else {
                        oVar2 = null;
                    }
                }
            }
            if (oVar2 != null) {
                if (!oVar2.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar8 = oVar2.f26475h.f26478l;
                Q0.F fT3 = Q0.AbstractC0777k.t(oVar2);
                java.util.ArrayList arrayList = null;
                while (fT3 != null) {
                    if ((fT3.f8232N.f8391f.f26477k & 8192) != 0) {
                        while (oVar8 != null) {
                            if ((oVar8.j & 8192) != 0) {
                                p137q0.o oVarE3 = oVar8;
                                p038e0.e eVar3 = null;
                                while (oVarE3 != null) {
                                    if (oVarE3 instanceof I0.e) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        arrayList.add(oVarE3);
                                    } else if ((oVarE3.j & 8192) != 0 && (oVarE3 instanceof Q0.AbstractC0776j)) {
                                        int i11 = 0;
                                        for (p137q0.o oVar9 = ((Q0.AbstractC0776j) oVarE3).f8443w; oVar9 != null; oVar9 = oVar9.f26479m) {
                                            if ((oVar9.j & 8192) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    oVarE3 = oVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new p038e0.e(new p137q0.o[16]);
                                                    }
                                                    if (oVarE3 != null) {
                                                        eVar3.c(oVarE3);
                                                        oVarE3 = null;
                                                    }
                                                    eVar3.c(oVar9);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    oVarE3 = Q0.AbstractC0777k.e(eVar3);
                                }
                            }
                            oVar8 = oVar8.f26478l;
                        }
                    }
                    fT3 = fT3.x();
                    oVar8 = (fT3 == null || (c0765b2 = fT3.f8232N) == null) ? null : c0765b2.f8390e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i12 = size - 1;
                        if (((I0.e) arrayList.get(size)).f(keyEvent)) {
                            android.os.Trace.endSection();
                            return true;
                        }
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
                ?? E9 = oVar2.f26475h;
                ?? eVar4 = 0;
                while (E9 != 0) {
                    if (E9 instanceof I0.e) {
                        if (((I0.e) E9).f(keyEvent)) {
                            android.os.Trace.endSection();
                            return true;
                        }
                    } else if ((E9.j & 8192) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar10 = ((Q0.AbstractC0776j) E9).f8443w;
                        int i13 = 0;
                        while (oVar10 != null) {
                            if ((oVar10.j & 8192) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    E9 = E9;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    E9 = oVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (E9 != 0) {
                                        eVar4.c(E9);
                                        E9 = 0;
                                    }
                                    eVar4.c(oVar10);
                                }
                            } else {
                                E9 = E9;
                                eVar4 = eVar4;
                            }
                            oVar10 = oVar10.f26479m;
                            E9 = E9;
                            eVar4 = eVar4;
                        }
                        if (i13 == 1) {
                            E9 = E9;
                            eVar4 = eVar4;
                        } else {
                            E9 = E9;
                            eVar4 = eVar4;
                        }
                    }
                    E9 = Q0.AbstractC0777k.e(eVar4);
                }
                if (((java.lang.Boolean) function0.invoke()).booleanValue()) {
                    android.os.Trace.endSection();
                    return true;
                }
                ?? E10 = oVar2.f26475h;
                ?? eVar5 = 0;
                while (E10 != 0) {
                    if (E10 instanceof I0.e) {
                        if (((I0.e) E10).z(keyEvent)) {
                            android.os.Trace.endSection();
                            return true;
                        }
                    } else if ((E10.j & 8192) != 0 && (E10 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar11 = ((Q0.AbstractC0776j) E10).f8443w;
                        int i14 = 0;
                        while (oVar11 != null) {
                            if ((oVar11.j & 8192) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    eVar5 = eVar5;
                                    E10 = E10;
                                    eVar5 = eVar5;
                                    E10 = oVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (E10 != 0) {
                                        eVar5.c(E10);
                                        E10 = 0;
                                    }
                                    eVar5.c(oVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                E10 = E10;
                            }
                            oVar11 = oVar11.f26479m;
                            eVar5 = eVar5;
                            E10 = E10;
                        }
                        if (i14 == 1) {
                            eVar5 = eVar5;
                            E10 = E10;
                        } else {
                            eVar5 = eVar5;
                            E10 = E10;
                        }
                    }
                    E10 = Q0.AbstractC0777k.e(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        if (((I0.e) arrayList.get(i15)).z(keyEvent)) {
                            android.os.Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            android.os.Trace.endSection();
            return false;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f A[PHI: r12
  0x005f: PHI (r12v17 v0.y) = (r12v14 v0.y), (r12v21 v0.y) binds: [B:38:0x007c, B:24:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.Boolean e(int i3, p181w0.b bVar, p194x6.j jVar) {
        boolean zA;
        Q0.C0765b0 c0765b0;
        p175v0.y yVar;
        p175v0.y yVar2;
        p175v0.F f9 = this.f29082c;
        p175v0.F f10 = p175v0.AbstractC2909d.f(f9);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f29081b;
        int i9 = 4;
        p175v0.F f11 = null;
        boolean zBooleanValue = false;
        if (f10 != null) {
            p113n1.n layoutDirection = androidComposeView.getLayoutDirection();
            p175v0.u uVarP0 = f10.P0();
            if (i3 == 1) {
                yVar = uVarP0.f29092b;
            } else if (i3 == 2) {
                yVar = uVarP0.f29093c;
            } else if (i3 == 5) {
                yVar = uVarP0.f29094d;
            } else if (i3 == 6) {
                yVar = uVarP0.f29095e;
            } else if (i3 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal == 0) {
                    yVar2 = uVarP0.f29097h;
                } else {
                    if (iOrdinal != 1) {
                        throw new I3.b();
                    }
                    yVar2 = uVarP0.f29098i;
                }
                if (yVar2 == p175v0.y.f29103b) {
                    yVar2 = null;
                }
                if (yVar2 == null) {
                    yVar = uVarP0.f29096f;
                } else {
                    yVar = yVar2;
                }
            } else if (i3 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    yVar2 = uVarP0.f29098i;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new I3.b();
                    }
                    yVar2 = uVarP0.f29097h;
                }
                if (yVar2 == p175v0.y.f29103b) {
                    yVar2 = null;
                }
                if (yVar2 == null) {
                    yVar = uVarP0.g;
                } else {
                    yVar = yVar2;
                }
            } else {
                if (i3 != 7 && i3 != 8) {
                    throw new java.lang.IllegalStateException("invalid FocusDirection");
                }
                p175v0.C2906a c2906a = new p175v0.C2906a(i3);
                p175v0.p pVar = (p175v0.p) Q0.AbstractC0777k.u(f10).getFocusOwner();
                p175v0.F f12 = pVar.f();
                if (i3 == 7) {
                    uVarP0.j.invoke(c2906a);
                } else {
                    uVarP0.f29099k.invoke(c2906a);
                }
                yVar = c2906a.f29061b ? p175v0.y.f29104c : f12 != pVar.f() ? p175v0.y.f29105d : p175v0.y.f29103b;
            }
            p175v0.y yVar3 = p175v0.y.f29104c;
            if (!kotlin.jvm.internal.m.a(yVar, yVar3)) {
                if (kotlin.jvm.internal.m.a(yVar, p175v0.y.f29105d)) {
                    p175v0.F f13 = p175v0.AbstractC2909d.f(f9);
                    if (f13 != null) {
                        return (java.lang.Boolean) jVar.invoke(f13);
                    }
                } else {
                    p175v0.y yVar4 = p175v0.y.f29103b;
                    if (!kotlin.jvm.internal.m.a(yVar, yVar4)) {
                        if (yVar == yVar4) {
                            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (yVar == yVar3) {
                            throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        p038e0.e eVar = yVar.f29106a;
                        int i10 = eVar.j;
                        if (i10 == 0) {
                            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            java.lang.Object[] objArr = eVar.f21324h;
                            boolean z6 = false;
                            for (int i11 = 0; i11 < i10; i11++) {
                                p137q0.o oVar = (p137q0.o) ((p175v0.A) objArr[i11]);
                                if (!oVar.f26475h.f26487u) {
                                    N0.a.b("visitChildren called on an unattached node");
                                }
                                p038e0.e eVar2 = new p038e0.e(new p137q0.o[16]);
                                p137q0.o oVar2 = oVar.f26475h;
                                p137q0.o oVar3 = oVar2.f26479m;
                                if (oVar3 == null) {
                                    Q0.AbstractC0777k.b(eVar2, oVar2);
                                } else {
                                    eVar2.c(oVar3);
                                }
                                while (true) {
                                    int i12 = eVar2.j;
                                    if (i12 == 0) {
                                        break;
                                    }
                                    p137q0.o oVarE = (p137q0.o) eVar2.m(i12 - 1);
                                    if ((oVarE.f26477k & 1024) == 0) {
                                        Q0.AbstractC0777k.b(eVar2, oVarE);
                                    } else {
                                        while (oVarE != null) {
                                            if ((oVarE.j & 1024) != 0) {
                                                p038e0.e eVar3 = null;
                                                while (oVarE != null) {
                                                    if (oVarE instanceof p175v0.F) {
                                                        if (((java.lang.Boolean) jVar.invoke((p175v0.F) oVarE)).booleanValue()) {
                                                            z6 = true;
                                                            break;
                                                        }
                                                    } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                                                        int i13 = 0;
                                                        for (p137q0.o oVar4 = ((Q0.AbstractC0776j) oVarE).f8443w; oVar4 != null; oVar4 = oVar4.f26479m) {
                                                            if ((oVar4.j & 1024) != 0) {
                                                                i13++;
                                                                if (i13 == 1) {
                                                                    oVarE = oVar4;
                                                                } else {
                                                                    if (eVar3 == null) {
                                                                        eVar3 = new p038e0.e(new p137q0.o[16]);
                                                                    }
                                                                    if (oVarE != null) {
                                                                        eVar3.c(oVarE);
                                                                        oVarE = null;
                                                                    }
                                                                    eVar3.c(oVar4);
                                                                }
                                                            }
                                                        }
                                                        if (i13 == 1) {
                                                        }
                                                    }
                                                    oVarE = Q0.AbstractC0777k.e(eVar3);
                                                }
                                                break;
                                            }
                                            oVarE = oVarE.f26479m;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z6;
                        }
                        return java.lang.Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        f10 = null;
        p113n1.n layoutDirection2 = androidComposeView.getLayoutDirection();
        p029d.b bVar2 = new p029d.b(f10, this, jVar);
        if (i3 == 1 || i3 == 2) {
            if (i3 == 1) {
                zA = p175v0.AbstractC2909d.l(f9, bVar2);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = p175v0.AbstractC2909d.a(f9, bVar2);
            }
            return java.lang.Boolean.valueOf(zA);
        }
        if (i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) {
            return p175v0.AbstractC2909d.E(i3, bVar2, f9, bVar);
        }
        if (i3 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new I3.b();
                }
                i9 = 3;
            }
            p175v0.F f14 = p175v0.AbstractC2909d.f(f9);
            if (f14 != null) {
                return p175v0.AbstractC2909d.E(i9, bVar2, f14, bVar);
            }
            return null;
        }
        if (i3 != 8) {
            throw new java.lang.IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((java.lang.Object) p175v0.C2911f.a(i3))).toString());
        }
        p175v0.F f15 = p175v0.AbstractC2909d.f(f9);
        if (f15 != null) {
            if (!f15.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            p137q0.o oVar5 = f15.f26475h.f26478l;
            Q0.F fT = Q0.AbstractC0777k.t(f15);
            loop5: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 1024) != 0) {
                    while (oVar5 != null) {
                        if ((oVar5.j & 1024) != 0) {
                            p137q0.o oVarE2 = oVar5;
                            p038e0.e eVar4 = null;
                            while (oVarE2 != null) {
                                if (oVarE2 instanceof p175v0.F) {
                                    p175v0.F f16 = (p175v0.F) oVarE2;
                                    if (f16.P0().f29091a) {
                                        f11 = f16;
                                        break loop5;
                                    }
                                } else if ((oVarE2.j & 1024) != 0 && (oVarE2 instanceof Q0.AbstractC0776j)) {
                                    int i14 = 0;
                                    for (p137q0.o oVar6 = ((Q0.AbstractC0776j) oVarE2).f8443w; oVar6 != null; oVar6 = oVar6.f26479m) {
                                        if ((oVar6.j & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                oVarE2 = oVar6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (oVarE2 != null) {
                                                    eVar4.c(oVarE2);
                                                    oVarE2 = null;
                                                }
                                                eVar4.c(oVar6);
                                            }
                                        }
                                    }
                                    if (i14 != 1) {
                                        oVarE2 = Q0.AbstractC0777k.e(eVar4);
                                    }
                                }
                                oVarE2 = Q0.AbstractC0777k.e(eVar4);
                            }
                        }
                        oVar5 = oVar5.f26478l;
                    }
                }
                fT = fT.x();
                oVar5 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
        }
        p175v0.F f17 = f11;
        if (f17 != null && !f17.equals(f9)) {
            zBooleanValue = ((java.lang.Boolean) bVar2.invoke(f17)).booleanValue();
        }
        return java.lang.Boolean.valueOf(zBooleanValue);
    }

    public final p175v0.F f() {
        p175v0.F f9 = this.f29086h;
        if (f9 == null || !f9.f26487u) {
            return null;
        }
        return f9;
    }

    public final boolean g(int i3, boolean z6) {
        p175v0.F f9 = f();
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f29080a;
        if (f9 == null || !f9.f29050v || !androidComposeView.v(i3)) {
            kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
            a2.f24539h = java.lang.Boolean.FALSE;
            p175v0.F f10 = f();
            java.lang.Boolean boolE = e(i3, androidComposeView.getEmbeddedViewFocusRect(), new Z.Q(a2, i3, 1));
            if (!kotlin.jvm.internal.m.a(boolE, java.lang.Boolean.TRUE) || f10 == f()) {
                if (boolE != null && a2.f24539h != null) {
                    if (!boolE.booleanValue() || !((java.lang.Boolean) a2.f24539h).booleanValue()) {
                        if ((i3 == 1 || i3 == 2) && z6 && b(i3, false, false)) {
                            java.lang.Boolean boolE2 = e(i3, null, new R0.C0850u(i3, 3));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i3) {
        if (!b(i3, false, false)) {
            return false;
        }
        java.lang.Boolean boolE = e(i3, null, new R0.C0850u(i3, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(p175v0.F f9) {
        p175v0.F f10 = this.f29086h;
        this.f29086h = f9;
        p136q.D d4 = this.g;
        java.lang.Object[] objArr = d4.f26303a;
        int i3 = d4.f26304b;
        for (int i9 = 0; i9 < i3; i9++) {
            ((p175v0.l) objArr[i9]).a(f10, f9);
        }
    }

    public final boolean j(android.view.KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z6;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i3;
        long jB = I0.c.b(keyEvent);
        int iC = I0.c.c(keyEvent);
        boolean z9 = true;
        char c9 = '\b';
        int i9 = 0;
        if (iC != 2) {
            if (iC != 1) {
                return true;
            }
            p136q.A a2 = this.f29085f;
            if (a2 == null || !a2.a(jB)) {
                return false;
            }
            p136q.A a9 = this.f29085f;
            if (a9 != null) {
                int iHashCode = java.lang.Long.hashCode(jB) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 & 127;
                int i12 = a9.f26288c;
                int i13 = i10 >>> 7;
                loop5: while (true) {
                    int i14 = i13 & i12;
                    long[] jArr2 = a9.f26286a;
                    int i15 = i14 >> 3;
                    int i16 = (i14 & 7) << 3;
                    long j9 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
                    long j10 = (((long) i11) * 72340172838076673L) ^ j9;
                    for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                        iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                        if (a9.f26287b[iNumberOfTrailingZeros] == jB) {
                            break loop5;
                        }
                    }
                    if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i9 += 8;
                    i13 = i14 + i9;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    a9.f26289d--;
                    long[] jArr3 = a9.f26286a;
                    int i17 = a9.f26288c;
                    int i18 = iNumberOfTrailingZeros >> 3;
                    int i19 = (iNumberOfTrailingZeros & 7) << 3;
                    long j12 = (jArr3[i18] & (~(255 << i19))) | (254 << i19);
                    jArr3[i18] = j12;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j12;
                    return true;
                }
            }
            return true;
        }
        p136q.A a10 = this.f29085f;
        if (a10 == null) {
            a10 = new p136q.A(3);
            this.f29085f = a10;
        }
        p136q.A a11 = a10;
        int iHashCode2 = java.lang.Long.hashCode(jB) * (-862048943);
        int i20 = iHashCode2 ^ (iHashCode2 << 16);
        int i21 = i20 >>> 7;
        int i22 = i20 & 127;
        int i23 = a11.f26288c;
        int i24 = i21 & i23;
        int i25 = 0;
        loop0: while (true) {
            long[] jArr4 = a11.f26286a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            long j13 = (jArr4[i26] >>> i27) | ((jArr4[i26 + (z9 ? 1 : 0)] << (64 - i27)) & ((-i27) >> 63));
            long j14 = i22;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros2 = (i24 + (java.lang.Long.numberOfTrailingZeros(j16) >> 3)) & i23;
                z6 = z9;
                if (a11.f26287b[iNumberOfTrailingZeros2] == jB) {
                    break loop0;
                }
                j16 &= j16 - 1;
                z9 = z6 ? 1 : 0;
            }
            z6 = z9;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iB = a11.b(i21);
                if (a11.f26290e != 0 || ((a11.f26286a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 128;
                } else {
                    int i28 = a11.f26288c;
                    if (i28 > 8) {
                        j = 128;
                        if (java.lang.Long.compare((((long) a11.f26289d) * 32) ^ Long.MIN_VALUE, (((long) i28) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = a11.f26286a;
                            int i29 = a11.f26288c;
                            long[] jArr6 = a11.f26287b;
                            int i30 = 0;
                            for (int i31 = (i29 + 7) >> 3; i30 < i31; i31 = i31) {
                                long j17 = jArr5[i30] & (-9187201950435737472L);
                                jArr5[i30] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                i30++;
                                jArr6 = jArr6;
                            }
                            long[] jArr7 = jArr6;
                            int iP0 = p078i6.m.p0(jArr5);
                            int i32 = iP0 - 1;
                            jArr5[i32] = (jArr5[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iP0] = jArr5[0];
                            int i33 = 0;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j18 = (jArr5[i34] >> i35) & 255;
                                if (j18 != 128 && j18 == 254) {
                                    int iHashCode3 = java.lang.Long.hashCode(jArr7[i33]) * (-862048943);
                                    int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i37 = i36 >>> 7;
                                    int iB2 = a11.b(i37);
                                    int i38 = i37 & i29;
                                    char c10 = c9;
                                    if (((iB2 - i38) & i29) / 8 == ((i33 - i38) & i29) / 8) {
                                        jArr5[i34] = (jArr5[i34] & (~(255 << i35))) | (((long) (i36 & 127)) << i35);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i33++;
                                    } else {
                                        int i39 = i33;
                                        int i40 = iB2 >> 3;
                                        long j19 = jArr5[i40];
                                        int i41 = (iB2 & 7) << 3;
                                        if (((j19 >> i41) & 255) == 128) {
                                            jArr5[i40] = (j19 & (~(255 << i41))) | (((long) (i36 & 127)) << i41);
                                            jArr5[i34] = (jArr5[i34] & (~(255 << i35))) | (128 << i35);
                                            jArr7[iB2] = jArr7[i39];
                                            jArr7[i39] = 0;
                                            i3 = i39;
                                        } else {
                                            jArr5[i40] = (((long) (i36 & 127)) << i41) | (j19 & (~(255 << i41)));
                                            long j20 = jArr7[iB2];
                                            jArr7[iB2] = jArr7[i39];
                                            jArr7[i39] = j20;
                                            i3 = i39 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i33 = i3 + 1;
                                    }
                                    c9 = c10;
                                } else {
                                    i33++;
                                }
                            }
                            a11.f26290e = p136q.P.a(a11.f26288c) - a11.f26289d;
                        }
                        iB = a11.b(i21);
                    } else {
                        j = 128;
                    }
                    int iB3 = p136q.P.b(a11.f26288c);
                    long[] jArr8 = a11.f26286a;
                    long[] jArr9 = a11.f26287b;
                    a11.c(iB3);
                    long[] jArr10 = a11.f26286a;
                    long[] jArr11 = a11.f26287b;
                    int i42 = a11.f26288c;
                    int i43 = 0;
                    for (int i44 = a11.f26288c; i43 < i44; i44 = i44) {
                        if (((jArr8[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j) {
                            long j21 = jArr9[i43];
                            int iHashCode4 = java.lang.Long.hashCode(j21) * (-862048943);
                            int i45 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr10;
                            int iB4 = a11.b(i45 >>> 7);
                            int i46 = iB4 >> 3;
                            int i47 = (iB4 & 7) << 3;
                            long j22 = (jArr[i46] & (~(255 << i47))) | (((long) (i45 & 127)) << i47);
                            jArr[i46] = j22;
                            jArr[(((iB4 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                            jArr11[iB4] = j21;
                        } else {
                            jArr = jArr10;
                        }
                        i43++;
                        jArr9 = jArr9;
                        jArr10 = jArr;
                    }
                    iB = a11.b(i21);
                }
                iNumberOfTrailingZeros2 = iB;
                a11.f26289d++;
                int i48 = a11.f26290e;
                long[] jArr12 = a11.f26286a;
                int i49 = iNumberOfTrailingZeros2 >> 3;
                long j23 = jArr12[i49];
                int i50 = (iNumberOfTrailingZeros2 & 7) << 3;
                a11.f26290e = i48 - (((j23 >> i50) & 255) == j ? z6 ? 1 : 0 : 0);
                int i51 = a11.f26288c;
                long j24 = (j23 & (~(255 << i50))) | (j14 << i50);
                jArr12[i49] = j24;
                jArr12[(((iNumberOfTrailingZeros2 - 7) & i51) + (i51 & 7)) >> 3] = j24;
                break;
            }
            i25 += 8;
            i24 = (i24 + i25) & i23;
            z9 = z6 ? 1 : 0;
        }
        a11.f26287b[iNumberOfTrailingZeros2] = jB;
        return z6;
    }
}
