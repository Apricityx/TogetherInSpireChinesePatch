package Patches.ScreenPatches.lobbyCP;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.Settings;
import dLib.util.Reflection;
import spireTogether.screens.lobby.settings.MonsterSettingsScreen;
import spireTogether.ui.elements.settings.IntegerArrowUISetting;

@SpirePatch(clz = spireTogether.screens.lobby.settings.MonsterSettingsScreen.class, method = "init", requiredModId = "spireTogether")
public class MonsterSettingsScreenCP
{
  public static void Postfix(MonsterSettingsScreen __instance)
  {
    if (Settings.language == Settings.GameLanguage.ZHS)
    {
      Reflection.setFieldValue("name", __instance, "怪物设置");
      String[] stringArray = new String[4];
      stringArray[0] = "怪物基础生命值倍率";
      stringArray[1] = "每名玩家增加的怪物生命值倍率";
      stringArray[2] = "怪物基础伤害倍率";
      stringArray[3] = "每名玩家增加的怪物伤害倍率";
      for (int i = 3; i >= 0; i--)
      {
        IntegerArrowUISetting temp = (IntegerArrowUISetting) __instance.iterables.get(i).other.get(0);
        temp.label.text = stringArray[i];
      }
    }
  }
}
