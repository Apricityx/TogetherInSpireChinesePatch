package Patches;

import Helpers.ChineseText;
import com.evacipated.cardcrawl.modthespire.lib.ByRef;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.green.Catalyst;
import com.megacrit.cardcrawl.helpers.PowerTip;
import com.megacrit.cardcrawl.relics.NeowsLament;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.megacrit.cardcrawl.screens.options.ConfirmPopup;
import com.megacrit.cardcrawl.screens.mainMenu.MenuCancelButton;
import com.megacrit.cardcrawl.screens.CombatRewardScreen;
import com.megacrit.cardcrawl.screens.select.GridCardSelectScreen;
import com.megacrit.cardcrawl.screens.select.HandCardSelectScreen;
import dLib.util.Reflection;
import spireTogether.achievements.Achievement;
import spireTogether.SpireTogetherMod;
import spireTogether.network.P2P.P2PManager;
import spireTogether.network.steam.SteamIntegration;
import spireTogether.network.steam.SteamManager;
import spireTogether.screens.BaseGameCustomModeScreen;
import spireTogether.screens.lobby.PFConnectingScreen;
import spireTogether.screens.misc.PopupScreen;
import spireTogether.screens.misc.SimpleTextScreen;
import spireTogether.ui.elements.mixed.BoxedLabel;

public class RuntimeTextPatches
{
  private static final String ENGLISH_TRADE_WARNING = "[#990F02]Cannot[] [#990F02]be[] [#990F02]traded.[]";
  private static final String CHINESE_TRADE_WARNING = "[#990F02]无法[] [#990F02]交易。[]";

  @SpirePatch(cls = "sayTheSpire.Output", method = "text", paramtypes = {"java.lang.String", "java.lang.Boolean"}, optional = true)
  public static class SayTheSpireTextPatch
  {
    public static void Prefix(@ByRef(type = "java.lang.String") String[] text)
    {
      if (Settings.language == Settings.GameLanguage.ZHS && text != null && text.length > 0)
      {
        text[0] = ChineseText.translateAccessibility(text[0]);
      }
    }
  }

