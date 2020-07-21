package com.vegabond.monumentdetection;


import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class SettingUtility {


    public static SettingsControl getControlSettings(Context mContext){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        Boolean detectionMode = preferences.getBoolean("key_monumentDetectionModeState",true);
        String snapDuration = preferences.getString("key_SnapGap","10");
        Boolean storeOriginal = preferences.getBoolean("key_StorePic",true);
        String maxPhoto = preferences.getString("key_MaximumPhoto","10");
        String mode = preferences.getString("key_Mode","1");
        Boolean previewMode = preferences.getBoolean("key_Preview",true);

        String processingMode = preferences.getString("key_Processing_Mode","2");
        String removeBlackBorder = preferences.getString("key_RemoveBlackBorders","1");
        String enhanceMode = preferences.getString("key_Image_Enhance_Mode","0");

        Boolean onDisplayHint = preferences.getBoolean("key_onscreen_hint",true);
        Boolean onBottomCurrentHint = preferences.getBoolean("key_current_status_hint",true);
        Boolean displayCapturingStatus = preferences.getBoolean("key_capturing_hint",true);

        return new SettingsControl(detectionMode,snapDuration,maxPhoto,storeOriginal,mode,previewMode,processingMode,removeBlackBorder,enhanceMode,onDisplayHint,onBottomCurrentHint,displayCapturingStatus);
    }

    public static class SettingsControl {
        Boolean DetectionMode;
        String SnapDuration;
        String MaxPhoto;
        Boolean StoreOriginal;
        String Mode;
        Boolean PreviewMode;
        String ProcessingMode;
        String RemoveBlackBorder;
        String EnhanceMode;
        Boolean OnDisplayHint,OnBottomCurrentHint,DisplayCapturingStatus;

        public SettingsControl(Boolean detectionMode, String snapDuration, String maxPhoto, Boolean storeOriginal,String mode,Boolean previewMode,String processingMode,String removeBlackBorder,String enhanceMode,Boolean onDisplayHint,Boolean onBottomCurrentHint,Boolean displayCapturingStatus) {
            DetectionMode = detectionMode;
            SnapDuration = snapDuration;
            MaxPhoto = maxPhoto;
            StoreOriginal = storeOriginal;
            Mode = mode;
            PreviewMode = previewMode;
            ProcessingMode = processingMode;
            RemoveBlackBorder = removeBlackBorder;
            EnhanceMode = enhanceMode;
            OnDisplayHint = onDisplayHint;
            OnBottomCurrentHint = onBottomCurrentHint;
            DisplayCapturingStatus = displayCapturingStatus;

        }


        public Boolean getOnDisplayHint() {
            return OnDisplayHint;
        }

        public void setOnDisplayHint(Boolean onDisplayHint) {
            OnDisplayHint = onDisplayHint;
        }

        public Boolean getOnBottomCurrentHint() {
            return OnBottomCurrentHint;
        }

        public void setOnBottomCurrentHint(Boolean onBottomCurrentHint) {
            OnBottomCurrentHint = onBottomCurrentHint;
        }

        public Boolean getDisplayCapturingStatus() {
            return DisplayCapturingStatus;
        }

        public void setDisplayCapturingStatus(Boolean displayCapturingStatus) {
            DisplayCapturingStatus = displayCapturingStatus;
        }

        public String getProcessingMode() {
            return ProcessingMode;
        }

        public void setProcessingMode(String processingMode) {
            ProcessingMode = processingMode;
        }

        public String getRemoveBlackBorder() {
            return RemoveBlackBorder;
        }

        public void setRemoveBlackBorder(String removeBlackBorder) {
            RemoveBlackBorder = removeBlackBorder;
        }

        public String getEnhanceMode() {
            return EnhanceMode;
        }

        public void setEnhanceMode(String enhanceMode) {
            EnhanceMode = enhanceMode;
        }

        public Boolean getDetectionMode() {
            return DetectionMode;
        }

        public void setDetectionMode(Boolean detectionMode) {
            DetectionMode = detectionMode;
        }

        public String getSnapDuration() {
            return SnapDuration;
        }

        public void setSnapDuration(String snapDuration) {
            SnapDuration = snapDuration;
        }

        public String getMaxPhoto() {
            return MaxPhoto;
        }

        public void setMaxPhoto(String maxPhoto) {
            MaxPhoto = maxPhoto;
        }

        public Boolean getStoreOriginal() {
            return StoreOriginal;
        }

        public void setStoreOriginal(Boolean storeOriginal) {
            StoreOriginal = storeOriginal;
        }

        public String getMode() {
            return Mode;
        }

        public void setMode(String mode) {
            Mode = mode;
        }

        public Boolean getPreviewMode() {
            return PreviewMode;
        }

        public void setPreviewMode(Boolean previewMode) {
            PreviewMode = previewMode;
        }
    }

}
