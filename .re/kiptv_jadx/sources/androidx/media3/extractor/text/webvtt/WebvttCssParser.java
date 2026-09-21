package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttCssParser {
    private static final java.lang.String PROPERTY_BGCOLOR = "background-color";
    private static final java.lang.String PROPERTY_COLOR = "color";
    private static final java.lang.String PROPERTY_FONT_FAMILY = "font-family";
    private static final java.lang.String PROPERTY_FONT_SIZE = "font-size";
    private static final java.lang.String PROPERTY_FONT_STYLE = "font-style";
    private static final java.lang.String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final java.lang.String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final java.lang.String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final java.lang.String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final java.lang.String RULE_END = "}";
    private static final java.lang.String RULE_START = "{";
    private static final java.lang.String TAG = "WebvttCssParser";
    private static final java.lang.String VALUE_ALL = "all";
    private static final java.lang.String VALUE_BOLD = "bold";
    private static final java.lang.String VALUE_DIGITS = "digits";
    private static final java.lang.String VALUE_ITALIC = "italic";
    private static final java.lang.String VALUE_OVER = "over";
    private static final java.lang.String VALUE_UNDER = "under";
    private static final java.lang.String VALUE_UNDERLINE = "underline";
    private static final java.util.regex.Pattern VOICE_NAME_PATTERN = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern FONT_SIZE_PATTERN = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final androidx.media3.common.util.ParsableByteArray styleInput = new androidx.media3.common.util.ParsableByteArray();
    private final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();

    private void applySelectorToStyle(androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            java.util.regex.Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                java.lang.String strGroup = matcher.group(1);
                strGroup.getClass();
                webvttCssStyle.setTargetVoice(strGroup);
            }
            str = str.substring(0, iIndexOf);
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, "\\.");
        java.lang.String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((java.lang.String[]) androidx.media3.common.util.Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    private static boolean maybeSkipComment(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 > iLimit) {
            return false;
        }
        int i3 = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i9 = position + 2;
        if (data[i3] != 42) {
            return false;
        }
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= iLimit) {
                parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                return true;
            }
            if (((char) data[i9]) == '*' && ((char) data[i10]) == '/') {
                i9 += 2;
                iLimit = i9;
            } else {
                i9 = i10;
            }
        }
    }

    private static boolean maybeSkipWhitespace(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        char cPeekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    private static void parseFontSize(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle) {
        java.util.regex.Matcher matcher = FONT_SIZE_PATTERN.matcher(com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str));
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Invalid font-size: '" + str + "'.");
            return;
        }
        java.lang.String strGroup = matcher.group(2);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case "em":
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case "px":
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        java.lang.String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        webvttCssStyle.setFontSize(java.lang.Float.parseFloat(strGroup2));
    }

    private static java.lang.String parseIdentifier(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        boolean z6 = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z6) {
            char c9 = (char) parsableByteArray.getData()[position];
            if ((c9 < 'A' || c9 > 'Z') && ((c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                z6 = true;
            } else {
                position++;
                sb.append(c9);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    public static java.lang.String parseNextToken(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        java.lang.String identifier = parseIdentifier(parsableByteArray, sb);
        if (!identifier.isEmpty()) {
            return identifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    private static java.lang.String parsePropertyValue(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z6 = false;
        while (!z6) {
            int position = parsableByteArray.getPosition();
            java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
            if (nextToken == null) {
                return null;
            }
            if (RULE_END.equals(nextToken) || ";".equals(nextToken)) {
                parsableByteArray.setPosition(position);
                z6 = true;
            } else {
                sb2.append(nextToken);
            }
        }
        return sb2.toString();
    }

    private static java.lang.String parseSelector(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
        if (nextToken == null) {
            return null;
        }
        if (RULE_START.equals(nextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        java.lang.String cueTarget = "(".equals(nextToken) ? readCueTarget(parsableByteArray) : null;
        if (")".equals(parseNextToken(parsableByteArray, sb))) {
            return cueTarget;
        }
        return null;
    }

    private static void parseStyleDeclaration(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        java.lang.String identifier = parseIdentifier(parsableByteArray, sb);
        if (!identifier.isEmpty() && ":".equals(parseNextToken(parsableByteArray, sb))) {
            skipWhitespaceAndComments(parsableByteArray);
            java.lang.String propertyValue = parsePropertyValue(parsableByteArray, sb);
            if (propertyValue == null || propertyValue.isEmpty()) {
                return;
            }
            int position = parsableByteArray.getPosition();
            java.lang.String nextToken = parseNextToken(parsableByteArray, sb);
            if (!";".equals(nextToken)) {
                if (!RULE_END.equals(nextToken)) {
                    return;
                } else {
                    parsableByteArray.setPosition(position);
                }
            }
            if ("color".equals(identifier)) {
                webvttCssStyle.setFontColor(androidx.media3.common.util.ColorParser.parseCssColor(propertyValue));
                return;
            }
            if (PROPERTY_BGCOLOR.equals(identifier)) {
                webvttCssStyle.setBackgroundColor(androidx.media3.common.util.ColorParser.parseCssColor(propertyValue));
                return;
            }
            boolean z6 = true;
            if (PROPERTY_RUBY_POSITION.equals(identifier)) {
                if (VALUE_OVER.equals(propertyValue)) {
                    webvttCssStyle.setRubyPosition(1);
                    return;
                } else {
                    if (VALUE_UNDER.equals(propertyValue)) {
                        webvttCssStyle.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if (PROPERTY_TEXT_COMBINE_UPRIGHT.equals(identifier)) {
                if (!"all".equals(propertyValue) && !propertyValue.startsWith(VALUE_DIGITS)) {
                    z6 = false;
                }
                webvttCssStyle.setCombineUpright(z6);
                return;
            }
            if (PROPERTY_TEXT_DECORATION.equals(identifier)) {
                if ("underline".equals(propertyValue)) {
                    webvttCssStyle.setUnderline(true);
                    return;
                }
                return;
            }
            if (PROPERTY_FONT_FAMILY.equals(identifier)) {
                webvttCssStyle.setFontFamily(propertyValue);
                return;
            }
            if (PROPERTY_FONT_WEIGHT.equals(identifier)) {
                if ("bold".equals(propertyValue)) {
                    webvttCssStyle.setBold(true);
                }
            } else if (PROPERTY_FONT_STYLE.equals(identifier)) {
                if ("italic".equals(propertyValue)) {
                    webvttCssStyle.setItalic(true);
                }
            } else if (PROPERTY_FONT_SIZE.equals(identifier)) {
                parseFontSize(propertyValue, webvttCssStyle);
            }
        }
    }

    private static char peekCharAtPosition(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        return (char) parsableByteArray.getData()[i3];
    }

    private static java.lang.String readCueTarget(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z6 = false;
        while (position < iLimit && !z6) {
            int i3 = position + 1;
            z6 = ((char) parsableByteArray.getData()[position]) == ')';
            position = i3;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    public static void skipStyleBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    public static void skipWhitespaceAndComments(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z6 = true; parsableByteArray.bytesLeft() > 0 && z6; z6 = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    public java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> parseBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String selector = parseSelector(this.styleInput, this.stringBuilder);
            if (selector == null || !RULE_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                break;
            }
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = new androidx.media3.extractor.text.webvtt.WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, selector);
            java.lang.String str = null;
            boolean z6 = false;
            while (!z6) {
                int position2 = this.styleInput.getPosition();
                java.lang.String nextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z9 = nextToken == null || RULE_END.equals(nextToken);
                if (!z9) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = nextToken;
                z6 = z9;
            }
            if (RULE_END.equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
        return arrayList;
    }
}