  @SpirePatch(clz = BaseGameCustomModeScreen.class, method = "init", requiredModId = "spireTogether")
  public static class BaseGameCustomModePatch
  {
    public static void Postfix(BaseGameCustomModeScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        __instance.confirmButton.updateText("应用");
        MenuCancelButton cancelButton = Reflection.getFieldValue("cancelButton", __instance);
        cancelButton.show("清除");
      }
    }
  }

  @SpirePatch(clz = PopupScreen.class, method = "init", requiredModId = "spireTogether")
  public static class PopupScreenInitPatch
  {
    public static void Prefix(PopupScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        __instance.message = ChineseText.translate(__instance.message);
      }
    }
  }

  @SpirePatch(clz = ConfirmPopup.class, method = "show", requiredModId = "spireTogether")
  public static class ExitConfirmTextPatch
  {
    public static void Postfix(ConfirmPopup __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        __instance.desc = ChineseText.translate(__instance.desc);
      }
    }
  }

  @SpirePatch(clz = SimpleTextScreen.class, method = "init", requiredModId = "spireTogether")
  public static class SimpleTextScreenInitPatch
  {
    public static void Prefix(SimpleTextScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        __instance.text = ChineseText.translate(__instance.text);
      }
    }
  }

  @SpirePatch(clz = PFConnectingScreen.class, method = "PrintMessage", requiredModId = "spireTogether")
  public static class PFConnectingMessagePatch
  {
    public static void Postfix(PFConnectingScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        BoxedLabel text = Reflection.getFieldValue("text", __instance);
        text.SetText(ChineseText.translate(text.text));
      }
    }
  }

  @SpirePatch(clz = GridCardSelectScreen.class, method = "open", paramtypez = {com.megacrit.cardcrawl.cards.CardGroup.class, int.class, boolean.class, String.class}, requiredModId = "spireTogether")
  public static class GridSelectTextPatch
  {
    public static void Postfix(GridCardSelectScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        String tip = Reflection.getFieldValue("tipMsg", __instance);
        Reflection.setFieldValue("tipMsg", __instance, ChineseText.translate(tip));
      }
    }
  }

  @SpirePatch(clz = HandCardSelectScreen.class, method = "open", paramtypez = {String.class, int.class, boolean.class, boolean.class}, requiredModId = "spireTogether")
  public static class HandSelectTextPatch
  {
    public static void Postfix(HandCardSelectScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        String message = Reflection.getFieldValue("message", __instance);
        Reflection.setFieldValue("message", __instance, ChineseText.translate(message));
      }
    }
  }

  @SpirePatch(clz = CombatRewardScreen.class, method = "open", paramtypez = {String.class}, requiredModId = "spireTogether")
  public static class RewardTitlePatch
  {
    public static void Postfix(CombatRewardScreen __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        String title = Reflection.getFieldValue("labelOverride", __instance);
        Reflection.setFieldValue("labelOverride", __instance, ChineseText.translate(title));
      }
    }
  }

  @SpirePatch(clz = Achievement.class, method = com.evacipated.cardcrawl.modthespire.lib.SpirePatch.CONSTRUCTOR, requiredModId = "spireTogether")
  public static class AchievementTextPatch
  {
    public static void Postfix(Achievement __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        String title = Reflection.getFieldValue("title", __instance);
        String description = Reflection.getFieldValue("desc", __instance);
        Reflection.setFieldValue("title", __instance, ChineseText.translate(title));
        Reflection.setFieldValue("desc", __instance, ChineseText.translate(description));
      }
    }
  }

  @SpirePatch(cls = "skindex.itemtypes.OwnableItem", method = "getUnlockDescription", requiredModId = "spireTogether")
  public static class SkindexUnlockDescriptionPatch
  {
    public static String Postfix(String __result)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        return ChineseText.translate(__result);
      }
      return __result;
    }
  }

  @SpirePatch(cls = "spireTogether.util.Blacklist$CardDescriptionPatcher", method = "Prefix", paramtypez = {AbstractCard.class}, requiredModId = "spireTogether")
  public static class CardTradeWarningPatch
  {
    public static void Postfix(AbstractCard __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS)
      {
        __instance.rawDescription = replaceTradeWarning(__instance.rawDescription);
      }
    }
  }

  @SpirePatch(cls = "spireTogether.util.Blacklist$RelicDescriptionPatcher$1", method = "update", requiredModId = "spireTogether")
  public static class RelicTradeWarningPatch
  {
    public static void Postfix(Object __instance)
    {
      if (Settings.language != Settings.GameLanguage.ZHS)
      {
        return;
      }

      AbstractRelic relic = Reflection.getFieldValue("val$__instance", __instance);
      if (relic == null || relic.tips.isEmpty())
      {
        return;
      }
      PowerTip tip = relic.tips.get(0);
      tip.body = replaceTradeWarning(tip.body);
    }
  }

  @SpirePatch(clz = AbstractCard.class, method = "initializeDescription", requiredModId = "spireTogether")
  public static class RaidCatalystDescriptionPatch
  {
    public static void Prefix(AbstractCard __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS && __instance instanceof Catalyst && isInRaid())
      {
        __instance.rawDescription = catalystDescription(__instance.upgraded);
      }
    }

    public static void Postfix(AbstractCard __instance)
    {
      if (Settings.language == Settings.GameLanguage.ZHS && __instance instanceof Catalyst && isInRaid())
      {
        __instance.rawDescription = catalystDescription(__instance.upgraded);
      }
    }
  }

  @SpirePatch(clz = NeowsLament.class, method = "getUpdatedDescription", requiredModId = "spireTogether")
  public static class RaidNeowsLamentDescriptionPatch
  {
    public static String Postfix(String __result)
    {
      if (Settings.language == Settings.GameLanguage.ZHS && isInRaid())
      {
        return "战斗开始时，获得 3 点力量。";
      }
      return __result;
    }
  }

  private static String catalystDescription(boolean upgraded)
  {
    return "给予所有敌人 " + (upgraded ? 10 : 5) + " 层中毒。";
  }

  private static boolean isInRaid()
  {
    return SpireTogetherMod.isConnected
        && P2PManager.integration instanceof SteamIntegration
        && SteamManager.currentLobby != null
        && SteamManager.currentLobby.metadata != null
        && SteamManager.currentLobby.metadata.special;
  }

  private static String replaceTradeWarning(String text)
  {
    if (text == null)
    {
      return text;
    }

    String cardEnglishWarning = " NL " + ENGLISH_TRADE_WARNING;
    String cardChineseWarning = " NL " + CHINESE_TRADE_WARNING;
    boolean cardDescription = text.contains(cardEnglishWarning) || text.contains(cardChineseWarning);
    boolean hasWarning = cardDescription
        || text.contains(" " + ENGLISH_TRADE_WARNING)
        || text.contains(" " + CHINESE_TRADE_WARNING);
    if (!hasWarning)
    {
      return text;
    }

    String normalized = text
        .replace(cardEnglishWarning, "")
        .replace(cardChineseWarning, "")
        .replace(" " + ENGLISH_TRADE_WARNING, "")
        .replace(" " + CHINESE_TRADE_WARNING, "");
    return normalized + (cardDescription ? " NL " : " ") + CHINESE_TRADE_WARNING;
  }
}
