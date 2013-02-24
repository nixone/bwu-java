# JNIBWAPI Utility Layer (bwu-java)

bwu-java is supposed to add a layer above traditional JNIBWAPI trying to make it more comfortable to work with.

## Overview

Why to write

```java
int hitpoints = bwapi.getUnitType(unit.getTypeID()).getMaxHitPoints();
```
if you could write

```java
int hitpoints = unit.getType().getMaxHitPoints();
```

Or why to write

```java
Set<Unit> myFlyers = new HashSet<Unit>();
for(Unit unit : bwapi.getMyUnits()) {
  if(bwapi.getUnitType(unit.getTypeID()).isFlyer()) {
    myFlyers.add(unit);
  }
}
```

if you can write

```java
Set<Unit> myFlyers = bot.getMyUnits().isFlyer();
```

## Future

In the future, this layer is supposed to support developers by providing nice and comfortable API and utility classes to JNIBWAPI so that they can focus on artificial intelligence rather than coding in an uncomfortable and messy environment.