package hszy.ydy.golden_apple_extra;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MyListener implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event)// 监听消耗物品事件
    {
        if(event.isCancelled())return;//防止取消使用骗效果
        //加buff
        if(event.getItem().getType() == Material.GOLDEN_APPLE)//若为金苹果
        {
            PotionEffect p =new PotionEffect(PotionEffectType.REGENERATION,Golden_apple_Extra.t,Golden_apple_Extra.lvl-1,false);
            int i=1;
            while (!event.getPlayer().addPotionEffect(p))//如果不行多试几次
            {
                i++;
                if (i >= 5) break;
            }
        }
    }
}
