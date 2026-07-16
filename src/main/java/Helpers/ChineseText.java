package Helpers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ChineseText
{
  private static final Map<String, String> TEXT = new HashMap<>();
  private static final Map<String, String> ACCESSIBILITY_TEXT = new HashMap<>();
  private static final Map<String, String> ACCESSIBILITY_PREFIXES = new LinkedHashMap<>();

  static
  {
    put("PLAYER COUNT:", "玩家数量：");
    put("EMBARK", "出发");
    put("READY", "准备");
    put("UNREADY", "取消准备");
    put("UNLOCK", "解锁");
    put("WAITING FOR HOST", "等待房主");
    put("WAITING ON DATA", "正在等待数据");
    put("Waiting on other player...", "等待其他玩家确认...");
    put("Connecting", "正在连接");
    put("Connecting...", "正在连接...");
    put("Connection failed", "连接失败");
    put("Unreachable Server", "无法连接服务器");
    put("Waiting for server data", "正在等待服务器数据");
    put("The server is full.", "服务器已满。");
    put("Lost connection to the server.", "与服务器的连接已断开。");
    put("Disconnected from the server.", "与服务器的连接已断开。");
    put("The server has closed the game.", "服务器已关闭本局游戏。");
    put("The game has finished.", "本局游戏已结束。");
    put("Could not create a server. Please submit a log to the discord or try again.", "无法创建服务器。请提交日志到 Discord，或稍后重试。");
    put("CREATING LOBBY...", "正在创建房间...");
    put("DISABLED", "已禁用");
    put("APPLY", "应用");
    put("CLEAR", "清除");
    put("PUBLIC", "公开");
    put("YES", "是");
    put("NO", "否");
    put("CANCEL", "取消");
    put("HOST", "创建房间");
    put("NEW GAME", "新游戏");
    put("CONNECT", "连接");
    put("JOIN", "加入游戏");
    put("Disconnect", "断开连接");
    put("TRADE", "交易");
    put("<EMPTY>", "<空>");
    put("BASE GAME MODIFIERS", "本体游戏修饰");
    put("Choose a game type:", "选择游戏类型：");
    put("Do you want to continue a saved game?", "要继续已保存的游戏吗？");
    put("Enter lobby password:", "输入房间密码：");
    put("Downfall map", "Downfall 地图");
    put("PRIVATE INVITES", "仅限邀请");
    put("FRIENDS & INVITES", "好友及邀请");
    put("Event mode?", "活动模式？");
    put("SELECT", "选择");
    put("CLOSE", "关闭");
    put("CONTINUE", "继续");
    put("LOCK", "锁定");
    put("UNLOCKED", "已解锁");
    put("LOCKED", "未解锁");
    put("MASTER DECK", "牌组");
    put("HAND PILE", "手牌堆");
    put("DRAW PILE", "抽牌堆");
    put("DISCARD PILE", "弃牌堆");
    put("EXHAUST PILE", "消耗牌堆");
    put("RELICS", "遗物");
    put("BLIGHTS", "荒疫");
    put("POTIONS", "药水");
    put("Character & Skin", "角色与皮肤");
    put("Nameplates", "名牌");
    put("UI", "界面");
    put("Cursor", "光标");
    put("SET AS DEFAULT", "设为默认");
    put("Only owned", "仅显示已拥有");
    put("Ally view", "队友视图");
    put("Dead design", "死亡样式");
    put("Standard view:", "标准视图：");
    put("Ally view:", "队友视图：");
    put("Dead view:", "死亡视图：");
    put("GAME", "游戏");
    put("MULTIPLAYER", "多人");
    put("RESURRECT", "复活");
    put("MONSTER", "怪物");
    put("Potions!", "药水！");
    put("Ended turn", "回合已结束");
    put("Select cards to transfer.", "选择要转移的卡牌。");
    put("Your Together in Spire mod version is out of date. Please update to proceed playing Multiplayer.", "你的 Together in Spire 模组版本已过期。请更新后再进行多人游戏。");
    put("Unlocked heartslayer skin!", "已解锁屠心者皮肤！");
    put("The Red Vanquisher", "赤红征服者");
    put("The Green Vanquisher", "翠绿征服者");
    put("The Blue Vanquisher", "湛蓝征服者");
    put("The Purple Vanquisher", "紫罗兰征服者");
    put("Teamwork", "团队合作");
    put("Betrayal", "背叛");
    put("The Carry", "孤身带队");
    put("Newbie", "新手");
    put("Raider", "突袭者");
    put("It's over 9000!", "战力超过 9000！");
    put("Sea of Ghosts", "幽灵之海");
    put("Kill The Heart on HELL mode with The Ironclad", "使用铁甲战士在地狱模式击败腐化之心");
    put("Kill The Heart on HELL mode with The Silent", "使用静默猎手在地狱模式击败腐化之心");
    put("Kill The Heart on HELL mode with The Defect", "使用故障机器人在地狱模式击败腐化之心");
    put("Kill The Heart on HELL mode with The Watcher", "使用观者在地狱模式击败腐化之心");
    put("Kill The Heart while having at least 1 of each character in the group", "队伍中四名基础角色各至少有一人时击败腐化之心");
    put("Be killed by an ally", "被队友击杀");
    put("Defeat a Boss while all allies are dead", "所有队友死亡时击败首领");
    put("Defeat The Heart without dealing any damage the entire game", "整局游戏未造成伤害并击败腐化之心");
    put("Participate in a Raid", "参与一次突袭");
    put("Apply 9000 or more poison on a monster", "对一名怪物施加 9000 层或更多中毒");
    put("Die 666 times", "死亡 666 次");

    put("basic", "基础");
    put("shiny", "闪亮");
    put("silentsdagger", "寂静匕首");
    put("reapersythe", "死神镰刀");
    put("feather", "羽毛");
    put("boomerang", "回旋镖");
    put("crown", "王冠");
    put("modern", "现代");
    put("the_ironclad", "铁甲战士");
    put("the_silent", "静默猎手");
    put("the_defect", "故障机器人");
    put("the_watcher", "观者");
    put("discord", "Discord");
    put("reward_ironclad", "铁甲战士奖励名牌");
    put("reward_silent", "静默猎手奖励名牌");
    put("reward_defect", "故障机器人奖励名牌");
    put("reward_watcher", "观者奖励名牌");
    put("reward_automaton", "自动机奖励名牌");
    put("reward_champ", "勇士奖励名牌");
    put("reward_gremlins", "地精奖励名牌");
    put("reward_guardian", "守护者奖励名牌");
    put("reward_hermit", "隐士奖励名牌");
    put("reward_hexaghost", "六边形奖励名牌");
    put("reward_slimeboss", "史莱姆老大奖励名牌");
    put("reward_snecko", "蛇怪奖励名牌");
    put("reward_collector", "收藏家奖励名牌");
    put("reward_theunchained", "无拘者奖励名牌");
    put("reward_marisa", "魔理沙奖励名牌");
    put("reward_theabyssal", "深渊奖励名牌");
    put("reward_skulmod", "小骨奖励名牌");
    put("reward_packmaster", "卡包大师奖励名牌");
    put("reward_duelist", "决斗者奖励名牌");
    put("flamesofhell", "地狱之焰");
    put("chad", "查德");
    put("streamer", "主播");
    put("heartslayer", "屠心者");
    put("bubbles", "泡泡");
    put("the_spire", "尖塔");
    put("wrapping_paper", "包装纸");
    put("starry", "繁星");
    put("notebook", "笔记本");
    put("painting", "画作");
    put("developer", "开发者");
    put("Ironclad", "铁甲战士");
    put("ironclad", "铁甲战士");
    put("The Silent", "静默猎手");
    put("Silent", "静默猎手");
    put("Defect", "故障机器人");
    put("defect", "故障机器人");
    put("Watcher", "观者");
    put("watcher", "观者");
    put("Automaton", "自动机");
    put("Champ", "勇士");
    put("Gremlins", "地精");
    put("Guardian", "守护者");
    put("Hermit", "隐士");
    put("Hexaghost", "六边形");
    put("Slimeboss", "史莱姆老大");
    put("Snecko", "蛇怪");
    put("The Collector", "收藏家");
    put("The Unchained", "无拘者");
    put("Marisa", "魔理沙");
    put("The Abyssal", "深渊");
    put("Little Bone", "小骨");
    put("The Packmaster", "卡包大师");
    put("The Duelist", "决斗者");
    put("Ghost", "幽灵");
    put("Streamer", "主播");
    put("Heartslayer", "屠心者");
    put("Cosmos", "宇宙");
    put("Stone", "石像");
    put("Glitch", "故障");
    put("Rainbow", "彩虹");
    put("Nightshade", "夜影");
    put("Cruisin'", "巡航");
    put("Nerf", "泡沫弹");
    put("Sunshine", "阳光");
    put("Ironchamp", "钢铁勇士");
    put("Starshapen", "星铸");
    put("Party", "派对");
    put("Sand Tomb", "沙之陵墓");
    put("Crimson Roots", "猩红根须");
    put("Grave Roots", "墓地根须");
    put("Guardian of the Forest", "森林守护者");
    put("Pixel", "像素");
    put("Poolside", "泳池边");
    put("Blue Aviator", "蓝色飞行员");
    put("Divine", "神圣");
    put("Corrupted", "腐化");
    put("Chibi", "Q版");
    put("Winter 2021", "2021 冬季");
    put("Roman", "罗马");
    put("Blue Screen of Death", "蓝屏死机");
    put("Executioner", "刽子手");
    put("Plague Doctor", "瘟疫医生");
    put("Ancient", "远古");
    put("Frostbite", "冻伤");
    put("Reaper", "收割者");
    put("Snowman", "雪人");
    put("Embark", "出发");
    put("Ready", "准备");
    put("Unready", "取消准备");
    put("Unlock", "解锁");
    put("cancel", "取消");
    put("Gold", "金色");
    put("Marley's Ghost", "马利的幽灵");
    put("Redbeard", "红胡子");
    put("Summoner", "召唤师");
    put("Witch", "女巫");
    put("Slimebound", "史莱姆老大");
    put("The Automaton", "自动机");
    put("The Champ", "勇士");
    put("The Gremlins", "地精团伙");
    put("The Guardian", "守护者");
    put("The Hermit", "隐士");
    put("the Duelist", "决斗者");
    put("the Packmaster", "卡包大师");
    put("R:", "红：");
    put("G:", "绿：");
    put("B:", "蓝：");
    put("all items", "全部物品");
    put("only owned items", "仅显示已拥有的物品");
    put("ally design", "队友样式");
    put("dead design", "死亡样式");
    put("Connecting. Please wait.", "正在连接，请稍候。");
    put("Choose a lobby to join ", "请选择要加入的房间");
    put("Incorrect password", "密码错误");
    put("The host you're connecting to has different mod versions or mod id's. Would you like to proceed?", "房主使用的模组版本或模组 ID 与你不同。是否仍要继续？");
    put("Return to Main Menu", "返回主菜单");
    put("RETURN TO MAIN MENU", "返回主菜单");
    put("Return to the Main Menu", "返回主菜单");
    put("Are you sure you want to return to the main menu?", "确定要返回主菜单吗？");
    put("Exiting the game will close it for all connected players as well. Do you want to continue?", "退出游戏也会关闭所有已连接玩家的游戏。确定要继续吗？");
    put("The game can be continued at any point by reconnecting.", "之后随时可以通过重新连接继续游戏。");
    put("This item is unlocked by completing the Sea of Ghosts achievement", "完成“幽灵之海”成就后解锁此物品。");
    put("This item is a reward for the 100k Player Celebration", "此物品是十万玩家庆典奖励。");
    put("This item is unlocked by being very lucky", "足够幸运时解锁此物品。");
    put("This item is not unlockable.", "此物品无法解锁。");
    put("This item is unlocked through an achievement.", "达成相应成就后解锁此物品。");
    put("This item was a reward for playing during Winter 2021", "此物品是参与 2021 年冬季活动的奖励。");
    put("This skin is a reward for participating in a November, December, or January 24/25 raid.", "参与 2024/25 年 11 月、12 月或 1 月突袭后获得此皮肤。");
    put("This skin is a reward for participating in May, June, or July 2023 raids", "参与 2023 年 5 月、6 月或 7 月突袭后获得此皮肤。");
    put("This skin is a reward for participating in the August or October 2024 raids", "参与 2024 年 8 月或 10 月突袭后获得此皮肤。");
    put("This skin is a reward for participating in the August, September, or October 2023 raid", "参与 2023 年 8 月、9 月或 10 月突袭后获得此皮肤。");
    put("This skin is a reward for participating in the February, March, or April 2024 raid", "参与 2024 年 2 月、3 月或 4 月突袭后获得此皮肤。");
    put("This skin is a reward for participating in the May, June, or July 2024 raid", "参与 2024 年 5 月、6 月或 7 月突袭后获得此皮肤。");

    addAccessibilityTranslations();
  }

  private ChineseText()
  {
  }

  private static void put(String english, String chinese)
  {
    TEXT.put(english, chinese);
  }

  private static void addAccessibilityTranslations()
  {
    accessibility("Activate selected delete option", "执行所选删除操作");
    accessibility("CANCEL TRADE", "取消交易");
    accessibility("Change blue tone value arrows", "调整蓝色分量");
    accessibility("Change character arrows", "切换角色");
    accessibility("Change character skin", "切换角色皮肤");
    accessibility("Change green tone value arrows", "调整绿色分量");
    accessibility("Change player colour", "更改玩家颜色");
    accessibility("Change red tone value arrows", "调整红色分量");
    accessibility("change settings screen arrows", "切换设置页面");
    accessibility("Change starting blights.", "更改初始荒疫");
    accessibility("Change starting potions.", "更改初始药水");
    accessibility("Change starting relics.", "更改初始遗物");
    accessibility("CHARACTER and SKIN CUSTOMIZATION", "角色与皮肤定制");
    accessibility("Code redeem screen", "兑换码界面");
    accessibility("Colour Picker Screen Button", "颜色选择界面按钮");
    accessibility("CREATE LOBBY", "创建房间");
    accessibility("CURSOR CUSTOMIZATION", "光标定制");
    accessibility("Custom settings screen button", "自定义设置按钮");
    accessibility("Customize screen button", "外观定制按钮");
    accessibility("Delete all saves older than 7 days option", "删除所有早于七天的存档选项");
    accessibility("Delete all saves setting option", "删除全部存档选项");
    accessibility("Delete all saves with different mods setting option", "删除模组列表不同的存档选项");
    accessibility("Delete all saves with old mod versions setting option", "删除模组版本过旧的存档选项");
    accessibility("Enter lobby password screen", "输入房间密码界面");
    accessibility("Filter lobbies with different mod lists", "筛选模组列表不同的房间");
    accessibility("Filter lobbies without a password button", "筛选无密码房间按钮");
    accessibility("Game Settings customizer screen", "游戏设置界面");
    accessibility("Getting steam lobbies", "正在获取 Steam 房间");
    accessibility("HELL preset button", "地狱模式预设按钮");
    accessibility("HOST GAME", "创建游戏");
    accessibility("Host Presets screen", "房主预设界面");
    accessibility("Host screen", "创建房间界面");
    accessibility("JOIN GAME", "加入游戏");
    accessibility("Join screen", "加入游戏界面");
    accessibility("Nameplate customization", "名牌定制");
    accessibility("NEXT PAGE", "下一页");
    accessibility("Open base game modifiers screen", "打开本体游戏修饰界面");
    accessibility("Paste code from clipboard", "从剪贴板粘贴兑换码");
    accessibility("PASTE FROM CLIPBOARD", "从剪贴板粘贴");
    accessibility("Potion view screen", "药水查看界面");
    accessibility("PREVIOUS PAGE", "上一页");
    accessibility("Recommended preset button", "推荐模式预设按钮");
    accessibility("Redeem code", "兑换代码");
    accessibility("Redeem Code button", "兑换码按钮");
    accessibility("Relic view screen", "遗物查看界面");
    accessibility("Save and return", "保存并返回");
    accessibility("Save cleaner button", "存档清理按钮");
    accessibility("Save connecting settings for future", "保存连接设置");
    accessibility("SAVE HOSTING PORT FOR FUTURE", "保存开服端口");
    accessibility("Save Picker Screen", "存档选择界面");
    accessibility("Save player preset for future games button", "保存玩家预设按钮");
    accessibility("Save Purger Screen", "存档清理界面");
    accessibility("Save settings for future games", "保存游戏设置");
    accessibility("Saved connecting settings", "连接设置已保存");
    accessibility("SAVED HOSTING PORT", "开服端口已保存");
    accessibility("Saved player preset", "玩家预设已保存");
    accessibility("SELECT CARD", "选择卡牌");
    accessibility("SELECT POTION", "选择药水");
    accessibility("SELECT RELIC", "选择遗物");
    accessibility("Selected delete all saves older than 7 days setting", "已选择删除所有早于七天的存档");
    accessibility("Selected delete all saves setting", "已选择删除全部存档");
    accessibility("Selected delete all saves with different mods setting", "已选择删除模组列表不同的存档");
    accessibility("Selected delete all saves with old mod versions setting", "已选择删除模组版本过旧的存档");
    accessibility("Selected HELL preset", "已选择地狱模式预设");
    accessibility("Selected recommended preset", "已选择推荐模式预设");
    accessibility("UI CUSTOMIZATION", "界面主题定制");
    accessibility("DESELECTED", "已取消选择");
    accessibility("Edit code", "编辑兑换码");
    accessibility("Enter code", "输入兑换码");
    accessibility("Enter connect port", "输入连接端口");
    accessibility("Enter host port", "输入开服端口");
    accessibility("Enter join IP", "输入加入游戏的 IP");
    accessibility("Enter lobby name", "输入房间名称");
    accessibility("Enter lobby password", "输入房间密码");
    accessibility("Enter player name filter", "输入玩家名称筛选条件");
    accessibility("Enter search string", "输入搜索内容");
    accessibility("Filtering lobbies with different mod lists", "正在筛选模组列表不同的房间");
    accessibility("Filtering lobbies without a password", "正在筛选无密码房间");
    accessibility("Hide", "隐藏");
    accessibility("Input game seed", "输入游戏种子");
    accessibility("Not filtering lobbies with different mod lists", "不筛选模组列表不同的房间");
    accessibility("Not filtering lobbies without a password", "不筛选无密码房间");
    accessibility("SELECT", "选择");
    accessibility("SELECTED", "已选择");
    accessibility("UNSELECT", "取消选择");

    accessibilityPrefix("Change ascension level arrows. Current value: ", "调整进阶等级，当前值：");
    accessibilityPrefix("Change card trading maximum arrows. Current value: ", "调整每次交易卡牌上限，当前值：");
    accessibilityPrefix("Change friendly fire type. Current value: ", "更改友军伤害类型，当前值：");
    accessibilityPrefix("Change game start type. Current value: ", "更改游戏开始方式，当前值：");
    accessibilityPrefix("Change gold trading maximum arrows. Current value: ", "调整每次交易金币上限，当前值：");
    accessibilityPrefix("Change monster base damage multiplier arrows. Current value: ", "调整怪物基础伤害倍率，当前值：");
    accessibilityPrefix("Change monster base hp multiplier arrows. Current value: ", "调整怪物基础生命倍率，当前值：");
    accessibilityPrefix("Change monster scaled damage per ally multiplier arrows. Current value: ", "调整每名队友增加的怪物伤害倍率，当前值：");
    accessibilityPrefix("Change monster scaled hp per ally multiplier arrows. Current value: ", "调整每名队友增加的怪物生命倍率，当前值：");
    accessibilityPrefix("Change player HP on resurrected. Current value: ", "调整复活后的生命值，当前值：");
    accessibilityPrefix("Change potion trading maximum arrows. Current value: ", "调整每次交易药水上限，当前值：");
    accessibilityPrefix("Change relic trading maximum arrows. Current value: ", "调整每次交易遗物上限，当前值：");
    accessibilityPrefix("Change turn time limit. Current value: ", "调整回合时间限制，当前值：");
    accessibilityPrefix("Changed allow cheats to ", "允许作弊已改为：");
    accessibilityPrefix("Changed allowing reward collecting when dead to ", "死亡后允许领取奖励已改为：");
    accessibilityPrefix("Changed game seed value to ", "游戏种子已改为：");
    accessibilityPrefix("Changed is player HP on resurrected percent to ", "复活生命值按百分比计算已改为：");
    accessibilityPrefix("CHANGED LOBBY TYPE TO: ", "房间类型已改为：");
    accessibilityPrefix("Changed resurrect after boss kill to ", "击败首领后复活已改为：");
    accessibilityPrefix("changed settings screen to ", "设置页面已切换至：");
    accessibilityPrefix("Changed trading item blacklist to ", "交易物品黑名单已改为：");
    accessibilityPrefix("Change current set seed with value of ", "编辑当前游戏种子：");
    accessibilityPrefix("CURRENT LOBBY TYPE: ", "当前房间类型：");
    accessibilityPrefix("CURRENT PAGE: ", "当前页：");
    accessibilityPrefix("LOAD SAVE of ID ", "载入存档，编号：");
    accessibilityPrefix("Nameplate - ", "名牌：");
    accessibilityPrefix("Pasted code: ", "已粘贴兑换码：");
    accessibilityPrefix("Pasted from clipboard. Current IP: ", "已从剪贴板粘贴，当前 IP：");
    accessibilityPrefix("Edit code ", "编辑兑换码：");
    accessibilityPrefix("Edit current connect port of ", "编辑当前连接端口：");
    accessibilityPrefix("Edit current join IP of ", "编辑当前加入游戏的 IP：");
    accessibilityPrefix("Edit current lobby name of ", "编辑当前房间名称：");
    accessibilityPrefix("Edit current lobby password of ", "编辑当前房间密码：");
    accessibilityPrefix("Edit current port of ", "编辑当前开服端口：");
    accessibilityPrefix("Edit current search of ", "编辑当前搜索内容：");
    accessibilityPrefix("SELECT AND SAVE ", "选择并保存：");
    accessibilityPrefix("Selected player colour: ", "已选玩家颜色：");
    accessibilityPrefix("Set ascension level to ", "进阶等级设为：");
    accessibilityPrefix("Set blue tone value to ", "蓝色分量设为：");
    accessibilityPrefix("Set card trading maximum to ", "每次交易卡牌上限设为：");
    accessibilityPrefix("Set friendly fire type to ", "友军伤害类型设为：");
    accessibilityPrefix("Set game start type to ", "游戏开始方式设为：");
    accessibilityPrefix("Set gold trading maximum to ", "每次交易金币上限设为：");
    accessibilityPrefix("Set green tone value to ", "绿色分量设为：");
    accessibilityPrefix("Set monster base damage multiplier to ", "怪物基础伤害倍率设为：");
    accessibilityPrefix("Set monster base hp multiplier to ", "怪物基础生命倍率设为：");
    accessibilityPrefix("Set monster scaled damage per ally multiplier to ", "每名队友增加的怪物伤害倍率设为：");
    accessibilityPrefix("Set monster scaled hp per ally multiplier to ", "每名队友增加的怪物生命倍率设为：");
    accessibilityPrefix("Set player HP on resurrected to ", "复活后的生命值设为：");
    accessibilityPrefix("Set potion trading maximum to ", "每次交易药水上限设为：");
    accessibilityPrefix("Set red tone value to ", "红色分量设为：");
    accessibilityPrefix("Set relic trading maximum to ", "每次交易遗物上限设为：");
    accessibilityPrefix("Set turn time limit to to ", "回合时间限制设为：");
    accessibilityPrefix("Show ", "显示：");
    accessibilityPrefix("Hide ", "隐藏：");
    accessibilityPrefix("SELECT ", "选择：");
    accessibilityPrefix("SELECTED ", "已选择：");
    accessibilityPrefix("UNSELECT ", "取消选择：");
    accessibilityPrefix("DESELECTED ", "已取消选择：");
    accessibilityPrefix("Toggle allow cheats. Current value: ", "切换允许作弊，当前值：");
    accessibilityPrefix("Toggle allowing reward collecting when dead. Current value: ", "切换死亡后允许领取奖励，当前值：");
    accessibilityPrefix("Toggle is player HP on resurrected percent. Current value: ", "切换复活生命值按百分比计算，当前值：");
    accessibilityPrefix("Toggle resurrect after boss kill. Current value: ", "切换击败首领后复活，当前值：");
    accessibilityPrefix("Toggle trading item blacklist. Current value: ", "切换交易物品黑名单，当前值：");
  }

  private static void accessibility(String english, String chinese)
  {
    ACCESSIBILITY_TEXT.put(english, chinese);
  }

  private static void accessibilityPrefix(String english, String chinese)
  {
    ACCESSIBILITY_PREFIXES.put(english, chinese);
  }

  public static String translate(String text)
  {
    if (text == null || text.isEmpty())
    {
      return text;
    }

    String translated = TEXT.get(text);
    if (translated != null)
    {
      return translated;
    }
    if (text.startsWith("Select up to ") && text.endsWith(" cards to trade with."))
    {
      String count = text.substring("Select up to ".length(), text.length() - " cards to trade with.".length());
      return "选择至多 " + count + " 张要交易的卡牌。";
    }
    if (text.startsWith("Credits: "))
    {
      return "制作人员：" + text.substring("Credits: ".length());
    }
    if (text.startsWith("This nameplate is unlocked by beating RECOMMENDED with "))
    {
      String character = text.substring("This nameplate is unlocked by beating RECOMMENDED with ".length());
      return "在推荐模式使用" + translate(character) + "通关后解锁此名牌。";
    }
    if (text.equals("This nameplate is unlocked by joining the Discord"))
    {
      return "加入 Discord 后解锁此名牌。";
    }
    if (text.equals("This nameplate is unlocked by beating HELL with all 4 base characters."))
    {
      return "使用四位基础角色均在地狱模式通关后解锁此名牌。";
    }
    if (text.equals("This nameplate was a reward for being a Patreon supporter before v3"))
    {
      return "此名牌奖励给 v3 前的 Patreon 支持者。";
    }
    if (text.equals("This nameplate was a reward for playing the mod before v3"))
    {
      return "此名牌奖励给 v3 前游玩过本模组的玩家。";
    }
    if (text.equals("This nameplate is unlocked by participating in November, December, and January 2023/24 Raids."))
    {
      return "参与 2023/24 年 11 月、12 月和 1 月突袭后解锁此名牌。";
    }
    if (text.equals("This item is a reward for participating in the August, September, and October 2023 raids."))
    {
      return "参与 2023 年 8 月、9 月和 10 月突袭后获得此物品。";
    }
    if (text.equals("This item is a reward for participating in the February, March, and April 2024 raids."))
    {
      return "参与 2024 年 2 月、3 月和 4 月突袭后获得此物品。";
    }
    if (text.equals("This item is unlocked by playing a game with the TiS - Official Booster Pack."))
    {
      return "安装 TiS 官方增强包并完成一局游戏后解锁此物品。";
    }
    if (text.equals("Unlocked!"))
    {
      return "已解锁！";
    }
    if (text.equals("This item is unlocked through Patreon"))
    {
      return "此物品通过 Patreon 解锁。";
    }
    if (text.equals("This item is unlocked by streaming/recording the game"))
    {
      return "此物品通过直播或录制游戏解锁。";
    }
    if (text.equals("This item is unlocked through a promotional method"))
    {
      return "此物品通过推广活动解锁。";
    }
    if (text.equals("This item is unlocked through an achievement"))
    {
      return "此物品通过成就解锁。";
    }
    if (text.startsWith("This skin is a reward for beating HELL mode with "))
    {
      String character = text.substring("This skin is a reward for beating HELL mode with ".length());
      return "使用" + translate(character) + "在地狱模式通关后获得此皮肤。";
    }
    return text;
  }

  public static String translateAccessibility(String text)
  {
    String translated = translate(text);
    if (!translated.equals(text))
    {
      return translated;
    }
    translated = ACCESSIBILITY_TEXT.get(text);
    if (translated != null)
    {
      return translated;
    }
    if (text.startsWith("LOAD SAVE of ID "))
    {
      String details = text.substring("LOAD SAVE of ID ".length());
      int dateSeparator = details.indexOf(" that was started on ");
      int characterSeparator = details.indexOf(" with the character ");
      if (dateSeparator >= 0 && characterSeparator > dateSeparator)
      {
        String id = details.substring(0, dateSeparator);
        String date = details.substring(dateSeparator + " that was started on ".length(), characterSeparator);
        String character = details.substring(characterSeparator + " with the character ".length());
        return "载入存档，编号：" + id + "，开始时间：" + date + "，角色：" + translate(character.toLowerCase());
      }
    }
    for (Map.Entry<String, String> entry : ACCESSIBILITY_PREFIXES.entrySet())
    {
      if (text.startsWith(entry.getKey()))
      {
        String value = text.substring(entry.getKey().length()).trim();
        return entry.getValue() + translateAccessibilityValue(value);
      }
    }
    if (text.equals("Previous"))
    {
      return "上一个";
    }
    if (text.equals("Next"))
    {
      return "下一个";
    }
    if (text.equals("Previous skin"))
    {
      return "上一个皮肤";
    }
    if (text.equals("Next skin"))
    {
      return "下一个皮肤";
    }
    if (text.equals("No available skins"))
    {
      return "没有可用皮肤";
    }
    if (text.equals("Change display colour"))
    {
      return "更改显示颜色";
    }
    if (text.equals("Customization menu"))
    {
      return "外观定制菜单";
    }
    if (text.equals("Character customization screen"))
    {
      return "角色外观定制界面";
    }
    if (text.equals("Nameplate customization screen overview"))
    {
      return "名牌外观总览界面";
    }
    if (text.equals("Nameplate customization screen"))
    {
      return "名牌外观定制界面";
    }
    if (text.equals("Cursor customization screen"))
    {
      return "光标外观定制界面";
    }
    if (text.equals("ScreenUI customization screen"))
    {
      return "界面主题定制界面";
    }
    if (text.equals("Player Details Screen"))
    {
      return "玩家详情界面";
    }
    if (text.equals("Potion select screen"))
    {
      return "药水选择界面";
    }
    if (text.equals("Relic select screen"))
    {
      return "遗物选择界面";
    }
    if (text.equals("Blight select screen."))
    {
      return "荒疫选择界面。";
    }
    if (text.startsWith("Selected character: "))
    {
      return "已选角色：" + translate(text.substring("Selected character: ".length()));
    }
    if (text.startsWith("Selected character skin: "))
    {
      return "已选角色皮肤：" + translate(text.substring("Selected character skin: ".length()));
    }
    if (text.startsWith("Chosen skin is "))
    {
      return "已选皮肤：" + translate(text.substring("Chosen skin is ".length()));
    }
    if (text.startsWith("Selected display colour: "))
    {
      return "已选显示颜色：" + text.substring("Selected display colour: ".length());
    }
    if (text.startsWith("Entered "))
    {
      return "已输入：" + text.substring("Entered ".length());
    }
    return text;
  }

  private static String translateAccessibilityValue(String value)
  {
    if (value.isEmpty())
    {
      return value;
    }
    if (value.equalsIgnoreCase("true"))
    {
      return "是";
    }
    if (value.equalsIgnoreCase("false"))
    {
      return "否";
    }
    value = value.replace(". Current connect port: ", "，当前连接端口：");
    if (value.endsWith(" percent"))
    {
      return value.substring(0, value.length() - " percent".length()) + "%";
    }
    String translated = translate(value.replace('_', ' '));
    return translated.equals(value.replace('_', ' ')) ? value : translated;
  }
}
