package androidx.media3.session;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p076i4.AbstractC2186b0;

public final class CommandButton {
    private static final String CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY = "androidx.media3.session.CUSTOM_COMMAND_PARAMETER";
    private static final String CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX = "androidx.media3.session.PLAYER_COMMAND_";
    private static final String CUSTOM_COMMAND_SESSION_COMMAND_PREFIX = "androidx.media3.session.SESSION_COMMAND_";
    public static final int ICON_ALBUM = 57369;
    public static final int ICON_ARTIST = 57370;
    public static final int ICON_BLOCK = 57675;
    public static final int ICON_BOOKMARK_FILLED = 1042534;
    public static final int ICON_BOOKMARK_UNFILLED = 59494;
    public static final int ICON_CHECK_CIRCLE_FILLED = 1042540;
    public static final int ICON_CHECK_CIRCLE_UNFILLED = 59500;
    public static final int ICON_CLOSED_CAPTIONS = 57372;
    public static final int ICON_CLOSED_CAPTIONS_OFF = 61916;
    public static final int ICON_FAST_FORWARD = 57375;
    public static final int ICON_FEED = 57573;
    public static final int ICON_FLAG_FILLED = 1040723;
    public static final int ICON_FLAG_UNFILLED = 57683;
    public static final int ICON_HEART_FILLED = 1042557;
    public static final int ICON_HEART_UNFILLED = 59517;
    public static final int ICON_MINUS = 57691;
    public static final int ICON_MINUS_CIRCLE_FILLED = 1040712;
    public static final int ICON_MINUS_CIRCLE_UNFILLED = 1040713;
    public static final int ICON_NEXT = 57412;
    public static final int ICON_PAUSE = 57396;
    public static final int ICON_PLAY = 57399;
    public static final int ICON_PLAYBACK_SPEED = 57448;
    public static final int ICON_PLAYBACK_SPEED_0_5 = 62690;
    public static final int ICON_PLAYBACK_SPEED_0_8 = 1045730;
    public static final int ICON_PLAYBACK_SPEED_1_0 = 61389;
    public static final int ICON_PLAYBACK_SPEED_1_2 = 62689;
    public static final int ICON_PLAYBACK_SPEED_1_5 = 62688;
    public static final int ICON_PLAYBACK_SPEED_1_8 = 1045728;
    public static final int ICON_PLAYBACK_SPEED_2_0 = 62699;
    public static final int ICON_PLAYLIST_ADD = 57403;
    public static final int ICON_PLAYLIST_REMOVE = 60288;
    public static final int ICON_PLUS = 57669;
    public static final int ICON_PLUS_CIRCLE_FILLED = 1040711;
    public static final int ICON_PLUS_CIRCLE_UNFILLED = 57671;
    public static final int ICON_PREVIOUS = 57413;
    public static final int ICON_QUALITY = 58409;
    public static final int ICON_QUEUE_ADD = 57436;
    public static final int ICON_QUEUE_NEXT = 57446;
    public static final int ICON_QUEUE_REMOVE = 57447;
    public static final int ICON_RADIO = 58654;
    public static final int ICON_REPEAT_ALL = 57408;
    public static final int ICON_REPEAT_OFF = 1040448;
    public static final int ICON_REPEAT_ONE = 57409;
    public static final int ICON_REWIND = 57376;
    public static final int ICON_SETTINGS = 59576;
    public static final int ICON_SHARE = 59405;
    public static final int ICON_SHUFFLE_OFF = 1040452;
    public static final int ICON_SHUFFLE_ON = 57411;
    public static final int ICON_SHUFFLE_STAR = 1040451;
    public static final int ICON_SIGNAL = 61512;
    public static final int ICON_SKIP_BACK = 57410;
    public static final int ICON_SKIP_BACK_10 = 57433;
    public static final int ICON_SKIP_BACK_15 = 1040473;
    public static final int ICON_SKIP_BACK_30 = 57434;
    public static final int ICON_SKIP_BACK_5 = 57435;
    public static final int ICON_SKIP_FORWARD = 63220;
    public static final int ICON_SKIP_FORWARD_10 = 57430;
    public static final int ICON_SKIP_FORWARD_15 = 1040470;
    public static final int ICON_SKIP_FORWARD_30 = 57431;
    public static final int ICON_SKIP_FORWARD_5 = 57432;
    public static final int ICON_STAR_FILLED = 1042488;
    public static final int ICON_STAR_UNFILLED = 59448;
    public static final int ICON_STOP = 57415;
    public static final int ICON_SUBTITLES = 57416;
    public static final int ICON_SUBTITLES_OFF = 61298;
    public static final int ICON_SYNC = 58919;
    public static final int ICON_THUMB_DOWN_FILLED = 1042651;
    public static final int ICON_THUMB_DOWN_UNFILLED = 59611;
    public static final int ICON_THUMB_UP_FILLED = 1042652;
    public static final int ICON_THUMB_UP_UNFILLED = 59612;
    public static final int ICON_UNDEFINED = 0;
    public static final int ICON_VOLUME_DOWN = 57421;
    public static final int ICON_VOLUME_OFF = 57423;
    public static final int ICON_VOLUME_UP = 57424;
    private static final String INCORRECT_PARAMETER_TYPE_MESSAGE = "Parameter has incorrect type.";
    private static final int PARAMETER_TYPE_BOOLEAN = 3;
    private static final int PARAMETER_TYPE_FLOAT = 4;
    private static final int PARAMETER_TYPE_INT = 2;
    private static final int PARAMETER_TYPE_LONG = 1;
    private static final int PARAMETER_TYPE_MEDIA_ITEM = 6;
    private static final int PARAMETER_TYPE_MEDIA_METADATA = 7;
    private static final int PARAMETER_TYPE_NULL = 0;
    private static final int PARAMETER_TYPE_RATING = 5;
    private static final int PARAMETER_TYPE_TRACK_SELECTION_PARAMETERS = 8;
    public static final int SLOT_BACK = 2;
    public static final int SLOT_BACK_SECONDARY = 4;
    public static final int SLOT_CENTRAL = 1;
    public static final int SLOT_FORWARD = 3;
    public static final int SLOT_FORWARD_SECONDARY = 5;
    public static final int SLOT_OVERFLOW = 6;
    public final CharSequence displayName;
    public final Bundle extras;
    public final int icon;
    public final int iconResId;
    public final Uri iconUri;
    public final boolean isEnabled;
    public final Object parameter;
    public final int playerCommand;
    public final SessionCommand sessionCommand;
    public final p107m4.a slots;
    private static final String FIELD_SESSION_COMMAND = Util.intToStringMaxRadix(0);
    private static final String FIELD_PLAYER_COMMAND = Util.intToStringMaxRadix(1);
    private static final String FIELD_ICON_RES_ID = Util.intToStringMaxRadix(2);
    private static final String FIELD_DISPLAY_NAME = Util.intToStringMaxRadix(3);
    private static final String FIELD_EXTRAS = Util.intToStringMaxRadix(4);
    private static final String FIELD_ENABLED = Util.intToStringMaxRadix(5);
    private static final String FIELD_ICON_URI = Util.intToStringMaxRadix(6);
    private static final String FIELD_ICON = Util.intToStringMaxRadix(7);
    private static final String FIELD_SLOTS = Util.intToStringMaxRadix(8);
    private static final String FIELD_PARAMETER = Util.intToStringMaxRadix(9);

