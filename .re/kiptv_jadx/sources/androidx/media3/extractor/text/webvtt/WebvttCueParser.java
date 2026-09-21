package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final java.util.regex.Pattern CUE_HEADER_PATTERN = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final java.util.regex.Pattern CUE_SETTING_PATTERN = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_TEXT_COLORS;
    private static final java.lang.String ENTITY_AMPERSAND = "amp";
    private static final java.lang.String ENTITY_GREATER_THAN = "gt";
    private static final java.lang.String ENTITY_LESS_THAN = "lt";
    private static final java.lang.String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final java.lang.String TAG = "WebvttCueParser";
    private static final java.lang.String TAG_BOLD = "b";
    private static final java.lang.String TAG_CLASS = "c";
    private static final java.lang.String TAG_ITALIC = "i";
    private static final java.lang.String TAG_LANG = "lang";
    private static final java.lang.String TAG_RUBY = "ruby";
    private static final java.lang.String TAG_RUBY_TEXT = "rt";
    private static final java.lang.String TAG_UNDERLINE = "u";
    private static final java.lang.String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    public static class Element {
        private static final java.util.Comparator<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> BY_START_POSITION_ASC = new androidx.media3.extractor.text.webvtt.a(0);
        private final int endPosition;
        private final androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(androidx.media3.extractor.text.webvtt.WebvttCueParser.Element element, androidx.media3.extractor.text.webvtt.WebvttCueParser.Element element2) {
            return java.lang.Integer.compare(element.startTag.position, element2.startTag.position);
        }

        private Element(androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, int i3) {
            this.startTag = startTag;
            this.endPosition = i3;
        }
    }

    public static final class StartTag {
        public final java.util.Set<java.lang.String> classes;
        public final java.lang.String name;
        public final int position;
        public final java.lang.String voice;

        private StartTag(java.lang.String str, int i3, java.lang.String str2, java.util.Set<java.lang.String> set) {
            this.position = i3;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }

        public static androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag buildStartTag(java.lang.String str, int i3) {
            java.lang.String str2;
            java.lang.String strTrim = str.trim();
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(io.ktor.sse.ServerSentEventKt.SPACE);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                java.lang.String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(strTrim, "\\.");
            java.lang.String str3 = strArrSplit[0];
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i9 = 1; i9 < strArrSplit.length; i9++) {
                hashSet.add(strArrSplit[i9]);
            }
            return new androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag(str3, i3, str2, hashSet);
        }

        public static androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag buildWholeCueVirtualTag() {
            return new androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag("", 0, "", java.util.Collections.EMPTY_SET);
        }
    }

    public static final class StyleMatch implements java.lang.Comparable<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> {
        public final int score;
        public final androidx.media3.extractor.text.webvtt.WebvttCssStyle style;

        public StyleMatch(int i3, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle) {
            this.score = i3;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch styleMatch) {
            return java.lang.Integer.compare(this.score, styleMatch.score);
        }
    }

    public static final class WebvttCueInfoBuilder {
        public java.lang.CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = Integer.MIN_VALUE;
        public float size = 1.0f;
        public int verticalType = Integer.MIN_VALUE;

        private static float computeLine(float f9, int i3) {
            if (f9 != -3.4028235E38f && i3 == 0 && (f9 < 0.0f || f9 > 1.0f)) {
                return 1.0f;
            }
            if (f9 != -3.4028235E38f) {
                return f9;
            }
            return i3 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static android.text.Layout.Alignment convertTextAlignment(int i3) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return android.text.Layout.Alignment.ALIGN_CENTER;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            Y6.f.p(i3, "Unknown textAlignment: ", androidx.media3.extractor.text.webvtt.WebvttCueParser.TAG);
                            return null;
                        }
                    }
                }
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            }
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }

        private static float deriveMaxSize(int i3, float f9) {
            if (i3 == 0) {
                return 1.0f - f9;
            }
            if (i3 == 1) {
                return f9 <= 0.5f ? f9 * 2.0f : (1.0f - f9) * 2.0f;
            }
            if (i3 == 2) {
                return f9;
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(i3));
        }

        private static float derivePosition(int i3) {
            if (i3 != 4) {
                return i3 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i3) {
            if (i3 == 1) {
                return 0;
            }
            if (i3 == 3) {
                return 2;
            }
            if (i3 != 4) {
                return i3 != 5 ? 1 : 2;
            }
            return 0;
        }

        public androidx.media3.extractor.text.webvtt.WebvttCueInfo build() {
            return new androidx.media3.extractor.text.webvtt.WebvttCueInfo(toCueBuilder().build(), this.startTimeUs, this.endTimeUs);
        }

        public androidx.media3.common.text.Cue.Builder toCueBuilder() {
            float fDerivePosition = this.position;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.textAlignment);
            }
            int iDerivePositionAnchor = this.positionAnchor;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.textAlignment);
            }
            androidx.media3.common.text.Cue.Builder verticalType = new androidx.media3.common.text.Cue.Builder().setTextAlignment(convertTextAlignment(this.textAlignment)).setLine(computeLine(this.line, this.lineType), this.lineType).setLineAnchor(this.lineAnchor).setPosition(fDerivePosition).setPositionAnchor(iDerivePositionAnchor).setSize(java.lang.Math.min(this.size, deriveMaxSize(iDerivePositionAnchor, fDerivePosition))).setVerticalType(this.verticalType);
            java.lang.CharSequence charSequence = this.text;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = java.util.Collections.unmodifiableMap(map2);
    }

    private static void applyDefaultColors(android.text.SpannableStringBuilder spannableStringBuilder, java.util.Set<java.lang.String> set, int i3, int i9) {
        for (java.lang.String str : set) {
            java.util.Map<java.lang.String, java.lang.Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(map.get(str).intValue()), i3, i9, 33);
            } else {
                java.util.Map<java.lang.String, java.lang.Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(map2.get(str).intValue()), i3, i9, 33);
                }
            }
        }
    }

    private static void applyEntity(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(CHAR_GREATER_THAN);
                break;
            case "lt":
                spannableStringBuilder.append(CHAR_LESS_THAN);
                break;
            case "amp":
                spannableStringBuilder.append(CHAR_AMPERSAND);
                break;
            case "nbsp":
                spannableStringBuilder.append(CHAR_SPACE);
                break;
            default:
                androidx.media3.common.util.Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> list, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, startTag);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        arrayList.addAll(list);
        java.util.Collections.sort(arrayList, androidx.media3.extractor.text.webvtt.WebvttCueParser.Element.BY_START_POSITION_ASC);
        int i3 = startTag.position;
        int length = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (TAG_RUBY_TEXT.equals(((androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) arrayList.get(i9)).startTag.name)) {
                androidx.media3.extractor.text.webvtt.WebvttCueParser.Element element = (androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) arrayList.get(i9);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, element.startTag), rubyPosition, 1);
                int i10 = element.startTag.position - length;
                int i11 = element.endPosition - length;
                java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i10, i11);
                spannableStringBuilder.delete(i10, i11);
                spannableStringBuilder.setSpan(new androidx.media3.common.text.RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i3, i10, 33);
                length = charSequenceSubSequence.length() + length;
                i3 = i10;
            }
        }
    }

    private static void applySpansForTag(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list2) {
        int i3 = startTag.position;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = startTag.name;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, startTag.classes, i3, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, length, 33);
                break;
            case "v":
                applyVoiceSpan(spannableStringBuilder, startTag.voice, i3, length);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, startTag, list, list2);
                break;
            default:
                return;
        }
        java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i9 = 0; i9 < applicableStyles.size(); i9++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i9).style, i3, length);
        }
    }

    private static void applyStyleToText(android.text.SpannableStringBuilder spannableStringBuilder, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, int i3, int i9) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.StyleSpan(webvttCssStyle.getStyle()), i3, i9, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i3, i9, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i9, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.ForegroundColorSpan(webvttCssStyle.getFontColor()), i3, i9, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i3, i9, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.TypefaceSpan(webvttCssStyle.getFontFamily()), i3, i9, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i3, i9, 33);
        } else if (fontSizeUnit == 2) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.RelativeSizeSpan(webvttCssStyle.getFontSize()), i3, i9, 33);
        } else if (fontSizeUnit == 3) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i3, i9, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i3, i9, 33);
        }
    }

    private static void applyVoiceSpan(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i3, int i9) {
        spannableStringBuilder.setSpan(new androidx.media3.common.text.VoiceSpan(str), i3, i9, 33);
    }

    private static int findEndOfTag(java.lang.String str, int i3) {
        int iIndexOf = str.indexOf(62, i3);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int firstKnownRubyPosition(int i3, int i9, int i10) {
        if (i3 != -1) {
            return i3;
        }
        if (i9 != -1) {
            return i9;
        }
        if (i10 != -1) {
            return i10;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> getApplicableStyles(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = list.get(i3);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                arrayList.add(new androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private static int getRubyPosition(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag) {
        java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i3 = 0; i3 < applicableStyles.size(); i3++) {
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = applicableStyles.get(i3).style;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static java.lang.String getTagName(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!strTrim.isEmpty());
        return androidx.media3.common.util.Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static androidx.media3.common.text.Cue newCueForText(java.lang.CharSequence charSequence) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        webvttCueInfoBuilder.text = charSequence;
        return webvttCueInfoBuilder.toCueBuilder().build();
    }

    public static androidx.media3.extractor.text.webvtt.WebvttCueInfo parseCue(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        java.lang.String line = parsableByteArray.readLine();
        if (line == null) {
            return null;
        }
        java.util.regex.Pattern pattern = CUE_HEADER_PATTERN;
        java.util.regex.Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        java.lang.String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return null;
        }
        java.util.regex.Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    public static androidx.media3.common.text.Cue.Builder parseCueSettingsList(java.lang.String str) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        parseCueSettingsList(str, webvttCueInfoBuilder);
        return webvttCueInfoBuilder.toCueBuilder();
    }

    public static android.text.SpannedString parseCueText(java.lang.String str, java.lang.String str2, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        while (i3 < str2.length()) {
            char cCharAt = str2.charAt(i3);
            if (cCharAt == '&') {
                i3++;
                int iIndexOf = str2.indexOf(59, i3);
                int iIndexOf2 = str2.indexOf(32, i3);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = java.lang.Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i3, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.SPACE);
                    }
                    i3 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i3++;
            } else {
                int iFindEndOfTag = i3 + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z6 = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i9 = iFindEndOfTag - 2;
                    boolean z9 = str2.charAt(i9) == '/';
                    int i10 = i3 + (z6 ? 2 : 1);
                    if (!z9) {
                        i9 = iFindEndOfTag - 1;
                    }
                    java.lang.String strSubstring = str2.substring(i10, i9);
                    if (!strSubstring.trim().isEmpty()) {
                        java.lang.String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z6) {
                                while (!arrayDeque.isEmpty()) {
                                    androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag = (androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag) arrayDeque.pop();
                                    applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new androidx.media3.extractor.text.webvtt.WebvttCueParser.Element(startTag, spannableStringBuilder.length()));
                                    }
                                    if (startTag.name.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z9) {
                                arrayDeque.push(androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i3 = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag.buildWholeCueVirtualTag(), java.util.Collections.EMPTY_LIST, spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    private static int parseLineAnchor(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static void parseLineAttribute(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.lineAnchor = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
        } else {
            webvttCueInfoBuilder.line = java.lang.Integer.parseInt(str);
            webvttCueInfoBuilder.lineType = 1;
        }
    }

    private static int parsePositionAnchor(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.positionAnchor = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        webvttCueInfoBuilder.position = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(str);
    }

    private static int parseTextAlignment(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    private static int parseVerticalAttribute(java.lang.String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        androidx.media3.common.util.Log.w(TAG, "Invalid 'vertical' value: ".concat(str));
        return Integer.MIN_VALUE;
    }

    private static void parseCueSettingsList(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        java.util.regex.Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    parseLineAttribute(strGroup2, webvttCueInfoBuilder);
                } else if ("align".equals(strGroup)) {
                    webvttCueInfoBuilder.textAlignment = parseTextAlignment(strGroup2);
                } else if ("position".equals(strGroup)) {
                    parsePositionAttribute(strGroup2, webvttCueInfoBuilder);
                } else if ("size".equals(strGroup)) {
                    webvttCueInfoBuilder.size = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    webvttCueInfoBuilder.verticalType = parseVerticalAttribute(strGroup2);
                } else {
                    androidx.media3.common.util.Log.w(TAG, "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (java.lang.NumberFormatException unused) {
                androidx.media3.common.util.Log.w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static androidx.media3.extractor.text.webvtt.WebvttCueInfo parseCue(java.lang.String str, java.util.regex.Matcher matcher, androidx.media3.common.util.ParsableByteArray parsableByteArray, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        try {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            webvttCueInfoBuilder.startTimeUs = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            webvttCueInfoBuilder.endTimeUs = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs(strGroup2);
            java.lang.String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            parseCueSettingsList(strGroup3, webvttCueInfoBuilder);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String line = parsableByteArray.readLine();
            while (!android.text.TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = parsableByteArray.readLine();
            }
            webvttCueInfoBuilder.text = parseCueText(str, sb.toString(), list);
            return webvttCueInfoBuilder.build();
        } catch (java.lang.IllegalArgumentException unused) {
            androidx.media3.common.util.Log.w(TAG, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
