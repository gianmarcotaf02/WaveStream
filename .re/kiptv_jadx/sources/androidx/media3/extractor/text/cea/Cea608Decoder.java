package androidx.media3.extractor.text.cea;

/* JADX INFO: loaded from: classes.dex */
public final class Cea608Decoder extends androidx.media3.extractor.text.cea.CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final java.lang.String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private java.util.List<androidx.media3.common.text.Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    private java.util.List<androidx.media3.common.text.Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, androidx.media3.extractor.ts.PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, 205, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final androidx.media3.common.util.ParsableByteArray ccData = new androidx.media3.common.util.ParsableByteArray();
    private final java.util.ArrayList<androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder> cueBuilders = new java.util.ArrayList<>();
    private androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder currentCueBuilder = new androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder(0, 4);
    private int currentChannel = 0;

    public static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final java.util.List<androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle> cueStyles = new java.util.ArrayList();
        private final java.util.List<android.text.SpannableString> rolledUpCaptions = new java.util.ArrayList();
        private final java.lang.StringBuilder captionStringBuilder = new java.lang.StringBuilder();

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i3, boolean z6, int i9) {
                this.style = i3;
                this.underline = z6;
                this.start = i9;
            }
        }

        public CueBuilder(int i3, int i9) {
            reset(i3);
            this.captionRowCount = i9;
        }

        private android.text.SpannableString buildCurrentLine() {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i3 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            boolean z6 = false;
            while (i12 < this.cueStyles.size()) {
                androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle cueStyle = this.cueStyles.get(i12);
                boolean z9 = cueStyle.underline;
                int i14 = cueStyle.style;
                if (i14 != 8) {
                    boolean z10 = i14 == 7;
                    if (i14 != 7) {
                        i11 = androidx.media3.extractor.text.cea.Cea608Decoder.STYLE_COLORS[i14];
                    }
                    z6 = z10;
                }
                int i15 = cueStyle.start;
                i12++;
                if (i15 != (i12 < this.cueStyles.size() ? this.cueStyles.get(i12).start : length)) {
                    if (i3 != -1 && !z9) {
                        setUnderlineSpan(spannableStringBuilder, i3, i15);
                        i3 = -1;
                    } else if (i3 == -1 && z9) {
                        i3 = i15;
                    }
                    if (i9 != -1 && !z6) {
                        setItalicSpan(spannableStringBuilder, i9, i15);
                        i9 = -1;
                    } else if (i9 == -1 && z6) {
                        i9 = i15;
                    }
                    if (i11 != i10) {
                        setColorSpan(spannableStringBuilder, i13, i15, i10);
                        i10 = i11;
                        i13 = i15;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                setUnderlineSpan(spannableStringBuilder, i3, length);
            }
            if (i9 != -1 && i9 != length) {
                setItalicSpan(spannableStringBuilder, i9, length);
            }
            if (i13 != length) {
                setColorSpan(spannableStringBuilder, i13, length, i10);
            }
            return new android.text.SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(android.text.SpannableStringBuilder spannableStringBuilder, int i3, int i9, int i10) {
            if (i10 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i10), i3, i9, 33);
        }

        private static void setItalicSpan(android.text.SpannableStringBuilder spannableStringBuilder, int i3, int i9) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i9, 33);
        }

        private static void setUnderlineSpan(android.text.SpannableStringBuilder spannableStringBuilder, int i3, int i9) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i9, 33);
        }

        public void append(char c9) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c9);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle cueStyle = this.cueStyles.get(size);
                    int i3 = cueStyle.start;
                    if (i3 != length) {
                        return;
                    }
                    cueStyle.start = i3 - 1;
                }
            }
        }

        public androidx.media3.common.text.Cue build(int i3) {
            float f9;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            for (int i9 = 0; i9 < this.rolledUpCaptions.size(); i9++) {
                spannableStringBuilder.append((java.lang.CharSequence) this.rolledUpCaptions.get(i9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((java.lang.CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i10 = this.indent + this.tabOffset;
            int length = (32 - i10) - spannableStringBuilder.length();
            int i11 = i10 - length;
            if (i3 == Integer.MIN_VALUE) {
                i3 = (this.captionMode != 2 || (java.lang.Math.abs(i11) >= 3 && length >= 0)) ? (this.captionMode != 2 || i11 <= 0) ? 0 : 2 : 1;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    i10 = 32 - length;
                }
                f9 = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f9 = 0.5f;
            }
            int i12 = this.row;
            if (i12 > 7) {
                i12 -= 17;
            } else if (this.captionMode == 1) {
                i12 -= this.captionRowCount - 1;
            }
            return new androidx.media3.common.text.Cue.Builder().setText(spannableStringBuilder).setTextAlignment(android.text.Layout.Alignment.ALIGN_NORMAL).setLine(i12, 1).setPosition(f9).setPositionAnchor(i3).build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i3) {
            this.captionMode = i3;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = java.lang.Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i3) {
            this.captionMode = i3;
        }

        public void setCaptionRowCount(int i3) {
            this.captionRowCount = i3;
        }

        public void setStyle(int i3, boolean z6) {
            this.cueStyles.add(new androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder.CueStyle(i3, z6, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(java.lang.String str, int i3, long j) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= MIN_DATA_CHANNEL_TIMEOUT_MS);
            this.validDataChannelTimeoutUs = j * 1000;
        } else {
            this.validDataChannelTimeoutUs = androidx.media3.common.C.TIME_UNSET;
        }
        this.packetLength = androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i3 == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i3 == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i3 == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i3 != 4) {
            androidx.media3.common.util.Log.w(TAG, "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = androidx.media3.common.C.TIME_UNSET;
    }

    private static char getBasicChar(byte b9) {
        return (char) BASIC_CHARACTER_SET[(b9 & 127) - 32];
    }

    private static int getChannel(byte b9) {
        return (b9 >> 3) & 1;
    }

    private java.util.List<androidx.media3.common.text.Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        int iMin = 2;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.media3.common.text.Cue cueBuild = this.cueBuilders.get(i3).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = java.lang.Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            androidx.media3.common.text.Cue cueBuild2 = (androidx.media3.common.text.Cue) arrayList.get(i9);
            if (cueBuild2 != null) {
                if (cueBuild2.positionAnchor != iMin) {
                    cueBuild2 = this.cueBuilders.get(i9).build(iMin);
                    cueBuild2.getClass();
                }
                arrayList2.add(cueBuild2);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b9) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b9 & 31];
    }

    private static char getExtendedPtDeChar(byte b9) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b9 & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b9, byte b10) {
        return (b9 & 1) == 0 ? getExtendedEsFrChar(b10) : getExtendedPtDeChar(b10);
    }

    private static char getSpecialNorthAmericanChar(byte b9) {
        return (char) SPECIAL_CHARACTER_SET[b9 & 15];
    }

    private void handleMidrowCtrl(byte b9) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b9 >> 1) & 7, (b9 & 1) == 1);
    }

    private void handleMiscCode(byte b9) {
        if (b9 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b9 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b9) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i3 = this.captionMode;
                if (i3 != 0) {
                    if (b9 != 33) {
                        switch (b9) {
                            case 44:
                                this.cues = java.util.Collections.EMPTY_LIST;
                                if (i3 == 1 || i3 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
                                if (i3 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.currentCueBuilder.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b9, byte b10) {
        int i3 = ROW_INDICES[b9 & 7];
        if ((b10 & CTRL_RESUME_CAPTION_LOADING) != 0) {
            i3++;
        }
        if (i3 != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder cueBuilder = new androidx.media3.extractor.text.cea.Cea608Decoder.CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i3;
        }
        boolean z6 = (b10 & 16) == 16;
        boolean z9 = (b10 & 1) == 1;
        int i9 = (b10 >> 1) & 7;
        this.currentCueBuilder.setStyle(z6 ? 8 : i9, z9);
        if (z6) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i9];
        }
    }

    private static boolean isCtrlCode(byte b9) {
        return (b9 & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b9, byte b10) {
        return (b9 & 246) == 18 && (b10 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 32;
    }

    private static boolean isMiscCode(byte b9, byte b10) {
        return (b9 & 246) == 20 && (b10 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b9, byte b10) {
        return (b9 & 240) == 16 && (b10 & 192) == 64;
    }

    private static boolean isRepeatable(byte b9) {
        return (b9 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z6, byte b9, byte b10) {
        if (!z6 || !isRepeatable(b9)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b9 && this.repeatableControlCc2 == b10) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b9;
            this.repeatableControlCc2 = b10;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b9) {
        return (b9 & 246) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b9, byte b10) {
        return (b9 & 247) == 23 && b10 >= 33 && b10 <= 35;
    }

    private static boolean isXdsControlCode(byte b9) {
        return 1 <= b9 && b9 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b9, byte b10) {
        if (isXdsControlCode(b9)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b9)) {
            if (b10 != 32 && b10 != 47) {
                switch (b10) {
                    case 37:
                    case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                    case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                        break;
                    default:
                        switch (b10) {
                            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i3) {
        int i9 = this.captionMode;
        if (i9 == i3) {
            return;
        }
        this.captionMode = i3;
        if (i3 == 3) {
            for (int i10 = 0; i10 < this.cueBuilders.size(); i10++) {
                this.cueBuilders.get(i10).setCaptionMode(i3);
            }
            return;
        }
        resetCueBuilders();
        if (i9 == 3 || i3 == 1 || i3 == 0) {
            this.cues = java.util.Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i3) {
        this.captionRowCount = i3;
        this.currentCueBuilder.setCaptionRowCount(i3);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == androidx.media3.common.C.TIME_UNSET || this.lastCueUpdateUs == androidx.media3.common.C.TIME_UNSET || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b9) {
        if (isCtrlCode(b9)) {
            this.currentChannel = getChannel(b9);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public androidx.media3.extractor.text.Subtitle createSubtitle() {
        java.util.List<androidx.media3.common.text.Cue> list = this.cues;
        this.lastCues = list;
        list.getClass();
        return new androidx.media3.extractor.text.cea.CeaSubtitle(list);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public void decode(androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBuffer) {
        boolean z6;
        java.nio.ByteBuffer byteBuffer = subtitleInputBuffer.data;
        byteBuffer.getClass();
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z9 = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i3 = this.packetLength;
            if (iBytesLeft < i3) {
                break;
            }
            int unsignedByte = i3 == 2 ? -4 : this.ccData.readUnsignedByte();
            int unsignedByte2 = this.ccData.readUnsignedByte();
            int unsignedByte3 = this.ccData.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.selectedField) {
                byte b9 = (byte) (unsignedByte2 & 127);
                byte b10 = (byte) (unsignedByte3 & 127);
                if (b9 != 0 || b10 != 0) {
                    boolean z10 = this.isCaptionValid;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[unsignedByte2] && zArr[unsignedByte3]) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    this.isCaptionValid = z6;
                    if (!isRepeatedCommand(z6, b9, b10)) {
                        if (this.isCaptionValid) {
                            maybeUpdateIsInCaptionService(b9, b10);
                            if (this.isInCaptionService && updateAndVerifyCurrentChannel(b9)) {
                                if (!isCtrlCode(b9)) {
                                    this.currentCueBuilder.append(getBasicChar(b9));
                                    if ((b10 & 224) != 0) {
                                        this.currentCueBuilder.append(getBasicChar(b10));
                                    }
                                } else if (isSpecialNorthAmericanChar(b9, b10)) {
                                    this.currentCueBuilder.append(getSpecialNorthAmericanChar(b10));
                                } else if (isExtendedWestEuropeanChar(b9, b10)) {
                                    this.currentCueBuilder.backspace();
                                    this.currentCueBuilder.append(getExtendedWestEuropeanChar(b9, b10));
                                } else if (isMidrowCtrlCode(b9, b10)) {
                                    handleMidrowCtrl(b10);
                                } else if (isPreambleAddressCode(b9, b10)) {
                                    handlePreambleAddressCode(b9, b10);
                                } else if (isTabCtrlCode(b9, b10)) {
                                    this.currentCueBuilder.tabOffset = b10 - 32;
                                } else if (isMiscCode(b9, b10)) {
                                    handleMiscCode(b10);
                                }
                                z9 = true;
                            }
                        } else if (z10) {
                            resetCueBuilders();
                            z9 = true;
                        }
                    }
                }
            }
        }
        if (z9) {
            int i9 = this.captionMode;
            if (i9 == 1 || i9 == 3) {
                this.cues = getDisplayCues();
                this.lastCueUpdateUs = getPositionUs();
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ androidx.media3.extractor.text.SubtitleInputBuffer dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(androidx.media3.extractor.text.SubtitleInputBuffer subtitleInputBuffer) {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void release() {
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public androidx.media3.extractor.text.SubtitleOutputBuffer dequeueOutputBuffer() {
        androidx.media3.extractor.text.SubtitleOutputBuffer availableOutputBuffer;
        androidx.media3.extractor.text.SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = java.util.Collections.EMPTY_LIST;
        this.lastCueUpdateUs = androidx.media3.common.C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }
}
