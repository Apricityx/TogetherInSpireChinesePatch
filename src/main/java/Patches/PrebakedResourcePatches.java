package Patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.helpers.FontHelper;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.badlogic.gdx.Gdx;
import spireTogether.screens.lobby.PFConnectingScreen;
import spireTogether.screens.misc.HellModeVictoryScreen;
import spireTogether.screens.misc.PatchNotesScreen;
import spireTogether.screens.misc.UpdateAvailableScreen;
import spireTogether.ui.elements.presets.MPSavedGameSlot;
import spireTogether.util.UIElements;

import java.lang.reflect.Field;

public class PrebakedResourcePatches
{
  private static final String ASSET_ROOT = "images/togetherinspirezhs/";
  private static boolean mismatchAskLoaded;
  private static boolean mismatchDeclineLoaded;
  private static boolean modVersionLoaded;
  private static boolean saveVersionLoaded;
  private static boolean heartslayerUnlockLoaded;

  @SpirePatch(clz = PFConnectingScreen.class, method = "AskForModMatch", requiredModId = "spireTogether")
  public static class ModMismatchAskResourcePatch
  {
    public static void Prefix()
    {
      if (isChinese() && !mismatchAskLoaded)
      {
        UIElements.TextImages.modMismatchAsk = ImageMaster.loadImage(ASSET_ROOT + "mod_mismatch_ask.png");
        mismatchAskLoaded = true;
      }
    }
  }

  @SpirePatch(clz = PFConnectingScreen.class, method = "DeclineMods", requiredModId = "spireTogether")
  public static class ModMismatchDeclineResourcePatch
  {
    public static void Prefix()
    {
      if (isChinese() && !mismatchDeclineLoaded)
      {
        UIElements.TextImages.modMismatchDecline = ImageMaster.loadImage(ASSET_ROOT + "mod_mismatch_decline.png");
        mismatchDeclineLoaded = true;
      }
    }
  }

  @SpirePatch(clz = UpdateAvailableScreen.class, method = "init", requiredModId = "spireTogether")
  public static class ModVersionResourcePatch
  {
    public static void Prefix()
    {
      if (isChinese() && !modVersionLoaded)
      {
        UIElements.TextImages.modVersionUpdater = ImageMaster.loadImage(ASSET_ROOT + "mod_version_diff.png");
        modVersionLoaded = true;
      }
    }
  }

  @SpirePatch(clz = MPSavedGameSlot.class, method = SpirePatch.CONSTRUCTOR, requiredModId = "spireTogether")
  public static class SaveVersionResourcePatch
  {
    public static void Prefix()
    {
      if (isChinese() && !saveVersionLoaded)
      {
        UIElements.errMsg_MV = ImageMaster.loadImage(ASSET_ROOT + "save_mod_version_mismatch.png");
        saveVersionLoaded = true;
      }
    }
  }

  @SpirePatch(clz = HellModeVictoryScreen.class, method = "init", requiredModId = "spireTogether")
  public static class HeartslayerUnlockResourcePatch
  {
    public static void Prefix()
    {
      if (isChinese() && !heartslayerUnlockLoaded)
      {
        UIElements.VictoryBackgrounds.HellMode.preset = ImageMaster.loadImage(ASSET_ROOT + "heartslayer_unlock.png");
        heartslayerUnlockLoaded = true;
      }
    }
  }

  @SpirePatch(clz = PatchNotesScreen.class, method = "init", requiredModId = "spireTogether")
  public static class PatchNotesChineseResourcePatch
  {
    public static void Postfix(PatchNotesScreen __instance)
    {
      if (Settings.language != Settings.GameLanguage.ZHS)
      {
        return;
      }

      String content = Gdx.files.internal("localization/zhs/patchnotes.txt").readString("UTF-8");
      try
      {
        Field text = PatchNotesScreen.class.getDeclaredField("text");
        text.setAccessible(true);
        text.set(null, content);
        Field scrollUpperBound = PatchNotesScreen.class.getDeclaredField("scrollUpperBound");
        scrollUpperBound.setAccessible(true);
        scrollUpperBound.setFloat(__instance, FontHelper.getHeight(FontHelper.tipBodyFont, content, 1.0F) + 300.0F * Settings.scale);
      }
      catch (ReflectiveOperationException exception)
      {
        throw new RuntimeException("Failed to load Chinese Together in Spire patch notes", exception);
      }
    }
  }

  private static boolean isChinese()
  {
    return Settings.language == Settings.GameLanguage.ZHS;
  }
}
