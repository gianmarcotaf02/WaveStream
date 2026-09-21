package org.videolan.libvlc.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

public class VLCUtil {
    private static final String[] CPU_archs = {"*Pre-v4", "*v4", "*v4T", "v5T", "v5TE", "v5TEJ", "v6", "v6KZ", "v6T2", "v6K", "v7", "*v6-M", "*v6S-M", "*v7E-M", "*v8"};
    private static final int ELF_HEADER_SIZE = 52;
    private static final int EM_386 = 3;
    private static final int EM_AARCH64 = 183;
    private static final int EM_ARM = 40;
    private static final int EM_MIPS = 8;
    private static final int EM_X86_64 = 62;
    private static final int SECTION_HEADER_SIZE = 40;
    private static final int SHT_ARM_ATTRIBUTES = 1879048195;
    public static final String TAG = "VLC/LibVLC/Util";
    private static final String URI_AUTHORIZED_CHARS = "'()*";
    private static String errorMsg = null;
    private static boolean isCompatible = false;
    private static MachineSpecs machineSpecs;

    public static class ElfData {
        String att_arch;
        boolean att_fpu;
        int e_machine;
        int e_shnum;
        int e_shoff;
        boolean is64bits;
        ByteOrder order;
        int sh_offset;
        int sh_size;

        private ElfData() {
        }
    }

    public static class MachineSpecs {
        public float bogoMIPS;
        public float frequency;
        public boolean hasArmV6;
        public boolean hasArmV7;
        public boolean hasFpu;
        public boolean hasMips;
        public boolean hasNeon;
        public boolean hasX86;
        public boolean is64bits;
        public int processors;
    }

