package Patches;

import Helpers.ChineseText;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.Settings;
import dLib.util.Reflection;
import spireTogether.screens.Screen;
import spireTogether.screens.customization.AbstractCustomizationDetailsScreen;
import spireTogether.screens.customization.cursor.CursorCustomizationScreenOverview;
import spireTogether.screens.customization.nameplates.NameplateCustomizationScreenOverview;
import spireTogether.screens.lobby.PFConnectingScreen;
import spireTogether.ui.UIElementManager;
import spireTogether.ui.elements.UIElement;
import spireTogether.ui.elements.mixed.BoxedLabel;
import spireTogether.ui.elements.settings.ButtonUISetting;
import spireTogether.ui.elements.settings.EnumUISetting;
import spireTogether.ui.elements.settings.InputfieldUISetting;
import spireTogether.ui.elements.settings.IntegerArrowUISetting;
import spireTogether.ui.elements.settings.ToggleUISetting;
import spireTogether.ui.elements.useable.Label;
import spireTogether.ui.fonts.FontManager;
import spireTogether.util.SpireFont;

public class ChineseDisplayPatches
{
  @SpirePatch(clz = Screen.class, method = "update", requiredModId = "spireTogether")
  public static class ScreenUpdatePatch
  {
    public static void Postfix(Screen __instance)
    {
      if (Settings.language != Settings.GameLanguage.ZHS)
      {
        return;
      }

      translateManager(__instance.backLayer);
      translateManager(__instance.frontLayer);
      for (Screen.ElementGroup group : __instance.iterables)
      {
        translateElement(group.left);
        translateElement(group.middle);
        translateElement(group.right);
        for (UIElement element : group.other)
        {
          translateElement(element);
        }
      }

      if (__instance instanceof AbstractCustomizationDetailsScreen)
      {
        AbstractCustomizationDetailsScreen screen = (AbstractCustomizationDetailsScreen) __instance;
        translateLabel(screen.itemName);
        translateLabel(screen.unlockMessage);
        translateLabel(screen.creditsBox);
      }
      if (__instance instanceof CursorCustomizationScreenOverview)
      {
        CursorCustomizationScreenOverview screen = (CursorCustomizationScreenOverview) __instance;
        translateLabel(screen.onlyOwnedLabel);
        translateLabel(screen.allyDesignLabel);
      }
      if (__instance instanceof NameplateCustomizationScreenOverview)
      {
        NameplateCustomizationScreenOverview screen = (NameplateCustomizationScreenOverview) __instance;
        translateLabel(screen.onlyOwnedLabel);
        translateLabel(screen.deadVisualsLabel);
      }
      if (__instance instanceof PFConnectingScreen)
      {
        translateManager(((PFConnectingScreen) __instance).extraElements);
      }
    }
  }

  private static void translateManager(UIElementManager manager)
  {
    for (UIElement element : manager.elements)
    {
      translateElement(element);
    }
  }

  private static void translateElement(UIElement element)
  {
    if (element == null)
    {
      return;
    }
    if (element instanceof Label)
    {
      translateLabel((Label) element);
    }
    if (element instanceof ButtonUISetting)
    {
      translateLabel(((ButtonUISetting) element).label);
      translateLabel((BoxedLabel) Reflection.getFieldValue("buttonLabel", element));
    }
    else if (element instanceof IntegerArrowUISetting)
    {
      IntegerArrowUISetting setting = (IntegerArrowUISetting) element;
      translateLabel(setting.label);
      translateLabel(setting.valueText);
    }
    else if (element instanceof ToggleUISetting)
    {
      translateLabel(((ToggleUISetting) element).label);
    }
    else if (element instanceof EnumUISetting)
    {
      EnumUISetting setting = (EnumUISetting) element;
      translateLabel(setting.label);
      translateLabel(setting.valueText);
    }
    else if (element instanceof InputfieldUISetting)
    {
      translateLabel(((InputfieldUISetting) element).label);
    }
  }

  private static void translateLabel(Label label)
  {
    if (label == null)
    {
      return;
    }
    String translated = ChineseText.translate(label.text);
    if (translated.equals(label.text))
    {
      return;
    }
    if (label instanceof BoxedLabel)
    {
      ((BoxedLabel) label).SetText(translated);
    }
    else
    {
      label.text = translated;
      label.font = new SpireFont(FontManager.nonASCIIFont);
    }
  }
}
