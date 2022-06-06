# Custom Enchantments 3 API
> By: JayMar921
> Resource Link: [Custom Enchantments 3](https://www.spigotmc.org/resources/102275/)
# About
> This plugin is basically an advanced version of the previous custom enchantments 1 and 2 developed by JayMar921. The plugin is so called an advanced plugin because it has a built in Skilling System, Player Classifications, (CE Currencies/Quests [coming soon]) and an RPG feels in the game.​

# Skill System
> Skill System is new to Custom Enchants 3, it is used for players to upgrade their skills and focus on what attribute they want to focus. There are three (3) main attributes in the skill system which are STRENGTH, AGILITY, and INTELLIGENCE. The 3 main attributes also has three passive skills and players can only upgrade their passive skills depending on what classification they choose.

> Note that the player can only unlock the class when they reached level 10 and above

# Classification
> Custom Enchantments now adopt RPG feels in-game, it now has classification players for them to focus on specific skill and enchantments(active skill). There are three (3) classification as of now and these are WARRIOR, ARCHER, and WIZARD. For WARRIOR class players, they can only use sword enchantments. For ARCHER class players, they can only use BOW enchantments. For WIZARD class players, they can only use magic enchantments, all players can use fireball. ARMOR/SHIELD/TRIDENT/TOOL enchantments are global.
Enchantments (Active Skills)
Enchantments and Active Skills can be called interchangeably in the plugin. There are some enchantments that needs a certain class to be used by the players such as the SWORD, BOW and MAGIC enchantments. Magic Damage is 3 times the physical damage (vanilla damage).

#### POM.XML
> Maven Repository
```gradle
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
> Maven dependency
```gradle
<dependency>
  <groupId>com.github.jaymar921</groupId>
  <artifactId>Custom_Enchant_3_API</artifactId>
  <version>835fdd00ca</version>
</dependency>
```
[![](https://jitpack.io/v/jaymar921/Custom_Enchant_3_API.svg)](https://jitpack.io/#jaymar921/Custom_Enchant_3_API)
# How to use the API
> Creating a class that checks if CustomEnchantments3 Plugin exist
```java
// check if custom enchants 3 exist in plugins folder
// it would be better if you have a separate class for this
// you might as well need to load this inside your onEnable method from Plugin Main
// example: CheckCEplugin.pluginExist();

public class CheckCEPlugin{

  public static boolean exist = false;
  
  public static boolean pluginExist(){
    // this is just a simple check method, you can do your own
    exist =  Bukkit.getServer().getPluginManager().getPlugin("CustomEnchantments3") != null;
    return exist;
    
  }
}
```
> Using PlayerAdapter to get the CE_Player data
```java
// lets assume that you want to get the Player data from the CE3 plugin
// everytime an event happens
@EventHandler
private void sampleEvent(PlayerJoinEvent event){
  
  // check if CE3 Plugin Exist
  if(CheckCEPlugin.exist){
    
    // this is how to use the PlayerAdapter class
    PlayerAdapter player = new PlayerAdapter(event.getPlayer());

    // now you can get the information about the player
    event.setJoinMessage("Player "+player.getName()+" is currently level "+player.getSkills().LEVEL);

    // you can also add mana to the player
    player.addMana(20.0);
    
  }
}
```