    public static Uri UriFromMrl(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        int i3 = 0;
        while (i3 < charArray.length) {
            char c9 = charArray[i3];
            if (c9 != '%' || charArray.length - i3 < 3) {
                sb.append(c9);
            } else {
                try {
                    int i9 = Integer.parseInt(new String(charArray, i3 + 1, 2), 16);
                    if (URI_AUTHORIZED_CHARS.indexOf(i9) != -1) {
                        sb.append((char) i9);
                        i3 += 2;
                    } else {
                        sb.append(c9);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i3++;
        }
        return Uri.parse(sb.toString());
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String encodeVLCString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (char c9 : charArray) {
            if (URI_AUTHORIZED_CHARS.indexOf(c9) != -1) {
                sb.append("%");
                sb.append(Integer.toHexString(c9));
            } else {
                sb.append(c9);
            }
        }
        return sb.toString();
    }

    public static String encodeVLCUri(Uri uri) {
        return encodeVLCString(uri.toString());
    }

    public static String[] getABIList() {
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static String[] getABIList21() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return (strArr == null || strArr.length == 0) ? getABIList() : strArr;
    }

    public static String getErrorMsg() {
        return errorMsg;
    }

    public static MachineSpecs getMachineSpecs() {
        return machineSpecs;
    }

    private static String getString(ByteBuffer byteBuffer) {
        char c9;
        StringBuilder sb = new StringBuilder(byteBuffer.limit());
        while (byteBuffer.remaining() > 0 && (c9 = (char) byteBuffer.get()) != 0) {
            sb.append(c9);
        }
        return sb.toString();
    }

    private static int getUleb128(ByteBuffer byteBuffer) {
        byte b9;
        int i3 = 0;
        do {
            b9 = byteBuffer.get();
            i3 = (i3 << 7) | (b9 & 127);
        } while ((b9 & 128) > 0);
        return i3;
    }

    public static boolean hasCompatibleCPU(Context context) throws Throwable {
        String str;
        ElfData lib;
        boolean z6;
        ?? r12;
        boolean z9;
        boolean z10;
        boolean z11;
        FileReader fileReader;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        FileReader fileReader2;
        BufferedReader bufferedReader;
        ?? r19;
        BufferedReader bufferedReader2;
        float f9;
        ?? Contains;
        ?? r9;
        ?? r10;
        ?? r11;
        FileReader fileReader3;
        BufferedReader bufferedReader3;
        FileReader fileReader4;
        float f10;
        String line;
        int i3;
        String str2;
        boolean zStartsWith;
        String line2;
        ?? r110;
        if (errorMsg != null || isCompatible) {
            return isCompatible;
        }
        String[] aBIList21 = getABIList21();
        int length = aBIList21.length;
        int i9 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (true) {
            str = "x86";
            if (i9 >= length) {
                break;
            }
            String str3 = aBIList21[i9];
            if (str3.equals("x86")) {
                z20 = true;
            } else {
                if (str3.equals("x86_64")) {
                    z20 = true;
                } else if (str3.equals("armeabi-v7a")) {
                    z18 = true;
                    z19 = true;
                } else if (str3.equals("armeabi")) {
                    z18 = true;
                } else if (str3.equals("arm64-v8a")) {
                    z17 = true;
                    z18 = true;
                    z19 = true;
                }
                z21 = true;
            }
            i9++;
        }
        File fileSearchLibrary = searchLibrary(context.getApplicationInfo());
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (fileSearchLibrary != null) {
                                    lib = readLib(fileSearchLibrary);
                                    if (lib != null) {
                                        int i10 = lib.e_machine;
                                        z9 = i10 == 3 || i10 == EM_X86_64;
                                        z10 = i10 == 40 || i10 == EM_AARCH64;
                                        boolean z22 = i10 == 8;
                                        z11 = lib.is64bits;
                                        z6 = false;
                                        StringBuilder sb = new StringBuilder("ELF ABI = ");
                                        if (z10) {
                                            str = "arm";
                                        } else if (!z9) {
                                            str = "mips";
                                        }
                                        sb.append(str);
                                        sb.append(", ");
                                        sb.append(z11 ? "64bits" : "32bits");
                                        Log.i(TAG, sb.toString());
                                        Log.i(TAG, "ELF arch = " + lib.att_arch);
                                        Log.i(TAG, "ELF fpu = " + lib.att_fpu);
                                        r12 = z22;
                                    }
                                    fileReader2 = new FileReader("/proc/cpuinfo");
                                    bufferedReader2 = new BufferedReader(fileReader2);
                                    z13 = z6;
                                    z14 = z13;
                                    boolean z23 = z14;
                                    z15 = z23 ? 1 : 0;
                                    z16 = z15 ? 1 : 0;
                                    f9 = -1.0f;
                                    r19 = z23;
                                    while (true) {
                                        try {
                                            try {
                                                line2 = bufferedReader2.readLine();
                                                if (line2 != null) {
                                                    break;
                                                }
                                                z12 = true;
                                                try {
                                                    Contains = line2.contains("AArch64");
                                                    if (Contains == 0 || line2.contains("ARMv7")) {
                                                        z18 = true;
                                                        z19 = true;
                                                    } else if (line2.contains("ARMv6")) {
                                                        z18 = true;
                                                    } else if (!line2.contains("clflush size") || line2.contains("GenuineIntel")) {
                                                        z20 = true;
                                                    } else if (line2.contains("placeholder")) {
                                                        z13 = true;
                                                    } else if (!line2.contains("CPU implementer") && line2.contains("0x69")) {
                                                        z14 = true;
                                                    } else if (line2.contains("microsecond timers")) {
                                                        z15 = true;
                                                    }
                                                    if (line2.contains("neon") || line2.contains("asimd")) {
                                                        z17 = true;
                                                    }
                                                    if (line2.contains("vfp") || (line2.contains("Features") && line2.contains("fp"))) {
                                                        z16 = true;
                                                    }
                                                    r110 = r19;
                                                    if (line2.startsWith("processor")) {
                                                        r110 = r19 + 1;
                                                    }
                                                    Contains = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                                                    if (Contains < 0) {
                                                        Contains = line2.toLowerCase(Locale.ENGLISH);
                                                        if (Contains.contains("bogomips")) {
                                                            try {
                                                                f9 = Float.parseFloat(line2.split(":")[1].trim());
                                                            } catch (NumberFormatException unused) {
                                                                f9 = -1.0f;
                                                            }
                                                        }
                                                    }
                                                    r19 = r110;
                                                } catch (IOException unused2) {
                                                }
                                            } catch (IOException unused3) {
                                            }
                                            close(bufferedReader2);
                                            close(fileReader2);
                                            boolean z24 = z15;
                                            boolean z25 = z16;
                                            float f11 = f9;
                                            if (r19 == 0) {
                                                r9 = z12;
                                            } else {
                                                r9 = r19;
                                            }
                                            isCompatible = z12;
                                            if (lib != null) {
                                                if (z9 || z20) {
                                                    if (z10 && !z18) {
                                                        errorMsg = "ARM build on non ARM device";
                                                        isCompatible = z6;
                                                    }
                                                } else if (z13 && z14) {
                                                    Log.d(TAG, "Emulated armv7 detected, trying to launch x86 libraries");
                                                } else {
                                                    errorMsg = "x86 build on non-x86 device";
                                                    isCompatible = z6;
                                                }
                                                if (r12 == 0 && !z24) {
                                                    errorMsg = "MIPS build on non-MIPS device";
                                                    isCompatible = z6;
                                                } else if (z10 && z24) {
                                                    errorMsg = "ARM build on MIPS device";
                                                    isCompatible = z6;
                                                }
                                                if (lib.e_machine == 40 && lib.att_arch.startsWith("v7") && !z19) {
                                                    errorMsg = "ARMv7 build on non-ARMv7 device";
                                                    isCompatible = z6;
                                                }
                                                i3 = lib.e_machine;
                                                r12 = 40;
                                                Contains = i3;
                                                if (i3 == 40) {
                                                    str2 = "v6";
                                                    zStartsWith = lib.att_arch.startsWith("v6");
                                                    if (zStartsWith || z18) {
                                                        Contains = zStartsWith;
                                                        Contains = zStartsWith;
                                                        r12 = str2;
                                                        r12 = str2;
                                                        if (lib.att_fpu && !z25) {
                                                            errorMsg = "FPU-enabled build on non-FPU device";
                                                            isCompatible = z6;
                                                        }
                                                    } else {
                                                        errorMsg = "ARMv6 build on non-ARMv6 device";
                                                        isCompatible = z6;
                                                    }
                                                }
                                                if (z11 && !z21) {
                                                    errorMsg = "64bits build on 32bits device";
                                                    isCompatible = z6;
                                                }
                                            }
                                            Contains = zStartsWith;
                                            r12 = str2;
                                            Contains = zStartsWith;
                                            r12 = str2;
                                            fileReader3 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                                            bufferedReader3 = new BufferedReader(fileReader3);
                                            line = bufferedReader3.readLine();
                                            if (line != null) {
                                                f10 = Float.parseFloat(line) / 1000.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            close(bufferedReader3);
                                            close(fileReader3);
                                            machineSpecs = new MachineSpecs();
                                            Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
                                            MachineSpecs machineSpecs2 = machineSpecs;
                                            machineSpecs2.hasArmV6 = z18;
                                            machineSpecs2.hasArmV7 = z19;
                                            machineSpecs2.hasFpu = z25;
                                            machineSpecs2.hasMips = z24;
                                            machineSpecs2.hasNeon = z17;
                                            machineSpecs2.hasX86 = z20;
                                            machineSpecs2.is64bits = z21;
                                            machineSpecs2.bogoMIPS = f11;
                                            machineSpecs2.processors = r9;
                                            machineSpecs2.frequency = f10;
                                            return isCompatible;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileReader = fileReader2;
                                            bufferedReader = bufferedReader2;
                                            close(bufferedReader);
                                            close(fileReader);
                                            throw th;
                                        }
                                    }
                                    z12 = true;
                                    close(bufferedReader2);
                                    close(fileReader2);
                                    boolean z26 = z15;
                                    boolean z27 = z16;
                                    float f12 = f9;
                                    if (r19 == 0) {
                                        r9 = z12;
                                    } else {
                                        r9 = r19;
                                    }
                                    isCompatible = z12;
                                    if (lib != null) {
                                        if (z9) {
                                            if (z10) {
                                                errorMsg = "ARM build on non ARM device";
                                                isCompatible = z6;
                                            }
                                        } else if (z10) {
                                            errorMsg = "ARM build on non ARM device";
                                            isCompatible = z6;
                                        }
                                        if (r12 == 0) {
                                            if (z10) {
                                                errorMsg = "ARM build on MIPS device";
                                                isCompatible = z6;
                                            }
                                        } else if (z10) {
                                            errorMsg = "ARM build on MIPS device";
                                            isCompatible = z6;
                                        }
                                        if (lib.e_machine == 40) {
                                            errorMsg = "ARMv7 build on non-ARMv7 device";
                                            isCompatible = z6;
                                        }
                                        i3 = lib.e_machine;
                                        r12 = 40;
                                        Contains = i3;
                                        if (i3 == 40) {
                                            str2 = "v6";
                                            zStartsWith = lib.att_arch.startsWith("v6");
                                            if (zStartsWith) {
                                                Contains = zStartsWith;
                                                Contains = zStartsWith;
                                                r12 = str2;
                                                r12 = str2;
                                                if (lib.att_fpu) {
                                                    errorMsg = "FPU-enabled build on non-FPU device";
                                                    isCompatible = z6;
                                                }
                                            } else {
                                                Contains = zStartsWith;
                                                Contains = zStartsWith;
                                                r12 = str2;
                                                r12 = str2;
                                                if (lib.att_fpu) {
                                                    errorMsg = "FPU-enabled build on non-FPU device";
                                                    isCompatible = z6;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            errorMsg = "64bits build on 32bits device";
                                            isCompatible = z6;
                                        }
                                    }
                                    Contains = zStartsWith;
                                    r12 = str2;
                                    Contains = zStartsWith;
                                    r12 = str2;
                                    fileReader3 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                                    bufferedReader3 = new BufferedReader(fileReader3);
                                    line = bufferedReader3.readLine();
                                    if (line != null) {
                                        f10 = Float.parseFloat(line) / 1000.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    close(bufferedReader3);
                                    close(fileReader3);
                                    machineSpecs = new MachineSpecs();
                                    Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
                                    MachineSpecs machineSpecs3 = machineSpecs;
                                    machineSpecs3.hasArmV6 = z18;
                                    machineSpecs3.hasArmV7 = z19;
                                    machineSpecs3.hasFpu = z27;
                                    machineSpecs3.hasMips = z26;
                                    machineSpecs3.hasNeon = z17;
                                    machineSpecs3.hasX86 = z20;
                                    machineSpecs3.is64bits = z21;
                                    machineSpecs3.bogoMIPS = f12;
                                    machineSpecs3.processors = r9;
                                    machineSpecs3.frequency = f10;
                                    return isCompatible;
                                }
                                lib = null;
                                while (true) {
                                    line2 = bufferedReader2.readLine();
                                    if (line2 != null) {
                                        break;
                                        break;
                                    }
                                    z12 = true;
                                    Contains = line2.contains("AArch64");
                                    if (Contains == 0) {
                                        z18 = true;
                                        z19 = true;
                                    } else if (line2.contains("ARMv6")) {
                                        z18 = true;
                                    } else if (!line2.contains("clflush size")) {
                                        z20 = true;
                                    } else if (line2.contains("placeholder")) {
                                        z13 = true;
                                    } else if (!line2.contains("CPU implementer")) {
                                        if (line2.contains("microsecond timers")) {
                                            z15 = true;
                                        }
                                    } else if (line2.contains("microsecond timers")) {
                                        z15 = true;
                                    }
                                    if (line2.contains("neon")) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    if (line2.contains("vfp")) {
                                        z16 = true;
                                    } else {
                                        z16 = true;
                                    }
                                    r110 = r19;
                                    if (line2.startsWith("processor")) {
                                        r110 = r19 + 1;
                                    }
                                    Contains = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                                    if (Contains < 0) {
                                        Contains = line2.toLowerCase(Locale.ENGLISH);
                                        if (Contains.contains("bogomips")) {
                                            f9 = Float.parseFloat(line2.split(":")[1].trim());
                                        }
                                    }
                                    r19 = r110;
                                    close(bufferedReader2);
                                    close(fileReader2);
                                    boolean z28 = z15;
                                    boolean z29 = z16;
                                    float f13 = f9;
                                    if (r19 == 0) {
                                        r9 = z12;
                                    } else {
                                        r9 = r19;
                                    }
                                    isCompatible = z12;
                                    if (lib != null) {
                                        if (z9) {
                                            if (z10) {
                                                errorMsg = "ARM build on non ARM device";
                                                isCompatible = z6;
                                            }
                                        } else if (z10) {
                                            errorMsg = "ARM build on non ARM device";
                                            isCompatible = z6;
                                        }
                                        if (r12 == 0) {
                                            if (z10) {
                                                errorMsg = "ARM build on MIPS device";
                                                isCompatible = z6;
                                            }
                                        } else if (z10) {
                                            errorMsg = "ARM build on MIPS device";
                                            isCompatible = z6;
                                        }
                                        if (lib.e_machine == 40) {
                                            errorMsg = "ARMv7 build on non-ARMv7 device";
                                            isCompatible = z6;
                                        }
                                        i3 = lib.e_machine;
                                        r12 = 40;
                                        Contains = i3;
                                        if (i3 == 40) {
                                            str2 = "v6";
                                            zStartsWith = lib.att_arch.startsWith("v6");
                                            if (zStartsWith) {
                                                Contains = zStartsWith;
                                                Contains = zStartsWith;
                                                r12 = str2;
                                                r12 = str2;
                                                if (lib.att_fpu) {
                                                    errorMsg = "FPU-enabled build on non-FPU device";
                                                    isCompatible = z6;
                                                }
                                            } else {
                                                Contains = zStartsWith;
                                                Contains = zStartsWith;
                                                r12 = str2;
                                                r12 = str2;
                                                if (lib.att_fpu) {
                                                    errorMsg = "FPU-enabled build on non-FPU device";
                                                    isCompatible = z6;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            errorMsg = "64bits build on 32bits device";
                                            isCompatible = z6;
                                        }
                                    }
                                    Contains = zStartsWith;
                                    r12 = str2;
                                    Contains = zStartsWith;
                                    r12 = str2;
                                    fileReader3 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                                    bufferedReader3 = new BufferedReader(fileReader3);
                                    line = bufferedReader3.readLine();
                                    if (line != null) {
                                        f10 = Float.parseFloat(line) / 1000.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    close(bufferedReader3);
                                    close(fileReader3);
                                    machineSpecs = new MachineSpecs();
                                    Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
                                    MachineSpecs machineSpecs4 = machineSpecs;
                                    machineSpecs4.hasArmV6 = z18;
                                    machineSpecs4.hasArmV7 = z19;
                                    machineSpecs4.hasFpu = z29;
                                    machineSpecs4.hasMips = z28;
                                    machineSpecs4.hasNeon = z17;
                                    machineSpecs4.hasX86 = z20;
                                    machineSpecs4.is64bits = z21;
                                    machineSpecs4.bogoMIPS = f13;
                                    machineSpecs4.processors = r9;
                                    machineSpecs4.frequency = f10;
                                    return isCompatible;
                                }
                                line = bufferedReader3.readLine();
                                if (line != null) {
                                    f10 = Float.parseFloat(line) / 1000.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                close(bufferedReader3);
                                close(fileReader3);
                            } catch (IOException unused4) {
                                Log.w(TAG, "Could not find maximum CPU frequency!");
                                fileReader4 = fileReader3;
                                close(bufferedReader3);
                                close(fileReader4);
                                f10 = -1.0f;
                            } catch (NumberFormatException unused5) {
                                Log.w(TAG, "Could not parse maximum CPU frequency!");
                                Log.w(TAG, "Failed to parse: ");
                                fileReader4 = fileReader3;
                                close(bufferedReader3);
                                close(fileReader4);
                                f10 = -1.0f;
                            }
                            bufferedReader3 = new BufferedReader(fileReader3);
                        } catch (IOException unused6) {
                            bufferedReader3 = null;
                            Log.w(TAG, "Could not find maximum CPU frequency!");
                            fileReader4 = fileReader3;
                            close(bufferedReader3);
                            close(fileReader4);
                            f10 = -1.0f;
                            machineSpecs = new MachineSpecs();
                            Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
                            MachineSpecs machineSpecs5 = machineSpecs;
                            machineSpecs5.hasArmV6 = z18;
                            machineSpecs5.hasArmV7 = z19;
                            machineSpecs5.hasFpu = z29;
                            machineSpecs5.hasMips = z28;
                            machineSpecs5.hasNeon = z17;
                            machineSpecs5.hasX86 = z20;
                            machineSpecs5.is64bits = z21;
                            machineSpecs5.bogoMIPS = f13;
                            machineSpecs5.processors = r9;
                            machineSpecs5.frequency = f10;
                            return isCompatible;
                        } catch (NumberFormatException unused7) {
                            bufferedReader3 = null;
                            Log.w(TAG, "Could not parse maximum CPU frequency!");
                            Log.w(TAG, "Failed to parse: ");
                            fileReader4 = fileReader3;
                            close(bufferedReader3);
                            close(fileReader4);
                            f10 = -1.0f;
                            machineSpecs = new MachineSpecs();
                            Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
                            MachineSpecs machineSpecs6 = machineSpecs;
                            machineSpecs6.hasArmV6 = z18;
                            machineSpecs6.hasArmV7 = z19;
                            machineSpecs6.hasFpu = z29;
                            machineSpecs6.hasMips = z28;
                            machineSpecs6.hasNeon = z17;
                            machineSpecs6.hasX86 = z20;
                            machineSpecs6.is64bits = z21;
                            machineSpecs6.bogoMIPS = f13;
                            machineSpecs6.processors = r9;
                            machineSpecs6.frequency = f10;
                            return isCompatible;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = 0;
                            r11 = fileReader3;
                            close(r10);
                            close(r11);
                            throw th;
                        }
                        fileReader3 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = r12;
                        r11 = Contains;
                    }
                } catch (IOException unused8) {
                    fileReader3 = null;
                } catch (NumberFormatException unused9) {
                    fileReader3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    r10 = 0;
                    r11 = 0;
                }
                bufferedReader2 = new BufferedReader(fileReader2);
                z13 = z6;
                z14 = z13;
                boolean z210 = z14;
                z15 = z210 ? 1 : 0;
                z16 = z15 ? 1 : 0;
                f9 = -1.0f;
                r19 = z210;
                z12 = true;
            } catch (IOException unused10) {
                z12 = true;
                z13 = z6;
                z14 = z13;
                boolean z30 = z14;
                z15 = z30 ? 1 : 0;
                z16 = z15 ? 1 : 0;
                r19 = z30;
                bufferedReader2 = null;
                f9 = -1.0f;
            } catch (Throwable th5) {
                th = th5;
                fileReader = fileReader2;
                bufferedReader = null;
                close(bufferedReader);
                close(fileReader);
                throw th;
            }
            fileReader2 = new FileReader("/proc/cpuinfo");
        } catch (IOException unused11) {
            z12 = true;
            z13 = z6;
            z14 = z13;
            boolean z31 = z14;
            z15 = z31 ? 1 : 0;
            z16 = z15 ? 1 : 0;
            fileReader2 = null;
            r19 = z31;
        } catch (Throwable th6) {
            th = th6;
            fileReader = null;
        }
        z6 = false;
        Log.w(TAG, "WARNING: Unable to read libvlcjni.so; cannot check device ABI!");
        r12 = 0;
        z9 = false;
        z10 = false;
        z11 = false;
        close(bufferedReader2);
        close(fileReader2);
        boolean z211 = z15;
        boolean z212 = z16;
        float f14 = f9;
        if (r19 == 0) {
            r9 = z12;
        } else {
            r9 = r19;
        }
        isCompatible = z12;
        if (lib != null) {
            if (z9) {
                if (z10) {
                    errorMsg = "ARM build on non ARM device";
                    isCompatible = z6;
                }
            } else if (z10) {
                errorMsg = "ARM build on non ARM device";
                isCompatible = z6;
            }
            if (r12 == 0) {
                if (z10) {
                    errorMsg = "ARM build on MIPS device";
                    isCompatible = z6;
                }
            } else if (z10) {
                errorMsg = "ARM build on MIPS device";
                isCompatible = z6;
            }
            if (lib.e_machine == 40) {
                errorMsg = "ARMv7 build on non-ARMv7 device";
                isCompatible = z6;
            }
            i3 = lib.e_machine;
            r12 = 40;
            Contains = i3;
            if (i3 == 40) {
                str2 = "v6";
                zStartsWith = lib.att_arch.startsWith("v6");
                if (zStartsWith) {
                    Contains = zStartsWith;
                    Contains = zStartsWith;
                    r12 = str2;
                    r12 = str2;
                    if (lib.att_fpu) {
                        errorMsg = "FPU-enabled build on non-FPU device";
                        isCompatible = z6;
                    }
                } else {
                    Contains = zStartsWith;
                    Contains = zStartsWith;
                    r12 = str2;
                    r12 = str2;
                    if (lib.att_fpu) {
                        errorMsg = "FPU-enabled build on non-FPU device";
                        isCompatible = z6;
                    }
                }
            }
            if (z11) {
                errorMsg = "64bits build on 32bits device";
                isCompatible = z6;
            }
        }
        Contains = zStartsWith;
        r12 = str2;
        Contains = zStartsWith;
        r12 = str2;
        machineSpecs = new MachineSpecs();
        Log.d(TAG, "machineSpecs: hasArmV6: " + z18 + ", hasArmV7: " + z19 + ", hasX86: " + z20 + ", is64bits: " + z21);
        MachineSpecs machineSpecs7 = machineSpecs;
        machineSpecs7.hasArmV6 = z18;
        machineSpecs7.hasArmV7 = z19;
        machineSpecs7.hasFpu = z212;
        machineSpecs7.hasMips = z211;
        machineSpecs7.hasNeon = z17;
        machineSpecs7.hasX86 = z20;
        machineSpecs7.is64bits = z21;
        machineSpecs7.bogoMIPS = f14;
        machineSpecs7.processors = r9;
        machineSpecs7.frequency = f10;
        return isCompatible;
    }

    private static boolean readArmAttributes(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[elfData.sh_size];
        randomAccessFile.seek(elfData.sh_offset);
        randomAccessFile.readFully(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(elfData.order);
        if (byteBufferWrap.get() != 65) {
            return false;
        }
        while (byteBufferWrap.remaining() > 0) {
            int iPosition = byteBufferWrap.position();
            int i3 = byteBufferWrap.getInt();
            if (getString(byteBufferWrap).equals("aeabi")) {
                while (byteBufferWrap.position() < iPosition + i3) {
                    int iPosition2 = byteBufferWrap.position();
                    byte b9 = byteBufferWrap.get();
                    int i9 = byteBufferWrap.getInt();
                    if (b9 != 1) {
                        byteBufferWrap.position(iPosition2 + i9);
                    } else {
                        while (byteBufferWrap.position() < iPosition2 + i9) {
                            int uleb128 = getUleb128(byteBufferWrap);
                            if (uleb128 == 6) {
                                elfData.att_arch = CPU_archs[getUleb128(byteBufferWrap)];
                            } else if (uleb128 == 27) {
                                getUleb128(byteBufferWrap);
                                elfData.att_fpu = true;
                            } else {
                                int i10 = uleb128 % 128;
                                if (i10 == 4 || i10 == 5 || i10 == 32 || (i10 > 32 && (i10 & 1) != 0)) {
                                    getString(byteBufferWrap);
                                } else {
                                    getUleb128(byteBufferWrap);
                                }
                            }
                        }
                    }
                }
                break;
            }
        }
        return true;
    }

    private static boolean readHeader(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte b9;
        byte[] bArr = new byte[ELF_HEADER_SIZE];
        randomAccessFile.readFully(bArr);
        if (bArr[0] != 127 || bArr[1] != 69 || bArr[2] != 76 || bArr[3] != 70 || ((b9 = bArr[4]) != 1 && b9 != 2)) {
            Log.e(TAG, "ELF header invalid");
            return false;
        }
        elfData.is64bits = b9 == 2;
        elfData.order = bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(elfData.order);
        elfData.e_machine = byteBufferWrap.getShort(18);
        elfData.e_shoff = byteBufferWrap.getInt(32);
        elfData.e_shnum = byteBufferWrap.getShort(48);
        return true;
    }

    private static ElfData readLib(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3 = null;
        Object[] objArr = 0;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    ElfData elfData = new ElfData();
                    if (!readHeader(randomAccessFile, elfData)) {
                        close(randomAccessFile);
                        return null;
                    }
                    int i3 = elfData.e_machine;
                    if (i3 != 3 && i3 != 8) {
                        if (i3 == 40) {
                            randomAccessFile.close();
                            RandomAccessFile randomAccessFile4 = new RandomAccessFile(file, "r");
                            try {
                                if (!readSection(randomAccessFile4, elfData)) {
                                    close(randomAccessFile4);
                                    return null;
                                }
                                randomAccessFile4.close();
                                randomAccessFile = new RandomAccessFile(file, "r");
                                if (readArmAttributes(randomAccessFile, elfData)) {
                                    close(randomAccessFile);
                                    return elfData;
                                }
                                close(randomAccessFile);
                                return null;
                            } catch (IOException e6) {
                                e = e6;
                                randomAccessFile = randomAccessFile4;
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile3 = randomAccessFile4;
                                close(randomAccessFile3);
                                throw th;
                            }
                        } else if (i3 != EM_X86_64 && i3 != EM_AARCH64) {
                            close(randomAccessFile);
                            return null;
                        }
                    }
                    close(randomAccessFile);
                    return elfData;
                } catch (IOException e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = randomAccessFile2;
            }
        } catch (IOException e10) {
            e = e10;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
        }
        e.printStackTrace();
        close(randomAccessFile);
        return null;
    }

    private static boolean readSection(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[40];
        randomAccessFile.seek(elfData.e_shoff);
        for (int i3 = 0; i3 < elfData.e_shnum; i3++) {
            randomAccessFile.readFully(bArr);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(elfData.order);
            if (byteBufferWrap.getInt(4) == SHT_ARM_ATTRIBUTES) {
                elfData.sh_offset = byteBufferWrap.getInt(16);
                elfData.sh_size = byteBufferWrap.getInt(20);
                return true;
            }
        }
        return false;
    }

    private static File searchLibrary(ApplicationInfo applicationInfo) {
        String[] strArrSplit = (applicationInfo.flags & 1) != 0 ? System.getProperty("java.library.path").split(":") : new String[]{applicationInfo.nativeLibraryDir};
        if (strArrSplit[0] == null) {
            Log.e(TAG, "can't find library path");
            return null;
        }
        for (String str : strArrSplit) {
            File file = new File(str, "libvlcjni.so");
            if (file.exists() && file.canRead()) {
                return file;
            }
        }
        Log.e(TAG, "WARNING: Can't find shared library");
        return null;
    }
}
