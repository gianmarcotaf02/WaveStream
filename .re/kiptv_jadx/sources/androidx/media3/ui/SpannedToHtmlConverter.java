package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class SpannedToHtmlConverter {
    private static final java.util.regex.Pattern NEWLINE_PATTERN = java.util.regex.Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {
        public final java.util.Map<java.lang.String, java.lang.String> cssRuleSets;
        public final java.lang.String html;

        private HtmlAndCss(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    public static final class SpanInfo {
        private static final java.util.Comparator<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> FOR_CLOSING_TAGS;
        private static final java.util.Comparator<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> FOR_OPENING_TAGS;
        public final java.lang.String closingTag;
        public final int end;
        public final java.lang.String openingTag;
        public final int start;

        static {
            final int i3 = 0;
            FOR_OPENING_TAGS = new java.util.Comparator() { // from class: androidx.media3.ui.m
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo = (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj;
                    androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2 = (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i3) {
                        case 0:
                            return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$0(spanInfo, spanInfo2);
                        default:
                            return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$1(spanInfo, spanInfo2);
                    }
                }
            };
            final int i9 = 1;
            FOR_CLOSING_TAGS = new java.util.Comparator() { // from class: androidx.media3.ui.m
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo = (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj;
                    androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2 = (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i9) {
                        case 0:
                            return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$0(spanInfo, spanInfo2);
                        default:
                            return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$1(spanInfo, spanInfo2);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int iCompare = java.lang.Integer.compare(spanInfo2.end, spanInfo.end);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
            return iCompareTo != 0 ? iCompareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$1(androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int iCompare = java.lang.Integer.compare(spanInfo2.start, spanInfo.start);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = spanInfo2.openingTag.compareTo(spanInfo.openingTag);
            return iCompareTo != 0 ? iCompareTo : spanInfo2.closingTag.compareTo(spanInfo.closingTag);
        }

        private SpanInfo(int i3, int i9, java.lang.String str, java.lang.String str2) {
            this.start = i3;
            this.end = i9;
            this.openingTag = str;
            this.closingTag = str2;
        }
    }

    public static final class Transition {
        private final java.util.List<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> spansAdded = new java.util.ArrayList();
        private final java.util.List<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> spansRemoved = new java.util.ArrayList();
    }

    private SpannedToHtmlConverter() {
    }

    public static androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss convert(java.lang.CharSequence charSequence, float f9) {
        p076i4.X0 x9 = p076i4.X0.f22848n;
        if (charSequence == null) {
            return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss("", x9);
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss(escapeHtml(charSequence), x9);
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i3 = 0;
        for (android.text.style.BackgroundColorSpan backgroundColorSpan : (android.text.style.BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), android.text.style.BackgroundColorSpan.class)) {
            hashSet.add(java.lang.Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            map.put(androidx.media3.ui.HtmlUtils.cssAllClassDescendantsSelector(com.google.android.gms.internal.play_billing.M0.l(iIntValue, "bg_")), androidx.media3.common.util.Util.formatInvariant("background-color:%s;", androidx.media3.ui.HtmlUtils.toCssRgba(iIntValue)));
        }
        android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArrayFindSpanTransitions = findSpanTransitions(spanned, f9);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned.length());
        int i9 = 0;
        while (i3 < sparseArrayFindSpanTransitions.size()) {
            int iKeyAt = sparseArrayFindSpanTransitions.keyAt(i3);
            sb.append(escapeHtml(spanned.subSequence(i9, iKeyAt)));
            androidx.media3.ui.SpannedToHtmlConverter.Transition transition = sparseArrayFindSpanTransitions.get(iKeyAt);
            java.util.Collections.sort(transition.spansRemoved, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS);
            java.util.Iterator it2 = transition.spansRemoved.iterator();
            while (it2.hasNext()) {
                sb.append(((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) it2.next()).closingTag);
            }
            java.util.Collections.sort(transition.spansAdded, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS);
            java.util.Iterator it3 = transition.spansAdded.iterator();
            while (it3.hasNext()) {
                sb.append(((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) it3.next()).openingTag);
            }
            i3++;
            i9 = iKeyAt;
        }
        sb.append(escapeHtml(spanned.subSequence(i9, spanned.length())));
        return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss(sb.toString(), map);
    }

    private static java.lang.String escapeHtml(java.lang.CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(android.text.Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> findSpanTransitions(android.text.Spanned spanned, float f9) {
        android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArray = new android.util.SparseArray<>();
        for (java.lang.Object obj : spanned.getSpans(0, spanned.length(), java.lang.Object.class)) {
            java.lang.String openingTag = getOpeningTag(obj, f9);
            java.lang.String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                closingTag.getClass();
                androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo = new androidx.media3.ui.SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(spanInfo);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(spanInfo);
            }
        }
        return sparseArray;
    }

    private static java.lang.String getClosingTag(java.lang.Object obj) {
        if ((obj instanceof android.text.style.StrikethroughSpan) || (obj instanceof android.text.style.ForegroundColorSpan) || (obj instanceof android.text.style.BackgroundColorSpan) || (obj instanceof androidx.media3.common.text.HorizontalTextInVerticalContextSpan) || (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan) || (obj instanceof androidx.media3.common.text.TextEmphasisSpan)) {
            return "</span>";
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            if (((android.text.style.TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof androidx.media3.common.text.RubySpan) {
                return Y6.f.m(new java.lang.StringBuilder("<rt>"), escapeHtml(((androidx.media3.common.text.RubySpan) obj).rubyText), "</rt></ruby>");
            }
            if (obj instanceof android.text.style.UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static java.lang.String getOpeningTag(java.lang.Object obj, float f9) {
        if (obj instanceof android.text.style.StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof android.text.style.ForegroundColorSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span style='color:%s;'>", androidx.media3.ui.HtmlUtils.toCssRgba(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof android.text.style.BackgroundColorSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span class='bg_%s'>", java.lang.Integer.valueOf(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof androidx.media3.common.text.HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof android.text.style.AbsoluteSizeSpan) {
            android.text.style.AbsoluteSizeSpan absoluteSizeSpan = (android.text.style.AbsoluteSizeSpan) obj;
            return androidx.media3.common.util.Util.formatInvariant("<span style='font-size:%.2fpx;'>", java.lang.Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f9));
        }
        if (obj instanceof android.text.style.RelativeSizeSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span style='font-size:%.2f%%;'>", java.lang.Float.valueOf(((android.text.style.RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            java.lang.String family = ((android.text.style.TypefaceSpan) obj).getFamily();
            if (family != null) {
                return androidx.media3.common.util.Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof androidx.media3.common.text.RubySpan)) {
            if (obj instanceof android.text.style.UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof androidx.media3.common.text.TextEmphasisSpan)) {
                return null;
            }
            androidx.media3.common.text.TextEmphasisSpan textEmphasisSpan = (androidx.media3.common.text.TextEmphasisSpan) obj;
            return androidx.media3.common.util.Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
        }
        int i3 = ((androidx.media3.common.text.RubySpan) obj).position;
        if (i3 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i3 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i3 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static androidx.media3.ui.SpannedToHtmlConverter.Transition getOrCreate(android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArray, int i3) {
        androidx.media3.ui.SpannedToHtmlConverter.Transition transition = sparseArray.get(i3);
        if (transition != null) {
            return transition;
        }
        androidx.media3.ui.SpannedToHtmlConverter.Transition transition2 = new androidx.media3.ui.SpannedToHtmlConverter.Transition();
        sparseArray.put(i3, transition2);
        return transition2;
    }

    private static java.lang.String getTextEmphasisPosition(int i3) {
        return i3 != 2 ? "over right" : "under left";
    }

    private static java.lang.String getTextEmphasisStyle(int i3, int i9) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i9 == 1) {
            sb.append("filled ");
        } else if (i9 == 2) {
            sb.append("open ");
        }
        if (i3 == 0) {
            sb.append("none");
        } else if (i3 == 1) {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (i3 == 2) {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT);
        } else if (i3 != 3) {
            sb.append("unset");
        } else {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        }
        return sb.toString();
    }
}
