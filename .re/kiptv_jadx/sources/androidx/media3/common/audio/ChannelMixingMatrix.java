package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i3, int i9, float[] fArr) {
        boolean z6 = false;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 > 0, "Input channel count must be positive.");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i9 > 0, "Output channel count must be positive.");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(fArr.length == i3 * i9, "Coefficient array length is invalid.");
        this.inputChannelCount = i3;
        this.outputChannelCount = i9;
        this.coefficients = checkCoefficientsValid(fArr);
        int i10 = 0;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        while (i10 < i3) {
            int i11 = 0;
            while (i11 < i9) {
                float mixingCoefficient = getMixingCoefficient(i10, i11);
                boolean z12 = i10 == i11;
                if (mixingCoefficient != 1.0f && z12) {
                    z11 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z9 = false;
                    if (!z12) {
                        z10 = false;
                    }
                }
                i11++;
            }
            i10++;
        }
        this.isZero = z9;
        boolean z13 = isSquare() && z10;
        this.isDiagonal = z13;
        if (z13 && z11) {
            z6 = true;
        }
        this.isIdentity = z6;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "Coefficient at index ", " is negative."));
            }
        }
        return fArr;
    }

    private static float[] createConstantGainMixingCoefficients(int i3, int i9) {
        if (i3 == i9) {
            return initializeIdentityMatrix(i9);
        }
        if (i3 == 1 && i9 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i3 == 2 && i9 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new java.lang.UnsupportedOperationException("Default channel mixing coefficients for " + i3 + "->" + i9 + " are not yet implemented.");
    }

    private static float[] createConstantPowerMixingCoefficients(int i3, int i9) {
        if (i9 == 1) {
            return getConstantPowerCoefficientsToMono(i3);
        }
        if (i9 == 2) {
            return getConstantPowerCoefficientsToStereo(i3);
        }
        if (i3 == i9) {
            return initializeIdentityMatrix(i9);
        }
        throw new java.lang.UnsupportedOperationException("Default constant power channel mixing coefficients for " + i3 + "->" + i9 + " are not implemented.");
    }

    public static androidx.media3.common.audio.ChannelMixingMatrix createForConstantGain(int i3, int i9) {
        return new androidx.media3.common.audio.ChannelMixingMatrix(i3, i9, createConstantGainMixingCoefficients(i3, i9));
    }

    public static androidx.media3.common.audio.ChannelMixingMatrix createForConstantPower(int i3, int i9) {
        return new androidx.media3.common.audio.ChannelMixingMatrix(i3, i9, createConstantPowerMixingCoefficients(i3, i9));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i3) {
        switch (i3) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new java.lang.UnsupportedOperationException(Y6.f.f(i3, "Default constant power channel mixing coefficients for ", "->1 are not implemented."));
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i3) {
        switch (i3) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new java.lang.UnsupportedOperationException(Y6.f.f(i3, "Default constant power channel mixing coefficients for ", "->2 are not implemented."));
        }
    }

    private static float[] initializeIdentityMatrix(int i3) {
        float[] fArr = new float[i3 * i3];
        for (int i9 = 0; i9 < i3; i9++) {
            fArr[(i3 * i9) + i9] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i3, int i9) {
        return this.coefficients[(i3 * this.outputChannelCount) + i9];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public androidx.media3.common.audio.ChannelMixingMatrix scaleBy(float f9) {
        float[] fArr = new float[this.coefficients.length];
        int i3 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i3 >= fArr2.length) {
                return new androidx.media3.common.audio.ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i3] = fArr2[i3] * f9;
            i3++;
        }
    }
}
