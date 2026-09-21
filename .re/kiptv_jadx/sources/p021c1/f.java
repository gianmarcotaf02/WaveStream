package p021c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static android.text.StaticLayout a(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i3, int i9, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i10, android.text.TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z6, int i13, int i14, int i15, int i16) {
        if (i9 < 0) {
            p065h1.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i9 < 0 || i9 > length) {
            p065h1.a.a("invalid end value");
        }
        if (i10 < 0) {
            p065h1.a.a("invalid maxLines value");
        }
        if (i3 < 0) {
            p065h1.a.a("invalid width value");
        }
        if (i11 < 0) {
            p065h1.a.a("invalid ellipsizedWidth value");
        }
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, i9, textPaint, i3);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i10);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i11);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z6);
        builderObtain.setBreakStrategy(i13);
        builderObtain.setHyphenationFrequency(i16);
        builderObtain.setIndents(null, null);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            builderObtain.setJustificationMode(i12);
        }
        if (i17 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i17 >= 33) {
            builderObtain.setLineBreakConfig(E1.c.d().setLineBreakStyle(i14).setLineBreakWordStyle(i15).build());
        }
        if (i17 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final android.graphics.Rect b(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i3, int i9) {
        int i10 = i3;
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i10 - 1, i9, android.text.style.MetricAffectingSpan.class) != i9) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i10 < i9) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i9, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i10, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i10, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i10, i9, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i10, i9, rect3);
        return rect3;
    }

    public static final float c(int i3, int i9, float[] fArr) {
        return fArr[((i3 - i9) * 2) + 1];
    }

    public static final int d(android.text.Layout layout, int i3, boolean z6) {
        if (i3 <= 0) {
            return 0;
        }
        if (i3 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i3);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i3 || lineEnd == i3) {
            if (lineStart == i3) {
                if (z6) {
                    return lineForOffset - 1;
                }
            } else if (!z6) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0268 A[EDGE_INSN: B:145:0x0268->B:172:0x02c4 BREAK  A[LOOP:5: B:155:0x0284->B:207:0x0284]] */
    public static final int e(p021c1.i iVar, android.text.Layout layout, E2.d dVar, int i3, android.graphics.RectF rectF, p031d1.d dVar2, B.d0 d0Var, boolean z6) {
        p021c1.d[] dVarArr;
        int i9;
        p021c1.d[] dVarArr2;
        int i10;
        int iH;
        int i11;
        int i12;
        int iG;
        java.text.Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i3);
        int lineBottom = layout.getLineBottom(i3);
        int lineStart = layout.getLineStart(i3);
        int lineEnd = layout.getLineEnd(i3);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i13 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i13];
        android.text.Layout layout2 = iVar.f18473f;
        int lineStart2 = layout2.getLineStart(i3);
        int iF = iVar.f(i3);
        if (i13 < (iF - lineStart2) * 2) {
            p065h1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        X0.i iVar2 = new X0.i(iVar);
        boolean z9 = false;
        boolean z10 = layout2.getParagraphDirection(i3) == 1;
        int i14 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z10 && !zIsRtlCharAt) {
                fA = iVar2.a(lineStart2, z9, z9, true);
                fA3 = iVar2.a(lineStart2 + 1, true, true, true);
            } else if (z10 && zIsRtlCharAt) {
                fA3 = iVar2.a(lineStart2, false, false, false);
                fA = iVar2.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = iVar2.a(lineStart2, false, false, true);
                    fA = iVar2.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = iVar2.a(lineStart2, false, false, false);
                    fA2 = iVar2.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i14] = fA;
            fArr[i14 + 1] = fA3;
            i14 += 2;
            lineStart2++;
            z10 = z10;
            z9 = false;
        }
        android.text.Layout layout3 = (android.text.Layout) dVar.j;
        int lineStart3 = layout3.getLineStart(i3);
        int lineEnd2 = layout3.getLineEnd(i3);
        int iO = dVar.o(lineStart3, false);
        int iQ = dVar.q(iO);
        int i15 = lineStart3 - iQ;
        int i16 = lineEnd2 - iQ;
        java.text.Bidi bidiJ = dVar.j(iO);
        if (bidiJ == null || (bidiCreateLineBidi = bidiJ.createLineBidi(i15, i16)) == null) {
            dVarArr = new p021c1.d[]{new p021c1.d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            dVarArr = new p021c1.d[runCount];
            int i17 = 0;
            while (i17 < runCount) {
                int i18 = runCount;
                dVarArr[i17] = new p021c1.d(bidiCreateLineBidi.getRunStart(i17) + lineStart3, bidiCreateLineBidi.getRunLimit(i17) + lineStart3, bidiCreateLineBidi.getRunLevel(i17) % 2 == 1);
                i17++;
                runCount = i18;
            }
        }
        D6.e gVar = z6 ? new D6.g(0, dVarArr.length - 1, 1) : new D6.e(dVarArr.length - 1, 0, -1);
        int i19 = gVar.f2458h;
        int i20 = gVar.f2459i;
        int i21 = gVar.j;
        if ((i21 <= 0 || i19 > i20) && (i21 >= 0 || i20 > i19)) {
            return -1;
        }
        while (true) {
            p021c1.d dVar3 = dVarArr[i19];
            boolean z11 = dVar3.f18457c;
            int iA = dVar3.f18455a;
            int iB = dVar3.f18456b;
            float f9 = z11 ? fArr[((iB - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fC = z11 ? c(iA, lineStart, fArr) : c(iB - 1, lineStart, fArr);
            boolean z12 = dVar3.f18457c;
            if (z6) {
                float f10 = rectF.left;
                if (fC >= f10) {
                    i9 = i21;
                    float f11 = rectF.right;
                    if (f9 <= f11) {
                        if ((z12 || f10 > f9) && (!z12 || f11 < fC)) {
                            int i22 = iA;
                            int i23 = iB;
                            while (true) {
                                i11 = i23;
                                if (i23 - i22 <= 1) {
                                    break;
                                }
                                int i24 = (i11 + i22) / 2;
                                float f12 = fArr[(i24 - lineStart) * 2];
                                if ((z12 || f12 <= rectF.left) && (!z12 || f12 >= rectF.right)) {
                                    i23 = i11;
                                    i22 = i24;
                                } else {
                                    i23 = i24;
                                }
                            }
                            i12 = z12 ? i11 : i22;
                        } else {
                            i12 = iA;
                        }
                        int iH2 = dVar2.h(i12);
                        if (iH2 != -1 && (iG = dVar2.g(iH2)) < iB) {
                            if (iG >= iA) {
                                iA = iG;
                            }
                            if (iH2 > iB) {
                                iH2 = iB;
                            }
                            dVarArr2 = dVarArr;
                            android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iH3 = iH2;
                            while (true) {
                                rectF2.left = z12 ? fArr[((iH3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                                rectF2.right = z12 ? c(iA, lineStart, fArr) : c(iH3 - 1, lineStart, fArr);
                                if (((java.lang.Boolean) d0Var.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iA = dVar2.a(iA);
                                if (iA != -1 && iA < iB) {
                                    iH3 = dVar2.h(iA);
                                    if (iH3 > iB) {
                                        iH3 = iB;
                                    }
                                }
                            }
                        }
                        iA = -1;
                        break;
                    }
                } else {
                    i9 = i21;
                }
                dVarArr2 = dVarArr;
                iA = -1;
                break;
            } else {
                i9 = i21;
                dVarArr2 = dVarArr;
                float f13 = rectF.left;
                if (fC < f13) {
                    iB = -1;
                    break;
                }
                float f14 = rectF.right;
                if (f9 <= f14) {
                    if ((z12 || f14 < fC) && (!z12 || f13 > f9)) {
                        int i25 = iA;
                        int i26 = iB;
                        while (i26 - i25 > 1) {
                            int i27 = (i26 + i25) / 2;
                            float f15 = fArr[(i27 - lineStart) * 2];
                            int i28 = i26;
                            if ((z12 || f15 <= rectF.right) && (!z12 || f15 >= rectF.left)) {
                                i26 = i28;
                                i25 = i27;
                            } else {
                                i26 = i27;
                            }
                        }
                        i10 = z12 ? i26 : i25;
                    } else {
                        i10 = iB - 1;
                    }
                    int iG2 = dVar2.g(i10 + 1);
                    if (iG2 == -1 || (iH = dVar2.h(iG2)) <= iA) {
                        iB = -1;
                        break;
                    }
                    if (iG2 < iA) {
                        iG2 = iA;
                    }
                    if (iH <= iB) {
                        iB = iH;
                    }
                    android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iG3 = iG2;
                    while (true) {
                        rectF3.left = z12 ? fArr[((iB - 1) - lineStart) * 2] : fArr[(iG3 - lineStart) * 2];
                        rectF3.right = z12 ? c(iG3, lineStart, fArr) : c(iB - 1, lineStart, fArr);
                        if (((java.lang.Boolean) d0Var.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iB = dVar2.b(iB);
                        if (iB == -1 || iB <= iA) {
                            iB = -1;
                            break;
                        }
                        iG3 = dVar2.g(iB);
                        if (iG3 < iA) {
                            iG3 = iA;
                        }
                    }
                } else {
                    iB = -1;
                    break;
                }
                iA = iB;
            }
            if (iA >= 0) {
                return iA;
            }
            if (i19 == i20) {
                return -1;
            }
            i19 += i9;
            i21 = i9;
            dVarArr = dVarArr2;
        }
    }

    public static final boolean f(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
