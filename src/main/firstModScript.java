package main;

import script.SCRIPT;
import settlement.room.main.util.RoomInitData;

import java.io.IOException;
import java.nio.file.Path;

public class firstModScript implements SCRIPT {

    @Override
    public CharSequence name() {
        return "firstMod - code";
    }

    @Override
    public CharSequence desc() {
        return "firstModDesc - code";
    }

    @Override
    public void initBeforeGameCreated() {
        SCRIPT.super.initBeforeGameCreated();
    }

    @Override
    public SCRIPT_INSTANCE createInstance() {
        return new firstModScriptInstance();
    }

    @Override
    public void onViewSetup() {
        SCRIPT.super.onViewSetup();
    }

    @Override
    public void createRooms(RoomInitData init) throws IOException {
        SCRIPT.super.createRooms(init);
    }

    @Override
    public boolean isSelectable() {
        return SCRIPT.super.isSelectable();
    }

    @Override
    public boolean forceInit() {
        return SCRIPT.super.forceInit();
    }

    @Override
    public void onGameLoaded(Path saveFile) {
        SCRIPT.super.onGameLoaded(saveFile);
    }

    @Override
    public void onGameSaved(Path saveFile) {
        SCRIPT.super.onGameSaved(saveFile);
    }
}
