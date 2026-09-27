# karel-starter

This folder holds a robot. You are going to spend four weeks with it.

You do not need to know anything about Java to use this. Half the people reading this have never written a line of code, and that is fine. Karel understands four commands, and you will have written a working program inside of ten minutes.

## What is in here

| File | What it is |
|---|---|
| `MyKarel.java` | Your program. **This is the only file you edit.** |
| `lib/karel.jar` | The robot library: the code that draws the window and makes Karel move. Do not edit it, and do not move it out of `lib/`. |
| `worlds/` | The maps. Each `.w` file is a different grid for Karel to walk around in. Twenty-four of them: five the assignments use, and nineteen from Stanford to play in. |
| `run.ps1` | Runs the whole thing on Windows. |
| `run.sh` | Runs the whole thing on macOS. |
| `.gitignore` | Keeps compiled files and editor settings out of your repository. Nothing to edit. |

## How to run it

**Open this folder in IntelliJ IDEA.** That is the whole answer, and the course site has a page that walks it start to finish with every dialog named: ***IntelliJ + Karel***. Do that before class.

The short version, once IntelliJ is installed:

1. **Open** this folder. Not the zip, not a file inside it, the `karel-starter` folder itself.
2. **Let IntelliJ download Java for you.** File → Project Structure → Project → SDK → **Download JDK...**, then pick version **26**, vendor **Oracle OpenJDK**. You do not have to install Java by hand, and you should not try.
3. **Open the `lib` folder, then right-click `karel.jar` → Add as Library...** This is the step people get stuck on. Until you do it, `import stanford.karel.*` sits there underlined in red and nothing is actually wrong.
4. Open `MyKarel.java` and click the green **▶** in the left margin.

A window opens with a grid and a small robot in the bottom-left corner. Press **Start**.

If a window opened and the robot moved two squares, you are done. That is the entire setup.

The buttons: **Start** runs your program, **Reset** puts the world back how it was, **Load World** switches to a different map, **Edit World** lets you build your own map, and the slider changes how fast Karel moves.

> **Yes, this course uses IntelliJ and your programming class uses VS Code.** That is deliberate. They both run the same two commands underneath, which is exactly what you are going to watch happen on the projector, and being comfortable in two editors instead of one costs you almost nothing and is worth having.

## The two run scripts, and why they are in here

`run.ps1` and `run.sh` run Karel from a terminal instead of from the editor. **You do not need them yet**, and you do not need a terminal for this course until the Git session. They ship now because they are worth reading:

```powershell
javac -cp lib/karel.jar MyKarel.java
java -cp ".;lib/karel.jar" MyKarel
```

Two lines. `javac` turns your text into something the computer can run, and `java` runs it. **That is the entire mechanism, and the green button in IntelliJ is a very nice costume over exactly these two commands.** You will watch this happen in class, and you will type it yourself the week after.

**Open the one for your machine and read it.** It takes fifteen seconds and it is worth more than any button.

## The four commands

```java
move();          // walk forward one square
turnLeft();      // rotate 90 degrees to the left
pickBeeper();    // pick up a beeper from the square you are standing on
putBeeper();     // put a beeper down on the square you are standing on
```

The empty parentheses are not optional. `move` on its own is not a command, it is a typo, and the compiler will complain about it in a paragraph of text you are not expected to understand yet.

**There is no `turnRight()`.** This is deliberate. You will need it, you will not have it, and working out what to do about it is the first real programming you will do in this course.

## Your task for Week 2

Get Karel to the beeper and pick it up. That is the world that loads by default.

Three more lines added to `MyKarel.java` will do it. Five lines total. Everything you need is in the list above.

## When it breaks

It will break. Bring it broken; that is the assignment.

**`command not found` or `javac is not recognized`.** Your computer does not know where Java lives. This is a PATH problem, it is extremely common, and it is exactly what Week 2 class time is for. Nothing is wrong with your laptop.

**`java` works but `javac` does not.** You have a Java runtime but not the developer kit. Also common, also a two-minute fix.

**Everything worked yesterday and does not today.** Close the terminal completely and open a new one. This genuinely fixes about ninety percent of it, which is either reassuring or infuriating depending on your mood.

**Karel walks into a wall.** Nothing is broken. Your instructions were wrong, which is a different and much more interesting problem. The computer did exactly what you said, not what you meant. You are going to hear that sentence a lot.

**The window opens but Karel does not move.** You probably have not pressed **Start**.

## Slower or faster

The Karel window has a speed slider. If the robot is moving too fast to see what went wrong, drag it down. Watching a bug happen slowly is a legitimate debugging technique and not cheating.

## Build your own world

Five of the maps in `worlds/` are the ones the assignments use: `beeper.w`, `pile.w`, `staircase.w`, `long-row.w`, and `short-row.w`. The other nineteen come from Stanford's own Karel courses and nothing here requires them. They are in the folder because a robot in an empty grid gets boring quickly, and some of them are genuinely hard. Open one with **Load World** and see what your program does in a world it was not written for.

You are not limited to any of them.

Press **Edit World**. The background turns cream and the buttons change: the ones for running your program step aside and the ones for building take their place, so there is nothing on screen to click by accident. **Done Editing** brings them back. Then:

- **Click a corner** to drop a beeper there. Click again for a second one; the number on the diamond is how many are stacked up. **Right-click** takes one away, and **Control-click** does the same thing if your trackpad has no right button.
- **Click the line between two squares** to put a wall there. Click it again to take it out. The blue highlight shows you where the wall will land before you commit to it, which saves a lot of squinting.
- **Drag Karel** to move him somewhere else. **Turn Karel** rotates him 90 degrees to the left, exactly like `turnLeft()` does.
- **width** and **height** resize the grid, up to 50 by 50. Anything that ends up outside the new edges is dropped, so shrink with care.
- **Undo** takes back the last change, as many times as you need. **Ctrl+Z** works too, or **Cmd+Z** on a Mac. Nothing you do in here is permanent, so click around.
- **Clear** empties everything and sends Karel home to (1, 1). It asks first, and Undo will bring it all back if you say yes and then change your mind.
- **Save World...** writes it into `worlds/` as a `.w` file. **Done Editing**, then **Load World**, brings it back later.

You do not have to save to try something. Build a world, press **Done Editing** and then **Start**, and your program runs in it immediately. **Reset** puts the world back the way you built it, not the way it came out of the file.

**A world file is just text.** Open one of the `.w` files in `worlds/` in any editor and you will see the whole format in about eight lines. If you would rather type a world than click one, nothing is stopping you.

Worth doing at least once: build a maze with a beeper hidden in the middle, then try to write a program that finds it. That is a much harder problem than it looks, it is the reason `frontIsClear()` exists, and it is a genuinely good use of a Sunday afternoon.

## Want to read ahead

Stanford's Karel reader is free and written for people with no background: <https://compedu.stanford.edu/karel-reader/docs/java/en/chapter1.html>

Chapters 1 and 2 are the assigned reading before Week 2. The rest is there when you want it.
