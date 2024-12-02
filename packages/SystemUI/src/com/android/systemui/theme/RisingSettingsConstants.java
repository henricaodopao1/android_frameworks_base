/*
 * Copyright (C) 2023-2024 The RisingOS Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.systemui.theme;

import android.provider.Settings;
import lineageos.providers.LineageSettings;

public class RisingSettingsConstants {
    public static final String CLOCK_STYLE = "clock_style";
    public static final String VOLUME_STYLE = "custom_volume_styles";
    public static final String STATUSBAR_CLOCK_CHIP = Settings.System.STATUSBAR_CLOCK_CHIP;
    public static final String QS_PANEL_TILE_HAPTIC = "qs_panel_tile_haptic";
    public static final String STATUS_BAR_SHOW_BATTERY_PERCENT = "status_bar_show_battery_percent";
    public static final String STATUS_BAR_BATTERY_TEXT_CHARGING = "status_bar_battery_text_charging";
    public static final String STATUSBAR_BATTERY_BAR = "statusbar_battery_bar";
    public static final String STATUS_BAR_LOGO_POSITION = "status_bar_logo_position";
    public static final String SETTINGS_ICON_STYLE = "settings_icon_style";
    public static final String SEARCH_BAR_STYLE = "search_bar_style";
    public static final String QS_TILE_LABEL_HIDE = "qs_tile_label_hide";
    public static final String QS_TILE_VERTICAL_LAYOUT = "qs_tile_vertical_layout";

    public static final String[] SYSTEM_SETTINGS_KEYS = {
        STATUSBAR_CLOCK_CHIP,
        QS_PANEL_TILE_HAPTIC,
        STATUS_BAR_SHOW_BATTERY_PERCENT,
        STATUS_BAR_BATTERY_TEXT_CHARGING,
        STATUSBAR_BATTERY_BAR,
        STATUS_BAR_LOGO_POSITION,
        SETTINGS_ICON_STYLE,
        SEARCH_BAR_STYLE,
        QS_TILE_LABEL_HIDE,
        QS_TILE_VERTICAL_LAYOUT
    };
    
    public static final String[] SECURE_SETTINGS_KEYS = {
        CLOCK_STYLE
    };
    
    public static final String[] SYSTEM_SETTINGS_NOTIFY_ONLY_KEYS = {
        VOLUME_STYLE
    };
    
    public static final String[] SECURE_SETTINGS_NOTIFY_ONLY_KEYS = {
    };
    
    public static final String[] LINEAGE_SECURE_SETTINGS_KEYS = {
        LineageSettings.Secure.QS_SHOW_AUTO_BRIGHTNESS,
        LineageSettings.Secure.QS_SHOW_BRIGHTNESS_SLIDER,
        LineageSettings.Secure.QS_BRIGHTNESS_SLIDER_POSITION
    };
    
    public static final String[] LINEAGE_SYSTEM_SETTINGS_KEYS = {
    };
}
