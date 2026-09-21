package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlRenderUtil {
    private static final java.lang.String TAG = "TtmlRenderUtil";

    private TtmlRenderUtil() {
    }

    public static void applyStylesToSpan(android.text.Spannable spannable, int i3, int i9, androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle, androidx.media3.extractor.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, int i10) {
        androidx.media3.extractor.text.ttml.TtmlNode ttmlNodeFindRubyTextNode;
        androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyleResolveStyle;
        int i11;
        if (ttmlStyle.getStyle() != -1) {
            spannable.setSpan(new android.text.style.StyleSpan(ttmlStyle.getStyle()), i3, i9, 33);
        }
        if (ttmlStyle.isLinethrough()) {
            spannable.setSpan(new android.text.style.StrikethroughSpan(), i3, i9, 33);
        }
        if (ttmlStyle.isUnderline()) {
            spannable.setSpan(new android.text.style.UnderlineSpan(), i3, i9, 33);
        }
        if (ttmlStyle.hasFontColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new android.text.style.ForegroundColorSpan(ttmlStyle.getFontColor()), i3, i9, 33);
        }
        if (ttmlStyle.hasBackgroundColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new android.text.style.BackgroundColorSpan(ttmlStyle.getBackgroundColor()), i3, i9, 33);
        }
        if (ttmlStyle.getFontFamily() != null) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new android.text.style.TypefaceSpan(ttmlStyle.getFontFamily()), i3, i9, 33);
        }
        if (ttmlStyle.getTextEmphasis() != null) {
            androidx.media3.extractor.text.ttml.TextEmphasis textEmphasis = ttmlStyle.getTextEmphasis();
            textEmphasis.getClass();
            int i12 = textEmphasis.markShape;
            if (i12 == -1) {
                i12 = (i10 == 2 || i10 == 1) ? 3 : 1;
                i11 = 1;
            } else {
                i11 = textEmphasis.markFill;
            }
            int i13 = textEmphasis.position;
            if (i13 == -2) {
                i13 = 1;
            }
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new androidx.media3.common.text.TextEmphasisSpan(i12, i11, i13), i3, i9, 33);
        }
        int rubyType = ttmlStyle.getRubyType();
        if (rubyType == 2) {
            androidx.media3.extractor.text.ttml.TtmlNode ttmlNodeFindRubyContainerNode = findRubyContainerNode(ttmlNode, map);
            if (ttmlNodeFindRubyContainerNode != null && (ttmlNodeFindRubyTextNode = findRubyTextNode(ttmlNodeFindRubyContainerNode, map)) != null) {
                if (ttmlNodeFindRubyTextNode.getChildCount() != 1 || ttmlNodeFindRubyTextNode.getChild(0).text == null) {
                    androidx.media3.common.util.Log.i(TAG, "Skipping rubyText node without exactly one text child.");
                } else {
                    java.lang.String str = (java.lang.String) androidx.media3.common.util.Util.castNonNull(ttmlNodeFindRubyTextNode.getChild(0).text);
                    androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyleResolveStyle2 = resolveStyle(ttmlNodeFindRubyTextNode.style, ttmlNodeFindRubyTextNode.getStyleIds(), map);
                    int rubyPosition = ttmlStyleResolveStyle2 != null ? ttmlStyleResolveStyle2.getRubyPosition() : -1;
                    if (rubyPosition == -1 && (ttmlStyleResolveStyle = resolveStyle(ttmlNodeFindRubyContainerNode.style, ttmlNodeFindRubyContainerNode.getStyleIds(), map)) != null) {
                        rubyPosition = ttmlStyleResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new androidx.media3.common.text.RubySpan(str, rubyPosition), i3, i9, 33);
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new androidx.media3.extractor.text.ttml.DeleteTextSpan(), i3, i9, 33);
        }
        if (ttmlStyle.getTextCombine()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i3, i9, 33);
        }
        int fontSizeUnit = ttmlStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new android.text.style.AbsoluteSizeSpan((int) ttmlStyle.getFontSize(), true), i3, i9, 33);
        } else if (fontSizeUnit == 2) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannable, new android.text.style.RelativeSizeSpan(ttmlStyle.getFontSize()), i3, i9, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            androidx.media3.common.text.SpanUtil.addInheritedRelativeSizeSpan(spannable, ttmlStyle.getFontSize() / 100.0f, i3, i9, 33);
        }
    }

    public static java.lang.String applyTextElementSpacePolicy(java.lang.String str) {
        return str.replaceAll(io.ktor.sse.ServerSentEventKt.END_OF_LINE, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", io.ktor.sse.ServerSentEventKt.SPACE).replaceAll("[ \t\\x0B\f\r]+", io.ktor.sse.ServerSentEventKt.SPACE);
    }

    public static void endParagraph(android.text.SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static androidx.media3.extractor.text.ttml.TtmlNode findRubyContainerNode(androidx.media3.extractor.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map) {
        while (ttmlNode != null) {
            androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyleResolveStyle = resolveStyle(ttmlNode.style, ttmlNode.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 1) {
                return ttmlNode;
            }
            ttmlNode = ttmlNode.parent;
        }
        return null;
    }

    private static androidx.media3.extractor.text.ttml.TtmlNode findRubyTextNode(androidx.media3.extractor.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(ttmlNode);
        while (!arrayDeque.isEmpty()) {
            androidx.media3.extractor.text.ttml.TtmlNode ttmlNode2 = (androidx.media3.extractor.text.ttml.TtmlNode) arrayDeque.pop();
            androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyleResolveStyle = resolveStyle(ttmlNode2.style, ttmlNode2.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 3) {
                return ttmlNode2;
            }
            for (int childCount = ttmlNode2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(ttmlNode2.getChild(childCount));
            }
        }
        return null;
    }

    public static androidx.media3.extractor.text.ttml.TtmlStyle resolveStyle(androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle, java.lang.String[] strArr, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map) {
        int i3 = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle2 = new androidx.media3.extractor.text.ttml.TtmlStyle();
                int length = strArr.length;
                while (i3 < length) {
                    ttmlStyle2.chain(map.get(strArr[i3]));
                    i3++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return ttmlStyle.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i3 < length2) {
                    ttmlStyle.chain(map.get(strArr[i3]));
                    i3++;
                }
            }
        }
        return ttmlStyle;
    }
}
