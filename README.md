# Custom Enchantments 3 API
> By: JayMar921
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
  <version>2538730740</version>
</dependency>
```
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
