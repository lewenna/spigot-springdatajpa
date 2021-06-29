package io.lewenna.paperandjpa;

import io.lewenna.paperandjpa.entity.Player;
import io.lewenna.paperandjpa.service.PlayerService;
import org.bukkit.plugin.java.JavaPlugin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application extends JavaPlugin {
    private static Application instance;
    private static AnnotationConfigApplicationContext applicationContext;

    @Override
    public void onEnable(){
        instance = this;
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());

        applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.scan("io.lewenna.paperandjpa");
        applicationContext.refresh();

        //test
        addExamplePlayer();
    }

    //test
    public void addExamplePlayer(){
        Player player = new Player();
        player.setFirstName("burak türker");
        PlayerService playerService = (PlayerService) instance.getApplicationContext().getBean("playerService");
        playerService.addPlayer(player);
    }

    @Override
    public void onDisable(){
        applicationContext.close();
    }

    @Override
    public void onLoad(){
        super.onLoad();
    }

    public static Application getInstance() {
        return instance;
    }

    public AnnotationConfigApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
