package com.gmail.gandalfphysicist.Utils;

import com.gmail.gandalfphysicist.WeaponEffects.EffectList;

import java.util.List;

public class CustomEffectCheck {

    public static boolean hasCustomEffect(List<String> Lore) {
        for (String s : Lore) {
            for (String e : EffectList.effects()) {
                if (s.startsWith(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getEffect(List<String> Lore) {
        String effect;
        String noEffect = "noEffect";
        for (String s : Lore) {
            for (String e : EffectList.effects()) {
                if (s.startsWith(e)) {
                    effect = e;
                    return effect;
                }
            }
        }
        return noEffect;
    }

    public static Integer getEffectLevel(List<String> Lore) {
        int level = 0;
        for (String s : Lore) {
            for (String e : EffectList.effects()) {
                if (s.startsWith(e)) {
                    level = RomanNumerals.getIntFromRoman(s.split("\\s+")[1]);
                }
            }
        }
        return level;
    }
}