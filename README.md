Mod Installation and Jar Generation via IntelliJ

1. Go to where you stream save data is stored. 
Normally here: `C:\Users\Bradley\AppData\Roaming\songsofsyx`.
2. Open up the `mods` folder. Then create the following folder structure:

```
mods
    $modName
        $VXX <- e.g. V66
            script
                 $nameOfMod.jar
        _Info.txt
```
3. `_Info.txt` file should contain exactly the following:

```
VERSION: "1",
NAME: "firstMod",
DESC: "firstModDesc",
AUTHOR: "Bradley",
INFO: "firstModInfo",
```

4. To generate the Jar file that should appear in the `jar` folder. 
Perform the following steps:
   1. file > project structure
   2. artifacts > add > jar
   3. select 'from modules and dependencies'
   4. select radio button 'copy to the output directory and link via manifest'
   5. ensure only thing contained in the output section is your jar (not other jars like SongsOfSyx.jar).
   6. select check box 'Include in project build'
   7. apply and close.
   8. from the toolbar at the top of IntelliJ select: Build > Build Artifacts...
   9. This will generate the jar file in whatever output folder you selected.
   10. Copy/Paste this into the `script` folder as shown above.

Run Launcher via IntelliJ

1. Type `shift shift` to get up class search
2. Search for `MainLaunchLauncher`.
3. Click target button to view this class in the project view.
4. Right click, run.