    public static final class Builder {
        private CharSequence displayName;
        private boolean enabled;
        private Bundle extras;
        private final int icon;
        private int iconResId;
        private Uri iconUri;
        private Object parameter;
        private int playerCommand;
        private SessionCommand sessionCommand;
        private p107m4.a slots;

        @Deprecated
        public Builder() {
            this(0);
        }

        public CommandButton build() {
            AbstractC1864o0.Z((this.sessionCommand == null) != (this.playerCommand == -1), "Exactly one of sessionCommand and playerCommand should be set");
            if (this.slots == null) {
                this.slots = new p107m4.a(new int[]{CommandButton.getDefaultSlot(this.playerCommand, this.icon)});
            }
            return new CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, this.extras, this.enabled, this.slots, this.parameter);
        }

        public Builder setCustomIconResId(int i3) {
            this.iconResId = i3;
            return this;
        }

        public Builder setDisplayName(CharSequence charSequence) {
            this.displayName = charSequence;
            return this;
        }

        public Builder setEnabled(boolean z6) {
            this.enabled = z6;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.extras = new Bundle(bundle);
            return this;
        }

        @Deprecated
        public Builder setIconResId(int i3) {
            return setCustomIconResId(i3);
        }

        public Builder setIconUri(Uri uri) {
            AbstractC1864o0.M(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            this.iconUri = uri;
            return this;
        }

        public Builder setPlayerCommand(int i3) {
            AbstractC1864o0.M(this.sessionCommand == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.playerCommand = i3;
            this.parameter = null;
            return this;
        }

        public Builder setSessionCommand(SessionCommand sessionCommand) {
            AbstractC1864o0.U(sessionCommand, "sessionCommand should not be null.");
            AbstractC1864o0.M(this.playerCommand == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.sessionCommand = sessionCommand;
            this.parameter = null;
            return this;
        }

        public Builder setSlots(int... iArr) {
            AbstractC1864o0.L(iArr.length != 0);
            p107m4.a aVar = p107m4.a.j;
            this.slots = iArr.length == 0 ? p107m4.a.j : new p107m4.a(Arrays.copyOf(iArr, iArr.length));
            return this;
        }

        public Builder(int i3) {
            this(i3, CommandButton.getIconResIdForIconConstant(i3));
        }

        public Builder(int i3, int i9) {
            this.icon = i3;
            this.iconResId = i9;
            this.displayName = "";
            this.extras = Bundle.EMPTY;
            this.playerCommand = -1;
            this.enabled = true;
        }

        public Builder setPlayerCommand(int i3, Object obj) {
            AbstractC1864o0.M(this.sessionCommand == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.playerCommand = i3;
            this.parameter = CommandButton.verifyParameterType(obj, CommandButton.getParameterTypeForPlayerCommand(i3));
            return this;
        }

        public Builder setSessionCommand(SessionCommand sessionCommand, Object obj) {
            AbstractC1864o0.U(sessionCommand, "sessionCommand should not be null.");
            AbstractC1864o0.M(this.playerCommand == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.sessionCommand = sessionCommand;
            this.parameter = CommandButton.verifyParameterType(obj, CommandButton.getParameterTypeForSessionCommand(sessionCommand.commandCode));
            return this;
        }
    }

    public static final class DisplayConstraints {
        private final SparseArray<Player.Commands> allowedPlayerCommandsPerSlot;
        private final SparseArray<SessionCommands> allowedSessionCommandsPerSlot;
        private final SparseBooleanArray areCustomCommandsAllowedPerSlot;
        private final SparseIntArray maxButtonsPerSlot;

        public static final class Builder {
            private final SparseArray<Player.Commands> allowedPlayerCommandsPerSlot;
            private final SparseArray<SessionCommands> allowedSessionCommandsPerSlot;
            private final SparseBooleanArray areCustomCommandsAllowedPerSlot;
            private boolean buildCalled;
            private final SparseIntArray maxButtonsPerSlot;

            public Builder() {
                SparseIntArray sparseIntArray = new SparseIntArray();
                this.maxButtonsPerSlot = sparseIntArray;
                sparseIntArray.put(1, 1);
                sparseIntArray.put(2, 1);
                sparseIntArray.put(3, 1);
                sparseIntArray.put(6, Log.LOG_LEVEL_OFF);
                this.allowedPlayerCommandsPerSlot = new SparseArray<>();
                this.allowedSessionCommandsPerSlot = new SparseArray<>();
                this.areCustomCommandsAllowedPerSlot = new SparseBooleanArray();
            }

            public DisplayConstraints build() {
                AbstractC1864o0.Y(!this.buildCalled);
                this.buildCalled = true;
                return new DisplayConstraints(this);
            }

            public Builder setAllowCustomCommandsForSlot(int i3, boolean z6) {
                this.areCustomCommandsAllowedPerSlot.put(i3, z6);
                return this;
            }

            public Builder setAllowedPlayerCommandsForSlot(int i3, Player.Commands commands) {
                this.allowedPlayerCommandsPerSlot.put(i3, commands);
                return this;
            }

            public Builder setAllowedSessionCommandsForSlot(int i3, SessionCommands sessionCommands) {
                this.allowedSessionCommandsPerSlot.put(i3, sessionCommands);
                return this;
            }

            public Builder setMaxButtonsForSlot(int i3, int i9) {
                AbstractC1864o0.L(i9 >= 0);
                this.maxButtonsPerSlot.put(i3, i9);
                return this;
            }
        }

        private static CommandButton createButton(int i3, int i9, Player.Commands commands) {
            return new Builder(i3).setPlayerCommand(i9).setEnabled(commands.contains(i9)).build();
        }

        private static CommandButton createOppositeButton(CommandButton commandButton, int i3, Player player) {
            Player.Commands availableCommands = player.getAvailableCommands();
            int oppositePlayerCommand = getOppositePlayerCommand(commandButton, i3, availableCommands);
            int oppositeIcon = getOppositeIcon(commandButton);
            if (oppositeIcon == 0) {
                oppositeIcon = getIconForPlayerCommand(oppositePlayerCommand, player);
            }
            return createButton(oppositeIcon, oppositePlayerCommand, availableCommands);
        }

        private static int getFirstAvailableOrFirstCommand(Player.Commands commands, int... iArr) {
            for (int i3 : iArr) {
                if (commands.contains(i3)) {
                    return i3;
                }
            }
            return iArr[0];
        }

        private static int getIconForPlayerCommand(int i3, Player player) {
            switch (i3) {
                case 6:
                case 7:
                    return CommandButton.ICON_PREVIOUS;
                case 8:
                case 9:
                    return CommandButton.ICON_NEXT;
                case 10:
                default:
                    throw new UnsupportedOperationException();
                case 11:
                    long seekBackIncrement = player.getSeekBackIncrement();
                    if (seekBackIncrement >= 2500 && seekBackIncrement < 7500) {
                        return CommandButton.ICON_SKIP_BACK_5;
                    }
                    if (seekBackIncrement >= 7500 && seekBackIncrement < 12500) {
                        return CommandButton.ICON_SKIP_BACK_10;
                    }
                    if (seekBackIncrement < 12500 || seekBackIncrement >= 20000) {
                        return (seekBackIncrement < 20000 || seekBackIncrement >= 40000) ? CommandButton.ICON_SKIP_BACK : CommandButton.ICON_SKIP_BACK_30;
                    }
                    return CommandButton.ICON_SKIP_BACK_15;
                case 12:
                    long seekForwardIncrement = player.getSeekForwardIncrement();
                    if (seekForwardIncrement >= 2500 && seekForwardIncrement < 7500) {
                        return CommandButton.ICON_SKIP_FORWARD_5;
                    }
                    if (seekForwardIncrement >= 7500 && seekForwardIncrement < 12500) {
                        return CommandButton.ICON_SKIP_FORWARD_10;
                    }
                    if (seekForwardIncrement < 12500 || seekForwardIncrement >= 20000) {
                        return (seekForwardIncrement < 20000 || seekForwardIncrement >= 40000) ? CommandButton.ICON_SKIP_FORWARD : CommandButton.ICON_SKIP_FORWARD_30;
                    }
                    return CommandButton.ICON_SKIP_FORWARD_15;
            }
        }

        private static int getOppositeIcon(CommandButton commandButton) {
            if (commandButton == null) {
                return 0;
            }
            switch (commandButton.icon) {
                case CommandButton.ICON_FAST_FORWARD:
                    return CommandButton.ICON_REWIND;
                case CommandButton.ICON_REWIND:
                    return CommandButton.ICON_FAST_FORWARD;
                case CommandButton.ICON_SKIP_BACK:
                    return CommandButton.ICON_SKIP_FORWARD;
                case CommandButton.ICON_NEXT:
                    return CommandButton.ICON_PREVIOUS;
                case CommandButton.ICON_PREVIOUS:
                    return CommandButton.ICON_NEXT;
                case CommandButton.ICON_SKIP_FORWARD:
                    return CommandButton.ICON_SKIP_BACK;
                default:
                    return 0;
            }
        }

        private static int getOppositePlayerCommand(CommandButton commandButton, int i3, Player.Commands commands) {
            if (commandButton != null) {
                switch (commandButton.playerCommand) {
                    case 6:
                        return 8;
                    case 7:
                        return 9;
                    case 8:
                        return 6;
                    case 9:
                        return 7;
                    case 11:
                        return 12;
                    case 12:
                        return 11;
                }
            }
            return i3 == 2 ? getFirstAvailableOrFirstCommand(commands, 7, 6, 11) : getFirstAvailableOrFirstCommand(commands, 9, 8, 12);
        }

        private boolean reserveSlotForButton(CommandButton commandButton, int i3, SparseIntArray sparseIntArray) {
            boolean z6 = false;
            if (sparseIntArray.get(i3) == 0) {
                return false;
            }
            if (commandButton.playerCommand != -1) {
                Player.Commands commands = this.allowedPlayerCommandsPerSlot.get(i3);
                if (commands == null || commands.contains(commandButton.playerCommand)) {
                    z6 = true;
                }
            } else {
                SessionCommand sessionCommand = commandButton.sessionCommand;
                sessionCommand.getClass();
                if (sessionCommand.commandCode == 0) {
                    z6 = this.areCustomCommandsAllowedPerSlot.get(i3, true);
                } else {
                    SessionCommands sessionCommands = this.allowedSessionCommandsPerSlot.get(i3);
                    if (sessionCommands == null || sessionCommands.contains(commandButton.sessionCommand)) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                sparseIntArray.put(i3, sparseIntArray.get(i3) - 1);
            }
            return z6;
        }

        public AbstractC2186b0 resolve(List<CommandButton> list, Player player) {
            SparseIntArray sparseIntArrayClone = this.maxButtonsPerSlot.clone();
            p076i4.Y yS = AbstractC2186b0.s();
            CommandButton commandButton = null;
            CommandButton commandButton2 = null;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                CommandButton commandButton3 = list.get(i3);
                int i9 = 0;
                while (true) {
                    p107m4.a aVar = commandButton3.slots;
                    if (i9 >= aVar.f25392i) {
                        break;
                    }
                    int iB = aVar.b(i9);
                    if (reserveSlotForButton(commandButton3, iB, sparseIntArrayClone)) {
                        yS.c(commandButton3.copyWithSlots(new p107m4.a(new int[]{iB})));
                        if (commandButton != null || iB != 3) {
                            if (commandButton2 != null || iB != 2) {
                                break;
                            }
                            commandButton2 = commandButton3;
                            break;
                        }
                        commandButton = commandButton3;
                        break;
                    }
                    i9++;
                }
                i3++;
            }
            Player.Commands availableCommands = player.getAvailableCommands();
            if (this.maxButtonsPerSlot.get(1) == sparseIntArrayClone.get(1)) {
                CommandButton commandButtonCreateButton = createButton(Util.shouldShowPlayButton(player) ? CommandButton.ICON_PLAY : CommandButton.ICON_PAUSE, 1, availableCommands);
                if (reserveSlotForButton(commandButtonCreateButton, 1, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateButton);
                }
            }
            boolean z6 = commandButton2 == null && this.maxButtonsPerSlot.get(2) > 0;
            boolean z9 = commandButton == null && this.maxButtonsPerSlot.get(3) > 0;
            if (z6 && z9) {
                int firstAvailableOrFirstCommand = getFirstAvailableOrFirstCommand(availableCommands, 7, 9, 6, 8, 11, 12);
                CommandButton commandButtonCreateButton2 = createButton(getIconForPlayerCommand(firstAvailableOrFirstCommand, player), firstAvailableOrFirstCommand, availableCommands);
                int iB2 = commandButtonCreateButton2.slots.b(0);
                if (reserveSlotForButton(commandButtonCreateButton2, iB2, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateButton2);
                }
                int i10 = iB2 != 2 ? 2 : 3;
                CommandButton commandButtonCreateOppositeButton = createOppositeButton(commandButtonCreateButton2, i10, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton, i10, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton);
                }
            } else if (z6) {
                CommandButton commandButtonCreateOppositeButton2 = createOppositeButton(commandButton, 2, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton2, 2, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton2);
                }
            } else if (z9) {
                CommandButton commandButtonCreateOppositeButton3 = createOppositeButton(commandButton2, 3, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton3, 3, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton3);
                }
            }
            return yS.f();
        }

        private DisplayConstraints(Builder builder) {
            this.maxButtonsPerSlot = builder.maxButtonsPerSlot;
            this.allowedPlayerCommandsPerSlot = builder.allowedPlayerCommandsPerSlot;
            this.allowedSessionCommandsPerSlot = builder.allowedSessionCommandsPerSlot;
            this.areCustomCommandsAllowedPerSlot = builder.areCustomCommandsAllowedPerSlot;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Icon {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Slot {
    }

    public static boolean containsButtonForSlot(List<CommandButton> list, int i3) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (list.get(i9).slots.b(0) == i3) {
                return true;
            }
        }
        return false;
    }

    public static CommandButton convertFromPredefinedCustomCommand(SessionCommand sessionCommand) {
        if (isPredefinedPlayerCustomCommandButtonCode(sessionCommand.customAction)) {
            int predefinedCustomCommandCode = getPredefinedCustomCommandCode(sessionCommand.customAction, CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX);
            return new Builder(0).setPlayerCommand(predefinedCustomCommandCode, getParameterFromBundle(sessionCommand.customExtras, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, getParameterTypeForPlayerCommand(predefinedCustomCommandCode), 9)).build();
        }
        int predefinedCustomCommandCode2 = getPredefinedCustomCommandCode(sessionCommand.customAction, CUSTOM_COMMAND_SESSION_COMMAND_PREFIX);
        return new Builder(0).setSessionCommand(new SessionCommand(predefinedCustomCommandCode2), getParameterFromBundle(sessionCommand.customExtras, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, getParameterTypeForSessionCommand(predefinedCustomCommandCode2), 9)).build();
    }

    private CommandButton convertToPredefinedCustomCommandButton(int i3, int i9) {
        String str;
        SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null && sessionCommand.commandCode == 0) {
            return copyWithSlots(new p107m4.a(new int[]{i3}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.parameter != null) {
            bundle = new Bundle();
            writeParameterToBundle(bundle, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, i9);
        }
        if (this.sessionCommand != null) {
            str = CUSTOM_COMMAND_SESSION_COMMAND_PREFIX + this.sessionCommand.commandCode;
        } else {
            str = CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX + this.playerCommand;
        }
        return new CommandButton(new SessionCommand(str, bundle), -1, this.icon, this.iconResId, this.iconUri, this.displayName, this.extras, this.isEnabled, new p107m4.a(new int[]{i3}), null);
    }

    public static AbstractC2186b0 copyWithUnavailableButtonsDisabled(List<CommandButton> list, SessionCommands sessionCommands, Player.Commands commands) {
        p076i4.Y y = new p076i4.Y(4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            CommandButton commandButton = list.get(i3);
            if (isButtonCommandAvailable(commandButton, sessionCommands, commands)) {
                y.c(commandButton);
            } else {
                y.c(commandButton.copyWithIsEnabled(false));
            }
        }
        return y.f();
    }

    @Deprecated
    public static CommandButton fromBundle(Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    public static AbstractC2186b0 getCustomLayoutFromMediaButtonPreferences(List<CommandButton> list, boolean z6, boolean z9, int i3) {
        int iB;
        if (list.isEmpty()) {
            p076i4.Z z10 = AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            CommandButton commandButton = list.get(i11);
            if (commandButton.isEnabled && commandButton.canExecuteAction()) {
                int i12 = 0;
                while (true) {
                    p107m4.a aVar = commandButton.slots;
                    if (i12 >= aVar.f25392i || (iB = aVar.b(i12)) == 6) {
                        break;
                    }
                    if (z6 && i9 == -1 && iB == 2) {
                        i9 = i11;
                        break;
                    }
                    if (z9 && i10 == -1 && iB == 3) {
                        i10 = i11;
                        break;
                    }
                    i12++;
                }
            }
        }
        p076i4.Y yS = AbstractC2186b0.s();
        if (i9 != -1) {
            yS.c(list.get(i9).convertToPredefinedCustomCommandButton(2, i3));
        }
        if (i10 != -1) {
            yS.c(list.get(i10).convertToPredefinedCustomCommandButton(3, i3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            CommandButton commandButton2 = list.get(i13);
            if (commandButton2.isEnabled && commandButton2.canExecuteAction() && i13 != i9 && i13 != i10 && commandButton2.slots.a(6)) {
                yS.c(commandButton2.convertToPredefinedCustomCommandButton(6, i3));
            }
        }
        return yS.f();
    }

    public static int getDefaultSlot(int i3, int i9) {
        if (i3 == 1 || i9 == 57399 || i9 == 57396) {
            return 1;
        }
        if (i3 == 11 || i3 == 7 || i3 == 6 || i9 == 57413 || i9 == 57376 || i9 == 57410 || i9 == 57435 || i9 == 57433 || i9 == 1040473 || i9 == 57434) {
            return 2;
        }
        return (i3 == 12 || i3 == 9 || i3 == 8 || i9 == 57412 || i9 == 57375 || i9 == 63220 || i9 == 57432 || i9 == 57430 || i9 == 1040470 || i9 == 57431) ? 3 : 6;
    }

    public static int getIconResIdForIconConstant(int i3) {
        switch (i3) {
            case ICON_ALBUM:
                return R.drawable.media3_icon_album;
            case ICON_ARTIST:
                return R.drawable.media3_icon_artist;
            case ICON_CLOSED_CAPTIONS:
                return R.drawable.media3_icon_closed_captions;
            case ICON_FAST_FORWARD:
                return R.drawable.media3_icon_fast_forward;
            case ICON_REWIND:
                return R.drawable.media3_icon_rewind;
            case ICON_PAUSE:
                return R.drawable.media3_icon_pause;
            case ICON_PLAY:
                return R.drawable.media3_icon_play;
            case ICON_PLAYLIST_ADD:
                return R.drawable.media3_icon_playlist_add;
            case ICON_REPEAT_ALL:
                return R.drawable.media3_icon_repeat_all;
            case ICON_REPEAT_ONE:
                return R.drawable.media3_icon_repeat_one;
            case ICON_SKIP_BACK:
                return R.drawable.media3_icon_skip_back;
            case ICON_SHUFFLE_ON:
                return R.drawable.media3_icon_shuffle_on;
            case ICON_NEXT:
                return R.drawable.media3_icon_next;
            case ICON_PREVIOUS:
                return R.drawable.media3_icon_previous;
            case ICON_STOP:
                return R.drawable.media3_icon_stop;
            case ICON_SUBTITLES:
                return R.drawable.media3_icon_subtitles;
            case ICON_VOLUME_DOWN:
                return R.drawable.media3_icon_volume_down;
            case ICON_VOLUME_OFF:
                return R.drawable.media3_icon_volume_off;
            case ICON_VOLUME_UP:
                return R.drawable.media3_icon_volume_up;
            case ICON_SKIP_FORWARD_10:
                return R.drawable.media3_icon_skip_forward_10;
            case ICON_SKIP_FORWARD_30:
                return R.drawable.media3_icon_skip_forward_30;
            case ICON_SKIP_FORWARD_5:
                return R.drawable.media3_icon_skip_forward_5;
            case ICON_SKIP_BACK_10:
                return R.drawable.media3_icon_skip_back_10;
            case ICON_SKIP_BACK_30:
                return R.drawable.media3_icon_skip_back_30;
            case ICON_SKIP_BACK_5:
                return R.drawable.media3_icon_skip_back_5;
            case ICON_QUEUE_ADD:
                return R.drawable.media3_icon_queue_add;
            case ICON_QUEUE_NEXT:
                return R.drawable.media3_icon_queue_next;
            case ICON_QUEUE_REMOVE:
                return R.drawable.media3_icon_queue_remove;
            case ICON_PLAYBACK_SPEED:
                return R.drawable.media3_icon_playback_speed;
            case ICON_FEED:
                return R.drawable.media3_icon_feed;
            case ICON_PLUS:
                return R.drawable.media3_icon_plus;
            case ICON_PLUS_CIRCLE_UNFILLED:
                return R.drawable.media3_icon_plus_circle_unfilled;
            case ICON_BLOCK:
                return R.drawable.media3_icon_block;
            case ICON_FLAG_UNFILLED:
                return R.drawable.media3_icon_flag_unfilled;
            case ICON_MINUS:
                return R.drawable.media3_icon_minus;
            case ICON_QUALITY:
                return R.drawable.media3_icon_quality;
            case ICON_RADIO:
                return R.drawable.media3_icon_radio;
            case ICON_SYNC:
                return R.drawable.media3_icon_sync;
            case ICON_SHARE:
                return R.drawable.media3_icon_share;
            case ICON_STAR_UNFILLED:
                return R.drawable.media3_icon_star_unfilled;
            case ICON_BOOKMARK_UNFILLED:
                return R.drawable.media3_icon_bookmark_unfilled;
            case ICON_CHECK_CIRCLE_UNFILLED:
                return R.drawable.media3_icon_check_circle_unfilled;
            case ICON_HEART_UNFILLED:
                return R.drawable.media3_icon_heart_unfilled;
            case ICON_SETTINGS:
                return R.drawable.media3_icon_settings;
            case ICON_THUMB_DOWN_UNFILLED:
                return R.drawable.media3_icon_thumb_down_unfilled;
            case ICON_THUMB_UP_UNFILLED:
                return R.drawable.media3_icon_thumb_up_unfilled;
            case ICON_PLAYLIST_REMOVE:
                return R.drawable.media3_icon_playlist_remove;
            case ICON_SUBTITLES_OFF:
                return R.drawable.media3_icon_subtitles_off;
            case ICON_PLAYBACK_SPEED_1_0:
                return R.drawable.media3_icon_playback_speed_1_0;
            case ICON_SIGNAL:
                return R.drawable.media3_icon_signal;
            case ICON_CLOSED_CAPTIONS_OFF:
                return R.drawable.media3_icon_closed_captions_off;
            case ICON_PLAYBACK_SPEED_1_5:
                return R.drawable.media3_icon_playback_speed_1_5;
            case ICON_PLAYBACK_SPEED_1_2:
                return R.drawable.media3_icon_playback_speed_1_2;
            case ICON_PLAYBACK_SPEED_0_5:
                return R.drawable.media3_icon_playback_speed_0_5;
            case ICON_PLAYBACK_SPEED_2_0:
                return R.drawable.media3_icon_playback_speed_2_0;
            case ICON_SKIP_FORWARD:
                return R.drawable.media3_icon_skip_forward;
            case ICON_REPEAT_OFF:
                return R.drawable.media3_icon_repeat_off;
            case ICON_SHUFFLE_STAR:
                return R.drawable.media3_icon_shuffle_star;
            case ICON_SHUFFLE_OFF:
                return R.drawable.media3_icon_shuffle_off;
            case ICON_SKIP_FORWARD_15:
                return R.drawable.media3_icon_skip_forward_15;
            case ICON_SKIP_BACK_15:
                return R.drawable.media3_icon_skip_back_15;
            case ICON_PLUS_CIRCLE_FILLED:
                return R.drawable.media3_icon_plus_circle_filled;
            case ICON_MINUS_CIRCLE_FILLED:
                return R.drawable.media3_icon_minus_circle_filled;
            case ICON_MINUS_CIRCLE_UNFILLED:
                return R.drawable.media3_icon_minus_circle_unfilled;
            case ICON_FLAG_FILLED:
                return R.drawable.media3_icon_flag_filled;
            case ICON_STAR_FILLED:
                return R.drawable.media3_icon_star_filled;
            case ICON_BOOKMARK_FILLED:
                return R.drawable.media3_icon_bookmark_filled;
            case ICON_CHECK_CIRCLE_FILLED:
                return R.drawable.media3_icon_check_circle_filled;
            case ICON_HEART_FILLED:
                return R.drawable.media3_icon_heart_filled;
            case ICON_THUMB_DOWN_FILLED:
                return R.drawable.media3_icon_thumb_down_filled;
            case ICON_THUMB_UP_FILLED:
                return R.drawable.media3_icon_thumb_up_filled;
            case ICON_PLAYBACK_SPEED_1_8:
                return R.drawable.media3_icon_playback_speed_1_8;
            case ICON_PLAYBACK_SPEED_0_8:
                return R.drawable.media3_icon_playback_speed_0_8;
            default:
                return 0;
        }
    }

    public static AbstractC2186b0 getMediaButtonPreferencesFromCustomLayout(List<CommandButton> list, Player.Commands commands, Bundle bundle) {
        if (list.isEmpty()) {
            p076i4.Z z6 = AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        boolean zContainsAny = commands.containsAny(7, 6);
        boolean zContainsAny2 = commands.containsAny(9, 8);
        boolean z9 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i3 = (zContainsAny || z9) ? -1 : 0;
        int i9 = (zContainsAny2 || z10) ? -1 : i3 == 0 ? 1 : 0;
        p076i4.Y yS = AbstractC2186b0.s();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CommandButton commandButton = list.get(i10);
            if (i10 == i3) {
                if (i9 == -1) {
                    yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{2, 6})));
                } else {
                    yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{2, 3, 6})));
                }
            } else if (i10 == i9) {
                yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{3, 6})));
            } else {
                yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{6})));
            }
        }
        return yS.f();
    }

    private static Object getParameterFromBundle(Bundle bundle, String str, int i3, int i9) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i3) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return Rating.fromBundle(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return MediaItem.fromBundle(bundle3, i9);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return MediaMetadata.fromBundle(bundle4, i9);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return TrackSelectionParameters.fromBundle(bundle5);
            default:
                return null;
        }
    }

    public static int getParameterTypeForPlayerCommand(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 5) {
            return 1;
        }
        if (i3 == 10) {
            return 2;
        }
        if (i3 == 19) {
            return 7;
        }
        if (i3 == 24) {
            return 4;
        }
        if (i3 == 29) {
            return 8;
        }
        if (i3 == 31) {
            return 6;
        }
        switch (i3) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static int getParameterTypeForSessionCommand(int i3) {
        return i3 == 40010 ? 5 : 0;
    }

    private static int getPredefinedCustomCommandCode(String str, String str2) {
        return Integer.parseInt(str.substring(str2.length()));
    }

    public static boolean isButtonCommandAvailable(CommandButton commandButton, SessionCommands sessionCommands, Player.Commands commands) {
        SessionCommand sessionCommand = commandButton.sessionCommand;
        if (sessionCommand != null && sessionCommands.contains(sessionCommand)) {
            return true;
        }
        int i3 = commandButton.playerCommand;
        return i3 != -1 && commands.contains(i3);
    }

    public static boolean isPredefinedCustomCommandButtonCode(String str) {
        return isPredefinedPlayerCustomCommandButtonCode(str) || isPredefinedSessionCustomCommandButtonCode(str);
    }

    private static boolean isPredefinedPlayerCustomCommandButtonCode(String str) {
        return str.startsWith(CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX);
    }

    private static boolean isPredefinedSessionCustomCommandButtonCode(String str) {
        return str.startsWith(CUSTOM_COMMAND_SESSION_COMMAND_PREFIX);
    }

    public static Object verifyParameterType(Object obj, int i3) {
        if (obj == null) {
            return null;
        }
        switch (i3) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                AbstractC1864o0.M(obj instanceof Long, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 2:
                AbstractC1864o0.M(obj instanceof Integer, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 3:
                AbstractC1864o0.M(obj instanceof Boolean, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                AbstractC1864o0.M(obj instanceof Float, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 5:
                AbstractC1864o0.M(obj instanceof Rating, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 6:
                AbstractC1864o0.M(obj instanceof MediaItem, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 7:
                AbstractC1864o0.M(obj instanceof MediaMetadata, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 8:
                AbstractC1864o0.M(obj instanceof TrackSelectionParameters, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            default:
                return null;
        }
    }

    @RequiresNonNull({"parameter"})
    private void writeParameterToBundle(Bundle bundle, String str, int i3) {
        SessionCommand sessionCommand = this.sessionCommand;
        switch (sessionCommand != null ? getParameterTypeForSessionCommand(sessionCommand.commandCode) : getParameterTypeForPlayerCommand(this.playerCommand)) {
            case 1:
                bundle.putLong(str, ((Long) this.parameter).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) this.parameter).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) this.parameter).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) this.parameter).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((Rating) this.parameter).toBundle());
                break;
            case 6:
                bundle.putBundle(str, ((MediaItem) this.parameter).toBundle(i3));
                break;
            case 7:
                bundle.putBundle(str, ((MediaMetadata) this.parameter).toBundle(i3));
                break;
            case 8:
                bundle.putBundle(str, ((TrackSelectionParameters) this.parameter).toBundle());
                break;
        }
    }

    public boolean canExecuteAction() {
        SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null) {
            int i3 = sessionCommand.commandCode;
            if (i3 != 0) {
                return i3 == 40010 && this.parameter != null;
            }
            return true;
        }
        int i9 = this.playerCommand;
        if (i9 != 19) {
            if (i9 != 24) {
                if (i9 != 29 && i9 != 31) {
                    switch (i9) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return this.parameter != null;
    }

    @CheckReturnValue
    public CommandButton copyWithIsEnabled(boolean z6) {
        return this.isEnabled == z6 ? this : new CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, new Bundle(this.extras), z6, this.slots, this.parameter);
    }

    @CheckReturnValue
    public CommandButton copyWithSlots(p107m4.a aVar) {
        return this.slots.equals(aVar) ? this : new CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, new Bundle(this.extras), this.isEnabled, aVar, this.parameter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommandButton)) {
            return false;
        }
        CommandButton commandButton = (CommandButton) obj;
        return Objects.equals(this.sessionCommand, commandButton.sessionCommand) && this.playerCommand == commandButton.playerCommand && this.icon == commandButton.icon && this.iconResId == commandButton.iconResId && Objects.equals(this.iconUri, commandButton.iconUri) && TextUtils.equals(this.displayName, commandButton.displayName) && this.isEnabled == commandButton.isEnabled && this.slots.equals(commandButton.slots) && Objects.equals(this.parameter, commandButton.parameter);
    }

    public void executeAction(MediaController mediaController) {
        Object obj;
        if (this.isEnabled) {
            SessionCommand sessionCommand = this.sessionCommand;
            if (sessionCommand == null) {
                executePlayerAction(mediaController);
                return;
            }
            int i3 = sessionCommand.commandCode;
            if (i3 == 0) {
                sessionCommand.getClass();
                mediaController.sendCustomCommand(sessionCommand, this.extras);
            } else if (i3 == 40010 && (obj = this.parameter) != null) {
                mediaController.setRating((Rating) obj);
            }
        }
    }

    public void executePlayerAction(Player player) {
        if (this.isEnabled) {
            int i3 = this.playerCommand;
            if (i3 == 19) {
                Object obj = this.parameter;
                if (obj != null) {
                    player.setPlaylistMetadata((MediaMetadata) obj);
                    return;
                }
                return;
            }
            if (i3 == 24) {
                Object obj2 = this.parameter;
                if (obj2 != null) {
                    player.setVolume(((Float) obj2).floatValue());
                    return;
                } else if (player.getVolume() == 0.0f) {
                    player.unmute();
                    return;
                } else {
                    player.mute();
                    return;
                }
            }
            if (i3 == 29) {
                Object obj3 = this.parameter;
                if (obj3 != null) {
                    player.setTrackSelectionParameters((TrackSelectionParameters) obj3);
                    return;
                }
                return;
            }
            if (i3 == 31) {
                Object obj4 = this.parameter;
                if (obj4 != null) {
                    player.setMediaItem((MediaItem) obj4);
                    return;
                }
                return;
            }
            switch (i3) {
                case 1:
                    Object obj5 = this.parameter;
                    if (obj5 == null) {
                        player.setPlayWhenReady(!player.getPlayWhenReady());
                    } else {
                        player.setPlayWhenReady(((Boolean) obj5).booleanValue());
                    }
                    break;
                case 2:
                    player.prepare();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    player.seekToDefaultPosition();
                    break;
                case 5:
                    Object obj6 = this.parameter;
                    if (obj6 != null) {
                        player.seekTo(((Long) obj6).longValue());
                    }
                    break;
                case 6:
                    player.seekToPreviousMediaItem();
                    break;
                case 7:
                    player.seekToPrevious();
                    break;
                case 8:
                    player.seekToNextMediaItem();
                    break;
                case 9:
                    player.seekToNext();
                    break;
                case 10:
                    Object obj7 = this.parameter;
                    if (obj7 != null) {
                        player.seekToDefaultPosition(((Integer) obj7).intValue());
                    }
                    break;
                case 11:
                    player.seekBack();
                    break;
                case 12:
                    player.seekForward();
                    break;
                case 13:
                    Object obj8 = this.parameter;
                    if (obj8 != null) {
                        player.setPlaybackSpeed(((Float) obj8).floatValue());
                    }
                    break;
                case 14:
                    Object obj9 = this.parameter;
                    if (obj9 == null) {
                        player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    } else {
                        player.setShuffleModeEnabled(((Boolean) obj9).booleanValue());
                    }
                    break;
                case 15:
                    Object obj10 = this.parameter;
                    if (obj10 != null) {
                        player.setRepeatMode(((Integer) obj10).intValue());
                    }
                    break;
            }
        }
    }

    public int hashCode() {
        return Objects.hash(this.sessionCommand, Integer.valueOf(this.playerCommand), Integer.valueOf(this.icon), Integer.valueOf(this.iconResId), this.displayName, Boolean.valueOf(this.isEnabled), this.iconUri, this.slots, this.parameter);
    }

    public boolean isPlayRequestPlayerAction(Player player) {
        if (this.playerCommand != 1) {
            return false;
        }
        Object obj = this.parameter;
        if (obj == null) {
            return !player.getPlayWhenReady();
        }
        return ((Boolean) obj).booleanValue();
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(9);
    }

    private CommandButton(SessionCommand sessionCommand, int i3, int i9, int i10, Uri uri, CharSequence charSequence, Bundle bundle, boolean z6, p107m4.a aVar, Object obj) {
        this.sessionCommand = sessionCommand;
        this.playerCommand = i3;
        this.icon = i9;
        this.iconResId = i10;
        this.iconUri = uri;
        this.displayName = charSequence;
        this.extras = new Bundle(bundle);
        this.isEnabled = z6;
        this.slots = aVar;
        this.parameter = obj;
    }

    public static CommandButton fromBundle(Bundle bundle, int i3) {
        Bundle bundle2 = bundle.getBundle(FIELD_SESSION_COMMAND);
        SessionCommand sessionCommandFromBundle = bundle2 == null ? null : SessionCommand.fromBundle(bundle2);
        int i9 = bundle.getInt(FIELD_PLAYER_COMMAND, -1);
        int i10 = bundle.getInt(FIELD_ICON_RES_ID, 0);
        CharSequence charSequence = bundle.getCharSequence(FIELD_DISPLAY_NAME, "");
        Bundle bundleConvertToNullIfInvalid = Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS));
        boolean z6 = i3 < 3 || bundle.getBoolean(FIELD_ENABLED, true);
        Uri uri = (Uri) bundle.getParcelable(FIELD_ICON_URI);
        int i11 = bundle.getInt(FIELD_ICON, 0);
        int[] intArray = bundle.getIntArray(FIELD_SLOTS);
        Builder builder = new Builder(i11, i10);
        if (sessionCommandFromBundle != null) {
            builder.setSessionCommand(sessionCommandFromBundle, getParameterFromBundle(bundle, FIELD_PARAMETER, getParameterTypeForSessionCommand(sessionCommandFromBundle.commandCode), i3));
        }
        if (i9 != -1) {
            builder.setPlayerCommand(i9, getParameterFromBundle(bundle, FIELD_PARAMETER, getParameterTypeForPlayerCommand(i9), i3));
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            builder.setIconUri(uri);
        }
        Builder displayName = builder.setDisplayName(charSequence);
        if (bundleConvertToNullIfInvalid == null) {
            bundleConvertToNullIfInvalid = Bundle.EMPTY;
        }
        Builder enabled = displayName.setExtras(bundleConvertToNullIfInvalid).setEnabled(z6);
        if (intArray == null) {
            intArray = new int[]{6};
        }
        return enabled.setSlots(intArray).build();
    }

    public Bundle toBundle(int i3) {
        Bundle bundle = new Bundle();
        SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null) {
            bundle.putBundle(FIELD_SESSION_COMMAND, sessionCommand.toBundle());
        }
        int i9 = this.playerCommand;
        if (i9 != -1) {
            bundle.putInt(FIELD_PLAYER_COMMAND, i9);
        }
        int i10 = this.icon;
        if (i10 != 0) {
            bundle.putInt(FIELD_ICON, i10);
        }
        int i11 = this.iconResId;
        if (i11 != 0) {
            bundle.putInt(FIELD_ICON_RES_ID, i11);
        }
        CharSequence charSequence = this.displayName;
        if (charSequence != "") {
            bundle.putCharSequence(FIELD_DISPLAY_NAME, charSequence);
        }
        if (!this.extras.isEmpty()) {
            bundle.putBundle(FIELD_EXTRAS, this.extras);
        }
        Uri uri = this.iconUri;
        if (uri != null) {
            bundle.putParcelable(FIELD_ICON_URI, uri);
        }
        boolean z6 = this.isEnabled;
        if (!z6) {
            bundle.putBoolean(FIELD_ENABLED, z6);
        }
        p107m4.a aVar = this.slots;
        if (aVar.f25392i != 1 || aVar.b(0) != 6) {
            String str = FIELD_SLOTS;
            p107m4.a aVar2 = this.slots;
            aVar2.getClass();
            bundle.putIntArray(str, Arrays.copyOfRange(aVar2.f25391h, 0, aVar2.f25392i));
        }
        if (this.parameter != null) {
            writeParameterToBundle(bundle, FIELD_PARAMETER, i3);
        }
        return bundle;
    }
}
