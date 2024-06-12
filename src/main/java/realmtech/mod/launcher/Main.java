package realmtech.mod.launcher;

import ch.realmtech.core.RealmTech;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import realmtech.mod.ModDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        //config.useVsync(false);
        config.setForegroundFPS(60);
        config.setWindowedMode(RealmTech.SCREEN_WIDTH, RealmTech.SCREEN_HEIGHT);
        config.setWindowIcon(Files.FileType.Internal, "logo/logo-RealmTech-icon.png");
        config.setTitle("RealmTech " + RealmTech.REALMTECH_VERSION);
        ModDemo mod = new ModDemo();
        new Lwjgl3Application(new RealmTech(mod, args), config);
    }
}